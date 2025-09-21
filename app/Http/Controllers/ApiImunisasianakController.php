<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;


use App\Models\Dataanak;
use App\Models\Dataimunisasianak;
use App\Models\Datakesehatanbayibarulahir;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Support\Facades\DB;

class ApiImunisasianakController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
        $imunisasianak = Dataimunisasianak::latest()->get();
        
        return response()->json([
                            'imunisasianak2' => $imunisasianak
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
            $data3  = DB::table('tabel_data_imunisasi_anak') 
            ->where('nama_anak', 'like','%'.$search.'%')
            ->get();
        } else{
            $data3  = DB::table('tabel_data_imunisasi_anak') 
            ->where('nama_anak', 'like','%'.$search.'%')
            ->where('nik_ibu', $nik_ibu)
            ->get();
        }

        // $search = $request->data;
        // $data3  = DB::table('tabel_data_imunisasi_anak') 
        // ->where('nama_anak', 'like','%'.$search.'%')
        // ->latest()
        // ->get();
   
    return response()->json([
                        'kesehatanimunisasianak' => $data3
                    ]                   
      );
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
       
        $dataimunisasianak =new Dataimunisasianak;
        $dataimunisasianak->nik_ibu = $request->nik_ibu;
        $dataimunisasianak->nama_ibu= $request->nama_ibu;
        $dataimunisasianak->nama_ayah= $request->nama_ayah;
        $dataimunisasianak->nama_anak= $request->nama_anak;
        $dataimunisasianak->anak_ke= $request->anak_ke;
       $dataimunisasianak->nik_ibu = $request->nik_ibu;
        $dataimunisasianak->nama_ibu= $request->nama_ibu;
        $dataimunisasianak->nama_ayah= $request->nama_ayah;
        $dataimunisasianak->nama_anak= $request->nama_anak;
        $dataimunisasianak->anak_ke= $request->anak_ke;
        $dataimunisasianak->hepatitis_0 = $request->hepatitis_0;
        $dataimunisasianak->hepatitis_1 = $request->hepatitis_1;
        $dataimunisasianak->hepatitis_2 = $request->hepatitis_2;
        $dataimunisasianak->hepatitis_3 = $request->hepatitis_3;
        $dataimunisasianak->hepatitis_4 = $request->hepatitis_4;
        $dataimunisasianak->hepatitis_5 = $request->hepatitis_5;
        $dataimunisasianak->hepatitis_6 = $request->hepatitis_6;
        $dataimunisasianak->hepatitis_7 = $request->hepatitis_7;
        $dataimunisasianak->hepatitis_8 = $request->hepatitis_8;
        $dataimunisasianak->hepatitis_9 = $request->hepatitis_9;
        $dataimunisasianak->hepatitis_10 = $request->hepatitis_10;
        $dataimunisasianak->hepatitis_11 = $request->hepatitis_11;
        $dataimunisasianak->hepatitis_12 = $request->hepatitis_12;
        $dataimunisasianak->bcg_0 = $request->bcg_0;
        $dataimunisasianak->bcg_1 = $request->bcg_1;
        $dataimunisasianak->bcg_2 = $request->bcg_2;
        $dataimunisasianak->bcg_3 = $request->bcg_3;
        $dataimunisasianak->bcg_4 = $request->bcg_4;
        $dataimunisasianak->bcg_5 = $request->bcg_5;
        $dataimunisasianak->bcg_6 = $request->bcg_6; 
        $dataimunisasianak->bcg_7 = $request->bcg_7;
        $dataimunisasianak->bcg_8 = $request->bcg_8;
        $dataimunisasianak->bcg_9 = $request->bcg_9;
        $dataimunisasianak->bcg_10 = $request->bcg_10;
        $dataimunisasianak->bcg_11 = $request->bcg_11;
        $dataimunisasianak->bcg_12 = $request->bcg_12;
        $dataimunisasianak->polio_tetes_0 = $request->polio_tetes_0;
        $dataimunisasianak->polio_tetes_1 = $request->polio_tetes_1;
        $dataimunisasianak->polio_tetes_2 = $request->polio_tetes_2;
        $dataimunisasianak->polio_tetes_3 = $request->polio_tetes_3;
        $dataimunisasianak->polio_tetes_4 = $request->polio_tetes_4;
        $dataimunisasianak->polio_tetes_5 = $request->polio_tetes_5;
        $dataimunisasianak->polio_tetes_6 = $request->polio_tetes_6;
        $dataimunisasianak->polio_tetes_7 = $request->polio_tetes_7;
        $dataimunisasianak->polio_tetes_8 = $request->polio_tetes_8;
        $dataimunisasianak->polio_tetes_9 = $request->polio_tetes_9;
        $dataimunisasianak->polio_tetes_10 = $request->polio_tetes_10;
        $dataimunisasianak->polio_tetes_11 = $request->polio_tetes_11;
        $dataimunisasianak->polio_tetes_12 = $request->polio_tetes_12;
        $dataimunisasianak->dan_lain_lain_0 = $request->dan_lain_lain_0;
        $dataimunisasianak->dan_lain_lain_1 = $request->dan_lain_lain_1;
        $dataimunisasianak->dan_lain_lain_2 = $request->dan_lain_lain_2;
        $dataimunisasianak->dan_lain_lain_3 = $request->dan_lain_lain_3;
        $dataimunisasianak->dan_lain_lain_4 = $request->dan_lain_lain_4;
        $dataimunisasianak->dan_lain_lain_5 = $request->dan_lain_lain_5;
        $dataimunisasianak->dan_lain_lain_6 = $request->dan_lain_lain_6;
        $dataimunisasianak->dan_lain_lain_7 = $request->dan_lain_lain_7;
        $dataimunisasianak->dan_lain_lain_8 = $request->dan_lain_lain_8;
        $dataimunisasianak->dan_lain_lain_9 = $request->dan_lain_lain_9;
        $dataimunisasianak->dan_lain_lain_10 = $request->dan_lain_lain_10;
        $dataimunisasianak->dan_lain_lain_11 = $request->dan_lain_lain_11;
        $dataimunisasianak->dan_lain_lain_12 = $request->dan_lain_lain_12;
       
        $dataimunisasianak->save();
        
        return response()->json([
            'status' => 'berhasil'
    ]);
    }
    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Dataimunisasianak $dataimunisasianak1, $id)
    {
        $data1 = $dataimunisasianak1->find($id);

        return response()->json([
            'detailkesehatanimunisasianak' => $data1
         ]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Request $request)
    {
        $data2  = Dataimunisasianak::where('nik_ibu', $request->nik_ibu)->get();
        
        return response()->json([
                            'imunisasianak2' => $data2
                        ]                   
          );
    }
    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Dataimunisasianak $dataimunisasianak3, $id)
    {
        $data= $dataimunisasianak3->find($id);
       $data->nik_ibu = $request->nik_ibu;
       $data->nama_ibu= $request->nama_ibu;
       $data->nama_anak= $request->nama_anak;
       $data->anak_ke= $request->anak_ke;
       $data->hepatitis_0 = $request->hepatitis_0;
       $data->hepatitis_1 = $request->hepatitis_1;
       $data->hepatitis_2 = $request->hepatitis_2;
       $data->hepatitis_3 = $request->hepatitis_3;
       $data->hepatitis_4 = $request->hepatitis_4;
       $data->hepatitis_5 = $request->hepatitis_5;
       $data->hepatitis_6 = $request->hepatitis_6;
       $data->hepatitis_7 = $request->hepatitis_7;
       $data->hepatitis_8 = $request->hepatitis_8;
       $data->hepatitis_9 = $request->hepatitis_9;
       $data->hepatitis_10 = $request->hepatitis_10;
       $data->hepatitis_11 = $request->hepatitis_11;
       $data->hepatitis_12 = $request->hepatitis_12;
       $data->bcg_0 = $request->bcg_0;
       $data->bcg_1 = $request->bcg_1;
       $data->bcg_2 = $request->bcg_2;
       $data->bcg_3 = $request->bcg_3;
       $data->bcg_4 = $request->bcg_4;
       $data->bcg_5 = $request->bcg_5;
       $data->bcg_6 = $request->bcg_6; 
       $data->bcg_7 = $request->bcg_7;
       $data->bcg_8 = $request->bcg_8;
       $data->bcg_9 = $request->bcg_9;
       $data->bcg_10 = $request->bcg_10;
       $data->bcg_11 = $request->bcg_11;
       $data->bcg_12 = $request->bcg_12;
       $data->polio_tetes_0 = $request->polio_tetes_0;
       $data->polio_tetes_1 = $request->polio_tetes_1;
       $data->polio_tetes_2 = $request->polio_tetes_2;
       $data->polio_tetes_3 = $request->polio_tetes_3;
       $data->polio_tetes_4 = $request->polio_tetes_4;
       $data->polio_tetes_5 = $request->polio_tetes_5;
       $data->polio_tetes_6 = $request->polio_tetes_6;
       $data->polio_tetes_7 = $request->polio_tetes_7;
       $data->polio_tetes_8 = $request->polio_tetes_8;
       $data->polio_tetes_9 = $request->polio_tetes_9;
       $data->polio_tetes_10 = $request->polio_tetes_10;
       $data->polio_tetes_11 = $request->polio_tetes_11;
       $data->polio_tetes_12 = $request->polio_tetes_12;
       $data->dan_lain_lain_0 = $request->dan_lain_lain_0;
       $data->dan_lain_lain_1 = $request->dan_lain_lain_1;
       $data->dan_lain_lain_2 = $request->dan_lain_lain_2;
       $data->dan_lain_lain_3 = $request->dan_lain_lain_3;
       $data->dan_lain_lain_4 = $request->dan_lain_lain_4;
       $data->dan_lain_lain_5 = $request->dan_lain_lain_5;
       $data->dan_lain_lain_6 = $request->dan_lain_lain_6;
       $data->dan_lain_lain_7 = $request->dan_lain_lain_7;
       $data->dan_lain_lain_8 = $request->dan_lain_lain_8;
       $data->dan_lain_lain_9 = $request->dan_lain_lain_9;
       $data->dan_lain_lain_10 = $request->dan_lain_lain_10;
       $data->dan_lain_lain_11 = $request->dan_lain_lain_11;
       $data->dan_lain_lain_12 = $request->dan_lain_lain_12;
       $data->save();
        
       
       return response()->json([
        'status' => 'berhasil'
]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Dataimunisasianak $dataimunisasianak4, $id)
    {
        $data = $dataimunisasianak4->find($id);
        $data->delete();
        return redirect('imunisasianak')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahdataimunisasianak(HttpRequest $request){
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
   return view('form.tambahdataimunisasianak')->with([
        'dataorangtua1' => $dataOrangtua,
        'dataorangtua2' => $dataorangtu,
        'dataanak' => $dataanak,
        'dataanak1' => $dataanak1,
        'title' => 'Tambah Data Imunisasi Anak',
    
    ]);
    }
}
