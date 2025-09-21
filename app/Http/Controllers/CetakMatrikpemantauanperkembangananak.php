<?php

namespace App\Http\Controllers;

use App\Models\Dataanak;
use App\Models\Dataimunisasianak;
use App\Models\Dataorangtua;
use App\Models\Matrikspemantauanperkembangananak;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class CetakMatrikpemantauanperkembangananak extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');

        if(!empty($search)){
            $datamatriksperkembangananak = Matrikspemantauanperkembangananak::where('tabel_matriks_pemantauan_perkembangan_anak.id','like','%'.$search.'%')
           ->orwhere('tabel_matriks_pemantauan_perkembangan_anak.nama_anak','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            $datamatriksperkembangananak = Matrikspemantauanperkembangananak::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamanmatrikspemantauanperkembangananak',[
            'title' => 'Matriks Perkembangan Anak',
            'datamatriksperkembangananak' => $datamatriksperkembangananak,
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
       
        $datamatriksperkembangananak1=new Matrikspemantauanperkembangananak;
        $datamatriksperkembangananak1->nik_ibu = $request->nik_ibu;
        $datamatriksperkembangananak1->nama_ibu= $request->nama_ibu;
        $datamatriksperkembangananak1->nama_anak= $request->nama_anak;
        $datamatriksperkembangananak1->anak_ke= $request->anak_ke;
       
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_1 = $request->tanggal_pemantauan_perkembangan_1;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_3 = $request->tanggal_pemantauan_perkembangan_3;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_6 = $request->tanggal_pemantauan_perkembangan_6;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_9 = $request->tanggal_pemantauan_perkembangan_9;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_12 = $request->tanggal_pemantauan_perkembangan_12;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_15 = $request->tanggal_pemantauan_perkembangan_15;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_18 = $request->tanggal_pemantauan_perkembangan_18;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_21 = $request->tanggal_pemantauan_perkembangan_21; 
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_24 = $request->tanggal_pemantauan_perkembangan_24;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_30 = $request->tanggal_pemantauan_perkembangan_30;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_36 = $request->tanggal_pemantauan_perkembangan_36;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_42 = $request->tanggal_pemantauan_perkembangan_42;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_48 = $request->tanggal_pemantauan_perkembangan_48;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_54 = $request->tanggal_pemantauan_perkembangan_54;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_60 = $request->tanggal_pemantauan_perkembangan_60; 
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_66 = $request->tanggal_pemantauan_perkembangan_66;
         $datamatriksperkembangananak1->tanggal_pemantauan_perkembangan_72 = $request->tanggal_pemantauan_perkembangan_72;
   
        $datamatriksperkembangananak1->hasil_1= $request->hasil_1;
        $datamatriksperkembangananak1->hasil_3= $request->hasil_3;
        $datamatriksperkembangananak1->hasil_6= $request->hasil_6; 
        $datamatriksperkembangananak1->hasil_9= $request->hasil_9;
        $datamatriksperkembangananak1->hasil_12= $request->hasil_12;
        $datamatriksperkembangananak1->hasil_15= $request->hasil_15;
        $datamatriksperkembangananak1->hasil_18= $request->hasil_18; 
        $datamatriksperkembangananak1->hasil_21= $request->hasil_21; 
        $datamatriksperkembangananak1->hasil_24= $request->hasil_24; 
        $datamatriksperkembangananak1->hasil_30= $request->hasil_30; 
        $datamatriksperkembangananak1->hasil_36= $request->hasil_36; 
        $datamatriksperkembangananak1->hasil_42= $request->hasil_42;
        $datamatriksperkembangananak1->hasil_48= $request->hasil_48; 
        $datamatriksperkembangananak1->hasil_54= $request->hasil_54; 
        $datamatriksperkembangananak1->hasil_60= $request->hasil_60; 
        $datamatriksperkembangananak1->hasil_66= $request->hasil_66;
        $datamatriksperkembangananak1->hasil_72= $request->hasil_72;
   
    
         $datamatriksperkembangananak1->tindakan_1= $request->tindakan_1;
         $datamatriksperkembangananak1->tindakan_3= $request->tindakan_3;
         $datamatriksperkembangananak1->tindakan_6= $request->tindakan_6;
         $datamatriksperkembangananak1->tindakan_9= $request->tindakan_9;
         $datamatriksperkembangananak1->tindakan_12= $request->tindakan_12; 
         $datamatriksperkembangananak1->tindakan_15= $request->tindakan_15; 
         $datamatriksperkembangananak1->tindakan_18= $request->tindakan_18; 
         $datamatriksperkembangananak1->tindakan_21= $request->tindakan_21; 
         $datamatriksperkembangananak1->tindakan_24= $request->tindakan_24;
         $datamatriksperkembangananak1->tindakan_30= $request->tindakan_30;
         $datamatriksperkembangananak1->tindakan_36= $request->tindakan_36;
         $datamatriksperkembangananak1->tindakan_42= $request->tindakan_42;
         $datamatriksperkembangananak1->tindakan_48= $request->tindakan_48; 
         $datamatriksperkembangananak1->tindakan_54= $request->tindakan_54; 
         $datamatriksperkembangananak1->tindakan_60= $request->tindakan_60; 
         $datamatriksperkembangananak1->tindakan_66= $request->tindakan_66;
         $datamatriksperkembangananak1->tindakan_72= $request->tindakan_72;
   
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_1 = $request->tanggal_pemantauan_selanjutnya_1;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_3 = $request->tanggal_pemantauan_selanjutnya_3;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_6 = $request->tanggal_pemantauan_selanjutnya_6;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_9 = $request->tanggal_pemantauan_selanjutnya_9;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_12 = $request->tanggal_pemantauan_selanjutnya_12;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_15 = $request->tanggal_pemantauan_selanjutnya_15;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_18 = $request->tanggal_pemantauan_selanjutnya_18;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_21 = $request->tanggal_pemantauan_selanjutnya_21; 
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_24 = $request->tanggal_pemantauan_selanjutnya_24;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_30 = $request->tanggal_pemantauan_selanjutnya_30;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_36 = $request->tanggal_pemantauan_selanjutnya_36;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_42 = $request->tanggal_pemantauan_selanjutnya_42;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_48 = $request->tanggal_pemantauan_selanjutnya_48;
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_54 = $request->tanggal_pemantauan_selanjutnya_54; 
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_60 = $request->tanggal_pemantauan_selanjutnya_60; 
         $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_66 = $request->tanggal_pemantauan_selanjutnya_66;
        $datamatriksperkembangananak1->tanggal_pemantauan_selanjutnya_72 = $request->tanggal_pemantauan_selanjutnya_72;
   
   
                  
        $datamatriksperkembangananak1->save();
        
        return redirect('matriksperkembangananak')->with('msg','Data Berhasil Di Tambahkan');
    }


    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, Matrikspemantauanperkembangananak $datamatriksperkembangananak1, $id)
    {
        $nik = $request->query('nik');
        $dataOrangtua = Dataorangtua::all();
        $dataorangtu = array();
        if(!empty($nik)){
            $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();  
       }

        $data1 = $datamatriksperkembangananak1->find($id);
             
        return view('tabel.cetakmatrikspantauperkembangananak')->with([
            'dataorangtua1' => $dataOrangtua,
            'dataorangtua2' => $dataorangtu,
            'id' => $id,
            'nik_ibu' => $data1->nik_ibu,
            'nama_ibu' => $data1->nama_ibu,
            'nama_anak' => $data1->nama_anak,
            'anak_ke' => $data1->anak_ke,

       'tanggal_pemantauan_perkembangan_1'=>$data1->tanggal_pemantauan_perkembangan_1,
       'tanggal_pemantauan_perkembangan_3'=>$data1->tanggal_pemantauan_perkembangan_3,
       'tanggal_pemantauan_perkembangan_6'=>$data1->tanggal_pemantauan_perkembangan_6,
       'tanggal_pemantauan_perkembangan_9'=>$data1->tanggal_pemantauan_perkembangan_9,
       'tanggal_pemantauan_perkembangan_12'=>$data1->tanggal_pemantauan_perkembangan_12,
       'tanggal_pemantauan_perkembangan_15'=>$data1->tanggal_pemantauan_perkembangan_15,
       'tanggal_pemantauan_perkembangan_18'=>$data1->tanggal_pemantauan_perkembangan_18,
       'tanggal_pemantauan_perkembangan_21'=>$data1->tanggal_pemantauan_perkembangan_21, 
       'tanggal_pemantauan_perkembangan_24'=>$data1->tanggal_pemantauan_perkembangan_24,
       'tanggal_pemantauan_perkembangan_30'=>$data1->tanggal_pemantauan_perkembangan_30,
       'tanggal_pemantauan_perkembangan_36'=>$data1->tanggal_pemantauan_perkembangan_36,
       'tanggal_pemantauan_perkembangan_42'=>$data1->tanggal_pemantauan_perkembangan_42,
       'tanggal_pemantauan_perkembangan_48'=>$data1->tanggal_pemantauan_perkembangan_48,
       'tanggal_pemantauan_perkembangan_54'=>$data1->tanggal_pemantauan_perkembangan_54,
       'tanggal_pemantauan_perkembangan_60'=>$data1->tanggal_pemantauan_perkembangan_60, 
       'tanggal_pemantauan_perkembangan_66'=>$data1->tanggal_pemantauan_perkembangan_66,
       'tanggal_pemantauan_perkembangan_72'=>$data1->tanggal_pemantauan_perkembangan_72,
   
      'hasil_1' => $data1->hasil_1,
      'hasil_3' => $data1->hasil_3,
      'hasil_6' => $data1->hasil_6, 
      'hasil_9' => $data1->hasil_9,
      'hasil_12' => $data1->hasil_12,
      'hasil_15' => $data1->hasil_15,
      'hasil_18' => $data1->hasil_18, 
      'hasil_21' => $data1->hasil_21, 
      'hasil_24' => $data1->hasil_24, 
      'hasil_30' => $data1->hasil_30, 
      'hasil_36' => $data1->hasil_36, 
      'hasil_42' => $data1->hasil_42,
      'hasil_48' => $data1->hasil_48, 
      'hasil_54' => $data1->hasil_54, 
      'hasil_60' => $data1->hasil_60, 
      'hasil_66' => $data1->hasil_66,
      'hasil_72' => $data1->hasil_72,
   
    
       'tindakan_1' =>  $data1->tindakan_1,
       'tindakan_3' =>  $data1->tindakan_3,
       'tindakan_6' =>  $data1->tindakan_6,
       'tindakan_9' =>  $data1->tindakan_9,
       'tindakan_12' =>  $data1->tindakan_12, 
       'tindakan_15' =>  $data1->tindakan_15, 
       'tindakan_18' =>  $data1->tindakan_18, 
       'tindakan_21' =>  $data1->tindakan_21, 
       'tindakan_24' =>  $data1->tindakan_24,
       'tindakan_30' =>  $data1->tindakan_30,
       'tindakan_36' =>  $data1->tindakan_36,
       'tindakan_42' =>  $data1->tindakan_42,
       'tindakan_48' =>  $data1->tindakan_48, 
       'tindakan_54' =>  $data1->tindakan_54, 
       'tindakan_60' =>  $data1->tindakan_60, 
       'tindakan_66' =>  $data1->tindakan_66,
       'tindakan_72' =>  $data1->tindakan_72,
   
       'tanggal_pemantauan_selanjutnya_1' => $data1->tanggal_pemantauan_selanjutnya_1,
       'tanggal_pemantauan_selanjutnya_3' => $data1->tanggal_pemantauan_selanjutnya_3,
       'tanggal_pemantauan_selanjutnya_6' => $data1->tanggal_pemantauan_selanjutnya_6,
       'tanggal_pemantauan_selanjutnya_9' => $data1->tanggal_pemantauan_selanjutnya_9,
       'tanggal_pemantauan_selanjutnya_12' => $data1->tanggal_pemantauan_selanjutnya_12,
       'tanggal_pemantauan_selanjutnya_15' => $data1->tanggal_pemantauan_selanjutnya_15,
       'tanggal_pemantauan_selanjutnya_18' => $data1->tanggal_pemantauan_selanjutnya_18,
       'tanggal_pemantauan_selanjutnya_21' => $data1->tanggal_pemantauan_selanjutnya_21, 
       'tanggal_pemantauan_selanjutnya_24' => $data1->tanggal_pemantauan_selanjutnya_24,
       'tanggal_pemantauan_selanjutnya_30' => $data1->tanggal_pemantauan_selanjutnya_30,
       'tanggal_pemantauan_selanjutnya_36' => $data1->tanggal_pemantauan_selanjutnya_36,
       'tanggal_pemantauan_selanjutnya_42' => $data1->tanggal_pemantauan_selanjutnya_42,
       'tanggal_pemantauan_selanjutnya_48' => $data1->tanggal_pemantauan_selanjutnya_48,
       'tanggal_pemantauan_selanjutnya_54' => $data1->tanggal_pemantauan_selanjutnya_54, 
       'tanggal_pemantauan_selanjutnya_60' => $data1->tanggal_pemantauan_selanjutnya_60, 
       'tanggal_pemantauan_selanjutnya_66' => $data1->tanggal_pemantauan_selanjutnya_66,
      'tanggal_pemantauan_selanjutnya_72' => $data1->tanggal_pemantauan_selanjutnya_72,
   
            'title' => 'Cetak Data Matriks Pemantauan Perkembangan Anak',
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
    public function update(Request $request, Matrikspemantauanperkembangananak $datamatriksperkembangananak3, $id)
    {
        $data= $datamatriksperkembangananak3->find($id);
        $data->nik_ibu = $request->nik_ibu;
        $data->nama_ibu= $request->nama_ibu;
        $data->nama_anak= $request->nama_anak;
        $data->anak_ke= $request->anak_ke;
       
        $data->tanggal_pemantauan_perkembangan_1 = $request->tanggal_pemantauan_perkembangan_1;
        $data->tanggal_pemantauan_perkembangan_3 = $request->tanggal_pemantauan_perkembangan_3;
        $data->tanggal_pemantauan_perkembangan_6 = $request->tanggal_pemantauan_perkembangan_6;
        $data->tanggal_pemantauan_perkembangan_9 = $request->tanggal_pemantauan_perkembangan_9;
        $data->tanggal_pemantauan_perkembangan_12 = $request->tanggal_pemantauan_perkembangan_12;
        $data->tanggal_pemantauan_perkembangan_15 = $request->tanggal_pemantauan_perkembangan_15;
        $data->tanggal_pemantauan_perkembangan_18 = $request->tanggal_pemantauan_perkembangan_18;
        $data->tanggal_pemantauan_perkembangan_21 = $request->tanggal_pemantauan_perkembangan_21; 
        $data->tanggal_pemantauan_perkembangan_24 = $request->tanggal_pemantauan_perkembangan_24;
        $data->tanggal_pemantauan_perkembangan_30 = $request->tanggal_pemantauan_perkembangan_30;
        $data->tanggal_pemantauan_perkembangan_36 = $request->tanggal_pemantauan_perkembangan_36;
        $data->tanggal_pemantauan_perkembangan_42 = $request->tanggal_pemantauan_perkembangan_42;
        $data->tanggal_pemantauan_perkembangan_48 = $request->tanggal_pemantauan_perkembangan_48;
        $data->tanggal_pemantauan_perkembangan_54 = $request->tanggal_pemantauan_perkembangan_54;
        $data->tanggal_pemantauan_perkembangan_60 = $request->tanggal_pemantauan_perkembangan_60; 
        $data->tanggal_pemantauan_perkembangan_66 = $request->tanggal_pemantauan_perkembangan_66;
        $data->tanggal_pemantauan_perkembangan_72 = $request->tanggal_pemantauan_perkembangan_72;
  
       $data->hasil_1= $request->hasil_1;
       $data->hasil_3= $request->hasil_3;
       $data->hasil_6= $request->hasil_6; 
       $data->hasil_9= $request->hasil_9;
       $data->hasil_12= $request->hasil_12;
       $data->hasil_15= $request->hasil_15;
       $data->hasil_18= $request->hasil_18; 
       $data->hasil_21= $request->hasil_21; 
       $data->hasil_24= $request->hasil_24; 
       $data->hasil_30= $request->hasil_30; 
       $data->hasil_36= $request->hasil_36; 
       $data->hasil_42= $request->hasil_42;
       $data->hasil_48= $request->hasil_48; 
       $data->hasil_54= $request->hasil_54; 
       $data->hasil_60= $request->hasil_60; 
       $data->hasil_66= $request->hasil_66;
       $data->hasil_72= $request->hasil_72;
  
   
        $data->tindakan_1= $request->tindakan_1;
        $data->tindakan_3= $request->tindakan_3;
        $data->tindakan_6= $request->tindakan_6;
        $data->tindakan_9= $request->tindakan_9;
        $data->tindakan_12= $request->tindakan_12; 
        $data->tindakan_15= $request->tindakan_15; 
        $data->tindakan_18= $request->tindakan_18; 
        $data->tindakan_21= $request->tindakan_21; 
        $data->tindakan_24= $request->tindakan_24;
        $data->tindakan_30= $request->tindakan_30;
        $data->tindakan_36= $request->tindakan_36;
        $data->tindakan_42= $request->tindakan_42;
        $data->tindakan_48= $request->tindakan_48; 
        $data->tindakan_54= $request->tindakan_54; 
        $data->tindakan_60= $request->tindakan_60; 
        $data->tindakan_66= $request->tindakan_66;
        $data->tindakan_72= $request->tindakan_72;
  
        $data->tanggal_pemantauan_selanjutnya_1 = $request->tanggal_pemantauan_selanjutnya_1;
        $data->tanggal_pemantauan_selanjutnya_3 = $request->tanggal_pemantauan_selanjutnya_3;
        $data->tanggal_pemantauan_selanjutnya_6 = $request->tanggal_pemantauan_selanjutnya_6;
        $data->tanggal_pemantauan_selanjutnya_9 = $request->tanggal_pemantauan_selanjutnya_9;
        $data->tanggal_pemantauan_selanjutnya_12 = $request->tanggal_pemantauan_selanjutnya_12;
        $data->tanggal_pemantauan_selanjutnya_15 = $request->tanggal_pemantauan_selanjutnya_15;
        $data->tanggal_pemantauan_selanjutnya_18 = $request->tanggal_pemantauan_selanjutnya_18;
        $data->tanggal_pemantauan_selanjutnya_21 = $request->tanggal_pemantauan_selanjutnya_21; 
        $data->tanggal_pemantauan_selanjutnya_24 = $request->tanggal_pemantauan_selanjutnya_24;
        $data->tanggal_pemantauan_selanjutnya_30 = $request->tanggal_pemantauan_selanjutnya_30;
        $data->tanggal_pemantauan_selanjutnya_36 = $request->tanggal_pemantauan_selanjutnya_36;
        $data->tanggal_pemantauan_selanjutnya_42 = $request->tanggal_pemantauan_selanjutnya_42;
        $data->tanggal_pemantauan_selanjutnya_48 = $request->tanggal_pemantauan_selanjutnya_48;
        $data->tanggal_pemantauan_selanjutnya_54 = $request->tanggal_pemantauan_selanjutnya_54; 
        $data->tanggal_pemantauan_selanjutnya_60 = $request->tanggal_pemantauan_selanjutnya_60; 
        $data->tanggal_pemantauan_selanjutnya_66 = $request->tanggal_pemantauan_selanjutnya_66;
       $data->tanggal_pemantauan_selanjutnya_72 = $request->tanggal_pemantauan_selanjutnya_72;
  
  
        $data->save();
        

        return redirect('matriksperkembangananak/'.$id)->with('msg','Data Berhasil Di Update');
    }


    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Matrikspemantauanperkembangananak $datamatriksperkembangananak4, $id)
    {
        $data = $datamatriksperkembangananak4->find($id);
        $data->delete();
        return redirect('matriksperkembangananak')->with('msg','Data Berhasil Di Hapus');
    }


    public function tambahmatriksperkembangananak(HttpRequest $request){
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
   return view('form.tambahdatamatrikspemantauanperkembangananak')->with([
        'dataorangtua1' => $dataOrangtua,
        'dataorangtua2' => $dataorangtu,
        'dataanak' => $dataanak,
        'dataanak1' => $dataanak1,
        'title' => 'Tambah Data Matriks Pemantauan Perkembangan Anak',
    
    ]);
    }
}
