package com.example.aplikasipetugas.AdapterDetailDataKesehatanIbuHamil;

public class GetDetailDataKesehatanIbuHamil {
    String golongan_darah = "";
    String hari_pertama_haid_terakhir = "";
    String hari_taksiran_persalinan = "";
    int id = 0;
    String kehamilan_ke = "";
    String nik_ibu = "";
    String penggunaan_kontrasepsi_sebelum_hamil = "";
    String riwayat_alergi = "";
    String riwayat_penyakit_yg_di_derita_ibu = "";
    String status_imunisasi_tetanus_terakhir = "";
    String tinggi_badan = "";

    public GetDetailDataKesehatanIbuHamil(int id2, String nik_ibu2, String kehamilan_ke2, String hari_pertama_haid_terakhir2, String hari_taksiran_persalinan2, String golongan_darah2, String penggunaan_kontrasepsi_sebelum_hamil2, String riwayat_penyakit_yg_di_derita_ibu2, String riwayat_alergi2, String status_imunisasi_tetanus_terakhir2, String tinggi_badan2) {
        this.nik_ibu = nik_ibu2;
        this.kehamilan_ke = kehamilan_ke2;
        this.hari_pertama_haid_terakhir = hari_pertama_haid_terakhir2;
        this.hari_taksiran_persalinan = hari_taksiran_persalinan2;
        this.golongan_darah = golongan_darah2;
        this.penggunaan_kontrasepsi_sebelum_hamil = penggunaan_kontrasepsi_sebelum_hamil2;
        this.riwayat_penyakit_yg_di_derita_ibu = riwayat_penyakit_yg_di_derita_ibu2;
        this.riwayat_alergi = riwayat_alergi2;
        this.status_imunisasi_tetanus_terakhir = status_imunisasi_tetanus_terakhir2;
        this.tinggi_badan = tinggi_badan2;
        this.id = id2;
    }

    public String getNik_ibu() {
        return this.nik_ibu;
    }

    public String getKehamilan_ke() {
        return this.kehamilan_ke;
    }

    public String getHari_pertama_haid_terakhir() {
        return this.hari_pertama_haid_terakhir;
    }

    public String getHari_taksiran_persalinan() {
        return this.hari_taksiran_persalinan;
    }

    public String getGolongan_darah() {
        return this.golongan_darah;
    }

    public String getPenggunaan_kontrasepsi_sebelum_hamil() {
        return this.penggunaan_kontrasepsi_sebelum_hamil;
    }

    public String getRiwayat_penyakit_yg_di_derita_ibu() {
        return this.riwayat_penyakit_yg_di_derita_ibu;
    }

    public String getRiwayat_alergi() {
        return this.riwayat_alergi;
    }

    public String getStatus_imunisasi_tetanus_terakhir() {
        return this.status_imunisasi_tetanus_terakhir;
    }

    public String getTinggi_badan() {
        return this.tinggi_badan;
    }

    public int getId() {
        return this.id;
    }
}
