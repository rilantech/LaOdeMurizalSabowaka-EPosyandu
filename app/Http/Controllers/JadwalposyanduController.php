<?php

namespace App\Http\Controllers;

use App\Http\Requests\TambahJadwalPosyanduRequest;
use App\Models\Jadwalposyandu;
use Illuminate\Http\Request as HttpRequest;


class JadwalposyanduController extends Controller
{
    /**
     * Display a listing of the resource.
     */
        public function index(HttpRequest $request)
        {
            $search = $request->query('search');
    
            if(!empty($search)){
                $jadwalPosyandu = Jadwalposyandu::where('tabel_jadwal_posyandu.id','like','%'.$search.'%')
               ->orwhere('tabel_jadwal_posyandu.agenda','like','%'.$search.'%')
               ->paginate(10)->onEachSide(2)->fragment('srv');
            }else{
                $jadwalPosyandu = Jadwalposyandu::latest()->paginate(10)->onEachSide(2)->fragment('srv');
            }
            return view('tabel.halamanjadwalposyandu',[
                'title' => 'JadwalPosyandu',
                'jadwalposyandu' => $jadwalPosyandu,
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
    public function store(TambahJadwalPosyanduRequest $request)
    {
        $validate = $request->validated();
        $date = date('Y-m-d H:i:s', time());
        $jadwalposyandu =new Jadwalposyandu;
        $jadwalposyandu->waktu_post =  $date;
        $jadwalposyandu->agenda = $request->agenda;
        $jadwalposyandu->tanggal= $request->tanggal;
        $jadwalposyandu->jam = $request->jam;
       
        $jadwalposyandu->save();
      
        return redirect('jadwalposyandu')->with('msg','Data Berhasil Di Tambahkan');
    }

    /**
     * Display the specified resource.
     */
    public function show(Jadwalposyandu $jadwalposyandu1, $id)
    {
        $data = $jadwalposyandu1->find($id);
       
        return view('form.editjadwalposyandu')->with([
            'id' => $id,
            'waktu_post' => $data->waktu_post,
            'agenda' => $data->agenda,
            'tanggal' => $data->tanggal,
            'jam' => $data->jam,
            'title' => 'Edit Data Pengaduan',
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
    public function update(TambahJadwalPosyanduRequest $request, Jadwalposyandu $jadwalposyandu3, $id)
    {
        //
        $data= $jadwalposyandu3->find($id);
        $data->waktu_post = $request->waktu_post;
        $data->tanggal = $request->tanggal;
        $data->jam = $request->jam;
       
        $data->save();

        return redirect('jadwalposyandu')->with('msg','Data Berhasil Di Update');
    }


    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Jadwalposyandu $jadwalposyandu4, $id)
    {
        $data = $jadwalposyandu4->find($id);
        $data->delete();
        return redirect('jadwalposyandu')->with('msg','Data Berhasil Di Hapus');
    }


    public function tambahjadwalposyandu(){
      
        return view('form.tambahjadwalposyandu')->with([
        'title' => 'Tambah Jadwal Posyandu'
        
        
    ]);
}
}
