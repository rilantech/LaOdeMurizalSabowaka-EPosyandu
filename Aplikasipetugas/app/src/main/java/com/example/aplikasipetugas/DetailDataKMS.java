package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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
import androidx.core.internal.view.SupportMenu;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DetailDataKMS extends AppCompatActivity {
    public static String gbb_0;
    public static String gbb_1;
    public static String gbb_10;
    public static String gbb_11;
    public static String gbb_12;
    public static String gbb_13;
    public static String gbb_14;
    public static String gbb_15;
    public static String gbb_16;
    public static String gbb_17;
    public static String gbb_18;
    public static String gbb_19;
    public static String gbb_2;
    public static String gbb_20;
    public static String gbb_21;
    public static String gbb_22;
    public static String gbb_23;
    public static String gbb_24;
    public static String gbb_25;
    public static String gbb_26;
    public static String gbb_27;
    public static String gbb_28;
    public static String gbb_29;
    public static String gbb_3;
    public static String gbb_30;
    public static String gbb_31;
    public static String gbb_32;
    public static String gbb_33;
    public static String gbb_34;
    public static String gbb_35;
    public static String gbb_36;
    public static String gbb_37;
    public static String gbb_38;
    public static String gbb_39;
    public static String gbb_4;
    public static String gbb_40;
    public static String gbb_41;
    public static String gbb_42;
    public static String gbb_43;
    public static String gbb_44;
    public static String gbb_45;
    public static String gbb_46;
    public static String gbb_47;
    public static String gbb_48;
    public static String gbb_49;
    public static String gbb_5;
    public static String gbb_50;
    public static String gbb_51;
    public static String gbb_52;
    public static String gbb_53;
    public static String gbb_54;
    public static String gbb_55;
    public static String gbb_56;
    public static String gbb_57;
    public static String gbb_58;
    public static String gbb_59;
    public static String gbb_6;
    public static String gbb_60;
    public static String gbb_7;
    public static String gbb_8;
    public static String gbb_9;
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
    LineChart lineChart;
    TextView nama_anak;
    TextView nama_ibu, nama_ayah;
    TextView nik_ibu;
    ImageView tombol_kembali;
    TextView tvNamapetugas;
    TextView tvStatus_BB;
    TextView etxstatus_bb_0;
    TextView etxstatus_bb_1;
    TextView etxstatus_bb_2;
    TextView etxstatus_bb_3;
    TextView etxstatus_bb_4;
    TextView etxstatus_bb_5;
    TextView etxstatus_bb_6;
    TextView etxstatus_bb_7;
    TextView etxstatus_bb_8;
    TextView etxstatus_bb_9;
    TextView etxstatus_bb_10;
    TextView etxstatus_bb_11;
    TextView etxstatus_bb_12;
    TextView etxstatus_bb_13;
    TextView etxstatus_bb_14;
    TextView etxstatus_bb_15;
    TextView etxstatus_bb_16;
    TextView etxstatus_bb_17;
    TextView etxstatus_bb_18;
    TextView etxstatus_bb_19;
    TextView etxstatus_bb_20;
    TextView etxstatus_bb_21;
    TextView etxstatus_bb_22;
    TextView etxstatus_bb_23;
    TextView etxstatus_bb_24;
    TextView etxstatus_bb_25;
    TextView etxstatus_bb_26;
    TextView etxstatus_bb_27;
    TextView etxstatus_bb_28;
    TextView etxstatus_bb_29;
    TextView etxstatus_bb_30;
    TextView etxstatus_bb_31;
    TextView etxstatus_bb_32;
    TextView etxstatus_bb_33;
    TextView etxstatus_bb_34;
    TextView etxstatus_bb_35;
    TextView etxstatus_bb_36;
    TextView etxstatus_bb_37;
    TextView etxstatus_bb_38;
    TextView etxstatus_bb_39;
    TextView etxstatus_bb_40;
    TextView etxstatus_bb_41;
    TextView etxstatus_bb_42;
    TextView etxstatus_bb_43;
    TextView etxstatus_bb_44;
    TextView etxstatus_bb_45;
    TextView etxstatus_bb_46;
    TextView etxstatus_bb_47;
    TextView etxstatus_bb_48;
    TextView etxstatus_bb_49;
    TextView etxstatus_bb_50;
    TextView etxstatus_bb_51;
    TextView etxstatus_bb_52;
    TextView etxstatus_bb_53;
    TextView etxstatus_bb_54;
    TextView etxstatus_bb_55;
    TextView etxstatus_bb_56;
    TextView etxstatus_bb_57;
    TextView etxstatus_bb_58;
    TextView etxstatus_bb_59;
    TextView etxstatus_bb_60;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_data_kms);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.nik_ibu = (TextView) findViewById(R.id.nik_ibu);
        this.nama_ibu = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah = (TextView) findViewById(R.id.nama_ayah);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.jenis_kelamin = (TextView) findViewById(R.id.jenis_kelamin);
        this.tvStatus_BB = (TextView) findViewById(R.id.status_berat_badan);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.lineChart = (LineChart) findViewById(R.id.grafikkms);
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
        this.etxstatus_bb_0 = (TextView) findViewById(R.id.etxstatus_bb_0);
        this.etxstatus_bb_1 = (TextView) findViewById(R.id.etxstatus_bb_1);
        this.etxstatus_bb_2 = (TextView) findViewById(R.id.etxstatus_bb_2);
        this.etxstatus_bb_3 = (TextView) findViewById(R.id.etxstatus_bb_3);
        this.etxstatus_bb_4 = (TextView) findViewById(R.id.etxstatus_bb_4);
        this.etxstatus_bb_5 = (TextView) findViewById(R.id.etxstatus_bb_5);
        this.etxstatus_bb_6 = (TextView) findViewById(R.id.etxstatus_bb_6);
        this.etxstatus_bb_7 = (TextView) findViewById(R.id.etxstatus_bb_7);
        this.etxstatus_bb_8 = (TextView) findViewById(R.id.etxstatus_bb_8);
        this.etxstatus_bb_9 = (TextView) findViewById(R.id.etxstatus_bb_9);
        this.etxstatus_bb_10 = (TextView) findViewById(R.id.etxstatus_bb_10);
        this.etxstatus_bb_11 = (TextView) findViewById(R.id.etxstatus_bb_11);
        this.etxstatus_bb_12 = (TextView) findViewById(R.id.etxstatus_bb_12);
        this.etxstatus_bb_13 = (TextView) findViewById(R.id.etxstatus_bb_13);
        this.etxstatus_bb_14 = (TextView) findViewById(R.id.etxstatus_bb_14);
        this.etxstatus_bb_15 = (TextView) findViewById(R.id.etxstatus_bb_15);
        this.etxstatus_bb_16 = (TextView) findViewById(R.id.etxstatus_bb_16);
        this.etxstatus_bb_17 = (TextView) findViewById(R.id.etxstatus_bb_17);
        this.etxstatus_bb_18 = (TextView) findViewById(R.id.etxstatus_bb_18);
        this.etxstatus_bb_19 = (TextView) findViewById(R.id.etxstatus_bb_19);
        this.etxstatus_bb_20 = (TextView) findViewById(R.id.etxstatus_bb_20);
        this.etxstatus_bb_21 = (TextView) findViewById(R.id.etxstatus_bb_21);
        this.etxstatus_bb_22 = (TextView) findViewById(R.id.etxstatus_bb_22);
        this.etxstatus_bb_23 = (TextView) findViewById(R.id.etxstatus_bb_23);
        this.etxstatus_bb_24 = (TextView) findViewById(R.id.etxstatus_bb_24);
        this.etxstatus_bb_25 = (TextView) findViewById(R.id.etxstatus_bb_25);
        this.etxstatus_bb_26 = (TextView) findViewById(R.id.etxstatus_bb_26);
        this.etxstatus_bb_27 = (TextView) findViewById(R.id.etxstatus_bb_27);
        this.etxstatus_bb_28 = (TextView) findViewById(R.id.etxstatus_bb_28);
        this.etxstatus_bb_29 = (TextView) findViewById(R.id.etxstatus_bb_29);
        this.etxstatus_bb_30 = (TextView) findViewById(R.id.etxstatus_bb_30);
        this.etxstatus_bb_31 = (TextView) findViewById(R.id.etxstatus_bb_31);
        this.etxstatus_bb_32 = (TextView) findViewById(R.id.etxstatus_bb_32);
        this.etxstatus_bb_33 = (TextView) findViewById(R.id.etxstatus_bb_33);
        this.etxstatus_bb_34 = (TextView) findViewById(R.id.etxstatus_bb_34);
        this.etxstatus_bb_35 = (TextView) findViewById(R.id.etxstatus_bb_35);
        this.etxstatus_bb_36 = (TextView) findViewById(R.id.etxstatus_bb_36);
        this.etxstatus_bb_37 = (TextView) findViewById(R.id.etxstatus_bb_37);
        this.etxstatus_bb_38 = (TextView) findViewById(R.id.etxstatus_bb_38);
        this.etxstatus_bb_39 = (TextView) findViewById(R.id.etxstatus_bb_39);
        this.etxstatus_bb_40 = (TextView) findViewById(R.id.etxstatus_bb_40);
        this.etxstatus_bb_41 = (TextView) findViewById(R.id.etxstatus_bb_41);
        this.etxstatus_bb_42 = (TextView) findViewById(R.id.etxstatus_bb_42);
        this.etxstatus_bb_43 = (TextView) findViewById(R.id.etxstatus_bb_43);
        this.etxstatus_bb_44 = (TextView) findViewById(R.id.etxstatus_bb_44);
        this.etxstatus_bb_45 = (TextView) findViewById(R.id.etxstatus_bb_45);
        this.etxstatus_bb_46 = (TextView) findViewById(R.id.etxstatus_bb_46);
        this.etxstatus_bb_47 = (TextView) findViewById(R.id.etxstatus_bb_47);
        this.etxstatus_bb_48 = (TextView) findViewById(R.id.etxstatus_bb_48);
        this.etxstatus_bb_49 = (TextView) findViewById(R.id.etxstatus_bb_49);
        this.etxstatus_bb_50 = (TextView) findViewById(R.id.etxstatus_bb_50);
        this.etxstatus_bb_51 = (TextView) findViewById(R.id.etxstatus_bb_51);
        this.etxstatus_bb_52 = (TextView) findViewById(R.id.etxstatus_bb_52);
        this.etxstatus_bb_53 = (TextView) findViewById(R.id.etxstatus_bb_53);
        this.etxstatus_bb_54 = (TextView) findViewById(R.id.etxstatus_bb_54);
        this.etxstatus_bb_55 = (TextView) findViewById(R.id.etxstatus_bb_55);
        this.etxstatus_bb_56 = (TextView) findViewById(R.id.etxstatus_bb_56);
        this.etxstatus_bb_57 = (TextView) findViewById(R.id.etxstatus_bb_57);
        this.etxstatus_bb_58 = (TextView) findViewById(R.id.etxstatus_bb_58);
        this.etxstatus_bb_59 = (TextView) findViewById(R.id.etxstatus_bb_59);
        this.etxstatus_bb_60 = (TextView) findViewById(R.id.etxstatus_bb_60);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailDataKMS.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(DetailDataKMS.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        DetailDataKMS.this.startActivity(intent);
                        DetailDataKMS.this.finish();
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
                DetailDataKMS.this.startActivity(new Intent(DetailDataKMS.this.getApplicationContext(), Data_KMS.class));
                DetailDataKMS.this.finish();
            }
        });
        this.nik_ibu.setText(getIntent().getStringExtra("nik_ibu"));
        this.nama_ibu.setText(getIntent().getStringExtra("nama_ibu"));
        this.nama_ayah.setText(getIntent().getStringExtra("nama_ayah"));
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.anak_ke.setText(getIntent().getStringExtra("anak_ke"));
        this.jenis_kelamin.setText(getIntent().getStringExtra("jenis_kelamin"));
        if (getIntent().hasExtra("detail_data_kms")) {
            getData();
        }
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Volley.newRequestQueue(DetailDataKMS.this).add(new StringRequest(2, new Configurasi().baseUrl() + "api/updatedatakms/" + DetailDataKMS.this.getIntent().getIntExtra("detail_data_kms", 0), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(DetailDataKMS.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Terupdate");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        DetailDataKMS.this.getData();
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
                        Toast.makeText(DetailDataKMS.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", DetailDataKMS.this.nik_ibu.getText().toString());
                        myParams.put("nama_ibu", DetailDataKMS.this.nama_ibu.getText().toString());
                        myParams.put("nama_anak", DetailDataKMS.this.nama_anak.getText().toString());
                        myParams.put("anak_ke", DetailDataKMS.this.anak_ke.getText().toString());
                        myParams.put("jenis_kelamin", DetailDataKMS.this.jenis_kelamin.getText().toString());
                        myParams.put("bulan_penimbangan_0", DetailDataKMS.this.etxbulan_penimbangan_0.getText().toString());
                        myParams.put("bulan_penimbangan_1", DetailDataKMS.this.etxbulan_penimbangan_1.getText().toString());
                        myParams.put("bulan_penimbangan_2", DetailDataKMS.this.etxbulan_penimbangan_2.getText().toString());
                        myParams.put("bulan_penimbangan_3", DetailDataKMS.this.etxbulan_penimbangan_3.getText().toString());
                        myParams.put("bulan_penimbangan_4", DetailDataKMS.this.etxbulan_penimbangan_4.getText().toString());
                        myParams.put("bulan_penimbangan_5", DetailDataKMS.this.etxbulan_penimbangan_5.getText().toString());
                        myParams.put("bulan_penimbangan_6", DetailDataKMS.this.etxbulan_penimbangan_6.getText().toString());
                        myParams.put("bulan_penimbangan_7", DetailDataKMS.this.etxbulan_penimbangan_7.getText().toString());
                        myParams.put("bulan_penimbangan_8", DetailDataKMS.this.etxbulan_penimbangan_8.getText().toString());
                        myParams.put("bulan_penimbangan_9", DetailDataKMS.this.etxbulan_penimbangan_9.getText().toString());
                        myParams.put("bulan_penimbangan_10", DetailDataKMS.this.etxbulan_penimbangan_10.getText().toString());
                        myParams.put("bulan_penimbangan_11", DetailDataKMS.this.etxbulan_penimbangan_11.getText().toString());
                        myParams.put("bulan_penimbangan_12", DetailDataKMS.this.etxbulan_penimbangan_12.getText().toString());
                        myParams.put("bulan_penimbangan_13", DetailDataKMS.this.etxbulan_penimbangan_13.getText().toString());
                        myParams.put("bulan_penimbangan_14", DetailDataKMS.this.etxbulan_penimbangan_14.getText().toString());
                        myParams.put("bulan_penimbangan_15", DetailDataKMS.this.etxbulan_penimbangan_15.getText().toString());
                        myParams.put("bulan_penimbangan_16", DetailDataKMS.this.etxbulan_penimbangan_16.getText().toString());
                        myParams.put("bulan_penimbangan_17", DetailDataKMS.this.etxbulan_penimbangan_17.getText().toString());
                        myParams.put("bulan_penimbangan_18", DetailDataKMS.this.etxbulan_penimbangan_18.getText().toString());
                        myParams.put("bulan_penimbangan_19", DetailDataKMS.this.etxbulan_penimbangan_19.getText().toString());
                        myParams.put("bulan_penimbangan_20", DetailDataKMS.this.etxbulan_penimbangan_20.getText().toString());
                        myParams.put("bulan_penimbangan_21", DetailDataKMS.this.etxbulan_penimbangan_21.getText().toString());
                        myParams.put("bulan_penimbangan_22", DetailDataKMS.this.etxbulan_penimbangan_22.getText().toString());
                        myParams.put("bulan_penimbangan_23", DetailDataKMS.this.etxbulan_penimbangan_23.getText().toString());
                        myParams.put("bulan_penimbangan_24", DetailDataKMS.this.etxbulan_penimbangan_24.getText().toString());
                        myParams.put("bulan_penimbangan_25", DetailDataKMS.this.etxbulan_penimbangan_25.getText().toString());
                        myParams.put("bulan_penimbangan_26", DetailDataKMS.this.etxbulan_penimbangan_26.getText().toString());
                        myParams.put("bulan_penimbangan_27", DetailDataKMS.this.etxbulan_penimbangan_27.getText().toString());
                        myParams.put("bulan_penimbangan_28", DetailDataKMS.this.etxbulan_penimbangan_28.getText().toString());
                        myParams.put("bulan_penimbangan_29", DetailDataKMS.this.etxbulan_penimbangan_29.getText().toString());
                        myParams.put("bulan_penimbangan_30", DetailDataKMS.this.etxbulan_penimbangan_30.getText().toString());
                        myParams.put("bulan_penimbangan_31", DetailDataKMS.this.etxbulan_penimbangan_31.getText().toString());
                        myParams.put("bulan_penimbangan_33", DetailDataKMS.this.etxbulan_penimbangan_33.getText().toString());
                        myParams.put("bulan_penimbangan_33", DetailDataKMS.this.etxbulan_penimbangan_33.getText().toString());
                        myParams.put("bulan_penimbangan_34", DetailDataKMS.this.etxbulan_penimbangan_34.getText().toString());
                        myParams.put("bulan_penimbangan_35", DetailDataKMS.this.etxbulan_penimbangan_35.getText().toString());
                        myParams.put("bulan_penimbangan_36", DetailDataKMS.this.etxbulan_penimbangan_36.getText().toString());
                        myParams.put("bulan_penimbangan_37", DetailDataKMS.this.etxbulan_penimbangan_37.getText().toString());
                        myParams.put("bulan_penimbangan_38", DetailDataKMS.this.etxbulan_penimbangan_38.getText().toString());
                        myParams.put("bulan_penimbangan_39", DetailDataKMS.this.etxbulan_penimbangan_39.getText().toString());
                        myParams.put("bulan_penimbangan_40", DetailDataKMS.this.etxbulan_penimbangan_40.getText().toString());
                        myParams.put("bulan_penimbangan_41", DetailDataKMS.this.etxbulan_penimbangan_41.getText().toString());
                        myParams.put("bulan_penimbangan_44", DetailDataKMS.this.etxbulan_penimbangan_44.getText().toString());
                        myParams.put("bulan_penimbangan_44", DetailDataKMS.this.etxbulan_penimbangan_44.getText().toString());
                        myParams.put("bulan_penimbangan_44", DetailDataKMS.this.etxbulan_penimbangan_44.getText().toString());
                        myParams.put("bulan_penimbangan_45", DetailDataKMS.this.etxbulan_penimbangan_45.getText().toString());
                        myParams.put("bulan_penimbangan_46", DetailDataKMS.this.etxbulan_penimbangan_46.getText().toString());
                        myParams.put("bulan_penimbangan_47", DetailDataKMS.this.etxbulan_penimbangan_47.getText().toString());
                        myParams.put("bulan_penimbangan_48", DetailDataKMS.this.etxbulan_penimbangan_48.getText().toString());
                        myParams.put("bulan_penimbangan_49", DetailDataKMS.this.etxbulan_penimbangan_49.getText().toString());
                        myParams.put("bulan_penimbangan_50", DetailDataKMS.this.etxbulan_penimbangan_50.getText().toString());
                        myParams.put("bulan_penimbangan_51", DetailDataKMS.this.etxbulan_penimbangan_51.getText().toString());
                        myParams.put("bulan_penimbangan_55", DetailDataKMS.this.etxbulan_penimbangan_55.getText().toString());
                        myParams.put("bulan_penimbangan_55", DetailDataKMS.this.etxbulan_penimbangan_55.getText().toString());
                        myParams.put("bulan_penimbangan_54", DetailDataKMS.this.etxbulan_penimbangan_54.getText().toString());
                        myParams.put("bulan_penimbangan_55", DetailDataKMS.this.etxbulan_penimbangan_55.getText().toString());
                        myParams.put("bulan_penimbangan_56", DetailDataKMS.this.etxbulan_penimbangan_56.getText().toString());
                        myParams.put("bulan_penimbangan_57", DetailDataKMS.this.etxbulan_penimbangan_57.getText().toString());
                        myParams.put("bulan_penimbangan_58", DetailDataKMS.this.etxbulan_penimbangan_58.getText().toString());
                        myParams.put("bulan_penimbangan_60", DetailDataKMS.this.etxbulan_penimbangan_60.getText().toString());
                        myParams.put("bb_0", DetailDataKMS.this.etxbb_0.getText().toString());
                        myParams.put("bb_1", DetailDataKMS.this.etxbb_1.getText().toString());
                        myParams.put("bb_2", DetailDataKMS.this.etxbb_2.getText().toString());
                        myParams.put("bb_3", DetailDataKMS.this.etxbb_3.getText().toString());
                        myParams.put("bb_4", DetailDataKMS.this.etxbb_4.getText().toString());
                        myParams.put("bb_5", DetailDataKMS.this.etxbb_5.getText().toString());
                        myParams.put("bb_6", DetailDataKMS.this.etxbb_6.getText().toString());
                        myParams.put("bb_7", DetailDataKMS.this.etxbb_7.getText().toString());
                        myParams.put("bb_8", DetailDataKMS.this.etxbb_8.getText().toString());
                        myParams.put("bb_9", DetailDataKMS.this.etxbb_9.getText().toString());
                        myParams.put("bb_10", DetailDataKMS.this.etxbb_10.getText().toString());
                        myParams.put("bb_11", DetailDataKMS.this.etxbb_11.getText().toString());
                        myParams.put("bb_12", DetailDataKMS.this.etxbb_12.getText().toString());
                        myParams.put("bb_13", DetailDataKMS.this.etxbb_13.getText().toString());
                        myParams.put("bb_14", DetailDataKMS.this.etxbb_14.getText().toString());
                        myParams.put("bb_15", DetailDataKMS.this.etxbb_15.getText().toString());
                        myParams.put("bb_16", DetailDataKMS.this.etxbb_16.getText().toString());
                        myParams.put("bb_17", DetailDataKMS.this.etxbb_17.getText().toString());
                        myParams.put("bb_18", DetailDataKMS.this.etxbb_18.getText().toString());
                        myParams.put("bb_19", DetailDataKMS.this.etxbb_19.getText().toString());
                        myParams.put("bb_20", DetailDataKMS.this.etxbb_20.getText().toString());
                        myParams.put("bb_21", DetailDataKMS.this.etxbb_21.getText().toString());
                        myParams.put("bb_22", DetailDataKMS.this.etxbb_22.getText().toString());
                        myParams.put("bb_23", DetailDataKMS.this.etxbb_23.getText().toString());
                        myParams.put("bb_24", DetailDataKMS.this.etxbb_24.getText().toString());
                        myParams.put("bb_25", DetailDataKMS.this.etxbb_25.getText().toString());
                        myParams.put("bb_26", DetailDataKMS.this.etxbb_26.getText().toString());
                        myParams.put("bb_27", DetailDataKMS.this.etxbb_27.getText().toString());
                        myParams.put("bb_28", DetailDataKMS.this.etxbb_28.getText().toString());
                        myParams.put("bb_29", DetailDataKMS.this.etxbb_29.getText().toString());
                        myParams.put("bb_30", DetailDataKMS.this.etxbb_30.getText().toString());
                        myParams.put("bb_31", DetailDataKMS.this.etxbb_31.getText().toString());
                        myParams.put("bb_33", DetailDataKMS.this.etxbb_33.getText().toString());
                        myParams.put("bb_33", DetailDataKMS.this.etxbb_33.getText().toString());
                        myParams.put("bb_34", DetailDataKMS.this.etxbb_34.getText().toString());
                        myParams.put("bb_35", DetailDataKMS.this.etxbb_35.getText().toString());
                        myParams.put("bb_36", DetailDataKMS.this.etxbb_36.getText().toString());
                        myParams.put("bb_37", DetailDataKMS.this.etxbb_37.getText().toString());
                        myParams.put("bb_38", DetailDataKMS.this.etxbb_38.getText().toString());
                        myParams.put("bb_39", DetailDataKMS.this.etxbb_39.getText().toString());
                        myParams.put("bb_40", DetailDataKMS.this.etxbb_40.getText().toString());
                        myParams.put("bb_41", DetailDataKMS.this.etxbb_41.getText().toString());
                        myParams.put("bb_44", DetailDataKMS.this.etxbb_44.getText().toString());
                        myParams.put("bb_44", DetailDataKMS.this.etxbb_44.getText().toString());
                        myParams.put("bb_44", DetailDataKMS.this.etxbb_44.getText().toString());
                        myParams.put("bb_45", DetailDataKMS.this.etxbb_45.getText().toString());
                        myParams.put("bb_46", DetailDataKMS.this.etxbb_46.getText().toString());
                        myParams.put("bb_47", DetailDataKMS.this.etxbb_47.getText().toString());
                        myParams.put("bb_48", DetailDataKMS.this.etxbb_48.getText().toString());
                        myParams.put("bb_49", DetailDataKMS.this.etxbb_49.getText().toString());
                        myParams.put("bb_50", DetailDataKMS.this.etxbb_50.getText().toString());
                        myParams.put("bb_51", DetailDataKMS.this.etxbb_51.getText().toString());
                        myParams.put("bb_55", DetailDataKMS.this.etxbb_55.getText().toString());
                        myParams.put("bb_55", DetailDataKMS.this.etxbb_55.getText().toString());
                        myParams.put("bb_54", DetailDataKMS.this.etxbb_54.getText().toString());
                        myParams.put("bb_55", DetailDataKMS.this.etxbb_55.getText().toString());
                        myParams.put("bb_56", DetailDataKMS.this.etxbb_56.getText().toString());
                        myParams.put("bb_57", DetailDataKMS.this.etxbb_57.getText().toString());
                        myParams.put("bb_58", DetailDataKMS.this.etxbb_58.getText().toString());
                        myParams.put("bb_60", DetailDataKMS.this.etxbb_60.getText().toString());
                        myParams.put("nt_0", DetailDataKMS.this.etxnt_0.getText().toString());
                        myParams.put("nt_1", DetailDataKMS.this.etxnt_1.getText().toString());
                        myParams.put("nt_2", DetailDataKMS.this.etxnt_2.getText().toString());
                        myParams.put("nt_3", DetailDataKMS.this.etxnt_3.getText().toString());
                        myParams.put("nt_4", DetailDataKMS.this.etxnt_4.getText().toString());
                        myParams.put("nt_5", DetailDataKMS.this.etxnt_5.getText().toString());
                        myParams.put("nt_6", DetailDataKMS.this.etxnt_6.getText().toString());
                        myParams.put("nt_7", DetailDataKMS.this.etxnt_7.getText().toString());
                        myParams.put("nt_8", DetailDataKMS.this.etxnt_8.getText().toString());
                        myParams.put("nt_9", DetailDataKMS.this.etxnt_9.getText().toString());
                        myParams.put("nt_10", DetailDataKMS.this.etxnt_10.getText().toString());
                        myParams.put("nt_11", DetailDataKMS.this.etxnt_11.getText().toString());
                        myParams.put("nt_12", DetailDataKMS.this.etxnt_12.getText().toString());
                        myParams.put("nt_13", DetailDataKMS.this.etxnt_13.getText().toString());
                        myParams.put("nt_14", DetailDataKMS.this.etxnt_14.getText().toString());
                        myParams.put("nt_15", DetailDataKMS.this.etxnt_15.getText().toString());
                        myParams.put("nt_16", DetailDataKMS.this.etxnt_16.getText().toString());
                        myParams.put("nt_17", DetailDataKMS.this.etxnt_17.getText().toString());
                        myParams.put("nt_18", DetailDataKMS.this.etxnt_18.getText().toString());
                        myParams.put("nt_19", DetailDataKMS.this.etxnt_19.getText().toString());
                        myParams.put("nt_20", DetailDataKMS.this.etxnt_20.getText().toString());
                        myParams.put("nt_21", DetailDataKMS.this.etxnt_21.getText().toString());
                        myParams.put("nt_22", DetailDataKMS.this.etxnt_22.getText().toString());
                        myParams.put("nt_23", DetailDataKMS.this.etxnt_23.getText().toString());
                        myParams.put("nt_24", DetailDataKMS.this.etxnt_24.getText().toString());
                        myParams.put("nt_25", DetailDataKMS.this.etxnt_25.getText().toString());
                        myParams.put("nt_26", DetailDataKMS.this.etxnt_26.getText().toString());
                        myParams.put("nt_27", DetailDataKMS.this.etxnt_27.getText().toString());
                        myParams.put("nt_28", DetailDataKMS.this.etxnt_28.getText().toString());
                        myParams.put("nt_29", DetailDataKMS.this.etxnt_29.getText().toString());
                        myParams.put("nt_30", DetailDataKMS.this.etxnt_30.getText().toString());
                        myParams.put("nt_31", DetailDataKMS.this.etxnt_31.getText().toString());
                        myParams.put("nt_33", DetailDataKMS.this.etxnt_33.getText().toString());
                        myParams.put("nt_33", DetailDataKMS.this.etxnt_33.getText().toString());
                        myParams.put("nt_34", DetailDataKMS.this.etxnt_34.getText().toString());
                        myParams.put("nt_35", DetailDataKMS.this.etxnt_35.getText().toString());
                        myParams.put("nt_36", DetailDataKMS.this.etxnt_36.getText().toString());
                        myParams.put("nt_37", DetailDataKMS.this.etxnt_37.getText().toString());
                        myParams.put("nt_38", DetailDataKMS.this.etxnt_38.getText().toString());
                        myParams.put("nt_39", DetailDataKMS.this.etxnt_39.getText().toString());
                        myParams.put("nt_40", DetailDataKMS.this.etxnt_40.getText().toString());
                        myParams.put("nt_41", DetailDataKMS.this.etxnt_41.getText().toString());
                        myParams.put("nt_44", DetailDataKMS.this.etxnt_44.getText().toString());
                        myParams.put("nt_44", DetailDataKMS.this.etxnt_44.getText().toString());
                        myParams.put("nt_44", DetailDataKMS.this.etxnt_44.getText().toString());
                        myParams.put("nt_45", DetailDataKMS.this.etxnt_45.getText().toString());
                        myParams.put("nt_46", DetailDataKMS.this.etxnt_46.getText().toString());
                        myParams.put("nt_47", DetailDataKMS.this.etxnt_47.getText().toString());
                        myParams.put("nt_48", DetailDataKMS.this.etxnt_48.getText().toString());
                        myParams.put("nt_49", DetailDataKMS.this.etxnt_49.getText().toString());
                        myParams.put("nt_50", DetailDataKMS.this.etxnt_50.getText().toString());
                        myParams.put("nt_51", DetailDataKMS.this.etxnt_51.getText().toString());
                        myParams.put("nt_55", DetailDataKMS.this.etxnt_55.getText().toString());
                        myParams.put("nt_55", DetailDataKMS.this.etxnt_55.getText().toString());
                        myParams.put("nt_54", DetailDataKMS.this.etxnt_54.getText().toString());
                        myParams.put("nt_55", DetailDataKMS.this.etxnt_55.getText().toString());
                        myParams.put("nt_56", DetailDataKMS.this.etxnt_56.getText().toString());
                        myParams.put("nt_57", DetailDataKMS.this.etxnt_57.getText().toString());
                        myParams.put("nt_58", DetailDataKMS.this.etxnt_58.getText().toString());
                        myParams.put("nt_60", DetailDataKMS.this.etxnt_60.getText().toString());
                        myParams.put("asi_eksklusif_0", DetailDataKMS.this.etxasi_eksklusif_0.getText().toString());
                        myParams.put("asi_eksklusif_1", DetailDataKMS.this.etxasi_eksklusif_1.getText().toString());
                        myParams.put("asi_eksklusif_2", DetailDataKMS.this.etxasi_eksklusif_2.getText().toString());
                        myParams.put("asi_eksklusif_3", DetailDataKMS.this.etxasi_eksklusif_3.getText().toString());
                        myParams.put("asi_eksklusif_4", DetailDataKMS.this.etxasi_eksklusif_4.getText().toString());
                        myParams.put("asi_eksklusif_5", DetailDataKMS.this.etxasi_eksklusif_5.getText().toString());
                        myParams.put("asi_eksklusif_6", DetailDataKMS.this.etxasi_eksklusif_6.getText().toString());
                        return myParams;
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    public void drawLineChart() {
        LineDataSet lineDataSet = new LineDataSet(getDataSet(), getString(R.string.umur));
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setColor(Color.rgb(47, 128, 237));
        lineDataSet.setCircleColor(-16711936);
        lineDataSet.setCircleRadius(6.0f);
        lineDataSet.setCircleHoleRadius(3.0f);
        lineDataSet.setDrawHighlightIndicators(true);
        lineDataSet.setHighLightColor(SupportMenu.CATEGORY_MASK);
        lineDataSet.setValueTextSize(10.0f);
        lineDataSet.setValueTextColor(-12303292);
        lineDataSet.setValueFormatter(new ValueFormatter() {
            public String getFormattedValue(float value) {
                return String.valueOf(value);
            }
        });
        this.lineChart.invalidate();
        XAxis xAxis = this.lineChart.getXAxis();
        LineData lineData = new LineData(lineDataSet);
        this.lineChart.getDescription().setText(getString(R.string.berat_badan));
        this.lineChart.getDescription().setTextSize(12.0f);
        this.lineChart.setDrawMarkers(true);
        this.lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTH_SIDED);
        this.lineChart.animateY(1000);
        this.lineChart.getXAxis().setGranularityEnabled(true);
        this.lineChart.getXAxis().setGranularity(1.0f);
        this.lineChart.getXAxis().setLabelCount(lineDataSet.getEntryCount());
        this.lineChart.setData(lineData);
    }

    private List<Entry> getDataSet() {
        List<Entry> lineEntries = new ArrayList<>();
        try {
            lineEntries.add(new Entry(0.0f, Float.valueOf(gbb_0).floatValue()));
            lineEntries.add(new Entry(1.0f, Float.valueOf(gbb_1).floatValue()));
            lineEntries.add(new Entry(2.0f, Float.valueOf(gbb_2).floatValue()));
            lineEntries.add(new Entry(3.0f, Float.valueOf(gbb_3).floatValue()));
            lineEntries.add(new Entry(4.0f, Float.valueOf(gbb_4).floatValue()));
            lineEntries.add(new Entry(5.0f, Float.valueOf(gbb_5).floatValue()));
            lineEntries.add(new Entry(6.0f, Float.valueOf(gbb_6).floatValue()));
            lineEntries.add(new Entry(7.0f, Float.valueOf(gbb_7).floatValue()));
            lineEntries.add(new Entry(8.0f, Float.valueOf(gbb_8).floatValue()));
            lineEntries.add(new Entry(9.0f, Float.valueOf(gbb_9).floatValue()));
            lineEntries.add(new Entry(10.0f, Float.valueOf(gbb_10).floatValue()));
            lineEntries.add(new Entry(11.0f, Float.valueOf(gbb_11).floatValue()));
            lineEntries.add(new Entry(12.0f, Float.valueOf(gbb_12).floatValue()));
            lineEntries.add(new Entry(13.0f, Float.valueOf(gbb_13).floatValue()));
            lineEntries.add(new Entry(14.0f, Float.valueOf(gbb_14).floatValue()));
            lineEntries.add(new Entry(15.0f, Float.valueOf(gbb_15).floatValue()));
            lineEntries.add(new Entry(16.0f, Float.valueOf(gbb_16).floatValue()));
            lineEntries.add(new Entry(17.0f, Float.valueOf(gbb_17).floatValue()));
            lineEntries.add(new Entry(18.0f, Float.valueOf(gbb_18).floatValue()));
            lineEntries.add(new Entry(19.0f, Float.valueOf(gbb_19).floatValue()));
            lineEntries.add(new Entry(20.0f, Float.valueOf(gbb_20).floatValue()));
            lineEntries.add(new Entry(21.0f, Float.valueOf(gbb_21).floatValue()));
            lineEntries.add(new Entry(22.0f, Float.valueOf(gbb_22).floatValue()));
            lineEntries.add(new Entry(23.0f, Float.valueOf(gbb_23).floatValue()));
            lineEntries.add(new Entry(24.0f, Float.valueOf(gbb_24).floatValue()));
            lineEntries.add(new Entry(25.0f, Float.valueOf(gbb_25).floatValue()));
            lineEntries.add(new Entry(26.0f, Float.valueOf(gbb_26).floatValue()));
            lineEntries.add(new Entry(27.0f, Float.valueOf(gbb_27).floatValue()));
            lineEntries.add(new Entry(28.0f, Float.valueOf(gbb_28).floatValue()));
            lineEntries.add(new Entry(29.0f, Float.valueOf(gbb_29).floatValue()));
            lineEntries.add(new Entry(30.0f, Float.valueOf(gbb_30).floatValue()));
            lineEntries.add(new Entry(31.0f, Float.valueOf(gbb_31).floatValue()));
            lineEntries.add(new Entry(32.0f, Float.valueOf(gbb_32).floatValue()));
            lineEntries.add(new Entry(33.0f, Float.valueOf(gbb_33).floatValue()));
            lineEntries.add(new Entry(34.0f, Float.valueOf(gbb_34).floatValue()));
            lineEntries.add(new Entry(35.0f, Float.valueOf(gbb_35).floatValue()));
            lineEntries.add(new Entry(36.0f, Float.valueOf(gbb_36).floatValue()));
            lineEntries.add(new Entry(37.0f, Float.valueOf(gbb_37).floatValue()));
            lineEntries.add(new Entry(38.0f, Float.valueOf(gbb_38).floatValue()));
            lineEntries.add(new Entry(39.0f, Float.valueOf(gbb_39).floatValue()));
            lineEntries.add(new Entry(40.0f, Float.valueOf(gbb_40).floatValue()));
            lineEntries.add(new Entry(41.0f, Float.valueOf(gbb_41).floatValue()));
            lineEntries.add(new Entry(42.0f, Float.valueOf(gbb_42).floatValue()));
            lineEntries.add(new Entry(43.0f, Float.valueOf(gbb_43).floatValue()));
            lineEntries.add(new Entry(44.0f, Float.valueOf(gbb_44).floatValue()));
            lineEntries.add(new Entry(45.0f, Float.valueOf(gbb_45).floatValue()));
            lineEntries.add(new Entry(46.0f, Float.valueOf(gbb_46).floatValue()));
            lineEntries.add(new Entry(47.0f, Float.valueOf(gbb_47).floatValue()));
            lineEntries.add(new Entry(48.0f, Float.valueOf(gbb_48).floatValue()));
            lineEntries.add(new Entry(49.0f, Float.valueOf(gbb_49).floatValue()));
            lineEntries.add(new Entry(50.0f, Float.valueOf(gbb_50).floatValue()));
            lineEntries.add(new Entry(51.0f, Float.valueOf(gbb_51).floatValue()));
            lineEntries.add(new Entry(52.0f, Float.valueOf(gbb_52).floatValue()));
            lineEntries.add(new Entry(53.0f, Float.valueOf(gbb_53).floatValue()));
            lineEntries.add(new Entry(54.0f, Float.valueOf(gbb_54).floatValue()));
            lineEntries.add(new Entry(55.0f, Float.valueOf(gbb_55).floatValue()));
            lineEntries.add(new Entry(56.0f, Float.valueOf(gbb_56).floatValue()));
            lineEntries.add(new Entry(57.0f, Float.valueOf(gbb_57).floatValue()));
            lineEntries.add(new Entry(58.0f, Float.valueOf(gbb_58).floatValue()));
            lineEntries.add(new Entry(59.0f, Float.valueOf(gbb_59).floatValue()));
            lineEntries.add(new Entry(60.0f, Float.valueOf(gbb_60).floatValue()));
        } catch (NumberFormatException e) {
            Log.e("Error", e.getMessage());
        }
        return lineEntries;
    }

    /* access modifiers changed from: package-private */
    public void getData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/detaildatakms/" + getIntent().getIntExtra("detail_data_kms", 0), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("detaildatakms");
                    JSONObject jsonObject1 = new JSONObject(response);
                    String status_bb = jsonObject1.getString("status_bb_terakhir");
                    String status_bb_0 = jsonObject1.getString("status_berat_badan_0");
                    String status_bb_1 = jsonObject1.getString("status_berat_badan_1");
                    String status_bb_2 = jsonObject1.getString("status_berat_badan_2");
                    String status_bb_3 = jsonObject1.getString("status_berat_badan_3");
                    String status_bb_4 = jsonObject1.getString("status_berat_badan_4");
                    String status_bb_5 = jsonObject1.getString("status_berat_badan_5");
                    String status_bb_6 = jsonObject1.getString("status_berat_badan_6");
                    String status_bb_7 = jsonObject1.getString("status_berat_badan_7");
                    String status_bb_8 = jsonObject1.getString("status_berat_badan_8");
                    String status_bb_9 = jsonObject1.getString("status_berat_badan_9");
                    String status_bb_10 = jsonObject1.getString("status_berat_badan_10");
                    String status_bb_11 = jsonObject1.getString("status_berat_badan_11");
                    String status_bb_12 = jsonObject1.getString("status_berat_badan_12");
                    String status_bb_13 = jsonObject1.getString("status_berat_badan_13");
                    String status_bb_14 = jsonObject1.getString("status_berat_badan_14");
                    String status_bb_15 = jsonObject1.getString("status_berat_badan_15");
                    String status_bb_16 = jsonObject1.getString("status_berat_badan_16");
                    String status_bb_17 = jsonObject1.getString("status_berat_badan_17");
                    String status_bb_18 = jsonObject1.getString("status_berat_badan_18");
                    String status_bb_19 = jsonObject1.getString("status_berat_badan_19");
                    String status_bb_20 = jsonObject1.getString("status_berat_badan_20");
                    String status_bb_21 = jsonObject1.getString("status_berat_badan_21");
                    String status_bb_22 = jsonObject1.getString("status_berat_badan_22");
                    String status_bb_23 = jsonObject1.getString("status_berat_badan_23");
                    String status_bb_24 = jsonObject1.getString("status_berat_badan_24");
                    String status_bb_25 = jsonObject1.getString("status_berat_badan_25");
                    String status_bb_26 = jsonObject1.getString("status_berat_badan_26");
                    String status_bb_27 = jsonObject1.getString("status_berat_badan_27");
                    String status_bb_28 = jsonObject1.getString("status_berat_badan_28");
                    String status_bb_29 = jsonObject1.getString("status_berat_badan_29");
                    String status_bb_30 = jsonObject1.getString("status_berat_badan_30");
                    String status_bb_31 = jsonObject1.getString("status_berat_badan_31");
                    String status_bb_32 = jsonObject1.getString("status_berat_badan_32");
                    String status_bb_33 = jsonObject1.getString("status_berat_badan_33");
                    String status_bb_34 = jsonObject1.getString("status_berat_badan_34");
                    String status_bb_35 = jsonObject1.getString("status_berat_badan_35");
                    String status_bb_36 = jsonObject1.getString("status_berat_badan_36");
                    String status_bb_37 = jsonObject1.getString("status_berat_badan_37");
                    String status_bb_38 = jsonObject1.getString("status_berat_badan_38");
                    String status_bb_39 = jsonObject1.getString("status_berat_badan_39");
                    String status_bb_40 = jsonObject1.getString("status_berat_badan_40");
//                    String status_bb_41 = jsonObject1.getString("-");
//                    String status_bb_42 = jsonObject1.getString("-");
//                    String status_bb_43 = jsonObject1.getString("-");
//                    String status_bb_44 = jsonObject1.getString("-");
//                    String status_bb_45 = jsonObject1.getString("-");
//                    String status_bb_46 = jsonObject1.getString("-");
//                    String status_bb_47 = jsonObject1.getString("-");
//                    String status_bb_48 = jsonObject1.getString("-");
//                    String status_bb_49 = jsonObject1.getString("-");
//                    String status_bb_50 = jsonObject1.getString("-");
//                    String status_bb_51 = jsonObject1.getString("-");
//                    String status_bb_52 = jsonObject1.getString("-");
//                    String status_bb_53 = jsonObject1.getString("-");
//                    String status_bb_54 = jsonObject1.getString("-");
//                    String status_bb_55 = jsonObject1.getString("-");
//                    String status_bb_56 = jsonObject1.getString("-");
//                    String status_bb_57 = jsonObject1.getString("-");
//                    String status_bb_58 = jsonObject1.getString("-");
//                    String status_bb_59 = jsonObject1.getString("-");
//                    String status_bb_60 = jsonObject1.getString("-");
                    tvStatus_BB.setText(status_bb);
                    etxstatus_bb_0.setText(status_bb_0);
                    etxstatus_bb_1.setText(status_bb_1);
                    etxstatus_bb_2.setText(status_bb_2);
                    etxstatus_bb_3.setText(status_bb_3);
                    etxstatus_bb_4.setText(status_bb_4);
                    etxstatus_bb_5.setText(status_bb_5);
                    etxstatus_bb_6.setText(status_bb_6);
                    etxstatus_bb_7.setText(status_bb_7);
                    etxstatus_bb_8.setText(status_bb_8);
                    etxstatus_bb_9.setText(status_bb_9);
                    etxstatus_bb_10.setText(status_bb_10);
                    etxstatus_bb_11.setText(status_bb_11);
                    etxstatus_bb_12.setText(status_bb_12);
                    etxstatus_bb_13.setText(status_bb_13);
                    etxstatus_bb_14.setText(status_bb_14);
                    etxstatus_bb_15.setText(status_bb_15);
                    etxstatus_bb_16.setText(status_bb_16);
                    etxstatus_bb_17.setText(status_bb_17);
                    etxstatus_bb_18.setText(status_bb_18);
                    etxstatus_bb_19.setText(status_bb_19);
                    etxstatus_bb_20.setText(status_bb_20);
                    etxstatus_bb_21.setText(status_bb_21);
                    etxstatus_bb_22.setText(status_bb_22);
                    etxstatus_bb_23.setText(status_bb_23);
                    etxstatus_bb_24.setText(status_bb_24);
                    etxstatus_bb_25.setText(status_bb_25);
                    etxstatus_bb_26.setText(status_bb_26);
                    etxstatus_bb_27.setText(status_bb_27);
                    etxstatus_bb_28.setText(status_bb_28);
                    etxstatus_bb_29.setText(status_bb_29);
                    etxstatus_bb_30.setText(status_bb_30);
                    etxstatus_bb_31.setText(status_bb_31);
                    etxstatus_bb_32.setText(status_bb_32);
                    etxstatus_bb_33.setText(status_bb_33);
                    etxstatus_bb_34.setText(status_bb_34);
                    etxstatus_bb_35.setText(status_bb_35);
                    etxstatus_bb_36.setText(status_bb_36);
                    etxstatus_bb_37.setText(status_bb_37);
                    etxstatus_bb_38.setText(status_bb_38);
                    etxstatus_bb_39.setText(status_bb_39);
                    etxstatus_bb_40.setText(status_bb_40);
                    etxstatus_bb_41.setText("-");
                    etxstatus_bb_42.setText("-");
                    etxstatus_bb_43.setText("-");
                    etxstatus_bb_44.setText("-");
                    etxstatus_bb_45.setText("-");
                    etxstatus_bb_46.setText("-");
                    etxstatus_bb_47.setText("-");
                    etxstatus_bb_48.setText("-");
                    etxstatus_bb_49.setText("-");
                    etxstatus_bb_50.setText("-");
                    etxstatus_bb_51.setText("-");
                    etxstatus_bb_52.setText("-");
                    etxstatus_bb_53.setText("-");
                    etxstatus_bb_54.setText("-");
                    etxstatus_bb_55.setText("-");
                    etxstatus_bb_56.setText("-");
                    etxstatus_bb_57.setText("-");
                    etxstatus_bb_58.setText("-");
                    etxstatus_bb_59.setText("-");
                    etxstatus_bb_60.setText("-");
                    String gbulan_penimbangan_0 = jsonObject.getString("bulan_penimbangan_0");
                    String gbulan_penimbangan_1 = jsonObject.getString("bulan_penimbangan_1");
                    String gbulan_penimbangan_2 = jsonObject.getString("bulan_penimbangan_2");
                    String gbulan_penimbangan_3 = jsonObject.getString("bulan_penimbangan_3");
                    String gbulan_penimbangan_4 = jsonObject.getString("bulan_penimbangan_4");
                    String gbulan_penimbangan_5 = jsonObject.getString("bulan_penimbangan_5");
                    String gbulan_penimbangan_6 = jsonObject.getString("bulan_penimbangan_6");
                    String gbulan_penimbangan_7 = jsonObject.getString("bulan_penimbangan_7");
                    String gbulan_penimbangan_8 = jsonObject.getString("bulan_penimbangan_8");
                    String gbulan_penimbangan_9 = jsonObject.getString("bulan_penimbangan_9");
                    String gbulan_penimbangan_10 = jsonObject.getString("bulan_penimbangan_10");
                    String gbulan_penimbangan_11 = jsonObject.getString("bulan_penimbangan_11");
                    String gbulan_penimbangan_12 = jsonObject.getString("bulan_penimbangan_12");
                    String gbulan_penimbangan_13 = jsonObject.getString("bulan_penimbangan_13");
                    String gbulan_penimbangan_14 = jsonObject.getString("bulan_penimbangan_14");
                    String gbulan_penimbangan_15 = jsonObject.getString("bulan_penimbangan_15");
                    String gbulan_penimbangan_16 = jsonObject.getString("bulan_penimbangan_16");
                    String gbulan_penimbangan_17 = jsonObject.getString("bulan_penimbangan_17");
                    String gbulan_penimbangan_18 = jsonObject.getString("bulan_penimbangan_18");
                    String gbulan_penimbangan_19 = jsonObject.getString("bulan_penimbangan_19");
                    String gbulan_penimbangan_20 = jsonObject.getString("bulan_penimbangan_20");
                    String gbulan_penimbangan_21 = jsonObject.getString("bulan_penimbangan_21");
                    String gbulan_penimbangan_22 = jsonObject.getString("bulan_penimbangan_22");
                    String gbulan_penimbangan_23 = jsonObject.getString("bulan_penimbangan_23");
                    String gbulan_penimbangan_24 = jsonObject.getString("bulan_penimbangan_24");
                    String gbulan_penimbangan_25 = jsonObject.getString("bulan_penimbangan_25");
                    String gbulan_penimbangan_26 = jsonObject.getString("bulan_penimbangan_26");
                    String gbulan_penimbangan_27 = jsonObject.getString("bulan_penimbangan_27");
                    String gbulan_penimbangan_28 = jsonObject.getString("bulan_penimbangan_28");
                    String gbulan_penimbangan_29 = jsonObject.getString("bulan_penimbangan_29");
                    String gbulan_penimbangan_30 = jsonObject.getString("bulan_penimbangan_30");
                    String gbulan_penimbangan_31 = jsonObject.getString("bulan_penimbangan_31");
                    String gbulan_penimbangan_32 = jsonObject.getString("bulan_penimbangan_32");
                    String gbulan_penimbangan_33 = jsonObject.getString("bulan_penimbangan_33");
                    String gbulan_penimbangan_34 = jsonObject.getString("bulan_penimbangan_34");
                    String gbulan_penimbangan_35 = jsonObject.getString("bulan_penimbangan_35");
                    String gbulan_penimbangan_36 = jsonObject.getString("bulan_penimbangan_36");
                    String gbulan_penimbangan_37 = jsonObject.getString("bulan_penimbangan_37");
                    String gbulan_penimbangan_38 = jsonObject.getString("bulan_penimbangan_38");
                    String gbulan_penimbangan_39 = jsonObject.getString("bulan_penimbangan_39");
                    String gbulan_penimbangan_40 = jsonObject.getString("bulan_penimbangan_40");
                    String gbulan_penimbangan_41 = jsonObject.getString("bulan_penimbangan_41");
                    String gbulan_penimbangan_42 = jsonObject.getString("bulan_penimbangan_42");
                    String gbulan_penimbangan_43 = jsonObject.getString("bulan_penimbangan_43");
                    String gbulan_penimbangan_44 = jsonObject.getString("bulan_penimbangan_44");
                    String gbulan_penimbangan_45 = jsonObject.getString("bulan_penimbangan_45");
                    String gbulan_penimbangan_46 = jsonObject.getString("bulan_penimbangan_46");
                    String gbulan_penimbangan_47 = jsonObject.getString("bulan_penimbangan_47");
                    String gbulan_penimbangan_48 = jsonObject.getString("bulan_penimbangan_48");
                    String gbulan_penimbangan_49 = jsonObject.getString("bulan_penimbangan_49");
                    String gbulan_penimbangan_50 = jsonObject.getString("bulan_penimbangan_50");
                    String gbulan_penimbangan_51 = jsonObject.getString("bulan_penimbangan_51");
                    String gbulan_penimbangan_52 = jsonObject.getString("bulan_penimbangan_52");
                    String gbulan_penimbangan_53 = jsonObject.getString("bulan_penimbangan_53");
                    String gbulan_penimbangan_54 = jsonObject.getString("bulan_penimbangan_54");
                    String gbulan_penimbangan_55 = jsonObject.getString("bulan_penimbangan_55");
                    String gbulan_penimbangan_56 = jsonObject.getString("bulan_penimbangan_56");
                    String gbulan_penimbangan_57 = jsonObject.getString("bulan_penimbangan_57");
                    String gbulan_penimbangan_58 = jsonObject.getString("bulan_penimbangan_58");
                    String gbulan_penimbangan_59 = jsonObject.getString("bulan_penimbangan_59");
                    String gbulan_penimbangan_60 = jsonObject.getString("bulan_penimbangan_60");
                    DetailDataKMS.gbb_0 = jsonObject.getString("bb_0");
                    DetailDataKMS.gbb_1 = jsonObject.getString("bb_1");
                    DetailDataKMS.gbb_2 = jsonObject.getString("bb_2");
                    DetailDataKMS.gbb_3 = jsonObject.getString("bb_3");
                    DetailDataKMS.gbb_4 = jsonObject.getString("bb_4");
                    DetailDataKMS.gbb_5 = jsonObject.getString("bb_5");
                    DetailDataKMS.gbb_6 = jsonObject.getString("bb_6");
                    DetailDataKMS.gbb_7 = jsonObject.getString("bb_7");
                    DetailDataKMS.gbb_8 = jsonObject.getString("bb_8");
                    DetailDataKMS.gbb_9 = jsonObject.getString("bb_9");
                    DetailDataKMS.gbb_10 = jsonObject.getString("bb_10");
                    DetailDataKMS.gbb_11 = jsonObject.getString("bb_11");
                    DetailDataKMS.gbb_12 = jsonObject.getString("bb_12");
                    DetailDataKMS.gbb_13 = jsonObject.getString("bb_13");
                    DetailDataKMS.gbb_14 = jsonObject.getString("bb_14");
                    DetailDataKMS.gbb_15 = jsonObject.getString("bb_15");
                    DetailDataKMS.gbb_16 = jsonObject.getString("bb_16");
                    DetailDataKMS.gbb_17 = jsonObject.getString("bb_17");
                    DetailDataKMS.gbb_18 = jsonObject.getString("bb_18");
                    DetailDataKMS.gbb_19 = jsonObject.getString("bb_19");
                    DetailDataKMS.gbb_20 = jsonObject.getString("bb_20");
                    DetailDataKMS.gbb_21 = jsonObject.getString("bb_21");
                    DetailDataKMS.gbb_22 = jsonObject.getString("bb_22");
                    DetailDataKMS.gbb_23 = jsonObject.getString("bb_23");
                    DetailDataKMS.gbb_24 = jsonObject.getString("bb_24");
                    DetailDataKMS.gbb_25 = jsonObject.getString("bb_25");
                    DetailDataKMS.gbb_26 = jsonObject.getString("bb_26");
                    DetailDataKMS.gbb_27 = jsonObject.getString("bb_27");
                    DetailDataKMS.gbb_28 = jsonObject.getString("bb_28");
                    DetailDataKMS.gbb_29 = jsonObject.getString("bb_29");
                    DetailDataKMS.gbb_30 = jsonObject.getString("bb_30");
                    DetailDataKMS.gbb_31 = jsonObject.getString("bb_31");
                    DetailDataKMS.gbb_32 = jsonObject.getString("bb_32");
                    DetailDataKMS.gbb_33 = jsonObject.getString("bb_33");
                    DetailDataKMS.gbb_34 = jsonObject.getString("bb_34");
                    DetailDataKMS.gbb_35 = jsonObject.getString("bb_35");
                    DetailDataKMS.gbb_36 = jsonObject.getString("bb_36");
                    DetailDataKMS.gbb_37 = jsonObject.getString("bb_37");
                    DetailDataKMS.gbb_38 = jsonObject.getString("bb_38");
                    DetailDataKMS.gbb_39 = jsonObject.getString("bb_39");
                    DetailDataKMS.gbb_40 = jsonObject.getString("bb_40");
                    DetailDataKMS.gbb_41 = jsonObject.getString("bb_41");
                    DetailDataKMS.gbb_42 = jsonObject.getString("bb_42");
                    DetailDataKMS.gbb_43 = jsonObject.getString("bb_43");
                    DetailDataKMS.gbb_44 = jsonObject.getString("bb_44");
                    DetailDataKMS.gbb_45 = jsonObject.getString("bb_45");
                    DetailDataKMS.gbb_46 = jsonObject.getString("bb_46");
                    DetailDataKMS.gbb_47 = jsonObject.getString("bb_47");
                    DetailDataKMS.gbb_48 = jsonObject.getString("bb_48");
                    DetailDataKMS.gbb_49 = jsonObject.getString("bb_49");
                    DetailDataKMS.gbb_50 = jsonObject.getString("bb_50");
                    DetailDataKMS.gbb_51 = jsonObject.getString("bb_51");
                    DetailDataKMS.gbb_52 = jsonObject.getString("bb_52");
                    DetailDataKMS.gbb_53 = jsonObject.getString("bb_53");
                    DetailDataKMS.gbb_54 = jsonObject.getString("bb_54");
                    DetailDataKMS.gbb_55 = jsonObject.getString("bb_55");
                    DetailDataKMS.gbb_56 = jsonObject.getString("bb_56");
                    DetailDataKMS.gbb_57 = jsonObject.getString("bb_57");
                    DetailDataKMS.gbb_58 = jsonObject.getString("bb_58");
                    DetailDataKMS.gbb_59 = jsonObject.getString("bb_59");
                    DetailDataKMS.gbb_60 = jsonObject.getString("bb_60");
                    String gnt_0 = jsonObject.getString("nt_0");
                    String gnt_1 = jsonObject.getString("nt_1");
                    String gnt_2 = jsonObject.getString("nt_2");
                    String gnt_3 = jsonObject.getString("nt_3");
                    String gnt_4 = jsonObject.getString("nt_4");
                    String gnt_5 = jsonObject.getString("nt_5");
                    String gnt_6 = jsonObject.getString("nt_6");
                    String gnt_7 = jsonObject.getString("nt_7");
                    String gnt_8 = jsonObject.getString("nt_8");
                    String gnt_9 = jsonObject.getString("nt_9");
                    String gnt_10 = jsonObject.getString("nt_10");
                    String gnt_11 = jsonObject.getString("nt_11");
                    String gnt_12 = jsonObject.getString("nt_12");
                    String gnt_13 = jsonObject.getString("nt_13");
                    String gnt_14 = jsonObject.getString("nt_14");
                    String gnt_15 = jsonObject.getString("nt_15");
                    String gnt_16 = jsonObject.getString("nt_16");
                    String gnt_17 = jsonObject.getString("nt_17");
                    String gnt_18 = jsonObject.getString("nt_18");
                    String gnt_19 = jsonObject.getString("nt_19");
                    String gnt_20 = jsonObject.getString("nt_20");
                    String gnt_21 = jsonObject.getString("nt_21");
                    String gnt_22 = jsonObject.getString("nt_22");
                    String gnt_23 = jsonObject.getString("nt_23");
                    String gnt_24 = jsonObject.getString("nt_24");
                    String gnt_25 = jsonObject.getString("nt_25");
                    String gnt_26 = jsonObject.getString("nt_26");
                    String gnt_27 = jsonObject.getString("nt_27");
                    String gnt_28 = jsonObject.getString("nt_28");
                    String gnt_29 = jsonObject.getString("nt_29");
                    String gnt_30 = jsonObject.getString("nt_30");
                    String gnt_31 = jsonObject.getString("nt_31");
                    String gnt_32 = jsonObject.getString("nt_32");
                    String gnt_33 = jsonObject.getString("nt_33");
                    String gnt_34 = jsonObject.getString("nt_34");
                    String gnt_35 = jsonObject.getString("nt_35");
                    String gnt_36 = jsonObject.getString("nt_36");
                    String gnt_37 = jsonObject.getString("nt_37");
                    String gnt_38 = jsonObject.getString("nt_38");
                    String gnt_39 = jsonObject.getString("nt_39");
                    String gnt_40 = jsonObject.getString("nt_40");
                    String gnt_41 = jsonObject.getString("nt_41");
                    String gnt_42 = jsonObject.getString("nt_42");
                    String gnt_43 = jsonObject.getString("nt_43");
                    String gnt_44 = jsonObject.getString("nt_44");
                    String gnt_45 = jsonObject.getString("nt_45");
                    String gnt_46 = jsonObject.getString("nt_46");
                    String gnt_47 = jsonObject.getString("nt_47");
                    String gnt_48 = jsonObject.getString("nt_48");
                    String gnt_49 = jsonObject.getString("nt_49");
                    String gnt_50 = jsonObject.getString("nt_50");
                    String gnt_51 = jsonObject.getString("nt_51");
                    String gnt_52 = jsonObject.getString("nt_52");
                    String gnt_53 = jsonObject.getString("nt_53");
                    String gnt_54 = jsonObject.getString("nt_54");
                    String gnt_55 = jsonObject.getString("nt_55");
                    String gnt_56 = jsonObject.getString("nt_56");
                    String gnt_57 = jsonObject.getString("nt_57");
                    String gnt_58 = jsonObject.getString("nt_58");
                    String gnt_59 = jsonObject.getString("nt_59");
                    String gnt_60 = jsonObject.getString("nt_60");
                    String gasi_eksklusif_0 = jsonObject.getString("asi_eksklusif_0");
                    String gasi_eksklusif_1 = jsonObject.getString("asi_eksklusif_1");
                    String gasi_eksklusif_2 = jsonObject.getString("asi_eksklusif_2");
                    String gasi_eksklusif_3 = jsonObject.getString("asi_eksklusif_3");
                    String gasi_eksklusif_4 = jsonObject.getString("asi_eksklusif_4");
                    String gasi_eksklusif_5 = jsonObject.getString("asi_eksklusif_5");
                    String gasi_eksklusif_6 = jsonObject.getString("asi_eksklusif_6");
                    JSONObject jSONObject = jsonObject;
                    DetailDataKMS.this.etxbulan_penimbangan_0.setText(gbulan_penimbangan_0);
                    DetailDataKMS.this.etxbulan_penimbangan_1.setText(gbulan_penimbangan_1);
                    DetailDataKMS.this.etxbulan_penimbangan_2.setText(gbulan_penimbangan_2);
                    DetailDataKMS.this.etxbulan_penimbangan_3.setText(gbulan_penimbangan_3);
                    DetailDataKMS.this.etxbulan_penimbangan_4.setText(gbulan_penimbangan_4);
                    DetailDataKMS.this.etxbulan_penimbangan_5.setText(gbulan_penimbangan_5);
                    DetailDataKMS.this.etxbulan_penimbangan_6.setText(gbulan_penimbangan_6);
                    DetailDataKMS.this.etxbulan_penimbangan_7.setText(gbulan_penimbangan_7);
                    DetailDataKMS.this.etxbulan_penimbangan_8.setText(gbulan_penimbangan_8);
                    DetailDataKMS.this.etxbulan_penimbangan_9.setText(gbulan_penimbangan_9);
                    DetailDataKMS.this.etxbulan_penimbangan_10.setText(gbulan_penimbangan_10);
                    DetailDataKMS.this.etxbulan_penimbangan_11.setText(gbulan_penimbangan_11);
                    if(gbulan_penimbangan_0 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_0.setText("-");
                    }else if(gbulan_penimbangan_0.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_0.setText("-");
                    }
                    else{
                        DetailDataKMS.this.etxbulan_penimbangan_0.setText(gbulan_penimbangan_0);
                    }

                    if(gbulan_penimbangan_1 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_1.setText("-");
                    }else if(gbulan_penimbangan_1.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_1.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_1.setText(gbulan_penimbangan_1);
                    }

                    if(gbulan_penimbangan_2 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_2.setText("-");
                    } else if(gbulan_penimbangan_2.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_2.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_2.setText(gbulan_penimbangan_2);
                    }

                    if(gbulan_penimbangan_3 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_3.setText("-");
                    }else if(gbulan_penimbangan_3.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_3.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_3.setText(gbulan_penimbangan_3);
                    }

                    if(gbulan_penimbangan_4 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_4.setText("-");
                    }else if(gbulan_penimbangan_4.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_4.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_4.setText(gbulan_penimbangan_4);
                    }

                    if(gbulan_penimbangan_5 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_5.setText("-");
                    }else if(gbulan_penimbangan_5.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_5.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_5.setText(gbulan_penimbangan_5);
                    }

                    if(gbulan_penimbangan_6 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_6.setText("-");
                    }else if(gbulan_penimbangan_6.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_6.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_6.setText(gbulan_penimbangan_6);
                    }

                    if(gbulan_penimbangan_7 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_7.setText("-");
                    } else if(gbulan_penimbangan_7.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_7.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_7.setText(gbulan_penimbangan_7);
                    }

                    if(gbulan_penimbangan_8 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_8.setText("-");
                    }else if(gbulan_penimbangan_8.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_8.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_8.setText(gbulan_penimbangan_8);
                    }

                    if(gbulan_penimbangan_9 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_9.setText("-");
                    } else if(gbulan_penimbangan_9.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_9.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_9.setText(gbulan_penimbangan_9);
                    }

                    if(gbulan_penimbangan_10 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_10.setText("-");
                    }else if(gbulan_penimbangan_10.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_10.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_10.setText(gbulan_penimbangan_10);
                    }

                    if(gbulan_penimbangan_11 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_11.setText("-");
                    }else if(gbulan_penimbangan_11.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_11.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_11.setText(gbulan_penimbangan_11);
                    }

                    if(gbulan_penimbangan_12 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_12.setText("-");
                    }else if(gbulan_penimbangan_12.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_12.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_12.setText(gbulan_penimbangan_12);
                    }
                    if(gbulan_penimbangan_13 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_13.setText("-");
                    }else if(gbulan_penimbangan_13.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_13.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_13.setText(gbulan_penimbangan_13);
                    }
                    if(gbulan_penimbangan_14 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_14.setText("-");
                    }else if(gbulan_penimbangan_14.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_14.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_14.setText(gbulan_penimbangan_14);
                    }
                    if(gbulan_penimbangan_15 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_15.setText("-");
                    }else if(gbulan_penimbangan_15.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_15.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_15.setText(gbulan_penimbangan_15);
                    }

                    if(gbulan_penimbangan_16 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_16.setText("-");
                    }else if(gbulan_penimbangan_16.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_16.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_16.setText(gbulan_penimbangan_16);
                    }

                    if(gbulan_penimbangan_17 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_17.setText("-");
                    }else if(gbulan_penimbangan_17.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_17.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_17.setText(gbulan_penimbangan_17);
                    }

                    if(gbulan_penimbangan_18 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_18.setText("-");
                    }else if(gbulan_penimbangan_18.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_18.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_18.setText(gbulan_penimbangan_18);
                    }

                    if(gbulan_penimbangan_19 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_19.setText("-");
                    }else if(gbulan_penimbangan_19.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_19.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_19.setText(gbulan_penimbangan_19);
                    }

                    if(gbulan_penimbangan_20 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_20.setText("-");
                    }else if(gbulan_penimbangan_20.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_20.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_20.setText(gbulan_penimbangan_20);
                    }

                    if(gbulan_penimbangan_21 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_21.setText("-");
                    }else if(gbulan_penimbangan_21.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_21.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_21.setText(gbulan_penimbangan_21);
                    }

                    if(gbulan_penimbangan_22 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_22.setText("-");
                    }else if(gbulan_penimbangan_22.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_22.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_22.setText(gbulan_penimbangan_22);
                    }
                    if(gbulan_penimbangan_23 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_23.setText("-");
                    }else if(gbulan_penimbangan_23.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_23.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_23.setText(gbulan_penimbangan_23);
                    }
                    if(gbulan_penimbangan_24 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_24.setText("-");
                    }else if(gbulan_penimbangan_24.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_24.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_24.setText(gbulan_penimbangan_24);
                    }
                    if(gbulan_penimbangan_25 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_25.setText("-");
                    }else if(gbulan_penimbangan_25.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_25.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_25.setText(gbulan_penimbangan_25);
                    }

                    if(gbulan_penimbangan_26 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_26.setText("-");
                    }else if(gbulan_penimbangan_26.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_26.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_26.setText(gbulan_penimbangan_26);
                    }

                    if(gbulan_penimbangan_27 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_27.setText("-");
                    }else if(gbulan_penimbangan_27.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_27.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_27.setText(gbulan_penimbangan_27);
                    }

                    if(gbulan_penimbangan_28 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_28.setText("-");
                    }else if(gbulan_penimbangan_28.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_28.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_28.setText(gbulan_penimbangan_28);
                    }

                    if(gbulan_penimbangan_29 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_29.setText("-");
                    }else if(gbulan_penimbangan_29.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_29.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_29.setText(gbulan_penimbangan_29);
                    }

                    if(gbulan_penimbangan_30 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_30.setText("-");
                    }else if(gbulan_penimbangan_30.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_30.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_30.setText(gbulan_penimbangan_30);
                    }

                    if(gbulan_penimbangan_31 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_31.setText("-");
                    }else if(gbulan_penimbangan_31.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_31.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_31.setText(gbulan_penimbangan_31);
                    }

                    if(gbulan_penimbangan_33 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_33.setText("-");
                    }else if(gbulan_penimbangan_33.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_33.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_33.setText(gbulan_penimbangan_33);
                    }
                    if(gbulan_penimbangan_33 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_33.setText("-");
                    }else if(gbulan_penimbangan_33.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_33.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_33.setText(gbulan_penimbangan_33);
                    }
                    if(gbulan_penimbangan_34 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_34.setText("-");
                    }else if(gbulan_penimbangan_34.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_34.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_34.setText(gbulan_penimbangan_34);
                    }
                    if(gbulan_penimbangan_35 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_35.setText("-");
                    }else if(gbulan_penimbangan_35.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_35.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_35.setText(gbulan_penimbangan_35);
                    }

                    if(gbulan_penimbangan_36 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_36.setText("-");
                    }else if(gbulan_penimbangan_36.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_36.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_36.setText(gbulan_penimbangan_36);
                    }

                    if(gbulan_penimbangan_37 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_37.setText("-");
                    }else if(gbulan_penimbangan_37.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_37.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_37.setText(gbulan_penimbangan_37);
                    }

                    if(gbulan_penimbangan_38 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_38.setText("-");
                    }else if(gbulan_penimbangan_38.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_38.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_38.setText(gbulan_penimbangan_38);
                    }

                    if(gbulan_penimbangan_39 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_39.setText("-");
                    }else if(gbulan_penimbangan_39.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_39.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_39.setText(gbulan_penimbangan_39);
                    }

                    if(gbulan_penimbangan_40 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_40.setText("-");
                    }else if(gbulan_penimbangan_40.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_40.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_40.setText(gbulan_penimbangan_40);
                    }

                    if(gbulan_penimbangan_41 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_41.setText("-");
                    }else if(gbulan_penimbangan_41.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_41.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_41.setText(gbulan_penimbangan_41);
                    }

                    if(gbulan_penimbangan_42 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_42.setText("-");
                    }else if(gbulan_penimbangan_42.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_42.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_42.setText(gbulan_penimbangan_42);
                    }
                    if(gbulan_penimbangan_43 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_43.setText("-");
                    }else if(gbulan_penimbangan_43.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_43.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_43.setText(gbulan_penimbangan_43);
                    }
                    if(gbulan_penimbangan_44 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_44.setText("-");
                    }else if(gbulan_penimbangan_44.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_44.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_44.setText(gbulan_penimbangan_44);
                    }
                    if(gbulan_penimbangan_45 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_45.setText("-");
                    }else if(gbulan_penimbangan_45.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_45.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_45.setText(gbulan_penimbangan_45);
                    }

                    if(gbulan_penimbangan_46 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_46.setText("-");
                    }else if(gbulan_penimbangan_46.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_46.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_46.setText(gbulan_penimbangan_46);
                    }

                    if(gbulan_penimbangan_47 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_47.setText("-");
                    }else if(gbulan_penimbangan_47.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_47.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_47.setText(gbulan_penimbangan_47);
                    }

                    if(gbulan_penimbangan_48 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_48.setText("-");
                    }else if(gbulan_penimbangan_48.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_48.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_48.setText(gbulan_penimbangan_48);
                    }

                    if(gbulan_penimbangan_49 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_49.setText("-");
                    }else if(gbulan_penimbangan_49.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_49.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_49.setText(gbulan_penimbangan_49);
                    }
                    if(gbulan_penimbangan_50 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_50.setText("-");
                    }else if(gbulan_penimbangan_50.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_50.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_50.setText(gbulan_penimbangan_50);
                    }
                    if(gbulan_penimbangan_51 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_51.setText("-");
                    }else if(gbulan_penimbangan_51.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_51.setText("-");
                    }else{
                        DetailDataKMS.this.etxbulan_penimbangan_51.setText(gbulan_penimbangan_51);
                    }

                    if(gbulan_penimbangan_52 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_52.setText("-");
                    }else if(gbulan_penimbangan_52.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_52.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_52.setText(gbulan_penimbangan_52);
                    }
                    if(gbulan_penimbangan_53 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_53.setText("-");
                    }else if(gbulan_penimbangan_53.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_53.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_53.setText(gbulan_penimbangan_53);
                    }
                    if(gbulan_penimbangan_55 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_55.setText("-");
                    }else if(gbulan_penimbangan_55.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_55.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_55.setText(gbulan_penimbangan_55);
                    }
                    if(gbulan_penimbangan_56 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_56.setText("-");
                    }else if(gbulan_penimbangan_56.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_56.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_56.setText(gbulan_penimbangan_56);
                    }

                    if(gbulan_penimbangan_56 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_56.setText("-");
                    }else if(gbulan_penimbangan_56.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_56.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_56.setText(gbulan_penimbangan_56);
                    }

                    if(gbulan_penimbangan_57 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_57.setText("-");
                    }else if(gbulan_penimbangan_57.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_57.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_57.setText(gbulan_penimbangan_57);
                    }

                    if(gbulan_penimbangan_58 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_58.setText("-");
                    }else if(gbulan_penimbangan_58.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_58.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_58.setText(gbulan_penimbangan_58);
                    }

                    if(gbulan_penimbangan_59 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_59.setText("-");
                    }else if(gbulan_penimbangan_59.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_59.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_59.setText(gbulan_penimbangan_59);
                    }
                    if(gbulan_penimbangan_60 == "null"){
                        DetailDataKMS.this.etxbulan_penimbangan_60.setText("-");
                    }else if(gbulan_penimbangan_60.equals("01-01-1970")){
                        DetailDataKMS.this.etxbulan_penimbangan_60.setText("-");
                    } else{
                        DetailDataKMS.this.etxbulan_penimbangan_60.setText(gbulan_penimbangan_60);
                    }

                    if(gbb_0 == "null"){
                        DetailDataKMS.this.etxbb_0.setText("");
                    }else if(gbb_0.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_0.setText("");
                    }
                    else{
                        DetailDataKMS.this.etxbb_0.setText(gbb_0);
                    }

                    if(gbb_1 == "null"){
                        DetailDataKMS.this.etxbb_1.setText("");
                    }else if(gbb_1.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_1.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_1.setText(gbb_1);
                    }

                    if(gbb_2 == "null"){
                        DetailDataKMS.this.etxbb_2.setText("");
                    } else if(gbb_2.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_2.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_2.setText(gbb_2);
                    }

                    if(gbb_3 == "null"){
                        DetailDataKMS.this.etxbb_3.setText("");
                    }else if(gbb_3.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_3.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_3.setText(gbb_3);
                    }

                    if(gbb_4 == "null"){
                        DetailDataKMS.this.etxbb_4.setText("");
                    }else if(gbb_4.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_4.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_4.setText(gbb_4);
                    }

                    if(gbb_5 == "null"){
                        DetailDataKMS.this.etxbb_5.setText("");
                    }else if(gbb_5.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_5.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_5.setText(gbb_5);
                    }

                    if(gbb_6 == "null"){
                        DetailDataKMS.this.etxbb_6.setText("");
                    }else if(gbb_6.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_6.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_6.setText(gbb_6);
                    }

                    if(gbb_7 == "null"){
                        DetailDataKMS.this.etxbb_7.setText("");
                    } else if(gbb_7.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_7.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_7.setText(gbb_7);
                    }

                    if(gbb_8 == "null"){
                        DetailDataKMS.this.etxbb_8.setText("");
                    }else if(gbb_8.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_8.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_8.setText(gbb_8);
                    }

                    if(gbb_9 == "null"){
                        DetailDataKMS.this.etxbb_9.setText("");
                    } else if(gbb_9.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_9.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_9.setText(gbb_9);
                    }

                    if(gbb_10 == "null"){
                        DetailDataKMS.this.etxbb_10.setText("");
                    }else if(gbb_10.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_10.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_10.setText(gbb_10);
                    }

                    if(gbb_11 == "null"){
                        DetailDataKMS.this.etxbb_11.setText("");
                    }else if(gbb_11.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_11.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_11.setText(gbb_11);
                    }

                    if(gbb_12 == "null"){
                        DetailDataKMS.this.etxbb_12.setText("");
                    }else if(gbb_12.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_12.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_12.setText(gbb_12);
                    }
                    if(gbb_13 == "null"){
                        DetailDataKMS.this.etxbb_13.setText("");
                    }else if(gbb_13.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_13.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_13.setText(gbb_13);
                    }
                    if(gbb_14 == "null"){
                        DetailDataKMS.this.etxbb_14.setText("");
                    }else if(gbb_14.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_14.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_14.setText(gbb_14);
                    }
                    if(gbb_15 == "null"){
                        DetailDataKMS.this.etxbb_15.setText("");
                    }else if(gbb_15.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_15.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_15.setText(gbb_15);
                    }

                    if(gbb_16 == "null"){
                        DetailDataKMS.this.etxbb_16.setText("");
                    }else if(gbb_16.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_16.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_16.setText(gbb_16);
                    }

                    if(gbb_17 == "null"){
                        DetailDataKMS.this.etxbb_17.setText("");
                    }else if(gbb_17.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_17.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_17.setText(gbb_17);
                    }

                    if(gbb_18 == "null"){
                        DetailDataKMS.this.etxbb_18.setText("");
                    }else if(gbb_18.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_18.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_18.setText(gbb_18);
                    }

                    if(gbb_19 == "null"){
                        DetailDataKMS.this.etxbb_19.setText("");
                    }else if(gbb_19.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_19.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_19.setText(gbb_19);
                    }

                    if(gbb_20 == "null"){
                        DetailDataKMS.this.etxbb_20.setText("");
                    }else if(gbb_20.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_20.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_20.setText(gbb_20);
                    }

                    if(gbb_21 == "null"){
                        DetailDataKMS.this.etxbb_21.setText("");
                    }else if(gbb_21.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_21.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_21.setText(gbb_21);
                    }

                    if(gbb_22 == "null"){
                        DetailDataKMS.this.etxbb_22.setText("");
                    }else if(gbb_22.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_22.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_22.setText(gbb_22);
                    }
                    if(gbb_23 == "null"){
                        DetailDataKMS.this.etxbb_23.setText("");
                    }else if(gbb_23.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_23.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_23.setText(gbb_23);
                    }
                    if(gbb_24 == "null"){
                        DetailDataKMS.this.etxbb_24.setText("");
                    }else if(gbb_24.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_24.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_24.setText(gbb_24);
                    }
                    if(gbb_25 == "null"){
                        DetailDataKMS.this.etxbb_25.setText("");
                    }else if(gbb_25.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_25.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_25.setText(gbb_25);
                    }

                    if(gbb_26 == "null"){
                        DetailDataKMS.this.etxbb_26.setText("");
                    }else if(gbb_26.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_26.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_26.setText(gbb_26);
                    }

                    if(gbb_27 == "null"){
                        DetailDataKMS.this.etxbb_27.setText("");
                    }else if(gbb_27.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_27.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_27.setText(gbb_27);
                    }

                    if(gbb_28 == "null"){
                        DetailDataKMS.this.etxbb_28.setText("");
                    }else if(gbb_28.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_28.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_28.setText(gbb_28);
                    }

                    if(gbb_29 == "null"){
                        DetailDataKMS.this.etxbb_29.setText("");
                    }else if(gbb_29.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_29.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_29.setText(gbb_29);
                    }

                    if(gbb_30 == "null"){
                        DetailDataKMS.this.etxbb_30.setText("");
                    }else if(gbb_30.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_30.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_30.setText(gbb_30);
                    }

                    if(gbb_31 == "null"){
                        DetailDataKMS.this.etxbb_31.setText("");
                    }else if(gbb_31.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_31.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_31.setText(gbb_31);
                    }

                    if(gbb_33 == "null"){
                        DetailDataKMS.this.etxbb_33.setText("");
                    }else if(gbb_33.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_33.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_33.setText(gbb_33);
                    }
                    if(gbb_33 == "null"){
                        DetailDataKMS.this.etxbb_33.setText("");
                    }else if(gbb_33.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_33.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_33.setText(gbb_33);
                    }
                    if(gbb_34 == "null"){
                        DetailDataKMS.this.etxbb_34.setText("");
                    }else if(gbb_34.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_34.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_34.setText(gbb_34);
                    }
                    if(gbb_35 == "null"){
                        DetailDataKMS.this.etxbb_35.setText("");
                    }else if(gbb_35.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_35.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_35.setText(gbb_35);
                    }

                    if(gbb_36 == "null"){
                        DetailDataKMS.this.etxbb_36.setText("");
                    }else if(gbb_36.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_36.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_36.setText(gbb_36);
                    }

                    if(gbb_37 == "null"){
                        DetailDataKMS.this.etxbb_37.setText("");
                    }else if(gbb_37.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_37.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_37.setText(gbb_37);
                    }

                    if(gbb_38 == "null"){
                        DetailDataKMS.this.etxbb_38.setText("");
                    }else if(gbb_38.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_38.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_38.setText(gbb_38);
                    }

                    if(gbb_39 == "null"){
                        DetailDataKMS.this.etxbb_39.setText("");
                    }else if(gbb_39.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_39.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_39.setText(gbb_39);
                    }

                    if(gbb_40 == "null"){
                        DetailDataKMS.this.etxbb_40.setText("");
                    }else if(gbb_40.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_40.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_40.setText(gbb_40);
                    }

                    if(gbb_41 == "null"){
                        DetailDataKMS.this.etxbb_41.setText("");
                    }else if(gbb_41.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_41.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_41.setText(gbb_41);
                    }

                    if(gbb_42 == "null"){
                        DetailDataKMS.this.etxbb_42.setText("");
                    }else if(gbb_42.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_42.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_42.setText(gbb_42);
                    }
                    if(gbb_43 == "null"){
                        DetailDataKMS.this.etxbb_43.setText("");
                    }else if(gbb_43.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_43.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_43.setText(gbb_43);
                    }
                    if(gbb_44 == "null"){
                        DetailDataKMS.this.etxbb_44.setText("");
                    }else if(gbb_44.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_44.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_44.setText(gbb_44);
                    }
                    if(gbb_45 == "null"){
                        DetailDataKMS.this.etxbb_45.setText("");
                    }else if(gbb_45.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_45.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_45.setText(gbb_45);
                    }

                    if(gbb_46 == "null"){
                        DetailDataKMS.this.etxbb_46.setText("");
                    }else if(gbb_46.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_46.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_46.setText(gbb_46);
                    }

                    if(gbb_47 == "null"){
                        DetailDataKMS.this.etxbb_47.setText("");
                    }else if(gbb_47.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_47.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_47.setText(gbb_47);
                    }

                    if(gbb_48 == "null"){
                        DetailDataKMS.this.etxbb_48.setText("");
                    }else if(gbb_48.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_48.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_48.setText(gbb_48);
                    }

                    if(gbb_49 == "null"){
                        DetailDataKMS.this.etxbb_49.setText("");
                    }else if(gbb_49.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_49.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_49.setText(gbb_49);
                    }
                    if(gbb_50 == "null"){
                        DetailDataKMS.this.etxbb_50.setText("");
                    }else if(gbb_50.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_50.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_50.setText(gbb_50);
                    }
                    if(gbb_51 == "null"){
                        DetailDataKMS.this.etxbb_51.setText("");
                    }else if(gbb_51.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_51.setText("");
                    }else{
                        DetailDataKMS.this.etxbb_51.setText(gbb_51);
                    }

                    if(gbb_52 == "null"){
                        DetailDataKMS.this.etxbb_52.setText("");
                    }else if(gbb_52.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_52.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_52.setText(gbb_52);
                    }
                    if(gbb_53 == "null"){
                        DetailDataKMS.this.etxbb_53.setText("");
                    }else if(gbb_53.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_53.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_53.setText(gbb_53);
                    }
                    if(gbb_55 == "null"){
                        DetailDataKMS.this.etxbb_55.setText("");
                    }else if(gbb_55.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_55.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_55.setText(gbb_55);
                    }
                    if(gbb_56 == "null"){
                        DetailDataKMS.this.etxbb_56.setText("");
                    }else if(gbb_56.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_56.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_56.setText(gbb_56);
                    }

                    if(gbb_56 == "null"){
                        DetailDataKMS.this.etxbb_56.setText("");
                    }else if(gbb_56.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_56.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_56.setText(gbb_56);
                    }

                    if(gbb_57 == "null"){
                        DetailDataKMS.this.etxbb_57.setText("");
                    }else if(gbb_57.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_57.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_57.setText(gbb_57);
                    }

                    if(gbb_58 == "null"){
                        DetailDataKMS.this.etxbb_58.setText("");
                    }else if(gbb_58.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_58.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_58.setText(gbb_58);
                    }

                    if(gbb_59 == "null"){
                        DetailDataKMS.this.etxbb_59.setText("");
                    }else if(gbb_59.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_59.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_59.setText(gbb_59);
                    }
                    if(gbb_60 == "null"){
                        DetailDataKMS.this.etxbb_60.setText("");
                    }else if(gbb_60.equals("01-01-1970")){
                        DetailDataKMS.this.etxbb_60.setText("");
                    } else{
                        DetailDataKMS.this.etxbb_60.setText(gbb_60);
                    }

                    if(gnt_0 == "null"){
                        DetailDataKMS.this.etxnt_0.setText("-");
                    }else if(gnt_0.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_0.setText("-");
                    }
                    else{
                        DetailDataKMS.this.etxnt_0.setText(gnt_0);
                    }

                    if(gnt_1 == "null"){
                        DetailDataKMS.this.etxnt_1.setText("-");
                    }else if(gnt_1.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_1.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_1.setText(gnt_1);
                    }

                    if(gnt_2 == "null"){
                        DetailDataKMS.this.etxnt_2.setText("-");
                    } else if(gnt_2.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_2.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_2.setText(gnt_2);
                    }

                    if(gnt_3 == "null"){
                        DetailDataKMS.this.etxnt_3.setText("-");
                    }else if(gnt_3.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_3.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_3.setText(gnt_3);
                    }

                    if(gnt_4 == "null"){
                        DetailDataKMS.this.etxnt_4.setText("-");
                    }else if(gnt_4.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_4.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_4.setText(gnt_4);
                    }

                    if(gnt_5 == "null"){
                        DetailDataKMS.this.etxnt_5.setText("-");
                    }else if(gnt_5.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_5.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_5.setText(gnt_5);
                    }

                    if(gnt_6 == "null"){
                        DetailDataKMS.this.etxnt_6.setText("-");
                    }else if(gnt_6.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_6.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_6.setText(gnt_6);
                    }

                    if(gnt_7 == "null"){
                        DetailDataKMS.this.etxnt_7.setText("-");
                    } else if(gnt_7.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_7.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_7.setText(gnt_7);
                    }

                    if(gnt_8 == "null"){
                        DetailDataKMS.this.etxnt_8.setText("-");
                    }else if(gnt_8.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_8.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_8.setText(gnt_8);
                    }

                    if(gnt_9 == "null"){
                        DetailDataKMS.this.etxnt_9.setText("-");
                    } else if(gnt_9.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_9.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_9.setText(gnt_9);
                    }

                    if(gnt_10 == "null"){
                        DetailDataKMS.this.etxnt_10.setText("-");
                    }else if(gnt_10.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_10.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_10.setText(gnt_10);
                    }

                    if(gnt_11 == "null"){
                        DetailDataKMS.this.etxnt_11.setText("-");
                    }else if(gnt_11.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_11.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_11.setText(gnt_11);
                    }

                    if(gnt_12 == "null"){
                        DetailDataKMS.this.etxnt_12.setText("-");
                    }else if(gnt_12.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_12.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_12.setText(gnt_12);
                    }
                    if(gnt_13 == "null"){
                        DetailDataKMS.this.etxnt_13.setText("-");
                    }else if(gnt_13.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_13.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_13.setText(gnt_13);
                    }
                    if(gnt_14 == "null"){
                        DetailDataKMS.this.etxnt_14.setText("-");
                    }else if(gnt_14.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_14.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_14.setText(gnt_14);
                    }
                    if(gnt_15 == "null"){
                        DetailDataKMS.this.etxnt_15.setText("-");
                    }else if(gnt_15.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_15.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_15.setText(gnt_15);
                    }

                    if(gnt_16 == "null"){
                        DetailDataKMS.this.etxnt_16.setText("-");
                    }else if(gnt_16.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_16.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_16.setText(gnt_16);
                    }

                    if(gnt_17 == "null"){
                        DetailDataKMS.this.etxnt_17.setText("-");
                    }else if(gnt_17.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_17.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_17.setText(gnt_17);
                    }

                    if(gnt_18 == "null"){
                        DetailDataKMS.this.etxnt_18.setText("-");
                    }else if(gnt_18.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_18.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_18.setText(gnt_18);
                    }

                    if(gnt_19 == "null"){
                        DetailDataKMS.this.etxnt_19.setText("-");
                    }else if(gnt_19.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_19.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_19.setText(gnt_19);
                    }

                    if(gnt_20 == "null"){
                        DetailDataKMS.this.etxnt_20.setText("-");
                    }else if(gnt_20.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_20.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_20.setText(gnt_20);
                    }

                    if(gnt_21 == "null"){
                        DetailDataKMS.this.etxnt_21.setText("-");
                    }else if(gnt_21.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_21.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_21.setText(gnt_21);
                    }

                    if(gnt_22 == "null"){
                        DetailDataKMS.this.etxnt_22.setText("-");
                    }else if(gnt_22.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_22.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_22.setText(gnt_22);
                    }
                    if(gnt_23 == "null"){
                        DetailDataKMS.this.etxnt_23.setText("-");
                    }else if(gnt_23.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_23.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_23.setText(gnt_23);
                    }
                    if(gnt_24 == "null"){
                        DetailDataKMS.this.etxnt_24.setText("-");
                    }else if(gnt_24.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_24.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_24.setText(gnt_24);
                    }
                    if(gnt_25 == "null"){
                        DetailDataKMS.this.etxnt_25.setText("-");
                    }else if(gnt_25.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_25.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_25.setText(gnt_25);
                    }

                    if(gnt_26 == "null"){
                        DetailDataKMS.this.etxnt_26.setText("-");
                    }else if(gnt_26.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_26.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_26.setText(gnt_26);
                    }

                    if(gnt_27 == "null"){
                        DetailDataKMS.this.etxnt_27.setText("-");
                    }else if(gnt_27.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_27.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_27.setText(gnt_27);
                    }

                    if(gnt_28 == "null"){
                        DetailDataKMS.this.etxnt_28.setText("-");
                    }else if(gnt_28.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_28.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_28.setText(gnt_28);
                    }

                    if(gnt_29 == "null"){
                        DetailDataKMS.this.etxnt_29.setText("-");
                    }else if(gnt_29.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_29.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_29.setText(gnt_29);
                    }

                    if(gnt_30 == "null"){
                        DetailDataKMS.this.etxnt_30.setText("-");
                    }else if(gnt_30.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_30.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_30.setText(gnt_30);
                    }

                    if(gnt_31 == "null"){
                        DetailDataKMS.this.etxnt_31.setText("-");
                    }else if(gnt_31.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_31.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_31.setText(gnt_31);
                    }

                    if(gnt_33 == "null"){
                        DetailDataKMS.this.etxnt_33.setText("-");
                    }else if(gnt_33.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_33.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_33.setText(gnt_33);
                    }
                    if(gnt_33 == "null"){
                        DetailDataKMS.this.etxnt_33.setText("-");
                    }else if(gnt_33.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_33.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_33.setText(gnt_33);
                    }
                    if(gnt_34 == "null"){
                        DetailDataKMS.this.etxnt_34.setText("-");
                    }else if(gnt_34.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_34.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_34.setText(gnt_34);
                    }
                    if(gnt_35 == "null"){
                        DetailDataKMS.this.etxnt_35.setText("-");
                    }else if(gnt_35.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_35.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_35.setText(gnt_35);
                    }

                    if(gnt_36 == "null"){
                        DetailDataKMS.this.etxnt_36.setText("-");
                    }else if(gnt_36.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_36.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_36.setText(gnt_36);
                    }

                    if(gnt_37 == "null"){
                        DetailDataKMS.this.etxnt_37.setText("-");
                    }else if(gnt_37.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_37.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_37.setText(gnt_37);
                    }

                    if(gnt_38 == "null"){
                        DetailDataKMS.this.etxnt_38.setText("-");
                    }else if(gnt_38.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_38.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_38.setText(gnt_38);
                    }

                    if(gnt_39 == "null"){
                        DetailDataKMS.this.etxnt_39.setText("-");
                    }else if(gnt_39.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_39.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_39.setText(gnt_39);
                    }

                    if(gnt_40 == "null"){
                        DetailDataKMS.this.etxnt_40.setText("-");
                    }else if(gnt_40.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_40.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_40.setText(gnt_40);
                    }

                    if(gnt_41 == "null"){
                        DetailDataKMS.this.etxnt_41.setText("-");
                    }else if(gnt_41.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_41.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_41.setText(gnt_41);
                    }

                    if(gnt_42 == "null"){
                        DetailDataKMS.this.etxnt_42.setText("-");
                    }else if(gnt_42.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_42.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_42.setText(gnt_42);
                    }
                    if(gnt_43 == "null"){
                        DetailDataKMS.this.etxnt_43.setText("-");
                    }else if(gnt_43.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_43.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_43.setText(gnt_43);
                    }
                    if(gnt_44 == "null"){
                        DetailDataKMS.this.etxnt_44.setText("-");
                    }else if(gnt_44.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_44.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_44.setText(gnt_44);
                    }
                    if(gnt_45 == "null"){
                        DetailDataKMS.this.etxnt_45.setText("-");
                    }else if(gnt_45.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_45.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_45.setText(gnt_45);
                    }

                    if(gnt_46 == "null"){
                        DetailDataKMS.this.etxnt_46.setText("-");
                    }else if(gnt_46.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_46.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_46.setText(gnt_46);
                    }

                    if(gnt_47 == "null"){
                        DetailDataKMS.this.etxnt_47.setText("-");
                    }else if(gnt_47.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_47.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_47.setText(gnt_47);
                    }

                    if(gnt_48 == "null"){
                        DetailDataKMS.this.etxnt_48.setText("-");
                    }else if(gnt_48.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_48.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_48.setText(gnt_48);
                    }

                    if(gnt_49 == "null"){
                        DetailDataKMS.this.etxnt_49.setText("-");
                    }else if(gnt_49.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_49.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_49.setText(gnt_49);
                    }
                    if(gnt_50 == "null"){
                        DetailDataKMS.this.etxnt_50.setText("-");
                    }else if(gnt_50.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_50.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_50.setText(gnt_50);
                    }
                    if(gnt_51 == "null"){
                        DetailDataKMS.this.etxnt_51.setText("-");
                    }else if(gnt_51.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_51.setText("-");
                    }else{
                        DetailDataKMS.this.etxnt_51.setText(gnt_51);
                    }

                    if(gnt_52 == "null"){
                        DetailDataKMS.this.etxnt_52.setText("-");
                    }else if(gnt_52.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_52.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_52.setText(gnt_52);
                    }
                    if(gnt_53 == "null"){
                        DetailDataKMS.this.etxnt_53.setText("-");
                    }else if(gnt_53.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_53.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_53.setText(gnt_53);
                    }
                    if(gnt_55 == "null"){
                        DetailDataKMS.this.etxnt_55.setText("-");
                    }else if(gnt_55.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_55.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_55.setText(gnt_55);
                    }
                    if(gnt_56 == "null"){
                        DetailDataKMS.this.etxnt_56.setText("-");
                    }else if(gnt_56.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_56.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_56.setText(gnt_56);
                    }

                    if(gnt_56 == "null"){
                        DetailDataKMS.this.etxnt_56.setText("-");
                    }else if(gnt_56.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_56.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_56.setText(gnt_56);
                    }

                    if(gnt_57 == "null"){
                        DetailDataKMS.this.etxnt_57.setText("-");
                    }else if(gnt_57.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_57.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_57.setText(gnt_57);
                    }

                    if(gnt_58 == "null"){
                        DetailDataKMS.this.etxnt_58.setText("-");
                    }else if(gnt_58.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_58.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_58.setText(gnt_58);
                    }

                    if(gnt_59 == "null"){
                        DetailDataKMS.this.etxnt_59.setText("-");
                    }else if(gnt_59.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_59.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_59.setText(gnt_59);
                    }
                    if(gnt_60 == "null"){
                        DetailDataKMS.this.etxnt_60.setText("-");
                    }else if(gnt_60.equals("01-01-1970")){
                        DetailDataKMS.this.etxnt_60.setText("-");
                    } else{
                        DetailDataKMS.this.etxnt_60.setText(gnt_60);
                    }

                    if(gasi_eksklusif_0 == "null"){
                        DetailDataKMS.this.etxasi_eksklusif_0.setText("-");
                    }else if(gasi_eksklusif_0.equals("01-01-1970")){
                        DetailDataKMS.this.etxasi_eksklusif_0.setText("-");
                    }
                    else{
                        DetailDataKMS.this.etxasi_eksklusif_0.setText(gasi_eksklusif_0);
                    }

                    if(gasi_eksklusif_1 == "null"){
                        DetailDataKMS.this.etxasi_eksklusif_1.setText("-");
                    }else if(gasi_eksklusif_1.equals("01-01-1970")){
                        DetailDataKMS.this.etxasi_eksklusif_1.setText("-");
                    } else{
                        DetailDataKMS.this.etxasi_eksklusif_1.setText(gasi_eksklusif_1);
                    }

                    if(gasi_eksklusif_2 == "null"){
                        DetailDataKMS.this.etxasi_eksklusif_2.setText("-");
                    } else if(gasi_eksklusif_2.equals("01-01-1970")){
                        DetailDataKMS.this.etxasi_eksklusif_2.setText("-");
                    }else{
                        DetailDataKMS.this.etxasi_eksklusif_2.setText(gasi_eksklusif_2);
                    }

                    if(gasi_eksklusif_3 == "null"){
                        DetailDataKMS.this.etxasi_eksklusif_3.setText("-");
                    }else if(gasi_eksklusif_3.equals("01-01-1970")){
                        DetailDataKMS.this.etxasi_eksklusif_3.setText("-");
                    } else{
                        DetailDataKMS.this.etxasi_eksklusif_3.setText(gasi_eksklusif_3);
                    }

                    if(gasi_eksklusif_4 == "null"){
                        DetailDataKMS.this.etxasi_eksklusif_4.setText("-");
                    }else if(gasi_eksklusif_4.equals("01-01-1970")){
                        DetailDataKMS.this.etxasi_eksklusif_4.setText("-");
                    } else{
                        DetailDataKMS.this.etxasi_eksklusif_4.setText(gasi_eksklusif_4);
                    }

                    if(gasi_eksklusif_5 == "null"){
                        DetailDataKMS.this.etxasi_eksklusif_5.setText("-");
                    }else if(gasi_eksklusif_5.equals("01-01-1970")){
                        DetailDataKMS.this.etxasi_eksklusif_5.setText("-");
                    } else{
                        DetailDataKMS.this.etxasi_eksklusif_5.setText(gasi_eksklusif_5);
                    }

                    if(gasi_eksklusif_6 == "null"){
                        DetailDataKMS.this.etxasi_eksklusif_6.setText("-");
                    }else if(gasi_eksklusif_6.equals("01-01-1970")){
                        DetailDataKMS.this.etxasi_eksklusif_6.setText("-");
                    }else{
                        DetailDataKMS.this.etxasi_eksklusif_6.setText(gasi_eksklusif_6);
                    }

                    DetailDataKMS.this.drawLineChart();
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
