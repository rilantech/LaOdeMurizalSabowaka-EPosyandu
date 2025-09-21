package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
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
    TextView nama_ibu, nama_ayah;
    TextView nik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_kesehatan_imunisasi_anak);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah = (TextView) findViewById(R.id.nama_ayah);
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
        textView.setText(Halaman_Login.namapetugas);
        etxhepatitis_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog0();
            }
        });
        etxhepatitis_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        etxhepatitis_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        etxhepatitis_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog3();
            }
        });
        etxhepatitis_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog4();
            }
        });
        etxhepatitis_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog5();
            }
        });
        etxhepatitis_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog6();
            }
        });
        etxhepatitis_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog7();
            }
        });
        etxhepatitis_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog8();
            }
        });
        etxhepatitis_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog9();
            }
        });
        etxhepatitis_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog10();
            }
        });
        etxhepatitis_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog11();
            }
        });
        etxhepatitis_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog12();
            }
        });
        etxbcg_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog13();
            }
        });
        etxbcg_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog14();
            }
        });
        etxbcg_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog15();
            }
        });
        etxbcg_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog16();
            }
        });
        etxbcg_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog17();
            }
        });
        etxbcg_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog18();
            }
        });
        etxbcg_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog19();
            }
        });
        etxbcg_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog20();
            }
        });
        etxbcg_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog21();
            }
        });
        etxbcg_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog22();
            }
        });
        etxbcg_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog23();
            }
        });
        etxbcg_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog24();
            }
        });
        etxbcg_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog25();
            }
        });

        etxpolio_tetes_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog26();
            }
        });
        etxpolio_tetes_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog27();
            }
        });
        etxpolio_tetes_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog28();
            }
        });
        etxpolio_tetes_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog29();
            }
        });
        etxpolio_tetes_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog30();
            }
        });
        etxpolio_tetes_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog31();
            }
        });
        etxpolio_tetes_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog32();
            }
        });
        etxpolio_tetes_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog33();
            }
        });

        etxpolio_tetes_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog34();
            }
        });
        etxpolio_tetes_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog35();
            }
        });
        etxpolio_tetes_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog36();
            }
        });
        etxpolio_tetes_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog37();
            }
        });
        etxpolio_tetes_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog38();
            }
        });

        etxdan_lain_lain_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog39();
            }
        });
        etxdan_lain_lain_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog40();
            }
        });
        etxdan_lain_lain_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog41();
            }
        });
        etxdan_lain_lain_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog42();
            }
        });
        etxdan_lain_lain_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog43();
            }
        });
        etxdan_lain_lain_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog44();
            }
        });
        etxdan_lain_lain_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog45();
            }
        });
        etxdan_lain_lain_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog46();
            }
        });
        etxdan_lain_lain_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog47();
            }
        });
        etxdan_lain_lain_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog48();
            }
        });
        etxdan_lain_lain_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog49();
            }
        });
        etxdan_lain_lain_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog50();
            }
        });
        etxdan_lain_lain_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog51();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_kesehatan_imunisasi_anak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_kesehatan_imunisasi_anak.this, Halaman_Login.class);
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
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nama_ayah.setText(getIntent().getStringExtra("nama_ayah"));
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.anak_ke.setText(getIntent().getStringExtra("anak_ke"));
        if (getIntent().hasExtra("detail_kesehatan_imunisasi_anak")) {
            getData();
        }
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Volley.newRequestQueue(Detail_kesehatan_imunisasi_anak.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatekesehatanimunisasianak/" + Detail_kesehatan_imunisasi_anak.this.getIntent().getIntExtra("detail_kesehatan_imunisasi_anak", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_kesehatan_imunisasi_anak.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Terupdate");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Detail_kesehatan_imunisasi_anak.this.finish();
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
                        Toast.makeText(Detail_kesehatan_imunisasi_anak.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Detail_kesehatan_imunisasi_anak.this.nik_ibu.getText().toString());
                        myParams.put("nama_ibu", Detail_kesehatan_imunisasi_anak.this.nama_ibu.getText().toString());
                        myParams.put("nama_anak", Detail_kesehatan_imunisasi_anak.this.nama_anak.getText().toString());
                        myParams.put("anak_ke", Detail_kesehatan_imunisasi_anak.this.anak_ke.getText().toString());
                        myParams.put("hepatitis_0", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_0.getText().toString());
                        myParams.put("hepatitis_1", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_1.getText().toString());
                        myParams.put("hepatitis_2", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_2.getText().toString());
                        myParams.put("hepatitis_3", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_3.getText().toString());
                        myParams.put("hepatitis_4", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_4.getText().toString());
                        myParams.put("hepatitis_5", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_5.getText().toString());
                        myParams.put("hepatitis_6", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_6.getText().toString());
                        myParams.put("hepatitis_7", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_7.getText().toString());
                        myParams.put("hepatitis_8", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_8.getText().toString());
                        myParams.put("hepatitis_9", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_9.getText().toString());
                        myParams.put("hepatitis_10", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_10.getText().toString());
                        myParams.put("hepatitis_11", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_11.getText().toString());
                        myParams.put("hepatitis_12", Detail_kesehatan_imunisasi_anak.this.etxhepatitis_12.getText().toString());
                        myParams.put("bcg_0", Detail_kesehatan_imunisasi_anak.this.etxbcg_0.getText().toString());
                        myParams.put("bcg_1", Detail_kesehatan_imunisasi_anak.this.etxbcg_1.getText().toString());
                        myParams.put("bcg_2", Detail_kesehatan_imunisasi_anak.this.etxbcg_2.getText().toString());
                        myParams.put("bcg_3", Detail_kesehatan_imunisasi_anak.this.etxbcg_3.getText().toString());
                        myParams.put("bcg_4", Detail_kesehatan_imunisasi_anak.this.etxbcg_4.getText().toString());
                        myParams.put("bcg_5", Detail_kesehatan_imunisasi_anak.this.etxbcg_5.getText().toString());
                        myParams.put("bcg_6", Detail_kesehatan_imunisasi_anak.this.etxbcg_6.getText().toString());
                        myParams.put("bcg_7", Detail_kesehatan_imunisasi_anak.this.etxbcg_7.getText().toString());
                        myParams.put("bcg_8", Detail_kesehatan_imunisasi_anak.this.etxbcg_8.getText().toString());
                        myParams.put("bcg_9", Detail_kesehatan_imunisasi_anak.this.etxbcg_9.getText().toString());
                        myParams.put("bcg_10", Detail_kesehatan_imunisasi_anak.this.etxbcg_10.getText().toString());
                        myParams.put("bcg_11", Detail_kesehatan_imunisasi_anak.this.etxbcg_11.getText().toString());
                        myParams.put("bcg_12", Detail_kesehatan_imunisasi_anak.this.etxbcg_12.getText().toString());
                        myParams.put("polio_tetes_0", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_0.getText().toString());
                        myParams.put("polio_tetes_1", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_1.getText().toString());
                        myParams.put("polio_tetes_2", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_2.getText().toString());
                        myParams.put("polio_tetes_3", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_3.getText().toString());
                        myParams.put("polio_tetes_4", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_4.getText().toString());
                        myParams.put("polio_tetes_5", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_5.getText().toString());
                        myParams.put("polio_tetes_6", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_6.getText().toString());
                        myParams.put("polio_tetes_7", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_7.getText().toString());
                        myParams.put("polio_tetes_8", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_8.getText().toString());
                        myParams.put("polio_tetes_9", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_9.getText().toString());
                        myParams.put("polio_tetes_10", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_10.getText().toString());
                        myParams.put("polio_tetes_11", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_11.getText().toString());
                        myParams.put("polio_tetes_12", Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_12.getText().toString());
                        myParams.put("dan_lain_lain_0", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_0.getText().toString());
                        myParams.put("dan_lain_lain_1", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_1.getText().toString());
                        myParams.put("dan_lain_lain_2", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_2.getText().toString());
                        myParams.put("dan_lain_lain_3", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_3.getText().toString());
                        myParams.put("dan_lain_lain_4", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_4.getText().toString());
                        myParams.put("dan_lain_lain_5", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_5.getText().toString());
                        myParams.put("dan_lain_lain_6", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_6.getText().toString());
                        myParams.put("dan_lain_lain_7", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_7.getText().toString());
                        myParams.put("dan_lain_lain_8", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_8.getText().toString());
                        myParams.put("dan_lain_lain_9", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_9.getText().toString());
                        myParams.put("dan_lain_lain_10", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_10.getText().toString());
                        myParams.put("dan_lain_lain_11", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_11.getText().toString());
                        myParams.put("dan_lain_lain_12", Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_12.getText().toString());
                        return myParams;
                    }
                });
            }
        });
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
                    if(ghepatitis_0 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_0.setText("-");
                    }else if(ghepatitis_0.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_0.setText("-");
                    }
                    else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_0.setText(ghepatitis_0);
                    }

                    if(ghepatitis_1 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_1.setText("-");
                    }else if(ghepatitis_1.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_1.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_1.setText(ghepatitis_1);
                    }

                    if(ghepatitis_2 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_2.setText("-");
                    } else if(ghepatitis_2.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_2.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_2.setText(ghepatitis_2);
                    }

                    if(ghepatitis_3 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_3.setText("-");
                    }else if(ghepatitis_3.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_3.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_3.setText(ghepatitis_3);
                    }

                    if(ghepatitis_4 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_4.setText("-");
                    }else if(ghepatitis_4.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_4.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_4.setText(ghepatitis_4);
                    }

                    if(ghepatitis_5 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_5.setText("-");
                    }else if(ghepatitis_5.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_5.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_5.setText(ghepatitis_5);
                    }

                    if(ghepatitis_6 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_6.setText("-");
                    }else if(ghepatitis_6.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_6.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_6.setText(ghepatitis_6);
                    }

                    if(ghepatitis_7 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_7.setText("-");
                    } else if(ghepatitis_7.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_7.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_7.setText(ghepatitis_7);
                    }

                    if(ghepatitis_8 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_8.setText("-");
                    }else if(ghepatitis_8.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_8.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_8.setText(ghepatitis_8);
                    }

                    if(ghepatitis_9 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_9.setText("-");
                    } else if(ghepatitis_9.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_9.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_9.setText(ghepatitis_9);
                    }

                    if(ghepatitis_10 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_10.setText("-");
                    }else if(ghepatitis_10.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_10.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_10.setText(ghepatitis_10);
                    }

                    if(ghepatitis_11 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_11.setText("-");
                    }else if(ghepatitis_11.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_11.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_11.setText(ghepatitis_11);
                    }

                    if(ghepatitis_12 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_12.setText("-");
                    }else if(ghepatitis_12.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_12.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxhepatitis_12.setText(ghepatitis_12);
                    }

                    if(gbcg_0 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_0.setText("-");
                    }else if(gbcg_0.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_0.setText("-");
                    }
                    else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_0.setText(gbcg_0);
                    }

                    if(gbcg_1 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_1.setText("-");
                    }else if(gbcg_1.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_1.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_1.setText(gbcg_1);
                    }

                    if(gbcg_2 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_2.setText("-");
                    } else if(gbcg_2.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_2.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_2.setText(gbcg_2);
                    }

                    if(gbcg_3 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_3.setText("-");
                    }else if(gbcg_3.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_3.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_3.setText(gbcg_3);
                    }

                    if(gbcg_4 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_4.setText("-");
                    }else if(gbcg_4.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_4.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_4.setText(gbcg_4);
                    }

                    if(gbcg_5 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_5.setText("-");
                    }else if(gbcg_5.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_5.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_5.setText(gbcg_5);
                    }

                    if(gbcg_6 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_6.setText("-");
                    }else if(gbcg_6.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_6.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_6.setText(gbcg_6);
                    }

                    if(gbcg_7 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_7.setText("-");
                    } else if(gbcg_7.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_7.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_7.setText(gbcg_7);
                    }

                    if(gbcg_8 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_8.setText("-");
                    }else if(gbcg_8.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_8.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_8.setText(gbcg_8);
                    }

                    if(gbcg_9 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_9.setText("-");
                    } else if(gbcg_9.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_9.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_9.setText(gbcg_9);
                    }

                    if(gbcg_10 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_10.setText("-");
                    }else if(gbcg_10.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_10.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_10.setText(gbcg_10);
                    }

                    if(gbcg_11 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_11.setText("-");
                    }else if(gbcg_11.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_11.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_11.setText(gbcg_11);
                    }

                    if(gbcg_12 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_12.setText("-");
                    }else if(gbcg_12.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_12.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxbcg_12.setText(gbcg_12);
                    }

                    if(gpolio_tetes_0 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_0.setText("-");
                    }else if(gpolio_tetes_0.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_0.setText("-");
                    }
                    else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_0.setText(gpolio_tetes_0);
                    }

                    if(gpolio_tetes_1 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_1.setText("-");
                    }else if(gpolio_tetes_1.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_1.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_1.setText(gpolio_tetes_1);
                    }

                    if(gpolio_tetes_2 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_2.setText("-");
                    } else if(gpolio_tetes_2.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_2.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_2.setText(gpolio_tetes_2);
                    }

                    if(gpolio_tetes_3 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_3.setText("-");
                    }else if(gpolio_tetes_3.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_3.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_3.setText(gpolio_tetes_3);
                    }

                    if(gpolio_tetes_4 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_4.setText("-");
                    }else if(gpolio_tetes_4.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_4.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_4.setText(gpolio_tetes_4);
                    }

                    if(gpolio_tetes_5 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_5.setText("-");
                    }else if(gpolio_tetes_5.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_5.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_5.setText(gpolio_tetes_5);
                    }

                    if(gpolio_tetes_6 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_6.setText("-");
                    }else if(gpolio_tetes_6.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_6.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_6.setText(gpolio_tetes_6);
                    }

                    if(gpolio_tetes_7 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_7.setText("-");
                    } else if(gpolio_tetes_7.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_7.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_7.setText(gpolio_tetes_7);
                    }

                    if(gpolio_tetes_8 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_8.setText("-");
                    }else if(gpolio_tetes_8.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_8.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_8.setText(gpolio_tetes_8);
                    }

                    if(gpolio_tetes_9 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_9.setText("-");
                    } else if(gpolio_tetes_9.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_9.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_9.setText(gpolio_tetes_9);
                    }

                    if(gpolio_tetes_10 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_10.setText("-");
                    }else if(gpolio_tetes_10.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_10.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_10.setText(gpolio_tetes_10);
                    }

                    if(gpolio_tetes_11 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_11.setText("-");
                    }else if(gpolio_tetes_11.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_11.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_11.setText(gpolio_tetes_11);
                    }

                    if(gpolio_tetes_12 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_12.setText("-");
                    }else if(gpolio_tetes_12.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_12.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxpolio_tetes_12.setText(gpolio_tetes_12);
                    }
                    if(gdan_lain_lain_0 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_0.setText("-");
                    }else if(gdan_lain_lain_0.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_0.setText("-");
                    }
                    else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_0.setText(gdan_lain_lain_0);
                    }

                    if(gdan_lain_lain_1 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_1.setText("-");
                    }else if(gdan_lain_lain_1.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_1.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_1.setText(gdan_lain_lain_1);
                    }

                    if(gdan_lain_lain_2 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_2.setText("-");
                    } else if(gdan_lain_lain_2.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_2.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_2.setText(gdan_lain_lain_2);
                    }

                    if(gdan_lain_lain_3 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_3.setText("-");
                    }else if(gdan_lain_lain_3.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_3.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_3.setText(gdan_lain_lain_3);
                    }

                    if(gdan_lain_lain_4 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_4.setText("-");
                    }else if(gdan_lain_lain_4.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_4.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_4.setText(gdan_lain_lain_4);
                    }

                    if(gdan_lain_lain_5 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_5.setText("-");
                    }else if(gdan_lain_lain_5.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_5.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_5.setText(gdan_lain_lain_5);
                    }

                    if(gdan_lain_lain_6 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_6.setText("-");
                    }else if(gdan_lain_lain_6.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_6.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_6.setText(gdan_lain_lain_6);
                    }

                    if(gdan_lain_lain_7 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_7.setText("-");
                    } else if(gdan_lain_lain_7.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_7.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_7.setText(gdan_lain_lain_7);
                    }

                    if(gdan_lain_lain_8 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_8.setText("-");
                    }else if(gdan_lain_lain_8.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_8.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_8.setText(gdan_lain_lain_8);
                    }

                    if(gdan_lain_lain_9 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_9.setText("-");
                    } else if(gdan_lain_lain_9.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_9.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_9.setText(gdan_lain_lain_9);
                    }

                    if(gdan_lain_lain_10 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_10.setText("-");
                    }else if(gdan_lain_lain_10.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_10.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_10.setText(gdan_lain_lain_10);
                    }

                    if(gdan_lain_lain_11 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_11.setText("-");
                    }else if(gdan_lain_lain_11.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_11.setText("-");
                    }else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_11.setText(gdan_lain_lain_11);
                    }

                    if(gdan_lain_lain_12 == "null"){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_12.setText("-");
                    }else if(gdan_lain_lain_12.equals("01-01-1970")){
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_12.setText("-");
                    } else{
                        Detail_kesehatan_imunisasi_anak.this.etxdan_lain_lain_12.setText(gdan_lain_lain_12);
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


    private void showDateDialog0(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_0.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog1(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_1.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog2(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_2.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog3(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog4(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_4.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog5(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_5.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog6(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_6.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog7(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_7.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog8(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_8.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog9(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_9.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog10(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_10.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog11(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_11.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog12(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxhepatitis_12.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog13(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_0.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog14(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_1.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog15(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_2.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog16(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog17(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_4.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog18(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_5.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog19(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_6.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog20(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_7.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog21(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_8.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog22(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_9.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog23(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_10.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog24(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_11.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog25(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbcg_12.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog26(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_0.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog27(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_1.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog28(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_2.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog29(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog30(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_4.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog31(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_5.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog32(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_6.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog33(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_7.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog34(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_8.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog35(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_9.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog36(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_10.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog37(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_11.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog38(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxpolio_tetes_12.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog39(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_0.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog40(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_1.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog41(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_2.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog42(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog43(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_4.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog44(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_5.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog45(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_6.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog46(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_7.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog47(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_8.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog48(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_9.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog49(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_10.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog50(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_11.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog51(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxdan_lain_lain_12.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
