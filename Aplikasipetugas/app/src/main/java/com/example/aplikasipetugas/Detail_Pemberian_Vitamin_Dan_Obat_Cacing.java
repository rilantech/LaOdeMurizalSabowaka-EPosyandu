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

public class Detail_Pemberian_Vitamin_Dan_Obat_Cacing extends AppCompatActivity {
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
        setContentView((int) R.layout.activity_detail_pemberian_vitamin_dan_obat_cacing);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah = (TextView) findViewById(R.id.nama_ayah);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.startActivity(intent);
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
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
                Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.startActivity(new Intent(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.getApplicationContext(), Pemberian_vitamin_dan_obat_cacing.class));
                Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
            }
        });
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nama_ayah.setText(getIntent().getStringExtra("nama_ayah"));
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.anak_ke.setText(getIntent().getStringExtra("anak_ke"));
        if (getIntent().hasExtra("detail_pemberian_vitamin_dan_obat_cacing")) {
            getData();
        }
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Volley.newRequestQueue(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatepemberianvitamindanobatcacing/" + Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.getIntent().getIntExtra("detail_pemberian_vitamin_dan_obat_cacing", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Terupdate");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.finish();
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
                        Toast.makeText(Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.nik_ibu.getText().toString());
                        myParams.put("nama_ibu", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.nama_ibu.getText().toString());
                        myParams.put("nama_anak", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.nama_anak.getText().toString());
                        myParams.put("anak_ke", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.anak_ke.getText().toString());
                        myParams.put("kapsul_biru_1", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_1.getText().toString());
                        myParams.put("kapsul_biru_2", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_2.getText().toString());
                        myParams.put("kapsul_biru_3", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_3.getText().toString());
                        myParams.put("kapsul_merah_1", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_1.getText().toString());
                        myParams.put("kapsul_merah_2", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_2.getText().toString());
                        myParams.put("kapsul_merah_3", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_3.getText().toString());
                        myParams.put("kapsul_merah_4", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_4.getText().toString());
                        myParams.put("kapsul_merah_5", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_5.getText().toString());
                        myParams.put("kapsul_merah_6", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_6.getText().toString());
                        myParams.put("obat_cacing_1", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_1.getText().toString());
                        myParams.put("obat_cacing_2", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_2.getText().toString());
                        myParams.put("obat_cacing_3", Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_3.getText().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/detailpemberianvitamindanobatcacing/" + getIntent().getIntExtra("detail_pemberian_vitamin_dan_obat_cacing", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("detailpemberianvitamindanobatcacing");
                    String gkapsul_biru_1 = jsonObject.getString("kapsul_biru_1");
                    String gkapsul_biru_2 = jsonObject.getString("kapsul_biru_2");
                    String gkapsul_biru_3 = jsonObject.getString("kapsul_biru_3");
                    String gkapsul_merah_1 = jsonObject.getString("kapsul_merah_1");
                    String gkapsul_merah_2 = jsonObject.getString("kapsul_merah_2");
                    String gkapsul_merah_3 = jsonObject.getString("kapsul_merah_3");
                    String gkapsul_merah_4 = jsonObject.getString("kapsul_merah_4");
                    String gkapsul_merah_5 = jsonObject.getString("kapsul_merah_5");
                    String gkapsul_merah_6 = jsonObject.getString("kapsul_merah_6");
                    String gobat_cacing_1 = jsonObject.getString("obat_cacing_1");
                    String gobat_cacing_2 = jsonObject.getString("obat_cacing_2");
                    String gobat_cacing_3 = jsonObject.getString("obat_cacing_3");
                    if(gkapsul_biru_1 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_1.setText("-");
                    }else if(gkapsul_biru_1.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_1.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_1.setText(gkapsul_biru_1);
                    }
                    if(gkapsul_biru_2 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_2.setText("-");
                    }else if(gkapsul_biru_2.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_2.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_2.setText(gkapsul_biru_2);
                    }
                    if(gkapsul_biru_3 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_3.setText("-");
                    }else if(gkapsul_biru_3.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_3.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_biru_3.setText(gkapsul_biru_3);
                    }

                    if(gkapsul_merah_1 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_1.setText("-");
                    }else if(gkapsul_merah_1.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_1.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_1.setText(gkapsul_merah_1);
                    }
                    if(gkapsul_merah_2 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_2.setText("-");
                    }else if(gkapsul_merah_2.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_2.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_2.setText(gkapsul_merah_2);
                    }
                    if(gkapsul_merah_3 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_3.setText("-");
                    }else if(gkapsul_merah_3.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_3.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_3.setText(gkapsul_merah_3);
                    }
                    if(gkapsul_merah_4 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_4.setText("-");
                    }else if(gkapsul_merah_4.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_4.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_4.setText(gkapsul_merah_4);
                    }

                    if(gkapsul_merah_5 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_5.setText("-");
                    }else if(gkapsul_merah_5.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_5.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_5.setText(gkapsul_merah_5);
                    }

                    if(gkapsul_merah_6 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_6.setText("-");
                    }else if(gkapsul_merah_6.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_6.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxkapsul_merah_6.setText(gkapsul_merah_6);
                    }

                    if(gobat_cacing_1 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_1.setText("-");
                    }else if(gobat_cacing_1.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_1.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_1.setText(gobat_cacing_1);
                    }
                    if(gobat_cacing_2 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_2.setText("-");
                    }else if(gobat_cacing_2.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_2.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_2.setText(gobat_cacing_2);
                    }
                    if(gobat_cacing_3 == "null"){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_3.setText("-");
                    }else if(gobat_cacing_3.equals("01-01-1970")){
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_3.setText("-");
                    } else{
                        Detail_Pemberian_Vitamin_Dan_Obat_Cacing.this.etxobat_cacing_3.setText(gobat_cacing_3);
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
