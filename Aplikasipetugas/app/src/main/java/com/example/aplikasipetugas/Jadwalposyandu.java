package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
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
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.AdapterJadwalPosyandu.AdaptorJadwalPosyandu;
import com.example.aplikasipetugas.AdapterJadwalPosyandu.GetJadwalPosyandu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Jadwalposyandu extends AppCompatActivity {
    public static String kosong;
    AdaptorJadwalPosyandu adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetJadwalPosyandu> model;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwalposyandu);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.cari = (EditText) findViewById(R.id.cari);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Jadwalposyandu.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        load_data2();
        cari_data(kosong);
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Halaman_utama_app.class));
                Jadwalposyandu.this.finish();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Jadwalposyandu.this);
                builder.setMessage("Yakin Ingin Logout ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Jadwalposyandu.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Jadwalposyandu.this.startActivity(intent);
                        Jadwalposyandu.this.finish();
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/jadwalposyandu", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("jadwalposyandu");
                    Jadwalposyandu.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Jadwalposyandu.this.model.add(new GetJadwalPosyandu(getData.getInt("id"), getData.getString("waktu_post"), getData.getString("agenda"), getData.getString("tanggal"), getData.getString("jam")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Jadwalposyandu.this.adaptor = new AdaptorJadwalPosyandu(Jadwalposyandu.this.getApplicationContext(), Jadwalposyandu.this.model);
                Jadwalposyandu.this.listView.setAdapter(Jadwalposyandu.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }) {
            /* access modifiers changed from: protected */
            public Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> form = new HashMap<>();
                form.put("data", str);
                return form;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void load_data2() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/jadwalposyandu", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("jadwalposyandu");
                    Jadwalposyandu.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Jadwalposyandu.this.model.add(new GetJadwalPosyandu(getData.getInt("id"), getData.getString("waktu_post"), getData.getString("agenda"), getData.getString("tanggal"), getData.getString("jam")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Jadwalposyandu.this.adaptor = new AdaptorJadwalPosyandu(Jadwalposyandu.this.getApplicationContext(), Jadwalposyandu.this.model);
                Jadwalposyandu.this.listView.setAdapter(Jadwalposyandu.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
