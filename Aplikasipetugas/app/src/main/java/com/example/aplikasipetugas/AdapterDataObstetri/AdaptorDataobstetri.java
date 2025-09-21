package com.example.aplikasipetugas.AdapterDataObstetri;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.aplikasipetugas.Dataobstetri;
import com.example.aplikasipetugas.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdaptorDataobstetri extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDataobstetri> model;
    String tanggal_lahir_ibu;

    public AdaptorDataobstetri(Context context2, ArrayList<GetDataobstetri> model2) {
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

    public View getView(final int position, View view, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder") View view1 = this.inflater.inflate((int) R.layout.list_data_obstetri, (ViewGroup) null);
        if (view1 != null) {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM YYYY");
            try {
                Date date = inputFormat.parse(this.model.get(position).getTanggal_lahir_ibu());
                tanggal_lahir_ibu = outputFormat.format(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }
            ((TextView) view1.findViewById(R.id.nama_ibu)).setText(this.model.get(position).getNama_ibu());
            ((TextView) view1.findViewById(R.id.nik)).setText(this.model.get(position).getNik());
            ((TextView) view1.findViewById(R.id.ttl)).setText(this.model.get(position).getTempat_lahir_ibu()+"/"+tanggal_lahir_ibu);
            ((TextView) view1.findViewById(R.id.alamat)).setText(this.model.get(position).getAlamat_rumah());

            ((ImageView) view1.findViewById(R.id.tomboleksport)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataobstetri.this.context.getApplicationContext(), Dataobstetri.class);
                    intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", AdaptorDataobstetri.this.model.get(position).getId());
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDataobstetri.this.context.getApplicationContext().startActivity(intent);
                }
            });
        }
        return view1;
    }
}
