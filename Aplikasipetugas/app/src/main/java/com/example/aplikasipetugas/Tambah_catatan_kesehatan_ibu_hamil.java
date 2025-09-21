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

public class Tambah_catatan_kesehatan_ibu_hamil extends AppCompatActivity {
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxanalisa;
    EditText etxbb;
    EditText etxcatatantambahan;
    EditText etximunisasi;
    EditText etxkeluhan;
    EditText etxkonseling;
    EditText etxlab;
    EditText etxletakjanin;
    EditText etxlila;
    EditText etxnamapemeriksa;
    EditText etxtabletd;
    EditText etxtanggal;
    EditText etxtatalaksana;
    EditText etxtd;
    EditText etxtinggifundus;
    EditText etxuk;
    TextView judulcatatankehamilan;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tambah_catatan_kesehatan_ibu_hamil);
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        this.judulcatatankehamilan = (TextView) findViewById(R.id.judulcatatankehamilan);
        this.etxtanggal = (EditText) findViewById(R.id.etxtanggal);
        this.etxnamapemeriksa = (EditText) findViewById(R.id.etxnamapemeriksa);
        this.etxkeluhan = (EditText) findViewById(R.id.etxkeluhan);
        this.etxuk = (EditText) findViewById(R.id.etxuk);
        this.etxbb = (EditText) findViewById(R.id.etxbb);
        this.etxtd = (EditText) findViewById(R.id.etxtd);
        this.etxlila = (EditText) findViewById(R.id.etxlila);
        this.etxtinggifundus = (EditText) findViewById(R.id.etxtinggifundus);
        this.etxletakjanin = (EditText) findViewById(R.id.etxletakjanin);
        this.etximunisasi = (EditText) findViewById(R.id.etximunisasi);
        this.etxtabletd = (EditText) findViewById(R.id.etxtablettd);
        this.etxlab = (EditText) findViewById(R.id.etxlab);
        this.etxanalisa = (EditText) findViewById(R.id.etxanalisa);
        this.etxtatalaksana = (EditText) findViewById(R.id.etxtatalaksana);
        this.etxkonseling = (EditText) findViewById(R.id.etxkonseling);
        this.etxcatatantambahan = (EditText) findViewById(R.id.etxcatatantambahan);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.judulcatatankehamilan.setText("Catatan Kehamilan Ke- " + getIntent().getStringExtra("kehamilan_ke"));
        etxtanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_catatan_kesehatan_ibu_hamil.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_catatan_kesehatan_ibu_hamil.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_catatan_kesehatan_ibu_hamil.this.startActivity(intent);
                        Tambah_catatan_kesehatan_ibu_hamil.this.finish();
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
                Tambah_catatan_kesehatan_ibu_hamil.this.finish();
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_catatan_kesehatan_ibu_hamil.this.etxtanggal.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxnamapemeriksa.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxkeluhan.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxuk.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxbb.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxtd.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxlila.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxtinggifundus.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxletakjanin.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etximunisasi.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxtabletd.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxlab.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxanalisa.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxtatalaksana.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxkonseling.setText("");
                Tambah_catatan_kesehatan_ibu_hamil.this.etxcatatantambahan.setText("");
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxnamapemeriksa.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxnamapemeriksa.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxkeluhan.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxkeluhan.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxuk.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxuk.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxbb.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxbb.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxtd.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxtd.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxlila.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxlila.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxtinggifundus.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxtinggifundus.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxletakjanin.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxletakjanin.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etximunisasi.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etximunisasi.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxtabletd.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxtabletd.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxlab.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxlab.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxanalisa.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxanalisa.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxtatalaksana.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxtatalaksana.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxkonseling.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxkonseling.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_hamil.this.etxcatatantambahan.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_hamil.this.etxcatatantambahan.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Tambah_catatan_kesehatan_ibu_hamil.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/catatan_kesehatanibuhamil", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_catatan_kesehatan_ibu_hamil.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Tambah_catatan_kesehatan_ibu_hamil.this.finish();
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
                        Toast.makeText(Tambah_catatan_kesehatan_ibu_hamil.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_catatan_kesehatan_ibu_hamil.this.getIntent().getStringExtra("nikibu"));
                        myParams.put("kehamilan_ke", Tambah_catatan_kesehatan_ibu_hamil.this.getIntent().getStringExtra("kehamilan_ke"));
                        myParams.put("nama_pemeriksa", Tambah_catatan_kesehatan_ibu_hamil.this.etxnamapemeriksa.getText().toString());
                        myParams.put("tanggal", Tambah_catatan_kesehatan_ibu_hamil.this.etxtanggal.getText().toString());
                        myParams.put("keluhan", Tambah_catatan_kesehatan_ibu_hamil.this.etxkeluhan.getText().toString());
                        myParams.put("uk", Tambah_catatan_kesehatan_ibu_hamil.this.etxuk.getText().toString());
                        myParams.put("bb", Tambah_catatan_kesehatan_ibu_hamil.this.etxbb.getText().toString());
                        myParams.put("td", Tambah_catatan_kesehatan_ibu_hamil.this.etxtd.getText().toString());
                        myParams.put("lila", Tambah_catatan_kesehatan_ibu_hamil.this.etxlila.getText().toString());
                        myParams.put("tinggi_fundus", Tambah_catatan_kesehatan_ibu_hamil.this.etxtinggifundus.getText().toString());
                        myParams.put("letak_janin", Tambah_catatan_kesehatan_ibu_hamil.this.etxletakjanin.getText().toString());
                        myParams.put("imunisasi", Tambah_catatan_kesehatan_ibu_hamil.this.etximunisasi.getText().toString());
                        myParams.put("tablet_tambah_darah", Tambah_catatan_kesehatan_ibu_hamil.this.etxtabletd.getText().toString());
                        myParams.put("lab", Tambah_catatan_kesehatan_ibu_hamil.this.etxlab.getText().toString());
                        myParams.put("analisa", Tambah_catatan_kesehatan_ibu_hamil.this.etxanalisa.getText().toString());
                        myParams.put("tata_laksana", Tambah_catatan_kesehatan_ibu_hamil.this.etxtatalaksana.getText().toString());
                        myParams.put("konseling", Tambah_catatan_kesehatan_ibu_hamil.this.etxkonseling.getText().toString());
                        myParams.put("catatan_tambahan", Tambah_catatan_kesehatan_ibu_hamil.this.etxcatatantambahan.getText().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    private void showDateDialog1(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxtanggal.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
