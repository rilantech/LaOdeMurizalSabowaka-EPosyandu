package com.example.aplikasipetugas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

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

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Tambah_Data_Orangtuadananak extends AppCompatActivity {
    Button btnbatal;
    TextView tvNamapetugas;
    Button btnsimpan;
    Button btntambahdataanak;
    ImageView buttonlogout;
    EditText etxalamatrumah;
    EditText etxanakke;
    EditText etxanakterakhirumur;
    EditText etxdari;
    EditText etxkabupaten;
    EditText etxkecamatan;
    EditText etxkehamilanke;
    EditText etxnamaanak;
    EditText etxnamaibu;
    EditText etxnamasuami;
    EditText etxnik;
    EditText etxnoaktekelahiran;
    EditText etxnobpjsanak;
    EditText etxnojkn;
    EditText etxnotelp;
    EditText etxpekerjaan;
    EditText etxpekerjaansuami;
    EditText etxttl;
    EditText etxtempatlahiribu, etxtanggallahiribu, etxtempatlahirayah, etxtanggallahirayah, etxtempatlahiranak, etxtanggallahiranak;
    EditText etxttlanak;
    EditText etxttlsuami;
    Spinner spinneragama;
    Spinner spinneragamasuami;
    Spinner spinnerpendidikan;
    Spinner spinnergolongandarahibu, spinnergolongandarahayah;
    Spinner spinnerpendidikansuami, spinner_jeniskelamin1;
    ImageView tombol_kembali;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tambahdataorangtuadananak);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        btnsimpan =  findViewById(R.id.btnsimpan);
        btnbatal =  findViewById(R.id.btnbatal);
        buttonlogout = (ImageView) findViewById(R.id.butonlogout);
        tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        etxnamaibu = (EditText) findViewById(R.id.etxnamaibu);
        etxnik = (EditText) findViewById(R.id.etxnik);
        etxtempatlahiribu = (EditText) findViewById(R.id.etxtempatlahiribu);
        etxtanggallahiribu = (EditText) findViewById(R.id.etxtanggallahiribu);
        etxtempatlahirayah = (EditText) findViewById(R.id.etxtempatlahirayah);
        etxtanggallahirayah = (EditText) findViewById(R.id.etxtanggallahirayah);
        etxtempatlahiranak  = (EditText) findViewById(R.id.etxtempatlahiranak);
        etxtanggallahiranak = (EditText) findViewById(R.id.etxtanggallahiranak);
        etxpekerjaan = (EditText) findViewById(R.id.etxpekerjaan);
        etxnojkn = (EditText) findViewById(R.id.etxnojkn);
        etxnamasuami = (EditText) findViewById(R.id.etxnamasuami);
        etxpekerjaansuami = (EditText) findViewById(R.id.etxpekerjaansuami);
        etxalamatrumah = (EditText) findViewById(R.id.etxalamatrumah);
        etxkecamatan = (EditText) findViewById(R.id.etxkecamatan);
        etxkabupaten = (EditText) findViewById(R.id.etxkabupaten);
        etxnotelp = (EditText) findViewById(R.id.etxnotelp);
        etxnamaanak = (EditText) findViewById(R.id.etxnamaanak);
        etxanakke = (EditText) findViewById(R.id.etxanakke);
        etxdari = (EditText) findViewById(R.id.etxdari);
        etxnoaktekelahiran = (EditText) findViewById(R.id.etxnoaktekelahiran);
        etxnobpjsanak = (EditText) findViewById(R.id.etxnobpjsanak);
        spinneragama = (Spinner) findViewById(R.id.spinneragama);
        spinnerpendidikan = (Spinner) findViewById(R.id.spinnerpendidikan);
        spinneragamasuami = (Spinner) findViewById(R.id.spinneragamasuami);
        spinnerpendidikansuami = (Spinner) findViewById(R.id.spinnerpendidikansuami);
        spinner_jeniskelamin1= (Spinner) findViewById(R.id.spinner_jeniskelamin1);
        spinnergolongandarahibu = (Spinner) findViewById(R.id.spinnergolongandarahibu);
        spinnergolongandarahayah = (Spinner) findViewById(R.id.spinnergolongandarahayah);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);

        etxtanggallahiribu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        etxtanggallahirayah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        etxtanggallahiranak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog3();
            }
        });
        tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Dataorangtuadananak.class));
                Tambah_Data_Orangtuadananak.this.finish();
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Tambah_Data_Orangtuadananak.this.etxnamaibu.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnamaibu.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxnik.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnik.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxtempatlahiribu.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxtempatlahiribu.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxtanggallahiribu.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxtanggallahiribu.setError("Tidak Boleh Kosong");
                }

                if (Tambah_Data_Orangtuadananak.this.etxpekerjaan.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxpekerjaan.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxnojkn.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnojkn.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxnamasuami.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnamasuami.setError("Tidak Boleh Kosong");
                }

                if (Tambah_Data_Orangtuadananak.this.etxtempatlahirayah.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxtempatlahirayah.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxtanggallahirayah.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxtanggallahirayah.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxpekerjaansuami.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxpekerjaansuami.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxalamatrumah.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxalamatrumah.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxkecamatan.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxkecamatan.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxkabupaten.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxkabupaten.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxnotelp.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnotelp.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxnamaanak.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnamaanak.setError("Tidak Boleh Kosong");
                }

                if (Tambah_Data_Orangtuadananak.this.etxtempatlahiranak.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxtempatlahiranak.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxtanggallahiranak.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxtanggallahiranak.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxanakke.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxanakke.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxdari.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxdari.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxnoaktekelahiran.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnoaktekelahiran.setError("Tidak Boleh Kosong");
                }
                if (Tambah_Data_Orangtuadananak.this.etxnobpjsanak.getText().toString().length() == 0) {
                    Tambah_Data_Orangtuadananak.this.etxnobpjsanak.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Tambah_Data_Orangtuadananak.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/dataorangtuadananak", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_Data_Orangtuadananak.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Tambah_Data_Orangtuadananak.this.startActivity(new Intent(Tambah_Data_Orangtuadananak.this, Dataorangtuadananak.class));
                                        Tambah_Data_Orangtuadananak.this.finish();
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
                        Toast.makeText(Tambah_Data_Orangtuadananak.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("namaibu", Tambah_Data_Orangtuadananak.this.etxnamaibu.getText().toString());
                        myParams.put("nik", Tambah_Data_Orangtuadananak.this.etxnik.getText().toString());
                        myParams.put("tempat_lahir_ibu", Tambah_Data_Orangtuadananak.this.etxtempatlahiribu.getText().toString());
                        myParams.put("tanggal_lahir_ibu", Tambah_Data_Orangtuadananak.this.etxtanggallahiribu.getText().toString());
                        myParams.put("goldarah", Tambah_Data_Orangtuadananak.this.spinnergolongandarahibu.getSelectedItem().toString());
                        myParams.put("pekerjaan", Tambah_Data_Orangtuadananak.this.etxpekerjaan.getText().toString());
                        myParams.put("nojkn", Tambah_Data_Orangtuadananak.this.etxnojkn.getText().toString());
                        myParams.put("namasuami", Tambah_Data_Orangtuadananak.this.etxnamasuami.getText().toString());
                        myParams.put("tempat_lahir_ayah", Tambah_Data_Orangtuadananak.this.etxtempatlahirayah.getText().toString());
                        myParams.put("tanggal_lahir_ayah", Tambah_Data_Orangtuadananak.this.etxtanggallahirayah.getText().toString());
                        myParams.put("goldarahsuami", Tambah_Data_Orangtuadananak.this.spinnergolongandarahayah.getSelectedItem().toString());
                        myParams.put("pekerjaansuami", Tambah_Data_Orangtuadananak.this.etxpekerjaansuami.getText().toString());
                        myParams.put("alamatrumah", Tambah_Data_Orangtuadananak.this.etxalamatrumah.getText().toString());
                        myParams.put("kecamatan", Tambah_Data_Orangtuadananak.this.etxkecamatan.getText().toString());
                        myParams.put("kabupaten", Tambah_Data_Orangtuadananak.this.etxkabupaten.getText().toString());
                        myParams.put("notelp", Tambah_Data_Orangtuadananak.this.etxnotelp.getText().toString());
                        myParams.put("namaanak", Tambah_Data_Orangtuadananak.this.etxnamaanak.getText().toString());
                        myParams.put("tempat_lahir_anak", Tambah_Data_Orangtuadananak.this.etxtempatlahiranak.getText().toString());
                        myParams.put("tanggal_lahir_anak", Tambah_Data_Orangtuadananak.this.etxtanggallahiranak.getText().toString());
                        myParams.put("anakke", Tambah_Data_Orangtuadananak.this.etxanakke.getText().toString());
                        myParams.put("dari", Tambah_Data_Orangtuadananak.this.etxdari.getText().toString());
                        myParams.put("noaktekelahiran", Tambah_Data_Orangtuadananak.this.etxnoaktekelahiran.getText().toString());
                        myParams.put("nobpjsanak", Tambah_Data_Orangtuadananak.this.etxnobpjsanak.getText().toString());
                        myParams.put("agama", Tambah_Data_Orangtuadananak.this.spinneragama.getSelectedItem().toString());
                        myParams.put("pendidikan", Tambah_Data_Orangtuadananak.this.spinnerpendidikan.getSelectedItem().toString());
                        myParams.put("agamasuami", Tambah_Data_Orangtuadananak.this.spinneragamasuami.getSelectedItem().toString());
                        myParams.put("pendidikansuami", Tambah_Data_Orangtuadananak.this.spinnerpendidikansuami.getSelectedItem().toString());
                        myParams.put("jenis_kelamin", Tambah_Data_Orangtuadananak.this.spinner_jeniskelamin1.getSelectedItem().toString());
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

                etxtanggallahiribu.setText(dateFormatter.format(newDate.getTime()));
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

                etxtanggallahirayah.setText(dateFormatter.format(newDate.getTime()));
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

                etxtanggallahiranak.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}