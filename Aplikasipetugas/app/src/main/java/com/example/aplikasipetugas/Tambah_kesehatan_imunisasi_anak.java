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

public class Tambah_kesehatan_imunisasi_anak extends AppCompatActivity {
    public static String item1;
    public static String item2;
    TextView anak_ke;
    Button btnbatal;
    Button btnsimpan;
    ImageView butonlogout;
    EditText etxbcg_0;
    EditText etxbcg_1;
    EditText etxbcg_10;
    EditText etxbcg_11;
    EditText etxbcg_12;
    EditText etxbcg_2;
    EditText etxbcg_3;
    EditText etxbcg_4;
    EditText etxbcg_5;
    EditText etxbcg_6;
    EditText etxbcg_7;
    EditText etxbcg_8;
    EditText etxbcg_9;
    EditText etxdan_lain_lain_0;
    EditText etxdan_lain_lain_1;
    EditText etxdan_lain_lain_10;
    EditText etxdan_lain_lain_11;
    EditText etxdan_lain_lain_12;
    EditText etxdan_lain_lain_2;
    EditText etxdan_lain_lain_3;
    EditText etxdan_lain_lain_4;
    EditText etxdan_lain_lain_5;
    EditText etxdan_lain_lain_6;
    EditText etxdan_lain_lain_7;
    EditText etxdan_lain_lain_8;
    EditText etxdan_lain_lain_9;
    EditText etxhepatitis_0;
    EditText etxhepatitis_1;
    EditText etxhepatitis_10;
    EditText etxhepatitis_11;
    EditText etxhepatitis_12;
    EditText etxhepatitis_2;
    EditText etxhepatitis_3;
    EditText etxhepatitis_4;
    EditText etxhepatitis_5;
    EditText etxhepatitis_6;
    EditText etxhepatitis_7;
    EditText etxhepatitis_8;
    EditText etxhepatitis_9;
    EditText etxpolio_tetes_0;
    EditText etxpolio_tetes_1;
    EditText etxpolio_tetes_10;
    EditText etxpolio_tetes_11;
    EditText etxpolio_tetes_12;
    EditText etxpolio_tetes_2;
    EditText etxpolio_tetes_3;
    EditText etxpolio_tetes_4;
    EditText etxpolio_tetes_5;
    EditText etxpolio_tetes_6;
    EditText etxpolio_tetes_7;
    EditText etxpolio_tetes_8;
    EditText etxpolio_tetes_9;
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
        setContentView((int) R.layout.activity_tambah_kesehatan_imunisasi_anak);
        dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.btnsimpan = (Button) findViewById(R.id.btnsimpan);
        this.btnbatal = (Button) findViewById(R.id.btnbatal);
        this.spinnernik_ibu = (Spinner) findViewById(R.id.spinnernik_ibu);
        this.spinnernama_anak = (Spinner) findViewById(R.id.spinnernama_anak);
        this.nama_ibu1 = (TextView) findViewById(R.id.nama_ibuku);
        this.nama_ayah = (TextView) findViewById(R.id.nama_ayah);
        this.anak_ke = (TextView) findViewById(R.id.anak_ke);
        this.etxhepatitis_0 = (EditText) findViewById(R.id.etxhepatitis_0);
        this.etxhepatitis_1 = (EditText) findViewById(R.id.etxhepatitis_1);
        this.etxhepatitis_2 = (EditText) findViewById(R.id.etxhepatitis_2);
        this.etxhepatitis_3 = (EditText) findViewById(R.id.etxhepatitis_3);
        this.etxhepatitis_4 = (EditText) findViewById(R.id.etxhepatitis_4);
        this.etxhepatitis_5 = (EditText) findViewById(R.id.etxhepatitis_5);
        this.etxhepatitis_6 = (EditText) findViewById(R.id.etxhepatitis_6);
        this.etxhepatitis_7 = (EditText) findViewById(R.id.etxhepatitis_7);
        this.etxhepatitis_8 = (EditText) findViewById(R.id.etxhepatitis_8);
        this.etxhepatitis_9 = (EditText) findViewById(R.id.etxhepatitis_9);
        this.etxhepatitis_10 = (EditText) findViewById(R.id.etxhepatitis_10);
        this.etxhepatitis_11 = (EditText) findViewById(R.id.etxhepatitis_11);
        this.etxhepatitis_12 = (EditText) findViewById(R.id.etxhepatitis_12);
        this.etxbcg_0 = (EditText) findViewById(R.id.etxbcg_0);
        this.etxbcg_1 = (EditText) findViewById(R.id.etxbcg_1);
        this.etxbcg_2 = (EditText) findViewById(R.id.etxbcg_2);
        this.etxbcg_3 = (EditText) findViewById(R.id.etxbcg_3);
        this.etxbcg_4 = (EditText) findViewById(R.id.etxbcg_4);
        this.etxbcg_5 = (EditText) findViewById(R.id.etxbcg_5);
        this.etxbcg_6 = (EditText) findViewById(R.id.etxbcg_6);
        this.etxbcg_7 = (EditText) findViewById(R.id.etxbcg_7);
        this.etxbcg_8 = (EditText) findViewById(R.id.etxbcg_8);
        this.etxbcg_9 = (EditText) findViewById(R.id.etxbcg_9);
        this.etxbcg_10 = (EditText) findViewById(R.id.etxbcg_10);
        this.etxbcg_11 = (EditText) findViewById(R.id.etxbcg_11);
        this.etxbcg_12 = (EditText) findViewById(R.id.etxbcg_12);
        this.etxpolio_tetes_0 = (EditText) findViewById(R.id.etxpolio_tetes_0);
        this.etxpolio_tetes_1 = (EditText) findViewById(R.id.etxpolio_tetes_1);
        this.etxpolio_tetes_2 = (EditText) findViewById(R.id.etxpolio_tetes_2);
        this.etxpolio_tetes_3 = (EditText) findViewById(R.id.etxpolio_tetes_3);
        this.etxpolio_tetes_4 = (EditText) findViewById(R.id.etxpolio_tetes_4);
        this.etxpolio_tetes_5 = (EditText) findViewById(R.id.etxpolio_tetes_5);
        this.etxpolio_tetes_6 = (EditText) findViewById(R.id.etxpolio_tetes_6);
        this.etxpolio_tetes_7 = (EditText) findViewById(R.id.etxpolio_tetes_7);
        this.etxpolio_tetes_8 = (EditText) findViewById(R.id.etxpolio_tetes_8);
        this.etxpolio_tetes_9 = (EditText) findViewById(R.id.etxpolio_tetes_9);
        this.etxpolio_tetes_10 = (EditText) findViewById(R.id.etxpolio_tetes_10);
        this.etxpolio_tetes_11 = (EditText) findViewById(R.id.etxpolio_tetes_11);
        this.etxpolio_tetes_12 = (EditText) findViewById(R.id.etxpolio_tetes_12);
        this.etxdan_lain_lain_0 = (EditText) findViewById(R.id.etxdan_lain_lain_0);
        this.etxdan_lain_lain_1 = (EditText) findViewById(R.id.etxdan_lain_lain_1);
        this.etxdan_lain_lain_2 = (EditText) findViewById(R.id.etxdan_lain_lain_2);
        this.etxdan_lain_lain_3 = (EditText) findViewById(R.id.etxdan_lain_lain_3);
        this.etxdan_lain_lain_4 = (EditText) findViewById(R.id.etxdan_lain_lain_4);
        this.etxdan_lain_lain_5 = (EditText) findViewById(R.id.etxdan_lain_lain_5);
        this.etxdan_lain_lain_6 = (EditText) findViewById(R.id.etxdan_lain_lain_6);
        this.etxdan_lain_lain_7 = (EditText) findViewById(R.id.etxdan_lain_lain_7);
        this.etxdan_lain_lain_8 = (EditText) findViewById(R.id.etxdan_lain_lain_8);
        this.etxdan_lain_lain_9 = (EditText) findViewById(R.id.etxdan_lain_lain_9);
        this.etxdan_lain_lain_10 = (EditText) findViewById(R.id.etxdan_lain_lain_10);
        this.etxdan_lain_lain_11 = (EditText) findViewById(R.id.etxdan_lain_lain_11);
        this.etxdan_lain_lain_12 = (EditText) findViewById(R.id.etxdan_lain_lain_12);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        TextView textView = (TextView) findViewById(R.id.tvNamapetugas);
        this.tvNamapetugas = textView;
        textView.setText(Halaman_Login.namapetugas);
        etxhepatitis_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog0();
            }
        });
        etxhepatitis_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });
        etxhepatitis_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog2();
            }
        });
        etxhepatitis_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog3();
            }
        });
        etxhepatitis_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog4();
            }
        });
        etxhepatitis_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog5();
            }
        });
        etxhepatitis_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog6();
            }
        });
        etxhepatitis_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog7();
            }
        });
        etxhepatitis_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog8();
            }
        });
        etxhepatitis_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog9();
            }
        });
        etxhepatitis_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog10();
            }
        });
        etxhepatitis_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog11();
            }
        });
        etxhepatitis_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog12();
            }
        });
        etxbcg_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog13();
            }
        });
        etxbcg_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog14();
            }
        });
        etxbcg_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog15();
            }
        });
        etxbcg_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog16();
            }
        });
        etxbcg_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog17();
            }
        });
        etxbcg_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog18();
            }
        });
        etxbcg_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog19();
            }
        });
        etxbcg_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog20();
            }
        });
        etxbcg_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog21();
            }
        });
        etxbcg_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog22();
            }
        });
        etxbcg_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog23();
            }
        });
        etxbcg_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog24();
            }
        });
        etxbcg_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog25();
            }
        });

        etxpolio_tetes_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog26();
            }
        });
        etxpolio_tetes_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog27();
            }
        });
        etxpolio_tetes_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog28();
            }
        });
        etxpolio_tetes_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog29();
            }
        });
        etxpolio_tetes_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog30();
            }
        });
        etxpolio_tetes_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog31();
            }
        });
        etxpolio_tetes_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog32();
            }
        });
        etxpolio_tetes_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog33();
            }
        });

        etxpolio_tetes_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog34();
            }
        });
        etxpolio_tetes_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog35();
            }
        });
        etxpolio_tetes_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog36();
            }
        });
        etxpolio_tetes_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog37();
            }
        });
        etxpolio_tetes_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog38();
            }
        });

        etxdan_lain_lain_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog39();
            }
        });
        etxdan_lain_lain_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog40();
            }
        });
        etxdan_lain_lain_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog41();
            }
        });
        etxdan_lain_lain_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog42();
            }
        });
        etxdan_lain_lain_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog43();
            }
        });
        etxdan_lain_lain_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog44();
            }
        });
        etxdan_lain_lain_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog45();
            }
        });
        etxdan_lain_lain_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog46();
            }
        });
        etxdan_lain_lain_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog47();
            }
        });
        etxdan_lain_lain_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog48();
            }
        });
        etxdan_lain_lain_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog49();
            }
        });
        etxdan_lain_lain_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog50();
            }
        });
        etxdan_lain_lain_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog51();
            }
        });
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_kesehatan_imunisasi_anak.this);
                builder.setMessage((CharSequence) "Yakin Ingin Logout ?");
                builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Halaman_Login.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(Tambah_kesehatan_imunisasi_anak.this, Halaman_Login.class);
                        intent.addFlags(268468224);
                        Tambah_kesehatan_imunisasi_anak.this.startActivity(intent);
                        Tambah_kesehatan_imunisasi_anak.this.finish();
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
                Tambah_kesehatan_imunisasi_anak.this.finish();
            }
        });
        list_nik();
        this.spinnernik_ibu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_kesehatan_imunisasi_anak.item1 = Tambah_kesehatan_imunisasi_anak.this.spinnernik_ibu.getSelectedItem().toString();
                Tambah_kesehatan_imunisasi_anak.this.list_namaanak.clear();
                Tambah_kesehatan_imunisasi_anak.this.tampilkannama();
                Tambah_kesehatan_imunisasi_anak.this.list_namaanakku();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnernama_anak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Tambah_kesehatan_imunisasi_anak.item2 = Tambah_kesehatan_imunisasi_anak.this.spinnernama_anak.getSelectedItem().toString();
                Tambah_kesehatan_imunisasi_anak.this.tampilkananakke();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.btnsimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (etxhepatitis_0.getText().toString().length() == 0) {
                    etxhepatitis_0.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_1.getText().toString().length() == 0) {
                    etxhepatitis_1.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_2.getText().toString().length() == 0) {
                    etxhepatitis_2.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_3.getText().toString().length() == 0) {
                    etxhepatitis_3.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_4.getText().toString().length() == 0) {
                    etxhepatitis_4.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_5.getText().toString().length() == 0) {
                    etxhepatitis_5.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_6.getText().toString().length() == 0) {
                    etxhepatitis_6.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_7.getText().toString().length() == 0) {
                    etxhepatitis_7.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_8.getText().toString().length() == 0) {
                    etxhepatitis_8.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_9.getText().toString().length() == 0) {
                    etxhepatitis_9.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_10.getText().toString().length() == 0) {
                    etxhepatitis_10.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_11.getText().toString().length() == 0) {
                    etxhepatitis_11.setError("Tidak Boleh Kosong");
                }
                if (etxhepatitis_12.getText().toString().length() == 0) {
                    etxhepatitis_12.setError("Tidak Boleh Kosong");
                }

                if (etxbcg_0.getText().toString().length() == 0) {
                    etxbcg_0.setError("Tidak Boleh Kosong");
                }

                if (etxbcg_1.getText().toString().length() == 0) {
                    etxbcg_1.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_2.getText().toString().length() == 0) {
                    etxbcg_2.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_3.getText().toString().length() == 0) {
                    etxbcg_3.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_4.getText().toString().length() == 0) {
                    etxbcg_4.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_5.getText().toString().length() == 0) {
                    etxbcg_5.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_6.getText().toString().length() == 0) {
                    etxbcg_6.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_7.getText().toString().length() == 0) {
                    etxbcg_7.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_8.getText().toString().length() == 0) {
                    etxbcg_8.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_9.getText().toString().length() == 0) {
                    etxbcg_9.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_10.getText().toString().length() == 0) {
                    etxbcg_10.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_11.getText().toString().length() == 0) {
                    etxbcg_11.setError("Tidak Boleh Kosong");
                }
                if (etxbcg_12.getText().toString().length() == 0) {
                    etxbcg_12.setError("Tidak Boleh Kosong");
                }

                if (etxpolio_tetes_0.getText().toString().length() == 0) {
                    etxpolio_tetes_0.setError("Tidak Boleh Kosong");
                }

                if (etxpolio_tetes_1.getText().toString().length() == 0) {
                    etxpolio_tetes_1.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_2.getText().toString().length() == 0) {
                    etxpolio_tetes_2.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_3.getText().toString().length() == 0) {
                    etxpolio_tetes_3.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_4.getText().toString().length() == 0) {
                    etxpolio_tetes_4.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_5.getText().toString().length() == 0) {
                    etxpolio_tetes_5.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_6.getText().toString().length() == 0) {
                    etxpolio_tetes_6.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_7.getText().toString().length() == 0) {
                    etxpolio_tetes_7.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_8.getText().toString().length() == 0) {
                    etxpolio_tetes_8.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_9.getText().toString().length() == 0) {
                    etxpolio_tetes_9.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_10.getText().toString().length() == 0) {
                    etxpolio_tetes_10.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_11.getText().toString().length() == 0) {
                    etxpolio_tetes_11.setError("Tidak Boleh Kosong");
                }
                if (etxpolio_tetes_12.getText().toString().length() == 0) {
                    etxpolio_tetes_12.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_0.getText().toString().length() == 0) {
                    etxdan_lain_lain_0.setError("Tidak Boleh Kosong");
                }

                if (etxdan_lain_lain_1.getText().toString().length() == 0) {
                    etxdan_lain_lain_1.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_2.getText().toString().length() == 0) {
                    etxdan_lain_lain_2.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_3.getText().toString().length() == 0) {
                    etxdan_lain_lain_3.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_4.getText().toString().length() == 0) {
                    etxdan_lain_lain_4.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_5.getText().toString().length() == 0) {
                    etxdan_lain_lain_5.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_6.getText().toString().length() == 0) {
                    etxdan_lain_lain_6.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_7.getText().toString().length() == 0) {
                    etxdan_lain_lain_7.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_8.getText().toString().length() == 0) {
                    etxdan_lain_lain_8.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_9.getText().toString().length() == 0) {
                    etxdan_lain_lain_9.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_10.getText().toString().length() == 0) {
                    etxdan_lain_lain_10.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_11.getText().toString().length() == 0) {
                    etxdan_lain_lain_11.setError("Tidak Boleh Kosong");
                }
                if (etxdan_lain_lain_12.getText().toString().length() == 0) {
                    etxdan_lain_lain_12.setError("Tidak Boleh Kosong");
                }
                Volley.newRequestQueue(Tambah_kesehatan_imunisasi_anak.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/imunisasianak", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Tambah_kesehatan_imunisasi_anak.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Tersimpan");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(), Kesehatan_imunisasi_anak.class));
                                        Tambah_kesehatan_imunisasi_anak.this.finish();
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
                        Toast.makeText(Tambah_kesehatan_imunisasi_anak.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nik_ibu", Tambah_kesehatan_imunisasi_anak.this.spinnernik_ibu.getSelectedItem().toString());
                        myParams.put("nama_ibu", Tambah_kesehatan_imunisasi_anak.this.nama_ibu1.getText().toString());
                        myParams.put("nama_ayah", Tambah_kesehatan_imunisasi_anak.this.nama_ayah.getText().toString());
                        myParams.put("nama_anak", Tambah_kesehatan_imunisasi_anak.this.spinnernama_anak.getSelectedItem().toString());
                        myParams.put("anak_ke", Tambah_kesehatan_imunisasi_anak.this.anak_ke.getText().toString());
                        myParams.put("hepatitis_0", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_0.getText().toString());
                        myParams.put("hepatitis_1", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_1.getText().toString());
                        myParams.put("hepatitis_2", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_2.getText().toString());
                        myParams.put("hepatitis_3", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_3.getText().toString());
                        myParams.put("hepatitis_4", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_4.getText().toString());
                        myParams.put("hepatitis_5", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_5.getText().toString());
                        myParams.put("hepatitis_6", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_6.getText().toString());
                        myParams.put("hepatitis_7", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_7.getText().toString());
                        myParams.put("hepatitis_8", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_8.getText().toString());
                        myParams.put("hepatitis_9", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_9.getText().toString());
                        myParams.put("hepatitis_10", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_10.getText().toString());
                        myParams.put("hepatitis_11", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_11.getText().toString());
                        myParams.put("hepatitis_12", Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_12.getText().toString());
                        myParams.put("bcg_0", Tambah_kesehatan_imunisasi_anak.this.etxbcg_0.getText().toString());
                        myParams.put("bcg_1", Tambah_kesehatan_imunisasi_anak.this.etxbcg_1.getText().toString());
                        myParams.put("bcg_2", Tambah_kesehatan_imunisasi_anak.this.etxbcg_2.getText().toString());
                        myParams.put("bcg_3", Tambah_kesehatan_imunisasi_anak.this.etxbcg_3.getText().toString());
                        myParams.put("bcg_4", Tambah_kesehatan_imunisasi_anak.this.etxbcg_4.getText().toString());
                        myParams.put("bcg_5", Tambah_kesehatan_imunisasi_anak.this.etxbcg_5.getText().toString());
                        myParams.put("bcg_6", Tambah_kesehatan_imunisasi_anak.this.etxbcg_6.getText().toString());
                        myParams.put("bcg_7", Tambah_kesehatan_imunisasi_anak.this.etxbcg_7.getText().toString());
                        myParams.put("bcg_8", Tambah_kesehatan_imunisasi_anak.this.etxbcg_8.getText().toString());
                        myParams.put("bcg_9", Tambah_kesehatan_imunisasi_anak.this.etxbcg_9.getText().toString());
                        myParams.put("bcg_10", Tambah_kesehatan_imunisasi_anak.this.etxbcg_10.getText().toString());
                        myParams.put("bcg_11", Tambah_kesehatan_imunisasi_anak.this.etxbcg_11.getText().toString());
                        myParams.put("bcg_12", Tambah_kesehatan_imunisasi_anak.this.etxbcg_12.getText().toString());
                        myParams.put("polio_tetes_0", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_0.getText().toString());
                        myParams.put("polio_tetes_1", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_1.getText().toString());
                        myParams.put("polio_tetes_2", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_2.getText().toString());
                        myParams.put("polio_tetes_3", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_3.getText().toString());
                        myParams.put("polio_tetes_4", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_4.getText().toString());
                        myParams.put("polio_tetes_5", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_5.getText().toString());
                        myParams.put("polio_tetes_6", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_6.getText().toString());
                        myParams.put("polio_tetes_7", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_7.getText().toString());
                        myParams.put("polio_tetes_8", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_8.getText().toString());
                        myParams.put("polio_tetes_9", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_9.getText().toString());
                        myParams.put("polio_tetes_10", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_10.getText().toString());
                        myParams.put("polio_tetes_11", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_11.getText().toString());
                        myParams.put("polio_tetes_12", Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_12.getText().toString());
                        myParams.put("dan_lain_lain_0", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_0.getText().toString());
                        myParams.put("dan_lain_lain_1", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_1.getText().toString());
                        myParams.put("dan_lain_lain_2", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_2.getText().toString());
                        myParams.put("dan_lain_lain_3", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_3.getText().toString());
                        myParams.put("dan_lain_lain_4", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_4.getText().toString());
                        myParams.put("dan_lain_lain_5", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_5.getText().toString());
                        myParams.put("dan_lain_lain_6", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_6.getText().toString());
                        myParams.put("dan_lain_lain_7", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_7.getText().toString());
                        myParams.put("dan_lain_lain_8", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_8.getText().toString());
                        myParams.put("dan_lain_lain_9", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_9.getText().toString());
                        myParams.put("dan_lain_lain_10", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_10.getText().toString());
                        myParams.put("dan_lain_lain_11", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_11.getText().toString());
                        myParams.put("dan_lain_lain_12", Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_12.getText().toString());
                        return myParams;
                    }
                });
            }
        });
        this.btnbatal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_0.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_1.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_2.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_3.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_4.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_5.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_6.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_7.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_8.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_9.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_10.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_11.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxhepatitis_12.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_0.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_1.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_2.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_3.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_4.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_5.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_6.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_7.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_8.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_9.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_10.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_11.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxbcg_12.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_0.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_1.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_2.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_3.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_4.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_5.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_6.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_7.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_8.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_9.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_10.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_11.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxpolio_tetes_12.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_0.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_1.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_2.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_3.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_4.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_5.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_6.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_7.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_8.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_9.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_10.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_11.setText("");
                Tambah_kesehatan_imunisasi_anak.this.etxdan_lain_lain_12.setText("");
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
                        Tambah_kesehatan_imunisasi_anak.this.nama_ibu1.setText(jsonArray.getJSONObject(i).getString("nama_ibu"));
                        Tambah_kesehatan_imunisasi_anak.this.nama_ayah.setText(jsonArray.getJSONObject(i).getString("nama_ayah"));
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
                        Tambah_kesehatan_imunisasi_anak.this.anak_ke.setText(jsonArray.getJSONObject(i).getString("anak_ke"));
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
                        Tambah_kesehatan_imunisasi_anak.this.list_namaanak.add(jsonArray2.getJSONObject(j).getString("nama"));
                        Tambah_kesehatan_imunisasi_anak tambah_kesehatan_imunisasi_anak = Tambah_kesehatan_imunisasi_anak.this;
                        Tambah_kesehatan_imunisasi_anak tambah_kesehatan_imunisasi_anak2 = Tambah_kesehatan_imunisasi_anak.this;
                        tambah_kesehatan_imunisasi_anak.namaanak_adapter = new ArrayAdapter<>(tambah_kesehatan_imunisasi_anak2, 17367048, tambah_kesehatan_imunisasi_anak2.list_namaanak);
                        Tambah_kesehatan_imunisasi_anak.this.namaanak_adapter.setDropDownViewResource(17367049);
                        Tambah_kesehatan_imunisasi_anak.this.spinnernama_anak.setAdapter(Tambah_kesehatan_imunisasi_anak.this.namaanak_adapter);
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
                        Tambah_kesehatan_imunisasi_anak.this.list_nikibu.add(jsonArray.getJSONObject(i).getString("nik"));
                        Tambah_kesehatan_imunisasi_anak tambah_kesehatan_imunisasi_anak = Tambah_kesehatan_imunisasi_anak.this;
                        Tambah_kesehatan_imunisasi_anak tambah_kesehatan_imunisasi_anak2 = Tambah_kesehatan_imunisasi_anak.this;
                        tambah_kesehatan_imunisasi_anak.nikibu_adapter = new ArrayAdapter<>(tambah_kesehatan_imunisasi_anak2, 17367048, tambah_kesehatan_imunisasi_anak2.list_nikibu);
                        Tambah_kesehatan_imunisasi_anak.this.nikibu_adapter.setDropDownViewResource(17367049);
                        Tambah_kesehatan_imunisasi_anak.this.spinnernik_ibu.setAdapter(Tambah_kesehatan_imunisasi_anak.this.nikibu_adapter);
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

                etxhepatitis_0.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_1.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_2.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_3.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_4.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_5.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_6.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_7.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_8.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_9.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_10.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_11.setText(dateFormatter.format(newDate.getTime()));
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

                etxhepatitis_12.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_0.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_1.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_2.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_3.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_4.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_5.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_6.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_7.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_8.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_9.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_10.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_11.setText(dateFormatter.format(newDate.getTime()));
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

                etxbcg_12.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_0.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_1.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_2.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_3.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_4.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_5.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_6.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_7.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_8.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_9.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_10.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_11.setText(dateFormatter.format(newDate.getTime()));
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

                etxpolio_tetes_12.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_0.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_1.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_2.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_3.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_4.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_5.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_6.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_7.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_8.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_9.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_10.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_11.setText(dateFormatter.format(newDate.getTime()));
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

                etxdan_lain_lain_12.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
