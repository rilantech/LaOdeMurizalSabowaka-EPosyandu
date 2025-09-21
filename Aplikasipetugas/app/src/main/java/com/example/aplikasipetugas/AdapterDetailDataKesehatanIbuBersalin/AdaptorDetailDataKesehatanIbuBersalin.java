package com.example.aplikasipetugas.AdapterDetailDataKesehatanIbuBersalin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aplikasipetugas.Configurasi;
import com.example.aplikasipetugas.Data_Kesehatan_Ibubersalin;
import com.example.aplikasipetugas.Detail_data_kesehatan_ibu_hamil;
import com.example.aplikasipetugas.Detail_kesehatan_ibu_bersalin;
import com.example.aplikasipetugas.Edit_catatan_kesehatan_ibu_bersalin;
import com.example.aplikasipetugas.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AdaptorDetailDataKesehatanIbuBersalin extends BaseAdapter {
    public static Integer nomor;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailDataKesehatanIbuBersalin> model;

    public AdaptorDetailDataKesehatanIbuBersalin(Context context2, ArrayList<GetDetailDataKesehatanIbuBersalin> model2) {
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
        View view1 = this.inflater.inflate(R.layout.list_detail_data_kesehatan_ibu_bersalin, (ViewGroup) null);
        if (view1 == null) {
            return view1;
        }
        TextView anak_ke = (TextView) view1.findViewById(R.id.anak_ke);
        TextView kondisi_bayi_saat_lahir = (TextView) view1.findViewById(R.id.kondisi_bayi_saat_lahir);
        TextView asuhan_bayi_baru_lahir = (TextView) view1.findViewById(R.id.asuhan_bayi_baru_lahir);
        ImageView tomboleksport = (ImageView) view1.findViewById(R.id.tomboleksport);
        ImageView tomboledit = (ImageView) view1.findViewById(R.id.tomboledit);
        View view12 = view1;
        anak_ke.setText(this.model.get(i).getAnak_ke());
        ((TextView) view1.findViewById(R.id.tanggal_persalinan)).setText(this.model.get(i).getTanggal_persalinan());
        ((TextView) view1.findViewById(R.id.pukul)).setText(this.model.get(i).getPukul());
        ((TextView) view1.findViewById(R.id.umur_kehamilan)).setText(this.model.get(i).getUmur_kehamilan());
        ((TextView) view1.findViewById(R.id.penolong_persalinan)).setText(this.model.get(i).getPenolong_persalinan());
        ((TextView) view1.findViewById(R.id.cara_persalinan)).setText(this.model.get(i).getCara_persalinan());
        ((TextView) view1.findViewById(R.id.keadaan_ibu)).setText(this.model.get(i).getKeadaan_ibu());
        ((TextView) view1.findViewById(R.id.berat_lahir)).setText(this.model.get(i).getBerat_lahir());
        ((TextView) view1.findViewById(R.id.panjang_badan)).setText(this.model.get(i).getPanjang_badan());
        ((TextView) view1.findViewById(R.id.lingkar_kepala)).setText(this.model.get(i).getLingkar_kepala());
        ((TextView) view1.findViewById(R.id.jenis_kelamin)).setText(this.model.get(i).getJenis_kelamin());
        TextView textView = anak_ke;
        kondisi_bayi_saat_lahir.setText(this.model.get(i).getKondisi_bayi_saat_lahir());
        asuhan_bayi_baru_lahir.setText(this.model.get(i).getAsuhan_bayi_baru_lahir());
        tomboledit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(AdaptorDetailDataKesehatanIbuBersalin.this.context.getApplicationContext(), Edit_catatan_kesehatan_ibu_bersalin.class);
                intent.putExtra("dataid", AdaptorDetailDataKesehatanIbuBersalin.this.model.get(i).getId());
                intent.putExtra("nikibu", AdaptorDetailDataKesehatanIbuBersalin.this.model.get(i).getNik_ibu());
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                AdaptorDetailDataKesehatanIbuBersalin.this.context.getApplicationContext().startActivity(intent);
            }
        });
        ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Volley.newRequestQueue(context).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapusdatakesehatanibubersalin/" + model.get(position).getId(), new Response.Listener<String>() {
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
        tomboleksport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(AdaptorDetailDataKesehatanIbuBersalin.this.context.getApplicationContext(), Detail_kesehatan_ibu_bersalin.class);
                AdaptorDetailDataKesehatanIbuBersalin.nomor = Integer.valueOf(i + 1);
                intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", Data_Kesehatan_Ibubersalin.id_data_kesehatan_ibu_bersalin);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                AdaptorDetailDataKesehatanIbuBersalin.this.context.getApplicationContext().startActivity(intent);
            }
        });
        return view12;
    }
}
