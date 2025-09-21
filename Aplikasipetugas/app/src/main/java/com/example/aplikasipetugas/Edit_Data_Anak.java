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

public class Edit_Data_Anak extends AppCompatActivity {
    Button btnbatal;
    Button btnsimpan;
    Button btntambahdataanak;
    ImageView butonlogout;
    EditText etxanakke;
    EditText etxdari;
    EditText etxnamaanak;
    EditText etxnoaktekelahiran;
    EditText etxnobpjsanak;
    EditText etxtempatlahiranak, etxtanggallahiranak;
    Spinner spinnerjenis_kelamin;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_edit_data_anak);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.etxnamaanak = (EditText) findViewById(R.id.etxnamaanak);
        this.spinnerjenis_kelamin = (Spinner) findViewById(R.id.spinnerjenis_kelamin);
        etxtempatlahiranak = (EditText) findViewById(R.id.etxtempatlahiranak);
        etxtanggallahiranak = (EditText) findViewById(R.id.etxtanggallahiranak);
        this.etxanakke = (EditText) findViewById(R.id.etxanakke);
        this.etxdari = (EditText) findViewById(R.id.etxdari);
        this.etxnoaktekelahiran = (EditText) findViewById(R.id.etxnoaktekelahiran);
        this.etxnobpjsanak = (EditText) findViewById(R.id.etxnobpjsanak);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);
        this.etxnamaanak.setText(getIntent().getStringExtra("namaanak"));
        if(getIntent().getStringExtra("jeniskelamin").equals("Laki-Laki")){
            spinnerjenis_kelamin.setSelection(0);
        }
        if(getIntent().getStringExtra("jeniskelamin").equals("Perempuan")){
            spinnerjenis_kelamin.setSelection(1);
        }
        this.etxtempatlahiranak.setText(getIntent().getStringExtra("tempatlahiranak"));
        this.etxtanggallahiranak.setText(getIntent().getStringExtra("tanggallahiranak"));
        this.etxanakke.setText(getIntent().getStringExtra("anak_ke"));
        this.etxdari.setText(getIntent().getStringExtra("dari"));
        this.etxnoaktekelahiran.setText(getIntent().getStringExtra("no_akta_kelahiran"));
        this.etxnobpjsanak.setText(getIntent().getStringExtra("no_jkn_bpjs"));
        etxtanggallahiranak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_Data_Anak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Edit_Data_Anak.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Edit_Data_Anak.this.startActivity(intent);
                        Edit_Data_Anak.this.finish();
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
                Edit_Data_Anak.this.finish();
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Volley.newRequestQueue(Edit_Data_Anak.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/editdataanak2/" + Edit_Data_Anak.this.getIntent().getIntExtra("dataid", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Edit_Data_Anak.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Terupdate");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Edit_Data_Anak.this.finish();
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
                        Toast.makeText(Edit_Data_Anak.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Edit_Data_Anak.this.getIntent().getStringExtra("nik_ibu"));
                        myParams.put("nama_anak", Edit_Data_Anak.this.etxnamaanak.getText().toString());
                        myParams.put("jenis_kelamin", Edit_Data_Anak.this.spinnerjenis_kelamin.getSelectedItem().toString());
                        myParams.put("tempat_lahir_anak", Edit_Data_Anak.this.etxtempatlahiranak.getText().toString());
                        myParams.put("tanggal_lahir_anak", Edit_Data_Anak.this.etxtanggallahiranak.getText().toString());
                        myParams.put("anak_ke", Edit_Data_Anak.this.etxanakke.getText().toString());
                        myParams.put("dari", Edit_Data_Anak.this.etxdari.getText().toString());
                        myParams.put("no_akta_kelahiran", Edit_Data_Anak.this.etxnoaktekelahiran.getText().toString());
                        myParams.put("no_jkn_bpjs_anak", Edit_Data_Anak.this.etxnobpjsanak.getText().toString());
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

                etxtanggallahiranak.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
