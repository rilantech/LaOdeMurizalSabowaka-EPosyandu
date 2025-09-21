<?php

namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Dataorangtua;
use App\Models\Dataanak;
use App\Models\Datakesehatanibubersalin;
use App\Models\Datakesehatanibuhamil;
use App\Models\Datakesehatanibunifas;
use App\Models\Dataobstetri;
use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiDatakesehatanibunifas extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
    
        $dataorangtua1=new Dataorangtua();
        $data1 = $dataorangtua1->find($request->id);
        $data2  = Datakesehatanibunifas::where('nik_ibu', $data1->nik)->get();
        
        return response()->json([
                            'datakesehatanibunifas' => $data2
                        ]                   
          );
       
           
        

    }

    /**
     * Show the form for creating a new resource.
     */
    public function create(Request $request)
    {
        $search = $request->data;
        $nik_ibu = $request->nik_ibu;

        if($nik_ibu == null){
            $data3  = DB::table('tabel_kesehatan_bayi_baru_lahir') 
            ->where('nama_anak', 'like','%'.$search.'%')
            ->latest()
            ->get();
        } else{
            $data3  = DB::table('tabel_kesehatan_bayi_baru_lahir') 
            ->where('nama_anak', 'like','%'.$search.'%')
            ->where('nik_ibu', $nik_ibu)
            ->latest()
            ->get();
        }
     
   
    return response()->json([
                        'kesehatanbayibarulahir' => $data3
                    ]                   
      );
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        
        // $keadaan_ibu1 =$request->keadaan_ibu_1;
        // $keadaan_ibu2 =$request->keadaan_ibu_2;
        // $keadaan_ibu3 =$request->keadaan_ibu_3;

        // $komplikasi_nifas1 =$request->komplikasi_nifas_1;
        // $komplikasi_nifas2 =$request->komplikasi_nifas_2;
        // $komplikasi_nifas3 =$request->komplikasi_nifas_3;
        // $komplikasi_nifas4 =$request->komplikasi_nifas_4;

        // $keadaan_bayi1 =$request->keadaan_bayi_1;
        // $keadaan_bayi2 =$request->keadaan_bayi_2;
        // $keadaan_bayi3 =$request->keadaan_bayi_3;
        // $keadaan_bayi4 =$request->keadaan_bayi_4;


        $datakeshatanibunifas =new Datakesehatanibunifas;
        $datakeshatanibunifas->nik_ibu = $request->nik_ibu;
        $datakeshatanibunifas->nama_anak= $request->nama_anak;
        $datakeshatanibunifas->nifas_ke = $request->nifas_ke;
        $datakeshatanibunifas->status_nifas = "Sedang Berlangsung";
        $datakeshatanibunifas->tanggal_kunjungan_1 = $request->tanggal_kunjungan_1;
        $datakeshatanibunifas->tanggal_kunjungan_2 = $request->tanggal_kunjungan_2;
        $datakeshatanibunifas->tanggal_kunjungan_3 = $request->tanggal_kunjungan_3;
        $datakeshatanibunifas->kondisi_ibu_secara_umum_1 = $request->kondisi_ibu_secara_umum_1;
        $datakeshatanibunifas->kondisi_ibu_secara_umum_2 = $request->kondisi_ibu_secara_umum_2;
        $datakeshatanibunifas->kondisi_ibu_secara_umum_3 = $request->kondisi_ibu_secara_umum_3;
        $datakeshatanibunifas->tekanan_darah_1 = $request->tekanan_darah_1;
        $datakeshatanibunifas->tekanan_darah_2 = $request->tekanan_darah_2;
        $datakeshatanibunifas->tekanan_darah_3 = $request->tekanan_darah_3;
        $datakeshatanibunifas->pendarahan_pervaginam_1 = $request->pendarahan_pervaginam_1;
        $datakeshatanibunifas->pendarahan_pervaginam_2 = $request->pendarahan_pervaginam_2;
        $datakeshatanibunifas->pendarahan_pervaginam_3 = $request->pendarahan_pervaginam_3;
        $datakeshatanibunifas->kondisi_perineum_1 = $request->kondisi_perineum_1;
        $datakeshatanibunifas->kondisi_perineum_2 = $request->kondisi_perineum_2;
        $datakeshatanibunifas->kondisi_perineum_3 = $request->kondisi_perineum_3;
        $datakeshatanibunifas->tanda_infeksi_1 = $request->tanda_infeksi_1; 
        $datakeshatanibunifas->tanda_infeksi_2 = $request->tanda_infeksi_2;
        $datakeshatanibunifas->tanda_infeksi_3 = $request->tanda_infeksi_3;
        $datakeshatanibunifas->kontraksi_uteri_1 = $request->kontraksi_uteri_1; 
        $datakeshatanibunifas->kontraksi_uteri_2 = $request->kontraksi_uteri_2;
        $datakeshatanibunifas->kontraksi_uteri_3 = $request->kontraksi_uteri_3;
        $datakeshatanibunifas->tinggi_fundus_uteri_1 = $request->tinggi_fundus_uteri_1; 
        $datakeshatanibunifas->tinggi_fundus_uteri_2 = $request->tinggi_fundus_uteri_2;
        $datakeshatanibunifas->tinggi_fundus_uteri_3 = $request->tinggi_fundus_uteri_3;
        $datakeshatanibunifas->lokhia_1 = $request->lokhia_1; 
        $datakeshatanibunifas->lokhia_2 = $request->lokhia_2;
        $datakeshatanibunifas->lokhia_3 = $request->lokhia_3;
        $datakeshatanibunifas->pemeriksaan_jalan_lahir_1 = $request->pemeriksaan_jalan_lahir_1; 
        $datakeshatanibunifas->pemeriksaan_jalan_lahir_2 = $request->pemeriksaan_jalan_lahir_2;
        $datakeshatanibunifas->pemeriksaan_jalan_lahir_3 = $request->pemeriksaan_jalan_lahir_3;
        $datakeshatanibunifas->pemeriksaan_payudara_1 = $request->pemeriksaan_payudara_1; 
        $datakeshatanibunifas->pemeriksaan_payudara_2 = $request->pemeriksaan_payudara_2;
        $datakeshatanibunifas->pemeriksaan_payudara_3 = $request->pemeriksaan_payudara_3;
        $datakeshatanibunifas->produksi_asi_1 = $request->produksi_asi_1; 
        $datakeshatanibunifas->produksi_asi_2 = $request->produksi_asi_2;
        $datakeshatanibunifas->produksi_asi_3 = $request->produksi_asi_3;
        $datakeshatanibunifas->pemberian_kapsul_vitamin_a_1 = $request->pemberian_kapsul_vitamin_a_1; 
        $datakeshatanibunifas->pemberian_kapsul_vitamin_a_2 = $request->pemberian_kapsul_vitamin_a_2;
        $datakeshatanibunifas->pemberian_kapsul_vitamin_a_3 = $request->pemberian_kapsul_vitamin_a_3;
        $datakeshatanibunifas->pelayanan_kontrasepsi_1 = $request->pelayanan_kontrasepsi_1; 
        $datakeshatanibunifas->pelayanan_kontrasepsi_2 = $request->pelayanan_kontrasepsi_2;
        $datakeshatanibunifas->pelayanan_kontrasepsi_3 = $request->pelayanan_kontrasepsi_3;
        $datakeshatanibunifas->penanganan_resiko_tinggi_1 = $request->penanganan_resiko_tinggi_1; 
        $datakeshatanibunifas->penanganan_resiko_tinggi_2 = $request->penanganan_resiko_tinggi_2;
        $datakeshatanibunifas->penanganan_resiko_tinggi_3 = $request->penanganan_resiko_tinggi_3;
        $datakeshatanibunifas->buang_air_besar_1 = $request->buang_air_besar_1; 
        $datakeshatanibunifas->buang_air_besar_2 = $request->buang_air_besar_2;
        $datakeshatanibunifas->buang_air_besar_3 = $request->buang_air_besar_3;
        $datakeshatanibunifas->buang_air_kecil_1 = $request->buang_air_kecil_1; 
        $datakeshatanibunifas->buang_air_kecil_2 = $request->buang_air_kecil_2;
        $datakeshatanibunifas->buang_air_kecil_3 = $request->buang_air_kecil_3;
        $datakeshatanibunifas->catatan_dokter_1 = $request->catatan_dokter_1; 
        $datakeshatanibunifas->catatan_dokter_2 = $request->catatan_dokter_2;
        $datakeshatanibunifas->catatan_dokter_3 = $request->catatan_dokter_3;
        $datakeshatanibunifas->keadaan_ibu = $request->keadaan_ibu;
        $datakeshatanibunifas->komplikasi_nifas = $request->komplikasi_nifas; 
        $datakeshatanibunifas->keadaan_bayi = $request->keadaan_bayi;  
        $datakeshatanibunifas->save();
        
        
        return response()->json([
            'status' => 'berhasil'
    ]);
    }



    /**
     * Display the specified resource.
     */
    public function show(Datakesehatanibuhamil $datakesehatanibuhamil1, $id)
    {
        $data1 = $datakesehatanibuhamil1->find($id);
    
       
            return response()->json([
                'datakesehatanibuhamil1' => $data1
                // 'dataobstetri2' => [
                // 'kehamilan_ke' => $data3->kehamilan_ke,
                // 'tahun' => $data3->tahun,
                // 'lahir_hidup' => $data3->lahir_hidup,
                // 'lahir_aterm' => $data3->lahir_aterm,
                // 'lahir_spontan' => $data3->lahir_spontan,
                // 'berat_lahir_atau_panjang_lahir' => $data3->berat_lahir_atau_panjang_lahir,
                // 'tempat_bersalin_dan_tenakes' => $data3->tempat_bersalin_dan_tenakes,
                // 'kondisi_anak_saat_ini' => $data3->kondisi_anak_saat_ini,
                // 'komplikasi_kehamilan_atau_persalinan' => $data3->komplikasi_kehamilan_atau_persalinan
                // ]
            ]);   
       
    }

    public function tampileditdata(Dataorangtua $dataorangtua1, $id)
    {
        $data3 = Dataobstetri->find($id);
       
            return response()->json([
                'dataobstetri2' => [
                'kehamilan_ke' => $data3->kehamilan_ke,
                'tahun' => $data3->tahun,
                'lahir_hidup' => $data3->lahir_hidup,
                'lahir_aterm' => $data3->lahir_aterm,
                'lahir_spontan' => $data3->lahir_spontan,
                'berat_lahir_atau_panjang_lahir' => $data3->berat_lahir_atau_panjang_lahir,
                'tempat_bersalin_dan_tenakes' => $data3->tempat_bersalin_dan_tenakes,
                'kondisi_anak_saat_ini' => $data3->kondisi_anak_saat_ini,
                'komplikasi_kehamilan_atau_persalinan' => $data3->komplikasi_kehamilan_atau_persalinan
                ]
            ]);
        
           
        
       
    }
    /**
     * Display the specified resource.
     */
   

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Request $request)
    {
    
        if($request->status_nifas == "Berakhir"){
        $datanifas  = DB::table('tabel_kesehatan_ibu_nifas')
        ->where('nik_ibu', $request->nik)         
        ->where('nifas_ke', $request->nifas_ke)  
        ->where('status_nifas', "Berakhir")  
        ->get();
        }
         if($request->status_nifas == "Sedang Berlangsung"){
        $datanifas  = DB::table('tabel_kesehatan_ibu_nifas')
        ->where('nik_ibu', $request->nik)         
        ->where('nifas_ke', $request->nifas_ke)  
        ->where('status_nifas', "Sedang Berlangsung")  
        ->get();
        }
        
         if($request->status_nifas == "semua"){
        $datanifas  = DB::table('tabel_kesehatan_ibu_nifas')
        ->where('nik_ibu', $request->nik)         
        ->where('nifas_ke', $request->nifas_ke)  
        ->get();
        }

    
        return response()->json([
            'tampildatanifas' => $datanifas
           
]);   
    }

    public function tambahkesehatanibunifas(Request $request){
        $nik = $request->nik;
        $datakesehatanibunifas = array();
        $list_nama_anak = array();
        if(!empty($nik)){
            $datakesehatanibunifas = Datakesehatanibunifas::where('tabel_kesehatan_ibu_nifas.nik_ibu', $nik)->get();   
            $list_nama_anak = Dataanak::where('tabel_data_anak.nik_ibu', $nik)->get();        
        }
   return response()->json([
    'kesehatanibunifas1' => $datakesehatanibunifas,
    'list_anak' => $list_nama_anak

]);
}

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Datakesehatanibunifas $datakesehatannifas3, $id)
    {
        $data= $datakesehatannifas3->find($id);
        $data->nik_ibu = $request->nik_ibu;
        $data->nama_anak= $request->nama_anak;
        $data->nifas_ke = $request->nifas_ke;
        // $data->status_nifas = $request->status_nifas;
        $data->tanggal_kunjungan_1 = $request->tanggal_kunjungan_1;
        $data->tanggal_kunjungan_2 = $request->tanggal_kunjungan_2;
        $data->tanggal_kunjungan_3 = $request->tanggal_kunjungan_3;
        $data->kondisi_ibu_secara_umum_1 = $request->kondisi_ibu_secara_umum_1;
        $data->kondisi_ibu_secara_umum_2 = $request->kondisi_ibu_secara_umum_2;
        $data->kondisi_ibu_secara_umum_3 = $request->kondisi_ibu_secara_umum_3;
        $data->tekanan_darah_1 = $request->tekanan_darah_1;
        $data->tekanan_darah_2 = $request->tekanan_darah_2;
        $data->tekanan_darah_3 = $request->tekanan_darah_3;
        $data->pendarahan_pervaginam_1 = $request->pendarahan_pervaginam_1;
        $data->pendarahan_pervaginam_2 = $request->pendarahan_pervaginam_2;
        $data->pendarahan_pervaginam_3 = $request->pendarahan_pervaginam_3;
        $data->kondisi_perineum_1 = $request->kondisi_perineum_1;
        $data->kondisi_perineum_2 = $request->kondisi_perineum_2;
        $data->kondisi_perineum_3 = $request->kondisi_perineum_3;
        $data->tanda_infeksi_1 = $request->tanda_infeksi_1; 
        $data->tanda_infeksi_2 = $request->tanda_infeksi_2;
        $data->tanda_infeksi_3 = $request->tanda_infeksi_3;
        $data->kontraksi_uteri_1 = $request->kontraksi_uteri_1; 
        $data->kontraksi_uteri_2 = $request->kontraksi_uteri_2;
        $data->kontraksi_uteri_3 = $request->kontraksi_uteri_3;
        $data->tinggi_fundus_uteri_1 = $request->tinggi_fundus_uteri_1; 
        $data->tinggi_fundus_uteri_2 = $request->tinggi_fundus_uteri_2;
        $data->tinggi_fundus_uteri_3 = $request->tinggi_fundus_uteri_3;
        $data->lokhia_1 = $request->lokhia_1; 
        $data->lokhia_2 = $request->lokhia_2;
        $data->lokhia_3 = $request->lokhia_3;
        $data->pemeriksaan_jalan_lahir_1 = $request->pemeriksaan_jalan_lahir_1; 
        $data->pemeriksaan_jalan_lahir_2 = $request->pemeriksaan_jalan_lahir_2;
        $data->pemeriksaan_jalan_lahir_3 = $request->pemeriksaan_jalan_lahir_3;
        $data->pemeriksaan_payudara_1 = $request->pemeriksaan_payudara_1; 
        $data->pemeriksaan_payudara_2 = $request->pemeriksaan_payudara_2;
        $data->pemeriksaan_payudara_3 = $request->pemeriksaan_payudara_3;
        $data->produksi_asi_1 = $request->produksi_asi_1; 
        $data->produksi_asi_2 = $request->produksi_asi_2;
        $data->produksi_asi_3 = $request->produksi_asi_3;
        $data->pemberian_kapsul_vitamin_a_1 = $request->pemberian_kapsul_vitamin_a_1; 
        $data->pemberian_kapsul_vitamin_a_2 = $request->pemberian_kapsul_vitamin_a_2;
        $data->pemberian_kapsul_vitamin_a_3 = $request->pemberian_kapsul_vitamin_a_3;
        $data->pelayanan_kontrasepsi_1 = $request->pelayanan_kontrasepsi_1; 
        $data->pelayanan_kontrasepsi_2 = $request->pelayanan_kontrasepsi_2;
        $data->pelayanan_kontrasepsi_3 = $request->pelayanan_kontrasepsi_3;
        $data->penanganan_resiko_tinggi_1 = $request->penanganan_resiko_tinggi_1; 
        $data->penanganan_resiko_tinggi_2 = $request->penanganan_resiko_tinggi_2;
        $data->penanganan_resiko_tinggi_3 = $request->penanganan_resiko_tinggi_3;
        $data->buang_air_besar_1 = $request->buang_air_besar_1; 
        $data->buang_air_besar_2 = $request->buang_air_besar_2;
        $data->buang_air_besar_3 = $request->buang_air_besar_3;
        $data->buang_air_kecil_1 = $request->buang_air_kecil_1; 
        $data->buang_air_kecil_2 = $request->buang_air_kecil_2;
        $data->buang_air_kecil_3 = $request->buang_air_kecil_3;
        $data->catatan_dokter_1 = $request->catatan_dokter_1; 
        $data->catatan_dokter_2 = $request->catatan_dokter_2;
        $data->catatan_dokter_3 = $request->catatan_dokter_3;
        $data->keadaan_ibu = $request->keadaan_ibu;
        $data->komplikasi_nifas = $request->komplikasi_nifas; 
        $data->keadaan_bayi = $request->keadaan_bayi;  
        $data->save();
        

        return response()->json([
            'status' => 'berhasil'
    ]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Datakesehatanibuhamil $datakesehatanibuhamil4, $id)
    {
        $data1 = $datakesehatanibuhamil4->find($id);
      
        $data1->delete();
     
        return response()->json([
            'status' => 'berhasil'
    ]);
    }
}
