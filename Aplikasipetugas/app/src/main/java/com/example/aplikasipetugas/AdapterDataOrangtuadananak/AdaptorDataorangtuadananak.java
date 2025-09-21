package com.example.aplikasipetugas.AdapterDataOrangtuadananak;

import static android.content.Context.MODE_PRIVATE;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioMetadata;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.Configurasi;
import com.example.aplikasipetugas.Dataorangtuadananak;
import com.example.aplikasipetugas.Edit_Data_OrangTua_DanAnak;
import com.example.aplikasipetugas.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class AdaptorDataorangtuadananak extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDataorangtuadananak> model;
    String tanggal_lahir_ibu;
    public static String status_hapus;

    public AdaptorDataorangtuadananak(Context context2, ArrayList<GetDataorangtuadananak> model2) {
        this.inflater = LayoutInflater.from(context2);
        this.context = context2;
        this.model = model2;
    }

    public int getCount() {
        return this.model.size();
    }

    public Object getItem(int position) {
        return this.model.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    @SuppressLint("MissingInflatedId")
    public View getView(final int position, View view, ViewGroup viewGroup) {
        TextView nama, nik, ttl, alamat, jmlanak;
        ImageView tomboledit, tomboleksport, tombolhapus;
        @SuppressLint("ViewHolder") View view1 = this.inflater.inflate(R.layout.list_data_orangtuadananak, (ViewGroup) null);
        if (view1 != null) {
            nama = view1.findViewById(R.id.nama);
            nik = view1.findViewById(R.id.nik);
            ttl = view1.findViewById(R.id.ttl);
            alamat = view1.findViewById(R.id.alamat);
            tomboledit = view1.findViewById(R.id.tomboledit);
            tombolhapus = view1.findViewById(R.id.tombolhapus);
            tomboleksport = view1.findViewById(R.id.tomboleksport);


            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM YYYY");
            try {
                Date date = inputFormat.parse(this.model.get(position).getTanggal_lahir_ibu());
                tanggal_lahir_ibu = outputFormat.format(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }
            nama.setText(this.model.get(position).getNama_ibu());
            nik.setText(this.model.get(position).getNik());
            ttl.setText(this.model.get(position).getTempat_lahir_ibu() + "/" + tanggal_lahir_ibu);
            alamat.setText(this.model.get(position).getAlamat_rumah());
            tomboledit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataorangtuadananak.this.context.getApplicationContext(), Edit_Data_OrangTua_DanAnak.class);
                    intent.putExtra("dataid", AdaptorDataorangtuadananak.this.model.get(position).getId());
                    intent.putExtra("nik_ibu", AdaptorDataorangtuadananak.this.model.get(position).getNik());
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDataorangtuadananak.this.context.getApplicationContext().startActivity(intent);
                }
            });
            tomboleksport.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataorangtuadananak.this.context.getApplicationContext(), Dataorangtuadananak.class);
                    intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", AdaptorDataorangtuadananak.this.model.get(position).getId());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDataorangtuadananak.this.context.getApplicationContext().startActivity(intent);
                }
            });


            tombolhapus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                        status_hapus = "berhasil";
                        Volley.newRequestQueue(view.getContext()).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapusdata/" + model.get(position).getId(), new Response.Listener<String>() {
                            public void onResponse(String response) {
                                try {
                                    if (new JSONObject(response).getString("status").equals("berhasil")) {
                                        model.remove(position);
                                        notifyDataSetChanged();
                                        Toast.makeText(context, "Berhasil Terhapus", Toast.LENGTH_SHORT).show();
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
            });
        }
        return view1;
    }
}
