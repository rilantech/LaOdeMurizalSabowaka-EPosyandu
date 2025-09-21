package com.example.aplikasipetugas.AdapterChatting;

public class GetChatting {
    int id = 0;
    String nama = "";
    String nomor_hp = "";

    public GetChatting(int id2, String nama2, String nomor_hp2) {
        this.nama = nama2;
        this.nomor_hp = nomor_hp2;
        this.id = id2;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNomor_hp() {
        return this.nomor_hp;
    }

    public int getId() {
        return this.id;
    }
}
