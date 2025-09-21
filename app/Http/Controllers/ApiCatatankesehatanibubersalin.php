<?php

namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Dataorangtua;
use App\Models\Dataanak;
use App\Models\Datakesehatanibubersalin;
use App\Models\Datakesehatanibuhamil;
use App\Models\Dataobstetri;
use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiCatatankesehatanibubersalin extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
              
        

    }

    /**
     * Show the form for creating a new resource.
     */
    public function create(Request $request)
    {
        $search = $request->data;
        $nik = $request->nik;
        $kehamilan_ke = $request->kehamilan_ke;

        $data3  = DB::table('tabel_kesehatan_ibu_bersalin') 
        ->where('nik_ibu', $nik)
        ->where('anak_ke', 'like','%'.$search.'%')
        ->get();

    //     $dataOrangtua = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
    //    ->orwhere('tabel_data_orangtua.nik','like','%'.$search.'%')->latest()->get();
   
    return response()->json([
                        'catatankesehatanibubersalin' => $data3
                    ]                   
      );
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $checksatu = "";
        $checkdua = "";
        $checktiga = "";
        $checkempat = "";
        $checklima = "";
        $checkenam = "";
        $checktujuh = "";
        $checkdelapan = "";
        $checksembilan = "";
        $checksepuluh = "";
        $checksebelas = "";
        $checkduabelas = "";

        $checksatu = $request->checksatu;
        $checkdua = $request->checkdua;
        $checktiga = $request->checktiga;
        $checkempat = $request->checkempat;
        $checklima = $request->checklima;
        $checkenam = $request->checkenam;
        $checktujuh = $request->checktujuh;
        $checkdelapan = $request->checkdelapan;
        $checksembilan = $request->checksembilan;
        $checksepuluh = $request->checksepuluh;
        $checksebelas = $request->checksebelas;
        $checkduabelas = $request->checkduabelas;

        $datakesehatanibubersalin = new Datakesehatanibubersalin;
        $datakesehatanibubersalin->nik_ibu = $request->nik_ibu;
        $datakesehatanibubersalin->tanggal_persalinan = $request->tanggal_persalinan;
        $datakesehatanibubersalin->pukul = $request->pukul;
        $datakesehatanibubersalin->umur_kehamilan = $request->umur_kehamilan;
        $datakesehatanibubersalin->penolong_persalinan = $request->penolong_persalinan;
        $datakesehatanibubersalin->cara_persalinan = $request->cara_persalinan;
        $datakesehatanibubersalin->keadaan_ibu = $request->keadaan_ibu;
        $datakesehatanibubersalin->anak_ke = $request->anak_ke;
        $datakesehatanibubersalin->berat_lahir = $request->berat_lahir;
        $datakesehatanibubersalin->panjang_badan = $request->panjang_badan;
        $datakesehatanibubersalin->lingkar_kepala = $request->lingkar_kepala;
        $datakesehatanibubersalin->jenis_kelamin = $request->jenis_kelamin;
        $datakesehatanibubersalin->kondisi_bayi_saat_lahir = $checksatu . $checkdua . $checktiga . $checkempat . $checklima . $checkenam . $checktujuh . $checkdelapan;
        $datakesehatanibubersalin->asuhan_bayi_baru_lahir = $checksembilan . $checksepuluh . $checksebelas . $checkduabelas;
        $datakesehatanibubersalin->save();
        
        return response()->json([
            'status' => 'berhasil'
    ]);
    }



    /**
     * Display the specified resource.
     */
    public function show(Datakesehatanibubersalin $datakesehatanibubersalin1, $id)
    {
        $data1 = $datakesehatanibubersalin1->find($id);
    
       
            return response()->json([
                'datakesehatanibubersalin1' => $data1
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

    // public function tampileditdata(Dataorangtua $dataorangtua1, $id)
    // {
    //     $data3 = Dataobstetri->find($id);
       
    //         return response()->json([
    //             'dataobstetri2' => [
    //             'kehamilan_ke' => $data3->kehamilan_ke,
    //             'tahun' => $data3->tahun,
    //             'lahir_hidup' => $data3->lahir_hidup,
    //             'lahir_aterm' => $data3->lahir_aterm,
    //             'lahir_spontan' => $data3->lahir_spontan,
    //             'berat_lahir_atau_panjang_lahir' => $data3->berat_lahir_atau_panjang_lahir,
    //             'tempat_bersalin_dan_tenakes' => $data3->tempat_bersalin_dan_tenakes,
    //             'kondisi_anak_saat_ini' => $data3->kondisi_anak_saat_ini,
    //             'komplikasi_kehamilan_atau_persalinan' => $data3->komplikasi_kehamilan_atau_persalinan
    //             ]
    //         ]);
        
           
        
       
    // }
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
    public function update(Request $request, Datakesehatanibubersalin $datakesehatanibubersalin3, $id)
    {
        //
        $datakesehatanibubersalin= $datakesehatanibubersalin3->find($id);
        
        $datakesehatanibubersalin->id = $request->id;
        $datakesehatanibubersalin->tanggal_persalinan= $request->tanggal_persalinan;
        $datakesehatanibubersalin->pukul = $request->pukul;
        $datakesehatanibubersalin->umur_kehamilan = $request->umur_kehamilan;
        $datakesehatanibubersalin->penolong_persalinan = $request->penolong_persalinan;
        $datakesehatanibubersalin->cara_persalinan = $request->cara_persalinan;
        $datakesehatanibubersalin->keadaan_ibu = $request->keadaan_ibu;
        $datakesehatanibubersalin->anak_ke = $request->anak_ke;
        $datakesehatanibubersalin->berat_lahir = $request->berat_lahir;
        $datakesehatanibubersalin->panjang_badan = $request->panjang_badan;
        $datakesehatanibubersalin->lingkar_kepala = $request->lingkar_kepala;
        $datakesehatanibubersalin->jenis_kelamin = $request->jenis_kelamin;
        $datakesehatanibubersalin->kondisi_bayi_saat_lahir = $request->kondisi_bayi_saat_lahir;
        $datakesehatanibubersalin->asuhan_bayi_baru_lahir = $request->asuhan_bayi_baru_lahir;
        $datakesehatanibubersalin->save();

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
