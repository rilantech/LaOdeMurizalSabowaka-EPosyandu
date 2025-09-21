<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Catatankesehatanibuhamil extends Model
{
    use HasFactory;
    protected $table = 'tabel_catatan_kesehatan_ibu_hamil';
    public $timestamps = true;
    protected $fillable = ['nik_ibu','kehamilan_ke', 'nama_pemeriksa_dan_tempat_pelayanan', 'tanggal', 'keluhan', 'uk', 'bb', 'td', 'lila', 'tinggi_fundus', 'letak_janin', 'imunisasi', 'tablet_tambah_darah', 'lab', 'analisa', 'tata_laksana', 'konseling', 'catatan_tambahan','updated_at', 'created_at'];
}
