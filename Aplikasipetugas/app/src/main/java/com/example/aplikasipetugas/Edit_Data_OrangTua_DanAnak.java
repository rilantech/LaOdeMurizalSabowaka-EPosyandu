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
import android.widget.ListView;
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
import com.example.aplikasipetugas.AdapterInputanDataAnak.AdaptorInputanDataanak;
import com.example.aplikasipetugas.AdapterInputanDataAnak.GetInputanDataanak;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Edit_Data_OrangTua_DanAnak extends AppCompatActivity {
    AdaptorInputanDataanak adaptor;
    Button btnbatal;
    Button btnsimpan;
    Button btntambahdataanak;
    ImageView butonlogout;
    EditText etxalamatrumah;
    EditText etxanakke;
    EditText etxdari;
    EditText etxkabupaten;
    EditText etxkecamatan;
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
    EditText etxtempatlahiribu, etxtanggallahiribu, etxtempatlahirayah, etxtanggallahirayah, etxtempatlahiranak, etxtanggallahiranak;
    EditText etxttl;
    EditText etxttlanak;
    EditText etxttlsuami;
    ListView listView;
    ArrayList<GetInputanDataanak> model;
    Spinner spinnergolongandarahibu, spinnergolongandarahayah;
    Spinner spinneragama;
    Spinner spinneragamasuami;
    Spinner spinnerjenis_kelamin;
    Spinner spinnerpendidikan;
    Spinner spinnerpendidikansuami;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_edit_data_orang_tua_dan_anak);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
