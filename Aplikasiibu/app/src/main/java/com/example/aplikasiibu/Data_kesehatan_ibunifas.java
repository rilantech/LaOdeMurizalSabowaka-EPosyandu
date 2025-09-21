package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDataKesehatanIbuNifas.AdaptorDataKesehatanIbuNifas;
import com.example.aplikasiibu.AdapterDataKesehatanIbuNifas.GetDataKesehatanIbuNifas;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Data_kesehatan_ibunifas extends AppCompatActivity {
    public static String id;
    public static String kosong;
    public static String nama_anak;
    public static String nifas_ke;
    public static Integer nomor = 0;
    AdaptorDataKesehatanIbuNifas adaptor;
    ImageView butonlogout;
    ListView listView;
    ArrayList<String> list_nifaske = new ArrayList<>();
    ArrayList<GetDataKesehatanIbuNifas> model;
    ArrayAdapter<String> nifaske_adapter;
    Spinner spinner;
    Spinner spinnernifas_ke;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView tvbuang_air_besar_1;
    TextView tvbuang_air_besar_2;
    TextView tvbuang_air_besar_3;
    TextView tvbuang_air_kecil_1;
    TextView tvbuang_air_kecil_2;
    TextView tvbuang_air_kecil_3;
    TextView tvcatatan_dokter_1;
    TextView tvcatatan_dokter_2;
    TextView tvcatatan_dokter_3;
    TextView tvkeadaan_bayi;
    TextView tvkeadaan_ibu;
    TextView tvkomplikasi_nifas;
    TextView tvkondisi_ibu_secara_umum_1;
    TextView tvkondisi_ibu_secara_umum_2;
    TextView tvkondisi_ibu_secara_umum_3;
    TextView tvkondisi_perineum_1;
    TextView tvkondisi_perineum_2;
    TextView tvkondisi_perineum_3;
    TextView tvkontraksi_uteri_1;
    TextView tvkontraksi_uteri_2;
    TextView tvkontraksi_uteri_3;
    TextView tvlokhia_1;
    TextView tvlokhia_2;
    TextView tvlokhia_3;
    TextView tvnama_anak;
    TextView tvpelayanan_kontrasepsi_1;
    TextView tvpelayanan_kontrasepsi_2;
    TextView tvpelayanan_kontrasepsi_3;
    TextView tvpemberian_kapsul_vitamin_a_1;
    TextView tvpemberian_kapsul_vitamin_a_2;
    TextView tvpemberian_kapsul_vitamin_a_3;
    TextView tvpemeriksaan_jalan_lahir_1;
    TextView tvpemeriksaan_jalan_lahir_2;
    TextView tvpemeriksaan_jalan_lahir_3;
    TextView tvpemeriksaan_payudara_1;
    TextView tvpemeriksaan_payudara_2;
    TextView tvpemeriksaan_payudara_3;
    TextView tvpenanganan_resiko_tinggi_1;
    TextView tvpenanganan_resiko_tinggi_2;
    TextView tvpenanganan_resiko_tinggi_3;
    TextView tvpendarahan_pervaginam_1;
    TextView tvpendarahan_pervaginam_2;
    TextView tvpendarahan_pervaginam_3;
    TextView tvproduksi_asi_1;
    TextView tvproduksi_asi_2;
    TextView tvproduksi_asi_3;
    TextView tvtanda_infeksi_1;
    TextView tvtanda_infeksi_2;
    TextView tvtanda_infeksi_3;
    TextView tvtanggal_kunjungan_1;
    TextView tvtanggal_kunjungan_2;
    TextView tvtanggal_kunjungan_3;
    TextView tvtekanan_darah_1;
    TextView tvtekanan_darah_2;
    TextView tvtekanan_darah_3;
    TextView tvtinggi_fundus_uteri_1;
    TextView tvtinggi_fundus_uteri_2;
    TextView tvtinggi_fundus_uteri_3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_data_kesehatan_ibunifas);
        this.spinner = (Spinner) findViewById(R.id.spinner_pilih_data_kesehatan_ibu);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.spinnernifas_ke = (Spinner) findViewById(R.id.spinnernifas_ke);
        this.tvnama_anak = (TextView) findViewById(R.id.tvnama_anak);
        this.tvtanggal_kunjungan_1 = (TextView) findViewById(R.id.tvtanggal_kunjungan_1);
        this.tvkondisi_ibu_secara_umum_1 = (TextView) findViewById(R.id.tvkondisi_ibu_secara_umum_1);
        this.tvtekanan_darah_1 = (TextView) findViewById(R.id.tv_tekanan_darah_1);
        this.tvpendarahan_pervaginam_1 = (TextView) findViewById(R.id.tv_pendarahan_pervaginam_1);
        this.tvkondisi_perineum_1 = (TextView) findViewById(R.id.tvkondisi_perineum_1);
        this.tvtanda_infeksi_1 = (TextView) findViewById(R.id.tvtanda_infeksi_1);
        this.tvkontraksi_uteri_1 = (TextView) findViewById(R.id.tvkontraksi_uteri_1);
        this.tvtinggi_fundus_uteri_1 = (TextView) findViewById(R.id.tvtinggi_fundus_uteri_1);
        this.tvlokhia_1 = (TextView) findViewById(R.id.tvlokhia_1);
        this.tvpemeriksaan_jalan_lahir_1 = (TextView) findViewById(R.id.tvpemeriksaan_jalan_lahir_1);
        this.tvpemeriksaan_payudara_1 = (TextView) findViewById(R.id.tvpemeriksaan_payudara_1);
        this.tvproduksi_asi_1 = (TextView) findViewById(R.id.tvproduksi_asi_1);
        this.tvpemberian_kapsul_vitamin_a_1 = (TextView) findViewById(R.id.tvpemberian_kapsul_vitamin_a_1);
        this.tvpelayanan_kontrasepsi_1 = (TextView) findViewById(R.id.tvpelayanan_kontrasepsi_1);
        this.tvpenanganan_resiko_tinggi_1 = (TextView) findViewById(R.id.tvpenanganan_resiko_tinggi_1);
        this.tvbuang_air_besar_1 = (TextView) findViewById(R.id.tvbuang_air_besar_1);
        this.tvbuang_air_kecil_1 = (TextView) findViewById(R.id.tvbuang_air_kecil_1);
        this.tvcatatan_dokter_1 = (TextView) findViewById(R.id.tvcatatan_dokter_1);
        this.tvtanggal_kunjungan_2 = (TextView) findViewById(R.id.tvtanggal_kunjungan_2);
        this.tvkondisi_ibu_secara_umum_2 = (TextView) findViewById(R.id.tvkondisi_ibu_secara_umum_2);
        this.tvtekanan_darah_2 = (TextView) findViewById(R.id.tv_tekanan_darah_2);
        this.tvpendarahan_pervaginam_2 = (TextView) findViewById(R.id.tv_pendarahan_pervaginam_2);
        this.tvkondisi_perineum_2 = (TextView) findViewById(R.id.tvkondisi_perineum_2);
        this.tvtanda_infeksi_2 = (TextView) findViewById(R.id.tvtanda_infeksi_2);
        this.tvkontraksi_uteri_2 = (TextView) findViewById(R.id.tvkontraksi_uteri_2);
        this.tvtinggi_fundus_uteri_2 = (TextView) findViewById(R.id.tvtinggi_fundus_uteri_2);
        this.tvlokhia_2 = (TextView) findViewById(R.id.tvlokhia_2);
        this.tvpemeriksaan_jalan_lahir_2 = (TextView) findViewById(R.id.tvpemeriksaan_jalan_lahir_2);
        this.tvpemeriksaan_payudara_2 = (TextView) findViewById(R.id.tvpemeriksaan_payudara_2);
        this.tvproduksi_asi_2 = (TextView) findViewById(R.id.tvproduksi_asi_2);
        this.tvpemberian_kapsul_vitamin_a_2 = (TextView) findViewById(R.id.tvpemberian_kapsul_vitamin_a_2);
        this.tvpelayanan_kontrasepsi_2 = (TextView) findViewById(R.id.tvpelayanan_kontrasepsi_2);
        this.tvpenanganan_resiko_tinggi_2 = (TextView) findViewById(R.id.tvpenanganan_resiko_tinggi_2);
        this.tvbuang_air_besar_2 = (TextView) findViewById(R.id.tvbuang_air_besar_2);
        this.tvbuang_air_kecil_2 = (TextView) findViewById(R.id.tvbuang_air_kecil_2);
        this.tvcatatan_dokter_2 = (TextView) findViewById(R.id.tvcatatan_dokter_2);
        this.tvtanggal_kunjungan_3 = (TextView) findViewById(R.id.tvtanggal_kunjungan_3);
        this.tvkondisi_ibu_secara_umum_3 = (TextView) findViewById(R.id.tvkondisi_ibu_secara_umum_3);
        this.tvtekanan_darah_3 = (TextView) findViewById(R.id.tv_tekanan_darah_3);
        this.tvpendarahan_pervaginam_3 = (TextView) findViewById(R.id.tv_pendarahan_pervaginam_3);
        this.tvkondisi_perineum_3 = (TextView) findViewById(R.id.tvkondisi_perineum_3);
        this.tvtanda_infeksi_3 = (TextView) findViewById(R.id.tvtanda_infeksi_3);
        this.tvkontraksi_uteri_3 = (TextView) findViewById(R.id.tvkontraksi_uteri_3);
        this.tvtinggi_fundus_uteri_3 = (TextView) findViewById(R.id.tvtinggi_fundus_uteri_3);
        this.tvlokhia_3 = (TextView) findViewById(R.id.tvlokhia_3);
        this.tvpemeriksaan_jalan_lahir_3 = (TextView) findViewById(R.id.tvpemeriksaan_jalan_lahir_3);
        this.tvpemeriksaan_payudara_3 = (TextView) findViewById(R.id.tvpemeriksaan_payudara_3);
        this.tvproduksi_asi_3 = (TextView) findViewById(R.id.tvproduksi_asi_3);
        this.tvpemberian_kapsul_vitamin_a_3 = (TextView) findViewById(R.id.tvpemberian_kapsul_vitamin_a_3);
        this.tvpelayanan_kontrasepsi_3 = (TextView) findViewById(R.id.tvpelayanan_kontrasepsi_3);
        this.tvpenanganan_resiko_tinggi_3 = (TextView) findViewById(R.id.tvpenanganan_resiko_tinggi_3);
        this.tvbuang_air_besar_3 = (TextView) findViewById(R.id.tvbuang_air_besar_3);
        this.tvbuang_air_kecil_3 = (TextView) findViewById(R.id.tvbuang_air_kecil_3);
        this.tvcatatan_dokter_3 = (TextView) findViewById(R.id.tvcatatan_dokter_3);
        this.tvkeadaan_ibu = (TextView) findViewById(R.id.tvkeadaan_ibu);
        this.tvkomplikasi_nifas = (TextView) findViewById(R.id.tvkomplikasi_nifas);
        this.tvkeadaan_bayi = (TextView) findViewById(R.id.tvkeadaan_bayi);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.spinner.setSelection(2, true);
        list_nifas_ke();
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Data_kesehatan_ibunifas.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Data_kesehatan_ibunifas.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Data_kesehatan_ibunifas.this.startActivity(intent);
                        Data_kesehatan_ibunifas.this.finish();
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
                Data_kesehatan_ibunifas.this.finish();
            }
        });
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();

                switch (selectedItem){
                    case "Kesehatan Ibu Hamil":
                        startActivity(new Intent(getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class));
                        finish();
                        break;
                    case "Kesehatan Ibu Bersalin":
                        startActivity(new Intent(getApplicationContext(), Detail_kesehatan_ibu_bersalin.class));
                        finish();
                        break;
                    case "Kesehatan Ibu Nifas":
                        startActivity(new Intent(getApplicationContext(), Data_kesehatan_ibunifas.class));
                        finish();
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnernifas_ke.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Data_kesehatan_ibunifas.nifas_ke = Data_kesehatan_ibunifas.this.spinnernifas_ke.getSelectedItem().toString();
                Data_kesehatan_ibunifas.nomor = Integer.valueOf(i + 1);
                Data_kesehatan_ibunifas.this.tampildatanifas();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        this.list_nifaske.clear();
        list_nifas_ke();
    }

    /* access modifiers changed from: package-private */
    public void tampildatanifas() {
        Volley.newRequestQueue(getApplicationContext()).add(new StringRequest(0, new Configurasi().baseUrl() + "api/tampildatanifas/" + HalamanLogin.nik_ibu + "/" + nifas_ke +"/semua", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("tampildatanifas");
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_kesehatan_ibunifas.id = getData.getString("id");
                        Data_kesehatan_ibunifas.nama_anak = getData.getString("nama_anak");
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
                        JSONObject jSONObject = getData;
                        Data_kesehatan_ibunifas.this.tvnama_anak.setText(Data_kesehatan_ibunifas.nama_anak);
                        Data_kesehatan_ibunifas.this.tvtanggal_kunjungan_1.setText(tanggal_kunjungan_1);
                        Data_kesehatan_ibunifas.this.tvkondisi_ibu_secara_umum_1.setText(kondisi_ibu_secara_umum_1);
                        Data_kesehatan_ibunifas.this.tvtekanan_darah_1.setText(tekanan_darah_1);
                        Data_kesehatan_ibunifas.this.tvpendarahan_pervaginam_1.setText(pendarahan_pervaginam_1);
                        Data_kesehatan_ibunifas.this.tvkondisi_perineum_1.setText(kondisi_perineum_1);
                        Data_kesehatan_ibunifas.this.tvtanda_infeksi_1.setText(tanda_infeksi_1);
                        Data_kesehatan_ibunifas.this.tvkontraksi_uteri_1.setText(kontraksi_uteri_1);
                        Data_kesehatan_ibunifas.this.tvtinggi_fundus_uteri_1.setText(tinggi_fundus_uteri_1);
                        Data_kesehatan_ibunifas.this.tvlokhia_1.setText(lokhia_1);
                        Data_kesehatan_ibunifas.this.tvpemeriksaan_jalan_lahir_1.setText(pemeriksaan_jalan_lahir_1);
                        Data_kesehatan_ibunifas.this.tvpemeriksaan_payudara_1.setText(pemeriksaan_payudara_1);
                        Data_kesehatan_ibunifas.this.tvproduksi_asi_1.setText(produksi_asi_1);
                        Data_kesehatan_ibunifas.this.tvpemberian_kapsul_vitamin_a_1.setText(pemberian_kapsul_vitamin_a_1);
                        String pelayanan_kontrasepsi_12 = pelayanan_kontrasepsi_1;
                        Data_kesehatan_ibunifas.this.tvpelayanan_kontrasepsi_1.setText(pelayanan_kontrasepsi_12);
                        String pelayanan_kontrasepsi_13 = pelayanan_kontrasepsi_12;
                        String penanganan_resiko_tinggi_12 = penanganan_resiko_tinggi_1;
                        Data_kesehatan_ibunifas.this.tvpenanganan_resiko_tinggi_1.setText(penanganan_resiko_tinggi_12);
                        String penanganan_resiko_tinggi_13 = penanganan_resiko_tinggi_12;
                        String buang_air_besar_12 = buang_air_besar_1;
                        Data_kesehatan_ibunifas.this.tvbuang_air_besar_1.setText(buang_air_besar_12);
                        String buang_air_besar_13 = buang_air_besar_12;
                        String buang_air_kecil_12 = buang_air_kecil_1;
                        Data_kesehatan_ibunifas.this.tvbuang_air_kecil_1.setText(buang_air_kecil_12);
                        String buang_air_kecil_13 = buang_air_kecil_12;
                        String buang_air_kecil_14 = catatan_dokter_1;
                        Data_kesehatan_ibunifas.this.tvcatatan_dokter_1.setText(buang_air_kecil_14);
                        String catatan_dokter_12 = buang_air_kecil_14;
                        String tanggal_kunjungan_22 = tanggal_kunjungan_2;
                        Data_kesehatan_ibunifas.this.tvtanggal_kunjungan_2.setText(tanggal_kunjungan_22);
                        String tanggal_kunjungan_23 = tanggal_kunjungan_22;
                        String kondisi_ibu_secara_umum_22 = kondisi_ibu_secara_umum_2;
                        Data_kesehatan_ibunifas.this.tvkondisi_ibu_secara_umum_2.setText(kondisi_ibu_secara_umum_22);
                        String kondisi_ibu_secara_umum_23 = kondisi_ibu_secara_umum_22;
                        String tekanan_darah_22 = tekanan_darah_2;
                        Data_kesehatan_ibunifas.this.tvtekanan_darah_2.setText(tekanan_darah_22);
                        String tekanan_darah_23 = tekanan_darah_22;
                        String tekanan_darah_24 = pendarahan_pervaginam_2;
                        Data_kesehatan_ibunifas.this.tvpendarahan_pervaginam_2.setText(tekanan_darah_24);
                        String pendarahan_pervaginam_22 = tekanan_darah_24;
                        String kondisi_perineum_22 = kondisi_perineum_2;
                        Data_kesehatan_ibunifas.this.tvkondisi_perineum_2.setText(kondisi_perineum_22);
                        String kondisi_perineum_23 = kondisi_perineum_22;
                        String kondisi_perineum_24 = tanda_infeksi_2;
                        Data_kesehatan_ibunifas.this.tvtanda_infeksi_2.setText(kondisi_perineum_24);
                        String tanda_infeksi_22 = kondisi_perineum_24;
                        String tanda_infeksi_23 = kontraksi_uteri_2;
                        Data_kesehatan_ibunifas.this.tvkontraksi_uteri_2.setText(tanda_infeksi_23);
                        String kontraksi_uteri_22 = tanda_infeksi_23;
                        String tinggi_fundus_uteri_22 = tinggi_fundus_uteri_2;
                        Data_kesehatan_ibunifas.this.tvtinggi_fundus_uteri_2.setText(tinggi_fundus_uteri_22);
                        String tinggi_fundus_uteri_23 = tinggi_fundus_uteri_22;
                        String lokhia_22 = lokhia_2;
                        Data_kesehatan_ibunifas.this.tvlokhia_2.setText(lokhia_22);
                        String lokhia_23 = lokhia_22;
                        String pemeriksaan_jalan_lahir_22 = pemeriksaan_jalan_lahir_2;
                        Data_kesehatan_ibunifas.this.tvpemeriksaan_jalan_lahir_2.setText(pemeriksaan_jalan_lahir_22);
                        String pemeriksaan_jalan_lahir_23 = pemeriksaan_jalan_lahir_22;
                        String pemeriksaan_jalan_lahir_24 = pemeriksaan_payudara_2;
                        Data_kesehatan_ibunifas.this.tvpemeriksaan_payudara_2.setText(pemeriksaan_jalan_lahir_24);
                        String pemeriksaan_payudara_22 = pemeriksaan_jalan_lahir_24;
                        String produksi_asi_22 = produksi_asi_2;
                        Data_kesehatan_ibunifas.this.tvproduksi_asi_2.setText(produksi_asi_22);
                        String produksi_asi_23 = produksi_asi_22;
                        String pemberian_kapsul_vitamin_a_22 = pemberian_kapsul_vitamin_a_2;
                        Data_kesehatan_ibunifas.this.tvpemberian_kapsul_vitamin_a_2.setText(pemberian_kapsul_vitamin_a_22);
                        String pemberian_kapsul_vitamin_a_23 = pemberian_kapsul_vitamin_a_22;
                        String pelayanan_kontrasepsi_22 = pelayanan_kontrasepsi_2;
                        Data_kesehatan_ibunifas.this.tvpelayanan_kontrasepsi_2.setText(pelayanan_kontrasepsi_22);
                        String pelayanan_kontrasepsi_23 = pelayanan_kontrasepsi_22;
                        String penanganan_resiko_tinggi_22 = penanganan_resiko_tinggi_2;
                        Data_kesehatan_ibunifas.this.tvpenanganan_resiko_tinggi_2.setText(penanganan_resiko_tinggi_22);
                        String penanganan_resiko_tinggi_23 = penanganan_resiko_tinggi_22;
                        String buang_air_besar_22 = buang_air_besar_2;
                        Data_kesehatan_ibunifas.this.tvbuang_air_besar_2.setText(buang_air_besar_22);
                        String buang_air_besar_23 = buang_air_besar_22;
                        String buang_air_besar_24 = buang_air_kecil_2;
                        Data_kesehatan_ibunifas.this.tvbuang_air_kecil_2.setText(buang_air_besar_24);
                        String buang_air_kecil_22 = buang_air_besar_24;
                        String catatan_dokter_22 = catatan_dokter_2;
                        Data_kesehatan_ibunifas.this.tvcatatan_dokter_2.setText(catatan_dokter_22);
                        String catatan_dokter_23 = catatan_dokter_22;
                        String tanggal_kunjungan_32 = tanggal_kunjungan_3;
                        Data_kesehatan_ibunifas.this.tvtanggal_kunjungan_3.setText(tanggal_kunjungan_32);
                        String tanggal_kunjungan_33 = tanggal_kunjungan_32;
                        String kondisi_ibu_secara_umum_32 = kondisi_ibu_secara_umum_3;
                        Data_kesehatan_ibunifas.this.tvkondisi_ibu_secara_umum_3.setText(kondisi_ibu_secara_umum_32);
                        String kondisi_ibu_secara_umum_33 = kondisi_ibu_secara_umum_32;
                        String tekanan_darah_32 = tekanan_darah_3;
                        Data_kesehatan_ibunifas.this.tvtekanan_darah_3.setText(tekanan_darah_32);
                        String tekanan_darah_33 = tekanan_darah_32;
                        String tekanan_darah_34 = pendarahan_pervaginam_3;
                        Data_kesehatan_ibunifas.this.tvpendarahan_pervaginam_3.setText(tekanan_darah_34);
                        String pendarahan_pervaginam_32 = tekanan_darah_34;
                        String kondisi_perineum_32 = kondisi_perineum_3;
                        Data_kesehatan_ibunifas.this.tvkondisi_perineum_3.setText(kondisi_perineum_32);
                        String kondisi_perineum_33 = kondisi_perineum_32;
                        String kondisi_perineum_34 = tanda_infeksi_3;
                        Data_kesehatan_ibunifas.this.tvtanda_infeksi_3.setText(kondisi_perineum_34);
                        String tanda_infeksi_32 = kondisi_perineum_34;
                        String kontraksi_uteri_32 = kontraksi_uteri_3;
                        Data_kesehatan_ibunifas.this.tvkontraksi_uteri_3.setText(kontraksi_uteri_32);
                        String kontraksi_uteri_33 = kontraksi_uteri_32;
                        String tinggi_fundus_uteri_32 = tinggi_fundus_uteri_3;
                        Data_kesehatan_ibunifas.this.tvtinggi_fundus_uteri_3.setText(tinggi_fundus_uteri_32);
                        String tinggi_fundus_uteri_33 = tinggi_fundus_uteri_32;
                        String tinggi_fundus_uteri_34 = lokhia_3;
                        Data_kesehatan_ibunifas.this.tvlokhia_3.setText(tinggi_fundus_uteri_34);
                        String lokhia_32 = tinggi_fundus_uteri_34;
                        String pemeriksaan_jalan_lahir_32 = pemeriksaan_jalan_lahir_3;
                        Data_kesehatan_ibunifas.this.tvpemeriksaan_jalan_lahir_3.setText(pemeriksaan_jalan_lahir_32);
                        String pemeriksaan_jalan_lahir_33 = pemeriksaan_jalan_lahir_32;
                        String pemeriksaan_payudara_32 = pemeriksaan_payudara_3;
                        Data_kesehatan_ibunifas.this.tvpemeriksaan_payudara_3.setText(pemeriksaan_payudara_32);
                        String pemeriksaan_payudara_33 = pemeriksaan_payudara_32;
                        String pemeriksaan_payudara_34 = produksi_asi_3;
                        Data_kesehatan_ibunifas.this.tvproduksi_asi_3.setText(pemeriksaan_payudara_34);
                        String produksi_asi_32 = pemeriksaan_payudara_34;
                        String pemberian_kapsul_vitamin_a_32 = pemberian_kapsul_vitamin_a_3;
                        Data_kesehatan_ibunifas.this.tvpemberian_kapsul_vitamin_a_3.setText(pemberian_kapsul_vitamin_a_32);
                        String pemberian_kapsul_vitamin_a_33 = pemberian_kapsul_vitamin_a_32;
                        String pelayanan_kontrasepsi_32 = pelayanan_kontrasepsi_3;
                        Data_kesehatan_ibunifas.this.tvpelayanan_kontrasepsi_3.setText(pelayanan_kontrasepsi_32);
                        String pelayanan_kontrasepsi_33 = pelayanan_kontrasepsi_32;
                        String pelayanan_kontrasepsi_34 = penanganan_resiko_tinggi_3;
                        Data_kesehatan_ibunifas.this.tvpenanganan_resiko_tinggi_3.setText(pelayanan_kontrasepsi_34);
                        String penanganan_resiko_tinggi_32 = pelayanan_kontrasepsi_34;
                        String buang_air_besar_32 = buang_air_besar_3;
                        Data_kesehatan_ibunifas.this.tvbuang_air_besar_3.setText(buang_air_besar_32);
                        String buang_air_besar_33 = buang_air_besar_32;
                        String buang_air_kecil_32 = buang_air_kecil_3;
                        Data_kesehatan_ibunifas.this.tvbuang_air_kecil_3.setText(buang_air_kecil_32);
                        String buang_air_kecil_33 = buang_air_kecil_32;
                        String catatan_dokter_32 = catatan_dokter_3;
                        Data_kesehatan_ibunifas.this.tvcatatan_dokter_3.setText(catatan_dokter_32);
                        String catatan_dokter_33 = catatan_dokter_32;
                        String keadaan_ibu2 = keadaan_ibu;
                        Data_kesehatan_ibunifas.this.tvkeadaan_ibu.setText(keadaan_ibu2);
                        String str = keadaan_ibu2;
                        String komplikasi_nifas2 = komplikasi_nifas;
                        Data_kesehatan_ibunifas.this.tvkomplikasi_nifas.setText(komplikasi_nifas2);
                        String str2 = komplikasi_nifas2;
                        String keadaan_bayi = getData.getString("keadaan_bayi");
                        Data_kesehatan_ibunifas.this.tvkeadaan_bayi.setText(keadaan_bayi);
                        String str3 = keadaan_bayi;
                        if (tanggal_kunjungan_1 == "null") {
                            String str4 = tanggal_kunjungan_1;
                            Data_kesehatan_ibunifas.this.tvtanggal_kunjungan_1.setText("-");
                        }
                        if (kondisi_ibu_secara_umum_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvkondisi_ibu_secara_umum_1.setText("-");
                        }
                        if (tekanan_darah_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvtekanan_darah_1.setText("-");
                        }
                        if (pendarahan_pervaginam_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvpendarahan_pervaginam_1.setText("-");
                        }
                        if (kondisi_perineum_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvkondisi_perineum_1.setText("-");
                        }
                        if (tanda_infeksi_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvtanda_infeksi_1.setText("-");
                        }
                        if (kontraksi_uteri_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvkontraksi_uteri_1.setText("-");
                        }
                        if (tinggi_fundus_uteri_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvtinggi_fundus_uteri_1.setText("-");
                        }
                        if (lokhia_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvlokhia_1.setText("-");
                        }
                        if (pemeriksaan_jalan_lahir_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvpemeriksaan_jalan_lahir_1.setText("-");
                        }
                        if (pemeriksaan_payudara_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvpemeriksaan_payudara_1.setText("-");
                        }
                        if (produksi_asi_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvproduksi_asi_1.setText("-");
                        }
                        if (pemberian_kapsul_vitamin_a_1 == "null") {
                            Data_kesehatan_ibunifas.this.tvpemberian_kapsul_vitamin_a_1.setText("-");
                        }
                        if (pelayanan_kontrasepsi_13 == "null") {
                            String str5 = pemeriksaan_payudara_1;
                            Data_kesehatan_ibunifas.this.tvpelayanan_kontrasepsi_1.setText("-");
                        }
                        String penanganan_resiko_tinggi_14 = penanganan_resiko_tinggi_13;
                        if (penanganan_resiko_tinggi_14 == "null") {
                            String str6 = penanganan_resiko_tinggi_14;
                            Data_kesehatan_ibunifas.this.tvpenanganan_resiko_tinggi_1.setText("-");
                        }
                        String buang_air_besar_14 = buang_air_besar_13;
                        if (buang_air_besar_14 == "null") {
                            String str7 = buang_air_besar_14;
                            Data_kesehatan_ibunifas.this.tvbuang_air_besar_1.setText("-");
                        }
                        String buang_air_kecil_15 = buang_air_kecil_13;
                        if (buang_air_kecil_15 == "null") {
                            String str8 = buang_air_kecil_15;
                            Data_kesehatan_ibunifas.this.tvbuang_air_kecil_1.setText("-");
                        }
                        String buang_air_kecil_16 = catatan_dokter_12;
                        if (buang_air_kecil_16 == "null") {
                            String str9 = buang_air_kecil_16;
                            Data_kesehatan_ibunifas.this.tvcatatan_dokter_1.setText("-");
                        } else {
                            String catatan_dokter_13 = buang_air_kecil_16;
                        }
                        String tanggal_kunjungan_24 = tanggal_kunjungan_23;
                        if (tanggal_kunjungan_24 == "null") {
                            String str10 = tanggal_kunjungan_24;
                            Data_kesehatan_ibunifas.this.tvtanggal_kunjungan_2.setText("-");
                        }
                        String kondisi_ibu_secara_umum_24 = kondisi_ibu_secara_umum_23;
                        if (kondisi_ibu_secara_umum_24 == "null") {
                            String str11 = kondisi_ibu_secara_umum_24;
                            Data_kesehatan_ibunifas.this.tvkondisi_ibu_secara_umum_2.setText("-");
                        }
                        String tekanan_darah_25 = tekanan_darah_23;
                        if (tekanan_darah_25 == "null") {
                            String str12 = tekanan_darah_25;
                            Data_kesehatan_ibunifas.this.tvtekanan_darah_2.setText("-");
                        }
                        String tekanan_darah_26 = pendarahan_pervaginam_22;
                        if (tekanan_darah_26 == "null") {
                            String str13 = tekanan_darah_26;
                            Data_kesehatan_ibunifas.this.tvpendarahan_pervaginam_2.setText("-");
                        } else {
                            String pendarahan_pervaginam_23 = tekanan_darah_26;
                        }
                        String kondisi_perineum_25 = kondisi_perineum_23;
                        if (kondisi_perineum_25 == "null") {
                            String str14 = kondisi_perineum_25;
                            Data_kesehatan_ibunifas.this.tvkondisi_perineum_2.setText("-");
                        }
                        String kondisi_perineum_26 = tanda_infeksi_22;
                        if (kondisi_perineum_26 == "null") {
                            String str15 = kondisi_perineum_26;
                            Data_kesehatan_ibunifas.this.tvtanda_infeksi_2.setText("-");
                        } else {
                            String tanda_infeksi_24 = kondisi_perineum_26;
                        }
                        String tanda_infeksi_25 = kontraksi_uteri_22;
                        if (tanda_infeksi_25 == "null") {
                            String str16 = tanda_infeksi_25;
                            Data_kesehatan_ibunifas.this.tvkontraksi_uteri_2.setText("-");
                        } else {
                            String kontraksi_uteri_23 = tanda_infeksi_25;
                        }
                        String tinggi_fundus_uteri_24 = tinggi_fundus_uteri_23;
                        if (tinggi_fundus_uteri_24 == "null") {
                            String str17 = tinggi_fundus_uteri_24;
                            Data_kesehatan_ibunifas.this.tvtinggi_fundus_uteri_2.setText("-");
                        }
                        String lokhia_24 = lokhia_23;
                        if (lokhia_24 == "null") {
                            String str18 = lokhia_24;
                            Data_kesehatan_ibunifas.this.tvlokhia_2.setText("-");
                        }
                        String pemeriksaan_jalan_lahir_25 = pemeriksaan_jalan_lahir_23;
                        if (pemeriksaan_jalan_lahir_25 == "null") {
                            String str19 = pemeriksaan_jalan_lahir_25;
                            Data_kesehatan_ibunifas.this.tvpemeriksaan_jalan_lahir_2.setText("-");
                        }
                        String pemeriksaan_jalan_lahir_26 = pemeriksaan_payudara_22;
                        if (pemeriksaan_jalan_lahir_26 == "null") {
                            String str20 = pemeriksaan_jalan_lahir_26;
                            Data_kesehatan_ibunifas.this.tvpemeriksaan_payudara_2.setText("-");
                        } else {
                            String pemeriksaan_payudara_23 = pemeriksaan_jalan_lahir_26;
                        }
                        String produksi_asi_24 = produksi_asi_23;
                        if (produksi_asi_24 == "null") {
                            String str21 = produksi_asi_24;
                            Data_kesehatan_ibunifas.this.tvproduksi_asi_2.setText("-");
                        }
                        String pemberian_kapsul_vitamin_a_24 = pemberian_kapsul_vitamin_a_23;
                        if (pemberian_kapsul_vitamin_a_24 == "null") {
                            String str22 = pemberian_kapsul_vitamin_a_24;
                            Data_kesehatan_ibunifas.this.tvpemberian_kapsul_vitamin_a_2.setText("-");
                        }
                        String pelayanan_kontrasepsi_24 = pelayanan_kontrasepsi_23;
                        if (pelayanan_kontrasepsi_24 == "null") {
                            String str23 = pelayanan_kontrasepsi_24;
                            Data_kesehatan_ibunifas.this.tvpelayanan_kontrasepsi_2.setText("-");
                        }
                        String penanganan_resiko_tinggi_24 = penanganan_resiko_tinggi_23;
                        if (penanganan_resiko_tinggi_24 == "null") {
                            String str24 = penanganan_resiko_tinggi_24;
                            Data_kesehatan_ibunifas.this.tvpenanganan_resiko_tinggi_2.setText("-");
                        }
                        String buang_air_besar_25 = buang_air_besar_23;
                        if (buang_air_besar_25 == "null") {
                            String str25 = buang_air_besar_25;
                            Data_kesehatan_ibunifas.this.tvbuang_air_besar_2.setText("-");
                        }
                        String buang_air_besar_26 = buang_air_kecil_22;
                        if (buang_air_besar_26 == "null") {
                            String str26 = buang_air_besar_26;
                            Data_kesehatan_ibunifas.this.tvbuang_air_kecil_2.setText("-");
                        } else {
                            String buang_air_kecil_23 = buang_air_besar_26;
                        }
                        String catatan_dokter_24 = catatan_dokter_23;
                        if (catatan_dokter_24 == "null") {
                            String str27 = catatan_dokter_24;
                            Data_kesehatan_ibunifas.this.tvcatatan_dokter_2.setText("-");
                        }
                        String tanggal_kunjungan_34 = tanggal_kunjungan_33;
                        if (tanggal_kunjungan_34 == "null") {
                            String str28 = tanggal_kunjungan_34;
                            Data_kesehatan_ibunifas.this.tvtanggal_kunjungan_3.setText("-");
                        }
                        String kondisi_ibu_secara_umum_34 = kondisi_ibu_secara_umum_33;
                        if (kondisi_ibu_secara_umum_34 == "null") {
                            String str29 = kondisi_ibu_secara_umum_34;
                            Data_kesehatan_ibunifas.this.tvkondisi_ibu_secara_umum_3.setText("-");
                        }
                        String tekanan_darah_35 = tekanan_darah_33;
                        if (tekanan_darah_35 == "null") {
                            String str30 = tekanan_darah_35;
                            Data_kesehatan_ibunifas.this.tvtekanan_darah_3.setText("-");
                        }
                        String tekanan_darah_36 = pendarahan_pervaginam_32;
                        if (tekanan_darah_36 == "null") {
                            String str31 = tekanan_darah_36;
                            Data_kesehatan_ibunifas.this.tvpendarahan_pervaginam_3.setText("-");
                        } else {
                            String pendarahan_pervaginam_33 = tekanan_darah_36;
                        }
                        String kondisi_perineum_35 = kondisi_perineum_33;
                        if (kondisi_perineum_35 == "null") {
                            String str32 = kondisi_perineum_35;
                            Data_kesehatan_ibunifas.this.tvkondisi_perineum_3.setText("-");
                        }
                        String kondisi_perineum_36 = tanda_infeksi_32;
                        if (kondisi_perineum_36 == "null") {
                            String str33 = kondisi_perineum_36;
                            Data_kesehatan_ibunifas.this.tvtanda_infeksi_3.setText("-");
                        } else {
                            String tanda_infeksi_33 = kondisi_perineum_36;
                        }
                        String kontraksi_uteri_34 = kontraksi_uteri_33;
                        if (kontraksi_uteri_34 == "null") {
                            String str34 = kontraksi_uteri_34;
                            Data_kesehatan_ibunifas.this.tvkontraksi_uteri_3.setText("-");
                        }
                        String tinggi_fundus_uteri_35 = tinggi_fundus_uteri_33;
                        if (tinggi_fundus_uteri_35 == "null") {
                            String str35 = tinggi_fundus_uteri_35;
                            Data_kesehatan_ibunifas.this.tvtinggi_fundus_uteri_3.setText("-");
                        }
                        String tinggi_fundus_uteri_36 = lokhia_32;
                        if (tinggi_fundus_uteri_36 == "null") {
                            String str36 = tinggi_fundus_uteri_36;
                            Data_kesehatan_ibunifas.this.tvlokhia_3.setText("-");
                        } else {
                            String lokhia_33 = tinggi_fundus_uteri_36;
                        }
                        String pemeriksaan_jalan_lahir_34 = pemeriksaan_jalan_lahir_33;
                        if (pemeriksaan_jalan_lahir_34 == "null") {
                            String str37 = pemeriksaan_jalan_lahir_34;
                            Data_kesehatan_ibunifas.this.tvpemeriksaan_jalan_lahir_3.setText("-");
                        }
                        String pemeriksaan_payudara_35 = pemeriksaan_payudara_33;
                        if (pemeriksaan_payudara_35 == "null") {
                            String str38 = pemeriksaan_payudara_35;
                            Data_kesehatan_ibunifas.this.tvpemeriksaan_payudara_3.setText("-");
                        }
                        String pemeriksaan_payudara_36 = produksi_asi_32;
                        if (pemeriksaan_payudara_36 == "null") {
                            String str39 = pemeriksaan_payudara_36;
                            Data_kesehatan_ibunifas.this.tvproduksi_asi_3.setText("-");
                        } else {
                            String produksi_asi_33 = pemeriksaan_payudara_36;
                        }
                        String pemberian_kapsul_vitamin_a_34 = pemberian_kapsul_vitamin_a_33;
                        if (pemberian_kapsul_vitamin_a_34 == "null") {
                            String str40 = pemberian_kapsul_vitamin_a_34;
                            Data_kesehatan_ibunifas.this.tvpemberian_kapsul_vitamin_a_3.setText("-");
                        }
                        String pelayanan_kontrasepsi_35 = pelayanan_kontrasepsi_33;
                        if (pelayanan_kontrasepsi_35 == "null") {
                            String str41 = pelayanan_kontrasepsi_35;
                            Data_kesehatan_ibunifas.this.tvpelayanan_kontrasepsi_3.setText("-");
                        }
                        String pelayanan_kontrasepsi_36 = penanganan_resiko_tinggi_32;
                        if (pelayanan_kontrasepsi_36 == "null") {
                            String str42 = pelayanan_kontrasepsi_36;
                            Data_kesehatan_ibunifas.this.tvpenanganan_resiko_tinggi_3.setText("-");
                        } else {
                            String penanganan_resiko_tinggi_33 = pelayanan_kontrasepsi_36;
                        }
                        String buang_air_besar_34 = buang_air_besar_33;
                        if (buang_air_besar_34 == "null") {
                            String str43 = buang_air_besar_34;
                            Data_kesehatan_ibunifas.this.tvbuang_air_besar_3.setText("-");
                        }
                        String buang_air_kecil_34 = buang_air_kecil_33;
                        if (buang_air_kecil_34 == "null") {
                            String str44 = buang_air_kecil_34;
                            Data_kesehatan_ibunifas.this.tvbuang_air_kecil_3.setText("-");
                        }
                        if (catatan_dokter_33 == "null") {
                            Data_kesehatan_ibunifas.this.tvcatatan_dokter_3.setText("-");
                        }
                        if (keadaan_ibu.equals("-Pilih-") || keadaan_ibu == "null") {
                            Data_kesehatan_ibunifas.this.tvkeadaan_ibu.setText("-");
                        }else{
                            Data_kesehatan_ibunifas.this.tvkeadaan_ibu.setText(keadaan_ibu);
                        }

                        if (komplikasi_nifas.equals("-Pilih-") || komplikasi_nifas == "null") {
                            Data_kesehatan_ibunifas.this.tvkomplikasi_nifas.setText("-");
                        }else{
                            Data_kesehatan_ibunifas.this.tvkomplikasi_nifas.setText(komplikasi_nifas);
                        }

                        if (keadaan_bayi.equals("-Pilih-") || keadaan_bayi == "null" ) {
                            Data_kesehatan_ibunifas.this.tvkeadaan_bayi.setText("-");
                        }else{
                            Data_kesehatan_ibunifas.this.tvkeadaan_bayi.setText(keadaan_bayi);
                        }
                        i = i2 + 1;
                        String str45 = response;
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

    /* access modifiers changed from: package-private */
    public void list_nifas_ke() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/tambahkesehatanibunifas/" + HalamanLogin.nik_ibu, new Response.Listener<String>() {
            @SuppressLint("ResourceType")
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("kesehatanibunifas1");
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        Data_kesehatan_ibunifas.this.list_nifaske.add(jsonArray.getJSONObject(i).getString("nifas_ke"));
                        Data_kesehatan_ibunifas data_kesehatan_ibunifas = Data_kesehatan_ibunifas.this;
                        Data_kesehatan_ibunifas data_kesehatan_ibunifas2 = Data_kesehatan_ibunifas.this;
                        data_kesehatan_ibunifas.nifaske_adapter = new ArrayAdapter<>(data_kesehatan_ibunifas2, 17367048, data_kesehatan_ibunifas2.list_nifaske);
                        Data_kesehatan_ibunifas.this.nifaske_adapter.setDropDownViewResource(17367049);
                        Data_kesehatan_ibunifas.this.spinnernifas_ke.setAdapter(Data_kesehatan_ibunifas.this.nifaske_adapter);
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
}
