<?php

namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Catatankesehatanibuhamil;
use App\Models\Dataorangtua;
use App\Models\Dataanak;
use App\Models\Datakesehatanibuhamil;
use App\Models\Dataobstetri;
use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiCatatankesehatanibuhamil extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {    
        $dataorangtua1=new Dataorangtua();
        $data1 = $dataorangtua1->find($request->id);
        $data3  = DB::table('tabel_catatan_kesehatan_ibu_hamil') 
        ->where('nik_ibu', $data1->nik)
        ->where('kehamilan_ke', $request->kehamilan_ke)
        ->get();
        
        return response()->json([
                            'catatankesehatanibuhamil' => $data3
                        ]                   
          );  

    }

    /**
     * Show the form for creating a new resource.
     */
    public function create(Request $request)
    {
        $search = $request->data;
        $nik = $request->nik;
        $kehamilan_ke = $request->kehamilan_ke;

        $data3  = DB::table('tabel_catatan_kesehatan_ibu_hamil') 
        ->where('nik_ibu', $nik)
        ->where('kehamilan_ke', $kehamilan_ke)
        ->where('tanggal', 'like','%'.$search.'%')
        ->get();

    //     $dataOrangtua = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
    //    ->orwhere('tabel_data_orangtua.nik','like','%'.$search.'%')->latest()->get();
   
    return response()->json([
                        'catatankesehatanibuhamil' => $data3
                    ]                   
      );
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $catatankesehatanibuhamil =new Catatankesehatanibuhamil();
        $catatankesehatanibuhamil->nik_ibu = $request->nik_ibu;
        $catatankesehatanibuhamil->kehamilan_ke= $request->kehamilan_ke;
        $catatankesehatanibuhamil->nama_pemeriksa_dan_tempat_pelayanan = $request->nama_pemeriksa;
        $catatankesehatanibuhamil->tanggal= $request->tanggal;
        $catatankesehatanibuhamil->keluhan = $request->keluhan;
        $catatankesehatanibuhamil->uk = $request->uk;
        $catatankesehatanibuhamil->bb = $request->bb;
        $catatankesehatanibuhamil->td = $request->td;
        $catatankesehatanibuhamil->lila = $request->lila;
        $catatankesehatanibuhamil->tinggi_fundus = $request->tinggi_fundus;
        $catatankesehatanibuhamil->letak_janin = $request->letak_janin;
        $catatankesehatanibuhamil->imunisasi = $request->imunisasi;
        $catatankesehatanibuhamil->tablet_tambah_darah = $request->tablet_tambah_darah;
        $catatankesehatanibuhamil->lab = $request->lab;
        $catatankesehatanibuhamil->analisa = $request->analisa;
        $catatankesehatanibuhamil->tata_laksana = $request->tata_laksana;
        $catatankesehatanibuhamil->konseling = $request->konseling;
        $catatankesehatanibuhamil->catatan_tambahan = $request->catatan_tambahan;
   
        $catatankesehatanibuhamil->save();
              
        return response()->json([
        'status' => 'berhasil'
]);
    }

    /**
     * Display the specified resource.
     */
    public function show(Catatankesehatanibuhamil $catatankesehatanibuhamil1, $id)
    {
        $data1 = $catatankesehatanibuhamil1->find($id);
    
       
            return response()->json([
                'catatankesehatanibuhamil1' => $data1
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
        $data3  = DB::table('tabel_catatan_kesehatan_ibu_hamil') 
        ->where('nik_ibu', $request->nik_ibu)
        ->where('kehamilan_ke', $request->kehamilan_ke)
        ->get();
        
        return response()->json([
                            'catatankesehatanibuhamil' => $data3
                        ]                   
          );  
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Catatankesehatanibuhamil $catatankesehatanibuhamil3, $id)
    {
        //
        $data1= $catatankesehatanibuhamil3->find($id);
        $data1->id = $request->id;
        $data1->nik_ibu = $request->nik_ibu;
        $data1->kehamilan_ke= $request->kehamilan_ke;
        $data1->nama_pemeriksa_dan_tempat_pelayanan = $request->nama_pemeriksa;
        $data1->tanggal= $request->tanggal;
        $data1->keluhan = $request->keluhan;
        $data1->uk = $request->uk;
        $data1->bb = $request->bb;
        $data1->td = $request->td;
        $data1->lila = $request->lila;
        $data1->tinggi_fundus = $request->tinggi_fundus;
        $data1->letak_janin = $request->letak_janin;
        $data1->imunisasi = $request->imunisasi;
        $data1->tablet_tambah_darah = $request->tablet_tambah_darah;
        $data1->lab = $request->lab;
        $data1->analisa = $request->analisa;
        $data1->tata_laksana = $request->tata_laksana;
        $data1->konseling = $request->konseling;
        $data1->catatan_tambahan = $request->catatan_tambahan;  

        $data1->save();

         return response()->json([
            'status' => 'berhasil'
    ]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Catatankesehatanibuhamil $catatankesehatanibuhamil4, $id)
    {
        $data1 = $catatankesehatanibuhamil4->find($id);
      
        $data1->delete();
     
        return response()->json([
            'status' => 'berhasil'
    ]);
    }
}
