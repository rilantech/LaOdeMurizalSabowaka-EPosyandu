package com.example.aplikasiibu.AdapterPemberianVitaminDanObatCacing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDataPemberianVitaminDanObatCacing extends BaseAdapter {
    public static String id;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetPemberianVitaminDanObatCacing> model;

    public AdaptorDataPemberianVitaminDanObatCacing(Context context2, ArrayList<GetPemberianVitaminDanObatCacing> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_pemberian_vitamin_dan_obat_cacing, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.nama_bayi)).setText(this.model.get(position).getNama_bayi());
            ((TextView) view1.findViewById(R.id.anak_ke)).setText(this.model.get(position).getAnak_ke());
        }
        return view1;
    }
}
