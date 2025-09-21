package com.example.aplikasiibu.AdapterDataObstetri;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasiibu.Dataobstetri;
import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDataobstetri extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDataobstetri> model;

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
        View view1 = this.inflater.inflate((int) R.layout.list_data_obstetri, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.nama_ibu)).setText(this.model.get(position).getNama_ibu());
            ((TextView) view1.findViewById(R.id.nik)).setText(this.model.get(position).getNik());
            ((TextView) view1.findViewById(R.id.ttl)).setText(this.model.get(position).getTempat_atau_tanggal_lahir_ibu());
            ((TextView) view1.findViewById(R.id.jmlkehamilan)).setText("4");
            ((ImageView) view1.findViewById(R.id.tomboleksport)).setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataobstetri.this.context.getApplicationContext(), Dataobstetri.class);
                    intent.addFlags(268435456);
                    intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", AdaptorDataobstetri.this.model.get(position).getId());
                    AdaptorDataobstetri.this.context.getApplicationContext().startActivity(intent);
                }
            });
        }
        return view1;
    }
}
