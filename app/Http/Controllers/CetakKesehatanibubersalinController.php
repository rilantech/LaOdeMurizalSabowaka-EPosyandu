<?php

namespace App\Http\Controllers;

use App\Models\Datakesehatanibubersalin;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class CetakKesehatanibubersalinController extends Controller
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
        return view('tabel.halamankesehatanibubersalin',[
            'title' => 'Kesehatan Ibu Bersalin',
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
    public function store(Request $request)
    {
       
        $datakesehatanibubersalin =new Datakesehatanibubersalin;
        $datakesehatanibubersalin->nik_ibu = $request->nik_ibu;
        $datakesehatanibubersalin->tanggal_persalinan= $request->tanggal_persalinan;
        $datakesehatanibubersalin->pukul = $request->pukul;
        $datakesehatanibubersalin->umur_kehamilan = $request->umur_kehamilan;
        $datakesehatanibubersalin->penolong_persalinan = $request->penolong_persalinan;
        $datakesehatanibubersalin->cara_persalinan = $request->cara_persalinan;
        $datakesehatanibubersalin->keadaan_ibu = $request->keadaan_ibu;
        $datakesehatanibubersalin->keterangan_tambahan_ibu = $request->keterangan_tambahan_ibu;
        $datakesehatanibubersalin->anak_ke = $request->anak_ke;
        $datakesehatanibubersalin->berat_lahir = $request->berat_lahir;
        $datakesehatanibubersalin->panjang_badan = $request->panjang_badan;
        $datakesehatanibubersalin->lingkar_kepala = $request->lingkar_kepala;
        $datakesehatanibubersalin->jenis_kelamin = $request->jenis_kelamin;
        $datakesehatanibubersalin->kondisi_bayi_saat_lahir = $request->kondisi_bayi_saat_lahir;
        $datakesehatanibubersalin->asuhan_bayi_baru_lahir = $request->asuhan_bayi_baru_lahir;
        $datakesehatanibubersalin->keterangan_tambahan_anak = $request->keterangan_tambahan_anak; 
        $datakesehatanibubersalin->save();
        
        return redirect('kesehatanibubersalin')->with('msg','Data Berhasil Di Tambahkan');
    }

    /**
     * Display the specified resource.
     */
    public function show(Dataorangtua $dataorangtua1, $id)
    {
        $data1 = $dataorangtua1->find($id);
        $data2  = Datakesehatanibubersalin::where('nik_ibu', $data1->nik)->paginate(1)->onEachSide(2)->fragment('srv');
        $dataOrangtua = Dataorangtua::all();
       
        return view('tabel.cetakkesehatanibubersalin')->with([
            'id' => $id,
            'nik' => $data1->nik,
            'nama_ibu' => $data1->nama_ibu,
            'data2' => $data2,
            'title' => 'Cetak Kesehatan Ibu Bersalin',
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
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }

    public function tambahkesehatanibubersalin(HttpRequest $request){
        $nik = $request->query('nik');
        $nama_ibu = $request->query('nama_ibu');
   
      
   return view('form.tambahkesehatanibubersalin')->with([
        'nik' => $nik,
        'nama_ibu' => $nama_ibu,
        'title' => 'Tambah Kesehatan Ibu Bersalin',
    
    ]);
    }
}
