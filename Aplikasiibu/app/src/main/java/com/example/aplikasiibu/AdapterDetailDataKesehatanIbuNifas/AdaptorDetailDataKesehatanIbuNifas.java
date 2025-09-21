package com.example.aplikasiibu.AdapterDetailDataKesehatanIbuNifas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

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
        View view1 = this.inflater.inflate((int) R.layout.list_detail_data_kesehatan_ibu_nifas, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.nifas_ke)).setText(this.model.get(position).getNifas_ke());
            ((TextView) view1.findViewById(R.id.nama_anak)).setText(this.model.get(position).getNama_anak());
            ((TextView) view1.findViewById(R.id.jumlah_kunjungan)).setText("4");

        }
        return view1;
    }
}
