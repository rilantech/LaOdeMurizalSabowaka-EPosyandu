<?php

namespace App\Http\Controllers;

use App\Http\Requests\TambahDataTinggiBadanRequest;
use App\Models\Dataanak;
use App\Models\Datatinggibadan;
use App\Models\Dataorangtua;
use App\Models\Datakesehatanbayibarulahir;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class TinggiBadanBerdasarkanUmurController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');

        if(!empty($search)){
            $datatinggibadan = Datatinggibadan::where('tabel_beratbadan_berdasarkanumur.id','like','%'.$search.'%')
           ->orwhere('tabel_beratbadan_berdasarkanumur.nama_anak','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            $datatinggibadan = Datatinggibadan::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamantinggibadanberdasarkanumur',[
            'title' => 'Tinggi Badan Berdasarkan Umur',
            'datatinggibadan' => $datatinggibadan,
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
    public function store(TambahDataTinggiBadanRequest $request)
    {
        $validate = $request->validated();
       
        $datatinggibadan =new Datatinggibadan;
        $datatinggibadan->nik_ibu = $request->nik_ibu;
        $datatinggibadan->nama_ibu= $request->nama_ibu;
        $datatinggibadan->nama_ayah= $request->nama_ayah;
        $datatinggibadan->nama_anak= $request->nama_anak;
        $datatinggibadan->anak_ke= $request->anak_ke;
        $datatinggibadan->jenis_kelamin= $request->jenis_kelamin;
       
        $datatinggibadan->tinggi_badan_0 = $request->tinggi_badan_0;
        $datatinggibadan->tinggi_badan_1 = $request->tinggi_badan_1;
        $datatinggibadan->tinggi_badan_2 = $request->tinggi_badan_2;
        $datatinggibadan->tinggi_badan_3 = $request->tinggi_badan_3;
        $datatinggibadan->tinggi_badan_4 = $request->tinggi_badan_4;
        $datatinggibadan->tinggi_badan_5 = $request->tinggi_badan_5;
        $datatinggibadan->tinggi_badan_6 = $request->tinggi_badan_6;
        $datatinggibadan->tinggi_badan_7 = $request->tinggi_badan_7;
        $datatinggibadan->tinggi_badan_8 = $request-> tinggi_badan_8;
        $datatinggibadan->tinggi_badan_9 = $request->tinggi_badan_9;
        $datatinggibadan->tinggi_badan_10 = $request->tinggi_badan_10;
        $datatinggibadan->tinggi_badan_11 = $request->tinggi_badan_11;
        $datatinggibadan->tinggi_badan_12 = $request->tinggi_badan_12;
        $datatinggibadan->tinggi_badan_13 = $request->tinggi_badan_13;
        $datatinggibadan->save();
        
        return redirect('tinggibadan')->with('msg','Data Berhasil Di Tambahkan');
    }

    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Datatinggibadan $datatinggibadan1, $id)
    {
        $nik = $request->query('nik');
        $dataOrangtua = Dataorangtua::all();
        $dataorangtu = array();
        if(!empty($nik)){
            $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();  
       }

        $data1 = $datatinggibadan1->find($id);
             
        return view('form.detaildatatinggibadanberdasarkanumur')->with([
            'dataorangtua1' => $dataOrangtua,
            'dataorangtua2' => $dataorangtu,
            'id' => $id,
            'nik_ibu' => $data1->nik_ibu,
            'nama_ibu' => $data1->nama_ibu,
            'nama_ayah' => $data1->nama_ayah,
            'nama_anak' => $data1->nama_anak,
            'anak_ke' => $data1->anak_ke,
            'jenis_kelamin' => $data1->jenis_kelamin,
            'tinggi_badan_0' => $data1->tinggi_badan_0,
            'tinggi_badan_1' => $data1->tinggi_badan_1,
            'tinggi_badan_2' => $data1->tinggi_badan_2,
            'tinggi_badan_3' => $data1->tinggi_badan_3,
            'tinggi_badan_4' => $data1->tinggi_badan_4,
            'tinggi_badan_5' => $data1->tinggi_badan_5,
            'tinggi_badan_6' => $data1->tinggi_badan_6,
            'tinggi_badan_7' => $data1->tinggi_badan_7,
            'tinggi_badan_8' => $data1->tinggi_badan_8,
            'tinggi_badan_9' => $data1->tinggi_badan_9,
            'tinggi_badan_10' => $data1->tinggi_badan_10,
            'tinggi_badan_11' => $data1->tinggi_badan_11,
            'tinggi_badan_12' => $data1->tinggi_badan_12,
            'tinggi_badan_13' => $data1->tinggi_badan_13,
            'title' => 'Detail Data Tinggi Badan Berdasarkan Umur',
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
    public function update(Request $request, Datakesehatanbayibarulahir $datakesehatanbayibarulahir3, $id)
    {
        $data= $datakesehatanbayibarulahir3->find($id);
        $data->nik_ibu = $request->nik_ibu;
        $data->nama_ibu= $request->nama_ibu;
        $data->nama_ayah= $request->nama_ayah;
        $data->nama_anak= $request->nama_anak;
        $data->anak_ke= $request->anak_ke;
        $data->tanggal_kunjungan_1 =  $request->tanggal_kunjungan_1;
        $data->tanggal_kunjungan_2 =  $request->tanggal_kunjungan_2;
        $data->tanggal_kunjungan_3 =  $request->tanggal_kunjungan_3;
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
        

        return redirect('kesehatanbayibarulahir/'.$id)->with('msg','Data Berhasil Di Update');
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

    public function tambahtinggibadan(HttpRequest $request){
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
   return view('form.tambahtinggibadanberdasarkanumur')->with([
        'dataorangtua1' => $dataOrangtua,
        'dataorangtua2' => $dataorangtu,
        'dataanak' => $dataanak,
        'dataanak1' => $dataanak1,
        'title' => 'Tambah Kesehatan Bayi Baru Lahir',
    
    ]);
    }
}
