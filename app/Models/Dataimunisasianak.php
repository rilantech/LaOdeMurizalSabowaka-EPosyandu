<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Dataimunisasianak extends Model
{
    use HasFactory;
    protected $table = 'tabel_data_imunisasi_anak';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'nama_ibu', 'nama_anak', 'anak_ke','hepatitis_0', 'hepatitis_1', 'hepatitis_2', 'hepatitis_3', 'hepatitis_4',
     'hepatitis_5', 'hepatitis_6', 'hepatitis_7', 'hepatitis_8', 'hepatitis_9', 'hepatitis_10', 'hepatitis_11', 'hepatitis_12', 
     'bcg_0', 'bcg_1', 'bcg_2', 'bcg_3', 'bcg_4', 'bcg_5', 'bcg_6', 'bcg_7', 'bcg_8', 'bcg_9', 'bcg_10', 'bcg_11', 'bcg_12'
    ,'polio_tetes_0', 'polio_tetes_1', 'polio_tetes_2', 'polio_tetes_3', 'polio_tetes_4', 'polio_tetes_5', 'polio_tetes_6', 'polio_tetes_7', 'polio_tetes_8'
    ,'polio_tetes_9', 'polio_tetes_10', 'polio_tetes_11', 'polio_tetes_12', 'dan_lain_lain_0', 'dan_lain_lain_1', 'dan_lain_lain_2', 'dan_lain_lain_3'
    ,'dan_lain_lain_4', 'dan_lain_lain_5', 'dan_lain_lain_6', 'dan_lain_lain_7', 'dan_lain_lain_8', 'dan_lain_lain_9'
    ,'dan_lain_lain_10', 'dan_lain_lain_11', 'dan_lain_lain_12'
    ];
}
