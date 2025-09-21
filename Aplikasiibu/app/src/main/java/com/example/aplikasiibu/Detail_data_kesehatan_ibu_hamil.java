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
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDetailDataKesehatanIbuHamil.AdaptorDetailDataKesehatanIbuHamil;
import com.example.aplikasiibu.AdapterDetailDataKesehatanIbuHamil.GetDetailDataKesehatanIbuHamil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Detail_data_kesehatan_ibu_hamil extends AppCompatActivity {
    public static String kosong;
    public static String namaibu;
    public static String nikibu;
    AdaptorDetailDataKesehatanIbuHamil adaptor;
    ImageView butonlogout;
    EditText cari;
    ListView listView;
    ArrayList<GetDetailDataKesehatanIbuHamil> model;
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
        setContentView((int) R.layout.activity_detail_data_kesehatan_ibu_hamil);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.cari = (EditText) findViewById(R.id.cari);
        this.webview1 = (WebView) findViewById(R.id.webview1);
        this.spinner = (Spinner) findViewById(R.id.spinner_pilih_data_kesehatan_ibu);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.spinner.setSelection(0, true);
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
            this.webview1.loadUrl(new Configurasi().baseUrl() + "cetakkesehatanibuhamil/" + getIntent().getIntExtra("UploadTaskParameters.Companion.CodingKeys.id", 0) + "?kehamilan_keberapa=" + getIntent().getStringExtra("kehamilan_ke"));
            ((PrintManager) getSystemService(Context.PRINT_SERVICE)).print("Document", this.webview1.createPrintDocumentAdapter(), new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.ISO_A4).setColorMode(PrintAttributes.COLOR_MODE_COLOR).build());
        }
        this.cari.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Detail_data_kesehatan_ibu_hamil.this.cari_data(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {
            }
        });
        cari_data(kosong);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_data_kesehatan_ibu_hamil.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_data_kesehatan_ibu_hamil.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Detail_data_kesehatan_ibu_hamil.this.startActivity(intent);
                        Detail_data_kesehatan_ibu_hamil.this.finish();
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
        if (getIntent().hasExtra("dataid")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage((CharSequence) "Apakah Ingin Menghapus?");
            builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int position) {
                    Detail_data_kesehatan_ibu_hamil.this.hapusData();
                }
            });
            builder.setNegativeButton((CharSequence) "Tidak", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.create().show();
        }
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Detail_data_kesehatan_ibu_hamil.this.getApplicationContext(), CatatanKesehatanIbuHamil.class);
                intent.putExtra("detail_data_kesehatan_ibuhamil", Data_kesehatan_ibu.id_data_kesehatan_ibu_hamil);
                intent.putExtra("nik_ibu", Detail_data_kesehatan_ibu_hamil.this.model.get(i).getNik_ibu());
                intent.putExtra("kehamilan_ke", Detail_data_kesehatan_ibu_hamil.this.model.get(i).getKehamilan_ke());
                Detail_data_kesehatan_ibu_hamil.this.startActivity(intent);
            }
        });
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Detail_data_kesehatan_ibu_hamil.this.finish();
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
        Volley.newRequestQueue(this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/caridetailkesehatanibuhamil", new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("detailkesehatanibuhamil");
                    Detail_data_kesehatan_ibu_hamil.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetDetailDataKesehatanIbuHamil> arrayList = Detail_data_kesehatan_ibu_hamil.this.model;
                        JSONObject jsonObject2 = jsonObject;
                        GetDetailDataKesehatanIbuHamil getDetailDataKesehatanIbuHamil2 = new GetDetailDataKesehatanIbuHamil(getData.getInt("id"), getData.getString("nik_ibu"), getData.getString("kehamilan_ke"), getData.getString("hari_pertama_haid_terakhir"), getData.getString("hari_taksiran_persalinan"), getData.getString("golongan_darah"), getData.getString("penggunaan_kontrasepsi_sebelum_hamil"), getData.getString("riwayat_penyakit_yg_di_derita_ibu"), getData.getString("riwayat_alergi"), getData.getString("status_imunisasi_tetanus_terakhir"), getData.getString("tinggi_badan"));
                        arrayList.add(getDetailDataKesehatanIbuHamil2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    Detail_data_kesehatan_ibu_hamil.this.adaptor = new AdaptorDetailDataKesehatanIbuHamil(Detail_data_kesehatan_ibu_hamil.this.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.this.model);
                    Detail_data_kesehatan_ibu_hamil.this.listView.setAdapter(Detail_data_kesehatan_ibu_hamil.this.adaptor);
                }
                Detail_data_kesehatan_ibu_hamil.this.adaptor = new AdaptorDetailDataKesehatanIbuHamil(Detail_data_kesehatan_ibu_hamil.this.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.this.model);
                Detail_data_kesehatan_ibu_hamil.this.listView.setAdapter(Detail_data_kesehatan_ibu_hamil.this.adaptor);
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
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/lihatdatakesehatanibuhamil/" + HalamanLogin.nik_ibu, new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("datakesehatanibuhamil");
                    Detail_data_kesehatan_ibu_hamil.this.model = new ArrayList<>();
                    int i = 0;
                    while (i <= jsonArray.length()) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        ArrayList<GetDetailDataKesehatanIbuHamil> arrayList = Detail_data_kesehatan_ibu_hamil.this.model;
                        JSONObject jsonObject2 = jsonObject;
                        GetDetailDataKesehatanIbuHamil getDetailDataKesehatanIbuHamil2 = new GetDetailDataKesehatanIbuHamil(getData.getInt("id"), getData.getString("nik_ibu"), getData.getString("kehamilan_ke"), getData.getString("hari_pertama_haid_terakhir"), getData.getString("hari_taksiran_persalinan"), getData.getString("golongan_darah"), getData.getString("penggunaan_kontrasepsi_sebelum_hamil"), getData.getString("riwayat_penyakit_yg_di_derita_ibu"), getData.getString("riwayat_alergi"), getData.getString("status_imunisasi_tetanus_terakhir"), getData.getString("tinggi_badan"));
                        arrayList.add(getDetailDataKesehatanIbuHamil2);
                        i++;
                        jsonObject = jsonObject2;
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    Detail_data_kesehatan_ibu_hamil.this.adaptor = new AdaptorDetailDataKesehatanIbuHamil(Detail_data_kesehatan_ibu_hamil.this.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.this.model);
                    Detail_data_kesehatan_ibu_hamil.this.listView.setAdapter(Detail_data_kesehatan_ibu_hamil.this.adaptor);
                }
                Detail_data_kesehatan_ibu_hamil.this.adaptor = new AdaptorDetailDataKesehatanIbuHamil(Detail_data_kesehatan_ibu_hamil.this.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.this.model);
                Detail_data_kesehatan_ibu_hamil.this.listView.setAdapter(Detail_data_kesehatan_ibu_hamil.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public void hapusData() {
        Volley.newRequestQueue(this).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapusdatakesehatanibuhamil/" + getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Detail_data_kesehatan_ibu_hamil.this.getApplicationContext());
                        builder.setTitle((CharSequence) "Sukses");
                        builder.setMessage((CharSequence) "Berhasil Terhapus");
                        builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Detail_data_kesehatan_ibu_hamil.this.finish();
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
