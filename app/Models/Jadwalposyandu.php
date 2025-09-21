<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Jadwalposyandu extends Model
{
    use HasFactory;
    protected $table = 'tabel_jadwal_posyandu';
    public $timestamps = true;
    protected $fillable = ['waktu_post','agenda', 'tanggal', 'jam'];
}
