<?php

namespace App\Http\Controllers;
use App\Http\Requests\TambahAkunPetugasRequest;
use App\Models\Daftarakunibu;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class DaftarakunibuController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');

        if(!empty($search)){
            $akunIbu = Daftarakunibu::where('tabel_akun_ibu.id','like','%'.$search.'%')
           ->orwhere('tabel_akun_ibu.nama','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            $akunIbu = Daftarakunibu::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamandaftarakunibu',[
            'title' => 'Daftar Akun Ibu',
            'akunibu' => $akunIbu,
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
    public function store(TambahAkunPetugasRequest $request)
    {
        $validate = $request->validated();
        $daftarakunpetugas =new Daftarakunibu();
        $daftarakunpetugas->nama = $request->nama;
        $daftarakunpetugas->nik_ibu = $request->nik;
        $daftarakunpetugas->username = $request->username;
        $daftarakunpetugas->password= $request->password;
        $daftarakunpetugas->alamat = $request->alamat;
        $daftarakunpetugas->nomor_hp = $request->nomor_hp;

        $daftarakunpetugas->save();
      
        return redirect('daftarakunibu')->with('msg','Data Berhasil Di Tambahkan');
    }

    /**
     * Display the specified resource.
     */
    public function show(Daftarakunibu $daftarakunibu1, $id)
    {
        $data = $daftarakunibu1->find($id);
       
        return view('form.editakunibu')->with([
            'id' => $id,
            'nama' => $data->nama,
            'nik' => $data->nik_ibu,
            'username' => $data->username,
            'password' => $data->password,
            'alamat' => $data->alamat,
            'nomor_hp' => $data->nomor_hp,
            'title' => 'Edit Akun Ibu',
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
    public function update(TambahAkunPetugasRequest $request, Daftarakunibu $daftarakunibu3, $id)
    {
        //
        $data= $daftarakunibu3->find($id);
        $data->nama = $request->nama;
     $data->nik_ibu = $request->nik;
        $data->username = $request->username;
        $data->password = $request->password;
        $data->alamat = $request->alamat;
        $data->nomor_hp = $request->nomor_hp;
        $data->save();

        return redirect('daftarakunibu')->with('msg','Data Berhasil Di Update');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Daftarakunibu $daftarakunibu4, $id)
    {
        $data = $daftarakunibu4->find($id);
        $data->delete();
        return redirect('daftarakunibu')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahakunibu(){
      
        return view('form.tambahakunibu')->with([
        'title' => 'Tambah Akun Ibu'
        
        
    ]);
}

public function tentangaplikasi(){
      
    return view('form.tentangaplikasi')->with([
    'title' => 'Tentang Aplikasi'
    
    
]);
}
}
