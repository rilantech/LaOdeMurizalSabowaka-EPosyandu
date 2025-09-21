package com.example.aplikasiibu.AdapterDetailChatting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.aplikasiibu.HalamanLogin;
import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDetailChatting extends BaseAdapter {
    public static String id;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailChatting> model;

    public AdaptorDetailChatting(Context context2, ArrayList<GetDetailChatting> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_chat, (ViewGroup) null);
        if (view1 != null) {
            TextView isi_pesan = (TextView) view1.findViewById(R.id.isi_pesan);
            TextView waktu_kirim = (TextView) view1.findViewById(R.id.waktu_kirim);
            FrameLayout cardviewjadwalposyandu = (FrameLayout) view1.findViewById(R.id.kotakchat);
            if (HalamanLogin.nomorhp.equals(this.model.get(position).getNomor_hp_pengirim())) {
                isi_pesan.setText(this.model.get(position).getIsi_pesan());
                waktu_kirim.setText(this.model.get(position).getWaktu_kirim());
            } else {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 3;
                cardviewjadwalposyandu.setBackgroundResource(R.drawable.rounded_kotak_chatting_2);
                cardviewjadwalposyandu.setLayoutParams(layoutParams);
                isi_pesan.setText(this.model.get(position).getIsi_pesan());
                waktu_kirim.setText(this.model.get(position).getWaktu_kirim());
            }
        }
        return view1;
    }
}
