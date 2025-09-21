<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Datakesehatanbayibarulahir extends Model
{
    use HasFactory;
    protected $table = 'tabel_kesehatan_bayi_baru_lahir';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'nama_ibu', 'nama_ayah', 'nama_anak', 'anak_ke','tanggal_kunjungan_1', 'tanggal_kunjungan_2', 'tanggal_kunjungan_3', 'berat_badan_1', 'berat_badan_2', 'berat_badan_3', 'panjang_badan_1', 'panjang_badan_2', 'panjang_badan_3', 'suhu_1', 'suhu_2', 'suhu_3', 'dan_lain_lain_1', 'dan_lain_lain_2', 'dan_lain_lain_3'];
}
