<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Datatinggibadan extends Model
{
    use HasFactory;
    protected $table = 'tabel_tinggibadan_berdasarkanumur';
    public $timestamps = true;
    protected $fillable = [
           'tinggi_badan_0',
           'tinggi_badan_1',
           'tinggi_badan_2',
           'tinggi_badan_3',
           'tinggi_badan_4',
           'tinggi_badan_5',
           'tinggi_badan_6',
           'tinggi_badan_7',
           'tinggi_badan_8', 
           'tinggi_badan_9',
           'tinggi_badan_10',
           'tinggi_badan_11',
           'tinggi_badan_12',
           'tinggi_badan_13',
         
];
}
