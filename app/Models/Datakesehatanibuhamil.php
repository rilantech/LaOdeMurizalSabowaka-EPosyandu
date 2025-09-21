<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Datakesehatanibuhamil extends Model
{
    use HasFactory;
    protected $table = 'tabel_kesehatan_ibu_hamil';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'kehamilan_ke','hari_pertama_haid_terakhir', 'hari_taksiran_persalinan', 'golongan_darah', 'penggunaan_kontrasepsi_sebelum_hamil', 'riwayat_penyakit_yg_di_derita_ibu', 'riwayat_alergi', 'status_imunisasi_tetanus_terakhir', 'tinggi_badan', 'updated_at', 'created_at'];
}
