package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tambah_matriks_pantau_perkembangan_anak extends AppCompatActivity {
    public static String item1;
    public static String item2;
    TextView anak_ke;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxhasil_1;
    EditText etxhasil_12;
    EditText etxhasil_15;
    EditText etxhasil_18;
    EditText etxhasil_21;
    EditText etxhasil_24;
    EditText etxhasil_3;
    EditText etxhasil_30;
    EditText etxhasil_36;
    EditText etxhasil_42;
    EditText etxhasil_48;
    EditText etxhasil_54;
    EditText etxhasil_6;
    EditText etxhasil_60;
    EditText etxhasil_66;
    EditText etxhasil_72;
    EditText etxhasil_9;
    EditText etxtanggal_pemantauan_perkembangan_1;
    EditText etxtanggal_pemantauan_perkembangan_12;
    EditText etxtanggal_pemantauan_perkembangan_15;
    EditText etxtanggal_pemantauan_perkembangan_18;
    EditText etxtanggal_pemantauan_perkembangan_21;
    EditText etxtanggal_pemantauan_perkembangan_24;
    EditText etxtanggal_pemantauan_perkembangan_3;
    EditText etxtanggal_pemantauan_perkembangan_30;
    EditText etxtanggal_pemantauan_perkembangan_36;
    EditText etxtanggal_pemantauan_perkembangan_42;
    EditText etxtanggal_pemantauan_perkembangan_48;
    EditText etxtanggal_pemantauan_perkembangan_54;
    EditText etxtanggal_pemantauan_perkembangan_6;
    EditText etxtanggal_pemantauan_perkembangan_60;
    EditText etxtanggal_pemantauan_perkembangan_66;
    EditText etxtanggal_pemantauan_perkembangan_72;
    EditText etxtanggal_pemantauan_perkembangan_9;
    EditText etxtanggal_pemantauan_selanjutnya_1;
    EditText etxtanggal_pemantauan_selanjutnya_12;
    EditText etxtanggal_pemantauan_selanjutnya_15;
    EditText etxtanggal_pemantauan_selanjutnya_18;
    EditText etxtanggal_pemantauan_selanjutnya_21;
    EditText etxtanggal_pemantauan_selanjutnya_24;
    EditText etxtanggal_pemantauan_selanjutnya_3;
    EditText etxtanggal_pemantauan_selanjutnya_30;
    EditText etxtanggal_pemantauan_selanjutnya_36;
    EditText etxtanggal_pemantauan_selanjutnya_42;
    EditText etxtanggal_pemantauan_selanjutnya_48;
    EditText etxtanggal_pemantauan_selanjutnya_54;
    EditText etxtanggal_pemantauan_selanjutnya_6;
    EditText etxtanggal_pemantauan_selanjutnya_60;
    EditText etxtanggal_pemantauan_selanjutnya_66;
    EditText etxtanggal_pemantauan_selanjutnya_72;
    EditText etxtanggal_pemantauan_selanjutnya_9;
    EditText etxtindakan_1;
    EditText etxtindakan_12;
    EditText etxtindakan_15;
    EditText etxtindakan_18;
    EditText etxtindakan_21;
    EditText etxtindakan_24;
    EditText etxtindakan_3;
    EditText etxtindakan_30;
    EditText etxtindakan_36;
    EditText etxtindakan_42;
    EditText etxtindakan_48;
    EditText etxtindakan_54;
    EditText etxtindakan_6;
    EditText etxtindakan_60;
    EditText etxtindakan_66;
    EditText etxtindakan_72;
    EditText etxtindakan_9;
    ArrayList<String> list_namaanak = new ArrayList<>();
    ArrayList<String> list_nikibu = new ArrayList<>();
    TextView nama_ibu1;
    ArrayAdapter<String> namaanak_adapter;
    ArrayAdapter<String> nikibu_adapter;
    Spinner spinnernama_anak;
    Spinner spinnernik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tambah_matriks_pantau_perkembangan_anak);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.spinnernik_ibu = (Spinner) findViewById(R.id.spinnernik_ibu);
        this.spinnernama_anak = (Spinner) findViewById(R.id.spinnernama_anak);
        this.nama_ibu1 = (TextView) findViewById(R.id.nama_ibuku);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.etxtanggal_pemantauan_perkembangan_1 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_1);
        this.etxtanggal_pemantauan_perkembangan_3 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_3);
        this.etxtanggal_pemantauan_perkembangan_6 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_6);
        this.etxtanggal_pemantauan_perkembangan_9 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_9);
        this.etxtanggal_pemantauan_perkembangan_12 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_12);
        this.etxtanggal_pemantauan_perkembangan_15 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_15);
        this.etxtanggal_pemantauan_perkembangan_18 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_18);
        this.etxtanggal_pemantauan_perkembangan_21 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_21);
        this.etxtanggal_pemantauan_perkembangan_24 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_24);
        this.etxtanggal_pemantauan_perkembangan_30 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_30);
        this.etxtanggal_pemantauan_perkembangan_36 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_36);
        this.etxtanggal_pemantauan_perkembangan_42 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_42);
        this.etxtanggal_pemantauan_perkembangan_48 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_48);
        this.etxtanggal_pemantauan_perkembangan_54 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_54);
        this.etxtanggal_pemantauan_perkembangan_60 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_60);
        this.etxtanggal_pemantauan_perkembangan_66 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_66);
        this.etxtanggal_pemantauan_perkembangan_72 = (EditText) findViewById(R.id.etxtanggal_pemantauan_perkembangan_72);
        this.etxhasil_1 = (EditText) findViewById(R.id.etxhasil_1);
        this.etxhasil_3 = (EditText) findViewById(R.id.etxhasil_3);
        this.etxhasil_6 = (EditText) findViewById(R.id.etxhasil_6);
        this.etxhasil_9 = (EditText) findViewById(R.id.etxhasil_9);
        this.etxhasil_12 = (EditText) findViewById(R.id.etxhasil_12);
        this.etxhasil_15 = (EditText) findViewById(R.id.etxhasil_15);
        this.etxhasil_18 = (EditText) findViewById(R.id.etxhasil_18);
        this.etxhasil_21 = (EditText) findViewById(R.id.etxhasil_21);
        this.etxhasil_24 = (EditText) findViewById(R.id.etxhasil_24);
        this.etxhasil_30 = (EditText) findViewById(R.id.etxhasil_30);
        this.etxhasil_36 = (EditText) findViewById(R.id.etxhasil_36);
        this.etxhasil_42 = (EditText) findViewById(R.id.etxhasil_42);
        this.etxhasil_48 = (EditText) findViewById(R.id.etxhasil_48);
        this.etxhasil_54 = (EditText) findViewById(R.id.etxhasil_54);
        this.etxhasil_60 = (EditText) findViewById(R.id.etxhasil_60);
        this.etxhasil_66 = (EditText) findViewById(R.id.etxhasil_66);
        this.etxhasil_72 = (EditText) findViewById(R.id.etxhasil_72);
        this.etxtindakan_1 = (EditText) findViewById(R.id.etxtindakan_1);
        this.etxtindakan_3 = (EditText) findViewById(R.id.etxtindakan_3);
        this.etxtindakan_6 = (EditText) findViewById(R.id.etxtindakan_6);
        this.etxtindakan_9 = (EditText) findViewById(R.id.etxtindakan_9);
        this.etxtindakan_12 = (EditText) findViewById(R.id.etxtindakan_12);
        this.etxtindakan_15 = (EditText) findViewById(R.id.etxtindakan_15);
        this.etxtindakan_18 = (EditText) findViewById(R.id.etxtindakan_18);
        this.etxtindakan_21 = (EditText) findViewById(R.id.etxtindakan_21);
        this.etxtindakan_24 = (EditText) findViewById(R.id.etxtindakan_24);
        this.etxtindakan_30 = (EditText) findViewById(R.id.etxtindakan_30);
        this.etxtindakan_36 = (EditText) findViewById(R.id.etxtindakan_36);
        this.etxtindakan_42 = (EditText) findViewById(R.id.etxtindakan_42);
        this.etxtindakan_48 = (EditText) findViewById(R.id.etxtindakan_48);
        this.etxtindakan_54 = (EditText) findViewById(R.id.etxtindakan_54);
        this.etxtindakan_60 = (EditText) findViewById(R.id.etxtindakan_60);
        this.etxtindakan_66 = (EditText) findViewById(R.id.etxtindakan_66);
        this.etxtindakan_72 = (EditText) findViewById(R.id.etxtindakan_72);
        this.etxtanggal_pemantauan_selanjutnya_1 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_1);
        this.etxtanggal_pemantauan_selanjutnya_3 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_3);
        this.etxtanggal_pemantauan_selanjutnya_6 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_6);
        this.etxtanggal_pemantauan_selanjutnya_9 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_9);
        this.etxtanggal_pemantauan_selanjutnya_12 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_12);
        this.etxtanggal_pemantauan_selanjutnya_15 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_15);
        this.etxtanggal_pemantauan_selanjutnya_18 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_18);
        this.etxtanggal_pemantauan_selanjutnya_21 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_21);
        this.etxtanggal_pemantauan_selanjutnya_24 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_24);
        this.etxtanggal_pemantauan_selanjutnya_30 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_30);
        this.etxtanggal_pemantauan_selanjutnya_36 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_36);
        this.etxtanggal_pemantauan_selanjutnya_42 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_42);
        this.etxtanggal_pemantauan_selanjutnya_48 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_48);
        this.etxtanggal_pemantauan_selanjutnya_54 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_54);
        this.etxtanggal_pemantauan_selanjutnya_60 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_60);
        this.etxtanggal_pemantauan_selanjutnya_66 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_66);
        this.etxtanggal_pemantauan_selanjutnya_72 = (EditText) findViewById(R.id.etxtanggal_pemantauan_selanjutnya_72);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_matriks_pantau_perkembangan_anak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_matriks_pantau_perkembangan_anak.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_matriks_pantau_perkembangan_anak.this.startActivity(intent);
                        Tambah_matriks_pantau_perkembangan_anak.this.finish();
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
                Tambah_matriks_pantau_perkembangan_anak.this.finish();
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_1.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_3.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_6.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_9.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_12.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_15.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_18.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_21.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_24.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_30.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_36.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_42.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_48.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_54.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_60.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_66.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_72.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_1.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_3.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_6.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_9.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_12.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_15.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_18.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_21.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_24.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_30.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_36.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_42.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_48.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_54.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_60.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_66.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_72.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_1.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_3.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_6.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_9.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_12.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_15.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_18.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_21.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_24.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_30.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_36.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_42.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_48.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_54.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_60.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_66.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_72.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_1.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_3.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_6.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_9.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_12.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_15.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_18.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_21.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_24.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_30.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_36.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_42.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_48.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_54.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_60.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_66.setText("");
                Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_72.setText("");
            }
        });
        list_nik();
        this.spinnernik_ibu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_matriks_pantau_perkembangan_anak.item1 = Tambah_matriks_pantau_perkembangan_anak.this.spinnernik_ibu.getSelectedItem().toString();
                Tambah_matriks_pantau_perkembangan_anak.this.list_namaanak.clear();
                Tambah_matriks_pantau_perkembangan_anak.this.tampilkannama();
                Tambah_matriks_pantau_perkembangan_anak.this.list_namaanakku();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnernama_anak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_matriks_pantau_perkembangan_anak.item2 = Tambah_matriks_pantau_perkembangan_anak.this.spinnernama_anak.getSelectedItem().toString();
                Tambah_matriks_pantau_perkembangan_anak.this.tampilkananakke();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Volley.newRequestQueue(Tambah_matriks_pantau_perkembangan_anak.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/matrikspantauperkembangananak", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_matriks_pantau_perkembangan_anak.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(), MatriksPantauPerkembanganAnak.class));
                                        Tambah_matriks_pantau_perkembangan_anak.this.finish();
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
                        Toast.makeText(Tambah_matriks_pantau_perkembangan_anak.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_matriks_pantau_perkembangan_anak.this.spinnernik_ibu.getSelectedItem().toString());
                        myParams.put("nama_ibu", Tambah_matriks_pantau_perkembangan_anak.this.nama_ibu1.getText().toString());
                        myParams.put("nama_anak", Tambah_matriks_pantau_perkembangan_anak.this.spinnernama_anak.getSelectedItem().toString());
                        myParams.put("anak_ke", Tambah_matriks_pantau_perkembangan_anak.this.anak_ke.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_1", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_1.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_3", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_3.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_6", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_6.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_9", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_9.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_12", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_12.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_15", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_15.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_18", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_18.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_21", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_21.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_24", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_24.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_30", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_30.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_36", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_36.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_42", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_42.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_48", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_48.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_54", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_54.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_60", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_60.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_66", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_66.getText().toString());
                        myParams.put("tanggal_pemantauan_perkembangan_72", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_perkembangan_72.getText().toString());
                        myParams.put("hasil_1", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_1.getText().toString());
                        myParams.put("hasil_3", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_3.getText().toString());
                        myParams.put("hasil_6", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_6.getText().toString());
                        myParams.put("hasil_9", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_9.getText().toString());
                        myParams.put("hasil_12", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_12.getText().toString());
                        myParams.put("hasil_15", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_15.getText().toString());
                        myParams.put("hasil_18", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_18.getText().toString());
                        myParams.put("hasil_21", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_21.getText().toString());
                        myParams.put("hasil_24", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_24.getText().toString());
                        myParams.put("hasil_30", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_30.getText().toString());
                        myParams.put("hasil_36", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_36.getText().toString());
                        myParams.put("hasil_42", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_42.getText().toString());
                        myParams.put("hasil_48", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_48.getText().toString());
                        myParams.put("hasil_54", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_54.getText().toString());
                        myParams.put("hasil_60", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_60.getText().toString());
                        myParams.put("hasil_66", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_66.getText().toString());
                        myParams.put("hasil_72", Tambah_matriks_pantau_perkembangan_anak.this.etxhasil_72.getText().toString());
                        myParams.put("tindakan_1", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_1.getText().toString());
                        myParams.put("tindakan_3", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_3.getText().toString());
                        myParams.put("tindakan_6", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_6.getText().toString());
                        myParams.put("tindakan_9", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_9.getText().toString());
                        myParams.put("tindakan_12", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_12.getText().toString());
                        myParams.put("tindakan_15", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_15.getText().toString());
                        myParams.put("tindakan_18", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_18.getText().toString());
                        myParams.put("tindakan_21", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_21.getText().toString());
                        myParams.put("tindakan_24", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_24.getText().toString());
                        myParams.put("tindakan_30", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_30.getText().toString());
                        myParams.put("tindakan_36", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_36.getText().toString());
                        myParams.put("tindakan_42", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_42.getText().toString());
                        myParams.put("tindakan_48", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_48.getText().toString());
                        myParams.put("tindakan_54", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_54.getText().toString());
                        myParams.put("tindakan_60", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_60.getText().toString());
                        myParams.put("tindakan_66", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_66.getText().toString());
                        myParams.put("tindakan_72", Tambah_matriks_pantau_perkembangan_anak.this.etxtindakan_72.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_1", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_1.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_3", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_3.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_6", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_6.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_9", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_9.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_12", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_12.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_15", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_15.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_18", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_18.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_21", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_21.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_24", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_24.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_30", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_30.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_36", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_36.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_42", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_42.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_48", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_48.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_54", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_54.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_60", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_60.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_66", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_66.getText().toString());
                        myParams.put("tanggal_pemantauan_selanjutnya_72", Tambah_matriks_pantau_perkembangan_anak.this.etxtanggal_pemantauan_selanjutnya_72.getText().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void tampilkannama() {
        Volley.newRequestQueue(getApplicationContext()).add(new StringRequest(0, new Configurasi().baseUrl() + "api/caridataibudananak/" + item1 + "/" + item2, new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtua2");
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        Tambah_matriks_pantau_perkembangan_anak.this.nama_ibu1.setText(jsonArray.getJSONObject(i).getString("nama_ibu"));
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

    /* access modifiers changed from: package-private */
    public void tampilkananakke() {
        Volley.newRequestQueue(getApplicationContext()).add(new StringRequest(0, new Configurasi().baseUrl() + "api/caridataibudananak/" + item1 + "/" + item2, new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataanak1");
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        Tambah_matriks_pantau_perkembangan_anak.this.anak_ke.setText(jsonArray.getJSONObject(i).getString("anak_ke"));
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

    /* access modifiers changed from: package-private */
    public void list_namaanakku() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/caridataibudananak/" + item1 + "/" + item2, new Response.Listener<String>() {
            @SuppressLint("ResourceType")
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray2 = new JSONObject(response).getJSONArray("dataanak");
                    for (int j = 0; j <= jsonArray2.length(); j++) {
                        Tambah_matriks_pantau_perkembangan_anak.this.list_namaanak.add(jsonArray2.getJSONObject(j).getString("nama"));
                        Tambah_matriks_pantau_perkembangan_anak tambah_matriks_pantau_perkembangan_anak = Tambah_matriks_pantau_perkembangan_anak.this;
                        Tambah_matriks_pantau_perkembangan_anak tambah_matriks_pantau_perkembangan_anak2 = Tambah_matriks_pantau_perkembangan_anak.this;
                        tambah_matriks_pantau_perkembangan_anak.namaanak_adapter = new ArrayAdapter<>(tambah_matriks_pantau_perkembangan_anak2, 17367048, tambah_matriks_pantau_perkembangan_anak2.list_namaanak);
                        Tambah_matriks_pantau_perkembangan_anak.this.namaanak_adapter.setDropDownViewResource(17367049);
                        Tambah_matriks_pantau_perkembangan_anak.this.spinnernama_anak.setAdapter(Tambah_matriks_pantau_perkembangan_anak.this.namaanak_adapter);
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

    /* access modifiers changed from: package-private */
    public void list_nik() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/tambahkesehatanbayibarulahir", new Response.Listener<String>() {
            @SuppressLint("ResourceType")
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("dataorangtua1");
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        Tambah_matriks_pantau_perkembangan_anak.this.list_nikibu.add(jsonArray.getJSONObject(i).getString("nik"));
                        Tambah_matriks_pantau_perkembangan_anak tambah_matriks_pantau_perkembangan_anak = Tambah_matriks_pantau_perkembangan_anak.this;
                        Tambah_matriks_pantau_perkembangan_anak tambah_matriks_pantau_perkembangan_anak2 = Tambah_matriks_pantau_perkembangan_anak.this;
                        tambah_matriks_pantau_perkembangan_anak.nikibu_adapter = new ArrayAdapter<>(tambah_matriks_pantau_perkembangan_anak2, 17367048, tambah_matriks_pantau_perkembangan_anak2.list_nikibu);
                        Tambah_matriks_pantau_perkembangan_anak.this.nikibu_adapter.setDropDownViewResource(17367049);
                        Tambah_matriks_pantau_perkembangan_anak.this.spinnernik_ibu.setAdapter(Tambah_matriks_pantau_perkembangan_anak.this.nikibu_adapter);
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
