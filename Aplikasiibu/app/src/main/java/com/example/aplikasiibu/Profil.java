package com.example.aplikasiibu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Profil extends Fragment {
    ImageView foto;
    TextView tvAlamat;
    TextView tvNama;
    TextView tvNik;
    TextView tvNomorhp;
    TextView tvPassword;
    TextView tvUsername;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.halaman_profil, (ViewGroup) null);
        this.tvNama = (TextView) view.findViewById(R.id.tvNama);
        this.tvNik = (TextView) view.findViewById(R.id.tvNik);
        this.tvAlamat = (TextView) view.findViewById(R.id.tvAlamat);
        this.tvNomorhp = (TextView) view.findViewById(R.id.tvNomorhp);
        this.tvUsername = (TextView) view.findViewById(R.id.tvUsername);
        this.tvPassword = (TextView) view.findViewById(R.id.tvPassword);
        this.foto = (ImageView) view.findViewById(R.id.foto);
        this.tvNama.setText(HalamanLogin.nama);
        this.tvNik.setText(HalamanLogin.nik_ibu);
        this.tvAlamat.setText(HalamanLogin.alamat);
        this.tvNomorhp.setText(HalamanLogin.nomorhp);
        this.tvUsername.setText(HalamanLogin.username);
        this.tvPassword.setText(HalamanLogin.password);
        return view;
    }
}
