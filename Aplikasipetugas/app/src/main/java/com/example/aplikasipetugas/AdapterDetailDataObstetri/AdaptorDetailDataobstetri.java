package com.example.aplikasipetugas.AdapterDetailDataObstetri;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.Configurasi;
import com.example.aplikasipetugas.Detail_dataobstetri;
import com.example.aplikasipetugas.Edit_detail_data_obstetri;
import com.example.aplikasipetugas.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AdaptorDetailDataobstetri extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailDataobstetri> model;

    public AdaptorDetailDataobstetri(Context context2, ArrayList<GetDetailDataobstetri> model2) {
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
        final int i = position;
        View view1 = this.inflater.inflate((int) R.layout.list_detail_data_obstetri, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.kehamilan_ke)).setText(this.model.get(i).getKehamilan_ke());
            ((TextView) view1.findViewById(R.id.tahun)).setText(this.model.get(i).getTahun());
            ((TextView) view1.findViewById(R.id.lahir_hidup)).setText(this.model.get(i).getLahir_hidup());
            ((TextView) view1.findViewById(R.id.lahir_aterm)).setText(this.model.get(i).getLahir_aterm());
            ((TextView) view1.findViewById(R.id.lahir_spontan)).setText(this.model.get(i).getLahir_spontan());
            ((TextView) view1.findViewById(R.id.berat_lahir_atau_panjang_lahir)).setText(this.model.get(i).getBerat_lahir_atau_panjang_lahir());
            ((TextView) view1.findViewById(R.id.tempat_bersalin_dan_tenakes)).setText(this.model.get(i).getTempat_bersalin_dan_tenakes());
            ((TextView) view1.findViewById(R.id.kondisi_anak_saat_ini)).setText(this.model.get(i).getKondisi_anak_saat_ini());
            ((TextView) view1.findViewById(R.id.komplikasi_kehamilan_dan_persalinan)).setText(this.model.get(i).getKomplikasi_kehamilan_dan_persalinan());
            ((ImageView) view1.findViewById(R.id.tomboledit)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDetailDataobstetri.this.context.getApplicationContext(), Edit_detail_data_obstetri.class);
                    intent.putExtra("dataid", AdaptorDetailDataobstetri.this.model.get(i).getId());
                    intent.putExtra("nama", Detail_dataobstetri.nama_ibu1);
                    intent.putExtra("nik", Detail_dataobstetri.nik1_ibu);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDetailDataobstetri.this.context.getApplicationContext().startActivity(intent);
                }
            });
            ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Volley.newRequestQueue(context).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapusdataobstetri/" + model.get(position).getId(), new Response.Listener<String>() {
                        public void onResponse(String response) {
                            try {
                                if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                    model.remove(position);
                                    notifyDataSetChanged();
                                    Toast.makeText(context, "Berhasil Terhapus", Toast.LENGTH_SHORT).show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }, new Response.ErrorListener() {
                        public void onErrorResponse(VolleyError error) {
                        }
                    }));
                }
            });
        }
        return view1;
    }
}
