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

public class Detail_kesehatan_imunisasi_anak extends AppCompatActivity {
    TextView anak_ke;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxbcg_0;
    EditText etxbcg_1;
    EditText etxbcg_10;
    EditText etxbcg_11;
    EditText etxbcg_12;
    EditText etxbcg_2;
    EditText etxbcg_3;
    EditText etxbcg_4;
    EditText etxbcg_5;
    EditText etxbcg_6;
    EditText etxbcg_7;
    EditText etxbcg_8;
    EditText etxbcg_9;
    EditText etxdan_lain_lain_0;
    EditText etxdan_lain_lain_1;
    EditText etxdan_lain_lain_10;
    EditText etxdan_lain_lain_11;
    EditText etxdan_lain_lain_12;
    EditText etxdan_lain_lain_2;
    EditText etxdan_lain_lain_3;
    EditText etxdan_lain_lain_4;
    EditText etxdan_lain_lain_5;
    EditText etxdan_lain_lain_6;
    EditText etxdan_lain_lain_7;
    EditText etxdan_lain_lain_8;
    EditText etxdan_lain_lain_9;
    EditText etxhepatitis_0;
    EditText etxhepatitis_1;
    EditText etxhepatitis_10;
    EditText etxhepatitis_11;
    EditText etxhepatitis_12;
    EditText etxhepatitis_2;
    EditText etxhepatitis_3;
    EditText etxhepatitis_4;
    EditText etxhepatitis_5;
    EditText etxhepatitis_6;
    EditText etxhepatitis_7;
    EditText etxhepatitis_8;
    EditText etxhepatitis_9;
    EditText etxpolio_tetes_0;
    EditText etxpolio_tetes_1;
    EditText etxpolio_tetes_10;
    EditText etxpolio_tetes_11;
    EditText etxpolio_tetes_12;
    EditText etxpolio_tetes_2;
    EditText etxpolio_tetes_3;
    EditText etxpolio_tetes_4;
    EditText etxpolio_tetes_5;
    EditText etxpolio_tetes_6;
    EditText etxpolio_tetes_7;
    EditText etxpolio_tetes_8;
    EditText etxpolio_tetes_9;
    TextView nama_anak;
    TextView nama_ibu;
    TextView nik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_kesehatan_imunisasi_anak);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.etxhepatitis_0 = (EditText) findViewById(R.id.etxhepatitis_0);
        this.etxhepatitis_1 = (EditText) findViewById(R.id.etxhepatitis_1);
        this.etxhepatitis_2 = (EditText) findViewById(R.id.etxhepatitis_2);
        this.etxhepatitis_3 = (EditText) findViewById(R.id.etxhepatitis_3);
        this.etxhepatitis_4 = (EditText) findViewById(R.id.etxhepatitis_4);
        this.etxhepatitis_5 = (EditText) findViewById(R.id.etxhepatitis_5);
        this.etxhepatitis_6 = (EditText) findViewById(R.id.etxhepatitis_6);
        this.etxhepatitis_7 = (EditText) findViewById(R.id.etxhepatitis_7);
        this.etxhepatitis_8 = (EditText) findViewById(R.id.etxhepatitis_8);
        this.etxhepatitis_9 = (EditText) findViewById(R.id.etxhepatitis_9);
        this.etxhepatitis_10 = (EditText) findViewById(R.id.etxhepatitis_10);
        this.etxhepatitis_11 = (EditText) findViewById(R.id.etxhepatitis_11);
        this.etxhepatitis_12 = (EditText) findViewById(R.id.etxhepatitis_12);
        this.etxbcg_0 = (EditText) findViewById(R.id.etxbcg_0);
        this.etxbcg_1 = (EditText) findViewById(R.id.etxbcg_1);
        this.etxbcg_2 = (EditText) findViewById(R.id.etxbcg_2);
        this.etxbcg_3 = (EditText) findViewById(R.id.etxbcg_3);
        this.etxbcg_4 = (EditText) findViewById(R.id.etxbcg_4);
        this.etxbcg_5 = (EditText) findViewById(R.id.etxbcg_5);
        this.etxbcg_6 = (EditText) findViewById(R.id.etxbcg_6);
        this.etxbcg_7 = (EditText) findViewById(R.id.etxbcg_7);
        this.etxbcg_8 = (EditText) findViewById(R.id.etxbcg_8);
        this.etxbcg_9 = (EditText) findViewById(R.id.etxbcg_9);
        this.etxbcg_10 = (EditText) findViewById(R.id.etxbcg_10);
        this.etxbcg_11 = (EditText) findViewById(R.id.etxbcg_11);
        this.etxbcg_12 = (EditText) findViewById(R.id.etxbcg_12);
        this.etxpolio_tetes_0 = (EditText) findViewById(R.id.etxpolio_tetes_0);
        this.etxpolio_tetes_1 = (EditText) findViewById(R.id.etxpolio_tetes_1);
        this.etxpolio_tetes_2 = (EditText) findViewById(R.id.etxpolio_tetes_2);
        this.etxpolio_tetes_3 = (EditText) findViewById(R.id.etxpolio_tetes_3);
        this.etxpolio_tetes_4 = (EditText) findViewById(R.id.etxpolio_tetes_4);
        this.etxpolio_tetes_5 = (EditText) findViewById(R.id.etxpolio_tetes_5);
        this.etxpolio_tetes_6 = (EditText) findViewById(R.id.etxpolio_tetes_6);
        this.etxpolio_tetes_7 = (EditText) findViewById(R.id.etxpolio_tetes_7);
        this.etxpolio_tetes_8 = (EditText) findViewById(R.id.etxpolio_tetes_8);
        this.etxpolio_tetes_9 = (EditText) findViewById(R.id.etxpolio_tetes_9);
        this.etxpolio_tetes_10 = (EditText) findViewById(R.id.etxpolio_tetes_10);
        this.etxpolio_tetes_11 = (EditText) findViewById(R.id.etxpolio_tetes_11);
        this.etxpolio_tetes_12 = (EditText) findViewById(R.id.etxpolio_tetes_12);
        this.etxdan_lain_lain_0 = (EditText) findViewById(R.id.etxdan_lain_lain_0);
        this.etxdan_lain_lain_1 = (EditText) findViewById(R.id.etxdan_lain_lain_1);
        this.etxdan_lain_lain_2 = (EditText) findViewById(R.id.etxdan_lain_lain_2);
        this.etxdan_lain_lain_3 = (EditText) findViewById(R.id.etxdan_lain_lain_3);
        this.etxdan_lain_lain_4 = (EditText) findViewById(R.id.etxdan_lain_lain_4);
        this.etxdan_lain_lain_5 = (EditText) findViewById(R.id.etxdan_lain_lain_5);
        this.etxdan_lain_lain_6 = (EditText) findViewById(R.id.etxdan_lain_lain_6);
        this.etxdan_lain_lain_7 = (EditText) findViewById(R.id.etxdan_lain_lain_7);
        this.etxdan_lain_lain_8 = (EditText) findViewById(R.id.etxdan_lain_lain_8);
        this.etxdan_lain_lain_9 = (EditText) findViewById(R.id.etxdan_lain_lain_9);
        this.etxdan_lain_lain_10 = (EditText) findViewById(R.id.etxdan_lain_lain_10);
        this.etxdan_lain_lain_11 = (EditText) findViewById(R.id.etxdan_lain_lain_11);
        this.etxdan_lain_lain_12 = (EditText) findViewById(R.id.etxdan_lain_lain_12);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(HalamanLogin.namapetugas);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_kesehatan_imunisasi_anak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_kesehatan_imunisasi_anak.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        Detail_kesehatan_imunisasi_anak.this.startActivity(intent);
                        Detail_kesehatan_imunisasi_anak.this.finish();
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
                Detail_kesehatan_imunisasi_anak.this.startActivity(new Intent(Detail_kesehatan_imunisasi_anak.this.getApplicationContext(), Kesehatan_imunisasi_anak.class));
                Detail_kesehatan_imunisasi_anak.this.finish();
            }
        });
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.anak_ke.setText(getIntent().getStringExtra("anak_ke"));
        if (getIntent().hasExtra("detail_kesehatan_imunisasi_anak")) {
            getData();
        }
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/detailkesehatanimunisasianak/" + getIntent().getIntExtra("detail_kesehatan_imunisasi_anak", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("detailkesehatanimunisasianak");
                    String ghepatitis_0 = jsonObject.getString("hepatitis_0");
                    String ghepatitis_1 = jsonObject.getString("hepatitis_1");
                    String ghepatitis_2 = jsonObject.getString("hepatitis_2");
                    String ghepatitis_3 = jsonObject.getString("hepatitis_3");
                    String ghepatitis_4 = jsonObject.getString("hepatitis_4");
                    String ghepatitis_5 = jsonObject.getString("hepatitis_5");
                    String ghepatitis_6 = jsonObject.getString("hepatitis_6");
                    String ghepatitis_7 = jsonObject.getString("hepatitis_7");
                    String ghepatitis_8 = jsonObject.getString("hepatitis_8");
                    String ghepatitis_9 = jsonObject.getString("hepatitis_9");
                    String ghepatitis_10 = jsonObject.getString("hepatitis_10");
                    String ghepatitis_11 = jsonObject.getString("hepatitis_11");
                    String ghepatitis_12 = jsonObject.getString("hepatitis_12");
                    String gbcg_0 = jsonObject.getString("bcg_0");
                    String gbcg_1 = jsonObject.getString("bcg_1");
                    String gbcg_2 = jsonObject.getString("bcg_2");
                    String gbcg_3 = jsonObject.getString("bcg_3");
                    String gbcg_4 = jsonObject.getString("bcg_4");
                    String gbcg_5 = jsonObject.getString("bcg_5");
                    String gbcg_6 = jsonObject.getString("bcg_6");
                    String gbcg_7 = jsonObject.getString("bcg_7");
                    String gbcg_8 = jsonObject.getString("bcg_8");
                    String gbcg_9 = jsonObject.getString("bcg_9");
                    String gbcg_10 = jsonObject.getString("bcg_10");
                    String gbcg_11 = jsonObject.getString("bcg_11");
                    String gbcg_12 = jsonObject.getString("bcg_12");
                    String gpolio_tetes_0 = jsonObject.getString("polio_tetes_0");
                    String gpolio_tetes_1 = jsonObject.getString("polio_tetes_1");
                    String gpolio_tetes_2 = jsonObject.getString("polio_tetes_2");
                    String gpolio_tetes_3 = jsonObject.getString("polio_tetes_3");
                    String gpolio_tetes_4 = jsonObject.getString("polio_tetes_4");
                    String gpolio_tetes_5 = jsonObject.getString("polio_tetes_5");
                    String gpolio_tetes_6 = jsonObject.getString("polio_tetes_6");
                    String gpolio_tetes_7 = jsonObject.getString("polio_tetes_7");
                    String gpolio_tetes_8 = jsonObject.getString("polio_tetes_8");
                    String gpolio_tetes_9 = jsonObject.getString("polio_tetes_9");
                    String gpolio_tetes_10 = jsonObject.getString("polio_tetes_10");
                    String gpolio_tetes_11 = jsonObject.getString("polio_tetes_11");
                    String gpolio_tetes_12 = jsonObject.getString("polio_tetes_12");
                    String gdan_lain_lain_0 = jsonObject.getString("dan_lain_lain_0");
                    String gdan_lain_lain_1 = jsonObject.getString("dan_lain_lain_1");
                    String gdan_lain_lain_2 = jsonObject.getString("dan_lain_lain_2");
                    String gdan_lain_lain_3 = jsonObject.getString("dan_lain_lain_3");
                    String gdan_lain_lain_4 = jsonObject.getString("dan_lain_lain_4");
                    String gdan_lain_lain_5 = jsonObject.getString("dan_lain_lain_5");
                    String gdan_lain_lain_6 = jsonObject.getString("dan_lain_lain_6");
                    String gdan_lain_lain_7 = jsonObject.getString("dan_lain_lain_7");
                    String gdan_lain_lain_8 = jsonObject.getString("dan_lain_lain_8");
                    String gdan_lain_lain_9 = jsonObject.getString("dan_lain_lain_9");
                    String gdan_lain_lain_10 = jsonObject.getString("dan_lain_lain_10");
                    String gdan_lain_lain_11 = jsonObject.getString("dan_lain_lain_11");
                    String gdan_lain_lain_12 = jsonObject.getString("dan_lain_lain_12");
                    JSONObject jSONObject = jsonObject;
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_0.setText(ghepatitis_0);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_1.setText(ghepatitis_1);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_2.setText(ghepatitis_2);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_3.setText(ghepatitis_3);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_4.setText(ghepatitis_4);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_5.setText(ghepatitis_5);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_6.setText(ghepatitis_6);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_7.setText(ghepatitis_7);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_8.setText(ghepatitis_8);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_9.setText(ghepatitis_9);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_10.setText(ghepatitis_10);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_11.setText(ghepatitis_11);
                    Detail_kesehatan_imunisasi_anak.this.etxhepatitis_12.setText(ghepatitis_12);
                    String str = ghepatitis_0;
                    String gbcg_02 = gbcg_0;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_0.setText(gbcg_02);
                    String str2 = gbcg_02;
                    String gbcg_03 = gbcg_1;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_1.setText(gbcg_03);
                    String str3 = gbcg_03;
                    String gbcg_13 = gbcg_2;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_2.setText(gbcg_13);
                    String str4 = gbcg_13;
                    String gbcg_22 = gbcg_3;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_3.setText(gbcg_22);
                    String str5 = gbcg_22;
                    String gbcg_42 = gbcg_4;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_4.setText(gbcg_42);
                    String str6 = gbcg_42;
                    String gbcg_43 = gbcg_5;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_5.setText(gbcg_43);
                    String str7 = gbcg_43;
                    String gbcg_52 = gbcg_6;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_6.setText(gbcg_52);
                    String str8 = gbcg_52;
                    String gbcg_62 = gbcg_7;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_7.setText(gbcg_62);
                    String str9 = gbcg_62;
                    String gbcg_82 = gbcg_8;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_8.setText(gbcg_82);
                    String str10 = gbcg_82;
                    String gbcg_83 = gbcg_9;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_9.setText(gbcg_83);
                    String str11 = gbcg_83;
                    String gbcg_102 = gbcg_10;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_10.setText(gbcg_102);
                    String str12 = gbcg_102;
                    String gbcg_103 = gbcg_11;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_11.setText(gbcg_103);
                    String str13 = gbcg_103;
                    String gbcg_122 = gbcg_12;
                    Detail_kesehatan_imunisasi_anak.this.etxbcg_12.setText(gbcg_122);
                    String str14 = gbcg_122;
                    String gbcg_123 = gpolio_tetes_0;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_0.setText(gbcg_123);
                    String str15 = gbcg_123;
                    String gpolio_tetes_13 = gpolio_tetes_1;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_1.setText(gpolio_tetes_13);
                    String str16 = gpolio_tetes_13;
                    String gpolio_tetes_14 = gpolio_tetes_2;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_2.setText(gpolio_tetes_14);
                    String str17 = gpolio_tetes_14;
                    String gpolio_tetes_22 = gpolio_tetes_3;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_3.setText(gpolio_tetes_22);
                    String str18 = gpolio_tetes_22;
                    String gpolio_tetes_32 = gpolio_tetes_4;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_4.setText(gpolio_tetes_32);
                    String str19 = gpolio_tetes_32;
                    String gpolio_tetes_52 = gpolio_tetes_5;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_5.setText(gpolio_tetes_52);
                    String str20 = gpolio_tetes_52;
                    String gpolio_tetes_53 = gpolio_tetes_6;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_6.setText(gpolio_tetes_53);
                    String str21 = gpolio_tetes_53;
                    String gpolio_tetes_62 = gpolio_tetes_7;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_7.setText(gpolio_tetes_62);
                    String str22 = gpolio_tetes_62;
                    String gpolio_tetes_72 = gpolio_tetes_8;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_8.setText(gpolio_tetes_72);
                    String str23 = gpolio_tetes_72;
                    String gpolio_tetes_92 = gpolio_tetes_9;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_9.setText(gpolio_tetes_92);
                    String str24 = gpolio_tetes_92;
                    String gpolio_tetes_93 = gpolio_tetes_10;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_10.setText(gpolio_tetes_93);
                    String str25 = gpolio_tetes_93;
                    String gpolio_tetes_102 = gpolio_tetes_11;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_11.setText(gpolio_tetes_102);
                    String str26 = gpolio_tetes_102;
                    String gpolio_tetes_122 = gpolio_tetes_12;
                    Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_12.setText(gpolio_tetes_122);
                    String str27 = gpolio_tetes_122;
                    String gpolio_tetes_123 = gdan_lain_lain_0;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_0.setText(gpolio_tetes_123);
                    String str28 = gpolio_tetes_123;
                    String gdan_lain_lain_13 = gdan_lain_lain_1;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_1.setText(gdan_lain_lain_13);
                    String str29 = gdan_lain_lain_13;
                    String gdan_lain_lain_22 = gdan_lain_lain_2;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_2.setText(gdan_lain_lain_22);
                    String str30 = gdan_lain_lain_22;
                    String gdan_lain_lain_23 = gdan_lain_lain_3;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_3.setText(gdan_lain_lain_23);
                    String str31 = gdan_lain_lain_23;
                    String gdan_lain_lain_42 = gdan_lain_lain_4;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_4.setText(gdan_lain_lain_42);
                    String str32 = gdan_lain_lain_42;
                    String gdan_lain_lain_52 = gdan_lain_lain_5;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_5.setText(gdan_lain_lain_52);
                    String str33 = gdan_lain_lain_52;
                    String gdan_lain_lain_62 = gdan_lain_lain_6;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_6.setText(gdan_lain_lain_62);
                    String str34 = gdan_lain_lain_62;
                    String gdan_lain_lain_63 = gdan_lain_lain_7;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_7.setText(gdan_lain_lain_63);
                    String str35 = gdan_lain_lain_63;
                    String gdan_lain_lain_82 = gdan_lain_lain_8;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_8.setText(gdan_lain_lain_82);
                    String str36 = gdan_lain_lain_82;
                    String gdan_lain_lain_92 = gdan_lain_lain_9;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_9.setText(gdan_lain_lain_92);
                    String str37 = gdan_lain_lain_92;
                    String gdan_lain_lain_93 = gdan_lain_lain_10;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_10.setText(gdan_lain_lain_93);
                    String str38 = gdan_lain_lain_93;
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_11.setText(gdan_lain_lain_11);
                    Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_12.setText(gdan_lain_lain_12);
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
