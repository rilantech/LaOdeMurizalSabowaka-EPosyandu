package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DetailNotifJadwalPosyandu extends AppCompatActivity {
    ImageView butonlogout;
    TextView isi_notif;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView waktu_post;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_notif_jadwal_posyandu);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.waktu_post = (TextView) findViewById(R.id.waktu_post);
        this.isi_notif = (TextView) findViewById(R.id.isi_notif);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.waktu_post.setText(NotificationService2.waktu_post);
        this.isi_notif.setText(Html.fromHtml("Halo Ibu " + HalamanLogin.namapetugas + ", kegiatan Posyandu terbaru di Desa Marawali dengan agenda " + "<b>" + NotificationService2.agenda + "</b>"+ " akan dilaksanakan pada tanggal " + "<b>"+ NotificationService2.tanggal + "</b>" + " Jam " + "<b>" + NotificationService2.jam + " WITA</b>.<br><br>Jangan lupa hadir ya!!!"));
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailNotifJadwalPosyandu.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(DetailNotifJadwalPosyandu.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        DetailNotifJadwalPosyandu.this.startActivity(intent);
                        DetailNotifJadwalPosyandu.this.finish();
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
                startActivity(new Intent(getApplicationContext(), Jadwalposyandu.class));
                finish();
            }
        });
    }
}
