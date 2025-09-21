package com.example.aplikasiibu.AdapterDetailDataObstetri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDetailDataobstetri extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailDataobstetri> model;

    public AdaptorDetailDataobstetri(Context context2, ArrayList<GetDetailDataobstetri> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_detail_data_obstetri, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.kehamilan_ke)).setText(this.model.get(position).getKehamilan_ke());
            ((TextView) view1.findViewById(R.id.tahun)).setText(this.model.get(position).getTahun());
            ((TextView) view1.findViewById(R.id.lahir_hidup)).setText(this.model.get(position).getLahir_hidup());
            ((TextView) view1.findViewById(R.id.lahir_aterm)).setText(this.model.get(position).getLahir_aterm());
            ((TextView) view1.findViewById(R.id.lahir_spontan)).setText(this.model.get(position).getLahir_spontan());
            ((TextView) view1.findViewById(R.id.berat_lahir_atau_panjang_lahir)).setText(this.model.get(position).getBerat_lahir_atau_panjang_lahir());
            ((TextView) view1.findViewById(R.id.tempat_bersalin_dan_tenakes)).setText(this.model.get(position).getTempat_bersalin_dan_tenakes());
            ((TextView) view1.findViewById(R.id.kondisi_anak_saat_ini)).setText(this.model.get(position).getKondisi_anak_saat_ini());
            ((TextView) view1.findViewById(R.id.komplikasi_kehamilan_dan_persalinan)).setText(this.model.get(position).getKomplikasi_kehamilan_dan_persalinan());
        }
        return view1;
    }
}
