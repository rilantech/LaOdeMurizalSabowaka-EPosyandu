package com.example.aplikasiibu;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Catatan_kesehatan_ibu_nifas extends AppCompatActivity {
    TextView dan_lainlain1;
    TextView dan_lainlain2;
    TextView dan_lainlain3;
    TextView judulcatatanibunifas;
    TextView kondisi_ibu1;
    TextView kondisi_ibu2;
    TextView kondisi_ibu3;
    TextView kondisi_perineum1;
    TextView kondisi_perineum2;
    TextView kondisi_perineum3;
    TextView nama_anak;
    TextView nama_ibu;
    TextView nik_ibu;
    TextView tanggal_kunjungan1;
    TextView tanggal_kunjungan2;
    TextView tanggal_kunjungan3;
    TextView tekanan_darah1;
    TextView tekanan_darah2;
    TextView tekanan_darah3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_catatan_kesehatan_ibu_nifas);
        this.judulcatatanibunifas = (TextView) findViewById(R.id.judulcatatannifas);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibu);
        this.tanggal_kunjungan1 = (TextView) findViewById(R.id.tanggal_kunjungan1);
        this.tanggal_kunjungan2 = (TextView) findViewById(R.id.tanggal_kunjungan2);
        this.tanggal_kunjungan3 = (TextView) findViewById(R.id.tanggal_kunjungan3);
        this.kondisi_ibu1 = (TextView) findViewById(R.id.kondisi_ibu1);
        this.kondisi_ibu2 = (TextView) findViewById(R.id.kondisi_ibu2);
        this.kondisi_ibu3 = (TextView) findViewById(R.id.kondisi_ibu3);
        this.tekanan_darah1 = (TextView) findViewById(R.id.tekanan_darah1);
        this.tekanan_darah2 = (TextView) findViewById(R.id.tekanan_darah2);
        this.tekanan_darah3 = (TextView) findViewById(R.id.tekanan_darah3);
        this.kondisi_perineum1 = (TextView) findViewById(R.id.Kondisi_perineum1);
        this.kondisi_perineum2 = (TextView) findViewById(R.id.Kondisi_perineum2);
        this.kondisi_perineum3 = (TextView) findViewById(R.id.Kondisi_perineum3);
        this.dan_lainlain1 = (TextView) findViewById(R.id.dan_lainlain1);
        this.dan_lainlain2 = (TextView) findViewById(R.id.dan_lainlain2);
        this.dan_lainlain3 = (TextView) findViewById(R.id.dan_lainlain3);
        this.judulcatatanibunifas.setText("Catatan Nifas-" + getIntent().getStringExtra("nifas_ke"));
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.tanggal_kunjungan1.setText(getIntent().getStringExtra("tanggal_kunjungan_1"));
        this.tanggal_kunjungan2.setText(getIntent().getStringExtra("tanggal_kunjungan_2"));
        this.tanggal_kunjungan3.setText(getIntent().getStringExtra("tanggal_kunjungan_3"));
        this.kondisi_ibu1.setText(getIntent().getStringExtra("kondisi_ibu_secara_umum_1"));
        this.kondisi_ibu2.setText(getIntent().getStringExtra("kondisi_ibu_secara_umum_2"));
        this.kondisi_ibu3.setText(getIntent().getStringExtra("kondisi_ibu_secara_umum_3"));
        this.tekanan_darah1.setText(getIntent().getStringExtra("tekanan_darah_1"));
        this.tekanan_darah2.setText(getIntent().getStringExtra("tekanan_darah_2"));
        this.tekanan_darah3.setText(getIntent().getStringExtra("tekanan_darah_3"));
        this.kondisi_perineum1.setText(getIntent().getStringExtra("kondisi_perineum_1"));
        this.kondisi_perineum2.setText(getIntent().getStringExtra("kondisi_perineum_2"));
        this.kondisi_perineum3.setText(getIntent().getStringExtra("kondisi_perineum_3"));
        this.dan_lainlain1.setText(getIntent().getStringExtra("dan_lain_lain_1"));
        this.dan_lainlain2.setText(getIntent().getStringExtra("dan_lain_lain_2"));
        this.dan_lainlain3.setText(getIntent().getStringExtra("dan_lain_lain_3"));
    }
}
