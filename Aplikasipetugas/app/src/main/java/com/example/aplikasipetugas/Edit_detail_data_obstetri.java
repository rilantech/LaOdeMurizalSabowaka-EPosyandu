package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Edit_detail_data_obstetri extends AppCompatActivity {
    public static String kosong;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxberat_lahir;
    EditText etxkehamilan_ke;
    EditText etxkomplikasi_kehamilan_dan_persalinan;
    EditText etxkondisi_anak_saat_ini;
    EditText etxtahun;
    EditText etxtempat_bersalin_dan_tenakes;
    Integer iddata;
    Spinner spinnerlahir_aterm;
    Spinner spinnerlahir_hidup;
    Spinner spinnerlahir_spontan;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_edit_detail_data_obstetri);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.etxkehamilan_ke = (EditText) findViewById(R.id.etxkehamilanke);
        this.etxtahun = (EditText) findViewById(R.id.etxtahun);
        this.etxberat_lahir = (EditText) findViewById(R.id.etxberat_lahir);
        this.etxtempat_bersalin_dan_tenakes = (EditText) findViewById(R.id.etxtempat_bersalin_dan_tenakes);
        this.etxkondisi_anak_saat_ini = (EditText) findViewById(R.id.etxkondisi_anak_saat_ini);
        this.etxkomplikasi_kehamilan_dan_persalinan = (EditText) findViewById(R.id.etxkomplikasi_kehamilan_dan_persalinan);
        this.spinnerlahir_hidup = (Spinner) findViewById(R.id.spinnerlahir_hidup);
        this.spinnerlahir_aterm = (Spinner) findViewById(R.id.spinnerlahir_aterm);
        this.spinnerlahir_spontan = (Spinner) findViewById(R.id.spinnerlahir_spontan);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);
        if (getIntent().hasExtra("dataid")) {
            getData();
        }
        this.iddata = Integer.valueOf(getIntent().getIntExtra("dataid", 0));
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Edit_detail_data_obstetri.this.finish();
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Edit_detail_data_obstetri.this.etxkehamilan_ke.setText("");
                Edit_detail_data_obstetri.this.etxtahun.setText("");
                Edit_detail_data_obstetri.this.etxberat_lahir.setText("");
                Edit_detail_data_obstetri.this.etxtempat_bersalin_dan_tenakes.setText("");
                Edit_detail_data_obstetri.this.etxkondisi_anak_saat_ini.setText("");
                Edit_detail_data_obstetri.this.etxkomplikasi_kehamilan_dan_persalinan.setText("");
                Edit_detail_data_obstetri.this.spinnerlahir_hidup.setSelection(0);
                Edit_detail_data_obstetri.this.spinnerlahir_aterm.setSelection(0);
                Edit_detail_data_obstetri.this.spinnerlahir_spontan.setSelection(0);
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_detail_data_obstetri.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Edit_detail_data_obstetri.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Edit_detail_data_obstetri.this.startActivity(intent);
                        Edit_detail_data_obstetri.this.finish();
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
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Edit_detail_data_obstetri.this.etxkehamilan_ke.getText().toString().length() == 0) {
                    Edit_detail_data_obstetri.this.etxkehamilan_ke.setError("Tidak Boleh Kosong");
                }
                if (Edit_detail_data_obstetri.this.etxtahun.getText().toString().length() == 0) {
                    Edit_detail_data_obstetri.this.etxtahun.setError("Tidak Boleh Kosong");
                }
                if (Edit_detail_data_obstetri.this.etxberat_lahir.getText().toString().length() == 0) {
                    Edit_detail_data_obstetri.this.etxberat_lahir.setError("Tidak Boleh Kosong");
                }
                if (Edit_detail_data_obstetri.this.etxtempat_bersalin_dan_tenakes.getText().toString().length() == 0) {
                    Edit_detail_data_obstetri.this.etxtempat_bersalin_dan_tenakes.setError("Tidak Boleh Kosong");
                }
                if (Edit_detail_data_obstetri.this.etxkondisi_anak_saat_ini.getText().toString().length() == 0) {
                    Edit_detail_data_obstetri.this.etxkondisi_anak_saat_ini.setError("Tidak Boleh Kosong");
                }
                if (Edit_detail_data_obstetri.this.etxkomplikasi_kehamilan_dan_persalinan.getText().toString().length() == 0) {
                    Edit_detail_data_obstetri.this.etxkomplikasi_kehamilan_dan_persalinan.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Edit_detail_data_obstetri.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatedataobstetri/" + Edit_detail_data_obstetri.this.getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_detail_data_obstetri.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Edit_detail_data_obstetri.this.finish();
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
                        Toast.makeText(Edit_detail_data_obstetri.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("kehamilan_ke", Edit_detail_data_obstetri.this.etxkehamilan_ke.getText().toString());
                        myParams.put("tahun", Edit_detail_data_obstetri.this.etxtahun.getText().toString());
                        myParams.put("berat_lahir_atau_panjang_lahir", Edit_detail_data_obstetri.this.etxberat_lahir.getText().toString());
                        myParams.put("tempat_bersalin_dan_tenakes", Edit_detail_data_obstetri.this.etxtempat_bersalin_dan_tenakes.getText().toString());
                        myParams.put("kondisi_anak_saat_ini", Edit_detail_data_obstetri.this.etxkondisi_anak_saat_ini.getText().toString());
                        myParams.put("komplikasi_kehamilan_atau_persalinan", Edit_detail_data_obstetri.this.etxkomplikasi_kehamilan_dan_persalinan.getText().toString());
                        myParams.put("status_lahir_hidup", Edit_detail_data_obstetri.this.spinnerlahir_hidup.getSelectedItem().toString());
                        myParams.put("status_lahir_aterm", Edit_detail_data_obstetri.this.spinnerlahir_aterm.getSelectedItem().toString());
                        myParams.put("status_lahir_spontan", Edit_detail_data_obstetri.this.spinnerlahir_spontan.getSelectedItem().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/editdataobstetri/" + getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("dataobstetri2");
                    String gkehamilanke = jsonObject.getString("kehamilan_ke");
                    String gtahun = jsonObject.getString("tahun");
                    String string = jsonObject.getString("lahir_hidup");
                    String string2 = jsonObject.getString("lahir_aterm");
                    String string3 = jsonObject.getString("lahir_spontan");
                    String gberat_lahir_atau_panjang_lahir = jsonObject.getString("berat_lahir_atau_panjang_lahir");
                    String gtempat_bersalin_dan_tenakes = jsonObject.getString("tempat_bersalin_dan_tenakes");
                    String gkondisi_anak_saat_ini = jsonObject.getString("kondisi_anak_saat_ini");
                    String gkomplikasi_kehamilan_atau_persalinan = jsonObject.getString("komplikasi_kehamilan_atau_persalinan");
                    Edit_detail_data_obstetri.this.etxkehamilan_ke.setText(gkehamilanke);
                    Edit_detail_data_obstetri.this.etxtahun.setText(gtahun);
                    Edit_detail_data_obstetri.this.etxberat_lahir.setText(gberat_lahir_atau_panjang_lahir);
                    Edit_detail_data_obstetri.this.etxtempat_bersalin_dan_tenakes.setText(gtempat_bersalin_dan_tenakes);
                    Edit_detail_data_obstetri.this.etxkondisi_anak_saat_ini.setText(gkondisi_anak_saat_ini);
                    Edit_detail_data_obstetri.this.etxkomplikasi_kehamilan_dan_persalinan.setText(gkomplikasi_kehamilan_atau_persalinan);
                    if(string.equals("Hidup")){
                        Edit_detail_data_obstetri.this.spinnerlahir_hidup.setSelection(1);
                    }
                    if(string.equals("Mati")){
                        Edit_detail_data_obstetri.this.spinnerlahir_hidup.setSelection(2);
                    }
                    if(string.equals("Abortus")){
                        Edit_detail_data_obstetri.this.spinnerlahir_hidup.setSelection(3);
                    }

                    if(string2.equals("Aterm")){
                        Edit_detail_data_obstetri.this.spinnerlahir_aterm.setSelection(1);
                    }
                    if(string2.equals("Mati")){
                        Edit_detail_data_obstetri.this.spinnerlahir_aterm.setSelection(2);
                    }
                    if(string2.equals("Preterm")){
                        Edit_detail_data_obstetri.this.spinnerlahir_aterm.setSelection(3);
                    }
                    if(string2.equals("Post Term")){
                        Edit_detail_data_obstetri.this.spinnerlahir_aterm.setSelection(4);
                    }

                    if(string3.equals("Spontan")){
                        Edit_detail_data_obstetri.this.spinnerlahir_spontan.setSelection(1);
                    }
                    if(string3.equals("SC")){
                        Edit_detail_data_obstetri.this.spinnerlahir_spontan.setSelection(2);
                    }
                    if(string3.equals("Lainnya")){
                        Edit_detail_data_obstetri.this.spinnerlahir_spontan.setSelection(3);
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
}
