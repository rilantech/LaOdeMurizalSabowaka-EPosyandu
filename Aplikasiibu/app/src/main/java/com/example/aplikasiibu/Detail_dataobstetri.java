package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDetailDataObstetri.AdaptorDetailDataobstetri;
import com.example.aplikasiibu.AdapterDetailDataObstetri.GetDetailDataobstetri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Detail_dataobstetri extends AppCompatActivity {
    public static Integer idku;
    public static String kosong;
    public static String nama_ibu1;
    public static String nik1_ibu;
    AdaptorDetailDataobstetri adaptor;
    ImageView butonlogout;
    EditText cari;
    TextView ketdatakosong;
    ListView listView;
    ArrayList<GetDetailDataobstetri> model;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_dataobstetri);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.ketdatakosong = (TextView) findViewById(R.id.ketdatakosong);
        nama_ibu1 = getIntent().getStringExtra("nama_ibu");
        nik1_ibu = getIntent().getStringExtra("nik");
        idku = Integer.valueOf(getIntent().getIntExtra("dataid", 0));
        this.cari = (EditText) findViewById(R.id.cari);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(HalamanLogin.namapetugas);
        if (getIntent().hasExtra("dataidhapus")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage((CharSequence) "Apakah Ingin Menghapus?");
            builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int position) {
                    Detail_dataobstetri.this.hapusData();
                }
            });
            builder.setNegativeButton((CharSequence) "Tidak", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.create().show();
        }
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Detail_dataobstetri.this.finish();
            }
        });
        load_data2();
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Detail_dataobstetri.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        cari_data(kosong);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_dataobstetri.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_dataobstetri.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Detail_dataobstetri.this.startActivity(intent);
                        Detail_dataobstetri.this.finish();
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
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        load_data2();
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caridataobstetri", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("dataobstetri");
                    Detail_dataobstetri.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetDetailDataobstetri> arrayList = Detail_dataobstetri.this.model;
                        JSONObject jsonObject2 = jsonObject;

                        GetDetailDataobstetri getDetailDataobstetri2 = new GetDetailDataobstetri(getData.getInt("id"), getData.getString("kehamilan_ke"), getData.getString("tahun"), getData.getString("lahir_hidup"), getData.getString("lahir_aterm"), getData.getString("lahir_spontan"), getData.getString("berat_lahir_atau_panjang_lahir"), getData.getString("tempat_bersalin_dan_tenakes"), getData.getString("kondisi_anak_saat_ini"), getData.getString("komplikasi_kehamilan_atau_persalinan"));
                        arrayList.add(getDetailDataobstetri2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    Detail_dataobstetri.this.adaptor = new AdaptorDetailDataobstetri(Detail_dataobstetri.this.getApplicationContext(), Detail_dataobstetri.this.model);
                    Detail_dataobstetri.this.listView.setAdapter(Detail_dataobstetri.this.adaptor);
                }
                Detail_dataobstetri.this.adaptor = new AdaptorDetailDataobstetri(Detail_dataobstetri.this.getApplicationContext(), Detail_dataobstetri.this.model);
                Detail_dataobstetri.this.listView.setAdapter(Detail_dataobstetri.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }) {
            /* access modifiers changed from: protected */
            public Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> form = new HashMap<>();
                form.put("data", str);
                form.put("nik", HalamanLogin.nik_ibu);
                return form;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void load_data2() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/lihatdataobstetri/" + HalamanLogin.nik_ibu, new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("dataobstetri");
                    if (jsonArray.length() == 0) {
                        Detail_dataobstetri.this.ketdatakosong.setVisibility(View.GONE);
                    }
                    Detail_dataobstetri.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetDetailDataobstetri> arrayList = Detail_dataobstetri.this.model;
                        JSONObject jsonObject2 = jsonObject;

                        GetDetailDataobstetri getDetailDataobstetri2 = new GetDetailDataobstetri(getData.getInt("id"), getData.getString("kehamilan_ke"), getData.getString("tahun"), getData.getString("lahir_hidup"), getData.getString("lahir_aterm"), getData.getString("lahir_spontan"), getData.getString("berat_lahir_atau_panjang_lahir"), getData.getString("tempat_bersalin_dan_tenakes"), getData.getString("kondisi_anak_saat_ini"), getData.getString("komplikasi_kehamilan_atau_persalinan"));
                        arrayList.add(getDetailDataobstetri2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    Detail_dataobstetri.this.adaptor = new AdaptorDetailDataobstetri(Detail_dataobstetri.this.getApplicationContext(), Detail_dataobstetri.this.model);
                    Detail_dataobstetri.this.listView.setAdapter(Detail_dataobstetri.this.adaptor);
                }
                Detail_dataobstetri.this.adaptor = new AdaptorDetailDataobstetri(Detail_dataobstetri.this.getApplicationContext(), Detail_dataobstetri.this.model);
                Detail_dataobstetri.this.listView.setAdapter(Detail_dataobstetri.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public void hapusData() {
        Volley.newRequestQueue(this).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapusdataobstetri/" + getIntent().getIntExtra("dataidhapus", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Detail_dataobstetri.this.getApplicationContext());
                        builder.setTitle((CharSequence) "Sukses");
                        builder.setMessage((CharSequence) "Berhasil Terhapus");
                        builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Detail_dataobstetri.this.finish();
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
            }
        }));
    }
}
