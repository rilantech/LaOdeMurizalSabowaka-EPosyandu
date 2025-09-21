package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
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
    String agenda;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_notif_jadwal_posyandu);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.waktu_post = (TextView) findViewById(R.id.waktu_post);
        this.isi_notif = (TextView) findViewById(R.id.isi_notif);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.waktu_post.setText(NotificationService.waktu_post);
        agenda = NotificationService.agenda;
        Spannable spannableString = new SpannableString(agenda);
        spannableString.setSpan(new ForegroundColorSpan(Color.RED), 0, agenda.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //this.isi_notif.setText("Halo Ibu " + Halaman_Login.namapetugas + ", Kegiatan Posyandu terbaru di Desa Marawali dengan agenda " + NotificationService.agenda + " akan dilaksanakan pada tanggal " + NotificationService.tanggal + " Jam " + NotificationService.jam + " WITA.\n\n Jangan Lupa Hadir Ya!!!");
        this.isi_notif.setText(Html.fromHtml("Halo Ibu " + Halaman_Login.namapetugas + ", kegiatan Posyandu terbaru di Desa Marawali dengan agenda " + "<b>" +NotificationService.agenda + "</b>" + " akan dilaksanakan pada tanggal " + "<b>" + NotificationService.tanggal + "</b>" + " Jam " + "<b>" + NotificationService.jam + " WITA</b>.<br><br> Jangan lupa hadir ya!!!"));
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailNotifJadwalPosyandu.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(DetailNotifJadwalPosyandu.this, Halaman_Login.class);
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
                DetailNotifJadwalPosyandu.this.startActivity(new Intent(DetailNotifJadwalPosyandu.this.getApplicationContext(), Jadwalposyandu.class));
                DetailNotifJadwalPosyandu.this.finish();
            }
        });
    }
}
