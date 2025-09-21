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


class ApiHitungdatanifas extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
    
        $dataorangtua1=new Dataorangtua();
        $data1 = $dataorangtua1->find($request->id);
        $data2  = Datakesehatanibunifas::where('nik_ibu', $data1->nik)->count();
        
        return response()->json([
                            'jumlahnifas' => $data2
                        ]                   
          );
       
           
        

    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
    //     $datakesehatanibubersalin = new Datakesehatanibubersalin;
    //     $datakesehatanibubersalin->nik_ibu = $request->nik_ibu;
    //     $datakesehatanibubersalin->tanggal_persalinan= $request->tanggal_persalinan;
    //     $datakesehatanibubersalin->pukul = $request->pukul;
    //     $datakesehatanibubersalin->umur_kehamilan = $request->umur_kehamilan;
    //     $datakesehatanibubersalin->penolong_persalinan = $request->penolong_persalinan;
    //     $datakesehatanibubersalin->cara_persalinan = $request->cara_persalinan;
    //     $datakesehatanibubersalin->keadaan_ibu = $request->keadaan_ibu;
    //     $datakesehatanibubersalin->keterangan_tambahan_ibu = $request->keterangan_tambahan_ibu;
    //     $datakesehatanibubersalin->anak_ke = $request->anak_ke;
    //     $datakesehatanibubersalin->berat_lahir = $request->berat_lahir;
    //     $datakesehatanibubersalin->panjang_badan = $request->panjang_badan;
    //     $datakesehatanibubersalin->lingkar_kepala = $request->lingkar_kepala;
    //     $datakesehatanibubersalin->jenis_kelamin = $request->jenis_kelamin;
    //     $datakesehatanibubersalin->kondisi_bayi_saat_lahir = $request->kondisi_bayi_saat_lahir;
    //     $datakesehatanibubersalin->asuhan_bayi_baru_lahir = $request->asuhan_bayi_baru_lahir;
    //     $datakesehatanibubersalin->keterangan_tambahan_anak = $request->keterangan_tambahan_anak; 
    //     $datakesehatanibubersalin->save();
        
    //     return response()->json([
    //         'status' => 'berhasil'
    // ]);
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
    public function edit(string $id)
    {
        //
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
