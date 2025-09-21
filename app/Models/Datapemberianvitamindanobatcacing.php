<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Datapemberianvitamindanobatcacing extends Model
{
    use HasFactory;
    protected $table = 'tabel_pemberian_vitamin_dan_obat_cacing';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'nama_ibu', 'nama_anak', 'anak_ke','kapsul_biru_1', 'kapsul_merah_1', 'kapsul_merah_2', 'obat_cacing_1', 'kapsul_biru_2',
     'kapsul_merah_3', 'kapsul_merah_4', 'obat_cacing_2', 'kapsul_biru_3','kapsul_merah_5', 'kapsul_merah_6', 'obat_cacing_3'  
    ];
}
