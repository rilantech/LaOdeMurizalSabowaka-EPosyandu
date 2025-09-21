package com.example.aplikasipetugas.AdapterDetailChatting;

public class GetDetailChatting {
    int id = 0;
    String isi_pesan = "";
    String nomor_hp_pengirim = "";
    String waktu_kirim = "";

    public GetDetailChatting(int id2, String isi_pesan2, String waktu_kirim2, String nomor_hp_pengirim2) {
        this.isi_pesan = isi_pesan2;
        this.waktu_kirim = waktu_kirim2;
        this.nomor_hp_pengirim = nomor_hp_pengirim2;
        this.id = id2;
    }

    public String getNomor_hp_pengirim() {
        return this.nomor_hp_pengirim;
    }

    public String getIsi_pesan() {
        return this.isi_pesan;
    }

    public String getWaktu_kirim() {
        return this.waktu_kirim;
    }

    public int getId() {
        return this.id;
    }
}
