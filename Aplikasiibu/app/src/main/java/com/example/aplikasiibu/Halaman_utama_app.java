package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Halaman_utama_app extends AppCompatActivity {
    public static String buku = "";
    public static SharedPreferences getData;
    public static String nama = "";
    Halaman adapter;
    ImageView buton_logout;
    String channelid = "default";
    String channelnotif = "channelku";
    /* access modifiers changed from: private */
    public Handler handler = new Handler();
    PreferenceHelper preferenceHelper;
    private Runnable runnable = new Runnable() {
        public void run() {
            if (HalamanLogin.status != null) {
                Halaman_utama_app.this.handler.postDelayed(this, 1000);
            }
        }
    };
    TabLayout tabLayout;
    TextView tvNama;
    TextView tvNamapetugas;
    ViewPager viewPager;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.halaman_utama_app);
        this.preferenceHelper = new PreferenceHelper(this);
        this.tvNama = (TextView) findViewById(R.id.tvNama);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.tabLayout = (TabLayout) findViewById(R.id.tab);
        this.viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.buton_logout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.buton_logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Halaman_utama_app.this);
                builder.setMessage("Yakin Ingin Logout ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_utama_app.this.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Halaman_utama_app.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Halaman_utama_app.this.startActivity(intent);
                        Halaman_utama_app.this.finish();
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        });
        String str = new Configurasi().baseUrl() + "public/img/" + HalamanLogin.foto;
        Halaman halaman = new Halaman(getApplicationContext(), getSupportFragmentManager(), this.tabLayout.getTabCount());
        this.adapter = halaman;
        this.viewPager.setAdapter(halaman);
        this.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(this.tabLayout));
        this.tabLayout.setOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) {
                Halaman_utama_app.this.viewPager.setCurrentItem(tab.getPosition());
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    /* access modifiers changed from: private */
//    public void tampilkanNotifikasi() {
//        Volley.newRequestQueue(getApplicationContext()).add(new StringRequest(1, new Configurasi().baseUrl() + "api/notifikasi_pengembalian_buku.php", new Response.Listener<String>() {
//            public void onResponse(String response) {
//                try {
//                    JSONObject jsonObject = new JSONObject(response);
//                    String status = jsonObject.getString("notifikasi");
//                    Halaman_utama_app.nama = jsonObject.getString("nama");
//                    Halaman_utama_app.buku = jsonObject.getString("buku");
//                    if (status.equals("aktif")) {
//                        Halaman_utama_app.this.notif();
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, new Response.ErrorListener() {
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(Halaman_utama_app.this.getApplicationContext(), "Maaf, Anda Tidak Bisa Absen Lagi", Toast.LENGTH_SHORT).show();
//            }
//        }) {
//            /* access modifiers changed from: protected */
//            public Map<String, String> getParams() throws AuthFailureError {
//                HashMap<String, String> form = new HashMap<>();
//                form.put("nama", HalamanLogin.nama);
//                return form;
//            }
//        });
//    }

    /* access modifiers changed from: private */
//    public void notif() {
//        Uri defaultUri = RingtoneManager.getDefaultUri(2);
//        NotificationManagerCompat.from(this).notify(1, new NotificationCompat.Builder(getApplicationContext(), this.channelid).setSmallIcon((int) R.drawable.logokemendikbud).setContentTitle("Notifikasi").setContentText("Hallo").setPriority(0).addAction(R.drawable.logo_kembali, "Action", PendingIntent.getActivity(this, 0, new Intent(this, DetailNotif.class), 0)).build());
//    }

    public void onBackPressed() {
        startService(new Intent(this, NotificationService2.class));
        super.onBackPressed();
    }
}
