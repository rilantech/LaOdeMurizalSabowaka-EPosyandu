package com.example.aplikasiibu;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.AdapterDetailChatting.AdaptorDetailChatting;
import com.example.aplikasiibu.AdapterDetailChatting.GetDetailChatting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DetailHalamanChatting extends AppCompatActivity {
    public static String Isipesansebelumnya;
    public static String status_halaman = "";
    AdaptorDetailChatting adaptor;
    ImageView butonlogout;
    EditText etxisipesan;
    ListView listView;
    ArrayList<GetDetailChatting> model;
    TextView nama_akun_tujuan;
    TextView nomor_hp;
    ImageView tombol_kembali;
    ImageView tombolkirim;
    TextView tvNamapetugas;
    View view;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_detail_halaman_chatting);
        this.nama_akun_tujuan = (TextView) findViewById(R.id.nama_akun_tujuan);
        this.nomor_hp = (TextView) findViewById(R.id.nomor_hp);
        this.listView = (ListView) findViewById(R.id.list);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.butonlogout = (ImageView) findViewById(R.id.butonlogout);
        this.tvNamapetugas = (TextView) findViewById(R.id.tvNamapetugas);
        this.etxisipesan = (EditText) findViewById(R.id.etxisipesan);
        this.tombolkirim = (ImageView) findViewById(R.id.tombolkirim);
        this.tvNamapetugas.setText(HalamanLogin.namapetugas);
        status_halaman = "aktif";
        this.butonlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailHalamanChatting.this);
                builder.setMessage("Yakin Ingin Logout ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    public void onClick(DialogInterface dialogInterface, int position) {
                        HalamanLogin.preferenceHelper.putIsLogin(false);
                        Intent intent = new Intent(DetailHalamanChatting.this, HalamanLogin.class);
                        intent.addFlags(268468224);
                        DetailHalamanChatting.this.startActivity(intent);
                        DetailHalamanChatting.this.finish();
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        });
//        try {
//            final Handler handler = new Handler();
//            handler.post(new Runnable() {
//                public void run() {
//                    DetailHalamanChatting.this.load_data2();
//                    handler.postDelayed(this, 1000);
//                }
//            });
//        } catch (NumberFormatException e) {
//            Log.e("Error", e.getMessage());
//        }
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DetailHalamanChatting.this.finish();
            }
        });
        this.tombolkirim.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                load_data2();
                if (DetailHalamanChatting.this.etxisipesan.getText().toString().length() == 0) {
                    DetailHalamanChatting.this.onRestart();
                    return;
                }
                Volley.newRequestQueue(DetailHalamanChatting.this.getApplicationContext()).add(new StringRequest(1, new Configurasi().baseUrl() + "api/chatting7", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                DetailHalamanChatting.this.load_data2();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(DetailHalamanChatting.this, "terjadi kesalahan", Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String, String> form = new HashMap<>();
                        form.put("nomor_hp_pengirim", HalamanLogin.nomorhp);
                        form.put("nomor_hp_penerima", DetailHalamanChatting.this.getIntent().getStringExtra("nomor_hp"));
                        form.put("isi_pesan", DetailHalamanChatting.this.etxisipesan.getText().toString());
                        return form;
                    }
                });
                DetailHalamanChatting.this.etxisipesan.setText("");
            }
        });
        load_data2();
        this.nama_akun_tujuan.setText(getIntent().getStringExtra("nama"));
        this.nomor_hp.setText(getIntent().getStringExtra("nomor_hp"));

        listView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){
                    load_data2();
                }
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
//    public void onUserLeaveHint() {
//        super.onUserLeaveHint();
//        load_data2();
//    }
//
//    /* access modifiers changed from: protected */
//    public void onPause() {
//        super.onPause();
//        load_data2();
//    }

//    public void onUserInteraction() {
//        super.onUserInteraction();
//        load_data2();
//        stopService(new Intent(this, NotificationService2.class));
//    }

    /* access modifiers changed from: package-private */
    public void load_data2() {
        Volley.newRequestQueue(this).add(new StringRequest(0, new Configurasi().baseUrl() + "api/detailchatting/" + getIntent().getIntExtra("id_akun", 0) + "/" + HalamanLogin.nomorhp + "/" + getIntent().getStringExtra("posisi"), new Response.Listener<String>() {
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONObject(response).getJSONArray("detailchatting2");
                    DetailHalamanChatting.this.model = new ArrayList<>();
                    for (int i = 0; i <= jsonArray.length(); i++) {
                        JSONObject getData = jsonArray.getJSONObject(i);
                        DetailHalamanChatting.this.model.add(new GetDetailChatting(getData.getInt("id"), getData.getString("isi_pesan"), getData.getString("waktu_kirim"), getData.getString("nomor_hp_pengirim")));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                DetailHalamanChatting.this.adaptor = new AdaptorDetailChatting(DetailHalamanChatting.this.getApplicationContext(), DetailHalamanChatting.this.model);
                DetailHalamanChatting.this.listView.setAdapter(DetailHalamanChatting.this.adaptor);
                DetailHalamanChatting.this.listView.setSelection(DetailHalamanChatting.this.adaptor.getCount() - 1);
            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
            }
        }));
    }
}
