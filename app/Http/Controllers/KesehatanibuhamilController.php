<?php

namespace App\Http\Controllers;

use App\Http\Requests\TambahKesehatanIbuHamilRequest;
use App\Models\Catatankesehatanibuhamil;
use App\Models\Datakesehatanibuhamil;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Http;


class KesehatanibuhamilController extends Controller
{
  
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');
        $status_kehamilan = $request->query('status_kehamilan');
         $dataorangtuadanAnak1="";
        if(!empty($search)){
            $dataorangtuadanAnak = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
           ->orwhere('tabel_data_orangtua.nama_ibu','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
          
        }else{
            
           
           if(!empty($status_kehamilan)){
             $dataorangtuadanAnak1 = Datakesehatanibuhamil::where('status_kehamilan', $status_kehamilan)->get();
             
             foreach($dataorangtuadanAnak1 as $data){
                $nik_ibu[] = $data['nik_ibu'];
                $kehamilan_ke[] = $data['kehamilan_ke'];
                $dataorangtuadanAnak = Dataorangtua::whereIn('nik', $nik_ibu)->paginate(10)->onEachSide(2)->fragment('srv');
             }
           }else{
                $dataorangtuadanAnak = Dataorangtua::latest()->paginate(10)->onEachSide(2)->fragment('srv');
           }
             
           
        }
        return view('tabel.halamankesehatanibuhamil',[
            'title' => 'Kesehatan Ibu Hamil',
            'dataorangtuadananak' => $dataorangtuadanAnak,
             'dataorangtuadanAnak1' => $dataorangtuadanAnak1,
            'search' => $search,
            'status_kehamilan' => $status_kehamilan
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
    public function store(TambahKesehatanIbuHamilRequest $request)
    {
       
      $validate = $request->validated();

      $nik4 = $request->nik_ibuku;

      if($nik4 != null){
        for( $k=0; $k < count($nik4); $k++ )
        {

        $catatankesehatanibuhamil =new Catatankesehatanibuhamil;
        $catatankesehatanibuhamil->nik_ibu = $request->nik_ibuku[$k];
        $catatankesehatanibuhamil->kehamilan_ke= $request->kehamilan_ke;
        $catatankesehatanibuhamil->nama_pemeriksa_dan_tempat_pelayanan = $request->nama_pemeriksa[$k];
        $catatankesehatanibuhamil->tanggal= $request->tanggal[$k];
        $catatankesehatanibuhamil->keluhan = $request->keluhan[$k];
        $catatankesehatanibuhamil->uk = $request->uk[$k];
        $catatankesehatanibuhamil->bb = $request->bb[$k];
        $catatankesehatanibuhamil->td = $request->td[$k];
        $catatankesehatanibuhamil->lila = $request->lila[$k];
        $catatankesehatanibuhamil->tinggi_fundus = $request->tinggi_fundus[$k];
        $catatankesehatanibuhamil->letak_janin = $request->letak_janin[$k];
        $catatankesehatanibuhamil->imunisasi = $request->imunisasi[$k];
        $catatankesehatanibuhamil->tablet_tambah_darah = $request->tablet_tambah_darah[$k];
        $catatankesehatanibuhamil->lab = $request->lab[$k];
        $catatankesehatanibuhamil->analisa = $request->analisa[$k];
        $catatankesehatanibuhamil->tata_laksana = $request->tata_laksana[$k];
        $catatankesehatanibuhamil->konseling = $request->konseling[$k];
        $catatankesehatanibuhamil->catatan_tambahan = $request->catatan_tambahan[$k];
   

        $catatankesehatanibuhamil->save();
        
    }
}
$datakesehatanibuhamil =new Datakesehatanibuhamil;
$datakesehatanibuhamil->nik_ibu = $request->nikibu1;
$datakesehatanibuhamil->kehamilan_ke = $request->kehamilan_ke;
$datakesehatanibuhamil->hari_pertama_haid_terakhir= $request->hari_pertama_haid_terakhir;
$datakesehatanibuhamil->hari_taksiran_persalinan = $request->hari_taksiran_persalinan;
$datakesehatanibuhamil->golongan_darah = $request->golongan_darah;
$datakesehatanibuhamil->penggunaan_kontrasepsi_sebelum_hamil = $request->penggunaan_kontrasepsi_sebelum_hamil;
$datakesehatanibuhamil->riwayat_penyakit_yg_di_derita_ibu = $request->riwayat_penyakit_yg_di_derita_ibu;
$datakesehatanibuhamil->riwayat_alergi = $request->riwayat_alergi;
$datakesehatanibuhamil->status_imunisasi_tetanus_terakhir = $request->status_imunisasi_tetanus_terakhir;
$datakesehatanibuhamil->tinggi_badan = $request->tinggi_badan;
$datakesehatanibuhamil->status_kehamilan = "Sedang Berlangsung";

$datakesehatanibuhamil->save();
        
        return redirect('kesehatanibuhamil')->with('msg','Data Berhasil Di Tambahkan');
    }


    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Dataorangtua $dataorangtua1, $id)
    {
        $kehamilan_keberapa = $request->query('kehamilan_keberapa');
        $status_kehamilan = $request->query('status_kehamilan');
        $data1 = $dataorangtua1->find($id);
        $data2  = Datakesehatanibuhamil::where('nik_ibu', $data1->nik)->get();
        
        if(!empty($status_kehamilan)){
            $data2  = DB::table('tabel_kesehatan_ibu_hamil') 
                    ->where('nik_ibu', $data1->nik)
                    ->where('status_kehamilan', $status_kehamilan)
                    ->get();
        }
      
        $data4 = array();
        if(!empty($kehamilan_keberapa)){
        $data4  = DB::table('tabel_kesehatan_ibu_hamil') 
        ->where('nik_ibu', $data1->nik)
        ->where('kehamilan_ke', $kehamilan_keberapa)
        ->get();
       
       
        if(!empty($status_kehamilan)){
        $data4  = DB::table('tabel_kesehatan_ibu_hamil') 
        ->where('nik_ibu', $data1->nik)
        ->where('kehamilan_ke', $kehamilan_keberapa)
        ->where('status_kehamilan', $status_kehamilan)
        ->get();
      
       }
       }
       
       

        $dataOrangtua = Dataorangtua::all();

     

           $data3  = DB::table('tabel_catatan_kesehatan_ibu_hamil') 
                    ->where('nik_ibu', $data1->nik)
                    ->where('kehamilan_ke', $kehamilan_keberapa)
                    ->get();
           
      

        return view('form.detailkesehatanibuhamil')->with([
            'id' => $id,
            'nik' => $data1->nik,
            'nama_ibu' => $data1->nama_ibu,
            'tempat_lahir_ibu' => $data1->tempat_lahir_ibu,
             'tanggal_lahir_ibu' => $data1->tanggal_lahir_ibu,
            'data4' => $data4,
            'data2' => $data2,
            'data3' => $data3,
            'dataorangtua' => $dataOrangtua,
            'kehamilan_ke' => $kehamilan_keberapa,
            'status_kehamilan' => $status_kehamilan,
            'title' => 'Detail Data Kesehatan Ibu Hamil',
            
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
    public function update(Request $request, Datakesehatanibuhamil $datakesehatanibuhamil2, Catatankesehatanibuhamil $catatankesehatanibuhamil2, $id2)
    {
        
        $nik2 = $request->nik_ibu;

        $nik3 = $request->nik_ibuku;

        $nik4 = $request->nik_ibuku2;

       if($nik2 != null){
      for($i = 0; $i < count($nik2); $i++){
    
       $data2  = $datakesehatanibuhamil2->find($request->id[$i]); 
       $data2->hari_pertama_haid_terakhir= $request->hari_pertama_haid_terakhir[$i];
       $data2->hari_taksiran_persalinan = $request->hari_taksiran_persalinan[$i];
       $data2->golongan_darah = $request->golongan_darah[$i];
       $data2->penggunaan_kontrasepsi_sebelum_hamil = $request->penggunaan_kontrasepsi_sebelum_hamil[$i];
       $data2->riwayat_penyakit_yg_di_derita_ibu = $request->riwayat_penyakit_yg_di_derita_ibu[$i];
       $data2->riwayat_alergi = $request->riwayat_alergi[$i];
       $data2->status_imunisasi_tetanus_terakhir = $request->status_imunisasi_tetanus_terakhir[$i];
       $data2->tinggi_badan = $request->tinggi_badan[$i];
       $data2->status_kehamilan = $request->status_kehamilan[$i];
       $data2->save();

       if($nik3 != null){
        for($k = 0; $k < count($nik3); $k++){

         $data3  = $catatankesehatanibuhamil2->find($request->id1[$k]); 
         $data3->nama_pemeriksa_dan_tempat_pelayanan = $request->nama_pemeriksa[$k];
         $data3->tanggal= $request->tanggal[$k];
         $data3->keluhan = $request->keluhan[$k];
         $data3->uk = $request->uk[$k];
         $data3->bb = $request->bb[$k];
         $data3->td = $request->td[$k];
         $data3->lila = $request->lila[$k];
         $data3->tinggi_fundus = $request->tinggi_fundus[$k];
         $data3->letak_janin = $request->letak_janin[$k];
         $data3->imunisasi = $request->imunisasi[$k];
         $data3->tablet_tambah_darah = $request->tablet_tambah_darah[$k];
         $data3->lab = $request->lab[$k];
         $data3->analisa = $request->analisa[$k];
         $data3->tata_laksana = $request->tata_laksana[$k];
         $data3->konseling = $request->konseling[$k];
         $data3->catatan_tambahan = $request->catatan_tambahan[$k];
         $data3->save();
        }}

       

        if($nik4 != null){
          for( $k=0; $k < count($nik4); $k++ )
          {
          $catatankesehatanibuhamil =new Catatankesehatanibuhamil;
          $catatankesehatanibuhamil->nik_ibu = $request->nik_ibuku2[$k];
          $catatankesehatanibuhamil->kehamilan_ke= $request->kehamilan_ke2[$k];
          $catatankesehatanibuhamil->nama_pemeriksa_dan_tempat_pelayanan = $request->nama_pemeriksa2[$k];
          $catatankesehatanibuhamil->tanggal= $request->tanggal2[$k];
          $catatankesehatanibuhamil->keluhan = $request->keluhan2[$k];
          $catatankesehatanibuhamil->uk = $request->uk2[$k];
          $catatankesehatanibuhamil->bb = $request->bb2[$k];
          $catatankesehatanibuhamil->td = $request->td2[$k];
          $catatankesehatanibuhamil->lila = $request->lila2[$k];
          $catatankesehatanibuhamil->tinggi_fundus = $request->tinggi_fundus2[$k];
          $catatankesehatanibuhamil->letak_janin = $request->letak_janin2[$k];
          $catatankesehatanibuhamil->imunisasi = $request->imunisasi2[$k];
          $catatankesehatanibuhamil->tablet_tambah_darah = $request->tablet_tambah_darah2[$k];
          $catatankesehatanibuhamil->lab = $request->lab2[$k];
          $catatankesehatanibuhamil->analisa = $request->analisa2[$k];
          $catatankesehatanibuhamil->tata_laksana = $request->tata_laksana2[$k];
          $catatankesehatanibuhamil->konseling = $request->konseling2[$k];
          $catatankesehatanibuhamil->catatan_tambahan = $request->catatan_tambahan2[$k];
          $catatankesehatanibuhamil->save();
          }}

       return redirect('kesehatanibuhamil/'.$id2.'?status_kehamilan='.$request->query('status_kehamilan').'&kehamilan_keberapa='.$request->kehamilan_ke[$i])->with('msg','Data Berhasil Di Update');
        }
    }

       
      
       
        // $nik3 = $request->nik_ibu2;
        // $data2->nik_ibu = $nik;
    
    // if($nik2 != null){
    // for( $i=0; $i < count($nik2); $i++ )
    //   {     
    //    $data2  = $dataobstetri2->find($request->id[$i]); 
    //    $data2->id = $request->id[$i];
    //    $data2->kehamilan_ke = $request->kehamilan_ke[$i];
    //    $data2->tahun= $request->tahun[$i];
    //    $data2->lahir_hidup = $request->status_lahir_hidup[$i];
    //    $data2->lahir_aterm = $request->status_lahir_aterm[$i];
    //    $data2->lahir_spontan = $request->status_lahir_spontan[$i];
    //    $data2->berat_lahir_atau_panjang_lahir = $request->berat_lahir[$i];
    //    $data2->tempat_bersalin_dan_tenakes = $request->tempat_bersalin[$i];
    //    $data2->kondisi_anak_saat_ini = $request->kondisi_anak[$i];
    //    $data2->komplikasi_kehamilan_atau_persalinan = $request->komplikasi_kehamilan[$i];
    //    $data2->save();
    //   }
    
    // if($nik3 != null){
    //   for($j=0; $j < count($nik3); $j++ )
    //   {
    //    $dataobstetri3 =new Dataobstetri;
    //    $dataobstetri3->nik_ibu = $request->nik_ibu2[$j];
    //    $dataobstetri3->kehamilan_ke = $request->kehamilan_ke2[$j];
    //    $dataobstetri3->tahun= $request->tahun2[$j];
    //    $dataobstetri3->lahir_hidup = $request->status_lahir_hidup2[$j];
    //    $dataobstetri3->lahir_aterm = $request->status_lahir_aterm2[$j];
    //    $dataobstetri3->lahir_spontan = $request->status_lahir_spontan2[$j];
    //    $dataobstetri3->berat_lahir_atau_panjang_lahir = $request->berat_lahir2[$j];
    //    $dataobstetri3->tempat_bersalin_dan_tenakes = $request->tempat_bersalin2[$j];
    //    $dataobstetri3->kondisi_anak_saat_ini = $request->kondisi_anak2[$j];
    //    $dataobstetri3->komplikasi_kehamilan_atau_persalinan = $request->komplikasi_kehamilan2[$j];
    //    $dataobstetri3->save();

       
     
        
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Request $request, Datakesehatanibuhamil $datakesehatanibuhamil2, Catatankesehatanibuhamil $catatankesehatanibuhamil2, $id)
    {
      
             $nik3 = $request->nik_ibuku4;

             if($nik3 != null){
                for($k = 0; $k < count($nik3); $k++){
             return redirect('kesehatanibuhamil/'.$request->id4.'?kehamilan_keberapa='.$request->kehamilan_ke4[$k])->with('msg','Data Berhasil Di Update');
               }
            }

            $data3  = $catatankesehatanibuhamil2->find($id);      
            $data3->delete();
    
    }
       

public function tambahkesehatanibuhamil(HttpRequest $request){
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

  
    return view('form.tambahkesehatanibuhamil')->with([
    'dataorangtua' => $dataOrangtua,
    'dataorangtua1' => $dataorangtu,
    'nikibuku' => $nikibu3,
    'nikibuku2' => $nikibu3,
    'title' => 'Tambah Kesehatan Ibu Hamil',

    
]);
}


}
