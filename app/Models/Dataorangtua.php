<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Dataorangtua extends Model
{
    use HasFactory;
    protected $table = 'tabel_data_orangtua';
    public $timestamps = true;
    protected $fillable = ['nama_ibu','nik', 'tempat_lahir_ibu', 'tanggal_lahir_ibu', 'kehamilan_ke', 'anak_terakhir_umur', 'agama_ibu', 'pendidikan_ibu', 'golongan_darah_ibu', 'pekerjaan_ibu', 'no_jkn_bpjs', 'nama_ayah', 'tempat_lahir_ayah', 'tanggal_lahir_ayah', 'agama_ayah', 'pendidikan_ayah', 'golongan_darah_ayah', 'pekerjaan_ayah', 'alamat_rumah', 'kecamatan', 'kabupaten_atau_kota', 'no_telepon'];
}
