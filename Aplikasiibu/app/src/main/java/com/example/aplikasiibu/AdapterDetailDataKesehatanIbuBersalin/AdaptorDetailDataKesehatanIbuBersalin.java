package com.example.aplikasiibu.AdapterDetailDataKesehatanIbuBersalin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDetailDataKesehatanIbuBersalin extends BaseAdapter {
    public static Integer nomor;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailDataKesehatanIbuBersalin> model;

    public AdaptorDetailDataKesehatanIbuBersalin(Context context2, ArrayList<GetDetailDataKesehatanIbuBersalin> model2) {
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
        int i = position;
        View view1 = this.inflater.inflate((int) R.layout.list_detail_data_kesehatan_ibu_bersalin, (ViewGroup) null);
        if (view1 == null) {
            return view1;
        }
        TextView anak_ke = (TextView) view1.findViewById(R.id.anak_ke);
        TextView kondisi_bayi_saat_lahir = (TextView) view1.findViewById(R.id.kondisi_bayi_saat_lahir);
        TextView asuhan_bayi_baru_lahir = (TextView) view1.findViewById(R.id.asuhan_bayi_baru_lahir);
        View view12 = view1;
        anak_ke.setText(this.model.get(i).getAnak_ke());
        ((TextView) view1.findViewById(R.id.tanggal_persalinan)).setText(this.model.get(i).getTanggal_persalinan());
        ((TextView) view1.findViewById(R.id.pukul)).setText(this.model.get(i).getPukul());
        ((TextView) view1.findViewById(R.id.umur_kehamilan)).setText(this.model.get(i).getUmur_kehamilan());
        ((TextView) view1.findViewById(R.id.penolong_persalinan)).setText(this.model.get(i).getPenolong_persalinan());
        ((TextView) view1.findViewById(R.id.cara_persalinan)).setText(this.model.get(i).getCara_persalinan());
        ((TextView) view1.findViewById(R.id.keadaan_ibu)).setText(this.model.get(i).getKeadaan_ibu());
//        ((TextView) view1.findViewById(R.id.keterangan_tambahan_ibu)).setText(this.model.get(i).getKeterangan_tambahan_ibu());
        ((TextView) view1.findViewById(R.id.berat_lahir)).setText(this.model.get(i).getBerat_lahir());
        ((TextView) view1.findViewById(R.id.panjang_badan)).setText(this.model.get(i).getPanjang_badan());
        ((TextView) view1.findViewById(R.id.lingkar_kepala)).setText(this.model.get(i).getLingkar_kepala());
        ((TextView) view1.findViewById(R.id.jenis_kelamin)).setText(this.model.get(i).getJenis_kelamin());
        TextView textView = anak_ke;
        kondisi_bayi_saat_lahir.setText(this.model.get(i).getKondisi_bayi_saat_lahir());
        asuhan_bayi_baru_lahir.setText(this.model.get(i).getAsuhan_bayi_baru_lahir());
//        ((TextView) view1.findViewById(R.id.keterangan_tambahan_anak)).setText(this.model.get(i).getKeterangan_tambahan_anak());
        return view12;
    }
}
