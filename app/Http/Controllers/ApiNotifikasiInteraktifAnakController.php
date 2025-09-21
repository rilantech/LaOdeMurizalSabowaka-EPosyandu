<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Catatankesehatanibuhamil;
use App\Models\Datakesehatanibunifas;
use App\Models\Datakms;
use App\Models\Dataanak;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiNotifikasiInteraktifAnakController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Datakms $datakms)
    { 
       
        $time = date('Y-m-d H:i:s', time());
        
        try{
        $bulan_penimbangan_0 = "";
        $bulan_penimbangan_3 = "";
      
           $datakms2 = DB::table('datakms') 
                    ->where('updated_at', $time)
                    ->get();
                    
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
                            $status_notifikasi = 'notif_nol_tiga';
                            return response()->json([
                            'status_notifikasi' => $status_notifikasi,
                            'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            }
                            
                          if($datakms2->count() > 0 && $bulan_penimbangan_3 != "" && $bulan_penimbangan_0 != "" && $bulan_penimbangan_1 != "" && $bulan_penimbangan_4 == null && $bulan_penimbangan_6 == null  
                          && $bulan_penimbangan_7 == null && $bulan_penimbangan_9 == null && $bulan_penimbangan_10 == null && $bulan_penimbangan_12 == null && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null
                                && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             $status_notifikasi = 'notif_tiga_enam';
                             return response()->json([
                             'status_notifikasi' => $status_notifikasi,
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                          if($datakms2->count() > 0 && $bulan_penimbangan_6 != "" && $bulan_penimbangan_3 != "" && $bulan_penimbangan_4 != "" && $bulan_penimbangan_7 == null && $bulan_penimbangan_9 == null
                          && $bulan_penimbangan_10 == null && $bulan_penimbangan_12 == null && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null
                                && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             $status_notifikasi = 'notif_enam_sembilan';
                             return response()->json([
                             'status_notifikasi' => $status_notifikasi,
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                            
                          if($datakms2->count() > 0 && $bulan_penimbangan_9 != "" && $bulan_penimbangan_6 != "" && $bulan_penimbangan_7 != "" && $bulan_penimbangan_10 == null  && $bulan_penimbangan_12 == null && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null
                                && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             $status_notifikasi = 'notif_sembilan_duabelas';
                             return response()->json([
                             'status_notifikasi' => $status_notifikasi,
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
            
                        if($datakms2->count() > 0 && $bulan_penimbangan_12 != "" && $bulan_penimbangan_9 != "" && $bulan_penimbangan_10 != "" && $bulan_penimbangan_22 == null && $bulan_penimbangan_24 == null  && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             $status_notifikasi = 'notif_satu_duatahun';
                             return response()->json([
                             'status_notifikasi' => $status_notifikasi,
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                            
                        if($datakms2->count() > 0 && $bulan_penimbangan_24 != "" && $bulan_penimbangan_12 != "" && $bulan_penimbangan_22 != "" && $bulan_penimbangan_34 == null && $bulan_penimbangan_36 == null){
                             $status_notifikasi = 'notif_dua_tigatahun';
                             return response()->json([
                             'status_notifikasi' => $status_notifikasi,
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
                            
                        if($datakms2->count() > 0 && $bulan_penimbangan_36 != "" && $bulan_penimbangan_24 != "" && $bulan_penimbangan_34 != ""){
                             $status_notifikasi = 'notif_tiga_limatahun';
                             return response()->json([
                             'status_notifikasi' => $status_notifikasi,
                             'nama_anak' => $nama_anak
                            ], HttpResponse::HTTP_OK);
                            } 
            
            
                   
                                }
        }catch (QueryException $e){
            $error = [
                'error' => $e-> getMessage()
            ];
            return response()->json($error, 
            HttpResponse::HTTP_INTERNAL_SERVER_ERROR);
        }
                    
           
           
    //         foreach ($notif_bulan_0 as $data) {
    //             $waktu_post = $data['updated_at'];
    //             // $agenda = $data['agenda'];
    //             // $tanggal = $data['tanggal'];
    //             // $jam = $data['jam'];
            
    //           $waktuselisih = date('Y-m-d H:i:s', strtotime($waktu_post.'+2 second'));
    //             if($time == $waktuselisih){
    //                 $status_notifikasi = 'aktif';
    //                 return response()->json([
    //                     'status_notifikasi' => $status_notifikasi,
    //                     'waktu_post' => $waktu_post
    //                     // ,
    //                     // 'agenda' => $agenda,
    //                     // 'tanggal' => $tanggal,
    //                     // 'jam' => $jam
    //                 ]                   
    //   );
        
    //             }
             
    //         }
         
            
       
            
            
        
      
        
        
}
        //
//         try{
//             $jadwalposyandu = Jadwalposyandu::latest()->get();
//             return response()->json([
//                 'jadwalposyandu' => $jadwalposyandu
//             ]
                
//             ,
//  HttpResponse::HTTP_OK);
//         } catch (QueryException $e){
//             $error = [
//                 'error' => $e-> getMessage()
//             ];
//             return response()->json($error, 
//             HttpResponse::HTTP_INTERNAL_SERVER_ERROR);
//         }
//         $search = $request->query('search');

    
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
