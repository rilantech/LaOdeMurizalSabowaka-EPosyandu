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
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDetailDataKesehatanIbuBersalin.AdaptorDetailDataKesehatanIbuBersalin;
import com.example.aplikasiibu.AdapterDetailDataKesehatanIbuBersalin.GetDetailDataKesehatanIbuBersalin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Detail_kesehatan_ibu_bersalin extends AppCompatActivity {
    public static String kosong;
    AdaptorDetailDataKesehatanIbuBersalin adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetDetailDataKesehatanIbuBersalin> model;
    TextView nama_ibu;
    TextView nik_ibu;
    Spinner spinner;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView txttambahdata1;
    WebView webview1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_kesehatan_ibu_bersalin);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.cari = (EditText) findViewById(R.id.cari);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.webview1 = (WebView) findViewById(R.id.webview1);
        this.spinner = (Spinner) findViewById(R.id.spinner_pilih_data_kesehatan_ibu);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.spinner.setSelection(1, true);
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();

                switch (selectedItem){
                    case "Kesehatan Ibu Hamil":
                        startActivity(new Intent(getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class));
                        finish();
                        break;
                    case "Kesehatan Ibu Bersalin":
                        startActivity(new Intent(getApplicationContext(), Detail_kesehatan_ibu_bersalin.class));
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
        if (getIntent().hasExtra("UploadTaskParameters.Companion.CodingKeys.id")) {
            this.webview1.setVisibility(View.GONE);
            this.webview1.setWebChromeClient(new WebChromeClient());
            this.webview1.getSettings().setJavaScriptEnabled(true);
            this.webview1.loadUrl(new Configurasi().baseUrl() + "cetakkesehatanibubersalin/" + getIntent().getIntExtra("UploadTaskParameters.Companion.CodingKeys.id", 0) + "?page=" + AdaptorDetailDataKesehatanIbuBersalin.nomor + "#srv");
            ((PrintManager) getSystemService(Context.PRINT_SERVICE)).print("Document", this.webview1.createPrintDocumentAdapter(), new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.ISO_A4).setColorMode(PrintAttributes.COLOR_MODE_COLOR).build());
        }
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Detail_kesehatan_ibu_bersalin.this.finish();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_kesehatan_ibu_bersalin.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_kesehatan_ibu_bersalin.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Detail_kesehatan_ibu_bersalin.this.startActivity(intent);
                        Detail_kesehatan_ibu_bersalin.this.finish();
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
                Detail_kesehatan_ibu_bersalin.this.finish();
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Detail_kesehatan_ibu_bersalin.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        cari_data(kosong);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        finish();
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caricatatankesehatanibubersalin", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("catatankesehatanibubersalin");
                    Detail_kesehatan_ibu_bersalin.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetDetailDataKesehatanIbuBersalin> arrayList = Detail_kesehatan_ibu_bersalin.this.model;
                        JSONObject jsonObject2 = jsonObject;
                        GetDetailDataKesehatanIbuBersalin getDetailDataKesehatanIbuBersalin2 = new GetDetailDataKesehatanIbuBersalin(getData.getInt("id"), getData.getString("nik_ibu"), getData.getString("tanggal_persalinan"), getData.getString("pukul"), getData.getString("umur_kehamilan"), getData.getString("penolong_persalinan"), getData.getString("cara_persalinan"), getData.getString("keadaan_ibu"), getData.getString("anak_ke"), getData.getString("berat_lahir"), getData.getString("panjang_badan"), getData.getString("lingkar_kepala"), getData.getString("jenis_kelamin"), getData.getString("kondisi_bayi_saat_lahir"), getData.getString("asuhan_bayi_baru_lahir"));
                        arrayList.add(getDetailDataKesehatanIbuBersalin2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    Detail_kesehatan_ibu_bersalin.this.adaptor = new AdaptorDetailDataKesehatanIbuBersalin(Detail_kesehatan_ibu_bersalin.this.getApplicationContext(), Detail_kesehatan_ibu_bersalin.this.model);
                    Detail_kesehatan_ibu_bersalin.this.listView.setAdapter(Detail_kesehatan_ibu_bersalin.this.adaptor);
                }
                Detail_kesehatan_ibu_bersalin.this.adaptor = new AdaptorDetailDataKesehatanIbuBersalin(Detail_kesehatan_ibu_bersalin.this.getApplicationContext(), Detail_kesehatan_ibu_bersalin.this.model);
                Detail_kesehatan_ibu_bersalin.this.listView.setAdapter(Detail_kesehatan_ibu_bersalin.this.adaptor);
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
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/lihatdatakesehatanibubersalin/" + HalamanLogin.nik_ibu, new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("datakesehatanibubersalin");
                    Detail_kesehatan_ibu_bersalin.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetDetailDataKesehatanIbuBersalin> arrayList = Detail_kesehatan_ibu_bersalin.this.model;
                        JSONObject jsonObject2 = jsonObject;
                        GetDetailDataKesehatanIbuBersalin getDetailDataKesehatanIbuBersalin2 = new GetDetailDataKesehatanIbuBersalin(getData.getInt("id"), getData.getString("nik_ibu"), getData.getString("tanggal_persalinan"), getData.getString("pukul"), getData.getString("umur_kehamilan"), getData.getString("penolong_persalinan"), getData.getString("cara_persalinan"), getData.getString("keadaan_ibu"), getData.getString("anak_ke"), getData.getString("berat_lahir"), getData.getString("panjang_badan"), getData.getString("lingkar_kepala"), getData.getString("jenis_kelamin"), getData.getString("kondisi_bayi_saat_lahir"), getData.getString("asuhan_bayi_baru_lahir"));
                        arrayList.add(getDetailDataKesehatanIbuBersalin2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    Detail_kesehatan_ibu_bersalin.this.adaptor = new AdaptorDetailDataKesehatanIbuBersalin(Detail_kesehatan_ibu_bersalin.this.getApplicationContext(), Detail_kesehatan_ibu_bersalin.this.model);
                    Detail_kesehatan_ibu_bersalin.this.listView.setAdapter(Detail_kesehatan_ibu_bersalin.this.adaptor);
                }
                Detail_kesehatan_ibu_bersalin.this.adaptor = new AdaptorDetailDataKesehatanIbuBersalin(Detail_kesehatan_ibu_bersalin.this.getApplicationContext(), Detail_kesehatan_ibu_bersalin.this.model);
                Detail_kesehatan_ibu_bersalin.this.listView.setAdapter(Detail_kesehatan_ibu_bersalin.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
