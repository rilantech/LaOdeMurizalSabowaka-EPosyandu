package com.example.aplikasipetugas.AdapterDataAnak;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasipetugas.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdaptorDataanak extends BaseAdapter {
    public static Integer nomor;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDataanak> model;
    String tanggal_lahir_anak;

    public AdaptorDataanak(Context context2, ArrayList<GetDataanak> model2) {
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
        TextView tv_ket_anak_ke, etxnamaanak, etxjenis_kelamin, etxttlanak, etxanakke, etxdari,
                etxnoaktekelahiran, etxnobpjsanak;
                @SuppressLint("ViewHolder") View view1 = this.inflater.inflate((int) R.layout.list_dataorangtuadanibusisiibu, (ViewGroup) null);
        if (view1 != null) {
            tv_ket_anak_ke = view1.findViewById(R.id.tv_ket_anak_ke);
            etxnamaanak = view1.findViewById(R.id.etxnamaanak);
            etxjenis_kelamin = view1.findViewById(R.id.etxjenis_kelamin);
            etxttlanak = view1.findViewById(R.id.etxttlanak);
            etxanakke = view1.findViewById(R.id.etxanakke);
            etxdari = view1.findViewById(R.id.etxdari);
            etxnoaktekelahiran = view1.findViewById(R.id.etxnoaktekelahiran);
            etxnobpjsanak = view1.findViewById(R.id.etxnobpjsanak);
            nomor = Integer.valueOf(position + 1);

            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM YYYY");
            try {
                Date date = inputFormat.parse(this.model.get(position).getTanggal_lahir_anak());
                tanggal_lahir_anak = outputFormat.format(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }

            tv_ket_anak_ke.setText("Data Anak Ke- " + nomor);
            etxnamaanak.setText(this.model.get(position).getNama());
            etxjenis_kelamin.setText(this.model.get(position).getJenis_kelamin());
            etxttlanak.setText(this.model.get(position).getTempat_lahir_anak()+"/"+tanggal_lahir_anak);
            etxanakke.setText(this.model.get(position).getAnak_ke());
            etxdari.setText(this.model.get(position).getDari());
            etxnoaktekelahiran.setText(this.model.get(position).getNo_akta_kelahiran());
            etxnobpjsanak.setText(this.model.get(position).getNo_jkn_bpjs());
        }
        return view1;
    }
}
