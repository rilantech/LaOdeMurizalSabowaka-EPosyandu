<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Dataimunisasianak;
use App\Models\Dataorangtua;
use App\Models\Datapemberianvitamindanobatcacing;
use Illuminate\Http\Request;
use App\Models\Dataanak;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Support\Facades\DB;


class ApiPemberianvitamindanobatcacing extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
        $pemberianvitamindanobatcacing = Datapemberianvitamindanobatcacing::latest()->get();
        
        return response()->json([
                            'pemberianvitamindanobatcacing' => $pemberianvitamindanobatcacing
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
            $data3  = DB::table('tabel_pemberian_vitamin_dan_obat_cacing') 
            ->where('nama_anak', 'like','%'.$search.'%')
            ->get();
        } else{
            $data3  = DB::table('tabel_pemberian_vitamin_dan_obat_cacing') 
            ->where('nama_anak', 'like','%'.$search.'%')
            ->where('nik_ibu', $nik_ibu)
            ->get();
        }


        // $search = $request->data;
        // $data3  = DB::table('tabel_pemberian_vitamin_dan_obat_cacing') 
        // ->where('nama_anak', 'like','%'.$search.'%')
        // ->latest()
        // ->get();
   
    return response()->json([
                        'pemberianvitamindanobatcacing' => $data3
                    ]                   
      );
    }


    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
       
        $datapemberianvitamindanobatcacing =new Datapemberianvitamindanobatcacing;
        $datapemberianvitamindanobatcacing->nik_ibu = $request->nik_ibu;
        $datapemberianvitamindanobatcacing->nama_ibu= $request->nama_ibu;
        $datapemberianvitamindanobatcacing->nama_ayah= $request->nama_ayah;
        $datapemberianvitamindanobatcacing->nama_anak= $request->nama_anak;
        $datapemberianvitamindanobatcacing->anak_ke= $request->anak_ke;
        $datapemberianvitamindanobatcacing->kapsul_biru_1 = $request->kapsul_biru_1;
        $datapemberianvitamindanobatcacing->kapsul_merah_1 = $request->kapsul_merah_1;
        $datapemberianvitamindanobatcacing->kapsul_merah_2 = $request->kapsul_merah_2;
        $datapemberianvitamindanobatcacing->obat_cacing_1 = $request->obat_cacing_1;
        $datapemberianvitamindanobatcacing->kapsul_biru_2 = $request->kapsul_biru_2;
        $datapemberianvitamindanobatcacing->kapsul_merah_3 =$request->kapsul_merah_3;
        $datapemberianvitamindanobatcacing->kapsul_merah_4 = $request->kapsul_merah_4;
        $datapemberianvitamindanobatcacing->obat_cacing_2 = $request->obat_cacing_2;
        $datapemberianvitamindanobatcacing->kapsul_biru_3 = $request->kapsul_biru_3;
        $datapemberianvitamindanobatcacing->kapsul_merah_5 = $request->kapsul_merah_5;
        $datapemberianvitamindanobatcacing->kapsul_merah_6 = $request->kapsul_merah_6;
        $datapemberianvitamindanobatcacing->obat_cacing_3 = $request->obat_cacing_3;
                  
        $datapemberianvitamindanobatcacing->save();
        
        return response()->json([
            'status' => 'berhasil'
    ]);

    }

    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Datapemberianvitamindanobatcacing $pemberianvitamindanobatcacing1, $id)
    {
        $data1 = $pemberianvitamindanobatcacing1->find($id);
             
        return response()->json([
           'detailpemberianvitamindanobatcacing' => $data1
        ]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Request $request)
    {
        $data2  = Datapemberianvitamindanobatcacing::where('nik_ibu', $request->nik_ibu)->get();
        
        return response()->json([
                            'pemberianvitamindanobatcacing' => $data2
                        ]                   
          );
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
        
        return response()->json([
            'status' => 'berhasil'
    ]);

       
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
