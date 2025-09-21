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
import com.example.aplikasiibu.AdapterCatatanKesehatanIbuHamil.AdaptorCatatanKesehatanIbuHamil;
import com.example.aplikasiibu.AdapterCatatanKesehatanIbuHamil.GetCatatanKesehatanIbuHamil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CatatanKesehatanIbuHamil extends AppCompatActivity {
    public static String kehamilanke;
    public static String kosong;
    public static String namaibu;
    public static String nikibu;
    AdaptorCatatanKesehatanIbuHamil adaptor;
    ImageView butonlogout;
    EditText cari;
    TextView judulcatatankehamilan;
    ListView listView;
    ArrayList<GetCatatanKesehatanIbuHamil> model;
    TextView nama_ibu;
    TextView nik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView txttambahdata;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_catatan_kesehatan_ibu_hamil);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.judulcatatankehamilan = (TextView) findViewById(R.id.judulcatatankehamilan);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.cari = (EditText) findViewById(R.id.cari);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.judulcatatankehamilan.setText("Catatan Kehamilan Ke- " + getIntent().getStringExtra("kehamilan_ke"));
        load_data2();
        if (getIntent().hasExtra("dataid")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage((CharSequence) "Apakah Ingin Menghapus?");
            builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int position) {
                    CatatanKesehatanIbuHamil.this.hapusData();
                }
            });
            builder.setNegativeButton((CharSequence) "Tidak", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.create().show();
        }
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                CatatanKesehatanIbuHamil.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        cari_data(kosong);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CatatanKesehatanIbuHamil.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(CatatanKesehatanIbuHamil.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        CatatanKesehatanIbuHamil.this.startActivity(intent);
                        CatatanKesehatanIbuHamil.this.finish();
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
                CatatanKesehatanIbuHamil.this.startActivity(new Intent(CatatanKesehatanIbuHamil.this.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class));
                CatatanKesehatanIbuHamil.this.finish();
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
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caricatatankesehatanibuhamil", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("catatankesehatanibuhamil");
                    CatatanKesehatanIbuHamil.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetCatatanKesehatanIbuHamil> arrayList = CatatanKesehatanIbuHamil.this.model;
                        JSONObject jsonObject2 = jsonObject;
                        GetCatatanKesehatanIbuHamil getCatatanKesehatanIbuHamil2 = new GetCatatanKesehatanIbuHamil(getData.getInt("id"), getData.getString("nik_ibu"), getData.getString("kehamilan_ke"), getData.getString("tanggal"), getData.getString("nama_pemeriksa_dan_tempat_pelayanan"), getData.getString("keluhan"), getData.getString("uk"), getData.getString("bb"), getData.getString("td"), getData.getString("lila"), getData.getString("tinggi_fundus"), getData.getString("letak_janin"), getData.getString("imunisasi"), getData.getString("tablet_tambah_darah"), getData.getString("lab"), getData.getString("analisa"), getData.getString("tata_laksana"), getData.getString("konseling"), getData.getString("catatan_tambahan"));
                        arrayList.add(getCatatanKesehatanIbuHamil2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    CatatanKesehatanIbuHamil.this.adaptor = new AdaptorCatatanKesehatanIbuHamil(CatatanKesehatanIbuHamil.this.getApplicationContext(), CatatanKesehatanIbuHamil.this.model);
                    CatatanKesehatanIbuHamil.this.listView.setAdapter(CatatanKesehatanIbuHamil.this.adaptor);
                }
                CatatanKesehatanIbuHamil.this.adaptor = new AdaptorCatatanKesehatanIbuHamil(CatatanKesehatanIbuHamil.this.getApplicationContext(), CatatanKesehatanIbuHamil.this.model);
                CatatanKesehatanIbuHamil.this.listView.setAdapter(CatatanKesehatanIbuHamil.this.adaptor);
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
                form.put("kehamilan_ke", CatatanKesehatanIbuHamil.this.getIntent().getStringExtra("kehamilan_ke"));
                return form;
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class));
    }

    /* access modifiers changed from: package-private */
    public void load_data2() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/lihatcatatankesehatanibuhamil/" + HalamanLogin.nik_ibu + "/" + getIntent().getStringExtra("kehamilan_ke"), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("catatankesehatanibuhamil");
                    CatatanKesehatanIbuHamil.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetCatatanKesehatanIbuHamil> arrayList = CatatanKesehatanIbuHamil.this.model;
                        JSONObject jsonObject2 = jsonObject;
                        GetCatatanKesehatanIbuHamil getCatatanKesehatanIbuHamil2 = new GetCatatanKesehatanIbuHamil(getData.getInt("id"), getData.getString("nik_ibu"), getData.getString("kehamilan_ke"), getData.getString("tanggal"), getData.getString("nama_pemeriksa_dan_tempat_pelayanan"), getData.getString("keluhan"), getData.getString("uk"), getData.getString("bb"), getData.getString("td"), getData.getString("lila"), getData.getString("tinggi_fundus"), getData.getString("letak_janin"), getData.getString("imunisasi"), getData.getString("tablet_tambah_darah"), getData.getString("lab"), getData.getString("analisa"), getData.getString("tata_laksana"), getData.getString("konseling"), getData.getString("catatan_tambahan"));
                        arrayList.add(getCatatanKesehatanIbuHamil2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    CatatanKesehatanIbuHamil.this.adaptor = new AdaptorCatatanKesehatanIbuHamil(CatatanKesehatanIbuHamil.this.getApplicationContext(), CatatanKesehatanIbuHamil.this.model);
                    CatatanKesehatanIbuHamil.this.listView.setAdapter(CatatanKesehatanIbuHamil.this.adaptor);
                }
                CatatanKesehatanIbuHamil.this.adaptor = new AdaptorCatatanKesehatanIbuHamil(CatatanKesehatanIbuHamil.this.getApplicationContext(), CatatanKesehatanIbuHamil.this.model);
                CatatanKesehatanIbuHamil.this.listView.setAdapter(CatatanKesehatanIbuHamil.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public void hapusData() {
        Volley.newRequestQueue(this).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapuscatatankesehatanibuhamil/" + getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(CatatanKesehatanIbuHamil.this.getApplicationContext());
                        builder.setTitle((CharSequence) "Sukses");
                        builder.setMessage((CharSequence) "Berhasil Terhapus");
                        builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                CatatanKesehatanIbuHamil.this.finish();
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
