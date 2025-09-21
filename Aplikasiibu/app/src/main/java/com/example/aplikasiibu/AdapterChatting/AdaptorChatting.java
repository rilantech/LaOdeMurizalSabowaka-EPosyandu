package com.example.aplikasiibu.AdapterChatting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorChatting extends BaseAdapter {
    public static String id;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetChatting> model;

    public AdaptorChatting(Context context2, ArrayList<GetChatting> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_akun_chatting, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.nama)).setText(this.model.get(position).getNama());
            ((TextView) view1.findViewById(R.id.nomor_hp)).setText(this.model.get(position).getNomor_hp());
        }
        return view1;
    }
}
