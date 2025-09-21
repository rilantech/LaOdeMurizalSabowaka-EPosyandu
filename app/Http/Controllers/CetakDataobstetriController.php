<?php

namespace App\Http\Controllers;

use App\Http\Requests\TambahDataObstetriRequest;
use App\Models\Dataobstetri;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Support\Facades\Http;
use PHPUnit\Framework\Constraint\Count;

class CetakDataobstetriController extends Controller
{
  
    /**
     * Display a listing of the resource.
     */
    // public function index(HttpRequest $request)
    //     {
    //         $search = $request->query('search');
    //         $dataobstetri = array();
    //         $dataku = "";
    //         $nikibu3 = array();
    //         $data2= array();
          
          
          
    //         $nikibu3="";
    //         if(!empty($search)){
    //             $dataorangtuadanAnak = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
    //            ->orwhere('tabel_data_orangtua.nama_ibu','like','%'.$search.'%')
    //            ->paginate(10)->onEachSide(2)->fragment('srv');
    //         }else{
    //             // $dataorangtuadanAnak = Dataorangtua::latest()->paginate(10)->onEachSide(2)->fragment('srv');
    //              $dataobstetri = Dataobstetri::all();
                 
    //              foreach($dataobstetri as $data){
    //                 $dataobstetri2[] = (array) $data['nik_ibu'];
    //              }
    //                 for($a=0; $a < count($dataobstetri); $a++){
    //                     $data2  = Dataorangtua::where('tabel_data_orangtua.nik', $dataobstetri2[$a])->get();
    //                 }

                   
                  
      
                
    //         }
    //         return view('tabel.halamandataobstetri',[
    //             'title' => 'Data Obstetri',
    //             'data' => $data2,
    //             'search' => $search
    //           ]
    //           );
    //     }

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
        return view('tabel.halamandataobstetri',[
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
    public function store(TambahDataObstetriRequest $request)
    {
        $validate = $request->validated();
   
        $nik = $request->nik_ibu;
    for( $i=0; $i < count($nik); $i++ )
{
        $dataobstetri =new Dataobstetri;
        $dataobstetri->nik_ibu = $request->nik_ibu[$i];
        $dataobstetri->kehamilan_ke = $request->kehamilan_ke[$i];
        $dataobstetri->tahun= $request->tahun[$i];
        $dataobstetri->lahir_hidup = $request->status_lahir_hidup[$i];
        $dataobstetri->lahir_aterm = $request->status_lahir_aterm[$i];
        $dataobstetri->lahir_spontan = $request->status_lahir_spontan[$i];
        $dataobstetri->berat_lahir_atau_panjang_lahir = $request->berat_lahir[$i];
        $dataobstetri->tempat_bersalin_dan_tenakes = $request->tempat_bersalin[$i];
        $dataobstetri->kondisi_anak_saat_ini = $request->kondisi_anak[$i];
        $dataobstetri->komplikasi_kehamilan_atau_persalinan = $request->komplikasi_kehamilan[$i];
       
        $dataobstetri->save();
      }
        return redirect('dataobstetri')->with('msg','Data Berhasil Di Tambahkan');
    }


    /**
     * Display the specified resource.
     */
    public function show(Dataorangtua $dataorangtua1, $id)
    {
        $data1 = $dataorangtua1->find($id);
        $data2  = Dataobstetri::where('nik_ibu', $data1->nik)->get();
        $dataOrangtua = Dataorangtua::all();
       
        return view('tabel.cetakdataobstetri')->with([
            'id' => $id,
            'nik' => $data1->nik,
            'nama_ibu' => $data1->nama_ibu,
            'tempat_atau_tanggal_lahir' => $data1->tempat_atau_tanggal_lahir_ibu,
            'data2' => $data2,
            'dataorangtua' => $dataOrangtua,
            'title' => 'Cetak Data Obstetri',
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
    public function update(Request $request, Dataobstetri $dataobstetri2, $id)
    {
        
        $nik2 = $request->nik_ibu;
        $nik3 = $request->nik_ibu2;
        // $data2->nik_ibu = $nik;
    
    if($nik2 != null){
    for( $i=0; $i < count($nik2); $i++ )
      {     
      $data2  = $dataobstetri2->find($request->id[$i]); 
       $data2->id = $request->id[$i];
       $data2->kehamilan_ke = $request->kehamilan_ke[$i];
       $data2->tahun= $request->tahun[$i];
       $data2->lahir_hidup = $request->status_lahir_hidup[$i];
       $data2->lahir_aterm = $request->status_lahir_aterm[$i];
       $data2->lahir_spontan = $request->status_lahir_spontan[$i];
       $data2->berat_lahir_atau_panjang_lahir = $request->berat_lahir[$i];
       $data2->tempat_bersalin_dan_tenakes = $request->tempat_bersalin[$i];
       $data2->kondisi_anak_saat_ini = $request->kondisi_anak[$i];
       $data2->komplikasi_kehamilan_atau_persalinan = $request->komplikasi_kehamilan[$i];
       $data2->save();
      }
    }
    if($nik3 != null){
      for($j=0; $j < count($nik3); $j++ )
      {
       $dataobstetri3 =new Dataobstetri;
       $dataobstetri3->nik_ibu = $request->nik_ibu2[$j];
       $dataobstetri3->kehamilan_ke = $request->kehamilan_ke2[$j];
       $dataobstetri3->tahun= $request->tahun2[$j];
       $dataobstetri3->lahir_hidup = $request->status_lahir_hidup2[$j];
       $dataobstetri3->lahir_aterm = $request->status_lahir_aterm2[$j];
       $dataobstetri3->lahir_spontan = $request->status_lahir_spontan2[$j];
       $dataobstetri3->berat_lahir_atau_panjang_lahir = $request->berat_lahir2[$j];
       $dataobstetri3->tempat_bersalin_dan_tenakes = $request->tempat_bersalin2[$j];
       $dataobstetri3->kondisi_anak_saat_ini = $request->kondisi_anak2[$j];
       $dataobstetri3->komplikasi_kehamilan_atau_persalinan = $request->komplikasi_kehamilan2[$j];
       $dataobstetri3->save();

       
      }}
     
        return redirect('dataobstetri/'.$id)->with('msg','Data Berhasil Di Update');
    }


    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }

    public function tambahdataobstetri(HttpRequest $request){
        $nik = $request->query('nik');
        $dataOrangtua = Dataorangtua::all();
        $dataorangtu = array();
        $nikibu3="";
        if(!empty($nik)){
            $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();
            foreach ($dataorangtu as $data) {
                $nikibu3 = $data['nik'];
               }
       }

      
        return view('form.tambahdataobstetri')->with([
        'dataorangtua' => $dataOrangtua,
        'dataorangtua1' => $dataorangtu,
        'nikibu' => $nikibu3,
        'title' => 'Tambah Data Obstetri',
 
        
    ]);
}


}
