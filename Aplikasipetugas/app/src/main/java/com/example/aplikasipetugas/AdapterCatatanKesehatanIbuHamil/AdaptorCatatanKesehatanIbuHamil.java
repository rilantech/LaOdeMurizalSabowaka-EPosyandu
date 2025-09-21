package com.example.aplikasipetugas.AdapterCatatanKesehatanIbuHamil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.CatatanKesehatanIbuHamil;
import com.example.aplikasipetugas.Configurasi;
import com.example.aplikasipetugas.Edit_catatan_kesehatan_ibu_hamil;
import com.example.aplikasipetugas.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AdaptorCatatanKesehatanIbuHamil extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetCatatanKesehatanIbuHamil> model;

    public AdaptorCatatanKesehatanIbuHamil(Context context2, ArrayList<GetCatatanKesehatanIbuHamil> model2) {
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

    public View getView(int position, View view, ViewGroup viewGroup) {
        final int i = position;
        View view1 = this.inflater.inflate(R.layout.list_catatan_kesehatan_ibu_hamil, (ViewGroup) null);
        if (view1 == null) {
            return view1;
        }
        TextView tanggal = (TextView) view1.findViewById(R.id.tanggal);
        TextView analisa = (TextView) view1.findViewById(R.id.analisa);
        TextView tata_laksana = (TextView) view1.findViewById(R.id.tata_laksana);
        TextView konseling = (TextView) view1.findViewById(R.id.konseling);
        TextView catatan_tambahan = (TextView) view1.findViewById(R.id.catatan_tambahan);
        ImageView tomboledit = (ImageView) view1.findViewById(R.id.tomboledit);
        View view12 = view1;
        tanggal.setText(this.model.get(i).getTanggal());
        ((TextView) view1.findViewById(R.id.nama_pemeriksa)).setText(this.model.get(i).getNama_pemeriksa());
        ((TextView) view1.findViewById(R.id.keluhan)).setText(this.model.get(i).getKeluhan());
        ((TextView) view1.findViewById(R.id.uk)).setText(this.model.get(i).getUk());
        ((TextView) view1.findViewById(R.id.bb)).setText(this.model.get(i).getBb());
        ((TextView) view1.findViewById(R.id.td)).setText(this.model.get(i).getTd());
        ((TextView) view1.findViewById(R.id.lila)).setText(this.model.get(i).getLila());
        ((TextView) view1.findViewById(R.id.tinggi_fundus)).setText(this.model.get(i).getTinggi_fundus());
        ((TextView) view1.findViewById(R.id.letak_janin)).setText(this.model.get(i).getLetak_janin());
        ((TextView) view1.findViewById(R.id.imunisasi)).setText(this.model.get(i).getImunisasi());
        ((TextView) view1.findViewById(R.id.tablet_tambah_darah)).setText(this.model.get(i).getTablet_tambah_darah());
        ((TextView) view1.findViewById(R.id.lab)).setText(this.model.get(i).getLab());
        TextView textView = tanggal;
        analisa.setText(this.model.get(i).getAnalisa());
        tata_laksana.setText(this.model.get(i).getTata_laksana());
        konseling.setText(this.model.get(i).getKonseling());
        catatan_tambahan.setText(this.model.get(i).getCatatan_tambahan());
        tomboledit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            public void onClick(View view) {
                Intent intent = new Intent(AdaptorCatatanKesehatanIbuHamil.this.context.getApplicationContext(), Edit_catatan_kesehatan_ibu_hamil.class);
                intent.addFlags(268435456);
                intent.putExtra("dataid", AdaptorCatatanKesehatanIbuHamil.this.model.get(i).getId());
                intent.putExtra("nikibu", AdaptorCatatanKesehatanIbuHamil.this.model.get(i).getNik_ibu());
                intent.putExtra("kehamilan_ke", AdaptorCatatanKesehatanIbuHamil.this.model.get(i).getKehamilan_ke());
                AdaptorCatatanKesehatanIbuHamil.this.context.getApplicationContext().startActivity(intent);
            }
        });
        ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            public void onClick(View view) {
                Volley.newRequestQueue(context).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapuscatatankesehatanibuhamil/" + model.get(position).getId(), new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
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
        return view12;
    }
}
