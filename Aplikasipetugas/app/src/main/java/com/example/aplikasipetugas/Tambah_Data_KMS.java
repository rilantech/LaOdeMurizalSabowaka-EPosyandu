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

public class Tambah_Data_KMS extends AppCompatActivity {
    public static String item1;
    public static String item2;
    TextView anak_ke;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxasi_eksklusif_0;
    EditText etxasi_eksklusif_1;
    EditText etxasi_eksklusif_2;
    EditText etxasi_eksklusif_3;
    EditText etxasi_eksklusif_4;
    EditText etxasi_eksklusif_5;
    EditText etxasi_eksklusif_6;
    EditText etxbb_0;
    EditText etxbb_1;
    EditText etxbb_10;
    EditText etxbb_11;
    EditText etxbb_12;
    EditText etxbb_13;
    EditText etxbb_14;
    EditText etxbb_15;
    EditText etxbb_16;
    EditText etxbb_17;
    EditText etxbb_18;
    EditText etxbb_19;
    EditText etxbb_2;
    EditText etxbb_20;
    EditText etxbb_21;
    EditText etxbb_22;
    EditText etxbb_23;
    EditText etxbb_24;
    EditText etxbb_25;
    EditText etxbb_26;
    EditText etxbb_27;
    EditText etxbb_28;
    EditText etxbb_29;
    EditText etxbb_3;
    EditText etxbb_30;
    EditText etxbb_31;
    EditText etxbb_32;
    EditText etxbb_33;
    EditText etxbb_34;
    EditText etxbb_35;
    EditText etxbb_36;
    EditText etxbb_37;
    EditText etxbb_38;
    EditText etxbb_39;
    EditText etxbb_4;
    EditText etxbb_40;
    EditText etxbb_41;
    EditText etxbb_42;
    EditText etxbb_43;
    EditText etxbb_44;
    EditText etxbb_45;
    EditText etxbb_46;
    EditText etxbb_47;
    EditText etxbb_48;
    EditText etxbb_49;
    EditText etxbb_5;
    EditText etxbb_50;
    EditText etxbb_51;
    EditText etxbb_52;
    EditText etxbb_53;
    EditText etxbb_54;
    EditText etxbb_55;
    EditText etxbb_56;
    EditText etxbb_57;
    EditText etxbb_58;
    EditText etxbb_59;
    EditText etxbb_6;
    EditText etxbb_60;
    EditText etxbb_7;
    EditText etxbb_8;
    EditText etxbb_9;
    EditText etxbulan_penimbangan_0;
    EditText etxbulan_penimbangan_1;
    EditText etxbulan_penimbangan_10;
    EditText etxbulan_penimbangan_11;
    EditText etxbulan_penimbangan_12;
    EditText etxbulan_penimbangan_13;
    EditText etxbulan_penimbangan_14;
    EditText etxbulan_penimbangan_15;
    EditText etxbulan_penimbangan_16;
    EditText etxbulan_penimbangan_17;
    EditText etxbulan_penimbangan_18;
    EditText etxbulan_penimbangan_19;
    EditText etxbulan_penimbangan_2;
    EditText etxbulan_penimbangan_20;
    EditText etxbulan_penimbangan_21;
    EditText etxbulan_penimbangan_22;
    EditText etxbulan_penimbangan_23;
    EditText etxbulan_penimbangan_24;
    EditText etxbulan_penimbangan_25;
    EditText etxbulan_penimbangan_26;
    EditText etxbulan_penimbangan_27;
    EditText etxbulan_penimbangan_28;
    EditText etxbulan_penimbangan_29;
    EditText etxbulan_penimbangan_3;
    EditText etxbulan_penimbangan_30;
    EditText etxbulan_penimbangan_31;
    EditText etxbulan_penimbangan_32;
    EditText etxbulan_penimbangan_33;
    EditText etxbulan_penimbangan_34;
    EditText etxbulan_penimbangan_35;
    EditText etxbulan_penimbangan_36;
    EditText etxbulan_penimbangan_37;
    EditText etxbulan_penimbangan_38;
    EditText etxbulan_penimbangan_39;
    EditText etxbulan_penimbangan_4;
    EditText etxbulan_penimbangan_40;
    EditText etxbulan_penimbangan_41;
    EditText etxbulan_penimbangan_42;
    EditText etxbulan_penimbangan_43;
    EditText etxbulan_penimbangan_44;
    EditText etxbulan_penimbangan_45;
    EditText etxbulan_penimbangan_46;
    EditText etxbulan_penimbangan_47;
    EditText etxbulan_penimbangan_48;
    EditText etxbulan_penimbangan_49;
    EditText etxbulan_penimbangan_5;
    EditText etxbulan_penimbangan_50;
    EditText etxbulan_penimbangan_51;
    EditText etxbulan_penimbangan_52;
    EditText etxbulan_penimbangan_53;
    EditText etxbulan_penimbangan_54;
    EditText etxbulan_penimbangan_55;
    EditText etxbulan_penimbangan_56;
    EditText etxbulan_penimbangan_57;
    EditText etxbulan_penimbangan_58;
    EditText etxbulan_penimbangan_59;
    EditText etxbulan_penimbangan_6;
    EditText etxbulan_penimbangan_60;
    EditText etxbulan_penimbangan_7;
    EditText etxbulan_penimbangan_8;
    EditText etxbulan_penimbangan_9;
    EditText etxnt_0;
    EditText etxnt_1;
    EditText etxnt_10;
    EditText etxnt_11;
    EditText etxnt_12;
    EditText etxnt_13;
    EditText etxnt_14;
    EditText etxnt_15;
    EditText etxnt_16;
    EditText etxnt_17;
    EditText etxnt_18;
    EditText etxnt_19;
    EditText etxnt_2;
    EditText etxnt_20;
    EditText etxnt_21;
    EditText etxnt_22;
    EditText etxnt_23;
    EditText etxnt_24;
    EditText etxnt_25;
    EditText etxnt_26;
    EditText etxnt_27;
    EditText etxnt_28;
    EditText etxnt_29;
    EditText etxnt_3;
    EditText etxnt_30;
    EditText etxnt_31;
    EditText etxnt_32;
    EditText etxnt_33;
    EditText etxnt_34;
    EditText etxnt_35;
    EditText etxnt_36;
    EditText etxnt_37;
    EditText etxnt_38;
    EditText etxnt_39;
    EditText etxnt_4;
    EditText etxnt_40;
    EditText etxnt_41;
    EditText etxnt_42;
    EditText etxnt_43;
    EditText etxnt_44;
    EditText etxnt_45;
    EditText etxnt_46;
    EditText etxnt_47;
    EditText etxnt_48;
    EditText etxnt_49;
    EditText etxnt_5;
    EditText etxnt_50;
    EditText etxnt_51;
    EditText etxnt_52;
    EditText etxnt_53;
    EditText etxnt_54;
    EditText etxnt_55;
    EditText etxnt_56;
    EditText etxnt_57;
    EditText etxnt_58;
    EditText etxnt_59;
    EditText etxnt_6;
    EditText etxnt_60;
    EditText etxnt_7;
    EditText etxnt_8;
    EditText etxnt_9;
    TextView jenis_kelamin;
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
        setContentView((int) R.layout.activity_tambah_data_kms);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.spinnernik_ibu = (Spinner) findViewById(R.id.spinnernik_ibu);
        this.spinnernama_anak = (Spinner) findViewById(R.id.spinnernama_anak);
        this.nama_ibu1 = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah = (TextView) findViewById(R.id.nama_ayah);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.jenis_kelamin = (TextView) findViewById(R.id.jenis_kelamin);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.etxbulan_penimbangan_0 = (EditText) findViewById(R.id.etxbulan_penimbangan_0);
        this.etxbulan_penimbangan_1 = (EditText) findViewById(R.id.etxbulan_penimbangan_1);
        this.etxbulan_penimbangan_2 = (EditText) findViewById(R.id.etxbulan_penimbangan_2);
        this.etxbulan_penimbangan_3 = (EditText) findViewById(R.id.etxbulan_penimbangan_3);
        this.etxbulan_penimbangan_4 = (EditText) findViewById(R.id.etxbulan_penimbangan_4);
        this.etxbulan_penimbangan_5 = (EditText) findViewById(R.id.etxbulan_penimbangan_5);
        this.etxbulan_penimbangan_6 = (EditText) findViewById(R.id.etxbulan_penimbangan_6);
        this.etxbulan_penimbangan_7 = (EditText) findViewById(R.id.etxbulan_penimbangan_7);
        this.etxbulan_penimbangan_8 = (EditText) findViewById(R.id.etxbulan_penimbangan_8);
        this.etxbulan_penimbangan_9 = (EditText) findViewById(R.id.etxbulan_penimbangan_9);
        this.etxbulan_penimbangan_10 = (EditText) findViewById(R.id.etxbulan_penimbangan_10);
        this.etxbulan_penimbangan_11 = (EditText) findViewById(R.id.etxbulan_penimbangan_11);
        this.etxbulan_penimbangan_12 = (EditText) findViewById(R.id.etxbulan_penimbangan_12);
        this.etxbulan_penimbangan_13 = (EditText) findViewById(R.id.etxbulan_penimbangan_13);
        this.etxbulan_penimbangan_14 = (EditText) findViewById(R.id.etxbulan_penimbangan_14);
        this.etxbulan_penimbangan_15 = (EditText) findViewById(R.id.etxbulan_penimbangan_15);
        this.etxbulan_penimbangan_16 = (EditText) findViewById(R.id.etxbulan_penimbangan_16);
        this.etxbulan_penimbangan_17 = (EditText) findViewById(R.id.etxbulan_penimbangan_17);
        this.etxbulan_penimbangan_18 = (EditText) findViewById(R.id.etxbulan_penimbangan_18);
        this.etxbulan_penimbangan_19 = (EditText) findViewById(R.id.etxbulan_penimbangan_19);
        this.etxbulan_penimbangan_20 = (EditText) findViewById(R.id.etxbulan_penimbangan_20);
        this.etxbulan_penimbangan_21 = (EditText) findViewById(R.id.etxbulan_penimbangan_21);
        this.etxbulan_penimbangan_22 = (EditText) findViewById(R.id.etxbulan_penimbangan_22);
        this.etxbulan_penimbangan_23 = (EditText) findViewById(R.id.etxbulan_penimbangan_23);
        this.etxbulan_penimbangan_24 = (EditText) findViewById(R.id.etxbulan_penimbangan_24);
        this.etxbulan_penimbangan_25 = (EditText) findViewById(R.id.etxbulan_penimbangan_25);
        this.etxbulan_penimbangan_26 = (EditText) findViewById(R.id.etxbulan_penimbangan_26);
        this.etxbulan_penimbangan_27 = (EditText) findViewById(R.id.etxbulan_penimbangan_27);
        this.etxbulan_penimbangan_28 = (EditText) findViewById(R.id.etxbulan_penimbangan_28);
        this.etxbulan_penimbangan_29 = (EditText) findViewById(R.id.etxbulan_penimbangan_29);
        this.etxbulan_penimbangan_30 = (EditText) findViewById(R.id.etxbulan_penimbangan_30);
        this.etxbulan_penimbangan_31 = (EditText) findViewById(R.id.etxbulan_penimbangan_31);
        this.etxbulan_penimbangan_32 = (EditText) findViewById(R.id.etxbulan_penimbangan_32);
        this.etxbulan_penimbangan_33 = (EditText) findViewById(R.id.etxbulan_penimbangan_33);
        this.etxbulan_penimbangan_34 = (EditText) findViewById(R.id.etxbulan_penimbangan_34);
        this.etxbulan_penimbangan_35 = (EditText) findViewById(R.id.etxbulan_penimbangan_35);
        this.etxbulan_penimbangan_36 = (EditText) findViewById(R.id.etxbulan_penimbangan_36);
        this.etxbulan_penimbangan_37 = (EditText) findViewById(R.id.etxbulan_penimbangan_37);
        this.etxbulan_penimbangan_38 = (EditText) findViewById(R.id.etxbulan_penimbangan_38);
        this.etxbulan_penimbangan_39 = (EditText) findViewById(R.id.etxbulan_penimbangan_39);
        this.etxbulan_penimbangan_40 = (EditText) findViewById(R.id.etxbulan_penimbangan_40);
        this.etxbulan_penimbangan_41 = (EditText) findViewById(R.id.etxbulan_penimbangan_41);
        this.etxbulan_penimbangan_42 = (EditText) findViewById(R.id.etxbulan_penimbangan_42);
        this.etxbulan_penimbangan_43 = (EditText) findViewById(R.id.etxbulan_penimbangan_43);
        this.etxbulan_penimbangan_44 = (EditText) findViewById(R.id.etxbulan_penimbangan_44);
        this.etxbulan_penimbangan_45 = (EditText) findViewById(R.id.etxbulan_penimbangan_45);
        this.etxbulan_penimbangan_46 = (EditText) findViewById(R.id.etxbulan_penimbangan_46);
        this.etxbulan_penimbangan_47 = (EditText) findViewById(R.id.etxbulan_penimbangan_47);
        this.etxbulan_penimbangan_48 = (EditText) findViewById(R.id.etxbulan_penimbangan_48);
        this.etxbulan_penimbangan_49 = (EditText) findViewById(R.id.etxbulan_penimbangan_49);
        this.etxbulan_penimbangan_50 = (EditText) findViewById(R.id.etxbulan_penimbangan_50);
        this.etxbulan_penimbangan_51 = (EditText) findViewById(R.id.etxbulan_penimbangan_51);
        this.etxbulan_penimbangan_52 = (EditText) findViewById(R.id.etxbulan_penimbangan_52);
        this.etxbulan_penimbangan_53 = (EditText) findViewById(R.id.etxbulan_penimbangan_53);
        this.etxbulan_penimbangan_54 = (EditText) findViewById(R.id.etxbulan_penimbangan_54);
        this.etxbulan_penimbangan_55 = (EditText) findViewById(R.id.etxbulan_penimbangan_55);
        this.etxbulan_penimbangan_56 = (EditText) findViewById(R.id.etxbulan_penimbangan_56);
        this.etxbulan_penimbangan_57 = (EditText) findViewById(R.id.etxbulan_penimbangan_57);
        this.etxbulan_penimbangan_58 = (EditText) findViewById(R.id.etxbulan_penimbangan_58);
        this.etxbulan_penimbangan_59 = (EditText) findViewById(R.id.etxbulan_penimbangan_59);
        this.etxbulan_penimbangan_60 = (EditText) findViewById(R.id.etxbulan_penimbangan_60);
        this.etxbb_0 = (EditText) findViewById(R.id.etxbb_0);
        this.etxbb_1 = (EditText) findViewById(R.id.etxbb_1);
        this.etxbb_2 = (EditText) findViewById(R.id.etxbb_2);
        this.etxbb_3 = (EditText) findViewById(R.id.etxbb_3);
        this.etxbb_4 = (EditText) findViewById(R.id.etxbb_4);
        this.etxbb_5 = (EditText) findViewById(R.id.etxbb_5);
        this.etxbb_6 = (EditText) findViewById(R.id.etxbb_6);
        this.etxbb_7 = (EditText) findViewById(R.id.etxbb_7);
        this.etxbb_8 = (EditText) findViewById(R.id.etxbb_8);
        this.etxbb_9 = (EditText) findViewById(R.id.etxbb_9);
        this.etxbb_10 = (EditText) findViewById(R.id.etxbb_10);
        this.etxbb_11 = (EditText) findViewById(R.id.etxbb_11);
        this.etxbb_12 = (EditText) findViewById(R.id.etxbb_12);
        this.etxbb_13 = (EditText) findViewById(R.id.etxbb_13);
        this.etxbb_14 = (EditText) findViewById(R.id.etxbb_14);
        this.etxbb_15 = (EditText) findViewById(R.id.etxbb_15);
        this.etxbb_16 = (EditText) findViewById(R.id.etxbb_16);
        this.etxbb_17 = (EditText) findViewById(R.id.etxbb_17);
        this.etxbb_18 = (EditText) findViewById(R.id.etxbb_18);
        this.etxbb_19 = (EditText) findViewById(R.id.etxbb_19);
        this.etxbb_20 = (EditText) findViewById(R.id.etxbb_20);
        this.etxbb_21 = (EditText) findViewById(R.id.etxbb_21);
        this.etxbb_22 = (EditText) findViewById(R.id.etxbb_22);
        this.etxbb_23 = (EditText) findViewById(R.id.etxbb_23);
        this.etxbb_24 = (EditText) findViewById(R.id.etxbb_24);
        this.etxbb_25 = (EditText) findViewById(R.id.etxbb_25);
        this.etxbb_26 = (EditText) findViewById(R.id.etxbb_26);
        this.etxbb_27 = (EditText) findViewById(R.id.etxbb_27);
        this.etxbb_28 = (EditText) findViewById(R.id.etxbb_28);
        this.etxbb_29 = (EditText) findViewById(R.id.etxbb_29);
        this.etxbb_30 = (EditText) findViewById(R.id.etxbb_30);
        this.etxbb_31 = (EditText) findViewById(R.id.etxbb_31);
        this.etxbb_32 = (EditText) findViewById(R.id.etxbb_32);
        this.etxbb_33 = (EditText) findViewById(R.id.etxbb_33);
        this.etxbb_34 = (EditText) findViewById(R.id.etxbb_34);
        this.etxbb_35 = (EditText) findViewById(R.id.etxbb_35);
        this.etxbb_36 = (EditText) findViewById(R.id.etxbb_36);
        this.etxbb_37 = (EditText) findViewById(R.id.etxbb_37);
        this.etxbb_38 = (EditText) findViewById(R.id.etxbb_38);
        this.etxbb_39 = (EditText) findViewById(R.id.etxbb_39);
        this.etxbb_40 = (EditText) findViewById(R.id.etxbb_40);
        this.etxbb_41 = (EditText) findViewById(R.id.etxbb_41);
        this.etxbb_42 = (EditText) findViewById(R.id.etxbb_42);
        this.etxbb_43 = (EditText) findViewById(R.id.etxbb_43);
        this.etxbb_44 = (EditText) findViewById(R.id.etxbb_44);
        this.etxbb_45 = (EditText) findViewById(R.id.etxbb_45);
        this.etxbb_46 = (EditText) findViewById(R.id.etxbb_46);
        this.etxbb_47 = (EditText) findViewById(R.id.etxbb_47);
        this.etxbb_48 = (EditText) findViewById(R.id.etxbb_48);
        this.etxbb_49 = (EditText) findViewById(R.id.etxbb_49);
        this.etxbb_50 = (EditText) findViewById(R.id.etxbb_50);
        this.etxbb_51 = (EditText) findViewById(R.id.etxbb_51);
        this.etxbb_52 = (EditText) findViewById(R.id.etxbb_52);
        this.etxbb_53 = (EditText) findViewById(R.id.etxbb_53);
        this.etxbb_54 = (EditText) findViewById(R.id.etxbb_54);
        this.etxbb_55 = (EditText) findViewById(R.id.etxbb_55);
        this.etxbb_56 = (EditText) findViewById(R.id.etxbb_56);
        this.etxbb_57 = (EditText) findViewById(R.id.etxbb_57);
        this.etxbb_58 = (EditText) findViewById(R.id.etxbb_58);
        this.etxbb_59 = (EditText) findViewById(R.id.etxbb_59);
        this.etxbb_60 = (EditText) findViewById(R.id.etxbb_60);
        this.etxnt_0 = (EditText) findViewById(R.id.etxnt_0);
        this.etxnt_1 = (EditText) findViewById(R.id.etxnt_1);
        this.etxnt_2 = (EditText) findViewById(R.id.etxnt_2);
        this.etxnt_3 = (EditText) findViewById(R.id.etxnt_3);
        this.etxnt_4 = (EditText) findViewById(R.id.etxnt_4);
        this.etxnt_5 = (EditText) findViewById(R.id.etxnt_5);
        this.etxnt_6 = (EditText) findViewById(R.id.etxnt_6);
        this.etxnt_7 = (EditText) findViewById(R.id.etxnt_7);
        this.etxnt_8 = (EditText) findViewById(R.id.etxnt_8);
        this.etxnt_9 = (EditText) findViewById(R.id.etxnt_9);
        this.etxnt_10 = (EditText) findViewById(R.id.etxnt_10);
        this.etxnt_11 = (EditText) findViewById(R.id.etxnt_11);
        this.etxnt_12 = (EditText) findViewById(R.id.etxnt_12);
        this.etxnt_13 = (EditText) findViewById(R.id.etxnt_13);
        this.etxnt_14 = (EditText) findViewById(R.id.etxnt_14);
        this.etxnt_15 = (EditText) findViewById(R.id.etxnt_15);
        this.etxnt_16 = (EditText) findViewById(R.id.etxnt_16);
        this.etxnt_17 = (EditText) findViewById(R.id.etxnt_17);
        this.etxnt_18 = (EditText) findViewById(R.id.etxnt_18);
        this.etxnt_19 = (EditText) findViewById(R.id.etxnt_19);
        this.etxnt_20 = (EditText) findViewById(R.id.etxnt_20);
        this.etxnt_21 = (EditText) findViewById(R.id.etxnt_21);
        this.etxnt_22 = (EditText) findViewById(R.id.etxnt_22);
        this.etxnt_23 = (EditText) findViewById(R.id.etxnt_23);
        this.etxnt_24 = (EditText) findViewById(R.id.etxnt_24);
        this.etxnt_25 = (EditText) findViewById(R.id.etxnt_25);
        this.etxnt_26 = (EditText) findViewById(R.id.etxnt_26);
        this.etxnt_27 = (EditText) findViewById(R.id.etxnt_27);
        this.etxnt_28 = (EditText) findViewById(R.id.etxnt_28);
        this.etxnt_29 = (EditText) findViewById(R.id.etxnt_29);
        this.etxnt_30 = (EditText) findViewById(R.id.etxnt_30);
        this.etxnt_31 = (EditText) findViewById(R.id.etxnt_31);
        this.etxnt_32 = (EditText) findViewById(R.id.etxnt_32);
        this.etxnt_33 = (EditText) findViewById(R.id.etxnt_33);
        this.etxnt_34 = (EditText) findViewById(R.id.etxnt_34);
        this.etxnt_35 = (EditText) findViewById(R.id.etxnt_35);
        this.etxnt_36 = (EditText) findViewById(R.id.etxnt_36);
        this.etxnt_37 = (EditText) findViewById(R.id.etxnt_37);
        this.etxnt_38 = (EditText) findViewById(R.id.etxnt_38);
        this.etxnt_39 = (EditText) findViewById(R.id.etxnt_39);
        this.etxnt_40 = (EditText) findViewById(R.id.etxnt_40);
        this.etxnt_41 = (EditText) findViewById(R.id.etxnt_41);
        this.etxnt_42 = (EditText) findViewById(R.id.etxnt_42);
        this.etxnt_43 = (EditText) findViewById(R.id.etxnt_43);
        this.etxnt_44 = (EditText) findViewById(R.id.etxnt_44);
        this.etxnt_45 = (EditText) findViewById(R.id.etxnt_45);
        this.etxnt_46 = (EditText) findViewById(R.id.etxnt_46);
        this.etxnt_47 = (EditText) findViewById(R.id.etxnt_47);
        this.etxnt_48 = (EditText) findViewById(R.id.etxnt_48);
        this.etxnt_49 = (EditText) findViewById(R.id.etxnt_49);
        this.etxnt_50 = (EditText) findViewById(R.id.etxnt_50);
        this.etxnt_51 = (EditText) findViewById(R.id.etxnt_51);
        this.etxnt_52 = (EditText) findViewById(R.id.etxnt_52);
        this.etxnt_53 = (EditText) findViewById(R.id.etxnt_53);
        this.etxnt_54 = (EditText) findViewById(R.id.etxnt_54);
        this.etxnt_55 = (EditText) findViewById(R.id.etxnt_55);
        this.etxnt_56 = (EditText) findViewById(R.id.etxnt_56);
        this.etxnt_57 = (EditText) findViewById(R.id.etxnt_57);
        this.etxnt_58 = (EditText) findViewById(R.id.etxnt_58);
        this.etxnt_59 = (EditText) findViewById(R.id.etxnt_59);
        this.etxnt_60 = (EditText) findViewById(R.id.etxnt_60);
        this.etxasi_eksklusif_0 = (EditText) findViewById(R.id.etxasi_eksklusif_0);
        this.etxasi_eksklusif_1 = (EditText) findViewById(R.id.etxasi_eksklusif_1);
        this.etxasi_eksklusif_2 = (EditText) findViewById(R.id.etxasi_eksklusif_2);
        this.etxasi_eksklusif_3 = (EditText) findViewById(R.id.etxasi_eksklusif_3);
        this.etxasi_eksklusif_4 = (EditText) findViewById(R.id.etxasi_eksklusif_4);
        this.etxasi_eksklusif_5 = (EditText) findViewById(R.id.etxasi_eksklusif_5);
        this.etxasi_eksklusif_6 = (EditText) findViewById(R.id.etxasi_eksklusif_6);
        this.tvNamapetugas.setText(Halaman_Login.namapetugas);

