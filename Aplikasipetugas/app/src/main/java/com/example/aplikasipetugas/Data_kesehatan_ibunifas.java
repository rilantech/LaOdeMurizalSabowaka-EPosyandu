package com.example.aplikasipetugas;

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
import com.example.aplikasipetugas.AdapterDataKesehatanIbuHamil.AdaptorDataKesehatanIbuHamil;
import com.example.aplikasipetugas.AdapterDataKesehatanIbuHamil.GetDataKesehatanIbuHamil;
import com.example.aplikasipetugas.AdapterDataKesehatanIbuNifas.AdaptorDataKesehatanIbuNifas;
import com.example.aplikasipetugas.AdapterDataKesehatanIbuNifas.GetDataKesehatanIbuNifas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Data_kesehatan_ibunifas extends AppCompatActivity {
    public static String kosong;
    AdaptorDataKesehatanIbuNifas adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetDataKesehatanIbuNifas> model;
    Spinner spinner;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    public static String filter, status_nifas="semua";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_data_kesehatan_ibunifas);
        this.listView = (ListView) findViewById(R.id.list);
        this.spinner = (Spinner) findViewById(R.id.spinner_pilih_data_kesehatan_ibu);
        this.cari = (EditText) findViewById(R.id.cari);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.spinner.setSelection(2, true);
        load_data2();
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Data_kesehatan_ibunifas.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Data_kesehatan_ibunifas.this, Halaman_Login.class);
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
                        startActivity(new Intent(getApplicationContext(), Data_kesehatan_ibu.class));
                        finish();
                        break;
                    case "Kesehatan Ibu Bersalin":
                        startActivity(new Intent(getApplicationContext(), Data_Kesehatan_Ibubersalin.class));
                        finish();
                        break;
                    case "Kesehatan Ibu Nifas":
                        status_nifas = "semua";
                        startActivity(new Intent(getApplicationContext(), Data_kesehatan_ibunifas.class));
                        finish();
                        break;
                    case "Riwayat Kesehatan Ibu Nifas":
                        status_nifas = "Berakhir";
                        filter = "Riwayat Kesehatan Ibu Nifas";
                        filter_data(filter);
                        break;
                    case "Kesehatan Ibu Sedang Nifas":
                        status_nifas = "Sedang Berlangsung";
                        filter = "Kesehatan Ibu Sedang Nifas";
                        filter_data(filter);
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Data_kesehatan_ibunifas.this.getApplicationContext(), Detail_kesehatan_ibu_nifas.class);
                intent.putExtra("detail_data_kesehatan_ibunifas", Data_kesehatan_ibunifas.this.model.get(i).getId());
                intent.putExtra("nama_ibu", Data_kesehatan_ibunifas.this.model.get(i).getNama_ibu());
                intent.putExtra("nik_ibu", Data_kesehatan_ibunifas.this.model.get(i).getNik());
                Data_kesehatan_ibunifas.this.startActivity(intent);
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Data_kesehatan_ibunifas.this.cari_data(charSequence.toString());
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
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caridataorangtuadananak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtua");
                    Data_kesehatan_ibunifas.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_kesehatan_ibunifas.this.model.add(new GetDataKesehatanIbuNifas(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_lahir_ibu"), getData.getString("tanggal_lahir_ibu"),
                                getData.getString("tempat_lahir_ayah"), getData.getString("tanggal_lahir_ayah"),  getData.getString("alamat_rumah")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Data_kesehatan_ibunifas.this.adaptor = new AdaptorDataKesehatanIbuNifas(Data_kesehatan_ibunifas.this.getApplicationContext(), Data_kesehatan_ibunifas.this.model);
                Data_kesehatan_ibunifas.this.listView.setAdapter(Data_kesehatan_ibunifas.this.adaptor);
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

    public void filter_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caridataorangtuadananak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtua");
                    Data_kesehatan_ibunifas.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_kesehatan_ibunifas.this.model.add(new GetDataKesehatanIbuNifas(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_lahir_ibu"), getData.getString("tanggal_lahir_ibu"),
                                getData.getString("tempat_lahir_ayah"), getData.getString("tanggal_lahir_ayah"),  getData.getString("alamat_rumah")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Data_kesehatan_ibunifas.this.adaptor = new AdaptorDataKesehatanIbuNifas(Data_kesehatan_ibunifas.this.getApplicationContext(), Data_kesehatan_ibunifas.this.model);
                Data_kesehatan_ibunifas.this.listView.setAdapter(Data_kesehatan_ibunifas.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }) {
            /* access modifiers changed from: protected */
            public Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> form = new HashMap<>();
                form.put("filter", data);
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
                    Data_kesehatan_ibunifas.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_kesehatan_ibunifas.this.model.add(new GetDataKesehatanIbuNifas(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_lahir_ibu"), getData.getString("tanggal_lahir_ibu"),
                                getData.getString("tempat_lahir_ayah"), getData.getString("tanggal_lahir_ayah"),  getData.getString("alamat_rumah")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Data_kesehatan_ibunifas.this.adaptor = new AdaptorDataKesehatanIbuNifas(Data_kesehatan_ibunifas.this.getApplicationContext(), Data_kesehatan_ibunifas.this.model);
                Data_kesehatan_ibunifas.this.listView.setAdapter(Data_kesehatan_ibunifas.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
