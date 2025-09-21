package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.internal.view.SupportMenu;
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
import java.util.ArrayList;
import java.util.List;
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
    TextView nama_ibu;
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_data_kms);
        this.nama_anak = (TextView) findViewById(R.id.nama_anak);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.jenis_kelamin = (TextView) findViewById(R.id.jenis_kelamin);
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
        this.tvStatus_BB = (TextView) findViewById(R.id.status_berat_badan);
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
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailDataKMS.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(DetailDataKMS.this, HalamanLogin.class);
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
        this.nama_anak.setText(getIntent().getStringExtra("nama_anak"));
        this.anak_ke.setText(getIntent().getStringExtra("anak_ke"));
        this.jenis_kelamin.setText(getIntent().getStringExtra("jenis_kelamin"));
        if (getIntent().hasExtra("detail_data_kms")) {
            getData();
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint("RestrictedApi")
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
//                    DetailDataKMS.this.etxbulan_penimbangan_0.setText(gbulan_penimbangan_0);
//                    DetailDataKMS.this.etxbulan_penimbangan_1.setText(gbulan_penimbangan_1);
//                    DetailDataKMS.this.etxbulan_penimbangan_2.setText(gbulan_penimbangan_2);
//                    DetailDataKMS.this.etxbulan_penimbangan_3.setText(gbulan_penimbangan_3);
//                    DetailDataKMS.this.etxbulan_penimbangan_4.setText(gbulan_penimbangan_4);
//                    DetailDataKMS.this.etxbulan_penimbangan_5.setText(gbulan_penimbangan_5);
//                    DetailDataKMS.this.etxbulan_penimbangan_6.setText(gbulan_penimbangan_6);
//                    DetailDataKMS.this.etxbulan_penimbangan_7.setText(gbulan_penimbangan_7);
//                    DetailDataKMS.this.etxbulan_penimbangan_8.setText(gbulan_penimbangan_8);
//                    DetailDataKMS.this.etxbulan_penimbangan_9.setText(gbulan_penimbangan_9);
//                    DetailDataKMS.this.etxbulan_penimbangan_10.setText(gbulan_penimbangan_10);
//                    DetailDataKMS.this.etxbulan_penimbangan_11.setText(gbulan_penimbangan_11);
//                    String str = gbulan_penimbangan_0;
//                    String gbulan_penimbangan_122 = gbulan_penimbangan_12;
//                    DetailDataKMS.this.etxbulan_penimbangan_12.setText(gbulan_penimbangan_122);
//                    String str2 = gbulan_penimbangan_122;
//                    String gbulan_penimbangan_123 = gbulan_penimbangan_13;
//                    DetailDataKMS.this.etxbulan_penimbangan_13.setText(gbulan_penimbangan_123);
//                    String str3 = gbulan_penimbangan_123;
//                    String gbulan_penimbangan_132 = gbulan_penimbangan_14;
//                    DetailDataKMS.this.etxbulan_penimbangan_14.setText(gbulan_penimbangan_132);
//                    String str4 = gbulan_penimbangan_132;
//                    String gbulan_penimbangan_142 = gbulan_penimbangan_15;
//                    DetailDataKMS.this.etxbulan_penimbangan_15.setText(gbulan_penimbangan_142);
//                    String str5 = gbulan_penimbangan_142;
//                    String gbulan_penimbangan_162 = gbulan_penimbangan_16;
//                    DetailDataKMS.this.etxbulan_penimbangan_16.setText(gbulan_penimbangan_162);
//                    String str6 = gbulan_penimbangan_162;
//                    String gbulan_penimbangan_163 = gbulan_penimbangan_17;
//                    DetailDataKMS.this.etxbulan_penimbangan_17.setText(gbulan_penimbangan_163);
//                    String str7 = gbulan_penimbangan_163;
//                    String gbulan_penimbangan_172 = gbulan_penimbangan_18;
//                    DetailDataKMS.this.etxbulan_penimbangan_18.setText(gbulan_penimbangan_172);
//                    String str8 = gbulan_penimbangan_172;
//                    String gbulan_penimbangan_182 = gbulan_penimbangan_19;
//                    DetailDataKMS.this.etxbulan_penimbangan_19.setText(gbulan_penimbangan_182);
//                    String str9 = gbulan_penimbangan_182;
//                    String gbulan_penimbangan_202 = gbulan_penimbangan_20;
//                    DetailDataKMS.this.etxbulan_penimbangan_20.setText(gbulan_penimbangan_202);
//                    String str10 = gbulan_penimbangan_202;
//                    String gbulan_penimbangan_203 = gbulan_penimbangan_21;
//                    DetailDataKMS.this.etxbulan_penimbangan_21.setText(gbulan_penimbangan_203);
//                    String str11 = gbulan_penimbangan_203;
//                    String gbulan_penimbangan_212 = gbulan_penimbangan_22;
//                    DetailDataKMS.this.etxbulan_penimbangan_22.setText(gbulan_penimbangan_212);
//                    String str12 = gbulan_penimbangan_212;
//                    String gbulan_penimbangan_232 = gbulan_penimbangan_23;
//                    DetailDataKMS.this.etxbulan_penimbangan_23.setText(gbulan_penimbangan_232);
//                    String str13 = gbulan_penimbangan_232;
//                    String gbulan_penimbangan_233 = gbulan_penimbangan_24;
//                    DetailDataKMS.this.etxbulan_penimbangan_24.setText(gbulan_penimbangan_233);
//                    String str14 = gbulan_penimbangan_233;
//                    String gbulan_penimbangan_242 = gbulan_penimbangan_25;
//                    DetailDataKMS.this.etxbulan_penimbangan_25.setText(gbulan_penimbangan_242);
//                    String str15 = gbulan_penimbangan_242;
//                    String gbulan_penimbangan_252 = gbulan_penimbangan_26;
//                    DetailDataKMS.this.etxbulan_penimbangan_26.setText(gbulan_penimbangan_252);
//                    String str16 = gbulan_penimbangan_252;
//                    String gbulan_penimbangan_272 = gbulan_penimbangan_27;
//                    DetailDataKMS.this.etxbulan_penimbangan_27.setText(gbulan_penimbangan_272);
//                    String str17 = gbulan_penimbangan_272;
//                    String gbulan_penimbangan_273 = gbulan_penimbangan_28;
//                    DetailDataKMS.this.etxbulan_penimbangan_28.setText(gbulan_penimbangan_273);
//                    String str18 = gbulan_penimbangan_273;
//                    String gbulan_penimbangan_282 = gbulan_penimbangan_29;
//                    DetailDataKMS.this.etxbulan_penimbangan_29.setText(gbulan_penimbangan_282);
//                    String str19 = gbulan_penimbangan_282;
//                    String gbulan_penimbangan_302 = gbulan_penimbangan_30;
//                    DetailDataKMS.this.etxbulan_penimbangan_30.setText(gbulan_penimbangan_302);
//                    String str20 = gbulan_penimbangan_302;
//                    String gbulan_penimbangan_303 = gbulan_penimbangan_31;
//                    DetailDataKMS.this.etxbulan_penimbangan_31.setText(gbulan_penimbangan_303);
//                    String str21 = gbulan_penimbangan_303;
//                    String gbulan_penimbangan_312 = gbulan_penimbangan_32;
//                    DetailDataKMS.this.etxbulan_penimbangan_32.setText(gbulan_penimbangan_312);
//                    String str22 = gbulan_penimbangan_312;
//                    String gbulan_penimbangan_322 = gbulan_penimbangan_33;
//                    DetailDataKMS.this.etxbulan_penimbangan_33.setText(gbulan_penimbangan_322);
//                    String str23 = gbulan_penimbangan_322;
//                    String gbulan_penimbangan_342 = gbulan_penimbangan_34;
//                    DetailDataKMS.this.etxbulan_penimbangan_34.setText(gbulan_penimbangan_342);
//                    String str24 = gbulan_penimbangan_342;
//                    String gbulan_penimbangan_343 = gbulan_penimbangan_35;
//                    DetailDataKMS.this.etxbulan_penimbangan_35.setText(gbulan_penimbangan_343);
//                    String str25 = gbulan_penimbangan_343;
//                    String gbulan_penimbangan_352 = gbulan_penimbangan_36;
//                    DetailDataKMS.this.etxbulan_penimbangan_36.setText(gbulan_penimbangan_352);
//                    String str26 = gbulan_penimbangan_352;
//                    String gbulan_penimbangan_362 = gbulan_penimbangan_37;
//                    DetailDataKMS.this.etxbulan_penimbangan_37.setText(gbulan_penimbangan_362);
//                    String str27 = gbulan_penimbangan_362;
//                    String gbulan_penimbangan_382 = gbulan_penimbangan_38;
//                    DetailDataKMS.this.etxbulan_penimbangan_38.setText(gbulan_penimbangan_382);
//                    String str28 = gbulan_penimbangan_382;
//                    String gbulan_penimbangan_383 = gbulan_penimbangan_39;
//                    DetailDataKMS.this.etxbulan_penimbangan_39.setText(gbulan_penimbangan_383);
//                    String str29 = gbulan_penimbangan_383;
//                    String gbulan_penimbangan_392 = gbulan_penimbangan_40;
//                    DetailDataKMS.this.etxbulan_penimbangan_40.setText(gbulan_penimbangan_392);
//                    String str30 = gbulan_penimbangan_392;
//                    String gbulan_penimbangan_412 = gbulan_penimbangan_41;
//                    DetailDataKMS.this.etxbulan_penimbangan_41.setText(gbulan_penimbangan_412);
//                    String str31 = gbulan_penimbangan_412;
//                    String gbulan_penimbangan_413 = gbulan_penimbangan_42;
//                    DetailDataKMS.this.etxbulan_penimbangan_42.setText(gbulan_penimbangan_413);
//                    String str32 = gbulan_penimbangan_413;
//                    String gbulan_penimbangan_422 = gbulan_penimbangan_43;
//                    DetailDataKMS.this.etxbulan_penimbangan_43.setText(gbulan_penimbangan_422);
//                    String str33 = gbulan_penimbangan_422;
//                    String gbulan_penimbangan_432 = gbulan_penimbangan_44;
//                    DetailDataKMS.this.etxbulan_penimbangan_44.setText(gbulan_penimbangan_432);
//                    String str34 = gbulan_penimbangan_432;
//                    String gbulan_penimbangan_452 = gbulan_penimbangan_45;
//                    DetailDataKMS.this.etxbulan_penimbangan_45.setText(gbulan_penimbangan_452);
//                    String str35 = gbulan_penimbangan_452;
//                    String gbulan_penimbangan_453 = gbulan_penimbangan_46;
//                    DetailDataKMS.this.etxbulan_penimbangan_46.setText(gbulan_penimbangan_453);
//                    String str36 = gbulan_penimbangan_453;
//                    String gbulan_penimbangan_462 = gbulan_penimbangan_47;
//                    DetailDataKMS.this.etxbulan_penimbangan_47.setText(gbulan_penimbangan_462);
//                    String str37 = gbulan_penimbangan_462;
//                    String gbulan_penimbangan_472 = gbulan_penimbangan_48;
//                    DetailDataKMS.this.etxbulan_penimbangan_48.setText(gbulan_penimbangan_472);
//                    String str38 = gbulan_penimbangan_472;
//                    String gbulan_penimbangan_492 = gbulan_penimbangan_49;
//                    DetailDataKMS.this.etxbulan_penimbangan_49.setText(gbulan_penimbangan_492);
//                    String str39 = gbulan_penimbangan_492;
//                    String gbulan_penimbangan_493 = gbulan_penimbangan_50;
//                    DetailDataKMS.this.etxbulan_penimbangan_50.setText(gbulan_penimbangan_493);
//                    String str40 = gbulan_penimbangan_493;
//                    String gbulan_penimbangan_502 = gbulan_penimbangan_51;
//                    DetailDataKMS.this.etxbulan_penimbangan_51.setText(gbulan_penimbangan_502);
//                    String str41 = gbulan_penimbangan_502;
//                    String gbulan_penimbangan_522 = gbulan_penimbangan_52;
//                    DetailDataKMS.this.etxbulan_penimbangan_52.setText(gbulan_penimbangan_522);
//                    String str42 = gbulan_penimbangan_522;
//                    String gbulan_penimbangan_523 = gbulan_penimbangan_53;
//                    DetailDataKMS.this.etxbulan_penimbangan_53.setText(gbulan_penimbangan_523);
//                    String str43 = gbulan_penimbangan_523;
//                    String gbulan_penimbangan_532 = gbulan_penimbangan_54;
//                    DetailDataKMS.this.etxbulan_penimbangan_54.setText(gbulan_penimbangan_532);
//                    String str44 = gbulan_penimbangan_532;
//                    String gbulan_penimbangan_542 = gbulan_penimbangan_55;
//                    DetailDataKMS.this.etxbulan_penimbangan_55.setText(gbulan_penimbangan_542);
//                    String str45 = gbulan_penimbangan_542;
//                    String gbulan_penimbangan_562 = gbulan_penimbangan_56;
//                    DetailDataKMS.this.etxbulan_penimbangan_56.setText(gbulan_penimbangan_562);
//                    String str46 = gbulan_penimbangan_562;
//                    String gbulan_penimbangan_563 = gbulan_penimbangan_57;
//                    DetailDataKMS.this.etxbulan_penimbangan_57.setText(gbulan_penimbangan_563);
//                    String str47 = gbulan_penimbangan_563;
//                    String gbulan_penimbangan_572 = gbulan_penimbangan_58;
//                    DetailDataKMS.this.etxbulan_penimbangan_58.setText(gbulan_penimbangan_572);
//                    String str48 = gbulan_penimbangan_572;
//                    String gbulan_penimbangan_582 = gbulan_penimbangan_59;
//                    DetailDataKMS.this.etxbulan_penimbangan_59.setText(gbulan_penimbangan_582);
//                    String str49 = gbulan_penimbangan_582;
//                    String gbulan_penimbangan_602 = gbulan_penimbangan_60;
//                    DetailDataKMS.this.etxbulan_penimbangan_60.setText(gbulan_penimbangan_602);
//                    String str50 = gbulan_penimbangan_602;
//                    DetailDataKMS.this.etxbb_0.setText(DetailDataKMS.gbb_0);
//                    DetailDataKMS.this.etxbb_1.setText(DetailDataKMS.gbb_1);
//                    DetailDataKMS.this.etxbb_2.setText(DetailDataKMS.gbb_2);
//                    DetailDataKMS.this.etxbb_3.setText(DetailDataKMS.gbb_3);
//                    DetailDataKMS.this.etxbb_4.setText(DetailDataKMS.gbb_4);
//                    DetailDataKMS.this.etxbb_5.setText(DetailDataKMS.gbb_5);
//                    DetailDataKMS.this.etxbb_6.setText(DetailDataKMS.gbb_6);
//                    DetailDataKMS.this.etxbb_7.setText(DetailDataKMS.gbb_7);
//                    DetailDataKMS.this.etxbb_8.setText(DetailDataKMS.gbb_8);
//                    DetailDataKMS.this.etxbb_9.setText(DetailDataKMS.gbb_9);
//                    DetailDataKMS.this.etxbb_10.setText(DetailDataKMS.gbb_10);
//                    DetailDataKMS.this.etxbb_11.setText(DetailDataKMS.gbb_11);
//                    DetailDataKMS.this.etxbb_12.setText(DetailDataKMS.gbb_12);
//                    DetailDataKMS.this.etxbb_13.setText(DetailDataKMS.gbb_13);
//                    DetailDataKMS.this.etxbb_14.setText(DetailDataKMS.gbb_14);
//                    DetailDataKMS.this.etxbb_15.setText(DetailDataKMS.gbb_15);
//                    DetailDataKMS.this.etxbb_16.setText(DetailDataKMS.gbb_16);
//                    DetailDataKMS.this.etxbb_17.setText(DetailDataKMS.gbb_17);
//                    DetailDataKMS.this.etxbb_18.setText(DetailDataKMS.gbb_18);
//                    DetailDataKMS.this.etxbb_19.setText(DetailDataKMS.gbb_19);
//                    DetailDataKMS.this.etxbb_20.setText(DetailDataKMS.gbb_20);
//                    DetailDataKMS.this.etxbb_21.setText(DetailDataKMS.gbb_21);
//                    DetailDataKMS.this.etxbb_22.setText(DetailDataKMS.gbb_22);
//                    DetailDataKMS.this.etxbb_23.setText(DetailDataKMS.gbb_23);
//                    DetailDataKMS.this.etxbb_24.setText(DetailDataKMS.gbb_24);
//                    DetailDataKMS.this.etxbb_25.setText(DetailDataKMS.gbb_25);
//                    DetailDataKMS.this.etxbb_26.setText(DetailDataKMS.gbb_26);
//                    DetailDataKMS.this.etxbb_27.setText(DetailDataKMS.gbb_27);
//                    DetailDataKMS.this.etxbb_28.setText(DetailDataKMS.gbb_28);
//                    DetailDataKMS.this.etxbb_29.setText(DetailDataKMS.gbb_29);
//                    DetailDataKMS.this.etxbb_30.setText(DetailDataKMS.gbb_30);
//                    DetailDataKMS.this.etxbb_31.setText(DetailDataKMS.gbb_31);
//                    DetailDataKMS.this.etxbb_32.setText(DetailDataKMS.gbb_32);
//                    DetailDataKMS.this.etxbb_33.setText(DetailDataKMS.gbb_33);
//                    DetailDataKMS.this.etxbb_34.setText(DetailDataKMS.gbb_34);
//                    DetailDataKMS.this.etxbb_35.setText(DetailDataKMS.gbb_35);
//                    DetailDataKMS.this.etxbb_36.setText(DetailDataKMS.gbb_36);
//                    DetailDataKMS.this.etxbb_37.setText(DetailDataKMS.gbb_37);
//                    DetailDataKMS.this.etxbb_38.setText(DetailDataKMS.gbb_38);
//                    DetailDataKMS.this.etxbb_39.setText(DetailDataKMS.gbb_39);
//                    DetailDataKMS.this.etxbb_40.setText(DetailDataKMS.gbb_40);
//                    DetailDataKMS.this.etxbb_41.setText(DetailDataKMS.gbb_41);
//                    DetailDataKMS.this.etxbb_42.setText(DetailDataKMS.gbb_42);
//                    DetailDataKMS.this.etxbb_43.setText(DetailDataKMS.gbb_43);
//                    DetailDataKMS.this.etxbb_44.setText(DetailDataKMS.gbb_44);
//                    DetailDataKMS.this.etxbb_45.setText(DetailDataKMS.gbb_45);
//                    DetailDataKMS.this.etxbb_46.setText(DetailDataKMS.gbb_46);
//                    DetailDataKMS.this.etxbb_47.setText(DetailDataKMS.gbb_47);
//                    DetailDataKMS.this.etxbb_48.setText(DetailDataKMS.gbb_48);
//                    DetailDataKMS.this.etxbb_49.setText(DetailDataKMS.gbb_49);
//                    DetailDataKMS.this.etxbb_50.setText(DetailDataKMS.gbb_50);
//                    DetailDataKMS.this.etxbb_51.setText(DetailDataKMS.gbb_51);
//                    DetailDataKMS.this.etxbb_52.setText(DetailDataKMS.gbb_52);
//                    DetailDataKMS.this.etxbb_53.setText(DetailDataKMS.gbb_53);
//                    DetailDataKMS.this.etxbb_54.setText(DetailDataKMS.gbb_54);
//                    DetailDataKMS.this.etxbb_55.setText(DetailDataKMS.gbb_55);
//                    DetailDataKMS.this.etxbb_56.setText(DetailDataKMS.gbb_56);
//                    DetailDataKMS.this.etxbb_57.setText(DetailDataKMS.gbb_57);
//                    DetailDataKMS.this.etxbb_58.setText(DetailDataKMS.gbb_58);
//                    DetailDataKMS.this.etxbb_59.setText(DetailDataKMS.gbb_59);
//                    DetailDataKMS.this.etxbb_60.setText(DetailDataKMS.gbb_60);
//                    String gnt_02 = gnt_0;
//                    DetailDataKMS.this.etxnt_0.setText(gnt_02);
//                    String str51 = gnt_02;
//                    String gnt_03 = gnt_1;
//                    DetailDataKMS.this.etxnt_1.setText(gnt_03);
//                    String str52 = gnt_03;
//                    String gnt_210 = gnt_2;
//                    DetailDataKMS.this.etxnt_2.setText(gnt_210);
//                    String str53 = gnt_210;
//                    String gnt_211 = gnt_3;
//                    DetailDataKMS.this.etxnt_3.setText(gnt_211);
//                    String str54 = gnt_211;
//                    String gnt_310 = gnt_4;
//                    DetailDataKMS.this.etxnt_4.setText(gnt_310);
//                    String str55 = gnt_310;
//                    String gnt_410 = gnt_5;
//                    DetailDataKMS.this.etxnt_5.setText(gnt_410);
//                    String str56 = gnt_410;
//                    String gnt_62 = gnt_6;
//                    DetailDataKMS.this.etxnt_6.setText(gnt_62);
//                    String str57 = gnt_62;
//                    String gnt_63 = gnt_7;
//                    DetailDataKMS.this.etxnt_7.setText(gnt_63);
//                    String str58 = gnt_63;
//                    String gnt_72 = gnt_8;
//                    DetailDataKMS.this.etxnt_8.setText(gnt_72);
//                    String str59 = gnt_72;
//                    String gnt_82 = gnt_9;
//                    DetailDataKMS.this.etxnt_9.setText(gnt_82);
//                    String str60 = gnt_82;
//                    String gnt_102 = gnt_10;
//                    DetailDataKMS.this.etxnt_10.setText(gnt_102);
//                    String str61 = gnt_102;
//                    String gnt_112 = gnt_11;
//                    DetailDataKMS.this.etxnt_11.setText(gnt_112);
//                    String str62 = gnt_112;
//                    String gnt_122 = gnt_12;
//                    DetailDataKMS.this.etxnt_12.setText(gnt_122);
//                    String str63 = gnt_122;
//                    String gnt_123 = gnt_13;
//                    DetailDataKMS.this.etxnt_13.setText(gnt_123);
//                    String str64 = gnt_123;
//                    String gnt_142 = gnt_14;
//                    DetailDataKMS.this.etxnt_14.setText(gnt_142);
//                    String str65 = gnt_142;
//                    String gnt_152 = gnt_15;
//                    DetailDataKMS.this.etxnt_15.setText(gnt_152);
//                    String str66 = gnt_152;
//                    String gnt_162 = gnt_16;
//                    DetailDataKMS.this.etxnt_16.setText(gnt_162);
//                    String str67 = gnt_162;
//                    String gnt_163 = gnt_17;
//                    DetailDataKMS.this.etxnt_17.setText(gnt_163);
//                    String str68 = gnt_163;
//                    String gnt_182 = gnt_18;
//                    DetailDataKMS.this.etxnt_18.setText(gnt_182);
//                    String str69 = gnt_182;
//                    String gnt_192 = gnt_19;
//                    DetailDataKMS.this.etxnt_19.setText(gnt_192);
//                    String str70 = gnt_192;
//                    String gnt_193 = gnt_20;
//                    DetailDataKMS.this.etxnt_20.setText(gnt_193);
//                    String str71 = gnt_193;
//                    String gnt_212 = gnt_21;
//                    DetailDataKMS.this.etxnt_21.setText(gnt_212);
//                    String str72 = gnt_212;
//                    String gnt_222 = gnt_22;
//                    DetailDataKMS.this.etxnt_22.setText(gnt_222);
//                    String str73 = gnt_222;
//                    String gnt_232 = gnt_23;
//                    DetailDataKMS.this.etxnt_23.setText(gnt_232);
//                    String str74 = gnt_232;
//                    String gnt_233 = gnt_24;
//                    DetailDataKMS.this.etxnt_24.setText(gnt_233);
//                    String str75 = gnt_233;
//                    String gnt_252 = gnt_25;
//                    DetailDataKMS.this.etxnt_25.setText(gnt_252);
//                    String str76 = gnt_252;
//                    String gnt_262 = gnt_26;
//                    DetailDataKMS.this.etxnt_26.setText(gnt_262);
//                    String str77 = gnt_262;
//                    String gnt_272 = gnt_27;
//                    DetailDataKMS.this.etxnt_27.setText(gnt_272);
//                    String str78 = gnt_272;
//                    String gnt_273 = gnt_28;
//                    DetailDataKMS.this.etxnt_28.setText(gnt_273);
//                    String str79 = gnt_273;
//                    String gnt_292 = gnt_29;
//                    DetailDataKMS.this.etxnt_29.setText(gnt_292);
//                    String str80 = gnt_292;
//                    String gnt_302 = gnt_30;
//                    DetailDataKMS.this.etxnt_30.setText(gnt_302);
//                    String str81 = gnt_302;
//                    String gnt_303 = gnt_31;
//                    DetailDataKMS.this.etxnt_31.setText(gnt_303);
//                    String str82 = gnt_303;
//                    String gnt_322 = gnt_32;
//                    DetailDataKMS.this.etxnt_32.setText(gnt_322);
//                    String str83 = gnt_322;
//                    String gnt_332 = gnt_33;
//                    DetailDataKMS.this.etxnt_33.setText(gnt_332);
//                    String str84 = gnt_332;
//                    String gnt_342 = gnt_34;
//                    DetailDataKMS.this.etxnt_34.setText(gnt_342);
//                    String str85 = gnt_342;
//                    String gnt_343 = gnt_35;
//                    DetailDataKMS.this.etxnt_35.setText(gnt_343);
//                    String str86 = gnt_343;
//                    String gnt_362 = gnt_36;
//                    DetailDataKMS.this.etxnt_36.setText(gnt_362);
//                    String str87 = gnt_362;
//                    String gnt_372 = gnt_37;
//                    DetailDataKMS.this.etxnt_37.setText(gnt_372);
//                    String str88 = gnt_372;
//                    String gnt_382 = gnt_38;
//                    DetailDataKMS.this.etxnt_38.setText(gnt_382);
//                    String str89 = gnt_382;
//                    String gnt_383 = gnt_39;
//                    DetailDataKMS.this.etxnt_39.setText(gnt_383);
//                    String str90 = gnt_383;
//                    String gnt_402 = gnt_40;
//                    DetailDataKMS.this.etxnt_40.setText(gnt_402);
//                    String str91 = gnt_402;
//                    String gnt_412 = gnt_41;
//                    DetailDataKMS.this.etxnt_41.setText(gnt_412);
//                    String str92 = gnt_412;
//                    String gnt_413 = gnt_42;
//                    DetailDataKMS.this.etxnt_42.setText(gnt_413);
//                    String str93 = gnt_413;
//                    String gnt_432 = gnt_43;
//                    DetailDataKMS.this.etxnt_43.setText(gnt_432);
//                    String str94 = gnt_432;
//                    String gnt_442 = gnt_44;
//                    DetailDataKMS.this.etxnt_44.setText(gnt_442);
//                    String str95 = gnt_442;
//                    String gnt_452 = gnt_45;
//                    DetailDataKMS.this.etxnt_45.setText(gnt_452);
//                    String str96 = gnt_452;
//                    String gnt_453 = gnt_46;
//                    DetailDataKMS.this.etxnt_46.setText(gnt_453);
//                    String str97 = gnt_453;
//                    String gnt_472 = gnt_47;
//                    DetailDataKMS.this.etxnt_47.setText(gnt_472);
//                    String str98 = gnt_472;
//                    String gnt_482 = gnt_48;
//                    DetailDataKMS.this.etxnt_48.setText(gnt_482);
//                    String str99 = gnt_482;
//                    String gnt_492 = gnt_49;
//                    DetailDataKMS.this.etxnt_49.setText(gnt_492);
//                    String str100 = gnt_492;
//                    String gnt_493 = gnt_50;
//                    DetailDataKMS.this.etxnt_50.setText(gnt_493);
//                    String str101 = gnt_493;
//                    String gnt_512 = gnt_51;
//                    DetailDataKMS.this.etxnt_51.setText(gnt_512);
//                    String str102 = gnt_512;
//                    String gnt_522 = gnt_52;
//                    DetailDataKMS.this.etxnt_52.setText(gnt_522);
//                    String str103 = gnt_522;
//                    String gnt_523 = gnt_53;
//                    DetailDataKMS.this.etxnt_53.setText(gnt_523);
//                    String str104 = gnt_523;
//                    String gnt_542 = gnt_54;
//                    DetailDataKMS.this.etxnt_54.setText(gnt_542);
//                    String str105 = gnt_542;
//                    String gnt_552 = gnt_55;
//                    DetailDataKMS.this.etxnt_55.setText(gnt_552);
//                    String str106 = gnt_552;
//                    String gnt_562 = gnt_56;
//                    DetailDataKMS.this.etxnt_56.setText(gnt_562);
//                    String str107 = gnt_562;
//                    String gnt_563 = gnt_57;
//                    DetailDataKMS.this.etxnt_57.setText(gnt_563);
//                    String str108 = gnt_563;
//                    String gnt_582 = gnt_58;
//                    DetailDataKMS.this.etxnt_58.setText(gnt_582);
//                    String str109 = gnt_582;
//                    String gnt_592 = gnt_59;
//                    DetailDataKMS.this.etxnt_59.setText(gnt_592);
//                    String str110 = gnt_592;
//                    String gnt_593 = gnt_60;
//                    DetailDataKMS.this.etxnt_60.setText(gnt_593);
//                    String str111 = gnt_593;
//                    String gasi_eksklusif_02 = gasi_eksklusif_0;
//                    DetailDataKMS.this.etxasi_eksklusif_0.setText(gasi_eksklusif_02);
//                    String str112 = gasi_eksklusif_02;
//                    String gasi_eksklusif_03 = gasi_eksklusif_1;
//                    DetailDataKMS.this.etxasi_eksklusif_1.setText(gasi_eksklusif_03);
//                    String str113 = gasi_eksklusif_03;
//                    String gasi_eksklusif_12 = gasi_eksklusif_2;
//                    DetailDataKMS.this.etxasi_eksklusif_2.setText(gasi_eksklusif_12);
//                    String str114 = gasi_eksklusif_12;
//                    String gasi_eksklusif_32 = gasi_eksklusif_3;
//                    DetailDataKMS.this.etxasi_eksklusif_3.setText(gasi_eksklusif_32);
//                    String str115 = gasi_eksklusif_32;
//                    String gasi_eksklusif_33 = gasi_eksklusif_4;
//                    DetailDataKMS.this.etxasi_eksklusif_4.setText(gasi_eksklusif_33);
//                    String str116 = gasi_eksklusif_33;
//                    DetailDataKMS.this.etxasi_eksklusif_5.setText(gasi_eksklusif_5);
//                    DetailDataKMS.this.etxasi_eksklusif_6.setText(gasi_eksklusif_6);
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
}
