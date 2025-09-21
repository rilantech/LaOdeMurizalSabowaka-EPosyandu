package com.example.aplikasipetugas.AdapterDetailDataKesehatanIbuHamil;

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
import com.example.aplikasipetugas.Data_kesehatan_ibu;
import com.example.aplikasipetugas.Detail_data_kesehatan_ibu_hamil;
import com.example.aplikasipetugas.Edit_detail_kesehatan_ibu_hamil;
import com.example.aplikasipetugas.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AdaptorDetailDataKesehatanIbuHamil extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<GetDetailDataKesehatanIbuHamil> model;

    public AdaptorDetailDataKesehatanIbuHamil(Context context2, ArrayList<GetDetailDataKesehatanIbuHamil> model2) {
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
        View view1 = this.inflater.inflate(R.layout.list_detail_data_kesehatan_ibu_hamil, (ViewGroup) null);
        if (view1 != null) {
            ((TextView) view1.findViewById(R.id.kehamilan_ke)).setText(this.model.get(i).getKehamilan_ke());
            ((TextView) view1.findViewById(R.id.hari_terakhir_haid_pertama)).setText(this.model.get(i).getHari_pertama_haid_terakhir());
            ((TextView) view1.findViewById(R.id.hari_taksiran_persalinan)).setText(this.model.get(i).getHari_taksiran_persalinan());
            ((TextView) view1.findViewById(R.id.golongan_darah)).setText(this.model.get(i).getGolongan_darah());
            ((TextView) view1.findViewById(R.id.penggunaan_kontrasepsi_sebelum_hamil)).setText(this.model.get(i).getPenggunaan_kontrasepsi_sebelum_hamil());
            ((TextView) view1.findViewById(R.id.riwayat_penyakit_yang_di_derita_ibu)).setText(this.model.get(i).getRiwayat_penyakit_yg_di_derita_ibu());
            ((TextView) view1.findViewById(R.id.riwayat_alergi)).setText(this.model.get(i).getRiwayat_alergi());
            ((TextView) view1.findViewById(R.id.status_imunisasi)).setText(this.model.get(i).getStatus_imunisasi_tetanus_terakhir());
            ((TextView) view1.findViewById(R.id.tinggi_badan)).setText(this.model.get(i).getTinggi_badan());
            ((ImageView) view1.findViewById(R.id.tomboledit)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDetailDataKesehatanIbuHamil.this.context.getApplicationContext(), Edit_detail_kesehatan_ibu_hamil.class);
                    intent.putExtra("dataid", AdaptorDetailDataKesehatanIbuHamil.this.model.get(i).getId());
                    intent.putExtra("nikibu", AdaptorDetailDataKesehatanIbuHamil.this.model.get(i).getNik_ibu());
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDetailDataKesehatanIbuHamil.this.context.getApplicationContext().startActivity(intent);
                }
            });
            ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Volley.newRequestQueue(context).add(new StringRequest(3, new Configurasi().baseUrl() + "api/hapusdatakesehatanibuhamil/" + model.get(position).getId(), new Response.Listener<String>() {
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
            ((ImageView) view1.findViewById(R.id.tomboleksport)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDetailDataKesehatanIbuHamil.this.context.getApplicationContext(), Detail_data_kesehatan_ibu_hamil.class);
                    intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", Data_kesehatan_ibu.id_data_kesehatan_ibu_hamil);
                    intent.putExtra("kehamilan_ke", AdaptorDetailDataKesehatanIbuHamil.this.model.get(i).getKehamilan_ke());
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDetailDataKesehatanIbuHamil.this.context.getApplicationContext().startActivity(intent);
                }
            });
        }
        return view1;
    }
}
