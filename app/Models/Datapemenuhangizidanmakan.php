<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Datapemenuhangizidanmakan extends Model
{
    use HasFactory;
    protected $table = 'tabel_pemenuhan_gizi_dan_makan';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'nama_ibu', 'nama_anak', 'anak_ke','nol_sampai_enam_bulan_1', 'nol_sampai_enam_bulan_2', 'nol_sampai_enam_bulan_3', 'nol_sampai_enam_bulan_4', 'enam_sampai_sebelas_bulan_1',
     'enam_sampai_sebelas_bulan_2', 'enam_sampai_sebelas_bulan_3', 'enam_sampai_sebelas_bulan_4', 'lainnya_1','lainnya_2', 'lainnya_3', 'lainnya_4'  
    ];
}
