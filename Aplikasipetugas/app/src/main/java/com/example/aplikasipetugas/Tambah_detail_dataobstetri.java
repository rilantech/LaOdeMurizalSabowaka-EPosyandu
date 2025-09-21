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

public class Tambah_detail_dataobstetri extends AppCompatActivity {
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
        setContentView((int) R.layout.activity_tambah_detail_dataobstetri);
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
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_detail_dataobstetri.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_detail_dataobstetri.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_detail_dataobstetri.this.startActivity(intent);
                        Tambah_detail_dataobstetri.this.finish();
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
                Tambah_detail_dataobstetri.this.finish();
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_detail_dataobstetri.this.etxkehamilan_ke.setText("");
                Tambah_detail_dataobstetri.this.etxtahun.setText("");
                Tambah_detail_dataobstetri.this.etxberat_lahir.setText("");
                Tambah_detail_dataobstetri.this.etxtempat_bersalin_dan_tenakes.setText("");
                Tambah_detail_dataobstetri.this.etxkondisi_anak_saat_ini.setText("");
                Tambah_detail_dataobstetri.this.etxkomplikasi_kehamilan_dan_persalinan.setText("");
                Tambah_detail_dataobstetri.this.spinnerlahir_hidup.setSelection(0);
                Tambah_detail_dataobstetri.this.spinnerlahir_aterm.setSelection(0);
                Tambah_detail_dataobstetri.this.spinnerlahir_spontan.setSelection(0);
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Tambah_detail_dataobstetri.this.etxkehamilan_ke.getText().toString().length() == 0) {
                    Tambah_detail_dataobstetri.this.etxkehamilan_ke.setError("Tidak Boleh Kosong");
                }
                if (Tambah_detail_dataobstetri.this.etxtahun.getText().toString().length() == 0) {
                    Tambah_detail_dataobstetri.this.etxtahun.setError("Tidak Boleh Kosong");
                }
                if (Tambah_detail_dataobstetri.this.etxberat_lahir.getText().toString().length() == 0) {
                    Tambah_detail_dataobstetri.this.etxberat_lahir.setError("Tidak Boleh Kosong");
                }
                if (Tambah_detail_dataobstetri.this.etxtempat_bersalin_dan_tenakes.getText().toString().length() == 0) {
                    Tambah_detail_dataobstetri.this.etxtempat_bersalin_dan_tenakes.setError("Tidak Boleh Kosong");
                }
                if (Tambah_detail_dataobstetri.this.etxkondisi_anak_saat_ini.getText().toString().length() == 0) {
                    Tambah_detail_dataobstetri.this.etxkondisi_anak_saat_ini.setError("Tidak Boleh Kosong");
                }
                if (Tambah_detail_dataobstetri.this.etxkomplikasi_kehamilan_dan_persalinan.getText().toString().length() == 0) {
                    Tambah_detail_dataobstetri.this.etxkomplikasi_kehamilan_dan_persalinan.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Tambah_detail_dataobstetri.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/dataobstetri", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_detail_dataobstetri.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Tambah_detail_dataobstetri.this.finish();
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
                        Toast.makeText(Tambah_detail_dataobstetri.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_detail_dataobstetri.this.getIntent().getStringExtra("nik_ibu"));
                        myParams.put("kehamilan_ke", Tambah_detail_dataobstetri.this.etxkehamilan_ke.getText().toString());
                        myParams.put("tahun", Tambah_detail_dataobstetri.this.etxtahun.getText().toString());
                        myParams.put("berat_lahir_atau_panjang_lahir", Tambah_detail_dataobstetri.this.etxberat_lahir.getText().toString());
                        myParams.put("tempat_bersalin_dan_tenakes", Tambah_detail_dataobstetri.this.etxtempat_bersalin_dan_tenakes.getText().toString());
                        myParams.put("kondisi_anak_saat_ini", Tambah_detail_dataobstetri.this.etxkondisi_anak_saat_ini.getText().toString());
                        myParams.put("komplikasi_kehamilan_atau_persalinan", Tambah_detail_dataobstetri.this.etxkomplikasi_kehamilan_dan_persalinan.getText().toString());
                        myParams.put("status_lahir_hidup", Tambah_detail_dataobstetri.this.spinnerlahir_hidup.getSelectedItem().toString());
                        myParams.put("status_lahir_aterm", Tambah_detail_dataobstetri.this.spinnerlahir_aterm.getSelectedItem().toString());
                        myParams.put("status_lahir_spontan", Tambah_detail_dataobstetri.this.spinnerlahir_spontan.getSelectedItem().toString());
                        return myParams;
                    }
                });
            }
        });
    }
}
