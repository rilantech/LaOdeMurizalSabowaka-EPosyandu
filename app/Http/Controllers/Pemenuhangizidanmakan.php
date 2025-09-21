<?php

namespace App\Http\Controllers;

use App\Models\Dataanak;
use App\Models\Dataimunisasianak;
use App\Models\Dataorangtua;
use App\Models\Datapemenuhangizidanmakan;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class Pemenuhangizidanmakan extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');

        if(!empty($search)){
            $datapemenuhangizidanmakan = Datapemenuhangizidanmakan::where('tabel_pemenuhan_gizi_dan_makan.id','like','%'.$search.'%')
           ->orwhere('tabel_pemenuhan_gizi_dan_makan.nama_anak','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            $datapemenuhangizidanmakan = Datapemenuhangizidanmakan::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamanpemenuhangizidanmakan',[
            'title' => 'Pemenuhan Gizi & Makan',
            'datapemenuhangizidanmakan' => $datapemenuhangizidanmakan,
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
        
       
        $datapemenuhangizidanmakan =new Datapemenuhangizidanmakan;
        $datapemenuhangizidanmakan->nik_ibu = $request->nik_ibu;
        $datapemenuhangizidanmakan->nama_ibu= $request->nama_ibu;
        $datapemenuhangizidanmakan->nama_anak= $request->nama_anak;
        $datapemenuhangizidanmakan->anak_ke= $request->anak_ke;
        $datapemenuhangizidanmakan->nol_sampai_enam_bulan_1 = $request->nol_sampai_enam_bulan_1;
        $datapemenuhangizidanmakan->nol_sampai_enam_bulan_2 = $request->nol_sampai_enam_bulan_2;
        $datapemenuhangizidanmakan->nol_sampai_enam_bulan_3 = $request->nol_sampai_enam_bulan_3;
        $datapemenuhangizidanmakan->nol_sampai_enam_bulan_4 = $request->nol_sampai_enam_bulan_4;
        $datapemenuhangizidanmakan->enam_sampai_sebelas_bulan_1 = $request->enam_sampai_sebelas_bulan_1;
        $datapemenuhangizidanmakan->enam_sampai_sebelas_bulan_2 = $request->enam_sampai_sebelas_bulan_2;
        $datapemenuhangizidanmakan->enam_sampai_sebelas_bulan_3 = $request->enam_sampai_sebelas_bulan_3;
        $datapemenuhangizidanmakan->enam_sampai_sebelas_bulan_4 = $request->enam_sampai_sebelas_bulan_4;
        $datapemenuhangizidanmakan->lainnya_1 = $request->lainnya_1;
        $datapemenuhangizidanmakan->lainnya_2 = $request->lainnya_2;
        $datapemenuhangizidanmakan->lainnya_3 = $request->lainnya_3;
        $datapemenuhangizidanmakan->lainnya_4 = $request->lainnya_4;
                  
        $datapemenuhangizidanmakan->save();
        
        return redirect('pemenuhangizidanmakan')->with('msg','Data Berhasil Di Tambahkan');
    }

    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Datapemenuhangizidanmakan $datapemenuhangizidanmakan1, $id)
    {
        $nik = $request->query('nik');
        $dataOrangtua = Dataorangtua::all();
        $dataorangtu = array();
        if(!empty($nik)){
            $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();  
       }

        $data1 = $datapemenuhangizidanmakan1->find($id);
             
        return view('form.detaildatapemenuhangizidanmakan')->with([
            'dataorangtua1' => $dataOrangtua,
            'dataorangtua2' => $dataorangtu,
            'id' => $id,
            'nik_ibu' => $data1->nik_ibu,
            'nama_ibu' => $data1->nama_ibu,
            'nama_anak' => $data1->nama_anak,
            'anak_ke' => $data1->anak_ke,
            'nol_sampai_enam_bulan_1' => $data1->nol_sampai_enam_bulan_1,
            'nol_sampai_enam_bulan_2' => $data1->nol_sampai_enam_bulan_2,
            'nol_sampai_enam_bulan_3' => $data1->nol_sampai_enam_bulan_3,
            'nol_sampai_enam_bulan_4' => $data1->nol_sampai_enam_bulan_4,
            'enam_sampai_sebelas_bulan_1' => $data1->enam_sampai_sebelas_bulan_1,
            'enam_sampai_sebelas_bulan_2' => $data1->enam_sampai_sebelas_bulan_2,
            'enam_sampai_sebelas_bulan_3' => $data1->enam_sampai_sebelas_bulan_3,
            'enam_sampai_sebelas_bulan_4' => $data1->enam_sampai_sebelas_bulan_4,
            'lainnya_1' => $data1->lainnya_1,
            'lainnya_2' => $data1->lainnya_2,
            'lainnya_3' => $data1->lainnya_3,
            'lainnya_4' => $data1->lainnya_4,
            'title' => 'Detail Data Pemenuhan Gizi & Makan',
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
    public function update(Request $request, Datapemenuhangizidanmakan $datapemenuhangizidanmakan3, $id)
    {
        $data= $datapemenuhangizidanmakan3->find($id);
        $data->nik_ibu = $request->nik_ibu;
        $data->nama_ibu= $request->nama_ibu;
        $data->nama_anak= $request->nama_anak;
        $data->anak_ke= $request->anak_ke;
        $data->nol_sampai_enam_bulan_1 = $request->nol_sampai_enam_bulan_1;
        $data->nol_sampai_enam_bulan_2 = $request->nol_sampai_enam_bulan_2;
        $data->nol_sampai_enam_bulan_3 = $request->nol_sampai_enam_bulan_3;
        $data->nol_sampai_enam_bulan_4 = $request->nol_sampai_enam_bulan_4;
        $data->enam_sampai_sebelas_bulan_1 = $request->enam_sampai_sebelas_bulan_1;
        $data->enam_sampai_sebelas_bulan_2 = $request->enam_sampai_sebelas_bulan_2;
        $data->enam_sampai_sebelas_bulan_3 = $request->enam_sampai_sebelas_bulan_3;
        $data->enam_sampai_sebelas_bulan_4 = $request->enam_sampai_sebelas_bulan_4;
        $data->lainnya_1 = $request->lainnya_1;
        $data->lainnya_2 = $request->lainnya_2;
        $data->lainnya_3 = $request->lainnya_3;
        $data->lainnya_4 = $request->lainnya_4;
        $data->save();
        

        return redirect('pemenuhangizidanmakan/'.$id)->with('msg','Data Berhasil Di Update');
    }



    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Datapemenuhangizidanmakan $datapemenuhangizidanmakan4, $id)
    {
        $data = $datapemenuhangizidanmakan4->find($id);
        $data->delete();
        return redirect('pemenuhangizidanmakan')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahpemenuhangizidanmakan(HttpRequest $request){
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
   return view('form.tambahdatapemenuhangizidanmakan')->with([
        'dataorangtua1' => $dataOrangtua,
        'dataorangtua2' => $dataorangtu,
        'dataanak' => $dataanak,
        'dataanak1' => $dataanak1,
        'title' => 'Tambah Data Pemenuhan Gizi & Makan',
    
    ]);
    }
}
