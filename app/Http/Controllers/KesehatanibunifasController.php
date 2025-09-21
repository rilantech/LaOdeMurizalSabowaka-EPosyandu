<?php

namespace App\Http\Controllers;

use App\Http\Requests\TambahKesehatanIbuNifasRequest;
use App\Models\Datakesehatanibunifas;
use App\Models\Dataorangtua;
use App\Models\Dataanak;
use Illuminate\Http\Request;
use Illuminate\Http\Request as HttpRequest;
use Illuminate\Support\Facades\DB;

class KesehatanibunifasController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $search = $request->query('search');
        $status_nifas = $request->query('status_nifas');

        if(!empty($search)){
            $dataorangtuadanAnak = Dataorangtua::where('tabel_data_orangtua.id','like','%'.$search.'%')
           ->orwhere('tabel_data_orangtua.nama_ibu','like','%'.$search.'%')
           ->paginate(10)->onEachSide(2)->fragment('srv');
        }else{
            
             if(!empty($status_nifas)){
             $dataorangtuadanAnak1 = Datakesehatanibunifas::where('status_nifas', $status_nifas)->get();
             
             foreach($dataorangtuadanAnak1 as $data){
                $nik_ibu[] = $data['nik_ibu'];
                $dataorangtuadanAnak = Dataorangtua::whereIn('nik', $nik_ibu)->paginate(10)->onEachSide(2)->fragment('srv');
             }
           }else{
                $dataorangtuadanAnak = Dataorangtua::latest()->paginate(10)->onEachSide(2)->fragment('srv');
           }
           
           
            // $dataorangtuadanAnak = Dataorangtua::latest()->paginate(10)->onEachSide(2)->fragment('srv');
        }
        return view('tabel.halamankesehatanibunifas',[
            'title' => 'Kesehatan Ibu Nifas',
            'dataorangtuadananak' => $dataorangtuadanAnak,
            'status_nifas' => $status_nifas,
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
       
        $keadaan_ibu1 =$request->keadaan_ibu_1;
        $keadaan_ibu2 =$request->keadaan_ibu_2;
        $keadaan_ibu3 =$request->keadaan_ibu_3;

        $komplikasi_nifas1 =$request->komplikasi_nifas_1;
        $komplikasi_nifas2 =$request->komplikasi_nifas_2;
        $komplikasi_nifas3 =$request->komplikasi_nifas_3;
        $komplikasi_nifas4 =$request->komplikasi_nifas_4;

        $keadaan_bayi1 =$request->keadaan_bayi_1;
        $keadaan_bayi2 =$request->keadaan_bayi_2;
        $keadaan_bayi3 =$request->keadaan_bayi_3;
        $keadaan_bayi4 =$request->keadaan_bayi_4;


        $datakeshatanibunifas =new Datakesehatanibunifas;
        $datakeshatanibunifas->nik_ibu = $request->nik_ibu;
        $datakeshatanibunifas->nama_anak= $request->nama_anak;
        $datakeshatanibunifas->nifas_ke = $request->nifas_ke;
        $datakeshatanibunifas->status_nifas = "Sedang Berlangsung";
        $datakeshatanibunifas->tanggal_kunjungan_1 = date('d-m-Y', strtotime(str_replace('-', '/', $request->tanggal_kunjungan_1)));
        $datakeshatanibunifas->tanggal_kunjungan_2 = date('d-m-Y', strtotime(str_replace('-', '/', $request->tanggal_kunjungan_2)));
        $datakeshatanibunifas->tanggal_kunjungan_3 = date('d-m-Y', strtotime(str_replace('-', '/', $request->tanggal_kunjungan_3)));
        $datakeshatanibunifas->kondisi_ibu_secara_umum_1 = $request->kondisi_ibu_secara_umum_1;
        $datakeshatanibunifas->kondisi_ibu_secara_umum_2 = $request->kondisi_ibu_secara_umum_2;
        $datakeshatanibunifas->kondisi_ibu_secara_umum_3 = $request->kondisi_ibu_secara_umum_3;
        $datakeshatanibunifas->tekanan_darah_1 = $request->tekanan_darah_1;
        $datakeshatanibunifas->tekanan_darah_2 = $request->tekanan_darah_2;
        $datakeshatanibunifas->tekanan_darah_3 = $request->tekanan_darah_3;
        $datakeshatanibunifas->pendarahan_pervaginam_1 = $request->pendarahan_pervaginam_1;
        $datakeshatanibunifas->pendarahan_pervaginam_2 = $request->pendarahan_pervaginam_2;
        $datakeshatanibunifas->pendarahan_pervaginam_3 = $request->pendarahan_pervaginam_3;
        $datakeshatanibunifas->kondisi_perineum_1 = $request->kondisi_perineum_1;
        $datakeshatanibunifas->kondisi_perineum_2 = $request->kondisi_perineum_2;
        $datakeshatanibunifas->kondisi_perineum_3 = $request->kondisi_perineum_3;
        $datakeshatanibunifas->tanda_infeksi_1 = $request->tanda_infeksi_1; 
        $datakeshatanibunifas->tanda_infeksi_2 = $request->tanda_infeksi_2;
        $datakeshatanibunifas->tanda_infeksi_3 = $request->tanda_infeksi_3;
        $datakeshatanibunifas->kontraksi_uteri_1 = $request->kontraksi_uteri_1; 
        $datakeshatanibunifas->kontraksi_uteri_2 = $request->kontraksi_uteri_2;
        $datakeshatanibunifas->kontraksi_uteri_3 = $request->kontraksi_uteri_3;
        $datakeshatanibunifas->tinggi_fundus_uteri_1 = $request->tinggi_fundus_uteri_1; 
        $datakeshatanibunifas->tinggi_fundus_uteri_2 = $request->tinggi_fundus_uteri_2;
        $datakeshatanibunifas->tinggi_fundus_uteri_3 = $request->tinggi_fundus_uteri_3;
        $datakeshatanibunifas->lokhia_1 = $request->lokhia_1; 
        $datakeshatanibunifas->lokhia_2 = $request->lokhia_2;
        $datakeshatanibunifas->lokhia_3 = $request->lokhia_3;
        $datakeshatanibunifas->pemeriksaan_jalan_lahir_1 = $request->pemeriksaan_jalan_lahir_1; 
        $datakeshatanibunifas->pemeriksaan_jalan_lahir_2 = $request->pemeriksaan_jalan_lahir_2;
        $datakeshatanibunifas->pemeriksaan_jalan_lahir_3 = $request->pemeriksaan_jalan_lahir_3;
        $datakeshatanibunifas->pemeriksaan_payudara_1 = $request->pemeriksaan_payudara_1; 
        $datakeshatanibunifas->pemeriksaan_payudara_2 = $request->pemeriksaan_payudara_2;
        $datakeshatanibunifas->pemeriksaan_payudara_3 = $request->pemeriksaan_payudara_3;
        $datakeshatanibunifas->produksi_asi_1 = $request->produksi_asi_1; 
        $datakeshatanibunifas->produksi_asi_2 = $request->produksi_asi_2;
        $datakeshatanibunifas->produksi_asi_3 = $request->produksi_asi_3;
        $datakeshatanibunifas->pemberian_kapsul_vitamin_a_1 = $request->pemberian_kapsul_vitamin_a_1; 
        $datakeshatanibunifas->pemberian_kapsul_vitamin_a_2 = $request->pemberian_kapsul_vitamin_a_2;
        $datakeshatanibunifas->pemberian_kapsul_vitamin_a_3 = $request->pemberian_kapsul_vitamin_a_3;
        $datakeshatanibunifas->pelayanan_kontrasepsi_1 = $request->pelayanan_kontrasepsi_1; 
        $datakeshatanibunifas->pelayanan_kontrasepsi_2 = $request->pelayanan_kontrasepsi_2;
        $datakeshatanibunifas->pelayanan_kontrasepsi_3 = $request->pelayanan_kontrasepsi_3;
        $datakeshatanibunifas->penanganan_resiko_tinggi_1 = $request->penanganan_resiko_tinggi_1; 
        $datakeshatanibunifas->penanganan_resiko_tinggi_2 = $request->penanganan_resiko_tinggi_2;
        $datakeshatanibunifas->penanganan_resiko_tinggi_3 = $request->penanganan_resiko_tinggi_3;
        $datakeshatanibunifas->buang_air_besar_1 = $request->buang_air_besar_1; 
        $datakeshatanibunifas->buang_air_besar_2 = $request->buang_air_besar_2;
        $datakeshatanibunifas->buang_air_besar_3 = $request->buang_air_besar_3;
        $datakeshatanibunifas->buang_air_kecil_1 = $request->buang_air_kecil_1; 
        $datakeshatanibunifas->buang_air_kecil_2 = $request->buang_air_kecil_2;
        $datakeshatanibunifas->buang_air_kecil_3 = $request->buang_air_kecil_3;
        $datakeshatanibunifas->catatan_dokter_1 = $request->catatan_dokter_1; 
        $datakeshatanibunifas->catatan_dokter_2 = $request->catatan_dokter_2;
        $datakeshatanibunifas->catatan_dokter_3 = $request->catatan_dokter_3;
        $datakeshatanibunifas->keadaan_ibu = $request->keadaan_ibu; 
        $datakeshatanibunifas->komplikasi_nifas = $request->komplikasi_nifas; 
        $datakeshatanibunifas->keadaan_bayi =  $request->keadaan_bayi; 
        $datakeshatanibunifas->save();
        
        return redirect('kesehatanibunifas/'.$request->id)->with('msg','Data Berhasil Di Tambahkan');
    }

    public function show(Request $request, Dataorangtua $dataorangtua1, $id)
    {
        $data1 = $dataorangtua1->find($id);
        $status_nifas = $request->query('status_nifas');
          
        $data2  = Datakesehatanibunifas::where('nik_ibu', $data1->nik)->paginate(1)->onEachSide(2)->fragment('srv');
      
        if(!empty($status_nifas)){
        $data2 =  DB::table('tabel_kesehatan_ibu_nifas') 
                ->where('nik_ibu', $data1->nik)
                ->where('status_nifas', $status_nifas)
                ->paginate(1)->onEachSide(2)->fragment('srv');
        }
       
       
        return view('form.detailkesehatanibunifas')->with([
            'id' => $id,
            'nik' => $data1->nik,
            'nama_ibu' => $data1->nama_ibu,
            'data2' => $data2,
            'title' => 'Detail Kesehatan Ibu Nifas',
        ]);
    }
    /**
     * Display the specified resource.
     */
  

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
    public function update(Request $request, Datakesehatanibunifas $datakesehatanibunifas3, $id)
    {
        //
        // $keadaan_ibu1 =$request->keadaan_ibu_1;
        // $keadaan_ibu2 =$request->keadaan_ibu_2;
        // $keadaan_ibu3 =$request->keadaan_ibu_3;

        // $komplikasi_nifas1 =$request->komplikasi_nifas_1;
        // $komplikasi_nifas2 =$request->komplikasi_nifas_2;
        // $komplikasi_nifas3 =$request->komplikasi_nifas_3;
        // $komplikasi_nifas4 =$request->komplikasi_nifas_4;

        // $keadaan_bayi1 =$request->keadaan_bayi_1;
        // $keadaan_bayi2 =$request->keadaan_bayi_2;
        // $keadaan_bayi3 =$request->keadaan_bayi_3;
        // $keadaan_bayi4 =$request->keadaan_bayi_4;
        
         DB::table('tabel_kesehatan_ibu_nifas') 
        ->where('nik_ibu', $request->nik_ibu)
        ->where('nifas_ke', $request->nifas_ke)
        ->update(
            [
                'nik_ibu' => $request->nik_ibu,
                'nama_anak' => $request->nama_anak,
                'nifas_ke' => $request->nifas_ke,
                // 'status_nifas' => $request->status_nifas,
                'tanggal_kunjungan_1' =>  $request->tanggal_kunjungan_1,
                'tanggal_kunjungan_2' =>  $request->tanggal_kunjungan_2,
                'tanggal_kunjungan_3' =>  $request->tanggal_kunjungan_3,
                'kondisi_ibu_secara_umum_1' => $request->kondisi_ibu_secara_umum_1,
                'kondisi_ibu_secara_umum_2' => $request->kondisi_ibu_secara_umum_2,
                'kondisi_ibu_secara_umum_3' => $request->kondisi_ibu_secara_umum_3,
                'tekanan_darah_1' => $request->tekanan_darah_1,
                'tekanan_darah_2' => $request->tekanan_darah_2,
                'tekanan_darah_3' => $request->tekanan_darah_3,
                'pendarahan_pervaginam_1' => $request->pendarahan_pervaginam_1,
                'pendarahan_pervaginam_2' => $request->pendarahan_pervaginam_2,
                'pendarahan_pervaginam_3' => $request->pendarahan_pervaginam_3,
                'kondisi_perineum_1' => $request->kondisi_perineum_1,
                'kondisi_perineum_2' => $request->kondisi_perineum_2,
                'kondisi_perineum_3' => $request->kondisi_perineum_3,
                'tanda_infeksi_1' => $request->tanda_infeksi_1, 
                'tanda_infeksi_2' => $request->tanda_infeksi_2,
                'tanda_infeksi_3' => $request->tanda_infeksi_3,
                'kontraksi_uteri_1' => $request->kontraksi_uteri_1, 
                'kontraksi_uteri_2' => $request->kontraksi_uteri_2,
                'kontraksi_uteri_3' => $request->kontraksi_uteri_3,
                'tinggi_fundus_uteri_1' => $request->tinggi_fundus_uteri_1, 
                'tinggi_fundus_uteri_2' => $request->tinggi_fundus_uteri_2,
                'tinggi_fundus_uteri_3' => $request->tinggi_fundus_uteri_3,
                'lokhia_1' => $request->lokhia_1, 
                'lokhia_2' => $request->lokhia_2,
                'lokhia_3' => $request->lokhia_3,
                'pemeriksaan_jalan_lahir_1' => $request->pemeriksaan_jalan_lahir_1, 
                'pemeriksaan_jalan_lahir_2' => $request->pemeriksaan_jalan_lahir_2,
                'pemeriksaan_jalan_lahir_3' => $request->pemeriksaan_jalan_lahir_3,
                'pemeriksaan_payudara_1' => $request->pemeriksaan_payudara_1, 
                'pemeriksaan_payudara_2' => $request->pemeriksaan_payudara_2,
                'pemeriksaan_payudara_3' => $request->pemeriksaan_payudara_3,
                'produksi_asi_1' => $request->produksi_asi_1, 
                'produksi_asi_2' => $request->produksi_asi_2,
                'produksi_asi_3' => $request->produksi_asi_3,
                'pemberian_kapsul_vitamin_a_1' => $request->pemberian_kapsul_vitamin_a_1, 
                'pemberian_kapsul_vitamin_a_2' => $request->pemberian_kapsul_vitamin_a_2,
                'pemberian_kapsul_vitamin_a_3' => $request->pemberian_kapsul_vitamin_a_3,
                'pelayanan_kontrasepsi_1' => $request->pelayanan_kontrasepsi_1, 
                'pelayanan_kontrasepsi_2' => $request->pelayanan_kontrasepsi_2,
                'pelayanan_kontrasepsi_3' => $request->pelayanan_kontrasepsi_3,
                'penanganan_resiko_tinggi_1' => $request->penanganan_resiko_tinggi_1, 
                'penanganan_resiko_tinggi_2' => $request->penanganan_resiko_tinggi_2,
                'penanganan_resiko_tinggi_3' => $request->penanganan_resiko_tinggi_3,
                'buang_air_besar_1' => $request->buang_air_besar_1, 
                'buang_air_besar_2' => $request->buang_air_besar_2,
                'buang_air_besar_3' => $request->buang_air_besar_3,
                'buang_air_kecil_1' => $request->buang_air_kecil_1, 
                'buang_air_kecil_2' => $request->buang_air_kecil_2,
                'buang_air_kecil_3' => $request->buang_air_kecil_3,
                'catatan_dokter_1' => $request->catatan_dokter_1, 
                'catatan_dokter_2' => $request->catatan_dokter_2,
                'catatan_dokter_3' => $request->catatan_dokter_3,
                'keadaan_ibu' => $request->keadaan_ibu, 
                'komplikasi_nifas' => $request->komplikasi_nifas, 
                'keadaan_bayi' =>  $request->keadaan_bayi

                
            ]
            );

    
            // $data2  = Datakesehatanibunifas::where('nik_ibu', $data1->nik)->paginate(1)->onEachSide(2)->fragment('srv');
        // return redirect('kesehatanibunifas/'.$request->id)->with('msg','Data Berhasil DiUpdate!');
            
        return redirect(request()->header('Referer'))->with('msg','Data Berhasil DiUpdate!');



    }

    public function tambahkesehatanibunifas(HttpRequest $request){
        $id = $request->query('id');
        $nik = $request->query('nik');
        $nama_ibu = $request->query('nama_ibu');
        $dataanak = Dataanak::where('tabel_data_anak.nik_ibu', $nik)->get();  
   
      
   return view('form.tambahkesehatanibunifas')->with([
        'id' => $id,
        'nik' => $nik,
        'nama_ibu' => $nama_ibu,
        'dataanak'=> $dataanak,
        'title' => 'Tambah Kesehatan Ibu Nifas',
    
    ]);
    }
    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Datakesehatanibunifas $datakesehatanibunifas5,  $id2, Request $request)
    {
         
        DB::table('tabel_kesehatan_ibu_nifas') 
        ->where('nik_ibu', $request->nik_ibu)
        ->where('nifas_ke', $request->nifas_ke)
        ->delete();

        return redirect('kesehatanibunifas/'.$id2)->with('msg','Data Berhasil Terhapus!');
        
    }
}
