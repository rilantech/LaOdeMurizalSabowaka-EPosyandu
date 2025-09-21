package com.example.aplikasipetugas.AdapterDataKesehatanIbuHamil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasipetugas.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdaptorDataKesehatanIbuHamil extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDataKesehatanIbuHamil> model;
    String tanggal_lahir_ibu;

    public AdaptorDataKesehatanIbuHamil(Context context2, ArrayList<GetDataKesehatanIbuHamil> model2) {
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
        @SuppressLint("ViewHolder") View view1 = this.inflater.inflate(R.layout.list_data_kesehatan_ibu_hamil, (ViewGroup) null);
        if (view1 != null) {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM YYYY");
            try {
                Date date = inputFormat.parse(this.model.get(position).getTanggal_lahir_ibu());
                tanggal_lahir_ibu = outputFormat.format(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }
            ImageView imageView = (ImageView) view1.findViewById(R.id.tomboleksport);
            ((TextView) view1.findViewById(R.id.nama_ibu)).setText(this.model.get(position).getNama_ibu());
            ((TextView) view1.findViewById(R.id.nik)).setText(this.model.get(position).getNik());
            ((TextView) view1.findViewById(R.id.ttl)).setText(this.model.get(position).getTempat_lahir_ibu()+"/"+tanggal_lahir_ibu);
            ((TextView) view1.findViewById(R.id.alamat)).setText(this.model.get(position).getAlamat_rumah());
        }
        return view1;
    }
}
