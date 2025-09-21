<?php

namespace App\Http\Controllers;

use App\Models\Dataimunisasianak;
use App\Models\Dataorangtua;
use App\Models\Datapemberianvitamindanobatcacing;
use Illuminate\Http\Request;
use App\Models\Dataanak;
use Illuminate\Http\Request as HttpRequest;


class CetakPemberianvitamindanobatcacing extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');

        if(!empty($search)){
            $datapemberianvitamindanobatcacing = Datapemberianvitamindanobatcacing::where('tabel_pemberian_vitamin_dan_obat_cacing.id','like','%'.$search.'%')
           ->orwhere('tabel_pemberian_vitamin_dan_obat_cacing.nama_anak','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            $datapemberianvitamindanobatcacing = Datapemberianvitamindanobatcacing::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamandatapemberianvitamindanobatcacing',[
            'title' => 'Pemberian Vitamin & Obat Cacing',
            'datapemberianvitamindanobatcacing' => $datapemberianvitamindanobatcacing,
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
       
        $datapemberianvitamindanobatcacing =new Datapemberianvitamindanobatcacing;
        $datapemberianvitamindanobatcacing->nik_ibu = $request->nik_ibu;
        $datapemberianvitamindanobatcacing->nama_ibu= $request->nama_ibu;
        $datapemberianvitamindanobatcacing->nama_anak= $request->nama_anak;
        $datapemberianvitamindanobatcacing->anak_ke= $request->anak_ke;
        $datapemberianvitamindanobatcacing->kapsul_biru_1 = $request->kapsul_biru_1;
        $datapemberianvitamindanobatcacing->kapsul_merah_1 = $request->kapsul_merah_1;
        $datapemberianvitamindanobatcacing->kapsul_merah_2 = $request->kapsul_merah_2;
        $datapemberianvitamindanobatcacing->obat_cacing_1 = $request->obat_cacing_1;
        $datapemberianvitamindanobatcacing->kapsul_biru_2 = $request->kapsul_biru_2;
        $datapemberianvitamindanobatcacing->kapsul_merah_3 = $request->kapsul_merah_3;
        $datapemberianvitamindanobatcacing->kapsul_merah_4 = $request->kapsul_merah_4;
        $datapemberianvitamindanobatcacing->obat_cacing_2 = $request->obat_cacing_2;
        $datapemberianvitamindanobatcacing->kapsul_biru_3 = $request->kapsul_biru_3;
        $datapemberianvitamindanobatcacing->kapsul_merah_5 = $request->kapsul_merah_5;
        $datapemberianvitamindanobatcacing->kapsul_merah_6 = $request->kapsul_merah_6;
        $datapemberianvitamindanobatcacing->obat_cacing_3 = $request->obat_cacing_3;
                  
        $datapemberianvitamindanobatcacing->save();
        
        return redirect('pemberianvitamindanobatcacing')->with('msg','Data Berhasil Di Tambahkan');
    }

    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Datapemberianvitamindanobatcacing $pemberianvitamindanobatcacing1, $id)
    {
        $nik = $request->query('nik');
        $dataOrangtua = Dataorangtua::all();
        $dataorangtu = array();
        if(!empty($nik)){
            $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();  
       }

        $data1 = $pemberianvitamindanobatcacing1->find($id);
             
        return view('tabel.cetakpemberianvitamindanobatcacing')->with([
            'dataorangtua1' => $dataOrangtua,
            'dataorangtua2' => $dataorangtu,
            'id' => $id,
            'nik_ibu' => $data1->nik_ibu,
            'nama_ibu' => $data1->nama_ibu,
            'nama_ayah' => $data1->nama_ayah,
            'nama_anak' => $data1->nama_anak,
            'anak_ke' => $data1->anak_ke,
            'kapsul_biru_1' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_biru_1))),
            'kapsul_merah_1' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_merah_1))),
            'kapsul_merah_2' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_merah_2))),
            'obat_cacing_1' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->obat_cacing_1))),
            'kapsul_biru_2' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_biru_2))),
            'kapsul_merah_3' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_merah_3))),
            'kapsul_merah_4' =>   date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_merah_4))),
            'obat_cacing_2' =>   date('d-m-Y', strtotime(str_replace('-', '/',$data1->obat_cacing_2))),
            'kapsul_biru_3' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_biru_3))),
            'kapsul_merah_5' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_merah_5))),
            'kapsul_merah_6' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->kapsul_merah_6))),
            'obat_cacing_3' =>  date('d-m-Y', strtotime(str_replace('-', '/',$data1->obat_cacing_3))),
            'title' => 'Cetak Pemberian Vitamin & Obat Cacing',
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
    public function update(Request $request, Datapemberianvitamindanobatcacing $datapemberianvitamindanobatcacing3, $id)
    {
        $data= $datapemberianvitamindanobatcacing3->find($id);
        $data->nik_ibu = $request->nik_ibu;
        $data->nama_ibu= $request->nama_ibu;
        $data->nama_anak= $request->nama_anak;
        $data->anak_ke= $request->anak_ke;
        $data->kapsul_biru_1 = $request->kapsul_biru_1;
        $data->kapsul_merah_1 = $request->kapsul_merah_1;
        $data->kapsul_merah_2 = $request->kapsul_merah_2;
        $data->obat_cacing_1 = $request->obat_cacing_1;
        $data->kapsul_biru_2 = $request->kapsul_biru_2;
        $data->kapsul_merah_3 = $request->kapsul_merah_3;
        $data->kapsul_merah_4 = $request->kapsul_merah_4;
        $data->obat_cacing_2 = $request->obat_cacing_2;
        $data->kapsul_biru_3 = $request->kapsul_biru_3;
        $data->kapsul_merah_5 = $request->kapsul_merah_5;
        $data->kapsul_merah_6 = $request->kapsul_merah_6;
        $data->obat_cacing_3 = $request->obat_cacing_3;
        $data->save();
        

        return redirect('pemberianvitamindanobatcacing/'.$id)->with('msg','Data Berhasil Di Update');
    }


    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Datapemberianvitamindanobatcacing $datapemberianvitamindanobatcacing4, $id)
    {
        $data = $datapemberianvitamindanobatcacing4->find($id);
        $data->delete();
        return redirect('pemberianvitamindanobatcacing')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahpemberianvitamindanobatcacing(HttpRequest $request){
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
   return view('form.tambahdatapemberianvitamindanobatcacing')->with([
        'dataorangtua1' => $dataOrangtua,
        'dataorangtua2' => $dataorangtu,
        'dataanak' => $dataanak,
        'dataanak1' => $dataanak1,
        'title' => 'Tambah Data Pemberian Vitamin & Obat Cacing',
    
    ]);
    }
}
