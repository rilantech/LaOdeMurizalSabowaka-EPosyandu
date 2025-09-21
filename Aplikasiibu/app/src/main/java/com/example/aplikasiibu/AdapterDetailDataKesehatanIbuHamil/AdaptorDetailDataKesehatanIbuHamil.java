package com.example.aplikasiibu.AdapterDetailDataKesehatanIbuHamil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDetailDataKesehatanIbuHamil extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailDataKesehatanIbuHamil> model;

    public AdaptorDetailDataKesehatanIbuHamil(Context context2, ArrayList<GetDetailDataKesehatanIbuHamil> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_detail_data_kesehatan_ibu_hamil, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.kehamilan_ke)).setText(this.model.get(position).getKehamilan_ke());
            ((TextView) view1.findViewById(R.id.hari_terakhir_haid_pertama)).setText(this.model.get(position).getHari_pertama_haid_terakhir());
            ((TextView) view1.findViewById(R.id.hari_taksiran_persalinan)).setText(this.model.get(position).getHari_taksiran_persalinan());
            ((TextView) view1.findViewById(R.id.golongan_darah)).setText(this.model.get(position).getGolongan_darah());
            ((TextView) view1.findViewById(R.id.penggunaan_kontrasepsi_sebelum_hamil)).setText(this.model.get(position).getPenggunaan_kontrasepsi_sebelum_hamil());
            ((TextView) view1.findViewById(R.id.riwayat_penyakit_yang_di_derita_ibu)).setText(this.model.get(position).getRiwayat_penyakit_yg_di_derita_ibu());
            ((TextView) view1.findViewById(R.id.riwayat_alergi)).setText(this.model.get(position).getRiwayat_alergi());
            ((TextView) view1.findViewById(R.id.status_imunisasi)).setText(this.model.get(position).getStatus_imunisasi_tetanus_terakhir());
            ((TextView) view1.findViewById(R.id.tinggi_badan)).setText(this.model.get(position).getTinggi_badan());
        }
        return view1;
    }
}
