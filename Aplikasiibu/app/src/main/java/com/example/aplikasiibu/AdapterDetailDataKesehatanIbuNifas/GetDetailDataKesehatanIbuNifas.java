package com.example.aplikasiibu.AdapterDetailDataKesehatanIbuNifas;

public class GetDetailDataKesehatanIbuNifas {
    String dan_lain_lain_1 = "";
    String dan_lain_lain_2 = "";
    String dan_lain_lain_3 = "";
    int id = 0;
    String kondisi_ibu_secara_umum_1 = "";
    String kondisi_ibu_secara_umum_2 = "";
    String kondisi_ibu_secara_umum_3 = "";
    String kondisi_perineum_1 = "";
    String kondisi_perineum_2 = "";
    String kondisi_perineum_3 = "";
    String nama_anak = "";
    String nifas_ke = "";
    String nik_ibu = "";
    String tanggal_kunjungan_1 = "";
    String tanggal_kunjungan_2 = "";
    String tanggal_kunjungan_3 = "";
    String tekanan_darah_1 = "";
    String tekanan_darah_2 = "";
    String tekanan_darah_3 = "";

    public GetDetailDataKesehatanIbuNifas(int id2, String nik_ibu2, String nifas_ke2, String nama_anak2, String tanggal_kunjungan_12, String tanggal_kunjungan_22, String tanggal_kunjungan_32, String kondisi_ibu_secara_umum_12, String kondisi_ibu_secara_umum_22, String kondisi_ibu_secara_umum_32, String tekanan_darah_12, String tekanan_darah_22, String tekanan_darah_32, String kondisi_perineum_12, String kondisi_perineum_22, String kondisi_perineum_32, String dan_lain_lain_12, String dan_lain_lain_22, String dan_lain_lain_32) {
        this.nik_ibu = nik_ibu2;
        this.nifas_ke = nifas_ke2;
        this.nama_anak = nama_anak2;
        this.tanggal_kunjungan_1 = tanggal_kunjungan_12;
        this.tanggal_kunjungan_2 = tanggal_kunjungan_22;
        this.tanggal_kunjungan_3 = tanggal_kunjungan_32;
        this.kondisi_ibu_secara_umum_1 = kondisi_ibu_secara_umum_12;
        this.kondisi_ibu_secara_umum_2 = kondisi_ibu_secara_umum_22;
        this.kondisi_ibu_secara_umum_3 = kondisi_ibu_secara_umum_32;
        this.tekanan_darah_1 = tekanan_darah_12;
        this.tekanan_darah_2 = tekanan_darah_22;
        this.tekanan_darah_3 = tekanan_darah_32;
        this.kondisi_perineum_1 = kondisi_perineum_12;
        this.kondisi_perineum_2 = kondisi_perineum_22;
        this.kondisi_perineum_3 = kondisi_perineum_32;
        this.dan_lain_lain_1 = dan_lain_lain_12;
        this.dan_lain_lain_2 = dan_lain_lain_22;
        this.dan_lain_lain_3 = dan_lain_lain_32;
        this.id = id2;
    }

    public String getNik_ibu() {
        return this.nik_ibu;
    }

    public String getNifas_ke() {
        return this.nifas_ke;
    }

    public String getNama_anak() {
        return this.nama_anak;
    }

    public String getTanggal_kunjungan_1() {
        return this.tanggal_kunjungan_1;
    }

    public String getTanggal_kunjungan_2() {
        return this.tanggal_kunjungan_2;
    }

    public String getTanggal_kunjungan_3() {
        return this.tanggal_kunjungan_3;
    }

    public String getKondisi_ibu_secara_umum_1() {
        return this.kondisi_ibu_secara_umum_1;
    }

    public String getKondisi_ibu_secara_umum_2() {
        return this.kondisi_ibu_secara_umum_2;
    }

    public String getKondisi_ibu_secara_umum_3() {
        return this.kondisi_ibu_secara_umum_3;
    }

    public String getTekanan_darah_1() {
        return this.tekanan_darah_1;
    }

    public String getTekanan_darah_2() {
        return this.tekanan_darah_2;
    }

    public String getTekanan_darah_3() {
        return this.tekanan_darah_3;
    }

    public String getKondisi_perineum_1() {
        return this.kondisi_perineum_1;
    }

    public String getKondisi_perineum_2() {
        return this.kondisi_perineum_2;
    }

    public String getKondisi_perineum_3() {
        return this.kondisi_perineum_3;
    }

    public String getDan_lain_lain_1() {
        return this.dan_lain_lain_1;
    }

    public String getDan_lain_lain_2() {
        return this.dan_lain_lain_2;
    }

    public String getDan_lain_lain_3() {
        return this.dan_lain_lain_3;
    }

    public int getId() {
        return this.id;
    }
}
