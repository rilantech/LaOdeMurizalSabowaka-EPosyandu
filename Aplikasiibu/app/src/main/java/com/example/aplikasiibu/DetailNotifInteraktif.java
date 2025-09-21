package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DetailNotifInteraktif extends AppCompatActivity {
    ImageView butonlogout;
    ImageView gambartips1;
    ImageView gambartips2;
    TextView isi_notif;
    TextView judul_notif;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView waktu_post;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_notif_interaktif);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.waktu_post = (TextView) findViewById(R.id.waktu_post);
        this.judul_notif = (TextView) findViewById(R.id.judul_notif);
        this.isi_notif = (TextView) findViewById(R.id.isi_notif);
        this.gambartips1 = (ImageView) findViewById(R.id.gambartips1);
        this.gambartips2 = (ImageView) findViewById(R.id.gambartips2);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.waktu_post.setText("Tanggal Post: " + NotificationService2.waktu_post);
        this.judul_notif.setText(NotificationService2.judul_notif);
        if (NotificationService2.judul_notif == "Tips Untuk Ibu Hamil") {
            this.gambartips1.setImageResource(R.drawable.notifkesehatanibuhamil1);
            this.gambartips1.setScaleType(ImageView.ScaleType.FIT_XY);
            this.gambartips2.setImageResource(R.drawable.notifkesehatanibuhamil2);
        }
        if (NotificationService2.judul_notif == "Tips Untuk Ibu Nifas") {
            this.gambartips1.setImageResource(R.drawable.notifkesehatanibunifas);
            this.gambartips1.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if (NotificationService2.judul_notif == "Tips Untuk Ibu Bersalin") {
            this.gambartips1.setImageResource(R.drawable.notifibubersalin);
            this.gambartips1.setScaleType(ImageView.ScaleType.FIT_XY);
            this.isi_notif.setVisibility(View.GONE);
            this.isi_notif.setText("Halo Ibu " + HalamanLogin.namapetugas + ", berikut adalah tanda-tanda jika anda telah memasuki masa persalinan:");
        }
        if (NotificationService2.judul_notif == "Tips Anak Umur 0-3 Bulan") {
            this.gambartips1.setImageResource(R.drawable.notif_nol_tiga_bulan);
            this.waktu_post.setText("Tanggal Post: " + NotificationService2.waktu_post);
            this.judul_notif.setText(NotificationService2.judul_notif);
            this.isi_notif.setVisibility(View.GONE);
            this.isi_notif.setText("Halo Ibu " + HalamanLogin.namapetugas + ", anak anda yang bernama " + NotificationService2.nama_anak + " yang berusia 0 Bulan di anjurkan untuk melakukan beberapa tindakan berikut:");
        }
        if (NotificationService2.judul_notif == "Tips Anak Umur 3-6 Bulan") {
            this.gambartips1.setImageResource(R.drawable.notif_tiga_enam_bulan);
            this.waktu_post.setText("Tanggal Post: " + NotificationService2.waktu_post);
            this.judul_notif.setText(NotificationService2.judul_notif);
            this.isi_notif.setVisibility(View.GONE);
            this.isi_notif.setText("Halo Ibu " + HalamanLogin.namapetugas + ", anak anda yang bernama " + NotificationService2.nama_anak + " telah berusia 3 Bulan, dianjurkan untuk melakukan beberapa tindakan berikut:");
        }
        if (NotificationService2.judul_notif == "Tips Anak Umur 6-12 Bulan") {
            this.gambartips1.setImageResource(R.drawable.notif_enam_duabelas_bulan);
            this.waktu_post.setText("Tanggal Post: " + NotificationService2.waktu_post);
            this.judul_notif.setText(NotificationService2.judul_notif);
            this.isi_notif.setVisibility(View.GONE);
            this.isi_notif.setText("Hallo Bu " + HalamanLogin.namapetugas + ", anak anda yang bernama " + NotificationService2.nama_anak + " telah berusia 6 Bulan, dianjurkan untuk melakukan beberapa tindakan berikut:");
        }
        if (NotificationService2.judul_notif == "Tips Anak Umur 1-2 Tahun") {
            this.gambartips1.setImageResource(R.drawable.notif_satu_dua_tahun);
            this.waktu_post.setText("Tanggal Post: " + NotificationService2.waktu_post);
            this.judul_notif.setText(NotificationService2.judul_notif);
            this.isi_notif.setVisibility(View.GONE);
            this.isi_notif.setText("Halo Ibu " + HalamanLogin.namapetugas + ", anak anda yang bernama " + NotificationService2.nama_anak + " telah berusia 1 Tahun, dianjurkan untuk melakukan beberapa tindakan berikut:");
        }
        if (NotificationService2.judul_notif == "Tips Anak Umur 2-3 Tahun") {
            this.gambartips1.setImageResource(R.drawable.notif_dua_tiga_tahun);
            this.waktu_post.setText("Tanggal Post: " + NotificationService2.waktu_post);
            this.judul_notif.setText(NotificationService2.judul_notif);
            this.isi_notif.setVisibility(View.GONE);
            this.isi_notif.setText("Halo Ibu " + HalamanLogin.namapetugas + ", anak anda yang bernama " + NotificationService2.nama_anak + " telah berusia 2 Tahun, dianjurkan untuk melakukan beberapa tindakan berikut:");
        }
        if (NotificationService2.judul_notif == "Tips Anak Umur 3-5 Tahun") {
            this.gambartips1.setImageResource(R.drawable.notif_tiga_lima_tahun);
            this.waktu_post.setText("Tanggal Post: " + NotificationService2.waktu_post);
            this.judul_notif.setText(NotificationService2.judul_notif);
            this.isi_notif.setVisibility(View.GONE);
            this.isi_notif.setText("Halo Ibu " + HalamanLogin.namapetugas + ", anak anda yang bernama " + NotificationService2.nama_anak + " telah berusia 3 Tahun, dianjurkan untuk melakukan beberapa tindakan berikut:");
        }
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailNotifInteraktif.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(DetailNotifInteraktif.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        DetailNotifInteraktif.this.startActivity(intent);
                        DetailNotifInteraktif.this.finish();
                    }
                });
                builder.setNegativeButton((CharSequence) "Tidak", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        });
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DetailNotifInteraktif.this.startActivity(new Intent(DetailNotifInteraktif.this.getApplicationContext(), Halaman_utama_app.class));
                DetailNotifInteraktif.this.finish();
            }
        });
    }
}
