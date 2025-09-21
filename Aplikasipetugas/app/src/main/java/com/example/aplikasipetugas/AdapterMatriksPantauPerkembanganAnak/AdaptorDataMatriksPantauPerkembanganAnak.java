package com.example.aplikasipetugas.AdapterMatriksPantauPerkembanganAnak;

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
import com.example.aplikasipetugas.MatriksPantauPerkembanganAnak;
import com.example.aplikasipetugas.R;

import java.util.ArrayList;

public class AdaptorDataMatriksPantauPerkembanganAnak extends BaseAdapter {
    public static String id;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetMatriksPantauPerkembanganAnak> model;

    public AdaptorDataMatriksPantauPerkembanganAnak(Context context2, ArrayList<GetMatriksPantauPerkembanganAnak> model2) {
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
        view1 = this.inflater.inflate((int) R.layout.list_matriks_pantau_perkembangan_anak, (ViewGroup) null);
        if (view1 != null) {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = (ImageView) view1.findViewById(R.id.tomboledit);
            ((TextView) view1.findViewById(R.id.nama_bayi)).setText(this.model.get(position).getNama_bayi());
            ((TextView) view1.findViewById(R.id.nama_ibu)).setText(this.model.get(position).getNama_ibu());
            ((TextView) view1.findViewById(R.id.nik_ibu)).setText(this.model.get(position).getNik_ibu());
            ((TextView) view1.findViewById(R.id.anak_ke)).setText(this.model.get(position).getAnak_ke());
            ((ImageView) view1.findViewById(R.id.tomboleksport)).setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorDataMatriksPantauPerkembanganAnak.this.context.getApplicationContext(), MatriksPantauPerkembanganAnak.class);
                    intent.addFlags(268435456);
                    intent.putExtra("UploadTaskParameters.Companion.CodingKeys.id", AdaptorDataMatriksPantauPerkembanganAnak.this.model.get(position).getId());
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT|Intent.FLAG_ACTIVITY_NEW_TASK);
                    AdaptorDataMatriksPantauPerkembanganAnak.this.context.getApplicationContext().startActivity(intent);
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
