package com.example.aplikasiibu.AdapterJadwalPosyandu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorJadwalPosyandu extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetJadwalPosyandu> model;

    public AdaptorJadwalPosyandu(Context context2, ArrayList<GetJadwalPosyandu> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_jadwal_posyandu, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.waktu_post)).setText(this.model.get(position).getWaktu_post());
            ((TextView) view1.findViewById(R.id.agenda)).setText(this.model.get(position).getAgenda());
            ((TextView) view1.findViewById(R.id.tanggal)).setText(this.model.get(position).getTanggal());
            ((TextView) view1.findViewById(R.id.jam)).setText(this.model.get(position).getJam());
        }
        return view1;
    }
}
