package com.example.aplikasipetugas.AdapterInputanDataAnak;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.aplikasipetugas.Edit_Data_Anak;
import com.example.aplikasipetugas.R;

import java.util.ArrayList;

public class AdaptorInputanDataanak extends BaseAdapter {
    public static Integer nomor;
    Context context;
    LayoutInflater inflater;
    ArrayList<GetInputanDataanak> model;

    public AdaptorInputanDataanak(Context context2, ArrayList<GetInputanDataanak> model2) {
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
        boolean z;
        final int i = position;
        @SuppressLint("ViewHolder") View view1 = this.inflater.inflate((int) R.layout.list_data_tambahdataorangtuadananak, (ViewGroup) null);
        if (view1 != null) {
            TextView tv_ket_anak_ke = (TextView) view1.findViewById(R.id.tv_ket_anak_ke);
            EditText etxnamaanak = (EditText) view1.findViewById(R.id.etxnamaanak);
            Spinner spinnerjenis_kelamin = (Spinner) view1.findViewById(R.id.spinnerjenis_kelamin);
            EditText etxttempatlahiranak = (EditText) view1.findViewById(R.id.etxtempatlahiranak);
            EditText etxttanggallahiranak = (EditText) view1.findViewById(R.id.etxtanggallahiranak);
            EditText etxanakke = (EditText) view1.findViewById(R.id.etxanakke);
            EditText etxdari = (EditText) view1.findViewById(R.id.etxdari);
            EditText etxnoaktekelahiran = (EditText) view1.findViewById(R.id.etxnoaktekelahiran);
            EditText etxnobpjsanak = (EditText) view1.findViewById(R.id.etxnobpjsanak);
            ImageView tomboledit = (ImageView) view1.findViewById(R.id.tomboledit);
            ImageView imageView = (ImageView) view1.findViewById(R.id.tombolhapus);
            nomor = Integer.valueOf(i + 1);
            tv_ket_anak_ke.setText("Data Anak Ke- " + nomor);
            etxnamaanak.setText(this.model.get(i).getNama());
            etxttempatlahiranak.setText(this.model.get(i).getTempat_lahir_anak());
            etxttanggallahiranak.setText(this.model.get(i).getTanggal_lahir_anak());
            etxanakke.setText(this.model.get(i).getAnak_ke());
            etxdari.setText(this.model.get(i).getDari());
            etxnoaktekelahiran.setText(this.model.get(i).getNo_akta_kelahiran());
            etxnobpjsanak.setText(this.model.get(i).getNo_jkn_bpjs());
            String jk = this.model.get(i).getJenis_kelamin();
            if (jk.equals("Laki-Laki")) {
                z = true;
                spinnerjenis_kelamin.setSelection(0, true);
            } else {
                z = true;
            }
            if (jk.equals("Perempuan")) {
                spinnerjenis_kelamin.setSelection(z ? 1 : 0, z);
            }
            tv_ket_anak_ke.setCursorVisible(false);
            etxnamaanak.setCursorVisible(false);
            etxttempatlahiranak.setCursorVisible(false);
            etxttanggallahiranak.setCursorVisible(false);
            etxanakke.setCursorVisible(false);
            etxdari.setCursorVisible(false);
            etxnoaktekelahiran.setCursorVisible(false);
            etxnobpjsanak.setCursorVisible(false);
            tomboledit.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                public void onClick(View view) {
                    Intent intent = new Intent(AdaptorInputanDataanak.this.context.getApplicationContext(), Edit_Data_Anak.class);
                    intent.addFlags(268435456);
                    intent.putExtra("dataid", AdaptorInputanDataanak.this.model.get(i).getId());
                    intent.putExtra("nik_ibu", AdaptorInputanDataanak.this.model.get(i).getNik_ibu());
                    intent.putExtra("namaanak", AdaptorInputanDataanak.this.model.get(i).getNama());
                    intent.putExtra("jeniskelamin", AdaptorInputanDataanak.this.model.get(i).getJenis_kelamin());
                    intent.putExtra("tempatlahiranak", AdaptorInputanDataanak.this.model.get(i).getTempat_lahir_anak());
                    intent.putExtra("tanggallahiranak", AdaptorInputanDataanak.this.model.get(i).getTanggal_lahir_anak());
                    intent.putExtra("anak_ke", AdaptorInputanDataanak.this.model.get(i).getAnak_ke());
                    intent.putExtra("dari", AdaptorInputanDataanak.this.model.get(i).getDari());
                    intent.putExtra("no_akta_kelahiran", AdaptorInputanDataanak.this.model.get(i).getNo_akta_kelahiran());
                    intent.putExtra("no_jkn_bpjs", AdaptorInputanDataanak.this.model.get(i).getNo_jkn_bpjs());
                    AdaptorInputanDataanak.this.context.getApplicationContext().startActivity(intent);
                }
            });
        }
        return view1;
    }
}
