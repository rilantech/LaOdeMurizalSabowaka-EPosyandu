<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Dataanak extends Model
{
    use HasFactory;
    protected $table = 'tabel_data_anak';
    public $timestamps = true;
    protected $fillable = ['id_ibu', 'nama', 'jenis_kelamin', 'tempat_lahir_anak', 'tanggal_lahir_anak', 'anak_ke', 'dari', 'no_akta_kelahiran', 'no_jkn_bpjs'];
}
