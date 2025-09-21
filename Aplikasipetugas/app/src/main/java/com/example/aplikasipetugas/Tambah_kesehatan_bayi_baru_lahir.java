package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tambah_kesehatan_bayi_baru_lahir extends AppCompatActivity {
    public static String item1;
    public static String item2;
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
    ArrayList<String> list_namaanak = new ArrayList<>();
    ArrayList<String> list_nikibu = new ArrayList<>();
    TextView nama_ibu1, nama_ayah;
    ArrayAdapter<String> namaanak_adapter;
    ArrayAdapter<String> nikibu_adapter;
    Spinner spinnernama_anak;
    Spinner spinnernik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tambah_kesehatan_bayi_baru_lahir);
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.spinnernik_ibu = (Spinner) findViewById(R.id.spinnernik_ibu);
        this.spinnernama_anak = (Spinner) findViewById(R.id.spinnernama_anak);
        this.nama_ibu1 = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah= (TextView) findViewById(R.id.nama_ayah);
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
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_kesehatan_bayi_baru_lahir.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_kesehatan_bayi_baru_lahir.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_kesehatan_bayi_baru_lahir.this.startActivity(intent);
                        Tambah_kesehatan_bayi_baru_lahir.this.finish();
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
                Tambah_kesehatan_bayi_baru_lahir.this.finish();
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_kesehatan_bayi_baru_lahir.this.etxtanggal_kunjungan1.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxtanggal_kunjungan2.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxtanggal_kunjungan3.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxberat_badan1.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxberat_badan2.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxberat_badan3.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxpanjang_badan1.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxpanjang_badan2.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxpanjang_badan3.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxsuhu_1.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxsuhu_2.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxsuhu_3.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxdan_lainlain1.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxdan_lainlain2.setText("");
                Tambah_kesehatan_bayi_baru_lahir.this.etxdan_lainlain3.setText("");
            }
        });
        list_nik();
        this.spinnernik_ibu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_kesehatan_bayi_baru_lahir.item1 = Tambah_kesehatan_bayi_baru_lahir.this.spinnernik_ibu.getSelectedItem().toString();
                Tambah_kesehatan_bayi_baru_lahir.this.list_namaanak.clear();
                Tambah_kesehatan_bayi_baru_lahir.this.tampilkannama();
                Tambah_kesehatan_bayi_baru_lahir.this.list_namaanakku();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnernama_anak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_kesehatan_bayi_baru_lahir.item2 = Tambah_kesehatan_bayi_baru_lahir.this.spinnernama_anak.getSelectedItem().toString();
                Tambah_kesehatan_bayi_baru_lahir.this.tampilkananakke();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (etxtanggal_kunjungan1.getText().toString().length() == 0) {
                    etxtanggal_kunjungan1.setError("Tidak Boleh Kosong");
                }
                if (etxtanggal_kunjungan2.getText().toString().length() == 0) {
                    etxtanggal_kunjungan2.setError("Tidak Boleh Kosong");
                }
                if (etxtanggal_kunjungan3.getText().toString().length() == 0) {
                    etxtanggal_kunjungan3.setError("Tidak Boleh Kosong");
                }
                if (etxberat_badan1.getText().toString().length() == 0) {
                    etxberat_badan1.setError("Tidak Boleh Kosong");
                }
                if (etxberat_badan2.getText().toString().length() == 0) {
                    etxberat_badan2.setError("Tidak Boleh Kosong");
                }
                if (etxberat_badan3.getText().toString().length() == 0) {
                    etxberat_badan3.setError("Tidak Boleh Kosong");
                }
                if (etxpanjang_badan1.getText().toString().length() == 0) {
                    etxpanjang_badan1.setError("Tidak Boleh Kosong");
                }
                if (etxpanjang_badan2.getText().toString().length() == 0) {
                    etxpanjang_badan2.setError("Tidak Boleh Kosong");
                }
                if (etxpanjang_badan3.getText().toString().length() == 0) {
                    etxpanjang_badan3.setError("Tidak Boleh Kosong");
                }
                if (etxsuhu_1.getText().toString().length() == 0) {
                    etxsuhu_1.setError("Tidak Boleh Kosong");
                }
                if (etxsuhu_2.getText().toString().length() == 0) {
                    etxsuhu_2.setError("Tidak Boleh Kosong");
                }
                if (etxsuhu_3.getText().toString().length() == 0) {
                    etxsuhu_3.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lainlain1.getText().toString().length() == 0) {
                    etxdan_lainlain1.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lainlain2.getText().toString().length() == 0) {
                    etxdan_lainlain2.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lainlain3.getText().toString().length() == 0) {
                    etxdan_lainlain3.setError("Tidak Boleh Kosong");
                }
                Volley.newRequestQueue(Tambah_kesehatan_bayi_baru_lahir.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/kesehatanbayibarulahir", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_kesehatan_bayi_baru_lahir.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(), Kesehatan_bayi_baru_lahir.class));
                                        Tambah_kesehatan_bayi_baru_lahir.this.finish();
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
                        Toast.makeText(Tambah_kesehatan_bayi_baru_lahir.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_kesehatan_bayi_baru_lahir.this.spinnernik_ibu.getSelectedItem().toString());
                        myParams.put("nama_ibu", Tambah_kesehatan_bayi_baru_lahir.this.nama_ibu1.getText().toString());
                        myParams.put("nama_ayah", Tambah_kesehatan_bayi_baru_lahir.this.nama_ayah.getText().toString());
                        myParams.put("nama_anak", Tambah_kesehatan_bayi_baru_lahir.this.spinnernama_anak.getSelectedItem().toString());
                        myParams.put("anak_ke", Tambah_kesehatan_bayi_baru_lahir.this.anak_ke.getText().toString());
                        myParams.put("tanggal_kunjungan_1", Tambah_kesehatan_bayi_baru_lahir.this.etxtanggal_kunjungan1.getText().toString());
                        myParams.put("tanggal_kunjungan_2", Tambah_kesehatan_bayi_baru_lahir.this.etxtanggal_kunjungan2.getText().toString());
                        myParams.put("tanggal_kunjungan_3", Tambah_kesehatan_bayi_baru_lahir.this.etxtanggal_kunjungan3.getText().toString());
                        myParams.put("berat_badan_1", Tambah_kesehatan_bayi_baru_lahir.this.etxberat_badan1.getText().toString());
                        myParams.put("berat_badan_2", Tambah_kesehatan_bayi_baru_lahir.this.etxberat_badan2.getText().toString());
                        myParams.put("berat_badan_3", Tambah_kesehatan_bayi_baru_lahir.this.etxberat_badan3.getText().toString());
                        myParams.put("panjang_badan_1", Tambah_kesehatan_bayi_baru_lahir.this.etxpanjang_badan1.getText().toString());
                        myParams.put("panjang_badan_2", Tambah_kesehatan_bayi_baru_lahir.this.etxpanjang_badan2.getText().toString());
                        myParams.put("panjang_badan_3", Tambah_kesehatan_bayi_baru_lahir.this.etxpanjang_badan3.getText().toString());
                        myParams.put("suhu_1", Tambah_kesehatan_bayi_baru_lahir.this.etxsuhu_1.getText().toString());
                        myParams.put("suhu_2", Tambah_kesehatan_bayi_baru_lahir.this.etxsuhu_2.getText().toString());
                        myParams.put("suhu_3", Tambah_kesehatan_bayi_baru_lahir.this.etxsuhu_3.getText().toString());
                        myParams.put("dan_lain_lain_1", Tambah_kesehatan_bayi_baru_lahir.this.etxdan_lainlain1.getText().toString());
                        myParams.put("dan_lain_lain_2", Tambah_kesehatan_bayi_baru_lahir.this.etxdan_lainlain2.getText().toString());
                        myParams.put("dan_lain_lain_3", Tambah_kesehatan_bayi_baru_lahir.this.etxdan_lainlain3.getText().toString());
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
                        Tambah_kesehatan_bayi_baru_lahir.this.nama_ibu1.setText(jsonArray.getJSONObject(i).getString("nama_ibu"));
                        Tambah_kesehatan_bayi_baru_lahir.this.nama_ayah.setText(jsonArray.getJSONObject(i).getString("nama_ayah"));
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
                        Tambah_kesehatan_bayi_baru_lahir.this.anak_ke.setText(jsonArray.getJSONObject(i).getString("anak_ke"));
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
                        Tambah_kesehatan_bayi_baru_lahir.this.list_namaanak.add(jsonArray2.getJSONObject(j).getString("nama"));
                        Tambah_kesehatan_bayi_baru_lahir tambah_kesehatan_bayi_baru_lahir = Tambah_kesehatan_bayi_baru_lahir.this;
                        Tambah_kesehatan_bayi_baru_lahir tambah_kesehatan_bayi_baru_lahir2 = Tambah_kesehatan_bayi_baru_lahir.this;
                        tambah_kesehatan_bayi_baru_lahir.namaanak_adapter = new ArrayAdapter<>(tambah_kesehatan_bayi_baru_lahir2, 17367048, tambah_kesehatan_bayi_baru_lahir2.list_namaanak);
                        Tambah_kesehatan_bayi_baru_lahir.this.namaanak_adapter.setDropDownViewResource(17367049);
                        Tambah_kesehatan_bayi_baru_lahir.this.spinnernama_anak.setAdapter(Tambah_kesehatan_bayi_baru_lahir.this.namaanak_adapter);
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
                        Tambah_kesehatan_bayi_baru_lahir.this.list_nikibu.add(jsonArray.getJSONObject(i).getString("nik"));
                        Tambah_kesehatan_bayi_baru_lahir tambah_kesehatan_bayi_baru_lahir = Tambah_kesehatan_bayi_baru_lahir.this;
                        Tambah_kesehatan_bayi_baru_lahir tambah_kesehatan_bayi_baru_lahir2 = Tambah_kesehatan_bayi_baru_lahir.this;
                        tambah_kesehatan_bayi_baru_lahir.nikibu_adapter = new ArrayAdapter<>(tambah_kesehatan_bayi_baru_lahir2, 17367048, tambah_kesehatan_bayi_baru_lahir2.list_nikibu);
                        Tambah_kesehatan_bayi_baru_lahir.this.nikibu_adapter.setDropDownViewResource(17367049);
                        Tambah_kesehatan_bayi_baru_lahir.this.spinnernik_ibu.setAdapter(Tambah_kesehatan_bayi_baru_lahir.this.nikibu_adapter);
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
