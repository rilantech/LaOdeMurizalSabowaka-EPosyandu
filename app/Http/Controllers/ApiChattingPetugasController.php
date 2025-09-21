<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Models\Chatting;
use App\Models\Daftarakunibu;
use App\Models\Daftarakunpetugas;
use App\Models\Datakms;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Database\Eloquent\Builder;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class ApiChattingPetugasController extends Controller
{
   
    /**
     * Display a listing of the resource.
     */
 
        public function index(Request $request)
        {
            $data = Daftarakunpetugas::latest()->get();
            
            return response()->json([
                                'chatting' => $data
            ]);                  
           
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create(Request $request)
    {
        $search = $request->data;
    
            $data3  = DB::table('tabel_akun_petugas') 
            ->where('nama', 'like','%'.$search.'%')
            ->latest()
            ->get();
     
        // $search = $request->data;
        // $data3  = DB::table('tabel_data_imunisasi_anak') 
        // ->where('nama_anak', 'like','%'.$search.'%')
        // ->latest()
        // ->get();
   
    return response()->json([
                        'akun_petugas' => $data3
                    ]                   
      );
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
    
        $date = date('d-m-Y / H:i', time());
        $chatting12 =new Chatting();
        $chatting12->nomor_hp_pengirim = $request->nomor_hp_pengirim;
        $chatting12->nomor_hp_penerima = $request->nomor_hp_penerima;
        $chatting12->isi_pesan= $request->isi_pesan;
        $chatting12->waktu_kirim = $date;

        $chatting12->save();
      
        return response()->json([
            'status' => 'berhasil'
    ]);
    }

    /**
     * Display the specified resource.
     */
    public function show(Request $request, $id)
    {

        $daftarakunibu1 = new Daftarakunibu(); 
        $data = $daftarakunibu1->find($id);

        $Chatting  = DB::table('tabel_chatting')
        ->whereIn('nomor_hp_penerima', [$data->nomor_hp, $request->nomor_hp])         ->whereIn('nomor_hp_pengirim', [$data->nomor_hp, $request->nomor_hp]) 
        ->get();
        // ->where('nomor_hp_pengirim', $data->nomor_hp)
        
        // ->or
       
        // ->where('nomor_hp_penerima', $request->nomor_hp)

        // $search = $request->data;
        // $nik_ibu = $request->nik_ibu;

        // if($nik_ibu == null){
        //     $data3  = DB::table('tabel_data_imunisasi_anak') 
        //     ->where('nama_anak', 'like','%'.$search.'%')
        //     ->get();
        // } else{
        //     $data3  = DB::table('tabel_data_imunisasi_anak') 
        //     ->where('nama_anak', 'like','%'.$search.'%')
        //     ->where('nik_ibu', $nik_ibu)
        //     ->get();
        // }


        // $akunIbu = Daftarakunibu::latest()->get();
        // $status = Chatting::where('tabel_chatting.nomor_hp_penerima', $data->nomor_hp)->
        // orwhere('tabel_chatting.nomor_hp_pengirim', $data->nomor_hp)->first();

        // if($status == true){
        // $Chatting = Chatting::where('tabel_chatting.nomor_hp_pengirim', $data->nomor_hp)->
        // orwhere('tabel_chatting.nomor_hp_penerima', $data->nomor_hp)->get();
       

       
        return response()->json([
            // 'id' => $id,
            // 'nama' => $data->nama,
            // 'akunibu'=> $akunIbu,
            // 'pilihanakun' => 'true',
            // 'nomor_hp' => $data->nomor_hp,
            // 'title' => 'Chatting',
            'detailchatting2' => $Chatting
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
    // public function update(HttpRequest $request, string $id)
    // {
    //         $date = date('d-m-Y / H:i', time());
    //         $chatting12 =new Chatting();
    //         $chatting12->nomor_hp_pengirim = '123';
    //         $chatting12->nomor_hp_penerima = $request->nomor_hp_penerima;
    //         $chatting12->isi_pesan= $request->isi_pesan;
    //         $chatting12->waktu_kirim = $date;
    
    //         $chatting12->save();
          
    //         return redirect('chatting/'.$id)->with('msg','Data Berhasil Di Update');
        
    
    // }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
