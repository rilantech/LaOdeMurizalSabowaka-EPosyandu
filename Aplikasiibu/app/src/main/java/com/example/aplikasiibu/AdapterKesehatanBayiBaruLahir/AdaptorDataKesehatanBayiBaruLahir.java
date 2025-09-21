package com.example.aplikasiibu.AdapterKesehatanBayiBaruLahir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDataKesehatanBayiBaruLahir extends BaseAdapter {
    public static String id;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetKesehatanBayiBaruLahir> model;

    public AdaptorDataKesehatanBayiBaruLahir(Context context2, ArrayList<GetKesehatanBayiBaruLahir> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_kesehatan_bayi_baru_lahir, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.nama_bayi)).setText(this.model.get(position).getNama_bayi());
            ((TextView) view1.findViewById(R.id.anak_ke)).setText(this.model.get(position).getAnak_ke());
        }
        return view1;
    }
}
