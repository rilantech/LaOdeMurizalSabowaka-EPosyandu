package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Edit_detail_kesehatan_ibu_nifas extends AppCompatActivity {
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
    TextView nama_anak;
    TextView nama_ibu;
    TextView nifas_ke;
    TextView nik_ibu;
    Spinner spinnerpilih_keadaan_bayi;
    Spinner spinnerpilih_keadaan_ibu;
    Spinner spinnerpilih_komplikasi_nifas;
//    Spinner spinnerpilih_status_nifas;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_edit_detail_kesehatan_ibu_nifas);
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibu);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
        this.nifas_ke = (TextView) findViewById(R.id.nifas_ke);
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
//        this.spinnerpilih_status_nifas = (Spinner) findViewById(R.id.spinnerpilih_status_nifas);
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
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.nifas_ke.setText(getIntent().getStringExtra("nifas_ke"));
        tampildatanifas();
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_detail_kesehatan_ibu_nifas.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Edit_detail_kesehatan_ibu_nifas.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Edit_detail_kesehatan_ibu_nifas.this.startActivity(intent);
                        Edit_detail_kesehatan_ibu_nifas.this.finish();
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
                Edit_detail_kesehatan_ibu_nifas.this.finish();
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Volley.newRequestQueue(Edit_detail_kesehatan_ibu_nifas.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatedatanifas/" + Edit_detail_kesehatan_ibu_nifas.this.getIntent().getStringExtra("UploadTaskParameters.Companion.CodingKeys.id"), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_detail_kesehatan_ibu_nifas.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Terupdate");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Edit_detail_kesehatan_ibu_nifas.this.finish();
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
                        Toast.makeText(Edit_detail_kesehatan_ibu_nifas.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Edit_detail_kesehatan_ibu_nifas.this.nik_ibu.getText().toString());
                        myParams.put("nama_anak", Edit_detail_kesehatan_ibu_nifas.this.nama_anak.getText().toString());
                        myParams.put("nifas_ke", Edit_detail_kesehatan_ibu_nifas.this.nifas_ke.getText().toString());
