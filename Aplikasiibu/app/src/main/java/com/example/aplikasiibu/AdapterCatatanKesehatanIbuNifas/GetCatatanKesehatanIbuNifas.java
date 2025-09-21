package com.example.aplikasiibu.AdapterCatatanKesehatanIbuNifas;

public class GetCatatanKesehatanIbuNifas {
    String analisa = "";
    String bb = "";
    String catatan_tambahan = "";
    int id = 0;
    String imunisasi = "";
    String kehamilan_ke = "";
    String keluhan = "";
    String konseling = "";
    String lab = "";
    String letak_janin = "";
    String lila = "";
    String nama_pemeriksa = "";
    String nik_ibu = "";
    String tablet_tambah_darah = "";
    String tanggal = "";
    String tata_laksana = "";
    String td = "";
    String tinggi_fundus = "";
    String uk = "";

    public GetCatatanKesehatanIbuNifas(int id2, String nik_ibu2, String kehamilan_ke2, String tanggal2, String nama_pemeriksa2, String keluhan2, String uk2, String bb2, String td2, String lila2, String tinggi_fundus2, String letak_janin2, String imunisasi2, String tablet_tambah_darah2, String lab2, String analisa2, String tata_laksana2, String konseling2, String catatan_tambahan2) {
        this.nik_ibu = nik_ibu2;
        this.kehamilan_ke = kehamilan_ke2;
        this.tanggal = tanggal2;
        this.nama_pemeriksa = nama_pemeriksa2;
        this.keluhan = keluhan2;
        this.uk = uk2;
        this.bb = bb2;
        this.td = td2;
        this.lila = lila2;
        this.tinggi_fundus = tinggi_fundus2;
        this.letak_janin = letak_janin2;
        this.imunisasi = imunisasi2;
        this.tablet_tambah_darah = tablet_tambah_darah2;
        this.lab = lab2;
        this.analisa = analisa2;
        this.tata_laksana = tata_laksana2;
        this.konseling = konseling2;
        this.catatan_tambahan = catatan_tambahan2;
        this.id = id2;
    }

    public String getNik_ibu() {
        return this.nik_ibu;
    }

    public String getKehamilan_ke() {
        return this.kehamilan_ke;
    }

    public String getTanggal() {
        return this.tanggal;
    }

    public String getNama_pemeriksa() {
        return this.nama_pemeriksa;
    }

    public String getKeluhan() {
        return this.keluhan;
    }

    public String getUk() {
        return this.uk;
    }

    public String getBb() {
        return this.bb;
    }

    public String getTd() {
        return this.td;
    }

    public String getLila() {
        return this.lila;
    }

    public String getTinggi_fundus() {
        return this.tinggi_fundus;
    }

    public String getLetak_janin() {
        return this.letak_janin;
    }

    public String getImunisasi() {
        return this.imunisasi;
    }

    public String getTablet_tambah_darah() {
        return this.tablet_tambah_darah;
    }

    public String getLab() {
        return this.lab;
    }

    public String getAnalisa() {
        return this.analisa;
    }

    public String getTata_laksana() {
        return this.tata_laksana;
    }

    public String getKonseling() {
        return this.konseling;
    }

    public String getCatatan_tambahan() {
        return this.catatan_tambahan;
    }

    public int getId() {
        return this.id;
    }
}
