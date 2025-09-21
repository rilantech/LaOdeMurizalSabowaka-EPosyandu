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

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Edit_catatan_kesehatan_ibu_bersalin extends AppCompatActivity {
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
        setContentView((int) R.layout.activity_edit_catatan_kesehatan_ibu_bersalin);
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
        if (getIntent().hasExtra("dataid")) {
            getData();
        }

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
                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_catatan_kesehatan_ibu_bersalin.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Edit_catatan_kesehatan_ibu_bersalin.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Edit_catatan_kesehatan_ibu_bersalin.this.startActivity(intent);
                        Edit_catatan_kesehatan_ibu_bersalin.this.finish();
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
                Edit_catatan_kesehatan_ibu_bersalin.this.finish();
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
                if (Edit_catatan_kesehatan_ibu_bersalin.this.etxanakke.getText().toString().length() == 0) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxanakke.setError("Tidak Boleh Kosong");
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.getText().toString().length() == 0) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.setError("Tidak Boleh Kosong");
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.getText().toString().length() == 0) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.setError("Tidak Boleh Kosong");
                }

                if (Edit_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.getText().toString().length() == 0) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.setError("Tidak Boleh Kosong");
                }

                if (Edit_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.getText().toString().length() == 0) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.setError("Tidak Boleh Kosong");
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.getText().toString().length() == 0) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.setError("Tidak Boleh Kosong");
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.getText().toString().length() == 0) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.setError("Tidak Boleh Kosong");
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.rblaki_laki.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin tambah_catatan_kesehatan_ibu_bersalin = Edit_catatan_kesehatan_ibu_bersalin.this;
                    tambah_catatan_kesehatan_ibu_bersalin.pilihan_jenis_kelamin = tambah_catatan_kesehatan_ibu_bersalin.rblaki_laki.getText().toString();
                } else if (Edit_catatan_kesehatan_ibu_bersalin.this.rbperempuan.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin tambah_catatan_kesehatan_ibu_bersalin2 = Edit_catatan_kesehatan_ibu_bersalin.this;
                    tambah_catatan_kesehatan_ibu_bersalin2.pilihan_jenis_kelamin = tambah_catatan_kesehatan_ibu_bersalin2.rbperempuan.getText().toString();
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check1.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checksatu = "Segera menangis";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check2.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checkdua = "Menangis beberapa saat";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check3.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checktiga = "Tidak menangis";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check4.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checkempat = "Seluruh tubuh kemerahan";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check5.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checklima = "Anggota gerak kebiruan";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check6.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checkenam = "Seluruh tubuh biru";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check7.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checktujuh = "Kelainan bawaan";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check8.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checkdelapan = "Meninggal";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check9.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checksembilan = "Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check10.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checksepuluh = "Suntikan Vitamin K1";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check11.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checksebelas = "Salep mata antibiotika profilaksis";
                }
                if (Edit_catatan_kesehatan_ibu_bersalin.this.check12.isChecked()) {
                    Edit_catatan_kesehatan_ibu_bersalin.this.checkduabelas = "Imunisasi Hepatitis B";
                }
                Volley.newRequestQueue(Edit_catatan_kesehatan_ibu_bersalin.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatecatatankesehatanibubersalin/" + Edit_catatan_kesehatan_ibu_bersalin.this.getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_catatan_kesehatan_ibu_bersalin.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Terupdate");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Edit_catatan_kesehatan_ibu_bersalin.this.finish();
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
                        Toast.makeText(Edit_catatan_kesehatan_ibu_bersalin.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Edit_catatan_kesehatan_ibu_bersalin.this.getIntent().getStringExtra("nikibu"));
                        myParams.put("anak_ke", Edit_catatan_kesehatan_ibu_bersalin.this.etxanakke.getText().toString());
                        myParams.put("tanggal_persalinan", Edit_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.getText().toString());
                        myParams.put("pukul", Edit_catatan_kesehatan_ibu_bersalin.this.etxpukul.getText().toString());
                        myParams.put("umur_kehamilan", Edit_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.getText().toString());
                        myParams.put("penolong_persalinan", Edit_catatan_kesehatan_ibu_bersalin.this.spinnerpenolongpersalinan.getSelectedItem().toString());
                        myParams.put("cara_persalinan", Edit_catatan_kesehatan_ibu_bersalin.this.spinnercarapersalinan.getSelectedItem().toString());
                        myParams.put("keadaan_ibu", Edit_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.getText().toString());
                        myParams.put("berat_lahir", Edit_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.getText().toString());
                        myParams.put("panjang_badan", Edit_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.getText().toString());
                        myParams.put("lingkar_kepala", Edit_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.getText().toString());
                        myParams.put("jenis_kelamin", Edit_catatan_kesehatan_ibu_bersalin.this.pilihan_jenis_kelamin);
                        myParams.put("checksatu", Edit_catatan_kesehatan_ibu_bersalin.this.checksatu);
                        myParams.put("checkdua", Edit_catatan_kesehatan_ibu_bersalin.this.checkdua);
                        myParams.put("checktiga", Edit_catatan_kesehatan_ibu_bersalin.this.checktiga);
                        myParams.put("checkempat", Edit_catatan_kesehatan_ibu_bersalin.this.checkempat);
                        myParams.put("checklima", Edit_catatan_kesehatan_ibu_bersalin.this.checklima);
                        myParams.put("checkenam", Edit_catatan_kesehatan_ibu_bersalin.this.checkenam);
                        myParams.put("checktujuh", Edit_catatan_kesehatan_ibu_bersalin.this.checktujuh);
                        myParams.put("checkdelapan", Edit_catatan_kesehatan_ibu_bersalin.this.checkdelapan);
                        myParams.put("checksembilan", Edit_catatan_kesehatan_ibu_bersalin.this.checksembilan);
                        myParams.put("checksepuluh", Edit_catatan_kesehatan_ibu_bersalin.this.checksepuluh);
                        myParams.put("checksebelas", Edit_catatan_kesehatan_ibu_bersalin.this.checksebelas);
                        myParams.put("checkduabelas", Edit_catatan_kesehatan_ibu_bersalin.this.checkduabelas);
                        return myParams;
                    }
                });
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Edit_catatan_kesehatan_ibu_bersalin.this.etxanakke.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.etxpukul.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.spinnerpenolongpersalinan.setSelection(0);
                Edit_catatan_kesehatan_ibu_bersalin.this.spinnercarapersalinan.setSelection(0);
                Edit_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.setText("");
                Edit_catatan_kesehatan_ibu_bersalin.this.rblaki_laki.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.rbperempuan.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check1.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check2.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check3.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check4.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check5.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check6.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check7.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check8.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check9.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check10.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check11.setChecked(false);
                Edit_catatan_kesehatan_ibu_bersalin.this.check12.setChecked(false);
            }
        });
    }

    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/editcatatankesehatanibubersalin/" + getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("datakesehatanibubersalin1");
                    String ganak_ke = jsonObject.getString("anak_ke");
                    String gtanggal_persalinan = jsonObject.getString("tanggal_persalinan");
                    String gpukul = jsonObject.getString("pukul");
                    String gumur_kehamilan = jsonObject.getString("umur_kehamilan");
                    String gpenolong_persalinan = jsonObject.getString("penolong_persalinan");
                    String gcara_persalinan = jsonObject.getString("cara_persalinan");
                    String gkeadaan_ibu = jsonObject.getString("keadaan_ibu");
                    String gberat_lahir = jsonObject.getString("berat_lahir");
                    String gpanjang_badan = jsonObject.getString("panjang_badan");
                    String glingkar_kepala = jsonObject.getString("lingkar_kepala");
                    String gjenis_kelamin = jsonObject.getString("jenis_kelamin");
                    String gkondisi_bayi_saat_lahir = jsonObject.getString("kondisi_bayi_saat_lahir");
                    String gasuhan_bayi_baru_lahir = jsonObject.getString("asuhan_bayi_baru_lahir");

                    JSONObject jSONObject = jsonObject;
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxanakke.setText(ganak_ke);
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxtanggalpersalinan.setText(gtanggal_persalinan);
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxpukul.setText(gpukul);
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxumur_kehamilan.setText(gumur_kehamilan);

                    if(gpenolong_persalinan.equals("Dokter Kandungan")){
                        spinnerpenolongpersalinan.setSelection(1);
                    }
                    if(gpenolong_persalinan.equals("Bidan")){
                        spinnerpenolongpersalinan.setSelection(2);
                    }
                    if(gpenolong_persalinan.equals("Perawat Yang Terlatih")){
                        spinnerpenolongpersalinan.setSelection(3);
                    }
                    if(gpenolong_persalinan.equals("Dukun Bayi")){
                        spinnerpenolongpersalinan.setSelection(4);
                    }

                    if(gcara_persalinan.equals("Persalinan Pervaginam")){
                        spinnercarapersalinan.setSelection(1);
                    }

                    if(gcara_persalinan.equals("Operasi Caesar")){
                        spinnercarapersalinan.setSelection(2);
                    }

                    Edit_catatan_kesehatan_ibu_bersalin.this.etxkeadaanibu.setText(gkeadaan_ibu);
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxberat_lahir.setText(gberat_lahir);
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxpanjangbadan.setText(gpanjang_badan);
                    Edit_catatan_kesehatan_ibu_bersalin.this.etxlingkar_kepala.setText(glingkar_kepala);
                    if(gjenis_kelamin.equals("Laki-laki")){
                        rblaki_laki.setChecked(true);
                    }
                    if(gjenis_kelamin.equals("Perempuan")){
                        rbperempuan.setChecked(true);
                    }

                    if(gkondisi_bayi_saat_lahir.equals("Segera menangis")){
                        check1.setChecked(true);
                    }
                    if(gkondisi_bayi_saat_lahir.equals("Menangis beberapa saat")){
                        check2.setChecked(true);
                    }
                    if(gkondisi_bayi_saat_lahir.equals("Tidak menagis")){
                        check3.setChecked(true);
                    }
                    if(gkondisi_bayi_saat_lahir.equals("Seluruh tubuh kemerahan")){
                        check4.setChecked(true);
                    }
                    if(gkondisi_bayi_saat_lahir.equals("Anggota gerak kebiruan")){
                        check5.setChecked(true);
                    }
                    if(gkondisi_bayi_saat_lahir.equals("Seluruh tubuh biru")){
                        check6.setChecked(true);
                    }
                    if(gkondisi_bayi_saat_lahir.equals("Kelainan bawaan")){
                        check7.setChecked(true);
                    }
                    if(gkondisi_bayi_saat_lahir.equals("Meninggal")){
                        check8.setChecked(true);
                    }

                    if(gasuhan_bayi_baru_lahir.equals("Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi")){
                        check9.setChecked(true);
                    }
                    if(gasuhan_bayi_baru_lahir.equals("Suntikan Vitamin K1")){
                        check10.setChecked(true);
                    }
                    if(gasuhan_bayi_baru_lahir.equals("Salep mata antibiotika profilaksis")){
                        check11.setChecked(true);
                    }
                    if(gasuhan_bayi_baru_lahir.equals("Imunisasi Hepatitis B")){
                        check12.setChecked(true);
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
