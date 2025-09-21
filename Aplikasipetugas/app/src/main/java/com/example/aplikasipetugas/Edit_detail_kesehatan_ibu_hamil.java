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

public class Edit_detail_kesehatan_ibu_hamil extends AppCompatActivity {
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
    Spinner spinnerstatuskehamilan;
    EditText etxtinggibadan;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_edit_detail_kesehatan_ibu_hamil);
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        this.etxkehamilanke = (EditText) findViewById(R.id.etxkehamilanke);
        this.etxhptp = (EditText) findViewById(R.id.etxhptp);
        this.etxhtp = (EditText) findViewById(R.id.etxhtp);
        this.spinnergolongandarah = (Spinner) findViewById(R.id.spinnergolongandarah);
        this.spinnerpenggunaankontrasepsi = (Spinner) findViewById(R.id.spinnerpenggunaankontrasepsi);
        this.spinnerriwayatpenyakit = (Spinner) findViewById(R.id.spinnerriwayatpenyakit);
        this.spinnerriwayatalergi = (Spinner) findViewById(R.id.spinnerriwayatalergi);
        this.spinnerstatusimunisasitetanus = (Spinner) findViewById(R.id.spinnerstatusimunisasitetanus);
        this.spinnerstatuskehamilan = (Spinner) findViewById(R.id.spinnerstatuskehamilan);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_detail_kesehatan_ibu_hamil.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Edit_detail_kesehatan_ibu_hamil.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Edit_detail_kesehatan_ibu_hamil.this.startActivity(intent);
                        Edit_detail_kesehatan_ibu_hamil.this.finish();
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
                Edit_detail_kesehatan_ibu_hamil.this.finish();
            }
        });
        if (getIntent().hasExtra("dataid")) {
            getData();
        }
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Edit_detail_kesehatan_ibu_hamil.this.etxkehamilanke.getText().toString().length() == 0) {
                    Edit_detail_kesehatan_ibu_hamil.this.etxkehamilanke.setError("Tidak Boleh Kosong");
                }
                if (Edit_detail_kesehatan_ibu_hamil.this.etxhptp.getText().toString().length() == 0) {
                    Edit_detail_kesehatan_ibu_hamil.this.etxhptp.setError("Tidak Boleh Kosong");
                }
                if (Edit_detail_kesehatan_ibu_hamil.this.etxhtp.getText().toString().length() == 0) {
                    Edit_detail_kesehatan_ibu_hamil.this.etxhtp.setError("Tidak Boleh Kosong");
                }

                if (Edit_detail_kesehatan_ibu_hamil.this.etxtinggibadan.getText().toString().length() == 0) {
                    Edit_detail_kesehatan_ibu_hamil.this.etxtinggibadan.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Edit_detail_kesehatan_ibu_hamil.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatedatakesehatanibuhamil/" + Edit_detail_kesehatan_ibu_hamil.this.getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_detail_kesehatan_ibu_hamil.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class));
                                        Edit_detail_kesehatan_ibu_hamil.this.finish();
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
                        Toast.makeText(Edit_detail_kesehatan_ibu_hamil.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Edit_detail_kesehatan_ibu_hamil.this.getIntent().getStringExtra("nikibu"));
                        myParams.put("kehamilan_ke", Edit_detail_kesehatan_ibu_hamil.this.etxkehamilanke.getText().toString());
                        myParams.put("hari_pertama_haid_terakhir", Edit_detail_kesehatan_ibu_hamil.this.etxhptp.getText().toString());
                        myParams.put("hari_taksiran_persalinan", Edit_detail_kesehatan_ibu_hamil.this.etxhtp.getText().toString());
                        myParams.put("golongan_darah", Edit_detail_kesehatan_ibu_hamil.this.spinnergolongandarah.getSelectedItem().toString());
                        myParams.put("penggunaan_kontrasepsi_sebelum_hamil", Edit_detail_kesehatan_ibu_hamil.this.spinnerpenggunaankontrasepsi.getSelectedItem().toString());
                        myParams.put("riwayat_penyakit_yg_di_derita_ibu", Edit_detail_kesehatan_ibu_hamil.this.spinnerriwayatpenyakit.getSelectedItem().toString());
                        myParams.put("riwayat_alergi", Edit_detail_kesehatan_ibu_hamil.this.spinnerriwayatalergi.getSelectedItem().toString());
                        myParams.put("status_imunisasi_tetanus_terakhir", Edit_detail_kesehatan_ibu_hamil.this.spinnerstatusimunisasitetanus.getSelectedItem().toString());
                        myParams.put("tinggi_badan", Edit_detail_kesehatan_ibu_hamil.this.etxtinggibadan.getText().toString());
                        myParams.put("status_kehamilan", Edit_detail_kesehatan_ibu_hamil.this.spinnerstatuskehamilan.getSelectedItem().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/editdatakesehatanibuhamil/" + getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("datakesehatanibuhamil1");
                    String gkehamilanke = jsonObject.getString("kehamilan_ke");
                    String ghari_pertama_haid_terakhir = jsonObject.getString("hari_pertama_haid_terakhir");
                    String ghari_taksiran_persalinan = jsonObject.getString("hari_taksiran_persalinan");
                    String ggolongan_darah = jsonObject.getString("golongan_darah");
                    String gpenggunaan_kontrasepsi_sebelum_hamil = jsonObject.getString("penggunaan_kontrasepsi_sebelum_hamil");
                    String griwayat_penyakit_yg_di_derita_ibu = jsonObject.getString("riwayat_penyakit_yg_di_derita_ibu");
                    String griwayat_alergi = jsonObject.getString("riwayat_alergi");
                    String gstatus_imunisasi_tetanus_terakhir = jsonObject.getString("status_imunisasi_tetanus_terakhir");
                    String gtinggi_badan = jsonObject.getString("tinggi_badan");
                    String gstatus_kehamilan = jsonObject.getString("status_kehamilan");
                    Edit_detail_kesehatan_ibu_hamil.this.etxkehamilanke.setText(gkehamilanke);
                    Edit_detail_kesehatan_ibu_hamil.this.etxhptp.setText(ghari_pertama_haid_terakhir);
                    Edit_detail_kesehatan_ibu_hamil.this.etxhtp.setText(ghari_taksiran_persalinan);
                    if(ggolongan_darah.equals("A")){
                        spinnergolongandarah.setSelection(1);
                    }
                    if(ggolongan_darah.equals("B")){
                        spinnergolongandarah.setSelection(2);
                    }
                    if(ggolongan_darah.equals("AB")){
                        spinnergolongandarah.setSelection(3);
                    }
                    if(ggolongan_darah.equals("O")){
                        spinnergolongandarah.setSelection(4);
                    }

                    if(gpenggunaan_kontrasepsi_sebelum_hamil.equals("Pil KB")){
                        spinnerpenggunaankontrasepsi.setSelection(1);
                    }
                    if(gpenggunaan_kontrasepsi_sebelum_hamil.equals("Suntik KB 1 Bulan")){
                        spinnerpenggunaankontrasepsi.setSelection(2);
                    }
                    if(gpenggunaan_kontrasepsi_sebelum_hamil.equals("Suntik KB 3 Bulan")){
                        spinnerpenggunaankontrasepsi.setSelection(3);
                    }
                    if(gpenggunaan_kontrasepsi_sebelum_hamil.equals("Implan")){
                        spinnerpenggunaankontrasepsi.setSelection(4);
                    }
                    if(gpenggunaan_kontrasepsi_sebelum_hamil.equals("Kondom")){
                        spinnerpenggunaankontrasepsi.setSelection(5);
                    }
                    if(gpenggunaan_kontrasepsi_sebelum_hamil.equals("AKDR (IUD)")){
                        spinnerpenggunaankontrasepsi.setSelection(6);
                    }
                    if(gpenggunaan_kontrasepsi_sebelum_hamil.equals("Tidak Ada")){
                        spinnerpenggunaankontrasepsi.setSelection(7);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Preeklamsia")){
                        spinnerriwayatpenyakit.setSelection(1);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Diabetes")){
                        spinnerriwayatpenyakit.setSelection(2);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Muntah Kronis")){
                        spinnerriwayatpenyakit.setSelection(3);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Pendarahan")){
                        spinnerriwayatpenyakit.setSelection(4);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Toksoplasmosis")){
                        spinnerriwayatpenyakit.setSelection(5);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Berat Badan Yang Rendah")){
                        spinnerriwayatpenyakit.setSelection(6);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Depresi")){
                        spinnerriwayatpenyakit.setSelection(7);
                    }
                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Kehamilan Ektopik")){
                        spinnerriwayatpenyakit.setSelection(8);
                    }

                    if(griwayat_penyakit_yg_di_derita_ibu.equals("Tidak Ada")){
                        spinnerriwayatpenyakit.setSelection(8);
                    }

                    if(griwayat_alergi.equals("Asma")){
                        spinnerriwayatalergi.setSelection(1);
                    }
                    if(griwayat_alergi.equals("Gatal Pada Mata")){
                        spinnerriwayatalergi.setSelection(2);
                    }
                    if(griwayat_alergi.equals("Roam Kulit")){
                        spinnerriwayatalergi.setSelection(3);
                    }
                    if(griwayat_alergi.equals("Hidung Gatal Dan Berair")){
                        spinnerriwayatalergi.setSelection(4);
                    }
                    if(griwayat_alergi.equals("Bersin-bersin")){
                        spinnerriwayatalergi.setSelection(5);
                    }
                    if(griwayat_alergi.equals("Diare atau Muntah")){
                        spinnerriwayatalergi.setSelection(6);
                    }
                    if(griwayat_alergi.equals("Tidak Ada")){
                        spinnerriwayatalergi.setSelection(7);
                    }

                    if(gstatus_imunisasi_tetanus_terakhir.equals("TT1")){
                        spinnerstatusimunisasitetanus.setSelection(1);
                    }
                    if(gstatus_imunisasi_tetanus_terakhir.equals("TT2")){
                        spinnerstatusimunisasitetanus.setSelection(2);
                    }
                    if(gstatus_imunisasi_tetanus_terakhir.equals("TT3")){
                        spinnerstatusimunisasitetanus.setSelection(3);
                    }
                    if(gstatus_imunisasi_tetanus_terakhir.equals("TT4")){
                        spinnerstatusimunisasitetanus.setSelection(4);
                    }
                    if(gstatus_imunisasi_tetanus_terakhir.equals("TT5")){
                        spinnerstatusimunisasitetanus.setSelection(5);
                    }
                    if(gstatus_kehamilan.equals("Sedang Berlangsung")){
                        spinnerstatuskehamilan.setSelection(1);
                    }
                    if(gstatus_kehamilan.equals("Berakhir")){
                        spinnerstatuskehamilan.setSelection(2);
                    }
                    Edit_detail_kesehatan_ibu_hamil.this.etxtinggibadan.setText(gtinggi_badan);
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
