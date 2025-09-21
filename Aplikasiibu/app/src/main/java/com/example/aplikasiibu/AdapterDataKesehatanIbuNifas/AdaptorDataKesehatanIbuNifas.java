package com.example.aplikasiibu.AdapterDataKesehatanIbuNifas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasiibu.Configurasi;
import com.example.aplikasiibu.R;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class AdaptorDataKesehatanIbuNifas extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    String jumlahnifas;
    ArrayList<GetDataKesehatanIbuNifas> model;

    public AdaptorDataKesehatanIbuNifas(Context context2, ArrayList<GetDataKesehatanIbuNifas> model2) {
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
        View view1 = this.inflater.inflate((int) R.layout.list_data_kesehatan_ibu_nifas, (ViewGroup) null);
        String url = new Configurasi().baseUrl() + "api/hitungdatanifas/" + this.model.get(i).getId();
        if (view1 != null) {
            final TextView jmlnifas = (TextView) view1.findViewById(R.id.jmlnifas);
            ImageView imageView = (ImageView) view1.findViewById(R.id.tomboleksport);
            ((TextView) view1.findViewById(R.id.nama_ibu)).setText(this.model.get(i).getNama_ibu());
            ((TextView) view1.findViewById(R.id.nik)).setText(this.model.get(i).getNik());
            ((TextView) view1.findViewById(R.id.ttl)).setText(this.model.get(i).getTempat_atau_tanggal_lahir_ibu());
            Volley.newRequestQueue(this.context).add(new JsonObjectRequest(0, url, (JSONObject) null, new Response.Listener<JSONObject>() {
                public void onResponse(JSONObject response) {
                    try {
                        AdaptorDataKesehatanIbuNifas.this.jumlahnifas = response.getString("jumlahnifas");
                        jmlnifas.setText(AdaptorDataKesehatanIbuNifas.this.jumlahnifas);
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
            }, new Response.ErrorListener() {
                public void onErrorResponse(VolleyError volleyError) {
                    Toast.makeText(AdaptorDataKesehatanIbuNifas.this.context.getApplicationContext(), volleyError.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }));
        }
        return view1;
    }
}
