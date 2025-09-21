package com.example.aplikasipetugas.AdapterDataOrangtuadananak;

public class GetDataorangtuadananak {
    String agama_ayah = "";
    String agama_ibu = "";
    String alamat_rumah = "";
    String anak_terakhir_umur = "";
    String golongan_darah_ayah = "";
    String golongan_darah_ibu = "";
    int id = 0;
    String kabupaten_atau_kota = "";
    String kecamatan = "";
    String kehamilan_ke = "";
    String nama_ayah = "";
    String nama_ibu = "";
    String nik = "";
    String no_jkn_bpjs = "";
    String no_telepon = "";
    String pekerjaan_ayah = "";
    String pekerjaan_ibu = "";
    String pendidikan_ayah = "";
    String pendidikan_ibu = "";
    String tempat_lahir_ayah = "";
    String tempat_lahir_ibu = "";
    String tanggal_lahir_ayah = "";
    String tanggal_lahir_ibu = "";

    public GetDataorangtuadananak(int id2, String nama_ibu2, String nik2, String tempat_lahir_ibu2,
                                  String tanggal_lahir_ibu, String tempat_lahir_ayah, String tanggal_lahir_ayah, String alamat_rumah) {
        this.nama_ibu = nama_ibu2;
        this.nik = nik2;
        this.tempat_lahir_ibu = tempat_lahir_ibu2;
        this.tanggal_lahir_ibu = tanggal_lahir_ibu;
        this.tempat_lahir_ayah = tempat_lahir_ayah;
        this.tanggal_lahir_ayah = tanggal_lahir_ayah;
        this.kehamilan_ke = "";
        this.anak_terakhir_umur = "";
        this.agama_ibu = "";
        this.pendidikan_ibu = "";
        this.golongan_darah_ibu = "";
        this.pekerjaan_ibu = "";
        this.no_jkn_bpjs = "";
        this.nama_ayah = "";
        this.agama_ayah = "";
        this.pendidikan_ayah = "";
        this.golongan_darah_ayah = "";
        this.pekerjaan_ayah = "";
        this.alamat_rumah = alamat_rumah;
        this.kecamatan = "";
        this.kabupaten_atau_kota = "";
        this.no_telepon = "";
        this.id = id2;
    }

    public String getNama_ibu() {
        return this.nama_ibu;
    }

    public String getNik() {
        return this.nik;
    }

    public String getKehamilan_ke() {
        return this.kehamilan_ke;
    }

    public String getAnak_terakhir_umur() {
        return this.anak_terakhir_umur;
    }

    public String getAgama_ibu() {
        return this.agama_ibu;
    }

    public String getPendidikan_ibu() {
        return this.pendidikan_ibu;
    }

    public String getGolongan_darah_ibu() {
        return this.golongan_darah_ibu;
    }

    public String getPekerjaan_ibu() {
        return this.pekerjaan_ibu;
    }

    public String getNo_jkn_bpjs() {
        return this.no_jkn_bpjs;
    }

    public String getNama_ayah() {
        return this.nama_ayah;
    }

    public String getAgama_ayah() {
        return this.agama_ayah;
    }

    public String getPendidikan_ayah() {
        return this.pendidikan_ayah;
    }

    public String getGolongan_darah_ayah() {
        return this.golongan_darah_ayah;
    }

    public String getPekerjaan_ayah() {
        return this.pekerjaan_ayah;
    }

    public String getAlamat_rumah() {
        return this.alamat_rumah;
    }

    public String getKecamatan() {
        return this.kecamatan;
    }

    public String getKabupaten_atau_kota() {
        return this.kabupaten_atau_kota;
    }

    public String getNo_telepon() {
        return this.no_telepon;
    }

    public int getId() {
        return this.id;
    }

    public String getTempat_lahir_ayah() {
        return tempat_lahir_ayah;
    }

    public String getTempat_lahir_ibu() {
        return tempat_lahir_ibu;
    }

    public String getTanggal_lahir_ayah() {
        return tanggal_lahir_ayah;
    }

    public String getTanggal_lahir_ibu() {
        return tanggal_lahir_ibu;
    }
}

