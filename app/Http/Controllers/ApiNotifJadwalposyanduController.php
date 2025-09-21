<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;


class ApiNotifJadwalposyanduController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    { 
       
        $time = date('Y-m-d H:i:s', time());
       
       try{
            $jadwalPosyandu = Jadwalposyandu::latest()->get();
           
           if($jadwalPosyandu->count() > 0){
               foreach ($jadwalPosyandu as $data) {
                $waktu_post = $data['waktu_post'];
                $agenda = $data['agenda'];
                $tanggal = $data['tanggal'];
                $jam = $data['jam'];
            
              $waktuselisih = date('Y-m-d H:i:s', strtotime($waktu_post.'+10 second'));
                if($time == $waktuselisih){
                    $status_notifikasi = 'aktif';
                    return response()->json([
                        'status_notifikasi' => $status_notifikasi,
                        'waktu_post' => $waktu_post,
                        'agenda' => $agenda,
                        'tanggal' => $tanggal,
                        'jam' => $jam
                    ],
 HttpResponse::HTTP_OK);                 
     
        
                } 
                     
                
             
            }
        
           }
       }
      catch (QueryException $e){
            $error = [
                'error' => $e-> getMessage()
            ];
            return response()->json($error, 
            HttpResponse::HTTP_INTERNAL_SERVER_ERROR);
        }
        
        
        // else{
        //         $status_notifikasi = 'nonaktif';
        //              return response()->json([
                        
        //                 'status_notifikasi' => $status_notifikasi,
                       
        //             ] );
        //   }   
            
      
        
        
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
