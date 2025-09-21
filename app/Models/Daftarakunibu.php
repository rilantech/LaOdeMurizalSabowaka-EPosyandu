<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Daftarakunibu extends Model
{
    use HasFactory;
    protected $table = 'tabel_akun_ibu';
    public $timestamps = true;
    protected $fillable = ['nama', 'nik_ibu','username', 'password', 'alamat', 'nomor_hp'];
}
