package com.example.aplikasipetugas;

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
    TextView tvNomorhp;
    TextView tvPassword;
    TextView tvUsername;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.halaman_profil, (ViewGroup) null);
        this.tvNama = (TextView) view.findViewById(R.id.tvNama);
        this.tvAlamat = (TextView) view.findViewById(R.id.tvAlamat);
        this.tvNomorhp = (TextView) view.findViewById(R.id.tvNomorhp);
        this.tvUsername = (TextView) view.findViewById(R.id.tvUsername);
        this.tvPassword = (TextView) view.findViewById(R.id.tvPassword);
        this.foto = (ImageView) view.findViewById(R.id.foto);
        this.tvNama.setText(Halaman_Login.nama);
        this.tvAlamat.setText(Halaman_Login.alamat);
        this.tvNomorhp.setText(Halaman_Login.nomorhp);
        this.tvUsername.setText(Halaman_Login.username);
        this.tvPassword.setText(Halaman_Login.password);
        return view;
    }
}
