<?php

namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Dataorangtua;
use App\Models\Dataanak;
use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiDataAnak extends Controller
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
    public function create(Request $request)
    {
        $search = $request->data;

        $dataOrangtua = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
       ->orwhere('tabel_data_orangtua.nik','like','%'.$search.'%')->latest()->get();
   
    return response()->json([
                        'dataorangtua' => $dataOrangtua
                    ]                   
      );
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
     {
       
         $dataorangtua =new Dataorangtua;
         $dataanak = new Dataanak;
         $dataorangtua->nama_ibu = $request->namaibu;
         $dataorangtua->nik = $request->nik;
         $dataorangtua->tempat_atau_tanggal_lahir_ibu = $request->ttl;
         $dataorangtua->kehamilan_ke = $request->kehamilanke;
         $dataorangtua->anak_terakhir_umur = $request->anakterakhirumur;
         $dataorangtua->agama_ibu = $request->agama;
         $dataorangtua->pendidikan_ibu = $request->pendidikan;
         $dataorangtua->golongan_darah_ibu = $request->goldarah;
         $dataorangtua->pekerjaan_ibu = $request->pekerjaan;
         $dataorangtua->no_jkn_bpjs = $request->nojkn;
         $dataorangtua->nama_ayah = $request->namasuami;
         $dataorangtua->tempat_atau_tanggal_lahir_ayah = $request->ttlsuami;
         $dataorangtua->agama_ayah = $request->agamasuami;
         $dataorangtua->pendidikan_ayah = $request->pendidikansuami;
         $dataorangtua->golongan_darah_ayah = $request->goldarahsuami;
         $dataorangtua->pekerjaan_ayah = $request->pekerjaansuami;
         $dataorangtua->alamat_rumah = $request->alamatrumah;
         $dataorangtua->kecamatan = $request->kecamatan;
         $dataorangtua->kabupaten_atau_kota = $request->kabupaten;
         $dataorangtua->no_telepon = $request->notelp;
         
         $dataanak->nik_ibu = $request->nik;
         $dataanak->nama = $request->namaanak;
         $dataanak->tempat_atau_tanggal_lahir = $request->ttlanak;
         $dataanak->anak_ke = $request->anakke;
         $dataanak->dari = $request->dari;
         $dataanak->no_akta_kelahiran = $request->noaktekelahiran;
         $dataanak->no_jkn_bpjs = $request->nobpjsanak;

         $dataanak->save();
         $dataorangtua->save();

         return response()->json([
            'status' => 'berhasil'
    ]);
     }
    /**
     * Display the specified resource.
     */
    public function show($id)
    {
        $dataorangtua1 = new Dataorangtua();
        $data1 = $dataorangtua1->find($id);
        $data2  = Dataanak::where('nik_ibu', $data1->nik)->first();
            
        return response()->json([
            'data' => [
            'id' => $id,
            'nama_ibu' => $data1->nama_ibu,
            'nik' => $data1->nik,
            'tempat_atau_tanggal_lahir_ibu' => $data1->tempat_atau_tanggal_lahir_ibu,
            'agama_ibu' => $data1->agama_ibu,
            'pendidikan_ibu' => $data1->pendidikan_ibu,
            'golongan_darah_ibu' => $data1->golongan_darah_ibu,
            'pekerjaan_ibu' => $data1->pekerjaan_ibu,
            'no_jkn_bpjs' => $data1->no_jkn_bpjs,
            'nama_ayah' => $data1->nama_ayah,
            'tempat_atau_tanggal_lahir_ayah' => $data1->tempat_atau_tanggal_lahir_ayah,
            'agama_ayah' => $data1->agama_ayah,
            'pendidikan_ayah' => $data1->pendidikan_ayah,
            'golongan_darah_ayah' => $data1->golongan_darah_ayah,
            'pekerjaan_ayah' => $data1->pekerjaan_ayah,
            'alamat_rumah' => $data1->alamat_rumah,
            'kecamatan' => $data1->kecamatan,
            'kabupaten_atau_kota' => $data1->kabupaten_atau_kota,
            'no_telepon' => $data1->no_telepon,
            // 'id' => $id,
            // 'nik_ibu' => $data2->nik_ibu,
            ],
            'dataanak' => $data2
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
        
        // $dataorangtua1 = new Dataorangtua();
        $nik= "";
        $nama_ibu = "";
        $tempat_atau_tanggal_lahir_ibu="";
        $agama_ibu = "";
        $pendidikan_ibu= "";
        $golongan_darah_ibu="";
        $pekerjaan_ibu="";
        $no_jkn_bpjs="";  
        $nama_ayah="";
        $tempat_atau_tanggal_lahir_ayah=""; 
        $agama_ayah="";
        $pendidikan_ayah= "";  
        $golongan_darah_ayah="";
        $pekerjaan_ayah ="";
        $alamat_rumah ="";
        $kecamatan ="";  
        $kabupaten_atau_kota=""; 
        $no_telepon ="";  
          $data1 =  DB::table('tabel_data_orangtua')
                ->where('nik', $request->nik_ibu)
                ->get();
        foreach ($data1 as $item) {
            $nik = $item->nik;
            $nama_ibu = $item->nama_ibu;
            $nik = $item->nik;
            $tempat_atau_tanggal_lahir_ibu = $item->tempat_atau_tanggal_lahir_ibu;
            $agama_ibu =  $item->agama_ibu;
            $pendidikan_ibu=  $item->pendidikan_ibu;
            $golongan_darah_ibu= $item->golongan_darah_ibu;
            $pekerjaan_ibu= $item->pekerjaan_ibu;
            $no_jkn_bpjs=  $item->no_jkn_bpjs;  
            $nama_ayah=  $item->nama_ayah;
            $tempat_atau_tanggal_lahir_ayah=  $item->tempat_atau_tanggal_lahir_ayah; 
            $agama_ayah= $item->agama_ayah;
            $pendidikan_ayah= $item->pendidikan_ayah;  
            $golongan_darah_ayah= $item->golongan_darah_ayah;
            $pekerjaan_ayah = $item->pekerjaan_ayah;
            $alamat_rumah = $item->alamat_rumah;
            $kecamatan = $item->kecamatan;  
            $kabupaten_atau_kota= $item->kabupaten_atau_kota; 
            $no_telepon = $item->no_telepon;  
        }
        $data2  = Dataanak::where('nik_ibu', $request->nik_ibu)->get();
        

        
        return response()->json([
            'data' => [
            // 'id' => $id,
            'nama_ibu' => $nama_ibu,
            'nik' => $nik,
            'tempat_atau_tanggal_lahir_ibu' => $tempat_atau_tanggal_lahir_ibu,
            'agama_ibu' => $agama_ibu,
            'pendidikan_ibu' => $pendidikan_ibu,
            'golongan_darah_ibu' => $golongan_darah_ibu,
            'pekerjaan_ibu' => $pekerjaan_ibu,
            'no_jkn_bpjs' => $no_jkn_bpjs,
            'nama_ayah' => $nama_ayah,
            'tempat_atau_tanggal_lahir_ayah' => $tempat_atau_tanggal_lahir_ayah,
            'agama_ayah' => $agama_ayah,
            'pendidikan_ayah' => $pendidikan_ayah,
            'golongan_darah_ayah' => $golongan_darah_ayah,
            'pekerjaan_ayah' => $pekerjaan_ayah,
            'alamat_rumah' => $alamat_rumah,
            'kecamatan' => $kecamatan,
            'kabupaten_atau_kota' => $kabupaten_atau_kota,
            'no_telepon' => $no_telepon
            
            // // 'id' => $id,
            // // 'nik_ibu' => $data2->nik_ibu,
            // 'nama_anak' => $data2->nama,
            // 'tempat_atau_tanggal_lahir_anak' => $data2->tempat_atau_tanggal_lahir,
            // 'anak_ke' => $data2->anak_ke,
            // 'dari' => $data2->dari,
            // 'no_akta_kelahiran' => $data2->no_akta_kelahiran,
            // 'no_jkn_bpjs_anak' => $data2->no_jkn_bpjs,
            ],
            'dataanak' => $data2
        ]);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Dataanak $dataanak2, $id)
    {
        
        $data2= $dataanak2->find($id);

         $data2->nik_ibu = $request->nik_ibu;
         $data2->nama = $request->nama_anak;
         $data2->jenis_kelamin = $request->jenis_kelamin;
         $data2->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak;
         $data2->anak_ke = $request->anak_ke;
         $data2->dari = $request->dari;
         $data2->no_akta_kelahiran = $request->no_akta_kelahiran;
         $data2->no_jkn_bpjs = $request->no_jkn_bpjs_anak;


        //batas

        // $data1->nama_ibu = $request->nama_ibu;
        // $data1->nik = $request->nik;
        // $data1->tempat_atau_tanggal_lahir_ibu = $request->tempat_atau_tanggal_lahir_ibu;
        // $data1->kehamilan_ke = $request->kehamilan_ke;
        // $data1->anak_terakhir_umur = $request->anak_terakhir_umur;
        // $data1->agama_ibu = $request->agama_ibu;
        // $data1->pendidikan_ibu = $request->pendidikan_ibu;
        // $data1->golongan_darah_ibu = $request->golongan_darah_ibu;
        // $data1->pekerjaan_ibu = $request->pekerjaan_ibu;
        // $data1->no_jkn_bpjs = $request->no_jkn_bpjs;
        // $data1->nama_ayah = $request->nama_ayah;
        // $data1->tempat_atau_tanggal_lahir_ayah = $request->tempat_atau_tanggal_lahir_ayah;
        // $data1->agama_ayah = $request->agama_ayah;
        // $data1->pendidikan_ayah = $request->pendidikan_ayah;
        // $data1->golongan_darah_ayah = $request->golongan_darah_ayah;
        // $data1->pekerjaan_ayah = $request->pekerjaan_ayah;
        // $data1->alamat_rumah = $request->alamat_rumah;
        // $data1->kecamatan = $request->kecamatan;
        // $data1->kabupaten_atau_kota = $request->kabupaten_atau_kota;
        // $data1->no_telepon = $request->no_telepon;
         
        //  $data2->nik_ibu = $request->nik;
        //  $data2->nama = $request->nama_anak;
        //  $data2->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak;
        //  $data2->anak_ke = $request->anak_ke;
        //  $data2->dari = $request->dari;
        //  $data2->no_akta_kelahiran = $request->no_akta_kelahiran;
        //  $data2->no_jkn_bpjs = $request->no_jkn_bpjs_anak;

        // $data1->save();
        $data2->save();
        

         return response()->json([
            'status' => 'berhasil'
    ]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Dataorangtua $dataorangtua3, $id)
    {
        $data1 = $dataorangtua3->find($id);
        $data2  = Dataanak::where('nik_ibu', $data1->nik)->first();
        $data1->delete();
        $data2->delete();
        return response()->json([
            'status' => 'berhasil'
    ]);
    }
}
