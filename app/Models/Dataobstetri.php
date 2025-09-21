<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Dataobstetri extends Model
{
    use HasFactory;
    protected $table = 'tabel_data_obstetri';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'kehamilan_ke','tahun', 'lahir_hidup', 'lahir_aterm', 'lahir_spontan', 'berat_lahir_atau_panjang_lahir', 'tempat_bersalin_dan_tenakes', 'kondisi_anak_saat_ini', 'komplikasi_kehamilan_atau_persalinan'];
}
