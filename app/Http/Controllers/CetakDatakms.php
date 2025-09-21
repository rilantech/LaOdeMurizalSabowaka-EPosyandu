<?php

namespace App\Http\Controllers;

use App\Models\Dataanak;
use App\Models\Dataimunisasianak;
use App\Models\Datakms as ModelsDatakms;
use App\Models\Dataorangtua;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class CetakDatakms extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');

        if(!empty($search)){
            $datakms = ModelsDatakms::where('datakms.id','like','%'.$search.'%')
           ->orwhere('datakms.nama_anak','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            $datakms= ModelsDatakms::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamandatakms',[
            'title' => 'Data KMS',
            'datakms' => $datakms,
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
        
       
        $datakms =new ModelsDatakms;
        $datakms->nik_ibu = $request->nik_ibu;
        $datakms->nama_ibu= $request->nama_ibu;
        $datakms->nama_anak= $request->nama_anak;
        $datakms->anak_ke= $request->anak_ke;
        $datakms->jenis_kelamin= $request->jenis_kelamin;
       
            $datakms->bulan_penimbangan_0 = $request->bulan_penimbangan_0;
            $datakms->bulan_penimbangan_1 = $request->bulan_penimbangan_1;
            $datakms->bulan_penimbangan_2 = $request->bulan_penimbangan_2;
            $datakms->bulan_penimbangan_3 = $request->bulan_penimbangan_3;
            $datakms->bulan_penimbangan_4 = $request->bulan_penimbangan_4;
            $datakms->bulan_penimbangan_5 = $request->bulan_penimbangan_5;
            $datakms->bulan_penimbangan_6 = $request->bulan_penimbangan_6;
            $datakms->bulan_penimbangan_7 = $request->bulan_penimbangan_7;
            $datakms->bulan_penimbangan_8 = $request-> bulan_penimbangan_8;
             $datakms->bulan_penimbangan_9 = $request->bulan_penimbangan_9;
            $datakms->bulan_penimbangan_10 = $request->bulan_penimbangan_10;
          $datakms->bulan_penimbangan_11 = $request->bulan_penimbangan_11;
          $datakms->bulan_penimbangan_12 = $request->bulan_penimbangan_12;
          $datakms->bulan_penimbangan_13 = $request->bulan_penimbangan_13;
          $datakms->bulan_penimbangan_14 = $request->bulan_penimbangan_14;
          $datakms->bulan_penimbangan_15 = $request->bulan_penimbangan_15;
          $datakms->bulan_penimbangan_16 = $request->bulan_penimbangan_16;
          $datakms->bulan_penimbangan_17 = $request->bulan_penimbangan_17;
          $datakms->bulan_penimbangan_18 = $request->bulan_penimbangan_18;
          $datakms->bulan_penimbangan_19 = $request->bulan_penimbangan_19;
          $datakms->bulan_penimbangan_20 = $request->bulan_penimbangan_20;
          $datakms->bulan_penimbangan_21 = $request->bulan_penimbangan_21;
          $datakms->bulan_penimbangan_22 = $request->bulan_penimbangan_22;
          $datakms->bulan_penimbangan_23 = $request->bulan_penimbangan_23;
          $datakms->bulan_penimbangan_24 = $request->bulan_penimbangan_24;
          $datakms->bulan_penimbangan_25 = $request->bulan_penimbangan_25;
          $datakms->bulan_penimbangan_26 = $request->bulan_penimbangan_26;
          $datakms->bulan_penimbangan_27 = $request->bulan_penimbangan_27;
          $datakms->bulan_penimbangan_28 = $request->bulan_penimbangan_28;
          $datakms->bulan_penimbangan_29 = $request->bulan_penimbangan_29;
          $datakms->bulan_penimbangan_30 = $request->bulan_penimbangan_30;
          $datakms->bulan_penimbangan_31 = $request->bulan_penimbangan_31;
          $datakms->bulan_penimbangan_32 = $request->bulan_penimbangan_32;
          $datakms->bulan_penimbangan_33 = $request->bulan_penimbangan_33;
          $datakms->bulan_penimbangan_34 = $request->bulan_penimbangan_34;
          $datakms->bulan_penimbangan_35 = $request->bulan_penimbangan_35;
          $datakms->bulan_penimbangan_36 = $request->bulan_penimbangan_36;
          $datakms->bulan_penimbangan_37 = $request->bulan_penimbangan_37;
          $datakms->bulan_penimbangan_38 = $request->bulan_penimbangan_38;
          $datakms->bulan_penimbangan_39 = $request->bulan_penimbangan_39;
          $datakms->bulan_penimbangan_40 = $request->bulan_penimbangan_40;
          $datakms->bulan_penimbangan_41 = $request->bulan_penimbangan_41;
          $datakms->bulan_penimbangan_42 = $request->bulan_penimbangan_42;
          $datakms->bulan_penimbangan_43 = $request->bulan_penimbangan_43;
          $datakms->bulan_penimbangan_44 = $request->bulan_penimbangan_44;
          $datakms->bulan_penimbangan_45 = $request->bulan_penimbangan_45;
          $datakms->bulan_penimbangan_46 = $request->bulan_penimbangan_46;
          $datakms->bulan_penimbangan_47 = $request->bulan_penimbangan_47;
          $datakms->bulan_penimbangan_48 = $request->bulan_penimbangan_48;
          $datakms->bulan_penimbangan_49 = $request->bulan_penimbangan_49;
          $datakms->bulan_penimbangan_50 = $request->bulan_penimbangan_50;
          $datakms->bulan_penimbangan_51 = $request->bulan_penimbangan_51;
          $datakms->bulan_penimbangan_52 = $request->bulan_penimbangan_52;
          $datakms->bulan_penimbangan_53 = $request->bulan_penimbangan_53;
          $datakms->bulan_penimbangan_54 = $request->bulan_penimbangan_54;
          $datakms->bulan_penimbangan_55 = $request->bulan_penimbangan_55;
          $datakms->bulan_penimbangan_56 = $request->bulan_penimbangan_56;
          $datakms->bulan_penimbangan_57 = $request->bulan_penimbangan_57;
          $datakms->bulan_penimbangan_58 = $request->bulan_penimbangan_58;
          $datakms->bulan_penimbangan_59 = $request->bulan_penimbangan_59;
          $datakms->bulan_penimbangan_60 = $request->bulan_penimbangan_60;

          $datakms->bb_0 = $request->bb_0;
          $datakms->bb_1 = $request->bb_1;
          $datakms->bb_2 = $request->bb_2;
          $datakms->bb_3 = $request->bb_3;
          $datakms->bb_4 = $request->bb_4;
          $datakms->bb_5 = $request->bb_5;
          $datakms->bb_6 = $request->bb_6;
          $datakms->bb_7 = $request->bb_7;
          $datakms->bb_8 = $request->bb_8;
          $datakms->bb_9 = $request->bb_9;
          $datakms->bb_10 = $request->bb_10;
          $datakms->bb_11 = $request->bb_11;
          $datakms->bb_12 = $request->bb_12;
          $datakms->bb_13 = $request->bb_13;
          $datakms->bb_14 = $request->bb_14;
          $datakms->bb_15 = $request->bb_15;
          $datakms->bb_16 = $request->bb_16;
          $datakms->bb_17 = $request->bb_17;
          $datakms->bb_18 = $request->bb_18;
          $datakms->bb_19 = $request->bb_19;
          $datakms->bb_20 = $request->bb_20;
          $datakms->bb_21 = $request->bb_21;
          $datakms->bb_22 = $request->bb_22;
          $datakms->bb_23 = $request->bb_23;
          $datakms->bb_24 = $request->bb_24;
          $datakms->bb_25 = $request->bb_25;
          $datakms->bb_26 = $request->bb_26;
          $datakms->bb_27 = $request->bb_27;
          $datakms->bb_28 = $request->bb_28;
          $datakms->bb_29 = $request->bb_29;
          $datakms->bb_30 = $request->bb_30;
          $datakms->bb_31 = $request->bb_31;
          $datakms->bb_32 = $request->bb_32;
          $datakms->bb_33 = $request->bb_33;
          $datakms->bb_34 = $request->bb_34;
          $datakms->bb_35 = $request->bb_35;
          $datakms->bb_36 = $request->bb_36;
          $datakms->bb_37 = $request->bb_37;
          $datakms->bb_38 = $request->bb_38;
          $datakms->bb_39 = $request->bb_39;
          $datakms->bb_40 = $request->bb_40;
          $datakms->bb_41 = $request->bb_41;
          $datakms->bb_42 = $request->bb_42;
          $datakms->bb_43 = $request->bb_43;
          $datakms->bb_44 = $request->bb_44;
          $datakms->bb_45 = $request->bb_45;
          $datakms->bb_46 = $request->bb_46;
          $datakms->bb_47 = $request->bb_47;
          $datakms->bb_48 = $request->bb_48;
          $datakms->bb_49 = $request->bb_49;
          $datakms->bb_50 = $request->bb_50;
          $datakms->bb_51 = $request->bb_51;
          $datakms->bb_52 = $request->bb_52;
          $datakms->bb_53 = $request->bb_53;
          $datakms->bb_54 = $request->bb_54;
          $datakms->bb_55 = $request->bb_55;
          $datakms->bb_56 = $request->bb_56;
          $datakms->bb_57 = $request->bb_57;
          $datakms->bb_58 = $request->bb_58;
          $datakms->bb_59 = $request->bb_59;
          $datakms->bb_60 = $request->bb_60;
   
  
  $datakms->nt_0 = $request->nt_0;
  $datakms->nt_1 = $request->nt_1;
   $datakms->nt_2 = $request->nt_2;
   $datakms->nt_3 = $request->nt_3;
   $datakms->nt_4 = $request->nt_4;
   $datakms->nt_5 = $request->nt_5;
   $datakms->nt_6 = $request->nt_6;
   $datakms->nt_7 = $request->nt_7;
   $datakms->nt_8 = $request->nt_8;
   $datakms->nt_9 = $request->nt_9;
   $datakms->nt_10 = $request->nt_10;
  $datakms->nt_11 = $request->nt_11;
  $datakms->nt_12 = $request->nt_12;
   $datakms->nt_13 = $request->nt_13;
  $datakms->nt_14 = $request->nt_14;
  $datakms->nt_15 = $request->nt_15;
  $datakms->nt_16 = $request->nt_16;
  $datakms->nt_17 = $request->nt_17;
  $datakms->nt_18 = $request->nt_18;
  $datakms->nt_19 = $request->nt_19;
  $datakms->nt_20 = $request->nt_20;
  $datakms->nt_21 = $request->nt_21;
  $datakms->nt_22 = $request->nt_22;
  $datakms->nt_23 = $request->nt_23;
   $datakms->nt_24 = $request->nt_24;
  $datakms->nt_25 = $request->nt_25;
  $datakms->nt_26 = $request->nt_26;
  $datakms->nt_27 = $request->nt_27;
  $datakms->nt_28 = $request->nt_28;
  $datakms->nt_29 = $request->nt_29;
  $datakms->nt_30 = $request->nt_30;
  $datakms->nt_31 = $request->nt_31;
  $datakms->nt_32 = $request->nt_32;
  $datakms->nt_33 = $request->nt_33;
  $datakms->nt_34 = $request->nt_34;
   $datakms->nt_35 = $request->nt_35;
  $datakms->nt_36 = $request->nt_36;
  $datakms->nt_37 = $request->nt_37;
  $datakms->nt_38 = $request->nt_38;
  $datakms->nt_39 = $request->nt_39;
  $datakms->nt_40 = $request->nt_40;
  $datakms->nt_41 = $request->nt_41;
  $datakms->nt_42 = $request->nt_42;
  $datakms->nt_43 = $request->nt_43;
  $datakms->nt_44 = $request->nt_44;
  $datakms->nt_45 = $request->nt_45;
   $datakms->nt_46 = $request->nt_46;
  $datakms->nt_47 = $request->nt_47;
  $datakms->nt_48 = $request->nt_48;
  $datakms->nt_49 = $request->nt_49;
  $datakms->nt_50 = $request->nt_50;
  $datakms->nt_51 = $request->nt_51;
  $datakms->nt_52 = $request->nt_52;
  $datakms->nt_53 = $request->nt_53;
  $datakms->nt_54 = $request->nt_54;
  $datakms->nt_55 = $request->nt_55;
  $datakms->nt_56 = $request->nt_56;
   $datakms->nt_57 = $request->nt_57;
  $datakms->nt_58 = $request->nt_58;
  $datakms->nt_59 = $request->nt_59;
  $datakms->nt_60 = $request->nt_60;
    
  $datakms->asi_eksklusif_0 = $request->kali_asis_eksklusif_0;
  $datakms->asi_eksklusif_1 = $request->kali_asis_eksklusif_1;
   $datakms->asi_eksklusif_2 = $request->kali_asis_eksklusif_2;
  $datakms->asi_eksklusif_3 = $request->kali_asis_eksklusif_3;
  $datakms->asi_eksklusif_4 = $request->kali_asis_eksklusif_4;
  $datakms->asi_eksklusif_5 = $request->kali_asis_eksklusif_5;
  $datakms->asi_eksklusif_6 = $request->kali_asis_eksklusif_6;
   $datakms->save();
        
        return redirect('datakms')->with('msg','Data Berhasil Di Tambahkan');
    }

    /**
     * Display the specified resource.
     */
    public function show(HttpRequest $request, ModelsDatakms $datakms1, $id)
    {
        $nik = $request->query('nik');
        $dataOrangtua = Dataorangtua::all();
        $dataorangtu = array();
        $status_beratbadan_0 = "";
        if(!empty($nik)){
            $dataorangtu = Dataorangtua::where('tabel_data_orangtua.nik', $nik)->get();  
       }

        $data1 = $datakms1->find($id);
        
        //Berat Badan 0 Bulan
        $status_bb_0 = (float) $data1->bb_0;
        if($status_bb_0 >= 2 and $status_bb_0 < 2.4){
            $status_beratbadan_0 = "Berat Badan Kurang";
        } else if($status_bb_0 >= 2.4 and $status_bb_0 <= 4.3){
            $status_beratbadan_0 = "Berat Badan Normal";
        }
        else if($status_bb_0 < 2){
            $status_beratbadan_0 = "Berat Badan Sangat Kurang";
             if($data1->bb_0 ==""){
            $status_beratbadan_0 = "-";
            }
            
        }else if($status_bb_0 > 4.3){
            $status_beratbadan_0 = "Berat Badan Resiko Lebih";
        }else{
            $status_beratbadan_0 ="";
        }
        
         //Berat Badan 1 Bulan
        $status_bb_1 = (float) $data1->bb_1;
        if($status_bb_1 >= 2.7  and $status_bb_1 < 3.2){
            $status_beratbadan_1 = "Berat Badan Kurang";
        } else if($status_bb_1 >= 3.2 and $status_bb_1 <= 5.5){
            $status_beratbadan_1 = "Berat Badan Normal";
        }
        else if($status_bb_1 < 2.7){
            $status_beratbadan_1 = "Berat Badan Sangat Kurang";
             if($data1->bb_1 ==""){
            $status_beratbadan_1 = "-";
            }
            
        }else if($status_bb_1 > 5.5){
            $status_beratbadan_1 = "Berat Badan Resiko Lebih";
        }else{
            $status_beratbadan_1 ="";
        }
        
        //Berat Badan 2 Bulan
        $status_bb_2 = (float) $data1->bb_2;
        if($status_bb_2 >= 3.4  and $status_bb_2 < 4){
            $status_beratbadan_2 = "Berat Badan Kurang";
        } else if($status_bb_2 >= 4 and $status_bb_2 <= 6.6){
            $status_beratbadan_2 = "Berat Badan Normal";
        }
        else if($status_bb_2 < 3.4){
            $status_beratbadan_2 = "Berat Badan Sangat Kurang";
             if($data1->bb_2 ==""){
            $status_beratbadan_2= "-";
            }
            
        }else if($status_bb_2 > 6.6){
            $status_beratbadan_2 = "Berat Badan Resiko Lebih";
        }else{
            $status_beratbadan_2 ="";
        }
        
         //Berat Badan 3 Bulan
        $status_bb_3 = (float) $data1->bb_3;
        if($status_bb_3 >= 4  and $status_bb_3 < 4.6){
            $status_beratbadan_3 = "Berat Badan Kurang";
        } else if($status_bb_3 >= 4.6 and $status_bb_3 <= 7.5){
            $status_beratbadan_3 = "Berat Badan Normal";
        }
        else if($status_bb_3 < 4){
            $status_beratbadan_3 = "Berat Badan Sangat Kurang";
             if($data1->bb_3 ==""){
            $status_beratbadan_3 = "-";
            }
            
        }else if($status_bb_3 > 7.5){
            $status_beratbadan_3 = "Berat Badan Resiko Lebih";
        }else{
            $status_beratbadan_3 ="";
        }
        
         //Berat Badan 4 Bulan
        $status_bb_4 = (float) $data1->bb_4;
        if($status_bb_4 >= 4.4  and $status_bb_4 < 5){
            $status_beratbadan_4 = "Berat Badan Kurang";
        } else if($status_bb_4 >= 5 and $status_bb_4 <= 8.2){
            $status_beratbadan_4 = "Berat Badan Normal";
        }
        else if($status_bb_4 < 4.4){
            $status_beratbadan_4 = "Berat Badan Sangat Kurang";
            if($data1->bb_4 ==""){
            $status_beratbadan_4 = "-";
            }
        }else if($status_bb_4 > 8.2){
            $status_beratbadan_4 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_4 ="";
        }
        
          //Berat Badan 5 Bulan
        $status_bb_5 = (float) $data1->bb_5;
        if($status_bb_5 >= 4.8  and $status_bb_5 < 5.4){
            $status_beratbadan_5 = "Berat Badan Kurang";
        }
        else if($status_bb_5 < 4.8){
            $status_beratbadan_5 = "Berat Badan Sangat Kurang";
            if($data1->bb_5 ==""){
            $status_beratbadan_5 = "-";
            }
        
        }else if($status_bb_5 >= 5.4 and $status_bb_5 <= 8.8){
            $status_beratbadan_5 = "Berat Badan Normal";
        
        }else if($status_bb_5 > 8.8){
            $status_beratbadan_5 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_5 ="";
        }
        
         //Berat Badan 6 Bulan
        $status_bb_6 = (float) $data1->bb_6;
        if($status_bb_6 >= 5.1  and $status_bb_6 < 5.7){
            $status_beratbadan_6 = "Berat Badan Kurang";
        }
        else if($status_bb_6 < 5.1){
            $status_beratbadan_6 = "Berat Badan Sangat Kurang";
            if($data1->bb_6 ==""){
            $status_beratbadan_6 = "-";
            }
        }else if($status_bb_6 >= 5.7 and $status_bb_6 <= 9.3){
            $status_beratbadan_6 = "Berat Badan Normal";
        
        }else if($status_bb_6 > 9.3){
            $status_beratbadan_6 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_6 ="";
        }
        
        //Berat Badan 7 Bulan
        $status_bb_7 = (float) $data1->bb_7;
        if($status_bb_7 >= 5.3  and $status_bb_7 < 6){
            $status_beratbadan_7 = "Berat Badan Kurang";
        }
        else if($status_bb_7 < 5.3){
            $status_beratbadan_7 = "Berat Badan Sangat Kurang";
            if($data1->bb_7 ==""){
            $status_beratbadan_7 = "-";
            }
        }else if($status_bb_7 >= 6 and $status_bb_7 <= 9.8){
            $status_beratbadan_7 = "Berat Badan Normal";
        }
        
        else if($status_bb_7 > 9.8){
            $status_beratbadan_7 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_7 ="";
        }
        
        //Berat Badan 8 Bulan
        $status_bb_8 = (float) $data1->bb_8;
        if($status_bb_8 >= 5.6  and $status_bb_8 < 6.3){
            $status_beratbadan_8 = "Berat Badan Kurang";
        }
        else if($status_bb_8 < 5.6){
            $status_beratbadan_8 = "Berat Badan Sangat Kurang";
            if($data1->bb_8 ==""){
            $status_beratbadan_8 = "-";
            }
       } else if($status_bb_8 >= 6.3 and $status_bb_8 <= 10.3){
            $status_beratbadan_8 = "Berat Badan Normal";
        
        
        }else if($status_bb_8 > 10.3){
            $status_beratbadan_8 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_8 ="";
        }
        
        //Berat Badan 9 Bulan
        $status_bb_9 = (float) $data1->bb_9;
        if($status_bb_9 >= 5.8  and $status_bb_9 < 6.5){
            $status_beratbadan_9 = "Berat Badan Kurang";
        }
        else if($status_bb_9 < 5.8){
            $status_beratbadan_9 = "Berat Badan Sangat Kurang";
            if($data1->bb_9 ==""){
            $status_beratbadan_9 = "-";
            }
        }else if($status_bb_9 >= 6.5 and $status_bb_9 <= 10.6){
            $status_beratbadan_9 = "Berat Badan Normal";
    
        }else if($status_bb_9 > 10.6){
            $status_beratbadan_9 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_9 ="";
        }
        
        //Berat Badan 10 Bulan
        $status_bb_10 = (float) $data1->bb_10;
        if($status_bb_10 >= 5.9  and $status_bb_10 < 6.7){
            $status_beratbadan_10 = "Berat Badan Kurang";
        }
        else if($status_bb_10 < 5.9){
            $status_beratbadan_10 = "Berat Badan Sangat Kurang";
            if($data1->bb_10 ==""){
            $status_beratbadan_10 = "-";
            }
        }else if($status_bb_10 >= 6.7 and $status_bb_10 <= 10.9){
            $status_beratbadan_10 = "Berat Badan Normal";
    
        }else if($status_bb_10 > 10.9){
            $status_beratbadan_10 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_10 ="";
        }
        
        //Berat Badan 11 Bulan
        $status_bb_11 = (float) $data1->bb_11;
        if($status_bb_11 >= 6.1  and $status_bb_11 < 6.9){
            $status_beratbadan_11 = "Berat Badan Kurang";
        }
        else if($status_bb_11 < 6.1){
            $status_beratbadan_11 = "Berat Badan Sangat Kurang";
            if($data1->bb_11 ==""){
            $status_beratbadan_11 = "-";
            }
        }else if($status_bb_11 >= 6.9 and $status_bb_11 <= 11.2){
            $status_beratbadan_11 = "Berat Badan Normal";
        
        }else if($status_bb_11 > 11.2){
            $status_beratbadan_11 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_11 ="";
        }
        
        //Berat Badan 12 Bulan
        $status_bb_12 = (float) $data1->bb_12;
        if($status_bb_12 >= 6.3  and $status_bb_12 < 7){
            $status_beratbadan_12 = "Berat Badan Kurang";
        }
        else if($status_bb_12 < 6.3){
            $status_beratbadan_12 = "Berat Badan Sangat Kurang";
            if($data1->bb_12 ==""){
            $status_beratbadan_12 = "-";
            }
            
        }else if($status_bb_12 >= 7 and $status_bb_12 <= 11.5){
            $status_beratbadan_12 = "Berat Badan Normal";
        }
        
        else if($status_bb_12 > 11.5){
            $status_beratbadan_12 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_12 ="";
        }
        
        //Berat Badan 13 Bulan
        $status_bb_13 = (float) $data1->bb_13;
        if($status_bb_13 >= 6.4  and $status_bb_13 < 7.2){
            $status_beratbadan_13 = "Berat Badan Kurang";
        }
        else if($status_bb_13 < 6.4){
            $status_beratbadan_13 = "Berat Badan Sangat Kurang";
            if($data1->bb_13 ==""){
            $status_beratbadan_13 = "-";
            }
        }else if($status_bb_13 >= 7.2 and $status_bb_13 <= 11.8){
            $status_beratbadan_13 = "Berat Badan Normal";
        
        
        }else if($status_bb_13 > 11.8){
            $status_beratbadan_13 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_13 ="";
        }
        
        //Berat Badan 14 Bulan
        $status_bb_14 = (float) $data1->bb_14;
        if($status_bb_14 >= 6.6  and $status_bb_14 < 7.4){
            $status_beratbadan_14 = "Berat Badan Kurang";
        }
        else if($status_bb_14 < 6.6){
            $status_beratbadan_14 = "Berat Badan Sangat Kurang";
            if($data1->bb_14 ==""){
            $status_beratbadan_14 = "-";
            }
       } else if($status_bb_14 >= 7.4 and $status_bb_14 <= 12.1){
            $status_beratbadan_14 = "Berat Badan Normal";
        }else if($status_bb_14 > 12.1){
            $status_beratbadan_14 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_14 ="";
        }
        
        //Berat Badan 15 Bulan
        $status_bb_15 = (float) $data1->bb_15;
        if($status_bb_15 >= 6.8  and $status_bb_15 < 7.5){
            $status_beratbadan_15 = "Berat Badan Kurang";
        }
        else if($status_bb_15 < 6.8){
            $status_beratbadan_15 = "Berat Badan Sangat Kurang";
            if($data1->bb_15 ==""){
            $status_beratbadan_15 = "-";
            }
        }else if($status_bb_15 >= 7.5 and $status_bb_15 <= 12.4){
            $status_beratbadan_15 = "Berat Badan Normal";
        
        }else if($status_bb_15 > 12.4){
            $status_beratbadan_15 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_15 ="";
        }
        
        //Berat Badan 16 Bulan
        $status_bb_16 = (float) $data1->bb_16;
        if($status_bb_16 >= 6.9  and $status_bb_16 < 7.7){
            $status_beratbadan_16 = "Berat Badan Kurang";
        }
        else if($status_bb_16 < 6.9){
            $status_beratbadan_16 = "Berat Badan Sangat Kurang";
            if($data1->bb_16 ==""){
            $status_beratbadan_16 = "-";
            }
        }else if($status_bb_16 >= 7.7 and $status_bb_16 <= 12.7){
            $status_beratbadan_16 = "Berat Badan Normal";
        
        }else if($status_bb_16 > 12.6){
            $status_beratbadan_16 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_16 ="";
        }
        
        //Berat Badan 17 Bulan
        $status_bb_17 = (float) $data1->bb_17;
        if($status_bb_17 >= 7  and $status_bb_17 < 7.9){
            $status_beratbadan_17 = "Berat Badan Kurang";
        }
        else if($status_bb_17 < 7){
            $status_beratbadan_17 = "Berat Badan Sangat Kurang";
            if($data1->bb_17 ==""){
            $status_beratbadan_17 = "-";
            }
        }else if($status_bb_17 >= 7.9 and $status_bb_17 <= 12.7){
            $status_beratbadan_17 = "Berat Badan Normal";
        
        }else if($status_bb_17 > 12.7){
            $status_beratbadan_17 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_17 ="";
        }
        
        //Berat Badan 18 Bulan
        $status_bb_18 = (float) $data1->bb_18;
        if($status_bb_18 >= 7.2  and $status_bb_18 < 8.1){
            $status_beratbadan_18 = "Berat Badan Kurang";
        }
        else if($status_bb_18 < 7.2){
            $status_beratbadan_18 = "Berat Badan Sangat Kurang";
            if($data1->bb_18 ==""){
            $status_beratbadan_18 = "-";
            }
            
        }else if($status_bb_18 >= 8.1 and $status_bb_18 <= 13.1){
            $status_beratbadan_18 = "Berat Badan Normal";
        }else if($status_bb_18 > 13.1){
            $status_beratbadan_18 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_18 ="";
        }
        
         //Berat Badan 19 Bulan
        $status_bb_19 = (float) $data1->bb_19;
        if($status_bb_19 >= 7.3  and $status_bb_19 < 8.2){
            $status_beratbadan_19 = "Berat Badan Kurang";
        }
        else if($status_bb_19 < 7.3){
            $status_beratbadan_19 = "Berat Badan Sangat Kurang";
            if($data1->bb_19 ==""){
            $status_beratbadan_19 = "-";
            }
       } else if($status_bb_19 >= 8.2 and $status_bb_19 <= 13.5){
            $status_beratbadan_19 = "Berat Badan Normal";
        
        }else if($status_bb_19 > 13.5){
            $status_beratbadan_19 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_19 ="";
        }
        
        //Berat Badan 20 Bulan
        $status_bb_20 = (float) $data1->bb_20;
        if($status_bb_20 >= 7.5  and $status_bb_20 < 8.4){
            $status_beratbadan_20 = "Berat Badan Kurang";
        }
        else if($status_bb_20 < 7.5){
            $status_beratbadan_20 = "Berat Badan Sangat Kurang";
            if($data1->bb_20 ==""){
            $status_beratbadan_20 = "-";
            }
       } else if($status_bb_20 >= 8.4 and $status_bb_20 <= 13.8){
            $status_beratbadan_20 = "Berat Badan Normal";
    
        
        }else if($status_bb_20 > 13.8){
            $status_beratbadan_20 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_20 ="";
        }
        
        //Berat Badan 21 Bulan
        $status_bb_21 = (float) $data1->bb_21;
        if($status_bb_21 >= 7.6  and $status_bb_21 < 8.6){
            $status_beratbadan_21 = "Berat Badan Kurang";
        }
        else if($status_bb_21 < 7.6){
            $status_beratbadan_21 = "Berat Badan Sangat Kurang";
            if($data1->bb_21 ==""){
            $status_beratbadan_21 = "-";
            }
            
        }else if($status_bb_21 >= 8.6 and $status_bb_21 <= 14){
            $status_beratbadan_21 = "Berat Badan Normal";
        
        }else if($status_bb_21 > 14){
            $status_beratbadan_21 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_21 ="";
        }
        
        //Berat Badan 22 Bulan
        $status_bb_22 = (float) $data1->bb_22;
        if($status_bb_22 >= 7.8  and $status_bb_22 < 8.7){
            $status_beratbadan_22 = "Berat Badan Kurang";
        }
        else if($status_bb_22 < 7.8){
            $status_beratbadan_22 = "Berat Badan Sangat Kurang";
            if($data1->bb_22 ==""){
            $status_beratbadan_22 = "-";
            }
        }else if($status_bb_22 >= 8.7 and $status_bb_22 <= 14.3){
            $status_beratbadan_22 = "Berat Badan Normal";
        
        
        }else if($status_bb_22 > 14.3){
            $status_beratbadan_22 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_22 ="";
        }
        
        //Berat Badan 23 Bulan
        $status_bb_23 = (float) $data1->bb_23;
        if($status_bb_23 >= 7.9  and $status_bb_23 < 8.9){
            $status_beratbadan_23 = "Berat Badan Kurang";
        }
        else if($status_bb_23 < 7.9){
            $status_beratbadan_23 = "Berat Badan Sangat Kurang";
            if($data1->bb_23 ==""){
            $status_beratbadan_23 = "-";
            }
        }else if($status_bb_23 >= 8.9 and $status_bb_23 <= 14.6){
            $status_beratbadan_23 = "Berat Badan Normal";
        
        }else if($status_bb_23 > 14.6){
            $status_beratbadan_23 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_23 ="";
        }
        
        //Berat Badan 24 Bulan
        $status_bb_24 = (float) $data1->bb_24;
        if($status_bb_24 >= 8.1  and $status_bb_24 < 9){
            $status_beratbadan_24 = "Berat Badan Kurang";
        }
        else if($status_bb_24 < 8.1){
            $status_beratbadan_24 = "Berat Badan Sangat Kurang";
            if($data1->bb_24 ==""){
            $status_beratbadan_24 = "-";
            }
       } else if($status_bb_24 >= 9 and $status_bb_24 <= 14.8){
            $status_beratbadan_24 = "Berat Badan Normal";
        
        }else if($status_bb_24 > 14.8){
            $status_beratbadan_24 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_24 ="";
        }
        
        //Berat Badan 25 Bulan
        $status_bb_25 = (float) $data1->bb_25;
        if($status_bb_25 >= 8.2  and $status_bb_25 < 9.3){
            $status_beratbadan_25 = "Berat Badan Kurang";
        }
        else if($status_bb_25 < 8.2){
            $status_beratbadan_25 = "Berat Badan Sangat Kurang";
            if($data1->bb_25 ==""){
            $status_beratbadan_25 = "-";
            }
        }else if($status_bb_25 >= 9.3 and $status_bb_25 <= 15.1){
            $status_beratbadan_25 = "Berat Badan Normal";
        
        }else if($status_bb_25 > 15.1){
            $status_beratbadan_25 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_25 ="";
        }
        
         //Berat Badan 26 Bulan
        $status_bb_26 = (float) $data1->bb_26;
        if($status_bb_26 >= 8.3  and $status_bb_26 < 9.3){
            $status_beratbadan_26 = "Berat Badan Kurang";
        }
        else if($status_bb_26 < 8.2){
            $status_beratbadan_26 = "Berat Badan Sangat Kurang";
            if($data1->bb_26 ==""){
            $status_beratbadan_26 = "-";
            }
       } else if($status_bb_26 >= 9.3 and $status_bb_26 <= 15.4){
            $status_beratbadan_26 = "Berat Badan Normal";
        
        }else if($status_bb_26 > 15.4){
            $status_beratbadan_26 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_26 ="";
        }
        
        //Berat Badan 27 Bulan
        $status_bb_27 = (float) $data1->bb_27;
        if($status_bb_27 >= 8.5  and $status_bb_27 < 9.5){
            $status_beratbadan_27 = "Berat Badan Kurang";
        }
        else if($status_bb_27 < 8.5){
            $status_beratbadan_27 = "Berat Badan Sangat Kurang";
            if($data1->bb_27 ==""){
            $status_beratbadan_27 = "-";
            }
       } else if($status_bb_27 >= 9.5 and $status_bb_27 <= 15.7){
            $status_beratbadan_27 = "Berat Badan Normal";
        
        }else if($status_bb_27 > 15.7){
            $status_beratbadan_27 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_27 ="";
        }
        
        //Berat Badan 28 Bulan
        $status_bb_28 = (float) $data1->bb_28;
        if($status_bb_28 >= 8.6  and $status_bb_28 < 9.7){
            $status_beratbadan_28 = "Berat Badan Kurang";
        }
        else if($status_bb_28 < 8.6){
            $status_beratbadan_28 = "Berat Badan Sangat Kurang";
            if($data1->bb_28 ==""){
            $status_beratbadan_28 = "-";
            }
        }else if($status_bb_28 >= 9.7 and $status_bb_28 <= 16){
            $status_beratbadan_28 = "Berat Badan Normal";
        
        }else if($status_bb_28 > 16){
            $status_beratbadan_28 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_28 ="";
        }
        
         //Berat Badan 29 Bulan
         $status_bb_29 = (float) $data1->bb_29;
        if($status_bb_29 >= 8.8  and $status_bb_29 < 9.8){
            $status_beratbadan_29 = "Berat Badan Kurang";
        }
        else if($status_bb_29 < 8.8){
            $status_beratbadan_29 = "Berat Badan Sangat Kurang";
            if($data1->bb_29 ==""){
            $status_beratbadan_29 = "-";
            }
        }else if($status_bb_29 >= 9.8 and $status_bb_29 <= 16.2){
            $status_beratbadan_29 = "Berat Badan Normal";
        
        }else if($status_bb_29 > 16.2){
            $status_beratbadan_29 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_29 ="";
        }
        
        //Berat Badan 30 Bulan
        $status_bb_30 = (float) $data1->bb_30;
        if($status_bb_30 >= 8.9  and $status_bb_30 < 10){
            $status_beratbadan_30 = "Berat Badan Kurang";
        }
        else if($status_bb_30 < 8.9){
            $status_beratbadan_30 = "Berat Badan Sangat Kurang";
            if($data1->bb_30 ==""){
            $status_beratbadan_30 = "-";
            }
        }else if($status_bb_30 >= 10 and $status_bb_30 <= 16.5){
            $status_beratbadan_30 = "Berat Badan Normal";
        
        }else if($status_bb_30 > 16.5){
            $status_beratbadan_30 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_30 ="";
        }
        
        //Berat Badan 31 Bulan
        $status_bb_31 = (float) $data1->bb_31;
        if($status_bb_31 >= 9  and $status_bb_31 < 10.1){
            $status_beratbadan_31 = "Berat Badan Kurang";
        }
        else if($status_bb_31 < 9){
            $status_beratbadan_31 = "Berat Badan Sangat Kurang";
            if($data1->bb_31 ==""){
            $status_beratbadan_31 = "-";
            }
       } else if($status_bb_31 >= 10.1 and $status_bb_31 <= 16.8){
            $status_beratbadan_31 = "Berat Badan Normal";
    
        
        }else if($status_bb_31 > 16.8){
            $status_beratbadan_31 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_31 ="";
        }
        
        //Berat Badan 32 Bulan
        $status_bb_32 = (float) $data1->bb_32;
        if($status_bb_32 >= 9.1  and $status_bb_32 < 10.3){
            $status_beratbadan_32 = "Berat Badan Kurang";
        }
        else if($status_bb_32 < 9.1){
            $status_beratbadan_32 = "Berat Badan Sangat Kurang";
            if($data1->bb_32 ==""){
            $status_beratbadan_32 = "-";
            }
        }else if($status_bb_32 >= 10.3 and $status_bb_32 <= 17.1){
            $status_beratbadan_32 = "Berat Badan Normal";
        
        }else if($status_bb_32 > 17.1){
            $status_beratbadan_32 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_32 ="";
        }
        
        //Berat Badan 33 Bulan
        $status_bb_33 = (float) $data1->bb_33;
        if($status_bb_33 >= 9.3  and $status_bb_33 < 10.4){
            $status_beratbadan_33 = "Berat Badan Kurang";
        }
        else if($status_bb_33 < 9.3){
            $status_beratbadan_33 = "Berat Badan Sangat Kurang";
            if($data1->bb_33 ==""){
            $status_beratbadan_33 = "-";
            }
       } else if($status_bb_33 >= 10.4 and $status_bb_33 <= 17.3){
            $status_beratbadan_33 = "Berat Badan Normal";
        
        }else if($status_bb_33 > 17.3){
            $status_beratbadan_33 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_33 ="";
        }
        
        //Berat Badan 34 Bulan
        $status_bb_34 = (float) $data1->bb_34;
        if($status_bb_34 >= 9.4  and $status_bb_34 < 10.5){
            $status_beratbadan_34 = "Berat Badan Kurang";
        }
        else if($status_bb_34 < 9.4){
            $status_beratbadan_34 = "Berat Badan Sangat Kurang";
            if($data1->bb_34 ==""){
            $status_beratbadan_34 = "-";
            }
        }else if($status_bb_34 >= 10.5 and $status_bb_34 <= 17.5){
            $status_beratbadan_34 = "Berat Badan Normal";
        
        }else if($status_bb_34 > 17.5){
            $status_beratbadan_34 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_34 ="";
        }
        
        //Berat Badan 35 Bulan
        $status_bb_35 = (float) $data1->bb_35;
        if($status_bb_35 >= 9.5  and $status_bb_35 < 10.7){
            $status_beratbadan_35 = "Berat Badan Kurang";
        }
        else if($status_bb_35 < 9.5){
            $status_beratbadan_35 = "Berat Badan Sangat Kurang";
            if($data1->bb_35 ==""){
            $status_beratbadan_35 = "-";
            }
        }else if($status_bb_35 >= 10.7 and $status_bb_35 <= 17.9){
            $status_beratbadan_35 = "Berat Badan Normal";
     
        }else if($status_bb_35 > 17.9){
            $status_beratbadan_35 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_35 ="";
        }
        
        //Berat Badan 36 Bulan
        $status_bb_36 = (float) $data1->bb_36;
        if($status_bb_36 >= 9.6  and $status_bb_36 < 10.8){
            $status_beratbadan_36 = "Berat Badan Kurang";
        }
        else if($status_bb_36 < 9.6){
            $status_beratbadan_36 = "Berat Badan Sangat Kurang";
            if($data1->bb_36 ==""){
            $status_beratbadan_36 = "-";
            }
        }else if($status_bb_36 >= 10.8 and $status_bb_36 <= 18.1){
            $status_beratbadan_36 = "Berat Badan Normal";
        
        }else if($status_bb_36 > 18.1){
            $status_beratbadan_36 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_36 ="";
        }
        
        //Berat Badan 37 Bulan
        $status_bb_37 = (float) $data1->bb_37;
        if($status_bb_37 >= 9.7  and $status_bb_37 < 10.9){
            $status_beratbadan_37 = "Berat Badan Kurang";
        }
        else if($status_bb_37 < 9.7){
            $status_beratbadan_37 = "Berat Badan Sangat Kurang";
            if($data1->bb_37 ==""){
            $status_beratbadan_37 = "-";
            }
       } else if($status_bb_37 >= 10.9 and $status_bb_37 <= 18.4){
            $status_beratbadan_37 = "Berat Badan Normal";
        
        }else if($status_bb_37 > 18.4){
            $status_beratbadan_37 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_37 ="";
        }
        
        //Berat Badan 38 Bulan
        $status_bb_38 = (float) $data1->bb_38;
        if($status_bb_38 >= 9.8  and $status_bb_38 < 11.1){
            $status_beratbadan_38 = "Berat Badan Kurang";
        }
        else if($status_bb_38 < 9.8){
            $status_beratbadan_38 = "Berat Badan Sangat Kurang";
            if($data1->bb_38 ==""){
            $status_beratbadan_38 = "-";
            }
       } else if($status_bb_38 >= 11.1 and $status_bb_38 <= 18.7){
            $status_beratbadan_38 = "Berat Badan Normal";
    
        }else if($status_bb_38 > 18.7){
            $status_beratbadan_38 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_38 ="";
        }
        
        //Berat Badan 39 Bulan
        $status_bb_39 = (float) $data1->bb_39;
        if($status_bb_39 >= 9.9  and $status_bb_39 < 11.2){
            $status_beratbadan_39 = "Berat Badan Kurang";
        }
        else if($status_bb_39 < 9.9){
            $status_beratbadan_39 = "Berat Badan Sangat Kurang";
            if($data1->bb_39 ==""){
            $status_beratbadan_39 = "-";
            }
       } else if($status_bb_39 >= 11.2 and $status_bb_39 <= 19){
          $status_beratbadan_39 = "Berat Badan Normal";
        
        }else if($status_bb_39 > 19){
            $status_beratbadan_39 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_39 ="";
        }
        
        //Berat Badan 40 Bulan
        $status_bb_40 = (float) $data1->bb_40;
        if($status_bb_40 >= 10.1  and $status_bb_40 < 11.3){
            $status_beratbadan_40 = "Berat Badan Kurang";
        }
        else if($status_bb_40 < 10.1){
            $status_beratbadan_40 = "Berat Badan Sangat Kurang";
            if($data1->bb_40 ==""){
            $status_beratbadan_40 = "-";
            }
       } else if($status_bb_40 >= 11.3 and $status_bb_40 <= 19.2){
            $status_beratbadan_40 = "Berat Badan Normal";
        
        }else if($status_bb_40 > 19.2){
            $status_beratbadan_40 = "Berat Badan Resiko Lebih";
        }
        else{
            $status_beratbadan_40 ="";
        }
        
        
        if($status_beratbadan_0 != "-"){
            $status_bb_terakhir = $status_beratbadan_0;
        }
        if($status_beratbadan_1 != "-"){
            $status_bb_terakhir = $status_beratbadan_1;
        }
         if($status_beratbadan_2 != "-"){
            $status_bb_terakhir = $status_beratbadan_2;
        }
         if($status_beratbadan_3 != "-"){
            $status_bb_terakhir = $status_beratbadan_3;
        }
         if($status_beratbadan_4 != "-"){
            $status_bb_terakhir = $status_beratbadan_4;
        }
        
         if($status_beratbadan_5 != "-"){
            $status_bb_terakhir = $status_beratbadan_5;
        }
        
         if($status_beratbadan_6 != "-"){
            $status_bb_terakhir = $status_beratbadan_6;
        }
        
         if($status_beratbadan_7 != "-"){
            $status_bb_terakhir = $status_beratbadan_7;
        }
        
         if($status_beratbadan_8 != "-"){
            $status_bb_terakhir = $status_beratbadan_8;
        }
        
         if($status_beratbadan_9 != "-"){
            $status_bb_terakhir = $status_beratbadan_9;
        }
        
         if($status_beratbadan_10 != "-"){
            $status_bb_terakhir = $status_beratbadan_10;
        }
        
        if($status_beratbadan_11 != "-"){
            $status_bb_terakhir = $status_beratbadan_11;
        }
         if($status_beratbadan_12 != "-"){
            $status_bb_terakhir = $status_beratbadan_12;
        }
         if($status_beratbadan_13 != "-"){
            $status_bb_terakhir = $status_beratbadan_13;
        }
         if($status_beratbadan_14 != "-"){
            $status_bb_terakhir = $status_beratbadan_14;
        }
        
         if($status_beratbadan_15 != "-"){
            $status_bb_terakhir = $status_beratbadan_15;
        }
        
         if($status_beratbadan_16 != "-"){
            $status_bb_terakhir = $status_beratbadan_16;
        }
        
         if($status_beratbadan_17 != "-"){
            $status_bb_terakhir = $status_beratbadan_17;
        }
        
         if($status_beratbadan_18 != "-"){
            $status_bb_terakhir = $status_beratbadan_18;
        }
        
         if($status_beratbadan_19 != "-"){
            $status_bb_terakhir = $status_beratbadan_19;
        }
        
         if($status_beratbadan_20 != "-"){
            $status_bb_terakhir = $status_beratbadan_20;
        }
        
          if($status_beratbadan_21 != "-"){
            $status_bb_terakhir = $status_beratbadan_21;
        }
         if($status_beratbadan_22 != "-"){
            $status_bb_terakhir = $status_beratbadan_22;
        }
         if($status_beratbadan_23 != "-"){
            $status_bb_terakhir = $status_beratbadan_23;
        }
         if($status_beratbadan_24 != "-"){
            $status_bb_terakhir = $status_beratbadan_24;
        }
        
         if($status_beratbadan_25 != "-"){
            $status_bb_terakhir = $status_beratbadan_25;
        }
        
         if($status_beratbadan_26 != "-"){
            $status_bb_terakhir = $status_beratbadan_26;
        }
        
         if($status_beratbadan_27 != "-"){
            $status_bb_terakhir = $status_beratbadan_27;
        }
        
         if($status_beratbadan_28 != "-"){
            $status_bb_terakhir = $status_beratbadan_28;
        }
        
         if($status_beratbadan_29 != "-"){
            $status_bb_terakhir = $status_beratbadan_29;
        }
        
         if($status_beratbadan_30 != "-"){
            $status_bb_terakhir = $status_beratbadan_30;
        }
        
         if($status_beratbadan_31 != "-"){
            $status_bb_terakhir = $status_beratbadan_31;
        }
         if($status_beratbadan_32 != "-"){
            $status_bb_terakhir = $status_beratbadan_32;
        }
         if($status_beratbadan_33 != "-"){
            $status_bb_terakhir = $status_beratbadan_33;
        }
         if($status_beratbadan_34 != "-"){
            $status_bb_terakhir = $status_beratbadan_34;
        }
        
         if($status_beratbadan_35 != "-"){
            $status_bb_terakhir = $status_beratbadan_35;
        }
        
         if($status_beratbadan_36 != "-"){
            $status_bb_terakhir = $status_beratbadan_36;
        }
        
         if($status_beratbadan_37 != "-"){
            $status_bb_terakhir = $status_beratbadan_37;
        }
        
         if($status_beratbadan_38 != "-"){
            $status_bb_terakhir = $status_beratbadan_38;
        }
        
         if($status_beratbadan_39 != "-"){
            $status_bb_terakhir = $status_beratbadan_39;
        }
        
         if($status_beratbadan_40 != "-"){
            $status_bb_terakhir = $status_beratbadan_40;
        }
             
        return view('tabel.cetakdatakms')->with([
           'status_berat_badan_0' => $status_beratbadan_0,
            'status_berat_badan_1' => $status_beratbadan_1,
            'status_berat_badan_2' => $status_beratbadan_2,
            'status_berat_badan_3' => $status_beratbadan_3,
            'status_berat_badan_4' => $status_beratbadan_4,
            'status_berat_badan_5' => $status_beratbadan_5,
            'status_berat_badan_6' => $status_beratbadan_6,
            'status_berat_badan_7' => $status_beratbadan_7,
            'status_berat_badan_8' => $status_beratbadan_8,
            'status_berat_badan_9' => $status_beratbadan_9,
            'status_berat_badan_10' => $status_beratbadan_10,
            'status_berat_badan_11' => $status_beratbadan_11,
            'status_berat_badan_12' => $status_beratbadan_12,
            'status_berat_badan_13' => $status_beratbadan_13,
            'status_berat_badan_14' => $status_beratbadan_14,
            'status_berat_badan_15' => $status_beratbadan_15,
            'status_berat_badan_16' => $status_beratbadan_16,
            'status_berat_badan_17' => $status_beratbadan_17,
            'status_berat_badan_18' => $status_beratbadan_18,
            'status_berat_badan_19' => $status_beratbadan_19,
            'status_berat_badan_20' => $status_beratbadan_20,
            'status_berat_badan_21' => $status_beratbadan_21,
            'status_berat_badan_22' => $status_beratbadan_22,
            'status_berat_badan_23' => $status_beratbadan_23,
            'status_berat_badan_24' => $status_beratbadan_24,
            'status_berat_badan_25' => $status_beratbadan_25,
            'status_berat_badan_26' => $status_beratbadan_26,
            'status_berat_badan_27' => $status_beratbadan_27,
            'status_berat_badan_28' => $status_beratbadan_28,
            'status_berat_badan_29' => $status_beratbadan_29,
            'status_berat_badan_30' => $status_beratbadan_30,
            'status_berat_badan_31' => $status_beratbadan_31,
            'status_berat_badan_32' => $status_beratbadan_32,
            'status_berat_badan_33' => $status_beratbadan_33,
            'status_berat_badan_34' => $status_beratbadan_34,
            'status_berat_badan_35' => $status_beratbadan_35,
            'status_berat_badan_36' => $status_beratbadan_36,
            'status_berat_badan_37' => $status_beratbadan_37,
            'status_berat_badan_38' => $status_beratbadan_38,
            'status_berat_badan_39' => $status_beratbadan_39,
            'status_berat_badan_40' => $status_beratbadan_40,
            'status_bb_terakhir' => $status_bb_terakhir,
            'dataorangtua1' => $dataOrangtua,
            'dataorangtua2' => $dataorangtu,
            'id' => $id,
            'nik_ibu' => $data1->nik_ibu,
            'nama_ibu' => $data1->nama_ibu,
            'nama_ayah' => $data1->nama_ayah,
            'nama_anak' => $data1->nama_anak,
            'anak_ke' => $data1->anak_ke,
            'jenis_kelamin' => $data1->jenis_kelamin,
           'bulan_penimbangan_0' => date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_0))),
           'bulan_penimbangan_1' => date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_1))),
           'bulan_penimbangan_2' => date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_2))),
           'bulan_penimbangan_3' => date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_3))),
           'bulan_penimbangan_4'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_4))),
           'bulan_penimbangan_5'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_5))),
           'bulan_penimbangan_6'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_6))),
           'bulan_penimbangan_7'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_7))),
           'bulan_penimbangan_8'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1-> bulan_penimbangan_8))),
            'bulan_penimbangan_9'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_9))),
           'bulan_penimbangan_10'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_10))),
         'bulan_penimbangan_11'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_11))),
         'bulan_penimbangan_12'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_12))),
         'bulan_penimbangan_13'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_13))),
         'bulan_penimbangan_14'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_14))),
         'bulan_penimbangan_15'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_15))),
         'bulan_penimbangan_16'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_16))),
         'bulan_penimbangan_17'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_17))),
         'bulan_penimbangan_18'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_18))),
         'bulan_penimbangan_19'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_19))),
         'bulan_penimbangan_20'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_20))),
         'bulan_penimbangan_21'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_21))),
         'bulan_penimbangan_22'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_22))),
         'bulan_penimbangan_23'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_23))),
         'bulan_penimbangan_24'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_24))),
         'bulan_penimbangan_25'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_25))),
         'bulan_penimbangan_26'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_26))),
         'bulan_penimbangan_27'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_27))),
         'bulan_penimbangan_28'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_28))),
         'bulan_penimbangan_29'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_29))),
         'bulan_penimbangan_30'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_30))),
         'bulan_penimbangan_31'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_31))),
         'bulan_penimbangan_32'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_32))),
         'bulan_penimbangan_33'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_33))),
         'bulan_penimbangan_34'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_34))),
         'bulan_penimbangan_35'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_35))),
         'bulan_penimbangan_36'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_36))),
         'bulan_penimbangan_37'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_37))),
         'bulan_penimbangan_38'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_38))),
         'bulan_penimbangan_39'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_39))),
         'bulan_penimbangan_40'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_40))),
         'bulan_penimbangan_41'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_41))),
         'bulan_penimbangan_42'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_42))),
         'bulan_penimbangan_43'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_43))),
         'bulan_penimbangan_44'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_44))),
         'bulan_penimbangan_45'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_45))),
         'bulan_penimbangan_46'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_46))),
         'bulan_penimbangan_47'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_47))),
         'bulan_penimbangan_48'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_48))),
         'bulan_penimbangan_49'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_49))),
         'bulan_penimbangan_50'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_50))),
         'bulan_penimbangan_51'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_51))),
         'bulan_penimbangan_52'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_52))),
         'bulan_penimbangan_53'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_53))),
         'bulan_penimbangan_54'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_54))),
         'bulan_penimbangan_55'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_55))),
         'bulan_penimbangan_56'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_56))),
         'bulan_penimbangan_57'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_57))),
         'bulan_penimbangan_58'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_58))),
         'bulan_penimbangan_59'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_59))),
         'bulan_penimbangan_60'=> date('d-m-Y', strtotime(str_replace('-', '/', $data1->bulan_penimbangan_60))),

         'bb_0' => $data1->bb_0,
         'bb_1' => $data1->bb_1,
         'bb_2' => $data1->bb_2,
         'bb_3' => $data1->bb_3,
         'bb_4' => $data1->bb_4,
         'bb_5' => $data1->bb_5,
         'bb_6' => $data1->bb_6,
         'bb_7' => $data1->bb_7,
         'bb_8' => $data1->bb_8,
         'bb_9' => $data1->bb_9,
         'bb_10' => $data1->bb_10,
         'bb_11' => $data1->bb_11,
         'bb_12' => $data1->bb_12,
         'bb_13' => $data1->bb_13,
         'bb_14' => $data1->bb_14,
         'bb_15' => $data1->bb_15,
         'bb_16' => $data1->bb_16,
         'bb_17' => $data1->bb_17,
         'bb_18' => $data1->bb_18,
         'bb_19' => $data1->bb_19,
         'bb_20' => $data1->bb_20,
         'bb_21' => $data1->bb_21,
         'bb_22' => $data1->bb_22,
         'bb_23' => $data1->bb_23,
         'bb_24' => $data1->bb_24,
         'bb_25' => $data1->bb_25,
         'bb_26' => $data1->bb_26,
         'bb_27' => $data1->bb_27,
         'bb_28' => $data1->bb_28,
         'bb_29' => $data1->bb_29,
         'bb_30' => $data1->bb_30,
         'bb_31' => $data1->bb_31,
         'bb_32' => $data1->bb_32,
         'bb_33' => $data1->bb_33,
         'bb_34' => $data1->bb_34,
         'bb_35' => $data1->bb_35,
         'bb_36' => $data1->bb_36,
         'bb_37' => $data1->bb_37,
         'bb_38' => $data1->bb_38,
         'bb_39' => $data1->bb_39,
         'bb_40' => $data1->bb_40,
         'bb_41' => $data1->bb_41,
         'bb_42' => $data1->bb_42,
         'bb_43' => $data1->bb_43,
         'bb_44' => $data1->bb_44,
         'bb_45' => $data1->bb_45,
         'bb_46' => $data1->bb_46,
         'bb_47' => $data1->bb_47,
         'bb_48' => $data1->bb_48,
         'bb_49' => $data1->bb_49,
         'bb_50' => $data1->bb_50,
         'bb_51' => $data1->bb_51,
         'bb_52' => $data1->bb_52,
         'bb_53' => $data1->bb_53,
         'bb_54' => $data1->bb_54,
         'bb_55' => $data1->bb_55,
         'bb_56' => $data1->bb_56,
         'bb_57' => $data1->bb_57,
         'bb_58' => $data1->bb_58,
         'bb_59' => $data1->bb_59,
         'bb_60' => $data1->bb_60,
   
  
 'nt_0' => $data1->nt_0,
 'nt_1' => $data1->nt_1,
  'nt_2' => $data1->nt_2,
  'nt_3' => $data1->nt_3,
  'nt_4' => $data1->nt_4,
  'nt_5' => $data1->nt_5,
  'nt_6' => $data1->nt_6,
  'nt_7' => $data1->nt_7,
  'nt_8' => $data1->nt_8,
  'nt_9' => $data1->nt_9,
  'nt_10' => $data1->nt_10,
 'nt_11' => $data1->nt_11,
 'nt_12' => $data1->nt_12,
  'nt_13' => $data1->nt_13,
 'nt_14' => $data1->nt_14,
 'nt_15' => $data1->nt_15,
 'nt_16' => $data1->nt_16,
 'nt_17' => $data1->nt_17,
 'nt_18' => $data1->nt_18,
 'nt_19' => $data1->nt_19,
 'nt_20' => $data1->nt_20,
 'nt_21' => $data1->nt_21,
 'nt_22' => $data1->nt_22,
 'nt_23' => $data1->nt_23,
  'nt_24' => $data1->nt_24,
 'nt_25' => $data1->nt_25,
 'nt_26' => $data1->nt_26,
 'nt_27' => $data1->nt_27,
 'nt_28' => $data1->nt_28,
 'nt_29' => $data1->nt_29,
 'nt_30' => $data1->nt_30,
 'nt_31' => $data1->nt_31,
 'nt_32' => $data1->nt_32,
 'nt_33' => $data1->nt_33,
 'nt_34' => $data1->nt_34,
  'nt_35' => $data1->nt_35,
 'nt_36' => $data1->nt_36,
 'nt_37' => $data1->nt_37,
 'nt_38' => $data1->nt_38,
 'nt_39' => $data1->nt_39,
 'nt_40' => $data1->nt_40,
 'nt_41' => $data1->nt_41,
 'nt_42' => $data1->nt_42,
 'nt_43' => $data1->nt_43,
 'nt_44' => $data1->nt_44,
 'nt_45' => $data1->nt_45,
  'nt_46' => $data1->nt_46,
 'nt_47' => $data1->nt_47,
 'nt_48' => $data1->nt_48,
 'nt_49' => $data1->nt_49,
 'nt_50' => $data1->nt_50,
 'nt_51' => $data1->nt_51,
 'nt_52' => $data1->nt_52,
 'nt_53' => $data1->nt_53,
 'nt_54' => $data1->nt_54,
 'nt_55' => $data1->nt_55,
 'nt_56' => $data1->nt_56,
  'nt_57' => $data1->nt_57,
 'nt_58' => $data1->nt_58,
 'nt_59' => $data1->nt_59,
 'nt_60' => $data1->nt_60,
    
 'asi_eksklusif_0' => $data1->asi_eksklusif_0,
 'asi_eksklusif_1' => $data1->asi_eksklusif_1,
 'asi_eksklusif_2' => $data1->asi_eksklusif_2,
 'asi_eksklusif_3' => $data1->asi_eksklusif_3,
 'asi_eksklusif_4' => $data1->asi_eksklusif_4,
 'asi_eksklusif_5' => $data1->asi_eksklusif_5,
 'asi_eksklusif_6' => $data1->asi_eksklusif_6,
            
           
            'title' => 'Cetak Data KMS',
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
    public function update(Request $request, ModelsDatakms $datakms3, $id)
    {
        $data= $datakms3->find($id);
        $data->nik_ibu = $request->nik_ibu;
        $data->nama_ibu= $request->nama_ibu;
        $data->nama_anak= $request->nama_anak;
        $data->anak_ke= $request->anak_ke;
        $data->jenis_kelamin= $request->jenis_kelamin;
       
        $data->bulan_penimbangan_0 = $request->bulan_penimbangan_0;
        $data->bulan_penimbangan_1 = $request->bulan_penimbangan_1;
        $data->bulan_penimbangan_2 = $request->bulan_penimbangan_2;
        $data->bulan_penimbangan_3 = $request->bulan_penimbangan_3;
        $data->bulan_penimbangan_4 = $request->bulan_penimbangan_4;
        $data->bulan_penimbangan_5 = $request->bulan_penimbangan_5;
        $data->bulan_penimbangan_6 = $request->bulan_penimbangan_6;
        $data->bulan_penimbangan_7 = $request->bulan_penimbangan_7;
        $data->bulan_penimbangan_8 = $request-> bulan_penimbangan_8;
         $data->bulan_penimbangan_9 = $request->bulan_penimbangan_9;
        $data->bulan_penimbangan_10 = $request->bulan_penimbangan_10;
      $data->bulan_penimbangan_11 = $request->bulan_penimbangan_11;
      $data->bulan_penimbangan_12 = $request->bulan_penimbangan_12;
      $data->bulan_penimbangan_13 = $request->bulan_penimbangan_13;
      $data->bulan_penimbangan_14 = $request->bulan_penimbangan_14;
      $data->bulan_penimbangan_15 = $request->bulan_penimbangan_15;
      $data->bulan_penimbangan_16 = $request->bulan_penimbangan_16;
      $data->bulan_penimbangan_17 = $request->bulan_penimbangan_17;
      $data->bulan_penimbangan_18 = $request->bulan_penimbangan_18;
      $data->bulan_penimbangan_19 = $request->bulan_penimbangan_19;
      $data->bulan_penimbangan_20 = $request->bulan_penimbangan_20;
      $data->bulan_penimbangan_21 = $request->bulan_penimbangan_21;
      $data->bulan_penimbangan_22 = $request->bulan_penimbangan_22;
      $data->bulan_penimbangan_23 = $request->bulan_penimbangan_23;
      $data->bulan_penimbangan_24 = $request->bulan_penimbangan_24;
      $data->bulan_penimbangan_25 = $request->bulan_penimbangan_25;
      $data->bulan_penimbangan_26 = $request->bulan_penimbangan_26;
      $data->bulan_penimbangan_27 = $request->bulan_penimbangan_27;
      $data->bulan_penimbangan_28 = $request->bulan_penimbangan_28;
      $data->bulan_penimbangan_29 = $request->bulan_penimbangan_29;
      $data->bulan_penimbangan_30 = $request->bulan_penimbangan_30;
      $data->bulan_penimbangan_31 = $request->bulan_penimbangan_31;
      $data->bulan_penimbangan_32 = $request->bulan_penimbangan_32;
      $data->bulan_penimbangan_33 = $request->bulan_penimbangan_33;
      $data->bulan_penimbangan_34 = $request->bulan_penimbangan_34;
      $data->bulan_penimbangan_35 = $request->bulan_penimbangan_35;
      $data->bulan_penimbangan_36 = $request->bulan_penimbangan_36;
      $data->bulan_penimbangan_37 = $request->bulan_penimbangan_37;
      $data->bulan_penimbangan_38 = $request->bulan_penimbangan_38;
      $data->bulan_penimbangan_39 = $request->bulan_penimbangan_39;
      $data->bulan_penimbangan_40 = $request->bulan_penimbangan_40;
      $data->bulan_penimbangan_41 = $request->bulan_penimbangan_41;
      $data->bulan_penimbangan_42 = $request->bulan_penimbangan_42;
      $data->bulan_penimbangan_43 = $request->bulan_penimbangan_43;
      $data->bulan_penimbangan_44 = $request->bulan_penimbangan_44;
      $data->bulan_penimbangan_45 = $request->bulan_penimbangan_45;
      $data->bulan_penimbangan_46 = $request->bulan_penimbangan_46;
      $data->bulan_penimbangan_47 = $request->bulan_penimbangan_47;
      $data->bulan_penimbangan_48 = $request->bulan_penimbangan_48;
      $data->bulan_penimbangan_49 = $request->bulan_penimbangan_49;
      $data->bulan_penimbangan_50 = $request->bulan_penimbangan_50;
      $data->bulan_penimbangan_51 = $request->bulan_penimbangan_51;
      $data->bulan_penimbangan_52 = $request->bulan_penimbangan_52;
      $data->bulan_penimbangan_53 = $request->bulan_penimbangan_53;
      $data->bulan_penimbangan_54 = $request->bulan_penimbangan_54;
      $data->bulan_penimbangan_55 = $request->bulan_penimbangan_55;
      $data->bulan_penimbangan_56 = $request->bulan_penimbangan_56;
      $data->bulan_penimbangan_57 = $request->bulan_penimbangan_57;
      $data->bulan_penimbangan_58 = $request->bulan_penimbangan_58;
      $data->bulan_penimbangan_59 = $request->bulan_penimbangan_59;
      $data->bulan_penimbangan_60 = $request->bulan_penimbangan_60;

      $data->bb_0 = $request->bb_0;
      $data->bb_1 = $request->bb_1;
      $data->bb_2 = $request->bb_2;
      $data->bb_3 = $request->bb_3;
      $data->bb_4 = $request->bb_4;
      $data->bb_5 = $request->bb_5;
      $data->bb_6 = $request->bb_6;
      $data->bb_7 = $request->bb_7;
      $data->bb_8 = $request->bb_8;
      $data->bb_9 = $request->bb_9;
      $data->bb_10 = $request->bb_10;
      $data->bb_11 = $request->bb_11;
      $data->bb_12 = $request->bb_12;
      $data->bb_13 = $request->bb_13;
      $data->bb_14 = $request->bb_14;
      $data->bb_15 = $request->bb_15;
      $data->bb_16 = $request->bb_16;
      $data->bb_17 = $request->bb_17;
      $data->bb_18 = $request->bb_18;
      $data->bb_19 = $request->bb_19;
      $data->bb_20 = $request->bb_20;
      $data->bb_21 = $request->bb_21;
      $data->bb_22 = $request->bb_22;
      $data->bb_23 = $request->bb_23;
      $data->bb_24 = $request->bb_24;
      $data->bb_25 = $request->bb_25;
      $data->bb_26 = $request->bb_26;
      $data->bb_27 = $request->bb_27;
      $data->bb_28 = $request->bb_28;
      $data->bb_29 = $request->bb_29;
      $data->bb_30 = $request->bb_30;
      $data->bb_31 = $request->bb_31;
      $data->bb_32 = $request->bb_32;
      $data->bb_33 = $request->bb_33;
      $data->bb_34 = $request->bb_34;
      $data->bb_35 = $request->bb_35;
      $data->bb_36 = $request->bb_36;
      $data->bb_37 = $request->bb_37;
      $data->bb_38 = $request->bb_38;
      $data->bb_39 = $request->bb_39;
      $data->bb_40 = $request->bb_40;
      $data->bb_41 = $request->bb_41;
      $data->bb_42 = $request->bb_42;
      $data->bb_43 = $request->bb_43;
      $data->bb_44 = $request->bb_44;
      $data->bb_45 = $request->bb_45;
      $data->bb_46 = $request->bb_46;
      $data->bb_47 = $request->bb_47;
      $data->bb_48 = $request->bb_48;
      $data->bb_49 = $request->bb_49;
      $data->bb_50 = $request->bb_50;
      $data->bb_51 = $request->bb_51;
      $data->bb_52 = $request->bb_52;
      $data->bb_53 = $request->bb_53;
      $data->bb_54 = $request->bb_54;
      $data->bb_55 = $request->bb_55;
      $data->bb_56 = $request->bb_56;
      $data->bb_57 = $request->bb_57;
      $data->bb_58 = $request->bb_58;
      $data->bb_59 = $request->bb_59;
      $data->bb_60 = $request->bb_60;


$data->nt_0 = $request->nt_0;
$data->nt_1 = $request->nt_1;
$data->nt_2 = $request->nt_2;
$data->nt_3 = $request->nt_3;
$data->nt_4 = $request->nt_4;
$data->nt_5 = $request->nt_5;
$data->nt_6 = $request->nt_6;
$data->nt_7 = $request->nt_7;
$data->nt_8 = $request->nt_8;
$data->nt_9 = $request->nt_9;
$data->nt_10 = $request->nt_10;
$data->nt_11 = $request->nt_11;
$data->nt_12 = $request->nt_12;
$data->nt_13 = $request->nt_13;
$data->nt_14 = $request->nt_14;
$data->nt_15 = $request->nt_15;
$data->nt_16 = $request->nt_16;
$data->nt_17 = $request->nt_17;
$data->nt_18 = $request->nt_18;
$data->nt_19 = $request->nt_19;
$data->nt_20 = $request->nt_20;
$data->nt_21 = $request->nt_21;
$data->nt_22 = $request->nt_22;
$data->nt_23 = $request->nt_23;
$data->nt_24 = $request->nt_24;
$data->nt_25 = $request->nt_25;
$data->nt_26 = $request->nt_26;
$data->nt_27 = $request->nt_27;
$data->nt_28 = $request->nt_28;
$data->nt_29 = $request->nt_29;
$data->nt_30 = $request->nt_30;
$data->nt_31 = $request->nt_31;
$data->nt_32 = $request->nt_32;
$data->nt_33 = $request->nt_33;
$data->nt_34 = $request->nt_34;
$data->nt_35 = $request->nt_35;
$data->nt_36 = $request->nt_36;
$data->nt_37 = $request->nt_37;
$data->nt_38 = $request->nt_38;
$data->nt_39 = $request->nt_39;
$data->nt_40 = $request->nt_40;
$data->nt_41 = $request->nt_41;
$data->nt_42 = $request->nt_42;
$data->nt_43 = $request->nt_43;
$data->nt_44 = $request->nt_44;
$data->nt_45 = $request->nt_45;
$data->nt_46 = $request->nt_46;
$data->nt_47 = $request->nt_47;
$data->nt_48 = $request->nt_48;
$data->nt_49 = $request->nt_49;
$data->nt_50 = $request->nt_50;
$data->nt_51 = $request->nt_51;
$data->nt_52 = $request->nt_52;
$data->nt_53 = $request->nt_53;
$data->nt_54 = $request->nt_54;
$data->nt_55 = $request->nt_55;
$data->nt_56 = $request->nt_56;
$data->nt_57 = $request->nt_57;
$data->nt_58 = $request->nt_58;
$data->nt_59 = $request->nt_59;
$data->nt_60 = $request->nt_60;

$data->asi_eksklusif_0 = $request->kali_asis_eksklusif_0;
$data->asi_eksklusif_1 = $request->kali_asis_eksklusif_1;
$data->asi_eksklusif_2 = $request->kali_asis_eksklusif_2;
$data->asi_eksklusif_3 = $request->kali_asis_eksklusif_3;
$data->asi_eksklusif_4 = $request->kali_asis_eksklusif_4;
$data->asi_eksklusif_5 = $request->kali_asis_eksklusif_5;
$data->asi_eksklusif_6 = $request->kali_asis_eksklusif_6;
        $data->save();
        

        return redirect('datakms/'.$id)->with('msg','Data Berhasil Di Update');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(ModelsDatakms $datakms4, $id)
    {
        $data = $datakms4->find($id);
        $data->delete();
        return redirect('datakms')->with('msg','Data Berhasil Di Hapus');
    }
    public function tambahdatakms(HttpRequest $request){
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
   return view('form.tambahdatakms')->with([
        'dataorangtua1' => $dataOrangtua,
        'dataorangtua2' => $dataorangtu,
        'dataanak' => $dataanak,
        'dataanak1' => $dataanak1,
        'title' => 'Tambah Data KMS',
    
    ]);
    }
}
