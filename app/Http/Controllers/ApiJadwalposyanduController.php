<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Jadwalposyandu;
use Illuminate\Http\Request;
use Illuminate\Http\Response as HttpResponse;


class ApiJadwalposyanduController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    { 
        try{
       
            $jadwalPosyandu = Jadwalposyandu::latest()->get();
           
        
                    return response()->json([
                        'jadwalposyandu' => $jadwalPosyandu
                       
                    ], HttpResponse::HTTP_OK);
                
    
        } catch (QueryException $e){
            $error = [
                'error' => $e-> getMessage()
            ];
            return response()->json($error, 
            HttpResponse::HTTP_INTERNAL_SERVER_ERROR);
        }
    }
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
