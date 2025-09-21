<?php

namespace App\Http\Controllers;

use App\Models\Datakesehatanibubersalin;
use App\Http\Requests\TambahKesehatanIbuBersalinRequest;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class KesehatanibubersalinController extends Controller
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
        // $validate = $request->validated();
        $datakesehatanibubersalin =new Datakesehatanibubersalin;
        $datakesehatanibubersalin->nik_ibu = $request->nik_ibu;
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
       
        return view('form.detailkesehatanibubersalin')->with([
            'id' => $id,
            'nik' => $data1->nik,
            'nama_ibu' => $data1->nama_ibu,
            'data2' => $data2,
            'title' => 'Detail Kesehatan Ibu Bersalin',
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
    public function update(Request $request, Datakesehatanibubersalin $datakesehatanibubersalin2, $id2)
    {
        $nik2 = $request->nik_ibu;

    

       if($nik2 != null){
      for($i = 0; $i < count($nik2); $i++){
    
    //   $data2  = $datakesehatanibubersalin2->find($request->id[$i]); 
    //   $data2->hari_pertama_haid_terakhir= $request->hari_pertama_haid_terakhir[$i];
    //   $data2->hari_taksiran_persalinan = $request->hari_taksiran_persalinan[$i];
    //   $data2->golongan_darah = $request->golongan_darah[$i];
    //   $data2->penggunaan_kontrasepsi_sebelum_hamil = $request->penggunaan_kontrasepsi_sebelum_hamil[$i];
    //   $data2->riwayat_penyakit_yg_di_derita_ibu = $request->riwayat_penyakit_yg_di_derita_ibu[$i];
    //   $data2->riwayat_alergi = $request->riwayat_alergi[$i];
    //   $data2->status_imunisasi_tetanus_terakhir = $request->status_imunisasi_tetanus_terakhir[$i];
    //   $data2->tinggi_badan = $request->tinggi_badan[$i];
    //   $data2->save();

        $datakesehatanibubersalin  = $datakesehatanibubersalin2->find($request->id[$i]); 
        $datakesehatanibubersalin->tanggal_persalinan= $request->tanggal_persalinan[$i];
        $datakesehatanibubersalin->pukul = $request->pukul[$i];
        $datakesehatanibubersalin->umur_kehamilan = $request->umur_kehamilan[$i];
        $datakesehatanibubersalin->penolong_persalinan = $request->penolong_persalinan[$i];
        $datakesehatanibubersalin->cara_persalinan = $request->cara_persalinan[$i];
        $datakesehatanibubersalin->keadaan_ibu = $request->keadaan_ibu[$i];
        $datakesehatanibubersalin->anak_ke = $request->anak_ke[$i];
        $datakesehatanibubersalin->berat_lahir = $request->berat_lahir[$i];
        $datakesehatanibubersalin->panjang_badan = $request->panjang_badan[$i];
        $datakesehatanibubersalin->lingkar_kepala = $request->lingkar_kepala[$i];
        $datakesehatanibubersalin->jenis_kelamin = $request->jenis_kelamin[$i];
        $datakesehatanibubersalin->kondisi_bayi_saat_lahir = $request->kondisi_bayi_saat_lahir[$i];
        $datakesehatanibubersalin->asuhan_bayi_baru_lahir = $request->asuhan_bayi_baru_lahir[$i];
        $datakesehatanibubersalin->save();
        
      }
       }
       
         return redirect(request()->header('Referer'))->with('msg','Data Berhasil DiUpdate!');
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
