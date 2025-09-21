<?php

namespace App\Http\Controllers;

use App\Http\Requests\TambahDataorangtuadananakRequest;
use App\Models\Dataanak;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class CetakDataorangtuadananakController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
        {
            $search = $request->query('search');
    
            if(!empty($search)){
                $dataorangtuadanAnak = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
               ->orwhere('tabel_data_orangtua.nama_ibu','like','%'.$search.'%')
               ->paginate(10)->onEachSide(2)->fragment('srv');
            }else{
                $dataorangtuadanAnak = Dataorangtua::latest()->paginate(10)->onEachSide(2)->fragment('srv');
            }
            return view('tabel.cetakdataorangtuadananak',[
                'title' => 'Data Orang Tua Anak',
                'dataorangtuadananak' => $dataorangtuadanAnak,
                'search' => $search
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
  
     public function store(TambahDataorangtuadananakRequest $request)
     {
         $validate = $request->validated();
       
         $dataorangtua =new Dataorangtua;
         $dataanak = new Dataanak;
         $dataorangtua->nama_ibu = $request->nama_ibu;
         $dataorangtua->nik = $request->nik;
         $dataorangtua->tempat_atau_tanggal_lahir_ibu = $request->tempat_atau_tanggal_lahir_ibu;
         $dataorangtua->kehamilan_ke = $request->kehamilan_ke;
         $dataorangtua->anak_terakhir_umur = $request->anak_terakhir_umur;
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
         
         $dataanak->nik_ibu = $request->nik;
         $dataanak->nama = $request->nama_anak;
         $dataanak->jenis_kelamin = $request->jenis_kelamin;
         $dataanak->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak;
         $dataanak->anak_ke = $request->anak_ke;
         $dataanak->dari = $request->dari;
         $dataanak->no_akta_kelahiran = $request->no_akta_kelahiran;
         $dataanak->no_jkn_bpjs = $request->no_jkn_bpjs_anak;

         $dataanak->save();
         $dataorangtua->save();
       
         return redirect('dataorangtuadananak')->with('msg','Data Berhasil Di Tambahkan');
     }
    /**
     * Display the specified resource.
     */
    public function show(Dataorangtua $dataorangtua1, $id)
    {
        $data1 = $dataorangtua1->find($id);
        $data2  = Dataanak::where('nik_ibu', $data1->nik)->get();
            
        return view('tabel.cetakdataorangtuadananak')->with([
            'id' => $id,
            'nama_ibu' => $data1->nama_ibu,
            'nik' => $data1->nik,
            // 'tempat_atau_tanggal_lahir_ibu' => $data1->tempat_atau_tanggal_lahir_ibu,
            'tempat_lahir_ibu' => $data1->tempat_lahir_ibu,
            'tanggal_lahir_ibu' => $data1->tanggal_lahir_ibu,
            'kehamilan_ke' =>$data1->kehamilan_ke,
            'anak_terakhir_umur' => $data1->anak_terakhir_umur,
            'agama_ibu' => $data1->agama_ibu,
            'pendidikan_ibu' => $data1->pendidikan_ibu,
            'golongan_darah_ibu' => $data1->golongan_darah_ibu,
            'pekerjaan_ibu' => $data1->pekerjaan_ibu,
            'no_jkn_bpjs' => $data1->no_jkn_bpjs,
            'nama_ayah' => $data1->nama_ayah,
            // 'tempat_atau_tanggal_lahir_ayah' => $data1->tempat_atau_tanggal_lahir_ayah,
            'tempat_lahir_ayah' => $data1->tempat_lahir_ayah,
            'tanggal_lahir_ayah' => $data1->tanggal_lahir_ayah,
            'agama_ayah' => $data1->agama_ayah,
            'pendidikan_ayah' => $data1->pendidikan_ayah,
            'golongan_darah_ayah' => $data1->golongan_darah_ayah,
            'pekerjaan_ayah' => $data1->pekerjaan_ayah,
            'alamat_rumah' => $data1->alamat_rumah,
            'kecamatan' => $data1->kecamatan,
            'kabupaten_atau_kota' => $data1->kabupaten_atau_kota,
            'no_telepon' => $data1->no_telepon,
            // 'id' => $id,
            'dataanak' => $data2,

            'title' => 'Cetak Data Orang Tua & Anak',
           
        ]);
    }

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
    public function update(TambahDataorangtuadananakRequest $request, Dataorangtua $dataorangtua2, $id)
    {
        //
        $data1= $dataorangtua2->find($id);

        $data2  = Dataanak::where('nik_ibu', $data1->nik)->first();

        $data1->nama_ibu = $request->nama_ibu;
        $data1->nik = $request->nik;
        $data1->tempat_atau_tanggal_lahir_ibu = $request->tempat_atau_tanggal_lahir_ibu;
        $data1->kehamilan_ke = $request->kehamilan_ke;
        $data1->anak_terakhir_umur = $request->anak_terakhir_umur;
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
         
         $data2->nik_ibu = $request->nik;
         $data2->nama = $request->nama_anak;
         $data2->jenis_kelamin = $request->jenis_kelamin;
         $data2->tempat_atau_tanggal_lahir = $request->tempat_atau_tanggal_lahir_anak;
         $data2->anak_ke = $request->anak_ke;
         $data2->dari = $request->dari;
         $data2->no_akta_kelahiran = $request->no_akta_kelahiran;
         $data2->no_jkn_bpjs = $request->no_jkn_bpjs_anak;

         $data1->save();
         $data2->save();
        

        return redirect('dataorangtuadananak')->with('msg','Data Berhasil Di Update');
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
        return redirect('dataorangtuadananak')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahdataorangtuadananak(){
      
        return view('form.tambahdataorangtuadananak')->with([
        'title' => 'Tambah Data Orang Tua & Anak'
        
        
    ]);
}
}
