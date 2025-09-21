<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Chatting;
use App\Models\Catatankesehatanibuhamil;
use App\Models\Datakesehatanibunifas;
use App\Models\Datakms;
use App\Models\Dataanak;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;
use Illuminate\Support\Facades\DB;


class ApiNotifikasiChattingController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    { 
       
        $time = date('Y-m-d H:i:s', time());
        
        $chatting = Chatting::latest()->get();
                    
                  
        if($chatting->count() > 0){
            foreach ($chatting as $data) {
                $waktu_kirim = $data->created_at;
                $nomor_hp_pengirim = $data->nomor_hp_pengirim;
                $nomor_hp_penerima = $data->nomor_hp_penerima;
                // $id_pengirim = $data['id_pengirim'];
                // $posisi_pengirim = $data['posisi_pengirim'];
                
                if($time == $waktu_kirim){
                    $status_notifikasi = 'aktif';
                    return response()->json([
                        'status_notifikasi' => $status_notifikasi,
                        'nomor_hp_pengirim' => $nomor_hp_pengirim,
                        'nomor_hp_penerima' => $nomor_hp_penerima
                       
                    ]                   
      );
        
                } 
                     
                
             
            }
        
           }else{
                $status_notifikasi = 'nonaktif';
                     return response()->json([
                        
                        'status_notifikasi' => $status_notifikasi,
                       
                    ] );
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
