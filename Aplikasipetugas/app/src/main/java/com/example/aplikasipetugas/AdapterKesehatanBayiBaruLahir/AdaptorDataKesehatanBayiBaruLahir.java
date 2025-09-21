package com.example.aplikasipetugas.AdapterKesehatanBayiBaruLahir;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.example.aplikasipetugas.Kesehatan_bayi_baru_lahir;
import com.example.aplikasipetugas.R;

import java.util.ArrayList;
public class AdaptorDataKesehatanBayiBaruLahir extends BaseAdapter {
    public static String id;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetKesehatanBayiBaruLahir> model;

    public AdaptorDataKesehatanBayiBaruLahir(Context context2, ArrayList<GetKesehatanBayiBaruLahir> model2) {
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
        @SuppressLint("ViewHolder") View view1;
        view1 = this.inflater.inflate((int) R.layout.list_kesehatan_bayi_baru_lahir, (ViewGroup) null);
        if (view1 != null) {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = (ImageView) view1.findViewById(R.id.tomboledit);
            ((TextView) view1.findViewById(R.id.nama_bayi)).setText(this.model.get(position).getNama_bayi());
            ((TextView) view1.findViewById(R.id.nama_ibu)).setText(this.model.get(position).getNama_ibu());
            ((TextView) view1.findViewById(R.id.nama_ayah)).setText(this.model.get(position).getNama_ayah());
            ((TextView) view1.findViewById(R.id.anak_ke)).setText(this.model.get(position).getAnak_ke());
            ((ImageView) view1.findViewById(R.id.tomboleksport)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataKesehatanBayiBaruLahir.this.context.getApplicationContext(), Kesehatan_bayi_baru_lahir.class);
                    intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", AdaptorDataKesehatanBayiBaruLahir.this.model.get(position).getId());
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDataKesehatanBayiBaruLahir.this.context.getApplicationContext().startActivity(intent);
                }
            });
            ((ImageView) view1.findViewById(R.id.tombolhapus)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view1.getContext());
                    builder.setMessage((CharSequence) "Apakah Ingin Menghapus?");
                    builder.setPositiveButton((CharSequence) "Ya", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int position) {
                        }
                    });
                    builder.setNegativeButton((CharSequence) "Tidak", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.create().show();
                }
            });
        }
        return view1;
    }
}
