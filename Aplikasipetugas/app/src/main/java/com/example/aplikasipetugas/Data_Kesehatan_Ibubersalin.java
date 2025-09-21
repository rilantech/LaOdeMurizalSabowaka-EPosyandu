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
import com.example.aplikasipetugas.AdapterDataKesehatanIbuBersalin.AdaptorDataKesehatanIbuBersalin;
import com.example.aplikasipetugas.AdapterDataKesehatanIbuBersalin.GetDataKesehatanIbuBersalin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Data_Kesehatan_Ibubersalin extends AppCompatActivity {
    public static Integer id_data_kesehatan_ibu_bersalin;
    public static String kosong;
    public static String nama_ibu;
    public static String nik;
    AdaptorDataKesehatanIbuBersalin adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetDataKesehatanIbuBersalin> model;
    Spinner spinner;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_data_kesehatan_ibubersalin);
        this.spinner = (Spinner) findViewById(R.id.spinner_pilih_data_kesehatan_ibu);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.cari = (EditText) findViewById(R.id.cari);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);
        this.spinner.setSelection(1, true);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Data_Kesehatan_Ibubersalin.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Data_Kesehatan_Ibubersalin.this, Halaman_Login.class);
                        Data_Kesehatan_Ibubersalin.this.startActivity(intent);
                        Data_Kesehatan_Ibubersalin.this.finish();
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
                Data_Kesehatan_Ibubersalin.this.finish();
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
                        startActivity(new Intent(getApplicationContext(), Data_kesehatan_ibunifas.class));
                        finish();
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        load_data2();
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Data_Kesehatan_Ibubersalin.this.getApplicationContext(), Detail_kesehatan_ibu_bersalin.class);
                intent.putExtra("detail_data_kesehatan_ibubersalin", Data_Kesehatan_Ibubersalin.this.model.get(i).getId());
                Data_Kesehatan_Ibubersalin.id_data_kesehatan_ibu_bersalin = Integer.valueOf(Data_Kesehatan_Ibubersalin.this.model.get(i).getId());
                Data_Kesehatan_Ibubersalin.nama_ibu = Data_Kesehatan_Ibubersalin.this.model.get(i).getNama_ibu();
                Data_Kesehatan_Ibubersalin.nik = Data_Kesehatan_Ibubersalin.this.model.get(i).getNik();
                intent.putExtra("nama_ibu", Data_Kesehatan_Ibubersalin.this.model.get(i).getNama_ibu());
                intent.putExtra("nik_ibu", Data_Kesehatan_Ibubersalin.this.model.get(i).getNik());
                Data_Kesehatan_Ibubersalin.this.startActivity(intent);
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Data_Kesehatan_Ibubersalin.this.cari_data(charSequence.toString());
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
                    Data_Kesehatan_Ibubersalin.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_Kesehatan_Ibubersalin.this.model.add(new GetDataKesehatanIbuBersalin(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_lahir_ibu"), getData.getString("tanggal_lahir_ibu"),
                                getData.getString("tempat_lahir_ayah"), getData.getString("tanggal_lahir_ayah"),  getData.getString("alamat_rumah")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Data_Kesehatan_Ibubersalin.this.adaptor = new AdaptorDataKesehatanIbuBersalin(Data_Kesehatan_Ibubersalin.this.getApplicationContext(), Data_Kesehatan_Ibubersalin.this.model);
                Data_Kesehatan_Ibubersalin.this.listView.setAdapter(Data_Kesehatan_Ibubersalin.this.adaptor);
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
                    Data_Kesehatan_Ibubersalin.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Data_Kesehatan_Ibubersalin.this.model.add(new GetDataKesehatanIbuBersalin(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_lahir_ibu"), getData.getString("tanggal_lahir_ibu"),
                                getData.getString("tempat_lahir_ayah"), getData.getString("tanggal_lahir_ayah"),  getData.getString("alamat_rumah")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Data_Kesehatan_Ibubersalin.this.adaptor = new AdaptorDataKesehatanIbuBersalin(Data_Kesehatan_Ibubersalin.this.getApplicationContext(), Data_Kesehatan_Ibubersalin.this.model);
                Data_Kesehatan_Ibubersalin.this.listView.setAdapter(Data_Kesehatan_Ibubersalin.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
