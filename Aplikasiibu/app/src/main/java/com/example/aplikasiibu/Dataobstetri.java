package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDataObstetri.AdaptorDataobstetri;
import com.example.aplikasiibu.AdapterDataObstetri.GetDataobstetri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Dataobstetri extends AppCompatActivity {
    public static String kosong;
    AdaptorDataobstetri adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetDataobstetri> model;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    WebView webview1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_dataobstetri);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.cari = (EditText) findViewById(R.id.cari);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.webview1 = (WebView) findViewById(R.id.webview1);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        if (getIntent().hasExtra("UploadTaskParameters.Companion.CodingKeys.id")) {
            this.webview1.setVisibility(View.GONE);
            this.webview1.setWebChromeClient(new WebChromeClient());
            this.webview1.getSettings().setJavaScriptEnabled(true);
            this.webview1.loadUrl(new Configurasi().baseUrl() + "cetakdataobstetri/" + getIntent().getIntExtra("UploadTaskParameters.Companion.CodingKeys.id", 0));
            ((PrintManager) getSystemService(Context.PRINT_SERVICE)).print("Document", this.webview1.createPrintDocumentAdapter(), new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.ISO_A4).setColorMode(PrintAttributes.COLOR_MODE_COLOR).build());
        }
        if (getIntent().hasExtra("dataid")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage((CharSequence) "Apakah Ingin Menghapus?");
            builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int position) {
                    Dataobstetri.this.hapusData();
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
                Dataobstetri.this.finish();
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Dataobstetri.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        load_data2();
        cari_data(kosong);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Dataobstetri.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Dataobstetri.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Dataobstetri.this.startActivity(intent);
                        Dataobstetri.this.finish();
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
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Dataobstetri.this.getApplicationContext(), Detail_dataobstetri.class);
                intent.putExtra("detail_data_obstetri", Dataobstetri.this.model.get(i).getId());
                intent.putExtra("nama_ibu", Dataobstetri.this.model.get(i).getNama_ibu());
                intent.putExtra("nik", Dataobstetri.this.model.get(i).getNik());
                Dataobstetri.this.startActivity(intent);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caridataorangtuadananak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtua");
                    Dataobstetri.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Dataobstetri.this.model.add(new GetDataobstetri(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_atau_tanggal_lahir_ibu")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Dataobstetri.this.adaptor = new AdaptorDataobstetri(Dataobstetri.this.getApplicationContext(), Dataobstetri.this.model);
                Dataobstetri.this.listView.setAdapter(Dataobstetri.this.adaptor);
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

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        finish();
    }

    /* access modifiers changed from: package-private */
    public void load_data2() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/dataorangtuadananak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtuadananak");
                    Dataobstetri.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Dataobstetri.this.model.add(new GetDataobstetri(getData.getInt("id"), getData.getString("nama_ibu"), getData.getString("nik"), getData.getString("tempat_atau_tanggal_lahir_ibu")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Dataobstetri.this.adaptor = new AdaptorDataobstetri(Dataobstetri.this.getApplicationContext(), Dataobstetri.this.model);
                Dataobstetri.this.listView.setAdapter(Dataobstetri.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public void hapusData() {
        Volley.newRequestQueue(this).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapusdata/" + getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Dataobstetri.this.getApplicationContext());
                        builder.setTitle((CharSequence) "Sukses");
                        builder.setMessage((CharSequence) "Berhasil Terhapus");
                        builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Dataobstetri.this.load_data2();
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
