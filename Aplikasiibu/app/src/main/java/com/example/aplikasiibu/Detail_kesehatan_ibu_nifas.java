package com.example.aplikasiibu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDetailDataKesehatanIbuNifas.AdaptorDetailDataKesehatanIbuNifas;
import com.example.aplikasiibu.AdapterDetailDataKesehatanIbuNifas.GetDetailDataKesehatanIbuNifas;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Detail_kesehatan_ibu_nifas extends AppCompatActivity {
    AdaptorDetailDataKesehatanIbuNifas adaptor;
    ListView listView;
    ArrayList<GetDetailDataKesehatanIbuNifas> model;
    TextView nama_ibu;
    TextView nik_ibu;
    ImageView tombol_kembali;
    TextView txttambahdata1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_kesehatan_ibu_nifas);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibu);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.txttambahdata1 = (TextView) findViewById(R.id.txttambahdata1);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));
//        this.txttambahdata1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent intent = new Intent(Detail_kesehatan_ibu_nifas.this.getApplicationContext(), Tambah_catatan_kesehatan_ibu_nifas.class);
//                intent.putExtra("nik_ibu", Detail_kesehatan_ibu_nifas.this.getIntent().getStringExtra("nik_ibu"));
//                Detail_kesehatan_ibu_nifas.this.startActivity(intent);
//            }
//        });
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Detail_kesehatan_ibu_nifas.this.finish();
            }
        });
        if (getIntent().hasExtra("detail_data_kesehatan_ibunifas")) {
            load_data2();
        }
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Detail_kesehatan_ibu_nifas.this.getApplicationContext(), Catatan_kesehatan_ibu_nifas.class);
                intent.putExtra("catatan_data_kesehatan_ibunifas", Detail_kesehatan_ibu_nifas.this.model.get(i).getId());
                intent.putExtra("nama_ibu", Detail_kesehatan_ibu_nifas.this.getIntent().getStringExtra("nama_ibu"));
                intent.putExtra("nama_anak", Detail_kesehatan_ibu_nifas.this.model.get(i).getNama_anak());
                intent.putExtra("nik_ibu", Detail_kesehatan_ibu_nifas.this.model.get(i).getNik_ibu());
                intent.putExtra("nifas_ke", Detail_kesehatan_ibu_nifas.this.model.get(i).getNifas_ke());
                intent.putExtra("tanggal_kunjungan_1", Detail_kesehatan_ibu_nifas.this.model.get(i).getTanggal_kunjungan_1());
                intent.putExtra("tanggal_kunjungan_2", Detail_kesehatan_ibu_nifas.this.model.get(i).getTanggal_kunjungan_2());
                intent.putExtra("tanggal_kunjungan_3", Detail_kesehatan_ibu_nifas.this.model.get(i).getTanggal_kunjungan_3());
                intent.putExtra("kondisi_ibu_secara_umum_1", Detail_kesehatan_ibu_nifas.this.model.get(i).getKondisi_ibu_secara_umum_1());
                intent.putExtra("kondisi_ibu_secara_umum_2", Detail_kesehatan_ibu_nifas.this.model.get(i).getKondisi_ibu_secara_umum_2());
                intent.putExtra("kondisi_ibu_secara_umum_3", Detail_kesehatan_ibu_nifas.this.model.get(i).getKondisi_ibu_secara_umum_3());
                intent.putExtra("tekanan_darah_1", Detail_kesehatan_ibu_nifas.this.model.get(i).getTekanan_darah_1());
                intent.putExtra("tekanan_darah_2", Detail_kesehatan_ibu_nifas.this.model.get(i).getTekanan_darah_2());
                intent.putExtra("tekanan_darah_3", Detail_kesehatan_ibu_nifas.this.model.get(i).getTekanan_darah_3());
                intent.putExtra("kondisi_perineum_1", Detail_kesehatan_ibu_nifas.this.model.get(i).getKondisi_perineum_1());
                intent.putExtra("kondisi_perineum_2", Detail_kesehatan_ibu_nifas.this.model.get(i).getKondisi_perineum_2());
                intent.putExtra("kondisi_perineum_3", Detail_kesehatan_ibu_nifas.this.model.get(i).getKondisi_perineum_3());
                intent.putExtra("dan_lain_lain_1", Detail_kesehatan_ibu_nifas.this.model.get(i).getDan_lain_lain_1());
                intent.putExtra("dan_lain_lain_2", Detail_kesehatan_ibu_nifas.this.model.get(i).getDan_lain_lain_2());
                intent.putExtra("dan_lain_lain_3", Detail_kesehatan_ibu_nifas.this.model.get(i).getDan_lain_lain_3());
                Detail_kesehatan_ibu_nifas.this.startActivity(intent);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        load_data2();
    }

    /* access modifiers changed from: package-private */
    public void load_data2() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/detaildatakesehatanibunifas/" + getIntent().getIntExtra("detail_data_kesehatan_ibunifas", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("datakesehatanibunifas");
                    Detail_kesehatan_ibu_nifas.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetDetailDataKesehatanIbuNifas> arrayList = Detail_kesehatan_ibu_nifas.this.model;
                        JSONObject jsonObject2 = jsonObject;

                        GetDetailDataKesehatanIbuNifas getDetailDataKesehatanIbuNifas2 = new GetDetailDataKesehatanIbuNifas(getData.getInt("id"), getData.getString("nik_ibu"), getData.getString("nifas_ke"), getData.getString("nama_anak"), getData.getString("tanggal_kunjungan_1"), getData.getString("tanggal_kunjungan_2"), getData.getString("tanggal_kunjungan_3"), getData.getString("kondisi_ibu_secara_umum_1"), getData.getString("kondisi_ibu_secara_umum_2"), getData.getString("kondisi_ibu_secara_umum_3"), getData.getString("tekanan_darah_1"), getData.getString("tekanan_darah_2"), getData.getString("tekanan_darah_3"), getData.getString("kondisi_perineum_1"), getData.getString("kondisi_perineum_2"), getData.getString("kondisi_perineum_3"), getData.getString("dan_lain_lain_1"), getData.getString("dan_lain_lain_2"), getData.getString("dan_lain_lain_3"));
                        arrayList.add(getDetailDataKesehatanIbuNifas2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    Detail_kesehatan_ibu_nifas.this.adaptor = new AdaptorDetailDataKesehatanIbuNifas(Detail_kesehatan_ibu_nifas.this.getApplicationContext(), Detail_kesehatan_ibu_nifas.this.model);
                    Detail_kesehatan_ibu_nifas.this.listView.setAdapter(Detail_kesehatan_ibu_nifas.this.adaptor);
                }
                Detail_kesehatan_ibu_nifas.this.adaptor = new AdaptorDetailDataKesehatanIbuNifas(Detail_kesehatan_ibu_nifas.this.getApplicationContext(), Detail_kesehatan_ibu_nifas.this.model);
                Detail_kesehatan_ibu_nifas.this.listView.setAdapter(Detail_kesehatan_ibu_nifas.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
