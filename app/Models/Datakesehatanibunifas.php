<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Datakesehatanibunifas extends Model
{
    use HasFactory;
    protected $table = 'tabel_kesehatan_ibu_nifas';
    public $timestamps = true;
    protected $fillable = ['nik_ibu', 'nifas_ke','tanggal_kunjungan_1', 'tanggal_kunjungan_2', 'tanggal_kunjungan_3',
     'kondisi_ibu_secara_umum_1', 'kondisi_ibu_secara_umum_2', 'kondisi_ibu_secara_umum_3',
     'tekanan_darah_1', 'tekanan_darah_2', 'tekanan_darah_3', 
     'pendarahan_pervaginam_1', 'pendarahan_pervaginam_2', 'pendarahan_pervaginam_3', 
      'kondisi_perineum_1', 'kondisi_perineum_2', 'kondisi_perineum_3',
       'tanda_infeksi_1', 'tanda_infeksi_2', 'tanda_infeksi_3',
       'kontraksi_uteri_1', 'kontraksi_uteri_2', 'kontraksi_uteri_3',
       'tinggi_fundus_uteri_1', 'tinggi_fundus_uteri_2', 'tinggi_fundus_uteri_3',
       'lokhia_1', 'lokhia_2', 'lokhia_3',
       'pemeriksaan_jalan_lahir_1', 'pemeriksaan_jalan_lahir_2', 'pemeriksaan_jalan_lahir_3',
       'pemeriksaan_payudara_1', 'pemeriksaan_payudara_2', 'pemeriksaan_payudara_3',
       'produksi_asi_1', 'produksi_asi_2', 'produksi_asi_3',
       'pemberian_kapsul_vitamin_a_1', 'pemberian_kapsul_vitamin_a_2', 'pemberian_kapsul_vitamin_a_3',
       'pelayanan_kontrasepsi_1', 'pelayanan_kontrasepsi_2', 'pelayanan_kontrasepsi_3',
       'penanganan_resiko_tinggi_1', 'penanganan_resiko_tinggi_2', 'penanganan_resiko_tinggi_3',
       'buang_air_besar_1', 'buang_air_besar_2', 'buang_air_besar_3',
       'buang_air_kecil_1', 'buang_air_kecil_2', 'buang_air_kecil_3',
       'catatan_dokter_1', 'catatan_dokter_2', 'catatan_dokter_3',
       'keadaan_ibu', 'komplikasi_nifas', 'keadaan_bayi'
    
    ];
}
