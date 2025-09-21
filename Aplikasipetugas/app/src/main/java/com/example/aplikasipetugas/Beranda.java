package com.example.aplikasipetugas;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import cn.pedant.SweetAlert.SweetAlertDialog;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Beranda extends Fragment {
    public static CharSequence jam;
    CardView chatting;
    TextView copyright;
    CardView datakesehatananak;
    CardView datakesehatanibu;
    CardView dataobstetri;
    CardView dataorangtuadananak;
    CardView jadwal_posyandu;
    String status_absen;
    ImageView tombol_tentang_aplikasi;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.halaman_beranda, (ViewGroup) null);
        this.jadwal_posyandu = (CardView) view.findViewById(R.id.cardviewjadwalposyandu);
        this.dataorangtuadananak = (CardView) view.findViewById(R.id.cardviewdataorangtuadananak);
        this.dataobstetri = (CardView) view.findViewById(R.id.cardviewdataobstetri);
        this.datakesehatanibu = (CardView) view.findViewById(R.id.cardviewdatakesehatanibu);
        this.datakesehatananak = (CardView) view.findViewById(R.id.cardviewdatakesehatananak);
        this.chatting = (CardView) view.findViewById(R.id.cardviewchatting);
        ImageView imageView = (ImageView) view.findViewById(R.id.tombol_tentang_aplikasi);
        this.tombol_tentang_aplikasi = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Tentangaplikasi.class));
            }
        });
        this.jadwal_posyandu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Jadwalposyandu.class));
            }
        });
        this.dataorangtuadananak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Dataorangtuadananak.class));
            }
        });
        this.dataobstetri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Dataobstetri.class));
            }
        });
        this.datakesehatanibu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Data_kesehatan_ibu.class));
            }
        });
        this.datakesehatananak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Kesehatan_bayi_baru_lahir.class));
            }
        });
        this.chatting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Halaman_Chatting.class));
            }
        });
        return view;
    }


//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        jam = DateFormat.format("HH:mm:ss", new Date().getTime());
//        if (requestCode == 20 && resultCode == -1 && data != null) {
//            String stringExtra = data.getStringExtra("teks_hadir");
//            Volley.newRequestQueue(getContext()).add(new StringRequest(1, new Configurasi().baseUrl() + "api/absen.php", new Response.Listener<String>() {
//                public void onResponse(String response) {
//                    try {
//                        if (new JSONObject(response).getString("statuspresensi").equals("berhasil_absen")) {
//                            Beranda.this.getActivity();
//                        }
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }, new Response.ErrorListener() {
//                public void onErrorResponse(VolleyError error) {
//                    Toast.makeText(Beranda.this.getContext(), "Maaf, Anda Tidak Bisa Absen Lagi", Toast.LENGTH_SHORT).show();
//                }
//            }) {
//                /* access modifiers changed from: protected */
//                public Map<String, String> getParams() throws AuthFailureError {
//                    HashMap<String, String> form = new HashMap<>();
//                    form.put("pengunjung", HalamanLogin.nama);
//                    form.put("waktu_berkunjung", Beranda.jam.toString());
//                    form.put("kepentingan", Absen_pengunjung.kepentingan.getText().toString());
//                    return form;
//                }
//            });
//            if (Absen_pengunjung.pesan.booleanValue()) {
//                new SweetAlertDialog(getContext(), 2).setTitleText("Sukses").setContentText("Berhasil Absen!").show();
//            }
//        }
//    }

//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode != 0) {
//            return;
//        }
//        if (grantResults[0] == 0) {
//            starScan();
//        } else {
//            Toast.makeText(getContext(), "Gagal membuka kamera", 1).show();
//        }
//    }
}
