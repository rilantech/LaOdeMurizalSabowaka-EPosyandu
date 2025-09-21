package com.example.aplikasipetugas;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.AdapterDataAnak.AdaptorDataanak;
import com.example.aplikasipetugas.AdapterDataAnak.GetDataanak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Detail_data_orangtuadananak extends AppCompatActivity {
    SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM YYYY");
    String tanggal_lahir_ibu, tanggal_lahir_ayah;
    AdaptorDataanak adaptor;
    Button btnbatal;
    Button btnsimpan;
    Button btntambahdataanak;
    ImageView butonlogout;
    TextView etxagama;
    TextView etxagamaayah;
    TextView etxalamatrumah;
    TextView etxanakke;
    TextView etxdari;
    TextView etxgoldarah;
    TextView etxgoldarahayah;
    TextView etxkabupaten;
    TextView etxkecamatan;
    TextView etxnama;
    TextView etxnamaanak;
    TextView etxnamaayah;
    TextView etxnik;
    TextView etxnoaktekelahiran;
    TextView etxnobpjsanak;
    TextView etxnojkn;
    TextView etxnotelp;
    TextView etxpekerjaan;
    TextView etxpekerjaanayah;
    TextView etxpendidikan;
    TextView etxpendidikanayah;
    TextView etxttl;
    TextView etxttlanak;
    TextView etxttlayah;
    ListView listView;
    ArrayList<GetDataanak> model;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_data_orangtuadananak);
        this.listView = (ListView) findViewById(R.id.list);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.etxnama = (TextView) findViewById(R.id.etxnama);
        this.etxnik = (TextView) findViewById(R.id.etxnik);
        this.etxttl = (TextView) findViewById(R.id.etxttl);
        this.etxgoldarah = (TextView) findViewById(R.id.etxgoldarah);
        this.etxpekerjaan = (TextView) findViewById(R.id.etxpekerjaan);
        this.etxnojkn = (TextView) findViewById(R.id.etxnojkn);
        this.etxnamaayah = (TextView) findViewById(R.id.etxnamaayah);
        this.etxttlayah = (TextView) findViewById(R.id.etxttlayah);
        this.etxgoldarahayah = (TextView) findViewById(R.id.etxgoldarahayah);
        this.etxpekerjaanayah = (TextView) findViewById(R.id.etxpekerjaanayah);
        this.etxalamatrumah = (TextView) findViewById(R.id.etxalamatrumah);
        this.etxkecamatan = (TextView) findViewById(R.id.etxkecamatan);
        this.etxkabupaten = (TextView) findViewById(R.id.etxkabupaten);
        this.etxnotelp = (TextView) findViewById(R.id.etxnotelp);
        this.etxnamaanak = (TextView) findViewById(R.id.etxnamaanak);
        this.etxttlanak = (TextView) findViewById(R.id.etxttlanak);
        this.etxanakke = (TextView) findViewById(R.id.etxanakke);
        this.etxdari = (TextView) findViewById(R.id.etxdari);
        this.etxnoaktekelahiran = (TextView) findViewById(R.id.etxnoaktekelahiran);
        this.etxnobpjsanak = (TextView) findViewById(R.id.etxnobpjsanak);
        this.etxagama = (TextView) findViewById(R.id.etxagama);
        this.etxpendidikan = (TextView) findViewById(R.id.etxpendidikan);
        this.etxagamaayah = (TextView) findViewById(R.id.etxagamaayah);
        this.etxpendidikanayah = (TextView) findViewById(R.id.etxpendidikanayah);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        getData();
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_data_orangtuadananak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_data_orangtuadananak.this, Halaman_Login.class);
                        Detail_data_orangtuadananak.this.startActivity(intent);
                        Detail_data_orangtuadananak.this.finish();
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
                Detail_data_orangtuadananak.this.startActivity(new Intent(Detail_data_orangtuadananak.this.getApplicationContext(), Dataorangtuadananak.class));
                Detail_data_orangtuadananak.this.finish();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/lihatdataorangtuadananak/" + getIntent().getStringExtra("nik_ibu"), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {

                    JSONObject jsonObject = new JSONObject(response).getJSONObject("data");
                    String gnamaibu = jsonObject.getString("nama_ibu");
                    String gnik = jsonObject.getString("nik");
                    String gtempat_lahir_ibu = jsonObject.getString("tempat_lahir_ibu");
                    String gtanggal_lahir_ibu = jsonObject.getString("tanggal_lahir_ibu");
                    String gtempat_lahir_ayah = jsonObject.getString("tempat_lahir_ayah");
                    String gtanggal_lahir_ayah = jsonObject.getString("tanggal_lahir_ayah");
                    try {
                        Date date = inputFormat.parse(gtanggal_lahir_ibu);
                        tanggal_lahir_ibu = outputFormat.format(date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    try {
                        Date date = inputFormat.parse(gtanggal_lahir_ayah);
                        tanggal_lahir_ayah = outputFormat.format(date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    String ggoldarah = jsonObject.getString("golongan_darah_ibu");
                    String gpekerjaan = jsonObject.getString("pekerjaan_ibu");
                    String gnojkn = jsonObject.getString("no_jkn_bpjs");
                    String gnamasuami = jsonObject.getString("nama_ayah");
                    String gttlsuami = jsonObject.getString("tempat_atau_tanggal_lahir_ayah");
                    String ggoldarahsuami = jsonObject.getString("golongan_darah_ayah");
                    String gpekerjaansuami = jsonObject.getString("pekerjaan_ayah");
                    String galamatrumah = jsonObject.getString("alamat_rumah");
                    String gkecamatan = jsonObject.getString("kecamatan");
                    String str = "no_jkn_bpjs";
                    String gkabupaten = jsonObject.getString("kabupaten_atau_kota");
                    String gnotelp = jsonObject.getString("no_telepon");
                    String gagama = jsonObject.getString("agama_ibu");
                    String gpendidikan = jsonObject.getString("pendidikan_ibu");
                    String gagamasuami = jsonObject.getString("agama_ayah");
                    String gpendidikansuami = jsonObject.getString("pendidikan_ayah");
                    JSONObject jSONObject = jsonObject;
                    Detail_data_orangtuadananak.this.etxnama.setText(gnamaibu);
                    Detail_data_orangtuadananak.this.etxnik.setText(gnik);
                    Detail_data_orangtuadananak.this.etxttl.setText(gtempat_lahir_ibu+"/"+tanggal_lahir_ibu);
                    Detail_data_orangtuadananak.this.etxgoldarah.setText(ggoldarah);
                    Detail_data_orangtuadananak.this.etxpekerjaan.setText(gpekerjaan);
                    Detail_data_orangtuadananak.this.etxnojkn.setText(gnojkn);
                    Detail_data_orangtuadananak.this.etxnamaayah.setText(gnamasuami);
                    Detail_data_orangtuadananak.this.etxttlayah.setText(gtempat_lahir_ayah+"/"+tanggal_lahir_ayah);
                    Detail_data_orangtuadananak.this.etxgoldarahayah.setText(ggoldarahsuami);
                    Detail_data_orangtuadananak.this.etxpekerjaanayah.setText(gpekerjaansuami);
                    Detail_data_orangtuadananak.this.etxalamatrumah.setText(galamatrumah);
                    Detail_data_orangtuadananak.this.etxkecamatan.setText(gkecamatan);
                    Detail_data_orangtuadananak.this.etxkabupaten.setText(gkabupaten);
                    String str2 = gkabupaten;
                    String gkabupaten2 = gnotelp;
                    Detail_data_orangtuadananak.this.etxnotelp.setText(gkabupaten2);
                    String str3 = gkabupaten2;
                    String gagama2 = gagama;
                    Detail_data_orangtuadananak.this.etxagama.setText(gagama2);
                    String str4 = gagama2;
                    String gagama3 = gpendidikan;
                    Detail_data_orangtuadananak.this.etxpendidikan.setText(gagama3);
                    String str5 = gagama3;
                    String gpendidikan2 = gagamasuami;
                    Detail_data_orangtuadananak.this.etxagamaayah.setText(gpendidikan2);
                    Detail_data_orangtuadananak.this.etxpendidikanayah.setText(gpendidikansuami);
                    String str6 = gpendidikansuami;
                    JSONObject jsonObject2 = new JSONObject(response);
                    String str7 = gpendidikan2;
                    JSONArray jsonArray2 = jsonObject2.getJSONArray("dataanak");
                    JSONObject jSONObject2 = jsonObject2;
                    Detail_data_orangtuadananak.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray2.length()) {
                        JSONObject getData2 = jsonArray2.getJSONObject(i);
                        JSONArray jsonArray22 = jsonArray2;
                        String gnamaibu2 = gnamaibu;
                        String gnik2 = gnik;
                        String str8 = str;
                        Detail_data_orangtuadananak.this.model.add(new GetDataanak(getData2.getInt("id"), getData2.getString("nik_ibu"), getData2.getString("nama"), getData2.getString("jenis_kelamin"), getData2.getString("tempat_atau_tanggal_lahir"), getData2.getString("tempat_lahir_anak"), getData2.getString("tanggal_lahir_anak"), getData2.getString("anak_ke"), getData2.getString("dari"), getData2.getString("no_akta_kelahiran"), getData2.getString(str8)));
                        i++;
                        str = str8;
                        jsonArray2 = jsonArray22;
                        gnamaibu = gnamaibu2;
                        gnik = gnik2;
                    }
                    String str9 = gnamaibu;
                    String str10 = gnik;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Detail_data_orangtuadananak.this.adaptor = new AdaptorDataanak(Detail_data_orangtuadananak.this.getApplicationContext(), Detail_data_orangtuadananak.this.model);
                Detail_data_orangtuadananak.this.listView.setAdapter(Detail_data_orangtuadananak.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
