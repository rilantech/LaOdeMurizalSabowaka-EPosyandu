package com.example.aplikasipetugas.AdapterCatatanKesehatanIbuNifas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasipetugas.CatatanKesehatanIbuHamil;
import com.example.aplikasipetugas.Edit_catatan_kesehatan_ibu_hamil;
import com.example.aplikasipetugas.R;

import java.util.ArrayList;

public class AdaptorCatatanKesehatanIbuNifas extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetCatatanKesehatanIbuNifas> model;

    public AdaptorCatatanKesehatanIbuNifas(Context context2, ArrayList<GetCatatanKesehatanIbuNifas> model2) {
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
        @SuppressLint("MissingInflatedId") ImageView imageView = (ImageView) view1.findViewById(R.id.tomboleksport);
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
                Intent intent = new Intent(AdaptorCatatanKesehatanIbuNifas.this.context.getApplicationContext(), Edit_catatan_kesehatan_ibu_hamil.class);
                intent.addFlags(268435456);
                intent.putExtra("dataid", AdaptorCatatanKesehatanIbuNifas.this.model.get(i).getId());
                intent.putExtra("nikibu", AdaptorCatatanKesehatanIbuNifas.this.model.get(i).getNik_ibu());
                intent.putExtra("kehamilan_ke", AdaptorCatatanKesehatanIbuNifas.this.model.get(i).getKehamilan_ke());
                AdaptorCatatanKesehatanIbuNifas.this.context.getApplicationContext().startActivity(intent);
            }
        });
        ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            public void onClick(View view) {
                Intent intent = new Intent(AdaptorCatatanKesehatanIbuNifas.this.context.getApplicationContext(), CatatanKesehatanIbuHamil.class);
                intent.addFlags(268435456);
                intent.putExtra("dataid", AdaptorCatatanKesehatanIbuNifas.this.model.get(i).getId());
                AdaptorCatatanKesehatanIbuNifas.this.context.getApplicationContext().startActivity(intent);
            }
        });
        return view12;
    }
}
