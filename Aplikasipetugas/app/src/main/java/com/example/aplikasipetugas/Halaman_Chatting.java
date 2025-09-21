package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.AdapterChatting.AdaptorChatting;
import com.example.aplikasipetugas.AdapterChatting.GetChatting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Halaman_Chatting extends AppCompatActivity {
    public static String kosong;
    AdaptorChatting adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetChatting> model;
    Spinner spinner_pilih_akun;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_halaman_chatting);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.spinner_pilih_akun = (Spinner) findViewById(R.id.spinner_pilih_akun);
        this.cari = (EditText) findViewById(R.id.cari);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Halaman_Chatting.this.finish();
            }
        });
        this.spinner_pilih_akun.setSelection(0, true);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.spinner_pilih_akun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();

                switch (selectedItem){
                    case "Petugas Posyandu":
                        startActivity(new Intent(getApplicationContext(), Halaman_Chatting.class));
                        finish();
                        break;
                    case "Admin":
                        Intent intent = new Intent(getApplicationContext(), DetailHalamanChatting.class);
                        intent.putExtra("nama", "Admin");
                        intent.putExtra("nomor_hp", "081119009287");
                        intent.putExtra("posisi", "admin");
                        startActivity(intent);
                        finish();
                        break;
                    case "Ibu Posyandu":
                        startActivity(new Intent(getApplicationContext(), Halaman_Chatting_Ibu.class));
                        finish();
                        break;

                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Halaman_Chatting.this);
                builder.setMessage("Yakin Ingin Logout ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Halaman_Chatting.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Halaman_Chatting.this.startActivity(intent);
                        Halaman_Chatting.this.finish();
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
        load_data2();
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Halaman_Chatting.this.getApplicationContext(), DetailHalamanChatting.class);
                intent.putExtra("id_akun", Halaman_Chatting.this.model.get(i).getId());
                intent.putExtra("nama", Halaman_Chatting.this.model.get(i).getNama());
                intent.putExtra("nomor_hp", Halaman_Chatting.this.model.get(i).getNomor_hp());
                intent.putExtra("posisi", "petugas_posyandu");
                Halaman_Chatting.this.startActivity(intent);
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Halaman_Chatting.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        cari_data(kosong);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        load_data2();
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/cariakunpetugas", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("akun_petugas");
                    Halaman_Chatting.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Halaman_Chatting.this.model.add(new GetChatting(getData.getInt("id"), getData.getString("nama"), getData.getString("nomor_hp")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Halaman_Chatting.this.adaptor = new AdaptorChatting(Halaman_Chatting.this.getApplicationContext(), Halaman_Chatting.this.model);
                Halaman_Chatting.this.listView.setAdapter(Halaman_Chatting.this.adaptor);
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
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/chattingpetugas", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("chatting");
                    Halaman_Chatting.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Halaman_Chatting.this.model.add(new GetChatting(getData.getInt("id"), getData.getString("nama"), getData.getString("nomor_hp")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Halaman_Chatting.this.adaptor = new AdaptorChatting(Halaman_Chatting.this.getApplicationContext(), Halaman_Chatting.this.model);
                Halaman_Chatting.this.listView.setAdapter(Halaman_Chatting.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
