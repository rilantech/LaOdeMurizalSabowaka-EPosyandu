<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Datakesehatanibubersalin extends Model
{
    use HasFactory;
    protected $table = 'tabel_kesehatan_ibu_bersalin';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'tanggal_persalinan','pukul', 'penolong_persalinan', 'cara_persalinan', 'keadaan_ibu', 'anak_ke', 'berat_lahir', 'panjang_badan', 'lingkar_kepala', 'jenis_kelamin', 'kondisi_bayi_saat_lahir', 'asuhan_bayi_baru_lahir', 'updated_at', 'created_at'];
}
