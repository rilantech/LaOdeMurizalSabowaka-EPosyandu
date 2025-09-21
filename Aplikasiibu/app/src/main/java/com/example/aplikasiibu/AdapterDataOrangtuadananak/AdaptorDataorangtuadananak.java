package com.example.aplikasiibu.AdapterDataOrangtuadananak;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasiibu.Dataorangtuadananak;
import com.example.aplikasiibu.R;

import java.util.ArrayList;

public class AdaptorDataorangtuadananak extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDataorangtuadananak> model;

    public AdaptorDataorangtuadananak(Context context2, ArrayList<GetDataorangtuadananak> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_data_orangtuadananak, (ViewGroup) null);
        if (view1 != null) {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView = (WebView) view1.findViewById(R.id.webview1);
            ((TextView) view1.findViewById(R.id.nama)).setText(this.model.get(position).getNama_ibu());
            ((TextView) view1.findViewById(R.id.nik)).setText(this.model.get(position).getNik());
            ((TextView) view1.findViewById(R.id.ttl)).setText(this.model.get(position).getTempat_atau_tanggal_lahir_ibu());
            ((TextView) view1.findViewById(R.id.jmlanak)).setText("4");

            ((ImageView) view1.findViewById(R.id.tomboleksport)).setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataorangtuadananak.this.context.getApplicationContext(), Dataorangtuadananak.class);
                    intent.addFlags(268435456);
                    intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", AdaptorDataorangtuadananak.this.model.get(position).getId());
                    AdaptorDataorangtuadananak.this.context.getApplicationContext().startActivity(intent);
                }
            });

            ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataorangtuadananak.this.context.getApplicationContext(), Dataorangtuadananak.class);
                    intent.addFlags(268435456);
                    intent.putExtra("id_hapus", AdaptorDataorangtuadananak.this.model.get(position).getId());
                    AdaptorDataorangtuadananak.this.context.getApplicationContext().startActivity(intent);
                }
            });

        }
        return view1;
    }
}
