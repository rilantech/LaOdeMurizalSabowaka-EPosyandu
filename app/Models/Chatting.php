<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Chatting extends Model
{
    use HasFactory;
    protected $table = 'tabel_chatting';
    public $timestamps = true;
    protected $fillable = ['nomor_hp_pengirim','nomor_hp_penerima','id_pengirim','posisi_pengirim','isi_pesan', 'waktu_kirim'];
}