//                        myParams.put("status_nifas", Edit_detail_kesehatan_ibu_nifas.this.spinnerpilih_status_nifas.getSelectedItem().toString());
                        myParams.put("tanggal_kunjungan_1", Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_1.getText().toString());
                        myParams.put("kondisi_ibu_secara_umum_1", Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_1.getText().toString());
                        myParams.put("tekanan_darah_1", Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_1.getText().toString());
                        myParams.put("pendarahan_pervaginam_1", Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_1.getText().toString());
                        myParams.put("kondisi_perineum_1", Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_1.getText().toString());
                        myParams.put("tanda_infeksi_1", Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_1.getText().toString());
                        myParams.put("kontraksi_uteri_1", Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_1.getText().toString());
                        myParams.put("tinggi_fundus_uteri_1", Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_1.getText().toString());
                        myParams.put("lokhia_1", Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_1.getText().toString());
                        myParams.put("pemeriksaan_jalan_lahir_1", Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_1.getText().toString());
                        myParams.put("pemeriksaan_payudara_1", Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_1.getText().toString());
                        myParams.put("produksi_asi_1", Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_1.getText().toString());
                        myParams.put("pemberian_kapsul_vitamin_a_1", Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_1.getText().toString());
                        myParams.put("pelayanan_kontrasepsi_1", Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_1.getText().toString());
                        myParams.put("penanganan_resiko_tinggi_1", Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_1.getText().toString());
                        myParams.put("buang_air_besar_1", Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_1.getText().toString());
                        myParams.put("buang_air_kecil_1", Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_1.getText().toString());
                        myParams.put("catatan_dokter_1", Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_1.getText().toString());
                        myParams.put("tanggal_kunjungan_2", Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_2.getText().toString());
                        myParams.put("kondisi_ibu_secara_umum_2", Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_2.getText().toString());
                        myParams.put("tekanan_darah_2", Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_2.getText().toString());
                        myParams.put("pendarahan_pervaginam_2", Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_2.getText().toString());
                        myParams.put("kondisi_perineum_2", Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_2.getText().toString());
                        myParams.put("tanda_infeksi_2", Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_2.getText().toString());
                        myParams.put("kontraksi_uteri_2", Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_2.getText().toString());
                        myParams.put("tinggi_fundus_uteri_2", Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_2.getText().toString());
                        myParams.put("lokhia_2", Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_2.getText().toString());
                        myParams.put("pemeriksaan_jalan_lahir_2", Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_2.getText().toString());
                        myParams.put("pemeriksaan_payudara_2", Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_2.getText().toString());
                        myParams.put("produksi_asi_2", Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_2.getText().toString());
                        myParams.put("pemberian_kapsul_vitamin_a_2", Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_2.getText().toString());
                        myParams.put("pelayanan_kontrasepsi_2", Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_2.getText().toString());
                        myParams.put("penanganan_resiko_tinggi_2", Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_2.getText().toString());
                        myParams.put("buang_air_besar_2", Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_2.getText().toString());
                        myParams.put("buang_air_kecil_2", Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_2.getText().toString());
                        myParams.put("catatan_dokter_2", Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_2.getText().toString());
                        myParams.put("tanggal_kunjungan_3", Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_3.getText().toString());
                        myParams.put("kondisi_ibu_secara_umum_3", Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_3.getText().toString());
                        myParams.put("tekanan_darah_3", Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_3.getText().toString());
                        myParams.put("pendarahan_pervaginam_3", Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_3.getText().toString());
                        myParams.put("kondisi_perineum_3", Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_3.getText().toString());
                        myParams.put("tanda_infeksi_3", Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_3.getText().toString());
                        myParams.put("kontraksi_uteri_3", Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_3.getText().toString());
                        myParams.put("tinggi_fundus_uteri_3", Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_3.getText().toString());
                        myParams.put("lokhia_3", Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_3.getText().toString());
                        myParams.put("pemeriksaan_jalan_lahir_3", Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_3.getText().toString());
                        myParams.put("pemeriksaan_payudara_3", Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_3.getText().toString());
                        myParams.put("produksi_asi_3", Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_3.getText().toString());
                        myParams.put("pemberian_kapsul_vitamin_a_3", Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_3.getText().toString());
                        myParams.put("pelayanan_kontrasepsi_3", Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_3.getText().toString());
                        myParams.put("penanganan_resiko_tinggi_3", Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_1.getText().toString());
                        myParams.put("buang_air_besar_3", Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_3.getText().toString());
                        myParams.put("buang_air_kecil_3", Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_3.getText().toString());
                        myParams.put("catatan_dokter_3", Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_3.getText().toString());
                        myParams.put("keadaan_ibu", Edit_detail_kesehatan_ibu_nifas.this.spinnerpilih_keadaan_ibu.getSelectedItem().toString());
                        myParams.put("komplikasi_nifas", Edit_detail_kesehatan_ibu_nifas.this.spinnerpilih_komplikasi_nifas.getSelectedItem().toString());
                        myParams.put("keadaan_bayi", Edit_detail_kesehatan_ibu_nifas.this.spinnerpilih_keadaan_bayi.getSelectedItem().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void tampildatanifas() {
        Volley.newRequestQueue(getApplicationContext()).add(new StringRequest(0, new Configurasi().baseUrl() + "api/tampildatanifas/" + getIntent().getStringExtra("nik_ibu") + "/" + getIntent().getStringExtra("nifas_ke")+ "/" +Data_kesehatan_ibunifas.status_nifas, new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("tampildatanifas");
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        String status_nifas = getData.getString("status_nifas");
                        String tanggal_kunjungan_1 = getData.getString("tanggal_kunjungan_1");
                        String kondisi_ibu_secara_umum_1 = getData.getString("kondisi_ibu_secara_umum_1");
                        String tekanan_darah_1 = getData.getString("tekanan_darah_1");
                        String pendarahan_pervaginam_1 = getData.getString("pendarahan_pervaginam_1");
                        String kondisi_perineum_1 = getData.getString("kondisi_perineum_1");
                        String tanda_infeksi_1 = getData.getString("tanda_infeksi_1");
                        String kontraksi_uteri_1 = getData.getString("kontraksi_uteri_1");
                        String tinggi_fundus_uteri_1 = getData.getString("tinggi_fundus_uteri_1");
                        String lokhia_1 = getData.getString("lokhia_1");
                        String pemeriksaan_jalan_lahir_1 = getData.getString("pemeriksaan_jalan_lahir_1");
                        JSONObject jsonObject2 = jsonObject;
                        String pemeriksaan_payudara_1 = getData.getString("pemeriksaan_payudara_1");
                        String produksi_asi_1 = getData.getString("produksi_asi_1");
                        JSONArray jsonArray2 = jsonArray;
                        String pemberian_kapsul_vitamin_a_1 = getData.getString("pemberian_kapsul_vitamin_a_1");
                        int i2 = i;
                        String pelayanan_kontrasepsi_1 = getData.getString("pelayanan_kontrasepsi_1");
                        String penanganan_resiko_tinggi_1 = getData.getString("penanganan_resiko_tinggi_1");
                        String buang_air_besar_1 = getData.getString("buang_air_besar_1");
                        String buang_air_kecil_1 = getData.getString("buang_air_kecil_1");
                        String catatan_dokter_1 = getData.getString("catatan_dokter_1");
                        String tanggal_kunjungan_2 = getData.getString("tanggal_kunjungan_2");
                        String kondisi_ibu_secara_umum_2 = getData.getString("kondisi_ibu_secara_umum_2");
                        String tekanan_darah_2 = getData.getString("tekanan_darah_2");
                        String pendarahan_pervaginam_2 = getData.getString("pendarahan_pervaginam_2");
                        String kondisi_perineum_2 = getData.getString("kondisi_perineum_2");
                        String tanda_infeksi_2 = getData.getString("tanda_infeksi_2");
                        String kontraksi_uteri_2 = getData.getString("kontraksi_uteri_2");
                        String tinggi_fundus_uteri_2 = getData.getString("tinggi_fundus_uteri_2");
                        String lokhia_2 = getData.getString("lokhia_2");
                        String pemeriksaan_jalan_lahir_2 = getData.getString("pemeriksaan_jalan_lahir_2");
                        String pemeriksaan_payudara_2 = getData.getString("pemeriksaan_payudara_2");
                        String produksi_asi_2 = getData.getString("produksi_asi_2");
                        String pemberian_kapsul_vitamin_a_2 = getData.getString("pemberian_kapsul_vitamin_a_2");
                        String pelayanan_kontrasepsi_2 = getData.getString("pelayanan_kontrasepsi_2");
                        String penanganan_resiko_tinggi_2 = getData.getString("penanganan_resiko_tinggi_2");
                        String buang_air_besar_2 = getData.getString("buang_air_besar_2");
                        String buang_air_kecil_2 = getData.getString("buang_air_kecil_2");
                        String catatan_dokter_2 = getData.getString("catatan_dokter_2");
                        String tanggal_kunjungan_3 = getData.getString("tanggal_kunjungan_3");
                        String kondisi_ibu_secara_umum_3 = getData.getString("kondisi_ibu_secara_umum_3");
                        String tekanan_darah_3 = getData.getString("tekanan_darah_3");
                        String pendarahan_pervaginam_3 = getData.getString("pendarahan_pervaginam_3");
                        String kondisi_perineum_3 = getData.getString("kondisi_perineum_3");
                        String tanda_infeksi_3 = getData.getString("tanda_infeksi_3");
                        String kontraksi_uteri_3 = getData.getString("kontraksi_uteri_3");
                        String tinggi_fundus_uteri_3 = getData.getString("tinggi_fundus_uteri_3");
                        String lokhia_3 = getData.getString("lokhia_3");
                        String pemeriksaan_jalan_lahir_3 = getData.getString("pemeriksaan_jalan_lahir_3");
                        String pemeriksaan_payudara_3 = getData.getString("pemeriksaan_payudara_3");
                        String produksi_asi_3 = getData.getString("produksi_asi_3");
                        String pemberian_kapsul_vitamin_a_3 = getData.getString("pemberian_kapsul_vitamin_a_3");
                        String pelayanan_kontrasepsi_3 = getData.getString("pelayanan_kontrasepsi_3");
                        String penanganan_resiko_tinggi_3 = getData.getString("penanganan_resiko_tinggi_3");
                        String buang_air_besar_3 = getData.getString("buang_air_besar_3");
                        String buang_air_kecil_3 = getData.getString("buang_air_kecil_3");
                        String catatan_dokter_3 = getData.getString("catatan_dokter_3");
                        String keadaan_ibu = getData.getString("keadaan_ibu");
                        String komplikasi_nifas = getData.getString("komplikasi_nifas");
                        String keadaan_bayi = getData.getString("keadaan_bayi");
                        JSONObject jSONObject = getData;
//                        if(status_nifas.equals("Sedang Berlangsung")){
//                            spinnerpilih_status_nifas.setSelection(1);
//                        }
//                        if(status_nifas.equals("Berakhir")){
//                            spinnerpilih_status_nifas.setSelection(2);
//                        }
//
//                        if(status_nifas.equals("Berakhir")){
//                            spinnerpilih_status_nifas.setSelection(2);
//                        }
                        if(keadaan_ibu.equals("Sehat")){
                            spinnerpilih_keadaan_ibu.setSelection(1);
                        }
                        if(keadaan_ibu.equals("Sakit")){
                            spinnerpilih_keadaan_ibu.setSelection(2);
                        }
                        if(keadaan_ibu.equals("Meninggal")){
                            spinnerpilih_keadaan_ibu.setSelection(3);
                        }

                        if(komplikasi_nifas.equals("Pendarahan")){
                            spinnerpilih_komplikasi_nifas.setSelection(1);
                        }
                        if(komplikasi_nifas.equals("Infeksi")){
                            spinnerpilih_komplikasi_nifas.setSelection(2);
                        }
                        if(komplikasi_nifas.equals("Hipertensi")){
                            spinnerpilih_komplikasi_nifas.setSelection(3);
                        }
                        if(komplikasi_nifas.equals("Lain-lain: Depresi post partum")){
                            spinnerpilih_komplikasi_nifas.setSelection(4);
                        }
                        if(komplikasi_nifas.equals("Tidak Ada")){
                            spinnerpilih_komplikasi_nifas.setSelection(5);
                        }

                        if(keadaan_bayi.equals("Sehat")){
                            spinnerpilih_keadaan_bayi.setSelection(1);
                        }
                        if(keadaan_bayi.equals("Sakit")){
                            spinnerpilih_keadaan_bayi.setSelection(2);
                        }
                        if(keadaan_bayi.equals("Kelainan Bawaan")){
                            spinnerpilih_keadaan_bayi.setSelection(3);
                        }
                        if(keadaan_bayi.equals("Meninggal")){
                            spinnerpilih_keadaan_bayi.setSelection(4);
                        }

                        Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_1.setText(tanggal_kunjungan_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_1.setText(kondisi_ibu_secara_umum_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_1.setText(tekanan_darah_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_1.setText(pendarahan_pervaginam_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_1.setText(kondisi_perineum_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_1.setText(tanda_infeksi_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_1.setText(kontraksi_uteri_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_1.setText(tinggi_fundus_uteri_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_1.setText(lokhia_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_1.setText(pemeriksaan_jalan_lahir_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_1.setText(pemeriksaan_payudara_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_1.setText(produksi_asi_1);
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_1.setText(pemberian_kapsul_vitamin_a_1);
                        String pemberian_kapsul_vitamin_a_12 = pemberian_kapsul_vitamin_a_1;
                        String pemberian_kapsul_vitamin_a_13 = pelayanan_kontrasepsi_1;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_1.setText(pemberian_kapsul_vitamin_a_13);
                        String pelayanan_kontrasepsi_12 = pemberian_kapsul_vitamin_a_13;
                        String penanganan_resiko_tinggi_12 = penanganan_resiko_tinggi_1;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_1.setText(penanganan_resiko_tinggi_12);
                        String penanganan_resiko_tinggi_13 = penanganan_resiko_tinggi_12;
                        String buang_air_besar_12 = buang_air_besar_1;
                        Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_1.setText(buang_air_besar_12);
                        String buang_air_besar_13 = buang_air_besar_12;
                        String buang_air_kecil_12 = buang_air_kecil_1;
                        Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_1.setText(buang_air_kecil_12);
                        String buang_air_kecil_13 = buang_air_kecil_12;
                        String buang_air_kecil_14 = catatan_dokter_1;
                        Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_1.setText(buang_air_kecil_14);
                        String catatan_dokter_12 = buang_air_kecil_14;
                        String tanggal_kunjungan_22 = tanggal_kunjungan_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_2.setText(tanggal_kunjungan_22);
                        String tanggal_kunjungan_23 = tanggal_kunjungan_22;
                        String kondisi_ibu_secara_umum_22 = kondisi_ibu_secara_umum_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_2.setText(kondisi_ibu_secara_umum_22);
                        String kondisi_ibu_secara_umum_23 = kondisi_ibu_secara_umum_22;
                        String tekanan_darah_22 = tekanan_darah_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_2.setText(tekanan_darah_22);
                        String tekanan_darah_23 = tekanan_darah_22;
                        String tekanan_darah_24 = pendarahan_pervaginam_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_2.setText(tekanan_darah_24);
                        String pendarahan_pervaginam_22 = tekanan_darah_24;
                        String kondisi_perineum_22 = kondisi_perineum_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_2.setText(kondisi_perineum_22);
                        String kondisi_perineum_23 = kondisi_perineum_22;
                        String kondisi_perineum_24 = tanda_infeksi_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_2.setText(kondisi_perineum_24);
                        String tanda_infeksi_22 = kondisi_perineum_24;
                        String tanda_infeksi_23 = kontraksi_uteri_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_2.setText(tanda_infeksi_23);
                        String kontraksi_uteri_22 = tanda_infeksi_23;
                        String tinggi_fundus_uteri_22 = tinggi_fundus_uteri_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_2.setText(tinggi_fundus_uteri_22);
                        String tinggi_fundus_uteri_23 = tinggi_fundus_uteri_22;
                        String lokhia_22 = lokhia_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_2.setText(lokhia_22);
                        String lokhia_23 = lokhia_22;
                        String pemeriksaan_jalan_lahir_22 = pemeriksaan_jalan_lahir_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_2.setText(pemeriksaan_jalan_lahir_22);
                        String pemeriksaan_jalan_lahir_23 = pemeriksaan_jalan_lahir_22;
                        String pemeriksaan_jalan_lahir_24 = pemeriksaan_payudara_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_2.setText(pemeriksaan_jalan_lahir_24);
                        String pemeriksaan_payudara_22 = pemeriksaan_jalan_lahir_24;
                        String produksi_asi_22 = produksi_asi_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_2.setText(produksi_asi_22);
                        String produksi_asi_23 = produksi_asi_22;
                        String pemberian_kapsul_vitamin_a_22 = pemberian_kapsul_vitamin_a_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_2.setText(pemberian_kapsul_vitamin_a_22);
                        String pemberian_kapsul_vitamin_a_23 = pemberian_kapsul_vitamin_a_22;
                        String pelayanan_kontrasepsi_22 = pelayanan_kontrasepsi_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_2.setText(pelayanan_kontrasepsi_22);
                        String pelayanan_kontrasepsi_23 = pelayanan_kontrasepsi_22;
                        String penanganan_resiko_tinggi_22 = penanganan_resiko_tinggi_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_2.setText(penanganan_resiko_tinggi_22);
                        String penanganan_resiko_tinggi_23 = penanganan_resiko_tinggi_22;
                        String buang_air_besar_22 = buang_air_besar_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_2.setText(buang_air_besar_22);
                        String buang_air_besar_23 = buang_air_besar_22;
                        String buang_air_besar_24 = buang_air_kecil_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_2.setText(buang_air_besar_24);
                        String buang_air_kecil_22 = buang_air_besar_24;
                        String catatan_dokter_22 = catatan_dokter_2;
                        Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_2.setText(catatan_dokter_22);
                        String catatan_dokter_23 = catatan_dokter_22;
                        String tanggal_kunjungan_32 = tanggal_kunjungan_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_3.setText(tanggal_kunjungan_32);
                        String tanggal_kunjungan_33 = tanggal_kunjungan_32;
                        String kondisi_ibu_secara_umum_32 = kondisi_ibu_secara_umum_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_3.setText(kondisi_ibu_secara_umum_32);
                        String kondisi_ibu_secara_umum_33 = kondisi_ibu_secara_umum_32;
                        String tekanan_darah_32 = tekanan_darah_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_3.setText(tekanan_darah_32);
                        String tekanan_darah_33 = tekanan_darah_32;
                        String tekanan_darah_34 = pendarahan_pervaginam_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_3.setText(tekanan_darah_34);
                        String pendarahan_pervaginam_32 = tekanan_darah_34;
                        String kondisi_perineum_32 = kondisi_perineum_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_3.setText(kondisi_perineum_32);
                        String kondisi_perineum_33 = kondisi_perineum_32;
                        String kondisi_perineum_34 = tanda_infeksi_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_3.setText(kondisi_perineum_34);
                        String tanda_infeksi_32 = kondisi_perineum_34;
                        String kontraksi_uteri_32 = kontraksi_uteri_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_3.setText(kontraksi_uteri_32);
                        String kontraksi_uteri_33 = kontraksi_uteri_32;
                        String tinggi_fundus_uteri_32 = tinggi_fundus_uteri_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_3.setText(tinggi_fundus_uteri_32);
                        String tinggi_fundus_uteri_33 = tinggi_fundus_uteri_32;
                        String tinggi_fundus_uteri_34 = lokhia_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_3.setText(tinggi_fundus_uteri_34);
                        String lokhia_32 = tinggi_fundus_uteri_34;
                        String pemeriksaan_jalan_lahir_32 = pemeriksaan_jalan_lahir_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_3.setText(pemeriksaan_jalan_lahir_32);
                        String pemeriksaan_jalan_lahir_33 = pemeriksaan_jalan_lahir_32;
                        String pemeriksaan_payudara_32 = pemeriksaan_payudara_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_3.setText(pemeriksaan_payudara_32);
                        String pemeriksaan_payudara_33 = pemeriksaan_payudara_32;
                        String pemeriksaan_payudara_34 = produksi_asi_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_3.setText(pemeriksaan_payudara_34);
                        String produksi_asi_32 = pemeriksaan_payudara_34;
                        String pemberian_kapsul_vitamin_a_32 = pemberian_kapsul_vitamin_a_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_3.setText(pemberian_kapsul_vitamin_a_32);
                        String pemberian_kapsul_vitamin_a_33 = pemberian_kapsul_vitamin_a_32;
                        String pelayanan_kontrasepsi_32 = pelayanan_kontrasepsi_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_3.setText(pelayanan_kontrasepsi_32);
                        String pelayanan_kontrasepsi_33 = pelayanan_kontrasepsi_32;
                        String pelayanan_kontrasepsi_34 = penanganan_resiko_tinggi_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_3.setText(pelayanan_kontrasepsi_34);
                        String penanganan_resiko_tinggi_32 = pelayanan_kontrasepsi_34;
                        String buang_air_besar_32 = buang_air_besar_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_3.setText(buang_air_besar_32);
                        String buang_air_besar_33 = buang_air_besar_32;
                        String buang_air_kecil_32 = buang_air_kecil_3;
                        Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_3.setText(buang_air_kecil_32);
                        Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_3.setText(catatan_dokter_3);
                        String catatan_dokter_32 = catatan_dokter_3;
                        if (tanggal_kunjungan_1 == "null") {
                            String str = tanggal_kunjungan_1;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_1.setText("-");
                        }
                        if (kondisi_ibu_secara_umum_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_1.setText("-");
                        }
                        if (tekanan_darah_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_1.setText("-");
                        }
                        if (pendarahan_pervaginam_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_1.setText("-");
                        }
                        if (kondisi_perineum_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_1.setText("-");
                        }
                        if (tanda_infeksi_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_1.setText("-");
                        }
                        if (kontraksi_uteri_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_1.setText("-");
                        }
                        if (tinggi_fundus_uteri_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_1.setText("-");
                        }
                        if (lokhia_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_1.setText("-");
                        }
                        if (pemeriksaan_jalan_lahir_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_1.setText("-");
                        }
                        if (pemeriksaan_payudara_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_1.setText("-");
                        }
                        if (produksi_asi_1 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_1.setText("-");
                        }
                        if (pemberian_kapsul_vitamin_a_12 == "null") {
                            String str2 = pemeriksaan_payudara_1;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_1.setText("-");
                        }
                        String pemeriksaan_payudara_12 = pelayanan_kontrasepsi_12;
                        if (pemeriksaan_payudara_12 == "null") {
                            String str3 = pemeriksaan_payudara_12;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_1.setText("-");
                        } else {
                            String pelayanan_kontrasepsi_13 = pemeriksaan_payudara_12;
                        }
                        String penanganan_resiko_tinggi_14 = penanganan_resiko_tinggi_13;
                        if (penanganan_resiko_tinggi_14 == "null") {
                            String str4 = penanganan_resiko_tinggi_14;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_1.setText("-");
                        }
                        String buang_air_besar_14 = buang_air_besar_13;
                        if (buang_air_besar_14 == "null") {
                            String str5 = buang_air_besar_14;
                            Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_1.setText("-");
                        }
                        String buang_air_kecil_15 = buang_air_kecil_13;
                        if (buang_air_kecil_15 == "null") {
                            String str6 = buang_air_kecil_15;
                            Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_1.setText("-");
                        }
                        String buang_air_kecil_16 = catatan_dokter_12;
                        if (buang_air_kecil_16 == "null") {
                            String str7 = buang_air_kecil_16;
                            Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_1.setText("-");
                        } else {
                            String catatan_dokter_13 = buang_air_kecil_16;
                        }
                        String tanggal_kunjungan_24 = tanggal_kunjungan_23;
                        if (tanggal_kunjungan_24 == "null") {
                            String str8 = tanggal_kunjungan_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_2.setText("-");
                        }
                        String kondisi_ibu_secara_umum_24 = kondisi_ibu_secara_umum_23;
                        if (kondisi_ibu_secara_umum_24 == "null") {
                            String str9 = kondisi_ibu_secara_umum_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_2.setText("-");
                        }
                        String tekanan_darah_25 = tekanan_darah_23;
                        if (tekanan_darah_25 == "null") {
                            String str10 = tekanan_darah_25;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_2.setText("-");
                        }
                        String tekanan_darah_26 = pendarahan_pervaginam_22;
                        if (tekanan_darah_26 == "null") {
                            String str11 = tekanan_darah_26;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_2.setText("-");
                        } else {
                            String pendarahan_pervaginam_23 = tekanan_darah_26;
                        }
                        String kondisi_perineum_25 = kondisi_perineum_23;
                        if (kondisi_perineum_25 == "null") {
                            String str12 = kondisi_perineum_25;
                            Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_2.setText("-");
                        }
                        String kondisi_perineum_26 = tanda_infeksi_22;
                        if (kondisi_perineum_26 == "null") {
                            String str13 = kondisi_perineum_26;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_2.setText("-");
                        } else {
                            String tanda_infeksi_24 = kondisi_perineum_26;
                        }
                        String tanda_infeksi_25 = kontraksi_uteri_22;
                        if (tanda_infeksi_25 == "null") {
                            String str14 = tanda_infeksi_25;
                            Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_2.setText("-");
                        } else {
                            String kontraksi_uteri_23 = tanda_infeksi_25;
                        }
                        String tinggi_fundus_uteri_24 = tinggi_fundus_uteri_23;
                        if (tinggi_fundus_uteri_24 == "null") {
                            String str15 = tinggi_fundus_uteri_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_2.setText("-");
                        }
                        String lokhia_24 = lokhia_23;
                        if (lokhia_24 == "null") {
                            String str16 = lokhia_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_2.setText("-");
                        }
                        String pemeriksaan_jalan_lahir_25 = pemeriksaan_jalan_lahir_23;
                        if (pemeriksaan_jalan_lahir_25 == "null") {
                            String str17 = pemeriksaan_jalan_lahir_25;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_2.setText("-");
                        }
                        String pemeriksaan_jalan_lahir_26 = pemeriksaan_payudara_22;
                        if (pemeriksaan_jalan_lahir_26 == "null") {
                            String str18 = pemeriksaan_jalan_lahir_26;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_2.setText("-");
                        } else {
                            String pemeriksaan_payudara_23 = pemeriksaan_jalan_lahir_26;
                        }
                        String produksi_asi_24 = produksi_asi_23;
                        if (produksi_asi_24 == "null") {
                            String str19 = produksi_asi_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_2.setText("-");
                        }
                        String pemberian_kapsul_vitamin_a_24 = pemberian_kapsul_vitamin_a_23;
                        if (pemberian_kapsul_vitamin_a_24 == "null") {
                            String str20 = pemberian_kapsul_vitamin_a_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_2.setText("-");
                        }
                        String pelayanan_kontrasepsi_24 = pelayanan_kontrasepsi_23;
                        if (pelayanan_kontrasepsi_24 == "null") {
                            String str21 = pelayanan_kontrasepsi_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_2.setText("-");
                        }
                        String penanganan_resiko_tinggi_24 = penanganan_resiko_tinggi_23;
                        if (penanganan_resiko_tinggi_24 == "null") {
                            String str22 = penanganan_resiko_tinggi_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_2.setText("-");
                        }
                        String buang_air_besar_25 = buang_air_besar_23;
                        if (buang_air_besar_25 == "null") {
                            String str23 = buang_air_besar_25;
                            Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_2.setText("-");
                        }
                        String buang_air_besar_26 = buang_air_kecil_22;
                        if (buang_air_besar_26 == "null") {
                            String str24 = buang_air_besar_26;
                            Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_2.setText("-");
                        } else {
                            String buang_air_kecil_23 = buang_air_besar_26;
                        }
                        String catatan_dokter_24 = catatan_dokter_23;
                        if (catatan_dokter_24 == "null") {
                            String str25 = catatan_dokter_24;
                            Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_2.setText("-");
                        }
                        String tanggal_kunjungan_34 = tanggal_kunjungan_33;
                        if (tanggal_kunjungan_34 == "null") {
                            String str26 = tanggal_kunjungan_34;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtanggal_kunjungan_3.setText("-");
                        }
                        String kondisi_ibu_secara_umum_34 = kondisi_ibu_secara_umum_33;
                        if (kondisi_ibu_secara_umum_34 == "null") {
                            String str27 = kondisi_ibu_secara_umum_34;
                            Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_ibu_secara_umum_3.setText("-");
                        }
                        String tekanan_darah_35 = tekanan_darah_33;
                        if (tekanan_darah_35 == "null") {
                            String str28 = tekanan_darah_35;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtekanan_darah_3.setText("-");
                        }
                        String tekanan_darah_36 = pendarahan_pervaginam_32;
                        if (tekanan_darah_36 == "null") {
                            String str29 = tekanan_darah_36;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpendarahan_pervaginam_3.setText("-");
                        } else {
                            String pendarahan_pervaginam_33 = tekanan_darah_36;
                        }
                        String kondisi_perineum_35 = kondisi_perineum_33;
                        if (kondisi_perineum_35 == "null") {
                            String str30 = kondisi_perineum_35;
                            Edit_detail_kesehatan_ibu_nifas.this.etxkondisi_perineum_3.setText("-");
                        }
                        String kondisi_perineum_36 = tanda_infeksi_32;
                        if (kondisi_perineum_36 == "null") {
                            String str31 = kondisi_perineum_36;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtanda_infeksi_3.setText("-");
                        } else {
                            String tanda_infeksi_33 = kondisi_perineum_36;
                        }
                        String kontraksi_uteri_34 = kontraksi_uteri_33;
                        if (kontraksi_uteri_34 == "null") {
                            String str32 = kontraksi_uteri_34;
                            Edit_detail_kesehatan_ibu_nifas.this.etxkontraksi_uteri_3.setText("-");
                        }
                        String tinggi_fundus_uteri_35 = tinggi_fundus_uteri_33;
                        if (tinggi_fundus_uteri_35 == "null") {
                            String str33 = tinggi_fundus_uteri_35;
                            Edit_detail_kesehatan_ibu_nifas.this.etxtinggi_fundus_uteri_3.setText("-");
                        }
                        String tinggi_fundus_uteri_36 = lokhia_32;
                        if (tinggi_fundus_uteri_36 == "null") {
                            String str34 = tinggi_fundus_uteri_36;
                            Edit_detail_kesehatan_ibu_nifas.this.etxlokhia_3.setText("-");
                        } else {
                            String lokhia_33 = tinggi_fundus_uteri_36;
                        }
                        String pemeriksaan_jalan_lahir_34 = pemeriksaan_jalan_lahir_33;
                        if (pemeriksaan_jalan_lahir_34 == "null") {
                            String str35 = pemeriksaan_jalan_lahir_34;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_jalan_lahir_3.setText("-");
                        }
                        String pemeriksaan_payudara_35 = pemeriksaan_payudara_33;
                        if (pemeriksaan_payudara_35 == "null") {
                            String str36 = pemeriksaan_payudara_35;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemeriksaan_payudara_3.setText("-");
                        }
                        String pemeriksaan_payudara_36 = produksi_asi_32;
                        if (pemeriksaan_payudara_36 == "null") {
                            String str37 = pemeriksaan_payudara_36;
                            Edit_detail_kesehatan_ibu_nifas.this.etxproduksi_asi_3.setText("-");
                        } else {
                            String produksi_asi_33 = pemeriksaan_payudara_36;
                        }
                        String pemberian_kapsul_vitamin_a_34 = pemberian_kapsul_vitamin_a_33;
                        if (pemberian_kapsul_vitamin_a_34 == "null") {
                            String str38 = pemberian_kapsul_vitamin_a_34;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpemberian_kapsul_vitamin_a_3.setText("-");
                        }
                        String pelayanan_kontrasepsi_35 = pelayanan_kontrasepsi_33;
                        if (pelayanan_kontrasepsi_35 == "null") {
                            String str39 = pelayanan_kontrasepsi_35;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpelayanan_kontrasepsi_3.setText("-");
                        }
                        String pelayanan_kontrasepsi_36 = penanganan_resiko_tinggi_32;
                        if (pelayanan_kontrasepsi_36 == "null") {
                            String str40 = pelayanan_kontrasepsi_36;
                            Edit_detail_kesehatan_ibu_nifas.this.etxpenanganan_resiko_tinggi_3.setText("-");
                        } else {
                            String penanganan_resiko_tinggi_33 = pelayanan_kontrasepsi_36;
                        }
                        String buang_air_besar_34 = buang_air_besar_33;
                        if (buang_air_besar_34 == "null") {
                            String str41 = buang_air_besar_34;
                            Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_besar_3.setText("-");
                        }
                        if (buang_air_kecil_32 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxbuang_air_kecil_3.setText("-");
                        }
                        if (catatan_dokter_32 == "null") {
                            Edit_detail_kesehatan_ibu_nifas.this.etxcatatan_dokter_3.setText("-");
                        }
                        i = i2 + 1;
                        String str42 = response;
                        jsonObject = jsonObject2;
                        jsonArray = jsonArray2;
                    }
                    JSONArray jSONArray = jsonArray;
                    int i3 = i;
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
