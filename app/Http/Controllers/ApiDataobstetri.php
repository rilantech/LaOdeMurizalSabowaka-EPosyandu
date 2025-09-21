<?php

namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Dataorangtua;
use App\Models\Dataanak;
use App\Models\Dataobstetri;
use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiDataobstetri extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $dataorangtuadananak = Dataorangtua::latest()->get();
        
        return response()->json([
                            'dataorangtuadananak' => $dataorangtuadananak
                        ]                   
          );
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
       
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {

   
        $dataobstetri =new Dataobstetri;
        $dataobstetri->nik_ibu = $request->nik_ibu;
        $dataobstetri->kehamilan_ke = $request->kehamilan_ke;
        $dataobstetri->tahun= $request->tahun;
        $dataobstetri->lahir_hidup = $request->status_lahir_hidup;
        $dataobstetri->lahir_aterm = $request->status_lahir_aterm;
        $dataobstetri->lahir_spontan = $request->status_lahir_spontan;
        $dataobstetri->berat_lahir_atau_panjang_lahir = $request->berat_lahir_atau_panjang_lahir;
        $dataobstetri->tempat_bersalin_dan_tenakes = $request->tempat_bersalin_dan_tenakes;
        $dataobstetri->kondisi_anak_saat_ini = $request->kondisi_anak_saat_ini;
        $dataobstetri->komplikasi_kehamilan_atau_persalinan = $request->komplikasi_kehamilan_atau_persalinan;
       
        $dataobstetri->save();
      
      return response()->json([
        'status' => 'berhasil'
]);
    }

    /**
     * Display the specified resource.
     */
    public function show(Dataorangtua $dataorangtua1, $id)
    {
        $data1 = $dataorangtua1->find($id);
        $data2  = Dataobstetri::where('nik_ibu', $data1->nik)->get();
        // $data3 = Dataobstetri->find($id);
        $dataOrangtua = Dataorangtua::all();
       
            return response()->json([
                'dataobstetri' => $data2
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
        // $data2 =  DB::table('tabel_data_obstetri')
        // ->where('nik', $request->nik_ibu)
        // ->get();
        $data2  = Dataobstetri::where('nik_ibu', $request->nik_ibu)->get();
             
            return response()->json([
                'dataobstetri' => $data2
              
            ]);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Dataobstetri $dataobstetri3, $id)
    {
        //
        $data1= $dataobstetri3->find($id);
        $data1->id = $request->id;
        $data1->kehamilan_ke = $request->kehamilan_ke;
        $data1->tahun= $request->tahun;
        $data1->lahir_hidup = $request->status_lahir_hidup;
        $data1->lahir_aterm = $request->status_lahir_aterm;
        $data1->lahir_spontan = $request->status_lahir_spontan;
        $data1->berat_lahir_atau_panjang_lahir = $request->berat_lahir_atau_panjang_lahir;
        $data1->tempat_bersalin_dan_tenakes = $request->tempat_bersalin_dan_tenakes;
        $data1->kondisi_anak_saat_ini = $request->kondisi_anak_saat_ini;
        $data1->komplikasi_kehamilan_atau_persalinan = $request->komplikasi_kehamilan_atau_persalinan;
        $data1->save();        

         return response()->json([
            'status' => 'berhasil'
    ]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Dataobstetri $dataobstetri4, $id)
    {
        $data1 = $dataobstetri4->find($id);
      
        $data1->delete();
     
        return response()->json([
            'status' => 'berhasil'
    ]);
    }
}
