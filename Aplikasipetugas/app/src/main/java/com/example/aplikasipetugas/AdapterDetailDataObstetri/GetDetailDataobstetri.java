package com.example.aplikasipetugas.AdapterDetailDataObstetri;

public class GetDetailDataobstetri {
    String berat_lahir_atau_panjang_lahir = "";
    int id = 0;
    String kehamilan_ke = "";
    String komplikasi_kehamilan_dan_persalinan = "";
    String kondisi_anak_saat_ini = "";
    String lahir_aterm = "";
    String lahir_hidup = "";
    String lahir_spontan = "";
    String tahun = "";
    String tempat_bersalin_dan_tenakes = "";

    public GetDetailDataobstetri(int id2, String kehamilan_ke2, String tahun2, String lahir_hidup2, String lahir_aterm2, String lahir_spontan2, String berat_lahir_atau_panjang_lahir2, String tempat_bersalin_dan_tenakes2, String kondisi_anak_saat_ini2, String komplikasi_kehamilan_dan_persalinan2) {
        this.kehamilan_ke = kehamilan_ke2;
        this.tahun = tahun2;
        this.lahir_hidup = lahir_hidup2;
        this.lahir_aterm = lahir_aterm2;
        this.lahir_spontan = lahir_spontan2;
        this.berat_lahir_atau_panjang_lahir = berat_lahir_atau_panjang_lahir2;
        this.tempat_bersalin_dan_tenakes = tempat_bersalin_dan_tenakes2;
        this.kondisi_anak_saat_ini = kondisi_anak_saat_ini2;
        this.komplikasi_kehamilan_dan_persalinan = komplikasi_kehamilan_dan_persalinan2;
        this.id = id2;
    }

    public String getKehamilan_ke() {
        return this.kehamilan_ke;
    }

    public String getTahun() {
        return this.tahun;
    }

    public String getLahir_hidup() {
        return this.lahir_hidup;
    }

    public String getLahir_aterm() {
        return this.lahir_aterm;
    }

    public String getLahir_spontan() {
        return this.lahir_spontan;
    }

    public String getBerat_lahir_atau_panjang_lahir() {
        return this.berat_lahir_atau_panjang_lahir;
    }

    public String getTempat_bersalin_dan_tenakes() {
        return this.tempat_bersalin_dan_tenakes;
    }

    public String getKondisi_anak_saat_ini() {
        return this.kondisi_anak_saat_ini;
    }

    public String getKomplikasi_kehamilan_dan_persalinan() {
        return this.komplikasi_kehamilan_dan_persalinan;
    }

    public int getId() {
        return this.id;
    }
}
