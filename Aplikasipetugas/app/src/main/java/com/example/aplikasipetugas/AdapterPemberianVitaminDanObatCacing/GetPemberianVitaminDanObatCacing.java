package com.example.aplikasipetugas.AdapterPemberianVitaminDanObatCacing;

public class GetPemberianVitaminDanObatCacing {
    String anak_ke = "";
    int id = 0;
    String nama_anak = "";
    String nama_ibu = "";
    String nama_ayah = "";
    String nik_ibu = "";

    public GetPemberianVitaminDanObatCacing(int id2, String nama_anak2, String nama_ibu2, String nik_ibu2, String nama_ayah, String anak_ke2) {
        this.nik_ibu = nik_ibu2;
        this.nama_anak = nama_anak2;
        this.nama_ibu = nama_ibu2;
        this.nama_ayah = nama_ayah;
        this.anak_ke = anak_ke2;
        this.id = id2;
    }

    public String getNik_ibu() {
        return this.nik_ibu;
    }

    public String getNama_bayi() {
        return this.nama_anak;
    }

    public String getNama_ibu() {
        return this.nama_ibu;
    }

    public String getNama_ayah() {
        return this.nama_ayah;
    }

    public String getAnak_ke() {
        return this.anak_ke;
    }

    public int getId() {
        return this.id;
    }
}
