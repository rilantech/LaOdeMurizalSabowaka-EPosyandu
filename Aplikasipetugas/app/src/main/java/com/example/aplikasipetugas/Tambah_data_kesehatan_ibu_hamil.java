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
import android.widget.Spinner;
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

public class Tambah_data_kesehatan_ibu_hamil extends AppCompatActivity {
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    Spinner spinnergolongandarah;
    EditText etxhptp;
    EditText etxhtp;
    EditText etxkehamilanke;
    Spinner spinnerpenggunaankontrasepsi;
    Spinner spinnerriwayatalergi;
    Spinner spinnerriwayatpenyakit;
    Spinner spinnerstatusimunisasitetanus;
    EditText etxtinggibadan;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tambah_data_kesehatan_ibu_hamil);
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        this.etxkehamilanke = (EditText) findViewById(R.id.etxkehamilanke);
        this.etxhptp = (EditText) findViewById(R.id.etxhptp);
        this.etxhtp = (EditText) findViewById(R.id.etxhtp);
        this.spinnergolongandarah = (Spinner) findViewById(R.id.spinnergolongandarah);
        this.spinnerpenggunaankontrasepsi = (Spinner) findViewById(R.id.spinnerpenggunaankontrasepsi);
        this.spinnerriwayatpenyakit = (Spinner) findViewById(R.id.spinnerriwayatpenyakit);
        this.spinnerriwayatalergi = (Spinner) findViewById(R.id.spinnerriwayatalergi);
        this.spinnerstatusimunisasitetanus = (Spinner) findViewById(R.id.spinnerstatusimunisasitetanus);
        this.etxtinggibadan = (EditText) findViewById(R.id.etxtinggibadan);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);

        etxhptp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });

        etxhtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_data_kesehatan_ibu_hamil.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_data_kesehatan_ibu_hamil.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_data_kesehatan_ibu_hamil.this.startActivity(intent);
                        Tambah_data_kesehatan_ibu_hamil.this.finish();
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
                Tambah_data_kesehatan_ibu_hamil.this.finish();
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_data_kesehatan_ibu_hamil.this.etxkehamilanke.setText("");
                Tambah_data_kesehatan_ibu_hamil.this.etxhptp.setText("");
                Tambah_data_kesehatan_ibu_hamil.this.etxhtp.setText("");
                Tambah_data_kesehatan_ibu_hamil.this.spinnergolongandarah.setSelection(0);
                Tambah_data_kesehatan_ibu_hamil.this.spinnerpenggunaankontrasepsi.setSelection(0);
                Tambah_data_kesehatan_ibu_hamil.this.spinnerriwayatpenyakit.setSelection(0);
                Tambah_data_kesehatan_ibu_hamil.this.spinnerriwayatalergi.setSelection(0);
                Tambah_data_kesehatan_ibu_hamil.this.spinnerstatusimunisasitetanus.setSelection(0);
                Tambah_data_kesehatan_ibu_hamil.this.etxtinggibadan.setText("");
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Tambah_data_kesehatan_ibu_hamil.this.etxkehamilanke.getText().toString().length() == 0) {
                    Tambah_data_kesehatan_ibu_hamil.this.etxkehamilanke.setError("Tidak Boleh Kosong");
                }
                if (Tambah_data_kesehatan_ibu_hamil.this.etxhptp.getText().toString().length() == 0) {
                    Tambah_data_kesehatan_ibu_hamil.this.etxhptp.setError("Tidak Boleh Kosong");
                }
                if (Tambah_data_kesehatan_ibu_hamil.this.etxhtp.getText().toString().length() == 0) {
                    Tambah_data_kesehatan_ibu_hamil.this.etxhtp.setError("Tidak Boleh Kosong");
                }

                if (Tambah_data_kesehatan_ibu_hamil.this.etxtinggibadan.getText().toString().length() == 0) {
                    Tambah_data_kesehatan_ibu_hamil.this.etxtinggibadan.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Tambah_data_kesehatan_ibu_hamil.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/datakesehatanibuhamil", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_data_kesehatan_ibu_hamil.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class));
                                        Tambah_data_kesehatan_ibu_hamil.this.finish();
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
                        Toast.makeText(Tambah_data_kesehatan_ibu_hamil.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_data_kesehatan_ibu_hamil.this.getIntent().getStringExtra("nikibu"));
                        myParams.put("kehamilan_ke", Tambah_data_kesehatan_ibu_hamil.this.etxkehamilanke.getText().toString());
                        myParams.put("hari_pertama_haid_terakhir", Tambah_data_kesehatan_ibu_hamil.this.etxhptp.getText().toString());
                        myParams.put("hari_taksiran_persalinan", Tambah_data_kesehatan_ibu_hamil.this.etxhtp.getText().toString());
                        myParams.put("golongan_darah", Tambah_data_kesehatan_ibu_hamil.this.spinnergolongandarah.getSelectedItem().toString());
                        myParams.put("penggunaan_kontrasepsi_sebelum_hamil", Tambah_data_kesehatan_ibu_hamil.this.spinnerpenggunaankontrasepsi.getSelectedItem().toString());
                        myParams.put("riwayat_penyakit_yg_di_derita_ibu", Tambah_data_kesehatan_ibu_hamil.this.spinnerriwayatpenyakit.getSelectedItem().toString());
                        myParams.put("riwayat_alergi", Tambah_data_kesehatan_ibu_hamil.this.spinnerriwayatalergi.getSelectedItem().toString());
                        myParams.put("status_imunisasi_tetanus_terakhir", Tambah_data_kesehatan_ibu_hamil.this.spinnerstatusimunisasitetanus.getSelectedItem().toString());
                        myParams.put("tinggi_badan", Tambah_data_kesehatan_ibu_hamil.this.etxtinggibadan.getText().toString());
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

                etxhptp.setText(dateFormatter.format(newDate.getTime()));
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

                etxhtp.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
