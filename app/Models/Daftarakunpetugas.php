<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Daftarakunpetugas extends Model
{
    use HasFactory;
    protected $table = 'tabel_akun_petugas';
    public $timestamps = true;
    protected $fillable = ['nama','username', 'password', 'alamat', 'nomor_hp'];
}
