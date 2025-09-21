package com.example.aplikasipetugas;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.AdapterDataOrangtuadananak.AdaptorDataorangtuadananak;
import com.example.aplikasipetugas.AdapterDataOrangtuadananak.GetDataorangtuadananak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Dataorangtuadananak extends AppCompatActivity {
    public static String kosong;
    AdaptorDataorangtuadananak adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetDataorangtuadananak> model;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView txttambahdata;
    WebView webview1;
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_dataorangtuadananak);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.txttambahdata = (TextView) findViewById(R.id.txttambahdata);
        this.webview1 = (WebView) findViewById(R.id.webview1);
        this.cari = (EditText) findViewById(R.id.cari);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Dataorangtuadananak.this);
                builder.setMessage("Yakin Ingin Logout ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Dataorangtuadananak.this, Halaman_Login.class);
                        Dataorangtuadananak.this.startActivity(intent);
                        Dataorangtuadananak.this.finish();
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
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Dataorangtuadananak.this.getApplicationContext(), Detail_data_orangtuadananak.class);
                intent.putExtra("nik_ibu", Dataorangtuadananak.this.model.get(i).getNik());
                Dataorangtuadananak.this.startActivity(intent);
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Dataorangtuadananak.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        cari_data(kosong);
        if (getIntent().hasExtra("UploadTaskParameters.Companion.CodingKeys.id")) {
            this.webview1.setVisibility(View.GONE);
            this.webview1.setWebChromeClient(new WebChromeClient());
            this.webview1.getSettings().setJavaScriptEnabled(true);
            this.webview1.loadUrl(new Configurasi().baseUrl() + "cetakdataorangtuadananak/" + getIntent().getIntExtra("UploadTaskParameters.Companion.CodingKeys.id", 0));
            ((PrintManager) getSystemService(Context.PRINT_SERVICE)).print("Document", this.webview1.createPrintDocumentAdapter(), new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.ISO_A4).setColorMode(PrintAttributes.COLOR_MODE_COLOR).build());
        }




//        if (getIntent().hasExtra("id_hapus")) {
//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setMessage((CharSequence) "Apakah Ingin Menghapus?");
//            builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialogInterface, int position) {
//                    Dataorangtuadananak.this.hapusData();
//                }
//            });
//            builder.setNegativeButton((CharSequence) "Tidak", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    dialogInterface.cancel();
//                }
//            });
//            builder.create().show();
//        }
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Dataorangtuadananak.this.finish();
            }
        });
        load_data2();
        this.txttambahdata.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Dataorangtuadananak.this.startActivity(new Intent(Dataorangtuadananak.this.getApplicationContext(), Tambah_Data_Orangtuadananak.class));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        finish();
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caridataorangtuadananak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtua");
                    Dataorangtuadananak.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Dataorangtuadananak.this.model.add(new GetDataorangtuadananak(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_lahir_ibu"), getData.getString("tanggal_lahir_ibu"),
                                getData.getString("tempat_lahir_ayah"), getData.getString("tanggal_lahir_ayah"),  getData.getString("alamat_rumah")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Dataorangtuadananak.this.adaptor = new AdaptorDataorangtuadananak(Dataorangtuadananak.this.getApplicationContext(), Dataorangtuadananak.this.model);
                Dataorangtuadananak.this.listView.setAdapter(Dataorangtuadananak.this.adaptor);
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
                    Dataorangtuadananak.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Dataorangtuadananak.this.model.add(new GetDataorangtuadananak(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_lahir_ibu"), getData.getString("tanggal_lahir_ibu"),
                                getData.getString("tempat_lahir_ayah"), getData.getString("tanggal_lahir_ayah"),  getData.getString("alamat_rumah")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Dataorangtuadananak.this.adaptor = new AdaptorDataorangtuadananak(Dataorangtuadananak.this.getApplicationContext(), Dataorangtuadananak.this.model);
                Dataorangtuadananak.this.listView.setAdapter(Dataorangtuadananak.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }

}
