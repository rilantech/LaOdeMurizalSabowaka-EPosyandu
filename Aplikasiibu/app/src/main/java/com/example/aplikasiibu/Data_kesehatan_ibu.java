package com.example.aplikasiibu;

import android.annotation.SuppressLint;
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
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDataKesehatanIbuHamil.AdaptorDataKesehatanIbuHamil;
import com.example.aplikasiibu.AdapterDataKesehatanIbuHamil.GetDataKesehatanIbuHamil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Data_kesehatan_ibu extends AppCompatActivity {
    public static Integer id_data_kesehatan_ibu_hamil;
    public static String kosong;
    public static String nama_ibu;
    public static String nik;
    AdaptorDataKesehatanIbuHamil adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetDataKesehatanIbuHamil> model;
    Spinner spinner;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_data_kesehatan_ibu);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.cari = (EditText) findViewById(R.id.cari);
        this.spinner = (Spinner) findViewById(R.id.spinner_pilih_data_kesehatan_ibu);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(HalamanLogin.namapetugas);
        this.spinner.setSelection(0, true);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Data_kesehatan_ibu.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Data_kesehatan_ibu.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Data_kesehatan_ibu.this.startActivity(intent);
                        Data_kesehatan_ibu.this.finish();
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
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemSelected(AdapterView<?> r5, View r6, int r7, long r8) {
                /*
                    r4 = this;
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r0 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    android.widget.Spinner r0 = r0.spinner
                    java.lang.Object r0 = r0.getSelectedItem()
                    java.lang.String r0 = r0.toString()
                    int r1 = r0.hashCode()
                    switch(r1) {
                        case -297960676: goto L_0x0028;
                        case 340890351: goto L_0x001e;
                        case 346662837: goto L_0x0014;
                        default: goto L_0x0013;
                    }
                L_0x0013:
                    goto L_0x0032
                L_0x0014:
                    java.lang.String r1 = "Kesehatan Ibu Nifas"
                    boolean r1 = r0.equals(r1)
                    if (r1 == 0) goto L_0x0013
                    r1 = 2
                    goto L_0x0033
                L_0x001e:
                    java.lang.String r1 = "Kesehatan Ibu Hamil"
                    boolean r1 = r0.equals(r1)
                    if (r1 == 0) goto L_0x0013
                    r1 = 0
                    goto L_0x0033
                L_0x0028:
                    java.lang.String r1 = "Kesehatan Ibu Bersalin"
                    boolean r1 = r0.equals(r1)
                    if (r1 == 0) goto L_0x0013
                    r1 = 1
                    goto L_0x0033
                L_0x0032:
                    r1 = -1
                L_0x0033:
                    switch(r1) {
                        case 0: goto L_0x0067;
                        case 1: goto L_0x004f;
                        case 2: goto L_0x0037;
                        default: goto L_0x0036;
                    }
                L_0x0036:
                    goto L_0x007f
                L_0x0037:
                    android.content.Intent r1 = new android.content.Intent
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    android.content.Context r2 = r2.getApplicationContext()
                    java.lang.Class<com.example.aplikasiperpustakaan.Data_kesehatan_ibunifas> r3 = com.example.aplikasiperpustakaan.Data_kesehatan_ibunifas.class
                    r1.<init>(r2, r3)
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    r2.startActivity(r1)
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    r2.finish()
                    goto L_0x007f
                L_0x004f:
                    android.content.Intent r1 = new android.content.Intent
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    android.content.Context r2 = r2.getApplicationContext()
                    java.lang.Class<com.example.aplikasiperpustakaan.Data_Kesehatan_Ibubersalin> r3 = com.example.aplikasiperpustakaan.Data_Kesehatan_Ibubersalin.class
                    r1.<init>(r2, r3)
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    r2.startActivity(r1)
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    r2.finish()
                    goto L_0x007f
                L_0x0067:
                    android.content.Intent r1 = new android.content.Intent
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    android.content.Context r2 = r2.getApplicationContext()
                    java.lang.Class<com.example.aplikasiperpustakaan.Data_kesehatan_ibu> r3 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.class
                    r1.<init>(r2, r3)
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    r2.startActivity(r1)
                    com.example.aplikasiperpustakaan.Data_kesehatan_ibu r2 = com.example.aplikasiperpustakaan.Data_kesehatan_ibu.this
                    r2.finish()
                L_0x007f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.example.aplikasiperpustakaan.Data_kesehatan_ibu.AnonymousClass2.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Data_kesehatan_ibu.this.finish();
            }
        });
        load_data2();
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Data_kesehatan_ibu.this.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class);
                intent.putExtra("detail_data_kesehatan_ibuhamil", Data_kesehatan_ibu.this.model.get(i).getId());
                intent.putExtra("nama_ibu", Data_kesehatan_ibu.this.model.get(i).getNama_ibu());
                Data_kesehatan_ibu.id_data_kesehatan_ibu_hamil = Integer.valueOf(Data_kesehatan_ibu.this.model.get(i).getId());
                Data_kesehatan_ibu.nama_ibu = Data_kesehatan_ibu.this.model.get(i).getNama_ibu();
                Data_kesehatan_ibu.nik = Data_kesehatan_ibu.this.model.get(i).getNik();
                intent.putExtra("nik_ibu", Data_kesehatan_ibu.this.model.get(i).getNik());
                Data_kesehatan_ibu.this.startActivity(intent);
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Data_kesehatan_ibu.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        cari_data(kosong);
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caridataorangtuadananak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtua");
                    Data_kesehatan_ibu.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_kesehatan_ibu.this.model.add(new GetDataKesehatanIbuHamil(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_atau_tanggal_lahir_ibu")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Data_kesehatan_ibu.this.adaptor = new AdaptorDataKesehatanIbuHamil(Data_kesehatan_ibu.this.getApplicationContext(), Data_kesehatan_ibu.this.model);
                Data_kesehatan_ibu.this.listView.setAdapter(Data_kesehatan_ibu.this.adaptor);
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
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/dataorangtuadananak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtuadananak");
                    Data_kesehatan_ibu.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_kesehatan_ibu.this.model.add(new GetDataKesehatanIbuHamil(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_atau_tanggal_lahir_ibu")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Data_kesehatan_ibu.this.adaptor = new AdaptorDataKesehatanIbuHamil(Data_kesehatan_ibu.this.getApplicationContext(), Data_kesehatan_ibu.this.model);
                Data_kesehatan_ibu.this.listView.setAdapter(Data_kesehatan_ibu.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
