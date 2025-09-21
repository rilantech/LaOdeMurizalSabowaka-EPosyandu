<?php

namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Dataorangtua;
use App\Models\Dataanak;
use App\Models\Datakesehatanibuhamil;
use App\Models\Dataobstetri;
use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiDatakesehatanibuhamil extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
    
        $dataorangtua1=new Dataorangtua();
        $data1 = $dataorangtua1->find($request->id);
         $status_kehamilan = $request->status_kehamilan;
         
         
         if($status_kehamilan == "Berakhir"){
            $data2  = DB::table('tabel_kesehatan_ibu_hamil') 
                    ->where('nik_ibu', $data1->nik)
                    ->where('status_kehamilan', 'Berakhir')
                    ->get();
        }
        if($status_kehamilan == "Sedang Berlangsung"){
            $data2  = DB::table('tabel_kesehatan_ibu_hamil') 
                    ->where('nik_ibu', $data1->nik)
                    ->where('status_kehamilan', 'Sedang Berlangsung')
                    ->get();
        }
        if($status_kehamilan == "semua"){
            $data2  = Datakesehatanibuhamil::where('nik_ibu', $data1->nik)->get();
        
        }
        
        return response()->json([
                            'datakesehatanibuhamil' => $data2
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

        $data3  = DB::table('tabel_kesehatan_ibu_hamil') 
        ->where('nik_ibu', $nik)
        ->where('kehamilan_ke', 'like','%'.$search.'%')
        ->get();

    //     $dataOrangtua = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
    //    ->orwhere('tabel_data_orangtua.nik','like','%'.$search.'%')->latest()->get();
   
    return response()->json([
                        'detailkesehatanibuhamil' => $data3
                    ]                   
      );
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {

        $datakesehatanibuhamil =new Datakesehatanibuhamil;
        $datakesehatanibuhamil->nik_ibu = $request->nik_ibu;
        $datakesehatanibuhamil->kehamilan_ke = $request->kehamilan_ke;
        $datakesehatanibuhamil->hari_pertama_haid_terakhir= $request->hari_pertama_haid_terakhir;
        $datakesehatanibuhamil->hari_taksiran_persalinan = $request->hari_taksiran_persalinan;
        $datakesehatanibuhamil->golongan_darah = $request->golongan_darah;
        $datakesehatanibuhamil->penggunaan_kontrasepsi_sebelum_hamil = $request->penggunaan_kontrasepsi_sebelum_hamil;
        $datakesehatanibuhamil->riwayat_penyakit_yg_di_derita_ibu = $request->riwayat_penyakit_yg_di_derita_ibu;
        $datakesehatanibuhamil->riwayat_alergi = $request->riwayat_alergi;
        $datakesehatanibuhamil->status_imunisasi_tetanus_terakhir = $request->status_imunisasi_tetanus_terakhir;
        $datakesehatanibuhamil->tinggi_badan = $request->tinggi_badan;
        $datakesehatanibuhamil->status_kehamilan = "Sedang Berlangsung";

        $datakesehatanibuhamil->save();
        
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
        $data2  = Datakesehatanibuhamil::where('nik_ibu', $request->nik_ibu)->get();
             
        return response()->json([
            'datakesehatanibuhamil' => $data2
          
        ]);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Datakesehatanibuhamil $datakesehatanibuhamil3, $id)
    {
        //
        $data1= $datakesehatanibuhamil3->find($id);
        $data1->id = $request->id;
        $data1->nik_ibu = $request->nik_ibu;
        $data1->kehamilan_ke = $request->kehamilan_ke;
        $data1->hari_pertama_haid_terakhir= $request->hari_pertama_haid_terakhir;
        $data1->hari_taksiran_persalinan = $request->hari_taksiran_persalinan;
        $data1->golongan_darah = $request->golongan_darah;
        $data1->penggunaan_kontrasepsi_sebelum_hamil = $request->penggunaan_kontrasepsi_sebelum_hamil;
        $data1->riwayat_penyakit_yg_di_derita_ibu = $request->riwayat_penyakit_yg_di_derita_ibu;
        $data1->riwayat_alergi = $request->riwayat_alergi;
        $data1->status_imunisasi_tetanus_terakhir = $request->status_imunisasi_tetanus_terakhir;
        $data1->tinggi_badan = $request->tinggi_badan;
        $data1->status_kehamilan = $request->status_kehamilan;

        $data1->save();

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
