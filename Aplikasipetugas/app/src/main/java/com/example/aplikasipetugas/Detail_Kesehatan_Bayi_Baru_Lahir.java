package com.example.aplikasipetugas;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
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

public class Detail_Kesehatan_Bayi_Baru_Lahir extends AppCompatActivity {
    TextView anak_ke;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxberat_badan1;
    EditText etxberat_badan2;
    EditText etxberat_badan3;
    EditText etxdan_lainlain1;
    EditText etxdan_lainlain2;
    EditText etxdan_lainlain3;
    EditText etxpanjang_badan1;
    EditText etxpanjang_badan2;
    EditText etxpanjang_badan3;
    EditText etxsuhu_1;
    EditText etxsuhu_2;
    EditText etxsuhu_3;
    EditText etxtanggal_kunjungan1;
    EditText etxtanggal_kunjungan2;
    EditText etxtanggal_kunjungan3;
    TextView nama_anak;
    TextView nama_ibu, nama_ayah;
    TextView nik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_kesehatan_bayi_baru_lahir);
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah = (TextView) findViewById(R.id.nama_ayah);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.etxtanggal_kunjungan1 = (EditText) findViewById(R.id.etxtanggal_kunjungan1);
        this.etxtanggal_kunjungan2 = (EditText) findViewById(R.id.etxtanggal_kunjungan2);
        this.etxtanggal_kunjungan3 = (EditText) findViewById(R.id.etxtanggal_kunjungan3);
        this.etxberat_badan1 = (EditText) findViewById(R.id.etxberat_badan1);
        this.etxberat_badan2 = (EditText) findViewById(R.id.etxberat_badan2);
        this.etxberat_badan3 = (EditText) findViewById(R.id.etxberat_badan3);
        this.etxpanjang_badan1 = (EditText) findViewById(R.id.etxpanjang_badan1);
        this.etxpanjang_badan2 = (EditText) findViewById(R.id.etxpanjang_badan2);
        this.etxpanjang_badan3 = (EditText) findViewById(R.id.etxpanjang_badan3);
        this.etxsuhu_1 = (EditText) findViewById(R.id.etxsuhu_1);
        this.etxsuhu_2 = (EditText) findViewById(R.id.etxsuhu_2);
        this.etxsuhu_3 = (EditText) findViewById(R.id.etxsuhu_3);
        this.etxdan_lainlain1 = (EditText) findViewById(R.id.etxdan_lainlain1);
        this.etxdan_lainlain2 = (EditText) findViewById(R.id.etxdan_lainlain2);
        this.etxdan_lainlain3 = (EditText) findViewById(R.id.etxdan_lainlain3);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);
        etxtanggal_kunjungan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        etxtanggal_kunjungan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        etxtanggal_kunjungan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog3();
            }
        });
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nama_ayah.setText(getIntent().getStringExtra("nama_ayah"));
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.anak_ke.setText(getIntent().getStringExtra("anak_ke"));
        if (getIntent().hasExtra("detail_kesehatan_bayi_baru_lahir")) {
            getData();
        }
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_Kesehatan_Bayi_Baru_Lahir.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_Kesehatan_Bayi_Baru_Lahir.this, Halaman_Login.class);
                        Detail_Kesehatan_Bayi_Baru_Lahir.this.startActivity(intent);
                        Detail_Kesehatan_Bayi_Baru_Lahir.this.finish();
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
                Detail_Kesehatan_Bayi_Baru_Lahir.this.startActivity(new Intent(Detail_Kesehatan_Bayi_Baru_Lahir.this.getApplicationContext(), Kesehatan_bayi_baru_lahir.class));
                Detail_Kesehatan_Bayi_Baru_Lahir.this.finish();
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan1.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan1.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan2.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan2.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan3.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan3.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan1.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan1.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan2.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan2.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan3.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan3.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan1.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan1.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan2.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan2.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan3.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan3.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_1.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_1.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_2.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_2.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_3.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_3.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain1.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain1.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain2.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain2.setError("Tidak Boleh Kosong");
                }
                if (Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain3.getText().toString().length() == 0) {
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain3.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(Detail_Kesehatan_Bayi_Baru_Lahir.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatekesehatanbayibarulahir/" + Detail_Kesehatan_Bayi_Baru_Lahir.this.getIntent().getIntExtra("detail_kesehatan_bayi_baru_lahir", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_Kesehatan_Bayi_Baru_Lahir.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Terupdate");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Detail_Kesehatan_Bayi_Baru_Lahir.this.finish();
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
                        Toast.makeText(Detail_Kesehatan_Bayi_Baru_Lahir.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Detail_Kesehatan_Bayi_Baru_Lahir.this.nik_ibu.getText().toString());
                        myParams.put("nama_ibu", Detail_Kesehatan_Bayi_Baru_Lahir.this.nama_ibu.getText().toString());
                        myParams.put("nama_anak", Detail_Kesehatan_Bayi_Baru_Lahir.this.nama_anak.getText().toString());
                        myParams.put("anak_ke", Detail_Kesehatan_Bayi_Baru_Lahir.this.anak_ke.getText().toString());
                        myParams.put("tanggal_kunjungan_1", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan1.getText().toString());
                        myParams.put("tanggal_kunjungan_2", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan2.getText().toString());
                        myParams.put("tanggal_kunjungan_3", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan3.getText().toString());
                        myParams.put("berat_badan_1", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan1.getText().toString());
                        myParams.put("berat_badan_2", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan2.getText().toString());
                        myParams.put("berat_badan_3", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan3.getText().toString());
                        myParams.put("panjang_badan_1", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan1.getText().toString());
                        myParams.put("panjang_badan_2", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan2.getText().toString());
                        myParams.put("panjang_badan_3", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan3.getText().toString());
                        myParams.put("suhu_1", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_1.getText().toString());
                        myParams.put("suhu_2", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_2.getText().toString());
                        myParams.put("suhu_3", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_3.getText().toString());
                        myParams.put("dan_lain_lain_1", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain1.getText().toString());
                        myParams.put("dan_lain_lain_2", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain2.getText().toString());
                        myParams.put("dan_lain_lain_3", Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain3.getText().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/detailkesehatanbayibarulahir/" + getIntent().getIntExtra("detail_kesehatan_bayi_baru_lahir", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("detailkesehatanbayibarulahir");
                    String gtanggal_kunjungan_1 = jsonObject.getString("tanggal_kunjungan_1");
                    String gtanggal_kunjungan_2 = jsonObject.getString("tanggal_kunjungan_2");
                    String gtanggal_kunjungan_3 = jsonObject.getString("tanggal_kunjungan_3");
                    String gberat_badan_1 = jsonObject.getString("berat_badan_1");
                    String gberat_badan_2 = jsonObject.getString("berat_badan_2");
                    String gberat_badan_3 = jsonObject.getString("berat_badan_3");
                    String gpanjang_badan_1 = jsonObject.getString("panjang_badan_1");
                    String gpanjang_badan_2 = jsonObject.getString("panjang_badan_2");
                    String gpanjang_badan_3 = jsonObject.getString("panjang_badan_3");
                    String gsuhu_1 = jsonObject.getString("suhu_1");
                    String gsuhu_2 = jsonObject.getString("suhu_2");
                    String gsuhu_3 = jsonObject.getString("suhu_3");
                    String gdan_lain_lain_1 = jsonObject.getString("dan_lain_lain_1");
                    String gdan_lain_lain_2 = jsonObject.getString("dan_lain_lain_2");
                    String gdan_lain_lain_3 = jsonObject.getString("dan_lain_lain_3");
                    JSONObject jSONObject = jsonObject;
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan1.setText(gtanggal_kunjungan_1);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan2.setText(gtanggal_kunjungan_2);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxtanggal_kunjungan3.setText(gtanggal_kunjungan_3);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan1.setText(gberat_badan_1);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan2.setText(gberat_badan_2);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxberat_badan3.setText(gberat_badan_3);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan1.setText(gpanjang_badan_1);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan2.setText(gpanjang_badan_2);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxpanjang_badan3.setText(gpanjang_badan_3);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_1.setText(gsuhu_1);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_2.setText(gsuhu_2);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxsuhu_3.setText(gsuhu_3);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain1.setText(gdan_lain_lain_1);
                    String str = gtanggal_kunjungan_1;
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain2.setText(gdan_lain_lain_2);
                    Detail_Kesehatan_Bayi_Baru_Lahir.this.etxdan_lainlain3.setText(gdan_lain_lain_3);
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

                etxtanggal_kunjungan1.setText(dateFormatter.format(newDate.getTime()));
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

                etxtanggal_kunjungan2.setText(dateFormatter.format(newDate.getTime()));
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

                etxtanggal_kunjungan3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
