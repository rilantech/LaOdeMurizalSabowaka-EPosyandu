package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tambah_catatan_kesehatan_ibu_nifas extends AppCompatActivity {
    public static String nama_anak;
    ArrayAdapter<String> anak_adapter;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxbuang_air_besar_1;
    EditText etxbuang_air_besar_2;
    EditText etxbuang_air_besar_3;
    EditText etxbuang_air_kecil_1;
    EditText etxbuang_air_kecil_2;
    EditText etxbuang_air_kecil_3;
    EditText etxcatatan_dokter_1;
    EditText etxcatatan_dokter_2;
    EditText etxcatatan_dokter_3;
    EditText etxkondisi_ibu_secara_umum_1;
    EditText etxkondisi_ibu_secara_umum_2;
    EditText etxkondisi_ibu_secara_umum_3;
    EditText etxkondisi_perineum_1;
    EditText etxkondisi_perineum_2;
    EditText etxkondisi_perineum_3;
    EditText etxkontraksi_uteri_1;
    EditText etxkontraksi_uteri_2;
    EditText etxkontraksi_uteri_3;
    EditText etxlokhia_1;
    EditText etxlokhia_2;
    EditText etxlokhia_3;
    EditText etxnamaanak;
    EditText etxnifas_ke;
    EditText etxpelayanan_kontrasepsi_1;
    EditText etxpelayanan_kontrasepsi_2;
    EditText etxpelayanan_kontrasepsi_3;
    EditText etxpemberian_kapsul_vitamin_a_1;
    EditText etxpemberian_kapsul_vitamin_a_2;
    EditText etxpemberian_kapsul_vitamin_a_3;
    EditText etxpemeriksaan_jalan_lahir_1;
    EditText etxpemeriksaan_jalan_lahir_2;
    EditText etxpemeriksaan_jalan_lahir_3;
    EditText etxpemeriksaan_payudara_1;
    EditText etxpemeriksaan_payudara_2;
    EditText etxpemeriksaan_payudara_3;
    EditText etxpenanganan_resiko_tinggi_1;
    EditText etxpenanganan_resiko_tinggi_2;
    EditText etxpenanganan_resiko_tinggi_3;
    EditText etxpendarahan_pervaginam_1;
    EditText etxpendarahan_pervaginam_2;
    EditText etxpendarahan_pervaginam_3;
    EditText etxproduksi_asi_1;
    EditText etxproduksi_asi_2;
    EditText etxproduksi_asi_3;
    EditText etxtanda_infeksi_1;
    EditText etxtanda_infeksi_2;
    EditText etxtanda_infeksi_3;
    EditText etxtanggal_kunjungan_1;
    EditText etxtanggal_kunjungan_2;
    EditText etxtanggal_kunjungan_3;
    EditText etxtekanan_darah_1;
    EditText etxtekanan_darah_2;
    EditText etxtekanan_darah_3;
    EditText etxtinggi_fundus_uteri_1;
    EditText etxtinggi_fundus_uteri_2;
    EditText etxtinggi_fundus_uteri_3;
    ArrayList<String> list_anak = new ArrayList<>();
    TextView nama_ibu;
    TextView nik_ibu;
    Spinner spinnerpilih_keadaan_bayi;
    Spinner spinnerpilih_keadaan_ibu;
    Spinner spinnerpilih_komplikasi_nifas;
    Spinner spinnerpilih_nama_anak;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tambah_catatan_kesehatan_ibu_nifas);
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.spinnerpilih_nama_anak = (Spinner) findViewById(R.id.spinnerpilih_nama_anak);
        this.etxnamaanak = (EditText) findViewById(R.id.etxnamaanak);
        this.etxnifas_ke = (EditText) findViewById(R.id.etxnifas_ke);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibu);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.etxtanggal_kunjungan_1 = (EditText) findViewById(R.id.etxtanggal_kunjungan_1);
        this.etxkondisi_ibu_secara_umum_1 = (EditText) findViewById(R.id.etxkondisi_ibu_secara_umum_1);
        this.etxtekanan_darah_1 = (EditText) findViewById(R.id.etxtekanan_darah_1);
        this.etxpendarahan_pervaginam_1 = (EditText) findViewById(R.id.etxpendarahan_pervaginam_1);
        this.etxkondisi_perineum_1 = (EditText) findViewById(R.id.etxkondisi_perineum_1);
        this.etxtanda_infeksi_1 = (EditText) findViewById(R.id.etxtanda_infeksi_1);
        this.etxkontraksi_uteri_1 = (EditText) findViewById(R.id.etxkontraksi_uteri_1);
        this.etxtinggi_fundus_uteri_1 = (EditText) findViewById(R.id.etxtinggi_fundus_uteri_1);
        this.etxlokhia_1 = (EditText) findViewById(R.id.etxlokhia_1);
        this.etxpemeriksaan_jalan_lahir_1 = (EditText) findViewById(R.id.etxpemeriksaan_jalan_lahir_1);
        this.etxpemeriksaan_payudara_1 = (EditText) findViewById(R.id.etxpemeriksaan_payudara_1);
        this.etxproduksi_asi_1 = (EditText) findViewById(R.id.etxproduksi_asi_1);
        this.etxpemberian_kapsul_vitamin_a_1 = (EditText) findViewById(R.id.etxpemberian_kapsul_vitamin_a_1);
        this.etxpelayanan_kontrasepsi_1 = (EditText) findViewById(R.id.etxpelayanan_kontrasepsi_1);
        this.etxpenanganan_resiko_tinggi_1 = (EditText) findViewById(R.id.etxpenanganan_resiko_tingi_1);
        this.etxbuang_air_besar_1 = (EditText) findViewById(R.id.etxbuang_air_besar_1);
        this.etxbuang_air_kecil_1 = (EditText) findViewById(R.id.etxbuang_air_kecil_1);
        this.etxcatatan_dokter_1 = (EditText) findViewById(R.id.etxcatatan_dokter_1);
        this.etxtanggal_kunjungan_2 = (EditText) findViewById(R.id.etxtanggal_kunjungan_2);
        this.etxkondisi_ibu_secara_umum_2 = (EditText) findViewById(R.id.etxkondisi_ibu_secara_umum_2);
        this.etxtekanan_darah_2 = (EditText) findViewById(R.id.etxtekanan_darah_2);
        this.etxpendarahan_pervaginam_2 = (EditText) findViewById(R.id.etxpendarahan_pervaginam_2);
        this.etxkondisi_perineum_2 = (EditText) findViewById(R.id.etxkondisi_perineum_2);
        this.etxtanda_infeksi_2 = (EditText) findViewById(R.id.etxtanda_infeksi_2);
        this.etxkontraksi_uteri_2 = (EditText) findViewById(R.id.etxkontraksi_uteri_2);
        this.etxtinggi_fundus_uteri_2 = (EditText) findViewById(R.id.etxtinggi_fundus_uteri_2);
        this.etxlokhia_2 = (EditText) findViewById(R.id.etxlokhia_2);
        this.etxpemeriksaan_jalan_lahir_2 = (EditText) findViewById(R.id.etxpemeriksaan_jalan_lahir_2);
        this.etxpemeriksaan_payudara_2 = (EditText) findViewById(R.id.etxpemeriksaan_payudara_2);
        this.etxproduksi_asi_2 = (EditText) findViewById(R.id.etxproduksi_asi_2);
        this.etxpemberian_kapsul_vitamin_a_2 = (EditText) findViewById(R.id.etxpemberian_kapsul_vitamin_a_2);
        this.etxpelayanan_kontrasepsi_2 = (EditText) findViewById(R.id.etxpelayanan_kontrasepsi_2);
        this.etxpenanganan_resiko_tinggi_2 = (EditText) findViewById(R.id.etxpenanganan_resiko_tingi_2);
        this.etxbuang_air_besar_2 = (EditText) findViewById(R.id.etxbuang_air_besar_2);
        this.etxbuang_air_kecil_2 = (EditText) findViewById(R.id.etxbuang_air_kecil_2);
        this.etxcatatan_dokter_2 = (EditText) findViewById(R.id.etxcatatan_dokter_2);
        this.etxtanggal_kunjungan_3 = (EditText) findViewById(R.id.etxtanggal_kunjungan_3);
        this.etxkondisi_ibu_secara_umum_3 = (EditText) findViewById(R.id.etxkondisi_ibu_secara_umum_3);
        this.etxtekanan_darah_3 = (EditText) findViewById(R.id.etxtekanan_darah_3);
        this.etxpendarahan_pervaginam_3 = (EditText) findViewById(R.id.etxpendarahan_pervaginam_3);
        this.etxkondisi_perineum_3 = (EditText) findViewById(R.id.etxkondisi_perineum_3);
        this.etxtanda_infeksi_3 = (EditText) findViewById(R.id.etxtanda_infeksi_3);
        this.etxkontraksi_uteri_3 = (EditText) findViewById(R.id.etxkontraksi_uteri_3);
        this.etxtinggi_fundus_uteri_3 = (EditText) findViewById(R.id.etxtinggi_fundus_uteri_3);
        this.etxlokhia_3 = (EditText) findViewById(R.id.etxlokhia_3);
        this.etxpemeriksaan_jalan_lahir_3 = (EditText) findViewById(R.id.etxpemeriksaan_jalan_lahir_3);
        this.etxpemeriksaan_payudara_3 = (EditText) findViewById(R.id.etxpemeriksaan_payudara_3);
        this.etxproduksi_asi_3 = (EditText) findViewById(R.id.etxproduksi_asi_3);
        this.etxpemberian_kapsul_vitamin_a_3 = (EditText) findViewById(R.id.etxpemberian_kapsul_vitamin_a_3);
        this.etxpelayanan_kontrasepsi_3 = (EditText) findViewById(R.id.etxpelayanan_kontrasepsi_3);
        this.etxpenanganan_resiko_tinggi_3 = (EditText) findViewById(R.id.etxpenanganan_resiko_tingi_1);
        this.etxbuang_air_besar_3 = (EditText) findViewById(R.id.etxbuang_air_besar_3);
        this.etxbuang_air_kecil_3 = (EditText) findViewById(R.id.etxbuang_air_kecil_3);
        this.etxcatatan_dokter_3 = (EditText) findViewById(R.id.etxcatatan_dokter_3);
        this.spinnerpilih_keadaan_ibu = (Spinner) findViewById(R.id.spinnerpilih_keadaan_ibu);
        this.spinnerpilih_komplikasi_nifas = (Spinner) findViewById(R.id.spinnerpilih_komplikasi_nifas);
        this.spinnerpilih_keadaan_bayi = (Spinner) findViewById(R.id.spinnerpilih_keadaan_bayi);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));

        etxtanggal_kunjungan_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });

        etxtanggal_kunjungan_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        etxtanggal_kunjungan_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog3();
            }
        });
        list_anak();
        this.spinnerpilih_nama_anak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_catatan_kesehatan_ibu_nifas.nama_anak = Tambah_catatan_kesehatan_ibu_nifas.this.spinnerpilih_nama_anak.getSelectedItem().toString();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_catatan_kesehatan_ibu_nifas.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_catatan_kesehatan_ibu_nifas.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_catatan_kesehatan_ibu_nifas.this.startActivity(intent);
                        Tambah_catatan_kesehatan_ibu_nifas.this.finish();
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
                Tambah_catatan_kesehatan_ibu_nifas.this.finish();
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (etxnifas_ke.getText().toString().length() == 0) {
                    etxnifas_ke.setError("Tidak Boleh Kosong");
                }
                if (etxtanggal_kunjungan_1.getText().toString().length() == 0) {
                    etxtanggal_kunjungan_1.setError("Tidak Boleh Kosong");
                }
                if (etxtanggal_kunjungan_2.getText().toString().length() == 0) {
                    etxtanggal_kunjungan_2.setError("Tidak Boleh Kosong");
                }
                if (etxtanggal_kunjungan_3.getText().toString().length() == 0) {
                    etxtanggal_kunjungan_3.setError("Tidak Boleh Kosong");
                }
                if (etxkondisi_ibu_secara_umum_1.getText().toString().length() == 0) {
                    etxkondisi_ibu_secara_umum_1.setError("Tidak Boleh Kosong");
                }
                if (etxkondisi_ibu_secara_umum_2.getText().toString().length() == 0) {
                    etxkondisi_ibu_secara_umum_2.setError("Tidak Boleh Kosong");
                }
                if (etxkondisi_ibu_secara_umum_3.getText().toString().length() == 0) {
                    etxkondisi_ibu_secara_umum_3.setError("Tidak Boleh Kosong");
                }
                if (etxtekanan_darah_1.getText().toString().length() == 0) {
                    etxtekanan_darah_1.setError("Tidak Boleh Kosong");
                }
                if (etxtekanan_darah_2.getText().toString().length() == 0) {
                    etxtekanan_darah_2.setError("Tidak Boleh Kosong");
                }
                if (etxtekanan_darah_3.getText().toString().length() == 0) {
                    etxtekanan_darah_3.setError("Tidak Boleh Kosong");
                }
                if (etxpendarahan_pervaginam_1.getText().toString().length() == 0) {
                    etxpendarahan_pervaginam_1.setError("Tidak Boleh Kosong");
                }
                if (etxpendarahan_pervaginam_2.getText().toString().length() == 0) {
                    etxpendarahan_pervaginam_2.setError("Tidak Boleh Kosong");
                }
                if (etxpendarahan_pervaginam_3.getText().toString().length() == 0) {
                    etxpendarahan_pervaginam_3.setError("Tidak Boleh Kosong");
                }
                if (etxkondisi_perineum_1.getText().toString().length() == 0) {
                    etxkondisi_perineum_1.setError("Tidak Boleh Kosong");
                }
                if (etxkondisi_perineum_2.getText().toString().length() == 0) {
                    etxkondisi_perineum_2.setError("Tidak Boleh Kosong");
                }
                if (etxkondisi_perineum_3.getText().toString().length() == 0) {
                    etxkondisi_perineum_3.setError("Tidak Boleh Kosong");
                }
                if (etxtanda_infeksi_1.getText().toString().length() == 0) {
                    etxtanda_infeksi_1.setError("Tidak Boleh Kosong");
                }
                if (etxtanda_infeksi_2.getText().toString().length() == 0) {
                    etxtanda_infeksi_2.setError("Tidak Boleh Kosong");
                }
                if (etxtanda_infeksi_3.getText().toString().length() == 0) {
                    etxtanda_infeksi_3.setError("Tidak Boleh Kosong");
                }
                if (etxkontraksi_uteri_1.getText().toString().length() == 0) {
                    etxkontraksi_uteri_1.setError("Tidak Boleh Kosong");
                }
                if (etxkontraksi_uteri_2.getText().toString().length() == 0) {
                    etxkontraksi_uteri_2.setError("Tidak Boleh Kosong");
                }
                if (etxkontraksi_uteri_3.getText().toString().length() == 0) {
                    etxkontraksi_uteri_3.setError("Tidak Boleh Kosong");
                }
                if (etxtinggi_fundus_uteri_1.getText().toString().length() == 0) {
                    etxtinggi_fundus_uteri_1.setError("Tidak Boleh Kosong");
                }
                if (etxtinggi_fundus_uteri_2.getText().toString().length() == 0) {
                    etxtinggi_fundus_uteri_2.setError("Tidak Boleh Kosong");
                }
                if (etxtinggi_fundus_uteri_3.getText().toString().length() == 0) {
                    etxtinggi_fundus_uteri_3.setError("Tidak Boleh Kosong");
                }
                if (etxlokhia_1.getText().toString().length() == 0) {
                    etxlokhia_1.setError("Tidak Boleh Kosong");
                }
                if (etxlokhia_2.getText().toString().length() == 0) {
                    etxlokhia_2.setError("Tidak Boleh Kosong");
                }
                if (etxlokhia_3.getText().toString().length() == 0) {
                    etxlokhia_3.setError("Tidak Boleh Kosong");
                }
                if (etxpemeriksaan_jalan_lahir_1.getText().toString().length() == 0) {
                    etxpemeriksaan_jalan_lahir_1.setError("Tidak Boleh Kosong");
                }
                if (etxpemeriksaan_jalan_lahir_2.getText().toString().length() == 0) {
                    etxpemeriksaan_jalan_lahir_2.setError("Tidak Boleh Kosong");
                }
                if (etxpemeriksaan_jalan_lahir_3.getText().toString().length() == 0) {
                    etxpemeriksaan_jalan_lahir_3.setError("Tidak Boleh Kosong");
                }
                if (etxpemeriksaan_payudara_1.getText().toString().length() == 0) {
                    etxpemeriksaan_payudara_1.setError("Tidak Boleh Kosong");
                }
                if (etxpemeriksaan_payudara_2.getText().toString().length() == 0) {
                    etxpemeriksaan_payudara_2.setError("Tidak Boleh Kosong");
                }
                if (etxpemeriksaan_payudara_3.getText().toString().length() == 0) {
                    etxpemeriksaan_payudara_3.setError("Tidak Boleh Kosong");
                }
                if (etxproduksi_asi_1.getText().toString().length() == 0) {
                    etxproduksi_asi_1.setError("Tidak Boleh Kosong");
                }
                if (etxproduksi_asi_2.getText().toString().length() == 0) {
                    etxproduksi_asi_2.setError("Tidak Boleh Kosong");
                }
                if (etxproduksi_asi_3.getText().toString().length() == 0) {
                    etxproduksi_asi_3.setError("Tidak Boleh Kosong");
                }
                if (etxpemberian_kapsul_vitamin_a_1.getText().toString().length() == 0) {
                    etxpemberian_kapsul_vitamin_a_1.setError("Tidak Boleh Kosong");
                }
                if (etxpemberian_kapsul_vitamin_a_2.getText().toString().length() == 0) {
                    etxpemberian_kapsul_vitamin_a_2.setError("Tidak Boleh Kosong");
                }
                if (etxpemberian_kapsul_vitamin_a_3.getText().toString().length() == 0) {
                    etxpemberian_kapsul_vitamin_a_3.setError("Tidak Boleh Kosong");
                }
                if (etxpelayanan_kontrasepsi_1.getText().toString().length() == 0) {
                    etxpelayanan_kontrasepsi_1.setError("Tidak Boleh Kosong");
                }
                if (etxpelayanan_kontrasepsi_2.getText().toString().length() == 0) {
                    etxpelayanan_kontrasepsi_2.setError("Tidak Boleh Kosong");
                }
                if (etxpelayanan_kontrasepsi_3.getText().toString().length() == 0) {
                    etxpelayanan_kontrasepsi_3.setError("Tidak Boleh Kosong");
                }
                if (etxpenanganan_resiko_tinggi_1.getText().toString().length() == 0) {
                    etxpenanganan_resiko_tinggi_1.setError("Tidak Boleh Kosong");
                }
                if (etxpenanganan_resiko_tinggi_2.getText().toString().length() == 0) {
                    etxpenanganan_resiko_tinggi_2.setError("Tidak Boleh Kosong");
                }
                if (etxpenanganan_resiko_tinggi_3.getText().toString().length() == 0) {
                    etxpenanganan_resiko_tinggi_3.setError("Tidak Boleh Kosong");
                }
                if (etxbuang_air_besar_1.getText().toString().length() == 0) {
                    etxbuang_air_besar_1.setError("Tidak Boleh Kosong");
                }
                if (etxbuang_air_besar_2.getText().toString().length() == 0) {
                    etxbuang_air_besar_2.setError("Tidak Boleh Kosong");
                }
                if (etxbuang_air_besar_3.getText().toString().length() == 0) {
                    etxbuang_air_besar_3.setError("Tidak Boleh Kosong");
                }
                if (etxbuang_air_kecil_1.getText().toString().length() == 0) {
                    etxbuang_air_kecil_1.setError("Tidak Boleh Kosong");
                }
                if (etxbuang_air_kecil_2.getText().toString().length() == 0) {
                    etxbuang_air_kecil_2.setError("Tidak Boleh Kosong");
                }
                if (etxbuang_air_kecil_3.getText().toString().length() == 0) {
                    etxbuang_air_kecil_3.setError("Tidak Boleh Kosong");
                }
                if (etxcatatan_dokter_1.getText().toString().length() == 0) {
                    etxcatatan_dokter_1.setError("Tidak Boleh Kosong");
                }
                if (etxcatatan_dokter_2.getText().toString().length() == 0) {
                    etxcatatan_dokter_2.setError("Tidak Boleh Kosong");
                }
                if (etxcatatan_dokter_3.getText().toString().length() == 0) {
                    etxcatatan_dokter_3.setError("Tidak Boleh Kosong");
                }
                Volley.newRequestQueue(Tambah_catatan_kesehatan_ibu_nifas.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/datakesehatanibunifas2", new Response.Listener<String>() {
                        public void onResponse(String response) {
                            try {
                                if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_catatan_kesehatan_ibu_nifas.this);
                                    builder.setTitle((CharSequence) "Sukses");
                                    builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                    builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            Tambah_catatan_kesehatan_ibu_nifas.this.finish();
                                        }
                                    });
                                    builder.create().show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(Tambah_catatan_kesehatan_ibu_nifas.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                                        }) {
                        /* access modifiers changed from: protected */
                        public Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> myParams = new HashMap<>();
                            myParams.put("nik_ibu", Tambah_catatan_kesehatan_ibu_nifas.this.getIntent().getStringExtra("nik_ibu"));
                            myParams.put("nama_anak", Tambah_catatan_kesehatan_ibu_nifas.nama_anak);
                            myParams.put("nifas_ke", Tambah_catatan_kesehatan_ibu_nifas.this.etxnifas_ke.getText().toString());
                            myParams.put("tanggal_kunjungan_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_1.getText().toString());
                            myParams.put("kondisi_ibu_secara_umum_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_1.getText().toString());
                            myParams.put("tekanan_darah_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxtekanan_darah_1.getText().toString());
                            myParams.put("pendarahan_pervaginam_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_1.getText().toString());
                            myParams.put("kondisi_perineum_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxkondisi_perineum_1.getText().toString());
                            myParams.put("tanda_infeksi_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxtanda_infeksi_1.getText().toString());
                            myParams.put("kontraksi_uteri_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxkontraksi_uteri_1.getText().toString());
                            myParams.put("tinggi_fundus_uteri_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_1.getText().toString());
                            myParams.put("lokhia_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxlokhia_1.getText().toString());
                            myParams.put("pemeriksaan_jalan_lahir_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_1.getText().toString());
                            myParams.put("pemeriksaan_payudara_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_1.getText().toString());
                            myParams.put("produksi_asi_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxproduksi_asi_1.getText().toString());
                            myParams.put("pemberian_kapsul_vitamin_a_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_1.getText().toString());
                            myParams.put("pelayanan_kontrasepsi_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_1.getText().toString());
                            myParams.put("penanganan_resiko_tinggi_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_1.getText().toString());
                            myParams.put("buang_air_besar_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxbuang_air_besar_1.getText().toString());
                            myParams.put("buang_air_kecil_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxbuang_air_kecil_1.getText().toString());
                            myParams.put("catatan_dokter_1", Tambah_catatan_kesehatan_ibu_nifas.this.etxcatatan_dokter_1.getText().toString());
                            myParams.put("tanggal_kunjungan_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_2.getText().toString());
                            myParams.put("kondisi_ibu_secara_umum_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_2.getText().toString());
                            myParams.put("tekanan_darah_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxtekanan_darah_2.getText().toString());
                            myParams.put("pendarahan_pervaginam_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_2.getText().toString());
                            myParams.put("kondisi_perineum_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxkondisi_perineum_2.getText().toString());
                            myParams.put("tanda_infeksi_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxtanda_infeksi_2.getText().toString());
                            myParams.put("kontraksi_uteri_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxkontraksi_uteri_2.getText().toString());
                            myParams.put("tinggi_fundus_uteri_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_2.getText().toString());
                            myParams.put("lokhia_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxlokhia_2.getText().toString());
                            myParams.put("pemeriksaan_jalan_lahir_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_2.getText().toString());
                            myParams.put("pemeriksaan_payudara_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_2.getText().toString());
                            myParams.put("produksi_asi_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxproduksi_asi_2.getText().toString());
                            myParams.put("pemberian_kapsul_vitamin_a_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_2.getText().toString());
                            myParams.put("pelayanan_kontrasepsi_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_2.getText().toString());
                            myParams.put("penanganan_resiko_tinggi_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_2.getText().toString());
                            myParams.put("buang_air_besar_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxbuang_air_besar_2.getText().toString());
                            myParams.put("buang_air_kecil_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxbuang_air_kecil_2.getText().toString());
                            myParams.put("catatan_dokter_2", Tambah_catatan_kesehatan_ibu_nifas.this.etxcatatan_dokter_2.getText().toString());
                            myParams.put("tanggal_kunjungan_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_3.getText().toString());
                            myParams.put("kondisi_ibu_secara_umum_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_3.getText().toString());
                            myParams.put("tekanan_darah_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxtekanan_darah_3.getText().toString());
                            myParams.put("pendarahan_pervaginam_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_3.getText().toString());
                            myParams.put("kondisi_perineum_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxkondisi_perineum_3.getText().toString());
                            myParams.put("tanda_infeksi_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxtanda_infeksi_3.getText().toString());
                            myParams.put("kontraksi_uteri_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxkontraksi_uteri_3.getText().toString());
                            myParams.put("tinggi_fundus_uteri_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_3.getText().toString());
                            myParams.put("lokhia_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxlokhia_3.getText().toString());
                            myParams.put("pemeriksaan_jalan_lahir_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_3.getText().toString());
                            myParams.put("pemeriksaan_payudara_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_3.getText().toString());
                            myParams.put("produksi_asi_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxproduksi_asi_3.getText().toString());
                            myParams.put("pemberian_kapsul_vitamin_a_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_3.getText().toString());
                            myParams.put("pelayanan_kontrasepsi_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_3.getText().toString());
                            myParams.put("penanganan_resiko_tinggi_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_1.getText().toString());
                            myParams.put("buang_air_besar_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxbuang_air_besar_3.getText().toString());
                            myParams.put("buang_air_kecil_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxbuang_air_kecil_3.getText().toString());
                            myParams.put("catatan_dokter_3", Tambah_catatan_kesehatan_ibu_nifas.this.etxcatatan_dokter_3.getText().toString());
                            myParams.put("keadaan_ibu", Tambah_catatan_kesehatan_ibu_nifas.this.spinnerpilih_keadaan_ibu.getSelectedItem().toString());
                            myParams.put("komplikasi_nifas", Tambah_catatan_kesehatan_ibu_nifas.this.spinnerpilih_komplikasi_nifas.getSelectedItem().toString());
                            myParams.put("keadaan_bayi", Tambah_catatan_kesehatan_ibu_nifas.this.spinnerpilih_keadaan_bayi.getSelectedItem().toString());
                            return myParams;
                        }

                    });
                }

        });
    }


    /* access modifiers changed from: package-private */
    public void list_anak() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/tambahkesehatanibunifas/" + getIntent().getStringExtra("nik_ibu"), new Response.Listener<String>() {
            @SuppressLint("ResourceType")
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("list_anak");
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        Tambah_catatan_kesehatan_ibu_nifas.this.list_anak.add(jsonArray.getJSONObject(i).getString("nama"));
                        Tambah_catatan_kesehatan_ibu_nifas tambah_catatan_kesehatan_ibu_nifas = Tambah_catatan_kesehatan_ibu_nifas.this;
                        Tambah_catatan_kesehatan_ibu_nifas tambah_catatan_kesehatan_ibu_nifas2 = Tambah_catatan_kesehatan_ibu_nifas.this;
                        tambah_catatan_kesehatan_ibu_nifas.anak_adapter = new ArrayAdapter<>(tambah_catatan_kesehatan_ibu_nifas2, 17367048, tambah_catatan_kesehatan_ibu_nifas2.list_anak);
                        Tambah_catatan_kesehatan_ibu_nifas.this.anak_adapter.setDropDownViewResource(17367049);
                        Tambah_catatan_kesehatan_ibu_nifas.this.spinnerpilih_nama_anak.setAdapter(Tambah_catatan_kesehatan_ibu_nifas.this.anak_adapter);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
    private void showDateDialog1(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxtanggal_kunjungan_1.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog2(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxtanggal_kunjungan_2.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog3(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxtanggal_kunjungan_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
