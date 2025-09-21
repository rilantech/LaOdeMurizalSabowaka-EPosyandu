<?php

namespace App\Http\Controllers;

use App\Models\Chatting;
use App\Models\Daftarakunibu;
use App\Models\Daftarakunpetugas;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Http\Request;
use Illuminate\Database\Eloquent\Builder;
use Illuminate\Support\Facades\DB;

class ChattingController extends Controller
{
//   public String $pilih_akun= "";
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {

        $chatting = array();
        $akun = array();
        $pilih_akun = $request->pilih_akun;
        $search = $request->query('search');
        
        if($pilih_akun == 'Petugas_Posyandu'){
            $akun = Daftarakunpetugas::where('tabel_akun_petugas.nama','like','%'.$search.'%')->get();
        }

        if($pilih_akun == 'Ibu_Posyandu'){
            $akun = Daftarakunibu::where('tabel_akun_ibu.nama','like','%'.$search.'%')->get();
        }
      
        // $Chatting = Chatting::where('tabel_chatting.nomor_hp_pengirim', $akunIbu->nomor_hp)->latest()->get();
        return view('tabel.halamanchatting',[
            'title' => 'Chatting',
             'akunibu'=> $akun,
             'pilihanakun' => false,
             'nama' => 'Nama',
             'nomor_hp' => 'Nomor HP',
             'id' => '',
             'pilihanakun' => $pilih_akun,
             'chatting' => $chatting,
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
    // public function store(HttpRequest $request)
    // {
    
    //     $chatting12 =new Chatting();
    //     $chatting12->nomor_hp_pengirim = '123';
    //     $chatting12->nomor_hp_penerima = $request->nomor_hp_penerima;
    //     $chatting12->isi_pesan= $request->isi_pesan;
    //     $chatting12->waktu_kirim = '04:00';

    //     $chatting12->save();
      
    //     return exit();
    // }

    /**
     * Display the specified resource.
     */
    // public function show(Daftarakunibu $daftarakunibu1, $id)
    // {
    //     $data = $daftarakunibu1->find($id);
    //     $Chatting =array();
    //     $akunIbu = Daftarakunibu::latest()->get();
    //     $status = Chatting::where('tabel_chatting.nomor_hp_penerima', $data->nomor_hp)->
    //     orwhere('tabel_chatting.nomor_hp_pengirim', $data->nomor_hp)->first();

    //     if($status == true){
    //     $Chatting = Chatting::where('tabel_chatting.nomor_hp_pengirim', $data->nomor_hp)->
    //     orwhere('tabel_chatting.nomor_hp_penerima', $data->nomor_hp)->get();
    //     }
       
    //     return view('tabel.halamanchatting')->with([
    //         'id' => $id,
    //         'nama' => $data->nama,
    //         'akunibu'=> $akunIbu,
    //         'pilihanakun' => 'true',
    //         'nomor_hp' => $data->nomor_hp,
    //         'title' => 'Chatting',
    //         'chatting' => $Chatting
    //     ]);
    // }

     public function show(Request $request, $id)
    {
        $pilih_akun = $request->pilih_akun;
        $Chatting =array();
        $status_refresh = false;
        $search = $request->search;
        // $akunIbu = Daftarakunpetugas::latest()->get();
        // $status = Chatting::where('tabel_chatting.nomor_hp_penerima', $data->nomor_hp)->
        // orwhere('tabel_chatting.nomor_hp_pengirim', $data->nomor_hp)->first();

        // if($status == true){
        // $Chatting = Chatting::where('tabel_chatting.nomor_hp_pengirim', $data->nomor_hp)->
        // orwhere('tabel_chatting.nomor_hp_penerima', $data->nomor_hp)->get();
        // }

        $akun = array(); 
        $data = array();
        $dt2 = "";
        $dt3="";
        $nama = "";
        $nomor_hp ="";
       
            if($pilih_akun == "Petugas_Posyandu"){
            $daftarakunpetugas1 = new Daftarakunpetugas(); 
            $data = $daftarakunpetugas1->find($id);
            $nama = $data->nama;
            $nomor_hp = $data->nomor_hp;
            $akun = Daftarakunpetugas::latest()->get();

            $Chatting  = DB::table('tabel_chatting')
            ->whereIn('nomor_hp_penerima', [$data->nomor_hp, '081119009287'])         
            ->whereIn('nomor_hp_pengirim', [$data->nomor_hp, '081119009287']) 
            ->latest()
            ->get();
            
            $refresh = Chatting::where('created_at', '>=', now()->subMinutes(1))->count();

        }


        if($pilih_akun == "Ibu_Posyandu"){
            $daftarakunibu1 = new Daftarakunibu(); 
            $data = $daftarakunibu1->find($id);
            $nama = $data->nama;
            $nomor_hp = $data->nomor_hp;
            $akun = Daftarakunibu::latest()->get();

            $Chatting  = DB::table('tabel_chatting')
            ->whereIn('nomor_hp_penerima', [$data->nomor_hp, '081119009287'])         
            ->whereIn('nomor_hp_pengirim', [$data->nomor_hp, '081119009287']) 
            ->latest()
            ->get();
            
             $refresh = Chatting::where('created_at', '>=', now()->subMinutes(1))->count();
             
             if($refresh > 0){
                 $status_refresh = true;
             }


            // foreach ($data as $data2) {
            //     $dt2 = $data2['nama'];
            //     $dt3 = $data2['nomor_hp'];
            // }
        }
        
        return view('tabel.halamanchatting')->with([
            'id' => $id,
            'nama' => $nama,
            'pilihanakun' => 'true',
            'nomor_hp' => $nomor_hp,
            'title' => 'Chatting',
            'chatting' => $Chatting,
            'akunibu' => $akun,
            'pilihanakun' => $pilih_akun,
            'refresh' => $status_refresh,
            'search' => $search
         
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
    public function update(Request $request, $id)
    {
            $date = date('d-m-Y / H:i', time());
            $chatting12 =new Chatting();
            $chatting12->nomor_hp_pengirim = '081119009287';
            $chatting12->nomor_hp_penerima = $request->nomor_hp_penerima;
            $chatting12->id_pengirim = 6;
            $chatting12->posisi_pengirim = 'admin';
            $chatting12->isi_pesan= $request->isi_pesan;
            $chatting12->waktu_kirim = $date;
    
            $chatting12->save();
          
            return redirect('chatting/'.$id.'?pilih_akun='.$request->pilihan_akun)->with('msg','Data Berhasil Di Update');
        
    
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
