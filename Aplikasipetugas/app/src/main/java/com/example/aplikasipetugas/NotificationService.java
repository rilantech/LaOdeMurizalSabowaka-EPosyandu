package com.example.aplikasipetugas;

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
import androidx.core.app.NotificationCompat;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class NotificationService extends Service {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String agenda = "";
    public static String batas_pinjam = "";
    public static String isi_notif = "";
    public static String jam = "";
    public static String judul_buku = "";
    public static String kode_buku = "";
    public static String letak_pada_rak = "";
    public static String mulai_pinjam = "";
    public static String pengarang = "";
    public static String sampul = "";
    public static String tanggal = "";
    public static String waktu_post = "";
    String channelid = "default";
    String channelid2 = "default1";
    String channelnotif = "channelku";
    String channelnotif2 = "channelku1";
    /* access modifiers changed from: private */
    public Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        public void run() {
            if (Halaman_Login.status != null) {
                NotificationService.this.handler.postDelayed(this, 1000);
                NotificationService.this.tampilkanNotifikasi();
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
    public void tampilkanNotifikasi() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/apisemuanotif", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String status = jsonObject.getString("notif");
                    if (status.equals("notif_jadwal_posyandu")) {
                        NotificationService.waktu_post = jsonObject.getString("waktu_post");
                        NotificationService.agenda = jsonObject.getString("agenda");
                        NotificationService.jam = jsonObject.getString("jam");
                        NotificationService.tanggal = jsonObject.getString("tanggal");
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
    public void notifhmin() {
        isi_notif = "Halo Ibu " + Halaman_Login.namapetugas + ",\nJadwal Terbaru Posyandu Marawali";
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder((Context) this, this.channelid).setSmallIcon((int) R.drawable.logopuskesmas).setContentText(isi_notif).setContentTitle("Notifikasi").addAction(R.drawable.logo_kembali, "Detail", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotifJadwalPosyandu.class), 0)).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif, "contoh channel",  NotificationManager.IMPORTANCE_HIGH);
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
}
