package com.example.aplikasiibu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class NotificationService extends Service {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String agenda = "";
    public static String batas_pinjam = "";
    public static SharedPreferences getData;
    public static String isi_notif = "";
    public static String jam = "";
    public static String judul_buku = "";
    public static String judul_notif = "";
    public static String kode_buku = "";
    public static String letak_pada_rak = "";
    public static String mulai_pinjam = "";
    public static String nama_anak = "";
    public static String pengarang = "";
    public static String sampul = "";
    public static String tanggal = "";
    public static String waktu_post = "";
    private final IBinder binder = new MyBinder();
    String channelid = "default";
    String channelid2 = "default1";
    String channelid3 = "default3";
    String channelnotif = "channelku";
    String channelnotif2 = "channelku1";
    String channelnotif3 = "channelku3";
    /* access modifiers changed from: private */
    public Handler handler = new Handler();
    private Handler handler2 = new Handler();
    private Handler handler3 = new Handler();
    private Runnable runnable = new Runnable() {
        public void run() {
            try {
                NotificationService.this.handler.postDelayed(this, 1000);
                NotificationService.this.tampilkanNotifikasi();
                NotificationService.this.tampilkanNotifikasiInteraktif();
                NotificationService.this.tampilkanNotifikasiInteraktifIbuHamil();
                NotificationService.this.tampilkanNotifikasiInteraktifIbuNifas();
            } catch (NumberFormatException e) {
                Log.e("Error", e.getMessage());
                NotificationService.this.tampilkanNotifikasi();
                NotificationService.this.tampilkanNotifikasiInteraktif();
                NotificationService.this.tampilkanNotifikasiInteraktifIbuHamil();
                NotificationService.this.tampilkanNotifikasiInteraktifIbuNifas();
            }
        }
    };
    SharedPreferences.Editor setData;

    public void onCreate() {
        try {
            this.setData = getSharedPreferences("data", 0).edit();
            getData = getSharedPreferences("data", 0);
            this.handler.postDelayed(this.runnable, 2000);
            super.onCreate();
        } catch (NumberFormatException e) {
            Log.e("Error", e.getMessage());
        }
    }

    public class MyBinder extends Binder {
        public MyBinder() {
        }

        /* access modifiers changed from: package-private */
        public NotificationService getService() {
            return NotificationService.this;
        }
    }

    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    /* access modifiers changed from: private */
    public void tampilkanNotifikasi() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/notifjadwalposyandu", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String status = jsonObject.getString("status_notifikasi");
                    NotificationService.waktu_post = jsonObject.getString("waktu_post");
                    NotificationService.agenda = jsonObject.getString("agenda");
                    NotificationService.jam = jsonObject.getString("jam");
                    NotificationService.tanggal = jsonObject.getString("tanggal");
                    if (status.equals("aktif")) {
                        NotificationService.this.notifhmin();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }));
    }

    /* access modifiers changed from: private */
    public void tampilkanNotifikasiInteraktifIbuNifas() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/notifinteraktifkesehatanibunifas", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    try {
                        if (new JSONObject(response).getString("status_notifikasi").equals("aktif")) {
                            NotificationService.this.notifinteraktifibunifas();
                        }
                    } catch (NumberFormatException e) {
                        Log.e("Error", e.getMessage());
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }));
    }

    private void tampilkanNotifikasiInteraktifAnak() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/notifinteraktifanak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    if (new JSONObject(response).getString("status_notifikasi").equals("aktif")) {
                        NotificationService.this.notifinteraktifibunifas();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }));
    }

    /* access modifiers changed from: private */
    public void tampilkanNotifikasiInteraktifIbuHamil() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/notifinteraktif", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    if (new JSONObject(response).getString("status_notifikasi").equals("aktif")) {
                        NotificationService.this.notifinteraktifkesehatanibuhamil();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }));
    }

    /* access modifiers changed from: private */
    public void notifinteraktifkesehatanibuhamil() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Ibu Hamil...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Untuk Ibu Hamil";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void tampilkanNotifikasiInteraktif() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/notifinteraktifanak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String status = jsonObject.getString("status_notifikasi");
                    NotificationService.nama_anak = jsonObject.getString("nama_anak");
                    if (status.equals("notif_nol_tiga")) {
                        NotificationService.this.notif_nol_tiga();
                    }
                    if (status.equals("notif_tiga_enam")) {
                        NotificationService.this.notif_tiga_enam();
                    }
                    if (status.equals("notif_enam_sembilan")) {
                        NotificationService.this.notif_enam_duabelas();
                    }
                    if (status.equals("notif_satu_duatahun")) {
                        NotificationService.this.notif_satu_duatahun();
                    }
                    if (status.equals("notif_dua_tigatahun")) {
                        NotificationService.this.notif_dua_tigatahun();
                    }
                    if (status.equals("notif_tiga_limatahun")) {
                        NotificationService.this.notif_tiga_limatahun();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }));
    }

    /* access modifiers changed from: private */
    public void notif_nol_tiga() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 0-3 Bulan...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 0-3 Bulan";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void notif_tiga_enam() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 3-6 Bulan...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 3-6 Bulan";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void notif_enam_duabelas() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 6-12 Bulan...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 6-12 Bulan";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    private void notif_sembilan_duabelas() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 9-12 Bulan...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Untuk Ibu Hamil";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void notif_satu_duatahun() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 1-2 Tahun...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 1-2 Tahun";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void notif_dua_tigatahun() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 2-3 Tahun...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 2-3 Tahun";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void notif_tiga_limatahun() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 3-5 Tahun...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 3-5 Tahun";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void notifhmin() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nJadwal Terbaru Posyandu Marawali";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifJadwalPosyandu.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void notifinteraktifibunifas() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Ibu Nifas...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Untuk Ibu Nifas";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif3, "contoh channel3", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif3);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }
}
