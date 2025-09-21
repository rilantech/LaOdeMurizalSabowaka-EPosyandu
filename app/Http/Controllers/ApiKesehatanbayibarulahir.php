<?php

namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Dataanak;
use App\Models\Datakesehatanbayibarulahir;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Support\Facades\DB;

class ApiKesehatanbayibarulahir extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
        $kesehatanbayibarulahir = Datakesehatanbayibarulahir::latest()->get();
        
        return response()->json([
                            'kesehatanbayibarulahir2' => $kesehatanbayibarulahir
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
       
        $datakesehatanbayibarulahir =new Datakesehatanbayibarulahir;
        $datakesehatanbayibarulahir->nik_ibu = $request->nik_ibu;
        $datakesehatanbayibarulahir->nama_ibu= $request->nama_ibu;
        $datakesehatanbayibarulahir->nama_ayah= $request->nama_ayah;
        $datakesehatanbayibarulahir->nama_anak= $request->nama_anak;
        $datakesehatanbayibarulahir->anak_ke= $request->anak_ke;
       $datakesehatanbayibarulahir->tanggal_kunjungan_1 = date('d-m-Y', strtotime(str_replace('-', '/', $request->tanggal_kunjungan_1)));
        $datakesehatanbayibarulahir->tanggal_kunjungan_2 = date('d-m-Y', strtotime(str_replace('-', '/', $request->tanggal_kunjungan_2)));
        $datakesehatanbayibarulahir->tanggal_kunjungan_3 = date('d-m-Y', strtotime(str_replace('-', '/', $request->tanggal_kunjungan_3)));
        $datakesehatanbayibarulahir->berat_badan_1 = $request->berat_badan_1;
        $datakesehatanbayibarulahir->berat_badan_2 = $request->berat_badan_2;
        $datakesehatanbayibarulahir->berat_badan_3 = $request->berat_badan_3;
        $datakesehatanbayibarulahir->panjang_badan_1 = $request->panjang_badan_1;
        $datakesehatanbayibarulahir->panjang_badan_2 = $request->panjang_badan_2;
        $datakesehatanbayibarulahir->panjang_badan_3 = $request->panjang_badan_3;
        $datakesehatanbayibarulahir->suhu_1 = $request->suhu_1;
        $datakesehatanbayibarulahir->suhu_2 = $request->suhu_2;
        $datakesehatanbayibarulahir->suhu_3 = $request->suhu_3;
        $datakesehatanbayibarulahir->dan_lain_lain_1 = $request->dan_lain_lain_1; 
        $datakesehatanbayibarulahir->dan_lain_lain_2 = $request->dan_lain_lain_2;
        $datakesehatanbayibarulahir->dan_lain_lain_3 = $request->dan_lain_lain_3;
        $datakesehatanbayibarulahir->save();
        
        return response()->json([
            'status' => 'berhasil'
    ]);
    }

    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Datakesehatanbayibarulahir $kesehatanbayibarulahir1, $id)
    {
    
        $data1 = $kesehatanbayibarulahir1->find($id);
             
        return response()->json([
           'detailkesehatanbayibarulahir' => $data1
        ]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Request $request)
    {
    
        $data2  = Datakesehatanbayibarulahir::where('nik_ibu', $request->nik_ibu)->get();
        
        return response()->json([
                            'kesehatanbayibarulahir2' => $data2
                        ]                   
          );
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Datakesehatanbayibarulahir $datakesehatanbayibarulahir3, $id)
    {
        $data= $datakesehatanbayibarulahir3->find($id);
        $data->nik_ibu = $request->nik_ibu;
        $data->nama_ibu= $request->nama_ibu;
        $data->nama_anak= $request->nama_anak;
        $data->anak_ke= $request->anak_ke;
        $data->tanggal_kunjungan_1 = $request->tanggal_kunjungan_1;
        $data->tanggal_kunjungan_2 = $request->tanggal_kunjungan_2;
        $data->tanggal_kunjungan_3 = $request->tanggal_kunjungan_3;
        $data->berat_badan_1 = $request->berat_badan_1;
        $data->berat_badan_2 = $request->berat_badan_2;
        $data->berat_badan_3 = $request->berat_badan_3;
        $data->panjang_badan_1 = $request->panjang_badan_1;
        $data->panjang_badan_2 = $request->panjang_badan_2;
        $data->panjang_badan_3 = $request->panjang_badan_3;
        $data->suhu_1 = $request->suhu_1;
        $data->suhu_2 = $request->suhu_2;
        $data->suhu_3 = $request->suhu_3;
        $data->dan_lain_lain_1 = $request->dan_lain_lain_1; 
        $data->dan_lain_lain_2 = $request->dan_lain_lain_2;
        $data->dan_lain_lain_3 = $request->dan_lain_lain_3;
        $data->save();
        

        return response()->json([
            'status' => 'berhasil'
    ]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Datakesehatanbayibarulahir $databayibarulahir4, $id)
    {
        $data = $databayibarulahir4->find($id);
        $data->delete();
        return redirect('kesehatanbayibarulahir')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahkesehatanbayibarulahir(Request $request){
        $nik = $request->query('nik');
        $namaanak = $request->query('namaanak');
        $dataOrangtua = Dataorangtua::all();
        $dataorangtu = array();
        $dataanak1 = array();
        $dataanak = array();
        if(!empty($nik)){
            $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();
            $dataanak = Dataanak::where('tabel_data_anak.nik_ibu', $nik)->get();
           
       }
       if(!empty($namaanak)){
        $dataanak1 = Dataanak::where('tabel_data_anak.nama', $namaanak)->get();
       
   }
   return response()->json([
    'dataorangtua1' => $dataOrangtua,
    'dataorangtua2' => $dataorangtu,
    'dataanak' => $dataanak,
    'dataanak1' => $dataanak1,
]);
}

public function caridataibudananak(HttpRequest $request){
    $nik = $request->query('nik');
    $namaanak = $request->query('namaanak');
    $dataorangtu = array();
    $dataanak1 = array();
    $dataanak = array();
    if(!empty($nik)){
        $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();
        $dataanak = Dataanak::where('tabel_data_anak.nik_ibu', $nik)->get();
       
   }
   if(!empty($namaanak)){
    $dataanak1 = Dataanak::where('tabel_data_anak.nama', $namaanak)->get();
   
}
return response()->json([
'dataorangtua2' => $dataorangtu,
'dataanak1' => $dataanak1,
]);
}
}
