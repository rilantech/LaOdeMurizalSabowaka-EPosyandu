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


class ApiDataobstetri2 extends Controller
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
        $nik = $request->nik;

        $data3  = DB::table('tabel_data_obstetri') 
        ->where('nik_ibu', $nik)
        ->where('kehamilan_ke', 'like','%'.$search.'%')
        ->get();

    //     $dataOrangtua = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
    //    ->orwhere('tabel_data_orangtua.nik','like','%'.$search.'%')->latest()->get();
   
    return response()->json([
                        'dataobstetri' => $data3
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
        $dataobstetri = new Dataobstetri();
        $data3 = $dataobstetri->find($id);
    
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
    public function update(Request $request, Dataorangtua $dataorangtua2, $id)
    {
        //
        $data1= $dataorangtua2->find($id);

        $data2  = Dataanak::where('nik_ibu', $data1->nik)->first();
        $data1->nama_ibu = $request->namaibu;
        $data1->nik = $request->nik;
        $data1->tempat_atau_tanggal_lahir_ibu = $request->ttl;
        $data1->kehamilan_ke = $request->kehamilanke;
        $data1->anak_terakhir_umur = $request->anakterakhirumur;
        $data1->agama_ibu = $request->agama;
        $data1->pendidikan_ibu = $request->pendidikan;
        $data1->golongan_darah_ibu = $request->goldarah;
        $data1->pekerjaan_ibu = $request->pekerjaan;
        $data1->no_jkn_bpjs = $request->nojkn;
        $data1->nama_ayah = $request->namasuami;
        $data1->tempat_atau_tanggal_lahir_ayah = $request->ttlsuami;
        $data1->agama_ayah = $request->agamasuami;
        $data1->pendidikan_ayah = $request->pendidikansuami;
        $data1->golongan_darah_ayah = $request->goldarahsuami;
        $data1->pekerjaan_ayah = $request->pekerjaansuami;
        $data1->alamat_rumah = $request->alamatrumah;
        $data1->kecamatan = $request->kecamatan;
        $data1->kabupaten_atau_kota = $request->kabupaten;
        $data1->no_telepon = $request->notelp;
        
        $data2->nik_ibu = $request->nik;
        $data2->nama = $request->namaanak;
        $data2->tempat_atau_tanggal_lahir = $request->ttlanak;
        $data2->anak_ke = $request->anakke;
        $data2->dari = $request->dari;
        $data2->no_akta_kelahiran = $request->noaktekelahiran;
        $data2->no_jkn_bpjs = $request->nobpjsanak;


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

         $data1->save();
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
