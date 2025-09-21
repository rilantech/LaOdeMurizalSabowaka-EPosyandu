<?php
namespace App\Http\Controllers\Api;
namespace App\Http\Controllers;
use App\Http\Requests\TambahAkunPetugasRequest;
use App\Models\Daftarakunibu;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Http\Response as HttpResponse;

class ApiDaftaraknibu extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        // $search = $request->query('search');

        // if(!empty($search)){
        //     $akunIbu = Daftarakunibu::where('tabel_akun_ibu.id','like','%'.$search.'%')
        //    ->orwhere('tabel_akun_ibu.nama','like','%'.$search.'%')
        //    ->paginate(10)->onEachSide(2)->fragment('srv');
        // }else{
        //     $akunIbu = Daftarakunibu::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        // }
        // return view('tabel.halamandaftarakunibu',[
        //     'title' => 'Daftar Akun Ibu',
        //     'akunibu' => $akunIbu,
        //     'search' => $search
        //   ]
        //   );
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
    
        $daftarakunpetugas =new Daftarakunibu();
        $daftarakunpetugas->nama = $request->nama;
        $daftarakunpetugas->nik_ibu = $request->nik_ibu;
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
    public function show(Daftarakunibu $daftarakunibu1, $id)
    {
        $data = $daftarakunibu1->find($id);
       
        return view('form.editakunibu')->with([
            'id' => $id,
            'nama' => $data->nama,
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

public function login(Request $request) {
    // $this->validate($request, [
    //     'username' => 'required',
    //     'password' => 'required'
    //   ]);

try{
      $username = $request->input('username');
      $password = $request->input('password');


      $user = Daftarakunibu::where('username', $username)->first();
           
      if(!$user){
        return response()->json([
            'status' => 'gagal',
            'message' => 'Login Gagal'
    ]);

      }

      $password2 = Daftarakunibu::where('password', $password)->first();
      if(!$password2){
        return response()->json([
            'status' => 'gagal',
            'message' => 'Login Gagal'
    ]);
      }

              
      return response()->json([
        'status' => 'berhasil',
        'message' => 'Login Berhasil',
        // 'data'  => $user,
        'nama'  => $user['nama'],
        'nik_ibu'  => $user['nik_ibu'],
        'alamat'  => $user['alamat'],
        'nomorhp'  => $user['nomor_hp'],
        'username'  => $user['username'],
        'password'  => $user['password'],
        // 'fotoprofil'  => $user['fotoprofil']
      ],HttpResponse::HTTP_OK);

                  
 } catch (QueryException $e){
            $error = [
                'error' => $e-> getMessage()
            ];
            return response()->json($error, 
            HttpResponse::HTTP_INTERNAL_SERVER_ERROR);
        }
}}
