package com.example.aplikasiibu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class NotificationServiceChatting extends Service {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String agenda = "";
    public static String batas_pinjam = "";
    public static Integer id_penerima_1 = 0;
    public static String isi_notif = "";
    public static String jam = "";
    public static String judul_buku = "";
    public static String judul_notif = "";
    public static String kode_buku = "";
    public static String letak_pada_rak = "";
    public static String mulai_pinjam = "";
    public static String nama_anak = "";
    public static String pengarang = "";
    public static String posisi_pengirim = "";
    public static String sampul = "";
    public static String tanggal = "";
    public static String waktu_post = "";
    String channelid = "default";
    String channelid2 = "default1";
    String channelid3 = "default3";
    String channelnotif = "channelku";
    String channelnotif2 = "channelku1";
    String channelnotif3 = "channelku3";
    /* access modifiers changed from: private */
    public Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        public void run() {
            if (HalamanLogin.status != null) {
                NotificationServiceChatting.this.handler.postDelayed(this, 1000);
                NotificationServiceChatting.this.tampilkanNotifikasiChatting();
            }
        }
    };

    public void onCreate() {
        try {
            this.handler.postDelayed(this.runnable, 2000);
            super.onCreate();
        } catch (NumberFormatException e) {
            Log.e("Error", e.getMessage());
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* access modifiers changed from: private */
    public void tampilkanNotifikasiChatting() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/notifchatting", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String status = jsonObject.getString("status_notifikasi");
                    String nomor_hp_pengirim = jsonObject.getString("nomor_hp_pengirim");
                    if (status.equals("aktif") && nomor_hp_pengirim == "081119009287") {
                        Toast.makeText(NotificationServiceChatting.this, "Notif Anak", Toast.LENGTH_SHORT).show();
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

    private void notif_chattingadmin() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nPesan Baru...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 0-3 Bulan";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailHalamanChatting.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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

    private void notif_tiga_enam() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 3-6 Bulan...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 3-6 Bulan";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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

    private void notif_enam_duabelas() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 6-12 Bulan...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 6-12 Bulan";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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

    private void notif_satu_duatahun() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 1-2 Tahun...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 1-2 Tahun";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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

    private void notif_dua_tigatahun() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 2-3 Tahun...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 2-3 Tahun";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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

    private void notif_tiga_limatahun() {
        isi_notif = "Hallo " + HalamanLogin.namapetugas + ",\nTips Anak 3-5 Tahun...";
        waktu_post = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        judul_notif = "Tips Anak Umur 3-5 Tahun";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifInteraktif.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif2, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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
}
