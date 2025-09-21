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

public class Tambah_Pemberian_Vitamin_Dan_Obat_Cacing extends AppCompatActivity {
    public static String item1;
    public static String item2;
    TextView anak_ke;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxkapsul_biru_1;
    EditText etxkapsul_biru_2;
    EditText etxkapsul_biru_3;
    EditText etxkapsul_merah_1;
    EditText etxkapsul_merah_2;
    EditText etxkapsul_merah_3;
    EditText etxkapsul_merah_4;
    EditText etxkapsul_merah_5;
    EditText etxkapsul_merah_6;
    EditText etxobat_cacing_1;
    EditText etxobat_cacing_2;
    EditText etxobat_cacing_3;
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
        setContentView((int) R.layout.activity_tambah_pemberian_vitamin_dan_obat_cacing);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.spinnernik_ibu = (Spinner) findViewById(R.id.spinnernik_ibu);
        this.spinnernama_anak = (Spinner) findViewById(R.id.spinnernama_anak);
        this.nama_ibu1 = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah = (TextView) findViewById(R.id.nama_ayah);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.etxkapsul_biru_1 = (EditText) findViewById(R.id.etxkapsul_biru_1);
        this.etxkapsul_biru_2 = (EditText) findViewById(R.id.etxkapsul_biru_2);
        this.etxkapsul_biru_3 = (EditText) findViewById(R.id.etxkapsul_biru_3);
        this.etxkapsul_merah_1 = (EditText) findViewById(R.id.etxkapsul_merah_1);
        this.etxkapsul_merah_2 = (EditText) findViewById(R.id.etxkapsul_merah_2);
        this.etxkapsul_merah_3 = (EditText) findViewById(R.id.etxkapsul_merah_3);
        this.etxkapsul_merah_4 = (EditText) findViewById(R.id.etxkapsul_merah_4);
        this.etxkapsul_merah_5 = (EditText) findViewById(R.id.etxkapsul_merah_5);
        this.etxkapsul_merah_6 = (EditText) findViewById(R.id.etxkapsul_merah_6);
        this.etxobat_cacing_1 = (EditText) findViewById(R.id.etxobat_cacing_1);
        this.etxobat_cacing_2 = (EditText) findViewById(R.id.etxobat_cacing_2);
        this.etxobat_cacing_3 = (EditText) findViewById(R.id.etxobat_cacing_3);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);


        etxkapsul_biru_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        etxkapsul_biru_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        etxkapsul_biru_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog3();
            }
        });
        etxkapsul_merah_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog4();
            }
        });
        etxkapsul_merah_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog5();
            }
        });
        etxkapsul_merah_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog6();
            }
        });
        etxkapsul_merah_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog7();
            }
        });
        etxkapsul_merah_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog8();
            }
        });
        etxkapsul_merah_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog9();
            }
        });
        etxobat_cacing_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog10();
            }
        });
        etxobat_cacing_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog11();
            }
        });
        etxobat_cacing_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog12();
            }
        });

        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.startActivity(intent);
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
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
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_1.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_2.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_3.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_1.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_2.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_3.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_4.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_5.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_6.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_1.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_2.setText("");
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_3.setText("");
            }
        });
        list_nik();
        this.spinnernik_ibu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.item1 = Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.spinnernik_ibu.getSelectedItem().toString();
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.list_namaanak.clear();
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.tampilkannama();
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.list_namaanakku();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnernama_anak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.item2 = Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.spinnernama_anak.getSelectedItem().toString();
                Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.tampilkananakke();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (etxkapsul_biru_1.getText().toString().length() == 0) {
                    etxkapsul_biru_1.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_biru_2.getText().toString().length() == 0) {
                    etxkapsul_biru_2.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_biru_3.getText().toString().length() == 0) {
                    etxkapsul_biru_3.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_merah_1.getText().toString().length() == 0) {
                    etxkapsul_merah_1.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_merah_2.getText().toString().length() == 0) {
                    etxkapsul_merah_2.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_merah_3.getText().toString().length() == 0) {
                    etxkapsul_merah_3.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_merah_4.getText().toString().length() == 0) {
                    etxkapsul_merah_4.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_merah_5.getText().toString().length() == 0) {
                    etxkapsul_merah_5.setError("Tidak Boleh Kosong");
                }
                if (etxkapsul_merah_6.getText().toString().length() == 0) {
                    etxkapsul_merah_6.setError("Tidak Boleh Kosong");
                }
                if (etxobat_cacing_1.getText().toString().length() == 0) {
                    etxobat_cacing_1.setError("Tidak Boleh Kosong");
                }
                if (etxobat_cacing_2.getText().toString().length() == 0) {
                    etxobat_cacing_2.setError("Tidak Boleh Kosong");
                }
                if (etxobat_cacing_3.getText().toString().length() == 0) {
                    etxobat_cacing_3.setError("Tidak Boleh Kosong");
                }
                Volley.newRequestQueue(Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/pemberianvitamindanobatcacing", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(),Pemberian_vitamin_dan_obat_cacing.class));
                                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
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
                        Toast.makeText(Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.spinnernik_ibu.getSelectedItem().toString());
                        myParams.put("nama_ibu", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.nama_ibu1.getText().toString());
                        myParams.put("nama_ayah", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.nama_ayah.getText().toString());
                        myParams.put("nama_anak", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.spinnernama_anak.getSelectedItem().toString());
                        myParams.put("anak_ke", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.anak_ke.getText().toString());
                        myParams.put("kapsul_biru_1", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_1.getText().toString());
                        myParams.put("kapsul_biru_2", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_2.getText().toString());
                        myParams.put("kapsul_biru_3", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_3.getText().toString());
                        myParams.put("kapsul_merah_1", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_1.getText().toString());
                        myParams.put("kapsul_merah_2", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_2.getText().toString());
                        myParams.put("kapsul_merah_3", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_3.getText().toString());
                        myParams.put("kapsul_merah_4", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_4.getText().toString());
                        myParams.put("kapsul_merah_5", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_5.getText().toString());
                        myParams.put("kapsul_merah_6", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_6.getText().toString());
                        myParams.put("obat_cacing_1", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_1.getText().toString());
                        myParams.put("obat_cacing_2", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_2.getText().toString());
                        myParams.put("obat_cacing_3", Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_3.getText().toString());
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
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.nama_ibu1.setText(jsonArray.getJSONObject(i).getString("nama_ibu"));
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.nama_ayah.setText(jsonArray.getJSONObject(i).getString("nama_ayah"));
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
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.anak_ke.setText(jsonArray.getJSONObject(i).getString("anak_ke"));
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
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.list_namaanak.add(jsonArray2.getJSONObject(j).getString("nama"));
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing tambah_Pemberian_Vitamin_Dan_Obat_Cacing = Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this;
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing tambah_Pemberian_Vitamin_Dan_Obat_Cacing2 = Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this;
                        tambah_Pemberian_Vitamin_Dan_Obat_Cacing.namaanak_adapter = new ArrayAdapter<>(tambah_Pemberian_Vitamin_Dan_Obat_Cacing2, 17367048, tambah_Pemberian_Vitamin_Dan_Obat_Cacing2.list_namaanak);
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.namaanak_adapter.setDropDownViewResource(17367049);
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.spinnernama_anak.setAdapter(Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.namaanak_adapter);
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
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.list_nikibu.add(jsonArray.getJSONObject(i).getString("nik"));
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing tambah_Pemberian_Vitamin_Dan_Obat_Cacing = Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this;
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing tambah_Pemberian_Vitamin_Dan_Obat_Cacing2 = Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this;
                        tambah_Pemberian_Vitamin_Dan_Obat_Cacing.nikibu_adapter = new ArrayAdapter<>(tambah_Pemberian_Vitamin_Dan_Obat_Cacing2, 17367048, tambah_Pemberian_Vitamin_Dan_Obat_Cacing2.list_nikibu);
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.nikibu_adapter.setDropDownViewResource(17367049);
                        Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.spinnernik_ibu.setAdapter(Tambah_Pemberian_Vitamin_Dan_Obat_Cacing.this.nikibu_adapter);
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

                etxkapsul_biru_1.setText(dateFormatter.format(newDate.getTime()));
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

                etxkapsul_biru_2.setText(dateFormatter.format(newDate.getTime()));
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

                etxkapsul_biru_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog4(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxkapsul_merah_1.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog5(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxkapsul_merah_2.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog6(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxkapsul_merah_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog7(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxkapsul_merah_4.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog8(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxkapsul_merah_5.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog9(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxkapsul_merah_6.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog10(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxobat_cacing_1.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog11(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxobat_cacing_2.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog12(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxobat_cacing_3.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

}
