<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Catatankesehatanibuhamil;
use App\Models\Jadwalposyandu;
use App\Models\Datakms;
use App\Models\Datakesehatanibunifas;
use App\Models\Datakesehatanibubersalin;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiSemuaNotifController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    { 
       

        
        try{
            $time = date('Y-m-d H:i:s', time());
            $jadwalPosyandu = Jadwalposyandu::latest()->get();
            $catatankesehatanibuhamil = Catatankesehatanibuhamil::latest()->get();
            $datakesehatanibunifas =  Datakesehatanibunifas::latest()->get();
            $datakesehatanibubersalin =  Datakesehatanibubersalin::latest()->get();
            $datakms2 = DB::table('datakms') 
                    ->where('updated_at', $time)
                    ->get();
            
           if($jadwalPosyandu->count() > 0){
               foreach ($jadwalPosyandu as $data) {
                $waktu_post1 = $data['waktu_post'];
                $agenda = $data['agenda'];
                $tanggal = $data['tanggal'];
                $jam = $data['jam'];
            
              $waktuselisih1 = date('Y-m-d H:i:s', strtotime($waktu_post1.'+10 second'));
                if($time == $waktuselisih1){
                    return response()->json([
                        'notif' => 'notif_jadwal_posyandu',
                        'waktu_post' => $waktu_post1,
                        'agenda' => $agenda,
                        'tanggal' => $tanggal,
                        'jam' => $jam
                    ],
 HttpResponse::HTTP_OK);                 
     
        
                } 
                     
                
             
            }
        
           }
           
            if($catatankesehatanibuhamil->count() > 0){
                $time2 = date('Y-m-d H:i:s', time());
                 foreach ($catatankesehatanibuhamil as $data2) {
                $waktu_post2 = $data2['created_at'];
                // $agenda = $data['agenda'];
                // $tanggal = $data['tanggal'];
                // $jam = $data['jam'];
            
              $waktuselisih2 = date('Y-m-d H:i:s', strtotime($waktu_post2.'+10 second'));
                if($time2 == $waktuselisih2){
                    return response()->json([
                       'notif' => 'notif_kesehatan_ibu_hamil',
                        'waktu_post' => $waktu_post2
                        // ,
                        // 'agenda' => $agenda,
                        // 'tanggal' => $tanggal,
                        // 'jam' => $jam
                    ],HttpResponse::HTTP_OK);
        
                }
             
            }
            }
            
            if($datakesehatanibunifas->count() > 0){
              foreach ($datakesehatanibunifas as $data3) {
                $waktu_post3 = $data3['created_at'];
                // $agenda = $data['agenda'];
                // $tanggal = $data['tanggal'];
                // $jam = $data['jam'];
            
              $waktuselisih3 = date('Y-m-d H:i:s', strtotime($waktu_post3.'+10 second'));
                if($time == $waktuselisih3){
                    return response()->json([
                        'notif' => 'notif_kesehatan_ibu_nifas',
                        'waktu_post' => $waktu_post3
                        // ,
                        // 'agenda' => $agenda,
                        // 'tanggal' => $tanggal,
                        // 'jam' => $jam
                    ],HttpResponse::HTTP_OK);
        
                }
             
            }
            }
            
             if($datakesehatanibubersalin->count() > 0){
              foreach ($datakesehatanibubersalin as $data4) {
                $waktu_post4 = $data4['created_at'];
                // $agenda = $data['agenda'];
                // $tanggal = $data['tanggal'];
                // $jam = $data['jam'];
            
              $waktuselisih4 = date('Y-m-d H:i:s', strtotime($waktu_post4.'+10 second'));
                if($time == $waktuselisih4){
                    return response()->json([
                        'notif' => 'notif_kesehatan_ibu_bersalin',
                        'waktu_post' => $waktu_post4
                        // ,
                        // 'agenda' => $agenda,
                        // 'tanggal' => $tanggal,
                        // 'jam' => $jam
                    ],HttpResponse::HTTP_OK);
        
                }
             
            }
            }
       
                    
                    foreach($datakms2 as $item){
                        
                        $bulan_penimbangan_0 = $item->bulan_penimbangan_0;
                        $bulan_penimbangan_1 = $item->bulan_penimbangan_1;
                        $bulan_penimbangan_3 = $item->bulan_penimbangan_3;
                        $bulan_penimbangan_4 = $item->bulan_penimbangan_4;
                        $bulan_penimbangan_6 = $item->bulan_penimbangan_6;
                        $bulan_penimbangan_7 = $item->bulan_penimbangan_7;
                        $bulan_penimbangan_9 = $item->bulan_penimbangan_9;
                        $bulan_penimbangan_10 = $item->bulan_penimbangan_10;
                        $bulan_penimbangan_12 = $item->bulan_penimbangan_12;
                        $bulan_penimbangan_22 = $item->bulan_penimbangan_22;
                        $bulan_penimbangan_24 = $item->bulan_penimbangan_24;
                        $bulan_penimbangan_34 = $item->bulan_penimbangan_34;
                        $bulan_penimbangan_36 = $item->bulan_penimbangan_36;
                        $nama_anak = $item->nama_anak;
    
                        
                          if($datakms2->count() > 0 && $bulan_penimbangan_0 != "" && $bulan_penimbangan_1 == null && $bulan_penimbangan_3 == null && $bulan_penimbangan_4 == null && $bulan_penimbangan_6 == null
                                && $bulan_penimbangan_7 == null && $bulan_penimbangan_9 == null && $bulan_penimbangan_10 == null && $bulan_penimbangan_12 == null && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null
                                && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                            return response()->json([
                            'notif' => 'notif_kesehatan_anak_nol_tiga',
                            'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            }
                            
                          if($datakms2->count() > 0 && $bulan_penimbangan_3 != "" && $bulan_penimbangan_0 != "" && $bulan_penimbangan_1 != "" && $bulan_penimbangan_4 == null && $bulan_penimbangan_6 == null  
                          && $bulan_penimbangan_7 == null && $bulan_penimbangan_9 == null && $bulan_penimbangan_10 == null && $bulan_penimbangan_12 == null && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null
                                && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             return response()->json([
                             'notif' => 'notif_kesehatan_anak_tiga_enam',
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                          if($datakms2->count() > 0 && $bulan_penimbangan_6 != "" && $bulan_penimbangan_3 != "" && $bulan_penimbangan_4 != "" && $bulan_penimbangan_7 == null && $bulan_penimbangan_9 == null
                          && $bulan_penimbangan_10 == null && $bulan_penimbangan_12 == null && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null
                                && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             return response()->json([
                            'notif' => 'notif_kesehatan_anak_enam_sembilan',
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                            
                          if($datakms2->count() > 0 && $bulan_penimbangan_9 != "" && $bulan_penimbangan_6 != "" && $bulan_penimbangan_7 != "" && $bulan_penimbangan_10 == null  && $bulan_penimbangan_12 == null && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null
                                && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             return response()->json([
                             'notif' => 'notif_kesehatan_anak_sembilan_duabelas',
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
            
                        if($datakms2->count() > 0 && $bulan_penimbangan_12 != "" && $bulan_penimbangan_9 != "" && $bulan_penimbangan_10 != "" && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null  && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             return response()->json([
                            'notif' => 'notif_kesehatan_anak_satu_duatahun',
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                            
                        if($datakms2->count() > 0 && $bulan_penimbangan_24 != "" && $bulan_penimbangan_12 != "" && $bulan_penimbangan_22 != "" && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             return response()->json([
                             'notif' => 'notif_kesehatan_anak_dua_tigatahun',
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                        if($datakms2->count() > 0 && $bulan_penimbangan_36 != "" && $bulan_penimbangan_24 != "" && $bulan_penimbangan_34 != ""){
                             return response()->json([
                            'notif' => 'notif_kesehatan_anak_tiga_limatahun',
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
            
            
                    }
    } catch (QueryException $e){
            $error = [
                'error' => $e-> getMessage()
            ];
            return response()->json($error, 
            HttpResponse::HTTP_INTERNAL_SERVER_ERROR);
        }
                
           
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
     
        $search = $request->data;

            $jadwalPosyandu = Jadwalposyandu::where('tabel_jadwal_posyandu.id','like','%'.$search.'%')
           ->orwhere('tabel_jadwal_posyandu.agenda','like','%'.$search.'%')->get();
       
        
        return response()->json([
                            'jadwalposyandu' => $jadwalPosyandu
                        ]                   
          );
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
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
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
