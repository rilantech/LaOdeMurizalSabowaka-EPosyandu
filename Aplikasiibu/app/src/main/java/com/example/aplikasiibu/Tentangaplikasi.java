package com.example.aplikasiibu;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Tentangaplikasi extends AppCompatActivity {
    ImageView butonlogout;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tentangaplikasi);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(HalamanLogin.namapetugas);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tentangaplikasi.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tentangaplikasi.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Tentangaplikasi.this.startActivity(intent);
                        Tentangaplikasi.this.finish();
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
                Tentangaplikasi.this.finish();
            }
        });
    }
}
