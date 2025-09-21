package com.example.aplikasiibu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Beranda extends Fragment {
    public static CharSequence jam;
    CardView chatting;
    TextView copyright;
    CardView datakesehatananak;
    CardView datakesehatanibu;
    CardView dataobstetri;
    CardView dataorangtuadananak;
    CardView jadwal_posyandu;
    String status_absen;
    ImageView tombol_tentang_aplikasi;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate((int) R.layout.halaman_beranda, (ViewGroup) null);
        this.jadwal_posyandu = (CardView) view.findViewById(R.id.cardviewjadwalposyandu);
        this.dataorangtuadananak = (CardView) view.findViewById(R.id.cardviewdataorangtuadananak);
        this.dataobstetri = (CardView) view.findViewById(R.id.cardviewdataobstetri);
        this.datakesehatanibu = (CardView) view.findViewById(R.id.cardviewdatakesehatanibu);
        this.datakesehatananak = (CardView) view.findViewById(R.id.cardviewdatakesehatananak);
        this.chatting = (CardView) view.findViewById(R.id.cardviewchatting);
        ImageView imageView = (ImageView) view.findViewById(R.id.tombol_tentang_aplikasi);
        this.tombol_tentang_aplikasi = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Tentangaplikasi.class));
            }
        });
        this.jadwal_posyandu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Jadwalposyandu.class));
            }
        });
        this.dataorangtuadananak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Halamandatadanorangtuaibu.class));
            }
        });
        this.dataobstetri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Detail_dataobstetri.class));
            }
        });
        this.datakesehatanibu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Detail_data_kesehatan_ibu_hamil.class));
            }
        });
        this.datakesehatananak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Kesehatan_bayi_baru_lahir.class));
            }
        });
        this.chatting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Beranda.this.startActivity(new Intent(Beranda.this.getContext(), Halaman_Chatting.class));
            }
        });
        return view;
    }

}