//        this.btntambahdataanak = (Button) findViewById(R.id.btntambahdataanak);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.listView = (ListView) findViewById(R.id.list);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.etxnamaibu = (EditText) findViewById(R.id.etxnamaibu);
        this.etxnik = (EditText) findViewById(R.id.etxnik);
        etxtempatlahiribu = (EditText) findViewById(R.id.etxtempatlahiribu);
        etxtanggallahiribu = (EditText) findViewById(R.id.etxtanggallahiribu);
        etxtempatlahirayah = (EditText) findViewById(R.id.etxtempatlahirayah);
        etxtanggallahirayah = (EditText) findViewById(R.id.etxtanggallahirayah);
        etxtempatlahiranak = (EditText) findViewById(R.id.etxtempatlahiranak);
        etxtanggallahiranak = (EditText) findViewById(R.id.etxtanggallahiranak);

        this.etxpekerjaan = (EditText) findViewById(R.id.etxpekerjaan);
        this.etxnojkn = (EditText) findViewById(R.id.etxnojkn);
        this.etxnamasuami = (EditText) findViewById(R.id.etxnamasuami);

        this.etxpekerjaansuami = (EditText) findViewById(R.id.etxpekerjaansuami);
        this.etxalamatrumah = (EditText) findViewById(R.id.etxalamatrumah);
        this.etxkecamatan = (EditText) findViewById(R.id.etxkecamatan);
        this.etxkabupaten = (EditText) findViewById(R.id.etxkabupaten);
        this.etxnotelp = (EditText) findViewById(R.id.etxnotelp);
        this.spinneragama = (Spinner) findViewById(R.id.spinneragama);
        this.spinnerpendidikan = (Spinner) findViewById(R.id.spinnerpendidikan);
        this.spinneragamasuami = (Spinner) findViewById(R.id.spinneragamasuami);
        this.spinnerpendidikansuami = (Spinner) findViewById(R.id.spinnerpendidikansuami);
        spinnergolongandarahibu = (Spinner) findViewById(R.id.spinnergolongandarahibu);
        spinnergolongandarahayah = (Spinner) findViewById(R.id.spinnergolongandarahayah);
        this.etxnamaanak = (EditText) findViewById(R.id.etxnamaanak);
        this.spinnerjenis_kelamin = (Spinner) findViewById(R.id.spinnerjenis_kelamin);
        this.etxanakke = (EditText) findViewById(R.id.etxanakke);
        this.etxdari = (EditText) findViewById(R.id.etxdari);
        this.etxnoaktekelahiran = (EditText) findViewById(R.id.etxnoaktekelahiran);
        this.etxnobpjsanak = (EditText) findViewById(R.id.etxnobpjsanak);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        getData();

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
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_Data_OrangTua_DanAnak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Edit_Data_OrangTua_DanAnak.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Edit_Data_OrangTua_DanAnak.this.startActivity(intent);
                        Edit_Data_OrangTua_DanAnak.this.finish();
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
                startActivity(new Intent(getApplicationContext(), Dataorangtuadananak.class));
                Edit_Data_OrangTua_DanAnak.this.finish();
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Edit_Data_OrangTua_DanAnak.this.etxnamaibu.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxnamaibu.setError("Tidak Boleh Kosong");
                }
                if (Edit_Data_OrangTua_DanAnak.this.etxnik.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxnik.setError("Tidak Boleh Kosong");
                }

                if (Edit_Data_OrangTua_DanAnak.this.etxpekerjaan.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxpekerjaan.setError("Tidak Boleh Kosong");
                }
                if (Edit_Data_OrangTua_DanAnak.this.etxnojkn.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxnojkn.setError("Tidak Boleh Kosong");
                }
                if (Edit_Data_OrangTua_DanAnak.this.etxnamasuami.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxnamasuami.setError("Tidak Boleh Kosong");
                }

                if (Edit_Data_OrangTua_DanAnak.this.etxpekerjaansuami.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxpekerjaansuami.setError("Tidak Boleh Kosong");
                }
                if (Edit_Data_OrangTua_DanAnak.this.etxalamatrumah.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxalamatrumah.setError("Tidak Boleh Kosong");
                }
                if (Edit_Data_OrangTua_DanAnak.this.etxkecamatan.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxkecamatan.setError("Tidak Boleh Kosong");
                }
                if (Edit_Data_OrangTua_DanAnak.this.etxkabupaten.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxkabupaten.setError("Tidak Boleh Kosong");
                }
                if (Edit_Data_OrangTua_DanAnak.this.etxnotelp.getText().toString().length() == 0) {
                    Edit_Data_OrangTua_DanAnak.this.etxnotelp.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Edit_Data_OrangTua_DanAnak.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/editdata/" + Edit_Data_OrangTua_DanAnak.this.getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_Data_OrangTua_DanAnak.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Edit_Data_OrangTua_DanAnak.this.getData();
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
                        Toast.makeText(Edit_Data_OrangTua_DanAnak.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("namaibu", Edit_Data_OrangTua_DanAnak.this.etxnamaibu.getText().toString());
                        myParams.put("nik", Edit_Data_OrangTua_DanAnak.this.etxnik.getText().toString());
                        myParams.put("tempat_lahir_ibu", Edit_Data_OrangTua_DanAnak.this.etxtempatlahiribu.getText().toString());
                        myParams.put("tanggal_lahir_ibu", Edit_Data_OrangTua_DanAnak.this.etxtanggallahiribu.getText().toString());
                        myParams.put("goldarah", Edit_Data_OrangTua_DanAnak.this.spinnergolongandarahibu.getSelectedItem().toString());
                        myParams.put("pekerjaan", Edit_Data_OrangTua_DanAnak.this.etxpekerjaan.getText().toString());
                        myParams.put("nojkn", Edit_Data_OrangTua_DanAnak.this.etxnojkn.getText().toString());
                        myParams.put("namasuami", Edit_Data_OrangTua_DanAnak.this.etxnamasuami.getText().toString());
                        myParams.put("tempat_lahir_ayah", Edit_Data_OrangTua_DanAnak.this.etxtempatlahirayah.getText().toString());
                        myParams.put("tanggal_lahir_ayah", Edit_Data_OrangTua_DanAnak.this.etxtanggallahirayah.getText().toString());
                        myParams.put("goldarahsuami", Edit_Data_OrangTua_DanAnak.this.spinnergolongandarahayah.getSelectedItem().toString());
                        myParams.put("pekerjaansuami", Edit_Data_OrangTua_DanAnak.this.etxpekerjaansuami.getText().toString());
                        myParams.put("alamatrumah", Edit_Data_OrangTua_DanAnak.this.etxalamatrumah.getText().toString());
                        myParams.put("kecamatan", Edit_Data_OrangTua_DanAnak.this.etxkecamatan.getText().toString());
                        myParams.put("kabupaten", Edit_Data_OrangTua_DanAnak.this.etxkabupaten.getText().toString());
                        myParams.put("notelp", Edit_Data_OrangTua_DanAnak.this.etxnotelp.getText().toString());
                        myParams.put("agama", Edit_Data_OrangTua_DanAnak.this.spinneragama.getSelectedItem().toString());
                        myParams.put("pendidikan", Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.getSelectedItem().toString());
                        myParams.put("agamasuami", Edit_Data_OrangTua_DanAnak.this.spinneragamasuami.getSelectedItem().toString());
                        myParams.put("pendidikansuami", Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.getSelectedItem().toString());
                        if (Edit_Data_OrangTua_DanAnak.this.etxnamaanak.getText().toString().length() != 0) {
                            myParams.put("nama_anak", Edit_Data_OrangTua_DanAnak.this.etxnamaanak.getText().toString());
                            myParams.put("jenis_kelamin", Edit_Data_OrangTua_DanAnak.this.spinnerjenis_kelamin.getSelectedItem().toString());
                            myParams.put("tempat_lahir_anak", Edit_Data_OrangTua_DanAnak.this.etxtempatlahiranak.getText().toString());
                            myParams.put("tanggal_lahir_anak", Edit_Data_OrangTua_DanAnak.this.etxtanggallahiranak.getText().toString());
                            myParams.put("anak_ke", Edit_Data_OrangTua_DanAnak.this.etxanakke.getText().toString());
                            myParams.put("dari", Edit_Data_OrangTua_DanAnak.this.etxdari.getText().toString());
                            myParams.put("no_akta_kelahiran", Edit_Data_OrangTua_DanAnak.this.etxnoaktekelahiran.getText().toString());
                            myParams.put("no_jkn_bpjs_anak", Edit_Data_OrangTua_DanAnak.this.etxnobpjsanak.getText().toString());
                        }
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/lihatdataorangtuadananak/" + getIntent().getStringExtra("nik_ibu"), new Response.Listener<String>() {
            public void onResponse(String response) {
                Object obj;
                Object obj2;
                String str = response;
                Object obj3 = "Tidak Sekolah";
                JSONException e;
                try {
                    JSONObject jsonObject = new JSONObject(str).getJSONObject("data");
                    String gnamaibu = jsonObject.getString("nama_ibu");
                    Object obj4 = "S-3/Sederajat";
                    String gnik = jsonObject.getString("nik");
                    Object obj5 = "S-2/Sederajat";
//                    String gttl = jsonObject.getString("tempat_atau_tanggal_lahir_ibu");
                    String gtempat_lahir_ibu = jsonObject.getString("tempat_lahir_ibu");
                    String gtanggal_lahir_ibu = jsonObject.getString("tanggal_lahir_ibu");
                    Object obj6 = "S-1/Sederajat";
                    String ggoldarah = jsonObject.getString("golongan_darah_ibu");
                    Object obj7 = "SMA/Sederajat";
                    String gpekerjaan = jsonObject.getString("pekerjaan_ibu");
                    String gnojkn = jsonObject.getString("no_jkn_bpjs");
                    String str2 = "no_jkn_bpjs";
                    String gnamasuami = jsonObject.getString("nama_ayah");
                    Object obj8 = "SMP/Sederajat";
//                    String gttlsuami = jsonObject.getString("tempat_atau_tanggal_lahir_ayah");
                    String gtempat_lahir_ayah = jsonObject.getString("tempat_lahir_ayah");
                    String gtanggal_lahir_ayah = jsonObject.getString("tanggal_lahir_ayah");
                    Object obj9 = "SD/Sederajat";
                    String ggoldarahsuami = jsonObject.getString("golongan_darah_ayah");
                    Object obj10 = "TK/Sederajat";
                    String gpekerjaansuami = jsonObject.getString("pekerjaan_ayah");
                    Object obj11 = "Konghucu";
                    String galamatrumah = jsonObject.getString("alamat_rumah");
                    Object obj12 = "Hindu";
                    String gkecamatan = jsonObject.getString("kecamatan");
                    Object obj13 = "Budha";
                    String gkabupaten = jsonObject.getString("kabupaten_atau_kota");
                    Object obj14 = "Kristen";
                    String gnotelp = jsonObject.getString("no_telepon");
                    String gagama = jsonObject.getString("agama_ibu");
                    String gpendidikan = jsonObject.getString("pendidikan_ibu");
                    String gagamasuami = jsonObject.getString("agama_ayah");
                    String gpendidikansuami = jsonObject.getString("pendidikan_ayah");
                    JSONObject jSONObject = jsonObject;
                    Edit_Data_OrangTua_DanAnak.this.etxnamaibu.setText(gnamaibu);
                    Edit_Data_OrangTua_DanAnak.this.etxnik.setText(gnik);
                    Edit_Data_OrangTua_DanAnak.this.etxtempatlahiribu.setText(gtempat_lahir_ibu);
                    Edit_Data_OrangTua_DanAnak.this.etxtanggallahiribu.setText(gtanggal_lahir_ibu);
                    Edit_Data_OrangTua_DanAnak.this.etxpekerjaan.setText(gpekerjaan);
                    String str3 = gnamaibu;
                    String gnojkn2 = gnojkn;
                    Edit_Data_OrangTua_DanAnak.this.etxnojkn.setText(gnojkn2);
                    Edit_Data_OrangTua_DanAnak.this.etxnamasuami.setText(gnamasuami);
                    Edit_Data_OrangTua_DanAnak.this.etxtempatlahirayah.setText(gtempat_lahir_ayah);
                    Edit_Data_OrangTua_DanAnak.this.etxtanggallahirayah.setText(gtanggal_lahir_ayah);
                    Edit_Data_OrangTua_DanAnak.this.etxpekerjaansuami.setText(gpekerjaansuami);
                    Edit_Data_OrangTua_DanAnak.this.etxalamatrumah.setText(galamatrumah);
                    Edit_Data_OrangTua_DanAnak.this.etxkecamatan.setText(gkecamatan);
                    Edit_Data_OrangTua_DanAnak.this.etxkabupaten.setText(gkabupaten);
                    Edit_Data_OrangTua_DanAnak.this.etxnotelp.setText(gnotelp);
                    String str4 = gnojkn2;
                    Object obj15 = "Islam";
                    String gagama2 = gagama;
                    String str5 = gnik;
                    if (gagama2.equals(obj15)) {
                        Edit_Data_OrangTua_DanAnak.this.spinneragama.setSelection(1, true);
                    }
                    Object obj16 = obj14;
                    String str7 = ggoldarah;
                    if (gagama2.equals(obj16)) {
                        String str8 = gpekerjaan;
                        Edit_Data_OrangTua_DanAnak.this.spinneragama.setSelection(2, true);
                    }
                    Object obj17 = obj13;
                    if (gagama2.equals(obj17)) {
                        Edit_Data_OrangTua_DanAnak.this.spinneragama.setSelection(3, true);
                    }
                    Object obj18 = obj12;
                    if (gagama2.equals(obj18)) {
                        String str10 = ggoldarahsuami;
                        Edit_Data_OrangTua_DanAnak.this.spinneragama.setSelection(4, true);
                    }
                    Object obj19 = obj11;
                    if (gagama2.equals(obj19)) {
                        String str11 = gagama2;
                        Edit_Data_OrangTua_DanAnak.this.spinneragama.setSelection(5, true);
                    }
                    Object obj20 = obj10;
                    String gpendidikan2 = gpendidikan;
                    if (gpendidikan2.equals(obj20)) {
                        String str12 = gpekerjaansuami;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(1, true);
                    }
                    Object obj21 = obj9;
                    if (gpendidikan2.equals(obj21)) {
                        String str13 = galamatrumah;
                        String str14 = gkecamatan;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(2, true);
                    } else {
                        String str15 = gkecamatan;
                    }
                    Object obj22 = obj8;
                    if (gpendidikan2.equals(obj22)) {
                        String str16 = gkabupaten;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(3, true);
                    }
                    Object obj23 = obj7;
                    if (gpendidikan2.equals(obj23)) {
                        String str17 = gnotelp;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(4, true);
                    }
                    Object obj24 = obj6;
                    if (gpendidikan2.equals(obj24)) {
                        String str18 = gnamasuami;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(5, true);
                    }
                    Object obj25 = obj5;
                    if (gpendidikan2.equals(obj25)) {
                        obj = obj25;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(6, true);
                    } else {
                        obj = obj25;
                    }
                    Object obj26 = obj4;
                    if (gpendidikan2.equals(obj26)) {
                        obj2 = obj26;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(7, true);
                    } else {
                        obj2 = obj26;
                    }
                    Object obj27 = obj3;
                    if (gpendidikan2.equals(obj27)) {
                        String str19 = gpendidikan2;
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikan.setSelection(8, true);
                    }
                    String gpendidikan3 = gagamasuami;
                    if (gpendidikan3.equals(obj15)) {
                        Edit_Data_OrangTua_DanAnak.this.spinneragamasuami.setSelection(1, true);
                    }
                    if (gpendidikan3.equals(obj16)) {
                        Edit_Data_OrangTua_DanAnak.this.spinneragamasuami.setSelection(2, true);
                    }
                    if (gpendidikan3.equals(obj17)) {
                        Edit_Data_OrangTua_DanAnak.this.spinneragamasuami.setSelection(3, true);
                    }
                    if (gpendidikan3.equals(obj18)) {
                        Edit_Data_OrangTua_DanAnak.this.spinneragamasuami.setSelection(4, true);
                    }
                    if (gpendidikan3.equals(obj19)) {
                        Edit_Data_OrangTua_DanAnak.this.spinneragamasuami.setSelection(5, true);
                    }
                    if (gpendidikansuami.equals(obj20)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(1, true);
                    }
                    if (gpendidikansuami.equals(obj21)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(2, true);
                    }
                    if (gpendidikansuami.equals(obj22)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(3, true);
                    }
                    if (gpendidikansuami.equals(obj23)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(4, true);
                    }
                    if (gpendidikansuami.equals(obj24)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(5, true);
                    }
                    if (gpendidikansuami.equals(obj)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(6, true);
                    }
                    if (gpendidikansuami.equals(obj2)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(7, true);
                    }
                    if (gpendidikansuami.equals(obj27)) {
                        Edit_Data_OrangTua_DanAnak.this.spinnerpendidikansuami.setSelection(8, true);
                    }
                    if(ggoldarah.equals("A")){
                        spinnergolongandarahibu.setSelection(1);
                    }
                    if(ggoldarah.equals("B")){
                        spinnergolongandarahibu.setSelection(2);
                    }
                    if(ggoldarah.equals("AB")){
                        spinnergolongandarahibu.setSelection(3);
                    }
                    if(ggoldarah.equals("O")){
                        spinnergolongandarahibu.setSelection(4);
                    }
                    if(ggoldarahsuami.equals("A")){
                        spinnergolongandarahayah.setSelection(1);
                    }
                    if(ggoldarahsuami.equals("B")){
                        spinnergolongandarahayah.setSelection(2);
                    }
                    if(ggoldarahsuami.equals("AB")){
                        spinnergolongandarahayah.setSelection(3);
                    }
                    if(ggoldarahsuami.equals("O")){
                        spinnergolongandarahayah.setSelection(4);
                    }
                    try {
                        JSONArray jsonArray2 = new JSONObject(response).getJSONArray("dataanak");
                        Edit_Data_OrangTua_DanAnak.this.model = new ArrayList<>();
                        int i = 0;
                        while (i <= jsonArray2.length()) {
                            JSONObject getData2 = jsonArray2.getJSONObject(i);
                            String str20 = str2;
                            Edit_Data_OrangTua_DanAnak.this.model.add(new GetInputanDataanak(getData2.getInt("id"), getData2.getString("nik_ibu"), getData2.getString("nama"), getData2.getString("jenis_kelamin"), getData2.getString("tempat_lahir_anak"),getData2.getString("tanggal_lahir_anak"),getData2.getString("tempat_atau_tanggal_lahir"), getData2.getString("anak_ke"), getData2.getString("dari"), getData2.getString("no_akta_kelahiran"), getData2.getString(str20)));
                            i++;
                            str2 = str20;
                        }
                    } catch (JSONException e1) {
                        e1.printStackTrace();
                        Edit_Data_OrangTua_DanAnak.this.adaptor = new AdaptorInputanDataanak(Edit_Data_OrangTua_DanAnak.this.getApplicationContext(), Edit_Data_OrangTua_DanAnak.this.model);
                        Edit_Data_OrangTua_DanAnak.this.listView.setAdapter(Edit_Data_OrangTua_DanAnak.this.adaptor);
                    }
                } catch (JSONException e2) {
                    e = e2;
                    String str21 = response;
                    e.printStackTrace();
                    Edit_Data_OrangTua_DanAnak.this.adaptor = new AdaptorInputanDataanak(Edit_Data_OrangTua_DanAnak.this.getApplicationContext(), Edit_Data_OrangTua_DanAnak.this.model);
                    Edit_Data_OrangTua_DanAnak.this.listView.setAdapter(Edit_Data_OrangTua_DanAnak.this.adaptor);
                }
                Edit_Data_OrangTua_DanAnak.this.adaptor = new AdaptorInputanDataanak(Edit_Data_OrangTua_DanAnak.this.getApplicationContext(), Edit_Data_OrangTua_DanAnak.this.model);
                Edit_Data_OrangTua_DanAnak.this.listView.setAdapter(Edit_Data_OrangTua_DanAnak.this.adaptor);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        getData();
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
