<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Matrikspemantauanperkembangananak extends Model
{
    use HasFactory;
    protected $table = 'tabel_matriks_pemantauan_perkembangan_anak';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'nama_ibu', 'nama_anak', 'anak_ke',
    'tanggal_pemantauan_perkembangan_1', 'tanggal_pemantauan_perkembangan_3',  'tanggal_pemantauan_perkembangan_6', 'tanggal_pemantauan_perkembangan_9',
     'tanggal_pemantauan_perkembangan_12', 'tanggal_pemantauan_perkembangan_15', 'tanggal_pemantauan_perkembangan_18', 'tanggal_pemantauan_perkembangan_21', 
     'tanggal_pemantauan_perkembangan_24', 'tanggal_pemantauan_perkembangan_30', 'tanggal_pemantauan_perkembangan_36', 'tanggal_pemantauan_perkembangan_42'
    , 'tanggal_pemantauan_perkembangan_48', 'tanggal_pemantauan_perkembangan_54', 'tanggal_pemantauan_perkembangan_60', 'tanggal_pemantauan_perkembangan_66',
    'tanggal_pemantauan_perkembangan_72',

    'hasil_1', 'hasil_3',  'hasil_6', 'hasil_9',
    'hasil_12', 'hasil_15', 'hasil_18', 'hasil_21', 
    'hasil_24', 'hasil_30', 'hasil_36', 'hasil_42'
   , 'hasil_48', 'hasil_54', 'hasil_60', 'hasil_66',
   'hasil_72',

   
   'tindakan_1', 'tindakan_3',  'tindakan_6', 'tindakan_9',
   'tindakan_12', 'tindakan_15', 'tindakan_18', 'tindakan_21', 
   'tindakan_24', 'tindakan_30', 'tindakan_36', 'tindakan_42'
  , 'tindakan_48', 'tindakan_54', 'tindakan_60', 'tindakan_66',
  'tindakan_72',

  
  'tanggal_pemantauan_selanjutnya_1', 'tanggal_pemantauan_selanjutnya_3',  'tanggal_pemantauan_selanjutnya_6', 'tanggal_pemantauan_selanjutnya_9',
  'tanggal_pemantauan_selanjutnya_12', 'tanggal_pemantauan_selanjutnya_15', 'tanggal_pemantauan_selanjutnya_18', 'tanggal_pemantauan_selanjutnya_21', 
  'tanggal_pemantauan_selanjutnya_24', 'tanggal_pemantauan_selanjutnya_30', 'tanggal_pemantauan_selanjutnya_36', 'tanggal_pemantauan_selanjutnya_42'
 , 'tanggal_pemantauan_selanjutnya_48', 'tanggal_pemantauan_selanjutnya_54', 'tanggal_pemantauan_selanjutnya_60', 'tanggal_pemantauan_selanjutnya_66',
    'tanggal_pemantauan_selanjutnya_72',



];
}
