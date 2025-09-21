package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
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

public class Tambah_catatan_kesehatan_ibu_bersalin extends AppCompatActivity {
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    CheckBox check1;
    CheckBox check10;
    CheckBox check11;
    CheckBox check12;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;
    CheckBox check5;
    CheckBox check6;
    CheckBox check7;
    CheckBox check8;
    CheckBox check9;
    String checkdelapan = "";
    String checkdua = "";
    String checkduabelas = "";
    String checkempat = "";
    String checkenam = "";
    String checklima = "";
    String checksatu = "";
    String checksebelas = "";
    String checksembilan = "";
    String checksepuluh = "";
    String checktiga = "";
    String checktujuh = "";
    EditText etxanakke;
    EditText etxberat_lahir;
    Spinner spinnercarapersalinan;
    EditText etxkeadaanibu;
    EditText etxlingkar_kepala;
    EditText etxpanjangbadan;
    Spinner spinnerpenolongpersalinan;
    EditText etxpukul;
    EditText etxtanggalpersalinan;
    EditText etxumur_kehamilan;
    int id_rb_jenis_kelamin;
    String isi_checkbox_asuhan_bayi = "";
    String isi_checkbox_kondisi_bayi = "";
    RadioGroup jenis_kelamin;
    String pilihan_jenis_kelamin;
    RadioButton rblaki_laki;
    RadioButton rbperempuan;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tambah_catatan_kesehatan_ibu_bersalin);
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        this.etxanakke = (EditText) findViewById(R.id.etxanakke);
        this.etxtanggalpersalinan = (EditText) findViewById(R.id.etxtanggalpersalinan);
        this.etxpukul = (EditText) findViewById(R.id.etxpukul);
        this.etxumur_kehamilan = (EditText) findViewById(R.id.etxumur_kehamilan);
        this.spinnerpenolongpersalinan = (Spinner) findViewById(R.id.spinnerpenolongpersalinan);
        this.spinnercarapersalinan = (Spinner) findViewById(R.id.spinnercarapersalinan);
        this.etxkeadaanibu = (EditText) findViewById(R.id.etxkeadaanibu);
        this.etxberat_lahir = (EditText) findViewById(R.id.etxberat_lahir);
        this.etxpanjangbadan = (EditText) findViewById(R.id.etxpanjangbadan);
        this.etxlingkar_kepala = (EditText) findViewById(R.id.etxlingkar_kepala);
        this.jenis_kelamin = (RadioGroup) findViewById(R.id.jenis_kelamin);
        this.rblaki_laki = (RadioButton) findViewById(R.id.rblaki_laki);
        this.rbperempuan = (RadioButton) findViewById(R.id.rbperempuan);
        this.check1 = (CheckBox) findViewById(R.id.check1);
        this.check2 = (CheckBox) findViewById(R.id.check2);
        this.check3 = (CheckBox) findViewById(R.id.check3);
        this.check4 = (CheckBox) findViewById(R.id.check4);
        this.check5 = (CheckBox) findViewById(R.id.check5);
        this.check6 = (CheckBox) findViewById(R.id.check6);
        this.check7 = (CheckBox) findViewById(R.id.check7);
        this.check8 = (CheckBox) findViewById(R.id.check8);
        this.check9 = (CheckBox) findViewById(R.id.check9);
        this.check10 = (CheckBox) findViewById(R.id.check10);
        this.check11 = (CheckBox) findViewById(R.id.check11);
        this.check12 = (CheckBox) findViewById(R.id.check12);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);

        etxtanggalpersalinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });

        etxpukul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showHourDialog();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_catatan_kesehatan_ibu_bersalin.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_catatan_kesehatan_ibu_bersalin.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_catatan_kesehatan_ibu_bersalin.this.startActivity(intent);
                        Tambah_catatan_kesehatan_ibu_bersalin.this.finish();
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
                Tambah_catatan_kesehatan_ibu_bersalin.this.finish();
            }
        });
        if (this.rblaki_laki.isChecked()) {
            this.rbperempuan.setChecked(false);
        }
        if (this.rbperempuan.isChecked()) {
            this.rblaki_laki.setChecked(false);
        }
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.etxanakke.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.etxanakke.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.setError("Tidak Boleh Kosong");
                }

                if (Tambah_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.setError("Tidak Boleh Kosong");
                }

                if (Tambah_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.setError("Tidak Boleh Kosong");
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.getText().toString().length() == 0) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.setError("Tidak Boleh Kosong");
                }

                if (Tambah_catatan_kesehatan_ibu_bersalin.this.rblaki_laki.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin tambah_catatan_kesehatan_ibu_bersalin = Tambah_catatan_kesehatan_ibu_bersalin.this;
                    tambah_catatan_kesehatan_ibu_bersalin.pilihan_jenis_kelamin = tambah_catatan_kesehatan_ibu_bersalin.rblaki_laki.getText().toString();
                } else if (Tambah_catatan_kesehatan_ibu_bersalin.this.rbperempuan.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin tambah_catatan_kesehatan_ibu_bersalin2 = Tambah_catatan_kesehatan_ibu_bersalin.this;
                    tambah_catatan_kesehatan_ibu_bersalin2.pilihan_jenis_kelamin = tambah_catatan_kesehatan_ibu_bersalin2.rbperempuan.getText().toString();
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check1.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checksatu = "Segera menangis";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check2.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checkdua = "Menangis beberapa saat";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check3.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checktiga = "Tidak menangis";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check4.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checkempat = "Seluruh tubuh kemerahan";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check5.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checklima = "Anggota gerak kebiruan";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check6.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checkenam = "Seluruh tubuh biru";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check7.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checktujuh = "Kelainan bawaan";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check8.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checkdelapan = "Meninggal";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check9.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checksembilan = "Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check10.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checksepuluh = "Suntikan Vitamin K1";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check11.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checksebelas = "Salep mata antibiotika profilaksis";
                }
                if (Tambah_catatan_kesehatan_ibu_bersalin.this.check12.isChecked()) {
                    Tambah_catatan_kesehatan_ibu_bersalin.this.checkduabelas = "Imunisasi Hepatitis B";
                }
                Volley.newRequestQueue(Tambah_catatan_kesehatan_ibu_bersalin.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/catatan_kesehatanibubersalin", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_catatan_kesehatan_ibu_bersalin.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Tambah_catatan_kesehatan_ibu_bersalin.this.finish();
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
                        Toast.makeText(Tambah_catatan_kesehatan_ibu_bersalin.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_catatan_kesehatan_ibu_bersalin.this.getIntent().getStringExtra("nikibu"));
                        myParams.put("anak_ke", Tambah_catatan_kesehatan_ibu_bersalin.this.etxanakke.getText().toString());
                        myParams.put("tanggal_persalinan", Tambah_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.getText().toString());
                        myParams.put("pukul", Tambah_catatan_kesehatan_ibu_bersalin.this.etxpukul.getText().toString());
                        myParams.put("umur_kehamilan", Tambah_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.getText().toString());
                        myParams.put("penolong_persalinan", Tambah_catatan_kesehatan_ibu_bersalin.this.spinnerpenolongpersalinan.getSelectedItem().toString());
                        myParams.put("cara_persalinan", Tambah_catatan_kesehatan_ibu_bersalin.this.spinnercarapersalinan.getSelectedItem().toString());
                        myParams.put("keadaan_ibu", Tambah_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.getText().toString());
                        myParams.put("berat_lahir", Tambah_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.getText().toString());
                        myParams.put("panjang_badan", Tambah_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.getText().toString());
                        myParams.put("lingkar_kepala", Tambah_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.getText().toString());
                        myParams.put("jenis_kelamin", Tambah_catatan_kesehatan_ibu_bersalin.this.pilihan_jenis_kelamin);
                        myParams.put("checksatu", Tambah_catatan_kesehatan_ibu_bersalin.this.checksatu);
                        myParams.put("checkdua", Tambah_catatan_kesehatan_ibu_bersalin.this.checkdua);
                        myParams.put("checktiga", Tambah_catatan_kesehatan_ibu_bersalin.this.checktiga);
                        myParams.put("checkempat", Tambah_catatan_kesehatan_ibu_bersalin.this.checkempat);
                        myParams.put("checklima", Tambah_catatan_kesehatan_ibu_bersalin.this.checklima);
                        myParams.put("checkenam", Tambah_catatan_kesehatan_ibu_bersalin.this.checkenam);
                        myParams.put("checktujuh", Tambah_catatan_kesehatan_ibu_bersalin.this.checktujuh);
                        myParams.put("checkdelapan", Tambah_catatan_kesehatan_ibu_bersalin.this.checkdelapan);
                        myParams.put("checksembilan", Tambah_catatan_kesehatan_ibu_bersalin.this.checksembilan);
                        myParams.put("checksepuluh", Tambah_catatan_kesehatan_ibu_bersalin.this.checksepuluh);
                        myParams.put("checksebelas", Tambah_catatan_kesehatan_ibu_bersalin.this.checksebelas);
                        myParams.put("checkduabelas", Tambah_catatan_kesehatan_ibu_bersalin.this.checkduabelas);
                        return myParams;
                    }
                });
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxanakke.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxpukul.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.spinnerpenolongpersalinan.setSelection(0);
                Tambah_catatan_kesehatan_ibu_bersalin.this.spinnercarapersalinan.setSelection(0);
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.setText("");
                Tambah_catatan_kesehatan_ibu_bersalin.this.rblaki_laki.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.rbperempuan.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check1.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check2.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check3.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check4.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check5.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check6.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check7.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check8.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check9.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check10.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check11.setChecked(false);
                Tambah_catatan_kesehatan_ibu_bersalin.this.check12.setChecked(false);
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

                etxtanggalpersalinan.setText(dateFormatter.format(newDate.getTime()));
            }


        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showHourDialog(){
        TimePickerDialog timePickerDialog= new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                String jam = String.format("%02d:%02d", i, i1);
                etxpukul.setText(jam);
            }
        }, 0, 0, true);
        timePickerDialog.show();
    }
}

