<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;

use App\Http\Requests\TambahAkunPetugasRequest;
use App\Models\Daftarakunpetugas;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;

class ApiDaftarakunpetugasController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');

        if(!empty($search)){
            $akunPetugas = Daftarakunpetugas::where('tabel_akun_petugas.id','like','%'.$search.'%')
           ->orwhere('tabel_akun_petugas.nama','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            $akunPetugas = Daftarakunpetugas::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamandaftarakunpetugas',[
            'title' => 'Daftar Akun Petugas',
            'akunpetugas' => $akunPetugas,
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
        $daftarakunpetugas =new Daftarakunpetugas();
        $daftarakunpetugas->nama = $request->nama;
        $daftarakunpetugas->username = $request->username;
        $daftarakunpetugas->password= $request->password;
        $daftarakunpetugas->alamat = $request->alamat;
        $daftarakunpetugas->nomor_hp = $request->nomor_hp;

        $daftarakunpetugas->save();

        return response()->json([
            'status' => 'berhasil'
    ]);
      
       
    }

    /**
     * Display the specified resource.
     */
    public function show(Daftarakunpetugas $daftarakunpetugas1, $id)
    {
        $data = $daftarakunpetugas1->find($id);
       
        return view('form.editakunpetugas')->with([
            'id' => $id,
            'nama' => $data->nama,
            'username' => $data->username,
            'password' => $data->password,
            'alamat' => $data->alamat,
            'nomor_hp' => $data->nomor_hp,
            'title' => 'Edit Akun Petugas',
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
    public function update(TambahAkunPetugasRequest $request, Daftarakunpetugas $daftarakunpetugas3, $id)
    {
        //
        $data= $daftarakunpetugas3->find($id);
        $data->nama = $request->nama;
        $data->username = $request->username;
        $data->password = $request->password;
        $data->alamat = $request->alamat;
        $data->nomor_hp = $request->nomor_hp;
        $data->save();

        return redirect('daftarakunpetugas')->with('msg','Data Berhasil Di Update');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Daftarakunpetugas $daftarakunpetugas4, $id)
    {
        $data = $daftarakunpetugas4->find($id);
        $data->delete();
        return redirect('daftarakunpetugas')->with('msg','Data Berhasil Di Hapus');
    }

    public function tambahakunpetugas(){
      
        return view('form.tambahakunpetugas')->with([
        'title' => 'Tambah Akun Petugas'
        
        
    ]);
}
public function login(Request $request) {
    // $this->validate($request, [
    //     'username' => 'required',
    //     'password' => 'required'
    //   ]);

      $username = $request->username;
      $password = $request->password;


      $user = Daftarakunpetugas::where('username', $username)->first();
     
      
      if(!$user){
        return response()->json([
            'status' => 'gagal'
    ]);

      }

      $password2 = Daftarakunpetugas::where('password', $password)->first();
      if(!$password2){
        return response()->json([
            'status' => 'gagal'
    ]);

      }

      if($user && !$password){
        return response()->json([
            'status' => 'gagal'
    ]);

      } 

      if(!$user && $password){
        return response()->json([
            'status' => 'gagal'
    ]);

      } 

      if(!$user && !$password){
        return response()->json([
            'status' => 'gagal'
    ]);

      } 
      

      

      
    if($user && $password){

      return response()->json([
        'status' => 'berhasil',
        'message' => 'Login Berhasil',
        // 'data'  => $user,
        'nama'  => $user['nama'],
        'alamat'  => $user['alamat'],
        'nomorhp'  => $user['nomor_hp'],
        'username'  => $user['username'],
        'password'  => $user['password'],
        // 'fotoprofil'  => $user['fotoprofil']
      ]);
    }
          
                  
}
}
