package com.example.aplikasipetugas.AdapterInputanDataAnak;

public class GetInputanDataanak {
    String anak_ke = "";
    String dari = "";
    int id = 0;
    String jenis_kelamin = "";
    String nama = "";
    String nik_ibu = "";
    String no_akta_kelahiran = "";
    String no_jkn_bpjs = "";
    String tempat_atau_tanggal_lahir = "";
    String tempat_lahir_anak="";
    String tanggal_lahir_anak="";

    public GetInputanDataanak(int id2, String nik_ibu2, String nama2, String jenis_kelamin2,String tempat_lahir_anak, String tanggal_lahir_anak, String tempat_atau_tanggal_lahir2, String anak_ke2, String dari2, String no_akta_kelahiran2, String no_jkn_bpjs2) {
        this.nik_ibu = nik_ibu2;
        this.nama = nama2;
        this.jenis_kelamin = jenis_kelamin2;
        this.tempat_atau_tanggal_lahir = tempat_atau_tanggal_lahir2;
        this.tempat_lahir_anak = tempat_lahir_anak;
        this.tanggal_lahir_anak = tanggal_lahir_anak;
        this.anak_ke = anak_ke2;
        this.dari = dari2;
        this.no_akta_kelahiran = no_akta_kelahiran2;
        this.no_jkn_bpjs = no_jkn_bpjs2;
        this.id = id2;
    }

    public String getNik_ibu() {
        return this.nik_ibu;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenis_kelamin() {
        return this.jenis_kelamin;
    }

    public String getTempat_atau_tanggal_lahir() {
        return this.tempat_atau_tanggal_lahir;
    }

    public String getAnak_ke() {
        return this.anak_ke;
    }

    public String getDari() {
        return this.dari;
    }

    public String getNo_akta_kelahiran() {
        return this.no_akta_kelahiran;
    }

    public String getNo_jkn_bpjs() {
        return this.no_jkn_bpjs;
    }

    public int getId() {
        return this.id;
    }

    public String getTempat_lahir_anak() {
        return tempat_lahir_anak;
    }

    public String getTanggal_lahir_anak() {
        return tanggal_lahir_anak;
    }
}
