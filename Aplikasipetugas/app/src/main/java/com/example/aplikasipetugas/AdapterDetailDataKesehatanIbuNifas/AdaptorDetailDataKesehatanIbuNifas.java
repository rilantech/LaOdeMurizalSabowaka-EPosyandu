package com.example.aplikasipetugas.AdapterDetailDataKesehatanIbuNifas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasipetugas.Detail_data_kesehatan_ibu_hamil;
import com.example.aplikasipetugas.Edit_detail_kesehatan_ibu_nifas;
import com.example.aplikasipetugas.R;

import java.util.ArrayList;

public class AdaptorDetailDataKesehatanIbuNifas extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailDataKesehatanIbuNifas> model;

    public AdaptorDetailDataKesehatanIbuNifas(Context context2, ArrayList<GetDetailDataKesehatanIbuNifas> model2) {
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

    public View getView(final int position, View view, ViewGroup viewGroup) {
        View view1 = this.inflater.inflate(R.layout.list_detail_data_kesehatan_ibu_nifas, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.nifas_ke)).setText(this.model.get(position).getNifas_ke());
            ((TextView) view1.findViewById(R.id.nama_anak)).setText(this.model.get(position).getNama_anak());
            ((TextView) view1.findViewById(R.id.jumlah_kunjungan)).setText("4");
            ((ImageView) view1.findViewById(R.id.tomboledit)).setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDetailDataKesehatanIbuNifas.this.context.getApplicationContext(), Edit_detail_kesehatan_ibu_nifas.class);
                    intent.addFlags(268435456);
                    intent.putExtra("dataid", AdaptorDetailDataKesehatanIbuNifas.this.model.get(position).getId());
                    intent.putExtra("nikibu", AdaptorDetailDataKesehatanIbuNifas.this.model.get(position).getNik_ibu());
                    AdaptorDetailDataKesehatanIbuNifas.this.context.getApplicationContext().startActivity(intent);
                }
            });
            ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDetailDataKesehatanIbuNifas.this.context.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class);
                    intent.addFlags(268435456);
                    intent.putExtra("dataid", AdaptorDetailDataKesehatanIbuNifas.this.model.get(position).getId());
                    intent.putExtra("nikibu", AdaptorDetailDataKesehatanIbuNifas.this.model.get(position).getNik_ibu());
                    AdaptorDetailDataKesehatanIbuNifas.this.context.getApplicationContext().startActivity(intent);
                }
            });
        }
        return view1;
    }
}
