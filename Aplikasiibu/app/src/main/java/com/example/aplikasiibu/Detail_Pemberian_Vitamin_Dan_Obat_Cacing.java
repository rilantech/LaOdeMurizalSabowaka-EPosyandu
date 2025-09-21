package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Detail_Pemberian_Vitamin_Dan_Obat_Cacing extends AppCompatActivity {
    TextView anak_ke;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxkapsul_biru_1;
    EditText etxkapsul_biru_2;
    EditText etxkapsul_biru_3;
    EditText etxkapsul_merah_1;
    EditText etxkapsul_merah_2;
    EditText etxkapsul_merah_3;
    EditText etxkapsul_merah_4;
    EditText etxkapsul_merah_5;
    EditText etxkapsul_merah_6;
    EditText etxobat_cacing_1;
    EditText etxobat_cacing_2;
    EditText etxobat_cacing_3;
    TextView nama_anak;
    TextView nama_ibu;
    TextView nik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_pemberian_vitamin_dan_obat_cacing);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.etxkapsul_biru_1 = (EditText) findViewById(R.id.etxkapsul_biru_1);
        this.etxkapsul_biru_2 = (EditText) findViewById(R.id.etxkapsul_biru_2);
        this.etxkapsul_biru_3 = (EditText) findViewById(R.id.etxkapsul_biru_3);
        this.etxkapsul_merah_1 = (EditText) findViewById(R.id.etxkapsul_merah_1);
        this.etxkapsul_merah_2 = (EditText) findViewById(R.id.etxkapsul_merah_2);
        this.etxkapsul_merah_3 = (EditText) findViewById(R.id.etxkapsul_merah_3);
        this.etxkapsul_merah_4 = (EditText) findViewById(R.id.etxkapsul_merah_4);
        this.etxkapsul_merah_5 = (EditText) findViewById(R.id.etxkapsul_merah_5);
        this.etxkapsul_merah_6 = (EditText) findViewById(R.id.etxkapsul_merah_6);
        this.etxobat_cacing_1 = (EditText) findViewById(R.id.etxobat_cacing_1);
        this.etxobat_cacing_2 = (EditText) findViewById(R.id.etxobat_cacing_2);
        this.etxobat_cacing_3 = (EditText) findViewById(R.id.etxobat_cacing_3);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.startActivity(intent);
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
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
                Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.startActivity(new Intent(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.getApplicationContext(), Pemberian_vitamin_dan_obat_cacing.class));
                Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
            }
        });
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.anak_ke.setText(getIntent().getStringExtra("anak_ke"));
        if (getIntent().hasExtra("detail_pemberian_vitamin_dan_obat_cacing")) {
            getData();
        }
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/detailpemberianvitamindanobatcacing/" + getIntent().getIntExtra("detail_pemberian_vitamin_dan_obat_cacing", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("detailpemberianvitamindanobatcacing");
                    String gkapsul_biru_1 = jsonObject.getString("kapsul_biru_1");
                    String gkapsul_biru_2 = jsonObject.getString("kapsul_biru_2");
                    String gkapsul_biru_3 = jsonObject.getString("kapsul_biru_3");
                    String gkapsul_merah_1 = jsonObject.getString("kapsul_merah_1");
                    String gkapsul_merah_2 = jsonObject.getString("kapsul_merah_2");
                    String gkapsul_merah_3 = jsonObject.getString("kapsul_merah_3");
                    String gkapsul_merah_4 = jsonObject.getString("kapsul_merah_4");
                    String gkapsul_merah_5 = jsonObject.getString("kapsul_merah_5");
                    String gkapsul_merah_6 = jsonObject.getString("kapsul_merah_6");
                    String gobat_cacing_1 = jsonObject.getString("obat_cacing_1");
                    String gobat_cacing_2 = jsonObject.getString("obat_cacing_2");
                    String gobat_cacing_3 = jsonObject.getString("obat_cacing_3");
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_1.setText(gkapsul_biru_1);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_2.setText(gkapsul_biru_2);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_3.setText(gkapsul_biru_3);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_1.setText(gkapsul_merah_1);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_2.setText(gkapsul_merah_2);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_3.setText(gkapsul_merah_3);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_4.setText(gkapsul_merah_4);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_5.setText(gkapsul_merah_5);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_6.setText(gkapsul_merah_6);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_1.setText(gobat_cacing_1);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_2.setText(gobat_cacing_2);
                    Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_3.setText(gobat_cacing_3);
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
