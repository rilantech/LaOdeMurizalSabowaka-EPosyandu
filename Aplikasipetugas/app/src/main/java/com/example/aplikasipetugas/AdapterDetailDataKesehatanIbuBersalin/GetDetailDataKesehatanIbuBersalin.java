package com.example.aplikasipetugas.AdapterDetailDataKesehatanIbuBersalin;

public class GetDetailDataKesehatanIbuBersalin {
    String anak_ke = "";
    String asuhan_bayi_baru_lahir = "";
    String berat_lahir = "";
    String cara_persalinan = "";
    int id = 0;
    String jenis_kelamin = "";
    String keadaan_ibu = "";
    String keterangan_tambahan_anak = "";
    String keterangan_tambahan_ibu = "";
    String kondisi_bayi_saat_lahir = "";
    String lingkar_kepala = "";
    String nik_ibu = "";
    String panjang_badan = "";
    String penolong_persalinan = "";
    String pukul = "";
    String tanggal_persalinan = "";
    String umur_kehamilan = "";

    public GetDetailDataKesehatanIbuBersalin(int id2, String nik_ibu2, String tanggal_persalinan2, String pukul2, String umur_kehamilan2, String penolong_persalinan2, String cara_persalinan2, String keadaan_ibu2, String anak_ke2, String berat_lahir2, String panjang_badan2, String lingkar_kepala2, String jenis_kelamin2, String kondisi_bayi_saat_lahir2, String asuhan_bayi_baru_lahir2) {
        this.nik_ibu = nik_ibu2;
        this.tanggal_persalinan = tanggal_persalinan2;
        this.pukul = pukul2;
        this.umur_kehamilan = umur_kehamilan2;
        this.penolong_persalinan = penolong_persalinan2;
        this.cara_persalinan = cara_persalinan2;
        this.keadaan_ibu = keadaan_ibu2;
        this.anak_ke = anak_ke2;
        this.berat_lahir = berat_lahir2;
        this.panjang_badan = panjang_badan2;
        this.lingkar_kepala = lingkar_kepala2;
        this.jenis_kelamin = jenis_kelamin2;
        this.kondisi_bayi_saat_lahir = kondisi_bayi_saat_lahir2;
        this.asuhan_bayi_baru_lahir = asuhan_bayi_baru_lahir2;
        this.id = id2;
    }

    public String getNik_ibu() {
        return this.nik_ibu;
    }

    public String getTanggal_persalinan() {
        return this.tanggal_persalinan;
    }

    public String getPukul() {
        return this.pukul;
    }

    public String getUmur_kehamilan() {
        return this.umur_kehamilan;
    }

    public String getPenolong_persalinan() {
        return this.penolong_persalinan;
    }

    public String getCara_persalinan() {
        return this.cara_persalinan;
    }

    public String getKeadaan_ibu() {
        return this.keadaan_ibu;
    }

    public String getKeterangan_tambahan_ibu() {
        return this.keterangan_tambahan_ibu;
    }

    public String getAnak_ke() {
        return this.anak_ke;
    }

    public String getBerat_lahir() {
        return this.berat_lahir;
    }

    public String getPanjang_badan() {
        return this.panjang_badan;
    }

    public String getLingkar_kepala() {
        return this.lingkar_kepala;
    }

    public String getJenis_kelamin() {
        return this.jenis_kelamin;
    }

    public String getKondisi_bayi_saat_lahir() {
        return this.kondisi_bayi_saat_lahir;
    }

    public String getAsuhan_bayi_baru_lahir() {
        return this.asuhan_bayi_baru_lahir;
    }

    public String getKeterangan_tambahan_anak() {
        return this.keterangan_tambahan_anak;
    }

    public int getId() {
        return this.id;
    }
}
