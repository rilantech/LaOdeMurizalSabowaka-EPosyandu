package com.example.aplikasipetugas;

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
import com.example.aplikasipetugas.AdapterKesehatanImunisasiAnak.AdaptorDataKesehatanImunisasiAnak;
import com.example.aplikasipetugas.AdapterKesehatanImunisasiAnak.GetKesehatanImunisasiAnak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Kesehatan_imunisasi_anak extends AppCompatActivity {
    public static String kosong;
    AdaptorDataKesehatanImunisasiAnak adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetKesehatanImunisasiAnak> model;
    Spinner spinner;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView txttambahdata;
    WebView webview1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_kesehatan_imunisasi_anak);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.txttambahdata = (TextView) findViewById(R.id.txttambahdata);
        this.spinner = (Spinner) findViewById(R.id.spinner_pilih_data_kesehatan_anak);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.cari = (EditText) findViewById(R.id.cari);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.webview1 = (WebView) findViewById(R.id.webview1);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        load_data2();
        this.spinner.setSelection(1, true);
        if (getIntent().hasExtra("UploadTaskParameters.Companion.CodingKeys.id")) {
            this.webview1.setVisibility(View.GONE);
            this.webview1.setWebChromeClient(new WebChromeClient());
            this.webview1.getSettings().setJavaScriptEnabled(true);
            this.webview1.loadUrl(new Configurasi().baseUrl() + "cetakdataimunisasianak/" + getIntent().getIntExtra("UploadTaskParameters.Companion.CodingKeys.id", 0));
            ((PrintManager) getSystemService(Context.PRINT_SERVICE)).print("Document", this.webview1.createPrintDocumentAdapter(), new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.ISO_A4).setColorMode(PrintAttributes.COLOR_MODE_COLOR).build());
        }
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();

                switch (selectedItem){
                    case "Kesehatan Bayi Baru Lahir":
                        startActivity(new Intent(getApplicationContext(), Kesehatan_bayi_baru_lahir.class));
                        finish();
                        break;
                    case "Kesehatan Imunisasi Anak":
                        startActivity(new Intent(getApplicationContext(), Kesehatan_imunisasi_anak.class));
                        finish();
                        break;
                    case "Pemberian Vitamin & Obat Cacing":
                        startActivity(new Intent(getApplicationContext(), Pemberian_vitamin_dan_obat_cacing.class));
                        finish();
                        break;
                    case "Matriks Pantau Perkembangan Anak":
                        startActivity(new Intent(getApplicationContext(), MatriksPantauPerkembanganAnak.class));
                        finish();
                        break;
                    case "Data KMS":
                        startActivity(new Intent(getApplicationContext(), Data_KMS.class));
                        finish();
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.txttambahdata.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Kesehatan_imunisasi_anak.this.startActivity(new Intent(Kesehatan_imunisasi_anak.this.getApplicationContext(), Tambah_kesehatan_imunisasi_anak.class));
            }
        });
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Kesehatan_imunisasi_anak.this.finish();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Kesehatan_imunisasi_anak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Kesehatan_imunisasi_anak.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Kesehatan_imunisasi_anak.this.startActivity(intent);
                        Kesehatan_imunisasi_anak.this.finish();
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
                Intent intent = new Intent(Kesehatan_imunisasi_anak.this.getApplicationContext(), Detail_kesehatan_imunisasi_anak.class);
                intent.putExtra("detail_kesehatan_imunisasi_anak", Kesehatan_imunisasi_anak.this.model.get(i).getId());
                intent.putExtra("nik_ibu", Kesehatan_imunisasi_anak.this.model.get(i).getNik_ibu());
                intent.putExtra("nama_ibu", Kesehatan_imunisasi_anak.this.model.get(i).getNama_ibu());
                intent.putExtra("nama_ayah", Kesehatan_imunisasi_anak.this.model.get(i).getNama_ayah());
                intent.putExtra("nama_anak", Kesehatan_imunisasi_anak.this.model.get(i).getNama_bayi());
                intent.putExtra("anak_ke", Kesehatan_imunisasi_anak.this.model.get(i).getAnak_ke());
                Kesehatan_imunisasi_anak.this.startActivity(intent);
            }
        });
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Kesehatan_imunisasi_anak.this.cari_data(charSequence.toString());
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
        finish();
    }

    /* access modifiers changed from: package-private */
    public void cari_data(String data) {
        final String str = data;
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/carikesehatanimunisasianak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("kesehatanimunisasianak");
                    Kesehatan_imunisasi_anak.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Kesehatan_imunisasi_anak.this.model.add(new GetKesehatanImunisasiAnak(getData.getInt("id"), getData.getString("nama_anak"), getData.getString("nama_ibu"), getData.getString("nik_ibu"), getData.getString("nama_ayah"), getData.getString("anak_ke")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Kesehatan_imunisasi_anak.this.adaptor = new AdaptorDataKesehatanImunisasiAnak(Kesehatan_imunisasi_anak.this.getApplicationContext(), Kesehatan_imunisasi_anak.this.model);
                Kesehatan_imunisasi_anak.this.listView.setAdapter(Kesehatan_imunisasi_anak.this.adaptor);
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
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/imunisasianak", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("imunisasianak2");
                    Kesehatan_imunisasi_anak.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        Kesehatan_imunisasi_anak.this.model.add(new GetKesehatanImunisasiAnak(getData.getInt("id"), getData.getString("nama_anak"), getData.getString("nama_ibu"), getData.getString("nik_ibu"), getData.getString("nama_ayah"), getData.getString("anak_ke")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Kesehatan_imunisasi_anak.this.adaptor = new AdaptorDataKesehatanImunisasiAnak(Kesehatan_imunisasi_anak.this.getApplicationContext(), Kesehatan_imunisasi_anak.this.model);
                Kesehatan_imunisasi_anak.this.listView.setAdapter(Kesehatan_imunisasi_anak.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