        etxbulan_penimbangan_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog0();
            }
        });
        etxbulan_penimbangan_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        etxbulan_penimbangan_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        etxbulan_penimbangan_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog3();
            }
        });
        etxbulan_penimbangan_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog4();
            }
        });
        etxbulan_penimbangan_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog5();
            }
        });
        etxbulan_penimbangan_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog6();
            }
        });
        etxbulan_penimbangan_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog7();
            }
        });
        etxbulan_penimbangan_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog8();
            }
        });
        etxbulan_penimbangan_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog9();
            }
        });
        etxbulan_penimbangan_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog10();
            }
        });
        etxbulan_penimbangan_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog11();
            }
        });
        etxbulan_penimbangan_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog12();
            }
        });
        etxbulan_penimbangan_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog13();
            }
        });
        etxbulan_penimbangan_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog14();
            }
        });
        etxbulan_penimbangan_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog15();
            }
        });
        etxbulan_penimbangan_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog16();
            }
        });
        etxbulan_penimbangan_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog17();
            }
        });
        etxbulan_penimbangan_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog18();
            }
        });
        etxbulan_penimbangan_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog19();
            }
        });
        etxbulan_penimbangan_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog20();
            }
        });
        etxbulan_penimbangan_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog21();
            }
        });
        etxbulan_penimbangan_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog22();
            }
        });
        etxbulan_penimbangan_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog23();
            }
        });
        etxbulan_penimbangan_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog24();
            }
        });
        etxbulan_penimbangan_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog25();
            }
        });

        etxbulan_penimbangan_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog26();
            }
        });
        etxbulan_penimbangan_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog27();
            }
        });
        etxbulan_penimbangan_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog28();
            }
        });
        etxbulan_penimbangan_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog29();
            }
        });
        etxbulan_penimbangan_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog30();
            }
        });
        etxbulan_penimbangan_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog31();
            }
        });
        etxbulan_penimbangan_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog32();
            }
        });
        etxbulan_penimbangan_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog33();
            }
        });

        etxbulan_penimbangan_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog34();
            }
        });
        etxbulan_penimbangan_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog35();
            }
        });
        etxbulan_penimbangan_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog36();
            }
        });
        etxbulan_penimbangan_37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog37();
            }
        });
        etxbulan_penimbangan_38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog38();
            }
        });

        etxbulan_penimbangan_39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog39();
            }
        });
        etxbulan_penimbangan_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog40();
            }
        });
        etxbulan_penimbangan_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog41();
            }
        });
        etxbulan_penimbangan_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog42();
            }
        });
        etxbulan_penimbangan_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog43();
            }
        });
        etxbulan_penimbangan_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog44();
            }
        });
        etxbulan_penimbangan_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog45();
            }
        });
        etxbulan_penimbangan_46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog46();
            }
        });
        etxbulan_penimbangan_47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog47();
            }
        });
        etxbulan_penimbangan_48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog48();
            }
        });
        etxbulan_penimbangan_49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog49();
            }
        });
        etxbulan_penimbangan_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog50();
            }
        });
        etxbulan_penimbangan_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog51();
            }
        });
        etxbulan_penimbangan_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog52();
            }
        });
        etxbulan_penimbangan_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog53();
            }
        });
        etxbulan_penimbangan_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog54();
            }
        });
        etxbulan_penimbangan_55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog55();
            }
        });
        etxbulan_penimbangan_56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog56();
            }
        });
        etxbulan_penimbangan_57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog57();
            }
        });
        etxbulan_penimbangan_58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog58();
            }
        });
        etxbulan_penimbangan_59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog59();
            }
        });
        etxbulan_penimbangan_60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog60();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_Data_KMS.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_Data_KMS.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_Data_KMS.this.startActivity(intent);
                        Tambah_Data_KMS.this.finish();
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
                Tambah_Data_KMS.this.finish();
            }
        });
        list_nik();
        this.spinnernik_ibu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_Data_KMS.item1 = Tambah_Data_KMS.this.spinnernik_ibu.getSelectedItem().toString();
                Tambah_Data_KMS.this.list_namaanak.clear();
                Tambah_Data_KMS.this.tampilkannama();
                Tambah_Data_KMS.this.list_namaanakku();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnernama_anak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_Data_KMS.item2 = Tambah_Data_KMS.this.spinnernama_anak.getSelectedItem().toString();
                Tambah_Data_KMS.this.tampilkananakke();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (etxasi_eksklusif_0.getText().toString().length() == 0) {
                    etxasi_eksklusif_0.setError("Tidak Boleh Kosong");
                }
                if (etxasi_eksklusif_1.getText().toString().length() == 0) {
                    etxasi_eksklusif_1.setError("Tidak Boleh Kosong");
                }
                if (etxasi_eksklusif_2.getText().toString().length() == 0) {
                    etxasi_eksklusif_2.setError("Tidak Boleh Kosong");
                }
                if (etxasi_eksklusif_3.getText().toString().length() == 0) {
                    etxasi_eksklusif_3.setError("Tidak Boleh Kosong");
                }
                if (etxasi_eksklusif_4.getText().toString().length() == 0) {
                    etxasi_eksklusif_4.setError("Tidak Boleh Kosong");
                }
                if (etxasi_eksklusif_5.getText().toString().length() == 0) {
                    etxasi_eksklusif_5.setError("Tidak Boleh Kosong");
                }
                if (etxasi_eksklusif_6.getText().toString().length() == 0) {
                    etxasi_eksklusif_6.setError("Tidak Boleh Kosong");
                }
                if (etxbb_0.getText().toString().length() == 0) {
                    etxbb_0.setError("Tidak Boleh Kosong");
                }
                if (etxbb_1.getText().toString().length() == 0) {
                    etxbb_1.setError("Tidak Boleh Kosong");
                }
                if (etxbb_2.getText().toString().length() == 0) {
                    etxbb_2.setError("Tidak Boleh Kosong");
                }
                if (etxbb_3.getText().toString().length() == 0) {
                    etxbb_3.setError("Tidak Boleh Kosong");
                }
                if (etxbb_4.getText().toString().length() == 0) {
                    etxbb_4.setError("Tidak Boleh Kosong");
                }
                if (etxbb_5.getText().toString().length() == 0) {
                    etxbb_5.setError("Tidak Boleh Kosong");
                }
                if (etxbb_6.getText().toString().length() == 0) {
                    etxbb_6.setError("Tidak Boleh Kosong");
                }
                if (etxnt_0.getText().toString().length() == 0) {
                    etxnt_0.setError("Tidak Boleh Kosong");
                }
                if (etxnt_1.getText().toString().length() == 0) {
                    etxnt_1.setError("Tidak Boleh Kosong");
                }
                if (etxnt_2.getText().toString().length() == 0) {
                    etxnt_2.setError("Tidak Boleh Kosong");
                }
                if (etxnt_3.getText().toString().length() == 0) {
                    etxnt_3.setError("Tidak Boleh Kosong");
                }
                if (etxnt_4.getText().toString().length() == 0) {
                    etxnt_4.setError("Tidak Boleh Kosong");
                }
                if (etxnt_5.getText().toString().length() == 0) {
                    etxnt_5.setError("Tidak Boleh Kosong");
                }
                if (etxnt_6.getText().toString().length() == 0) {
                    etxnt_6.setError("Tidak Boleh Kosong");
                }

                Volley.newRequestQueue(Tambah_Data_KMS.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/datakms", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_Data_KMS.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(), Data_KMS.class));
                                        Tambah_Data_KMS.this.finish();
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
                        Toast.makeText(Tambah_Data_KMS.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_Data_KMS.this.spinnernik_ibu.getSelectedItem().toString());
                        myParams.put("nama_ibu", Tambah_Data_KMS.this.nama_ibu1.getText().toString());
                        myParams.put("nama_ayah", Tambah_Data_KMS.this.nama_ayah.getText().toString());
                        myParams.put("nama_anak", Tambah_Data_KMS.this.spinnernama_anak.getSelectedItem().toString());
                        myParams.put("anak_ke", Tambah_Data_KMS.this.anak_ke.getText().toString());
                        myParams.put("jenis_kelamin", Tambah_Data_KMS.this.jenis_kelamin.getText().toString());
                        myParams.put("bulan_penimbangan_0", Tambah_Data_KMS.this.etxbulan_penimbangan_0.getText().toString());
                        myParams.put("bulan_penimbangan_1", Tambah_Data_KMS.this.etxbulan_penimbangan_1.getText().toString());
                        myParams.put("bulan_penimbangan_2", Tambah_Data_KMS.this.etxbulan_penimbangan_2.getText().toString());
                        myParams.put("bulan_penimbangan_3", Tambah_Data_KMS.this.etxbulan_penimbangan_3.getText().toString());
                        myParams.put("bulan_penimbangan_4", Tambah_Data_KMS.this.etxbulan_penimbangan_4.getText().toString());
                        myParams.put("bulan_penimbangan_5", Tambah_Data_KMS.this.etxbulan_penimbangan_5.getText().toString());
                        myParams.put("bulan_penimbangan_6", Tambah_Data_KMS.this.etxbulan_penimbangan_6.getText().toString());
                        myParams.put("bulan_penimbangan_7", Tambah_Data_KMS.this.etxbulan_penimbangan_7.getText().toString());
                        myParams.put("bulan_penimbangan_8", Tambah_Data_KMS.this.etxbulan_penimbangan_8.getText().toString());
                        myParams.put("bulan_penimbangan_9", Tambah_Data_KMS.this.etxbulan_penimbangan_9.getText().toString());
                        myParams.put("bulan_penimbangan_10", Tambah_Data_KMS.this.etxbulan_penimbangan_10.getText().toString());
                        myParams.put("bulan_penimbangan_11", Tambah_Data_KMS.this.etxbulan_penimbangan_11.getText().toString());
                        myParams.put("bulan_penimbangan_12", Tambah_Data_KMS.this.etxbulan_penimbangan_12.getText().toString());
                        myParams.put("bulan_penimbangan_13", Tambah_Data_KMS.this.etxbulan_penimbangan_13.getText().toString());
                        myParams.put("bulan_penimbangan_14", Tambah_Data_KMS.this.etxbulan_penimbangan_14.getText().toString());
                        myParams.put("bulan_penimbangan_15", Tambah_Data_KMS.this.etxbulan_penimbangan_15.getText().toString());
                        myParams.put("bulan_penimbangan_16", Tambah_Data_KMS.this.etxbulan_penimbangan_16.getText().toString());
                        myParams.put("bulan_penimbangan_17", Tambah_Data_KMS.this.etxbulan_penimbangan_17.getText().toString());
                        myParams.put("bulan_penimbangan_18", Tambah_Data_KMS.this.etxbulan_penimbangan_18.getText().toString());
                        myParams.put("bulan_penimbangan_19", Tambah_Data_KMS.this.etxbulan_penimbangan_19.getText().toString());
                        myParams.put("bulan_penimbangan_20", Tambah_Data_KMS.this.etxbulan_penimbangan_20.getText().toString());
                        myParams.put("bulan_penimbangan_21", Tambah_Data_KMS.this.etxbulan_penimbangan_21.getText().toString());
                        myParams.put("bulan_penimbangan_22", Tambah_Data_KMS.this.etxbulan_penimbangan_22.getText().toString());
                        myParams.put("bulan_penimbangan_23", Tambah_Data_KMS.this.etxbulan_penimbangan_23.getText().toString());
                        myParams.put("bulan_penimbangan_24", Tambah_Data_KMS.this.etxbulan_penimbangan_24.getText().toString());
                        myParams.put("bulan_penimbangan_25", Tambah_Data_KMS.this.etxbulan_penimbangan_25.getText().toString());
                        myParams.put("bulan_penimbangan_26", Tambah_Data_KMS.this.etxbulan_penimbangan_26.getText().toString());
                        myParams.put("bulan_penimbangan_27", Tambah_Data_KMS.this.etxbulan_penimbangan_27.getText().toString());
                        myParams.put("bulan_penimbangan_28", Tambah_Data_KMS.this.etxbulan_penimbangan_28.getText().toString());
                        myParams.put("bulan_penimbangan_29", Tambah_Data_KMS.this.etxbulan_penimbangan_29.getText().toString());
                        myParams.put("bulan_penimbangan_30", Tambah_Data_KMS.this.etxbulan_penimbangan_30.getText().toString());
                        myParams.put("bulan_penimbangan_31", Tambah_Data_KMS.this.etxbulan_penimbangan_31.getText().toString());
                        myParams.put("bulan_penimbangan_33", Tambah_Data_KMS.this.etxbulan_penimbangan_33.getText().toString());
                        myParams.put("bulan_penimbangan_33", Tambah_Data_KMS.this.etxbulan_penimbangan_33.getText().toString());
                        myParams.put("bulan_penimbangan_34", Tambah_Data_KMS.this.etxbulan_penimbangan_34.getText().toString());
                        myParams.put("bulan_penimbangan_35", Tambah_Data_KMS.this.etxbulan_penimbangan_35.getText().toString());
                        myParams.put("bulan_penimbangan_36", Tambah_Data_KMS.this.etxbulan_penimbangan_36.getText().toString());
                        myParams.put("bulan_penimbangan_37", Tambah_Data_KMS.this.etxbulan_penimbangan_37.getText().toString());
                        myParams.put("bulan_penimbangan_38", Tambah_Data_KMS.this.etxbulan_penimbangan_38.getText().toString());
                        myParams.put("bulan_penimbangan_39", Tambah_Data_KMS.this.etxbulan_penimbangan_39.getText().toString());
                        myParams.put("bulan_penimbangan_40", Tambah_Data_KMS.this.etxbulan_penimbangan_40.getText().toString());
                        myParams.put("bulan_penimbangan_41", Tambah_Data_KMS.this.etxbulan_penimbangan_41.getText().toString());
                        myParams.put("bulan_penimbangan_44", Tambah_Data_KMS.this.etxbulan_penimbangan_44.getText().toString());
                        myParams.put("bulan_penimbangan_44", Tambah_Data_KMS.this.etxbulan_penimbangan_44.getText().toString());
                        myParams.put("bulan_penimbangan_44", Tambah_Data_KMS.this.etxbulan_penimbangan_44.getText().toString());
                        myParams.put("bulan_penimbangan_45", Tambah_Data_KMS.this.etxbulan_penimbangan_45.getText().toString());
                        myParams.put("bulan_penimbangan_46", Tambah_Data_KMS.this.etxbulan_penimbangan_46.getText().toString());
                        myParams.put("bulan_penimbangan_47", Tambah_Data_KMS.this.etxbulan_penimbangan_47.getText().toString());
                        myParams.put("bulan_penimbangan_48", Tambah_Data_KMS.this.etxbulan_penimbangan_48.getText().toString());
                        myParams.put("bulan_penimbangan_49", Tambah_Data_KMS.this.etxbulan_penimbangan_49.getText().toString());
                        myParams.put("bulan_penimbangan_50", Tambah_Data_KMS.this.etxbulan_penimbangan_50.getText().toString());
                        myParams.put("bulan_penimbangan_51", Tambah_Data_KMS.this.etxbulan_penimbangan_51.getText().toString());
                        myParams.put("bulan_penimbangan_55", Tambah_Data_KMS.this.etxbulan_penimbangan_55.getText().toString());
                        myParams.put("bulan_penimbangan_55", Tambah_Data_KMS.this.etxbulan_penimbangan_55.getText().toString());
                        myParams.put("bulan_penimbangan_54", Tambah_Data_KMS.this.etxbulan_penimbangan_54.getText().toString());
                        myParams.put("bulan_penimbangan_55", Tambah_Data_KMS.this.etxbulan_penimbangan_55.getText().toString());
                        myParams.put("bulan_penimbangan_56", Tambah_Data_KMS.this.etxbulan_penimbangan_56.getText().toString());
                        myParams.put("bulan_penimbangan_57", Tambah_Data_KMS.this.etxbulan_penimbangan_57.getText().toString());
                        myParams.put("bulan_penimbangan_58", Tambah_Data_KMS.this.etxbulan_penimbangan_58.getText().toString());
                        myParams.put("bulan_penimbangan_60", Tambah_Data_KMS.this.etxbulan_penimbangan_60.getText().toString());
                        myParams.put("bb_0", Tambah_Data_KMS.this.etxbb_0.getText().toString());
                        myParams.put("bb_1", Tambah_Data_KMS.this.etxbb_1.getText().toString());
                        myParams.put("bb_2", Tambah_Data_KMS.this.etxbb_2.getText().toString());
                        myParams.put("bb_3", Tambah_Data_KMS.this.etxbb_3.getText().toString());
                        myParams.put("bb_4", Tambah_Data_KMS.this.etxbb_4.getText().toString());
                        myParams.put("bb_5", Tambah_Data_KMS.this.etxbb_5.getText().toString());
                        myParams.put("bb_6", Tambah_Data_KMS.this.etxbb_6.getText().toString());
                        myParams.put("bb_7", Tambah_Data_KMS.this.etxbb_7.getText().toString());
                        myParams.put("bb_8", Tambah_Data_KMS.this.etxbb_8.getText().toString());
                        myParams.put("bb_9", Tambah_Data_KMS.this.etxbb_9.getText().toString());
                        myParams.put("bb_10", Tambah_Data_KMS.this.etxbb_10.getText().toString());
                        myParams.put("bb_11", Tambah_Data_KMS.this.etxbb_11.getText().toString());
                        myParams.put("bb_12", Tambah_Data_KMS.this.etxbb_12.getText().toString());
                        myParams.put("bb_13", Tambah_Data_KMS.this.etxbb_13.getText().toString());
                        myParams.put("bb_14", Tambah_Data_KMS.this.etxbb_14.getText().toString());
                        myParams.put("bb_15", Tambah_Data_KMS.this.etxbb_15.getText().toString());
                        myParams.put("bb_16", Tambah_Data_KMS.this.etxbb_16.getText().toString());
                        myParams.put("bb_17", Tambah_Data_KMS.this.etxbb_17.getText().toString());
                        myParams.put("bb_18", Tambah_Data_KMS.this.etxbb_18.getText().toString());
                        myParams.put("bb_19", Tambah_Data_KMS.this.etxbb_19.getText().toString());
                        myParams.put("bb_20", Tambah_Data_KMS.this.etxbb_20.getText().toString());
                        myParams.put("bb_21", Tambah_Data_KMS.this.etxbb_21.getText().toString());
                        myParams.put("bb_22", Tambah_Data_KMS.this.etxbb_22.getText().toString());
                        myParams.put("bb_23", Tambah_Data_KMS.this.etxbb_23.getText().toString());
                        myParams.put("bb_24", Tambah_Data_KMS.this.etxbb_24.getText().toString());
                        myParams.put("bb_25", Tambah_Data_KMS.this.etxbb_25.getText().toString());
                        myParams.put("bb_26", Tambah_Data_KMS.this.etxbb_26.getText().toString());
                        myParams.put("bb_27", Tambah_Data_KMS.this.etxbb_27.getText().toString());
                        myParams.put("bb_28", Tambah_Data_KMS.this.etxbb_28.getText().toString());
                        myParams.put("bb_29", Tambah_Data_KMS.this.etxbb_29.getText().toString());
                        myParams.put("bb_30", Tambah_Data_KMS.this.etxbb_30.getText().toString());
                        myParams.put("bb_31", Tambah_Data_KMS.this.etxbb_31.getText().toString());
                        myParams.put("bb_33", Tambah_Data_KMS.this.etxbb_33.getText().toString());
                        myParams.put("bb_33", Tambah_Data_KMS.this.etxbb_33.getText().toString());
                        myParams.put("bb_34", Tambah_Data_KMS.this.etxbb_34.getText().toString());
                        myParams.put("bb_35", Tambah_Data_KMS.this.etxbb_35.getText().toString());
                        myParams.put("bb_36", Tambah_Data_KMS.this.etxbb_36.getText().toString());
                        myParams.put("bb_37", Tambah_Data_KMS.this.etxbb_37.getText().toString());
                        myParams.put("bb_38", Tambah_Data_KMS.this.etxbb_38.getText().toString());
                        myParams.put("bb_39", Tambah_Data_KMS.this.etxbb_39.getText().toString());
                        myParams.put("bb_40", Tambah_Data_KMS.this.etxbb_40.getText().toString());
                        myParams.put("bb_41", Tambah_Data_KMS.this.etxbb_41.getText().toString());
                        myParams.put("bb_44", Tambah_Data_KMS.this.etxbb_44.getText().toString());
                        myParams.put("bb_44", Tambah_Data_KMS.this.etxbb_44.getText().toString());
                        myParams.put("bb_44", Tambah_Data_KMS.this.etxbb_44.getText().toString());
                        myParams.put("bb_45", Tambah_Data_KMS.this.etxbb_45.getText().toString());
                        myParams.put("bb_46", Tambah_Data_KMS.this.etxbb_46.getText().toString());
                        myParams.put("bb_47", Tambah_Data_KMS.this.etxbb_47.getText().toString());
                        myParams.put("bb_48", Tambah_Data_KMS.this.etxbb_48.getText().toString());
                        myParams.put("bb_49", Tambah_Data_KMS.this.etxbb_49.getText().toString());
                        myParams.put("bb_50", Tambah_Data_KMS.this.etxbb_50.getText().toString());
                        myParams.put("bb_51", Tambah_Data_KMS.this.etxbb_51.getText().toString());
                        myParams.put("bb_55", Tambah_Data_KMS.this.etxbb_55.getText().toString());
                        myParams.put("bb_55", Tambah_Data_KMS.this.etxbb_55.getText().toString());
                        myParams.put("bb_54", Tambah_Data_KMS.this.etxbb_54.getText().toString());
                        myParams.put("bb_55", Tambah_Data_KMS.this.etxbb_55.getText().toString());
                        myParams.put("bb_56", Tambah_Data_KMS.this.etxbb_56.getText().toString());
                        myParams.put("bb_57", Tambah_Data_KMS.this.etxbb_57.getText().toString());
                        myParams.put("bb_58", Tambah_Data_KMS.this.etxbb_58.getText().toString());
                        myParams.put("bb_60", Tambah_Data_KMS.this.etxbb_60.getText().toString());
                        myParams.put("nt_0", Tambah_Data_KMS.this.etxnt_0.getText().toString());
                        myParams.put("nt_1", Tambah_Data_KMS.this.etxnt_1.getText().toString());
                        myParams.put("nt_2", Tambah_Data_KMS.this.etxnt_2.getText().toString());
                        myParams.put("nt_3", Tambah_Data_KMS.this.etxnt_3.getText().toString());
                        myParams.put("nt_4", Tambah_Data_KMS.this.etxnt_4.getText().toString());
                        myParams.put("nt_5", Tambah_Data_KMS.this.etxnt_5.getText().toString());
                        myParams.put("nt_6", Tambah_Data_KMS.this.etxnt_6.getText().toString());
                        myParams.put("nt_7", Tambah_Data_KMS.this.etxnt_7.getText().toString());
                        myParams.put("nt_8", Tambah_Data_KMS.this.etxnt_8.getText().toString());
                        myParams.put("nt_9", Tambah_Data_KMS.this.etxnt_9.getText().toString());
                        myParams.put("nt_10", Tambah_Data_KMS.this.etxnt_10.getText().toString());
                        myParams.put("nt_11", Tambah_Data_KMS.this.etxnt_11.getText().toString());
                        myParams.put("nt_12", Tambah_Data_KMS.this.etxnt_12.getText().toString());
                        myParams.put("nt_13", Tambah_Data_KMS.this.etxnt_13.getText().toString());
                        myParams.put("nt_14", Tambah_Data_KMS.this.etxnt_14.getText().toString());
                        myParams.put("nt_15", Tambah_Data_KMS.this.etxnt_15.getText().toString());
                        myParams.put("nt_16", Tambah_Data_KMS.this.etxnt_16.getText().toString());
                        myParams.put("nt_17", Tambah_Data_KMS.this.etxnt_17.getText().toString());
                        myParams.put("nt_18", Tambah_Data_KMS.this.etxnt_18.getText().toString());
                        myParams.put("nt_19", Tambah_Data_KMS.this.etxnt_19.getText().toString());
                        myParams.put("nt_20", Tambah_Data_KMS.this.etxnt_20.getText().toString());
                        myParams.put("nt_21", Tambah_Data_KMS.this.etxnt_21.getText().toString());
                        myParams.put("nt_22", Tambah_Data_KMS.this.etxnt_22.getText().toString());
                        myParams.put("nt_23", Tambah_Data_KMS.this.etxnt_23.getText().toString());
                        myParams.put("nt_24", Tambah_Data_KMS.this.etxnt_24.getText().toString());
                        myParams.put("nt_25", Tambah_Data_KMS.this.etxnt_25.getText().toString());
                        myParams.put("nt_26", Tambah_Data_KMS.this.etxnt_26.getText().toString());
                        myParams.put("nt_27", Tambah_Data_KMS.this.etxnt_27.getText().toString());
                        myParams.put("nt_28", Tambah_Data_KMS.this.etxnt_28.getText().toString());
                        myParams.put("nt_29", Tambah_Data_KMS.this.etxnt_29.getText().toString());
                        myParams.put("nt_30", Tambah_Data_KMS.this.etxnt_30.getText().toString());
                        myParams.put("nt_31", Tambah_Data_KMS.this.etxnt_31.getText().toString());
                        myParams.put("nt_33", Tambah_Data_KMS.this.etxnt_33.getText().toString());
                        myParams.put("nt_33", Tambah_Data_KMS.this.etxnt_33.getText().toString());
                        myParams.put("nt_34", Tambah_Data_KMS.this.etxnt_34.getText().toString());
                        myParams.put("nt_35", Tambah_Data_KMS.this.etxnt_35.getText().toString());
                        myParams.put("nt_36", Tambah_Data_KMS.this.etxnt_36.getText().toString());
                        myParams.put("nt_37", Tambah_Data_KMS.this.etxnt_37.getText().toString());
                        myParams.put("nt_38", Tambah_Data_KMS.this.etxnt_38.getText().toString());
                        myParams.put("nt_39", Tambah_Data_KMS.this.etxnt_39.getText().toString());
                        myParams.put("nt_40", Tambah_Data_KMS.this.etxnt_40.getText().toString());
                        myParams.put("nt_41", Tambah_Data_KMS.this.etxnt_41.getText().toString());
                        myParams.put("nt_44", Tambah_Data_KMS.this.etxnt_44.getText().toString());
                        myParams.put("nt_44", Tambah_Data_KMS.this.etxnt_44.getText().toString());
                        myParams.put("nt_44", Tambah_Data_KMS.this.etxnt_44.getText().toString());
                        myParams.put("nt_45", Tambah_Data_KMS.this.etxnt_45.getText().toString());
                        myParams.put("nt_46", Tambah_Data_KMS.this.etxnt_46.getText().toString());
                        myParams.put("nt_47", Tambah_Data_KMS.this.etxnt_47.getText().toString());
                        myParams.put("nt_48", Tambah_Data_KMS.this.etxnt_48.getText().toString());
                        myParams.put("nt_49", Tambah_Data_KMS.this.etxnt_49.getText().toString());
                        myParams.put("nt_50", Tambah_Data_KMS.this.etxnt_50.getText().toString());
                        myParams.put("nt_51", Tambah_Data_KMS.this.etxnt_51.getText().toString());
                        myParams.put("nt_55", Tambah_Data_KMS.this.etxnt_55.getText().toString());
                        myParams.put("nt_55", Tambah_Data_KMS.this.etxnt_55.getText().toString());
                        myParams.put("nt_54", Tambah_Data_KMS.this.etxnt_54.getText().toString());
                        myParams.put("nt_55", Tambah_Data_KMS.this.etxnt_55.getText().toString());
                        myParams.put("nt_56", Tambah_Data_KMS.this.etxnt_56.getText().toString());
                        myParams.put("nt_57", Tambah_Data_KMS.this.etxnt_57.getText().toString());
                        myParams.put("nt_58", Tambah_Data_KMS.this.etxnt_58.getText().toString());
                        myParams.put("nt_60", Tambah_Data_KMS.this.etxnt_60.getText().toString());
                        myParams.put("asi_eksklusif_0", Tambah_Data_KMS.this.etxasi_eksklusif_0.getText().toString());
                        myParams.put("asi_eksklusif_1", Tambah_Data_KMS.this.etxasi_eksklusif_1.getText().toString());
                        myParams.put("asi_eksklusif_2", Tambah_Data_KMS.this.etxasi_eksklusif_2.getText().toString());
                        myParams.put("asi_eksklusif_3", Tambah_Data_KMS.this.etxasi_eksklusif_3.getText().toString());
                        myParams.put("asi_eksklusif_4", Tambah_Data_KMS.this.etxasi_eksklusif_4.getText().toString());
                        myParams.put("asi_eksklusif_5", Tambah_Data_KMS.this.etxasi_eksklusif_5.getText().toString());
                        myParams.put("asi_eksklusif_6", Tambah_Data_KMS.this.etxasi_eksklusif_6.getText().toString());
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
                        Tambah_Data_KMS.this.nama_ibu1.setText(jsonArray.getJSONObject(i).getString("nama_ibu"));
                        Tambah_Data_KMS.this.nama_ayah.setText(jsonArray.getJSONObject(i).getString("nama_ayah"));
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
                        JSONObject getData = jsonArray.getJSONObject(i);
                        String anakke = getData.getString("anak_ke");
                        String jeniskelamin = getData.getString("jenis_kelamin");
                        Tambah_Data_KMS.this.anak_ke.setText(anakke);
                        Tambah_Data_KMS.this.jenis_kelamin.setText(jeniskelamin);
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
                        Tambah_Data_KMS.this.list_namaanak.add(jsonArray2.getJSONObject(j).getString("nama"));
                        Tambah_Data_KMS tambah_Data_KMS = Tambah_Data_KMS.this;
                        Tambah_Data_KMS tambah_Data_KMS2 = Tambah_Data_KMS.this;
                        tambah_Data_KMS.namaanak_adapter = new ArrayAdapter<>(tambah_Data_KMS2, 17367048, tambah_Data_KMS2.list_namaanak);
                        Tambah_Data_KMS.this.namaanak_adapter.setDropDownViewResource(17367049);
                        Tambah_Data_KMS.this.spinnernama_anak.setAdapter(Tambah_Data_KMS.this.namaanak_adapter);
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
                        Tambah_Data_KMS.this.list_nikibu.add(jsonArray.getJSONObject(i).getString("nik"));
                        Tambah_Data_KMS tambah_Data_KMS = Tambah_Data_KMS.this;
                        Tambah_Data_KMS tambah_Data_KMS2 = Tambah_Data_KMS.this;
                        tambah_Data_KMS.nikibu_adapter = new ArrayAdapter<>(tambah_Data_KMS2, 17367048, tambah_Data_KMS2.list_nikibu);
                        Tambah_Data_KMS.this.nikibu_adapter.setDropDownViewResource(17367049);
                        Tambah_Data_KMS.this.spinnernik_ibu.setAdapter(Tambah_Data_KMS.this.nikibu_adapter);
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

    private void showDateDialog0(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_0.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog1(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_1.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_2.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_3.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_4.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_5.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_6.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_7.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_8.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_9.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_10.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_11.setText(dateFormatter.format(newDate.getTime()));
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

                etxbulan_penimbangan_12.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog13(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_13.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog14(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_14.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog15(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_15.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog16(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_16.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog17(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_17.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog18(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_18.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog19(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_19.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog20(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_20.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog21(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_21.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog22(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_22.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog23(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_23.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog24(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_24.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog25(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_25.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog26(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_26.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog27(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_27.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog28(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_28.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog29(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_29.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog30(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_30.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog31(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_31.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog32(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_32.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog33(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_33.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog34(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_34.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog35(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_35.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog36(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_36.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog37(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_37.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog38(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_38.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog39(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_39.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
    private void showDateDialog40(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_40.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog41(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_41.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog42(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_42.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog43(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_43.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog44(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_44.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog45(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_45.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog46(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_46.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog47(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_47.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog48(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_48.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog49(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_49.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog50(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_50.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog51(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_51.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog52(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_52.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog53(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_53.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog54(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_54.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog55(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_55.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog56(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_56.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog57(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_57.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog58(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_58.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog59(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_59.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void showDateDialog60(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                etxbulan_penimbangan_60.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
