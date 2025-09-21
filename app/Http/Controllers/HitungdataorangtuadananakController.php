<?php

namespace App\Http\Controllers;

use App\Http\Requests\TambahDataorangtuadananakRequest;
use App\Models\Dataanak;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Support\Facades\DB;

class HitungdataorangtuadananakController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
        {
           
               
                $data1 = $dataorangtua1->all();
                $data2  = Dataanak::where('nik_ibu', $data1->nik)->count();
        
          
            return view('tabel.halamanorangtuadananak',[
                'jumlahdataanak' => $data2,
                
              ]
              );
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create(Request $request)
    {
        $nikibu2 = $request->nik_ibu2;
            for($i=0; $i < count($nikibu2); $i++)
            {
            $dataanak = new Dataanak;
            $dataanak->nik_ibu =$request->nik_ibu2[$i];
            $dataanak->nama = $request->nama_anak2[$i];
            $dataanak->jenis_kelamin = $request->jenis_kelamin2[$i];
            $dataanak->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak2[$i];
            $dataanak->anak_ke = $request->anak_ke2[$i];
            $dataanak->dari = $request->dari2[$i];
            $dataanak->no_akta_kelahiran = $request->no_akta_kelahiran2[$i];
            $dataanak->no_jkn_bpjs = $request->no_jkn_bpjs_anak2[$i];
            $dataanak->save();
         
            }
            
     
        
          

            return redirect('dataorangtuadananak')->with('msg','Data Berhasil Di Tersimpan!');

    }

    /**
     * Store a newly created resource in storage.
     */
  
     public function store(Request $request)
     {
        //  $validate = $request->validated();
        $nikibu2 = $request->nik_ibu2;
         $dataorangtua =new Dataorangtua;
        
         $dataorangtua->nama_ibu = $request->nama_ibu;
         $dataorangtua->nik = $request->nik;
         $dataorangtua->tempat_atau_tanggal_lahir_ibu = $request->tempat_atau_tanggal_lahir_ibu;
         $dataorangtua->agama_ibu = $request->agama_ibu;
         $dataorangtua->pendidikan_ibu = $request->pendidikan_ibu;
         $dataorangtua->golongan_darah_ibu = $request->golongan_darah_ibu;
         $dataorangtua->pekerjaan_ibu = $request->pekerjaan_ibu;
         $dataorangtua->no_jkn_bpjs = $request->no_jkn_bpjs;
         $dataorangtua->nama_ayah = $request->nama_ayah;
         $dataorangtua->tempat_atau_tanggal_lahir_ayah = $request->tempat_atau_tanggal_lahir_ayah;
         $dataorangtua->agama_ayah = $request->agama_ayah;
         $dataorangtua->pendidikan_ayah = $request->pendidikan_ayah;
         $dataorangtua->golongan_darah_ayah = $request->golongan_darah_ayah;
         $dataorangtua->pekerjaan_ayah = $request->pekerjaan_ayah;
         $dataorangtua->alamat_rumah = $request->alamat_rumah;
         $dataorangtua->kecamatan = $request->kecamatan;
         $dataorangtua->kabupaten_atau_kota = $request->kabupaten_atau_kota;
         $dataorangtua->no_telepon = $request->no_telepon;

        $dataanak = new Dataanak;
        $dataanak->nik_ibu =$request->nik;
        $dataanak->nama = $request->nama_anak;
        $dataanak->jenis_kelamin = $request->jenis_kelamin;
        $dataanak->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak;
        $dataanak->anak_ke = $request->anak_ke;
        $dataanak->dari = $request->dari;
        $dataanak->no_akta_kelahiran = $request->no_akta_kelahiran;
        $dataanak->no_jkn_bpjs = $request->no_jkn_bpjs_anak;
        $dataanak->save();
        $dataorangtua->save();

     

       
       
        return redirect('dataorangtuadananak')->with('msg','Data Berhasil Di Tersimpan!');
     }
    /**
     * Display the specified resource.
     */
    public function show(Dataorangtua $dataorangtua1, $id)
    {
        $data1 = $dataorangtua1->find($id);
        $data2  = Dataanak::where('nik_ibu', $data1->nik)->get();
            
        return view('form.detaildataorangtuadananak')->with([
            'id' => $id,
            'nama_ibu' => $data1->nama_ibu,
            'nik' => $data1->nik,
            'tempat_atau_tanggal_lahir_ibu' => $data1->tempat_atau_tanggal_lahir_ibu,
            'kehamilan_ke' =>$data1->kehamilan_ke,
            'anak_terakhir_umur' => $data1->anak_terakhir_umur,
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
            'dataanak' => $data2,
            // 'nama_anak' => $data2->nama,
            // 'tempat_atau_tanggal_lahir_anak' => $data2->tempat_atau_tanggal_lahir,
            // 'anak_ke' => $data2->anak_ke,
            // 'dari' => $data2->dari,
            // 'no_akta_kelahiran' => $data2->no_akta_kelahiran,
            // 'no_jkn_bpjs_anak' => $data2->no_jkn_bpjs,

            'title' => 'Detail Data Orang Tua & Anak',
           
        ]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    // public function edit(Request $request, Dataanak $dataanak3)
    // {
          
          
    //       $idorangtua = $request->id;
    //       $idanak = $request->idanak;
        
    //     if($idanak != null){
           
    //      for($k=0; $k < count($idanak); $k++ )
    //         {
    //           $data3  = $dataanak3->find($request->idanak[$k]); 
    //           $data3->delete();
         
    //         }
    //     }
        
    //       return redirect('dataorangtuadananak/'.$idorangtua)->with('msg','Data Berhasil Di Hapus');
      
    // }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Dataanak $dataanak2, Dataorangtua $dataorangtua2, $id)
    {
        //

        $data1= $dataorangtua2->find($id);
        // $data2  = Dataanak::where('nik_ibu', $data1->nik)->first();
        $nikibu1 = $request->nik_ibu;
        $nikibu2 = $request->nik_ibu2;

        $data1->nama_ibu = $request->nama_ibu;
        $data1->nik = $request->nik;
        $data1->tempat_atau_tanggal_lahir_ibu = $request->tempat_atau_tanggal_lahir_ibu;
        $data1->agama_ibu = $request->agama_ibu;
        $data1->pendidikan_ibu = $request->pendidikan_ibu;
        $data1->golongan_darah_ibu = $request->golongan_darah_ibu;
        $data1->pekerjaan_ibu = $request->pekerjaan_ibu;
        $data1->no_jkn_bpjs = $request->no_jkn_bpjs;
        $data1->nama_ayah = $request->nama_ayah;
        $data1->tempat_atau_tanggal_lahir_ayah = $request->tempat_atau_tanggal_lahir_ayah;
        $data1->agama_ayah = $request->agama_ayah;
        $data1->pendidikan_ayah = $request->pendidikan_ayah;
        $data1->golongan_darah_ayah = $request->golongan_darah_ayah;
        $data1->pekerjaan_ayah = $request->pekerjaan_ayah;
        $data1->alamat_rumah = $request->alamat_rumah;
        $data1->kecamatan = $request->kecamatan;
        $data1->kabupaten_atau_kota = $request->kabupaten_atau_kota;
        $data1->no_telepon = $request->no_telepon;
        $data1->save();


        if($nikibu1 != null){
     
        for($j=0; $j < count($nikibu1); $j++ )
            {
         $data2  = $dataanak2->find($request->id2[$j]); 
         $data2->id = $request->id2[$j];
         $data2->nik_ibu = $request->nik;
         $data2->nama = $request->nama_anak[$j];
         $data2->jenis_kelamin = $request->jenis_kelamin[$j];
         $data2->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak[$j];
         $data2->anak_ke = $request->anak_ke[$j];
         $data2->dari = $request->dari[$j];
         $data2->no_akta_kelahiran = $request->no_akta_kelahiran[$j];
         $data2->no_jkn_bpjs = $request->no_jkn_bpjs_anak[$j];
         $data2->save();
            }
        }

       $namaanak= $request->nama_anak2;
            $dataanak = array();
          if($namaanak != null){
            $dataanak = new Dataanak;
            $dataanak->nik_ibu =$request->nik;
            $dataanak->nama = $request->nama_anak2;
            $dataanak->jenis_kelamin = $request->jenis_kelamin2;
            $dataanak->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak2;
            $dataanak->anak_ke = $request->anak_ke2;
            $dataanak->dari = $request->dari2;
            $dataanak->no_akta_kelahiran = $request->no_akta_kelahiran2;
            $dataanak->no_jkn_bpjs = $request->no_jkn_bpjs_anak2;
            $dataanak->save();
            }



        return redirect('dataorangtuadananak/'.$id)->with('msg','Data Berhasil Di Update');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Dataanak $data5, Request $request, $id)
    {
        // if($id != null){
            
        // }
        // $data1 = $dataorangtua3->find($id);
        
        // $data2  = Dataanak::where('nik_ibu', $data1->nik)->first();
        // $data1->delete();
        // $data2->delete();
        $idorangtua = $request->query('id');
        $idanak = $request->idanak;
        $data6  = $data5->find($id); 
        $data6->delete();
    
           
            
         

    
        return redirect('dataorangtuadananak/'.$id)->with('msg','Data Berhasil Di Hapus');
        // return redirect('dataorangtuadananak')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahdataorangtuadananak(){
      
        return view('form.tambahdataorangtuadananak')->with([
        'title' => 'Tambah Data Orang Tua & Anak'
        
        
    ]);
}
}
