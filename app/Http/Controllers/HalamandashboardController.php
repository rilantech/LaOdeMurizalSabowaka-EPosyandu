<?php

namespace App\Http\Controllers;

use App\Models\Daftarpengaduan;
use App\Models\Dataanak;
use App\Models\Dataobstetri;
use App\Models\Datakesehatanibubersalin;
use App\Models\Datakesehatanibuhamil;
use App\Models\Datakesehatanibunifas;
use App\Models\Dataorangtua;
use App\Models\Datauser;
use App\Models\Riwayatpengaduan;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class HalamandashboardController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
    
        $jumlahibuposyandu = Dataorangtua::all()->count();
        $jumlahdataanak = Dataanak::all()->count();
        $jumlahibuhamil = Datakesehatanibuhamil::all()->count();
        $jumlahibuhamilsaatini = Datakesehatanibuhamil::where('status_kehamilan', 'Sedang Berlangsung')->count();
        $jumlahibubersalin = Datakesehatanibubersalin::all()->count();
        $jumlahibunifas = Datakesehatanibunifas::all()->count();
        $jumlahibunifassaatini = Datakesehatanibunifas::where('status_nifas', 'Sedang Berlangsung')->count();
        $jumlahkematiananak = Dataobstetri::where('lahir_hidup', 'Mati')->count();
        
         $kematiananak_2020  = DB::table('tabel_data_obstetri') 
        ->where('tahun', '2020')
        ->where('lahir_hidup', 'mati')
        ->count();
        
         $kematiananak_2021  = DB::table('tabel_data_obstetri') 
        ->where('tahun', '2021')
        ->where('lahir_hidup', 'mati')
        ->count();
        
         $kematiananak_2022  = DB::table('tabel_data_obstetri') 
        ->where('tahun', '2022')
        ->where('lahir_hidup', 'mati')
        ->count();
        
         $kematiananak_2023  = DB::table('tabel_data_obstetri') 
        ->where('tahun', '2023')
        ->where('lahir_hidup', 'mati')
        ->count();
        
         $kematiananak_2024  = DB::table('tabel_data_obstetri') 
        ->where('tahun', '2024')
        ->where('lahir_hidup', 'mati')
        ->count();
        
         $kematiananak_2025  = DB::table('tabel_data_obstetri') 
        ->where('tahun', '2025')
        ->where('lahir_hidup', 'mati')
        ->count();
        $jumlahibuhamil2020 = Datakesehatanibuhamil::where('hari_pertama_haid_terakhir', 'like','%'.'2020'.'%')->count();
        $jumlahibuhamil2021 = Datakesehatanibuhamil::where('hari_pertama_haid_terakhir', 'like','%'.'2021'.'%')->count();
        $jumlahibuhamil2022 = Datakesehatanibuhamil::where('hari_pertama_haid_terakhir', 'like','%'.'2022'.'%')->count();
        $jumlahibuhamil2023 = Datakesehatanibuhamil::where('hari_pertama_haid_terakhir', 'like','%'.'2023'.'%')->count();
        $jumlahibuhamil2024 = Datakesehatanibuhamil::where('hari_pertama_haid_terakhir', 'like','%'.'2024'.'%')->count();
        
        $jumlahibubersalin2020 = Datakesehatanibubersalin::where('tanggal_persalinan', 'like','%'.'2020'.'%')->count();
        $jumlahibubersalin2021 = Datakesehatanibubersalin::where('tanggal_persalinan', 'like','%'.'2021'.'%')->count();
        $jumlahibubersalin2022 = Datakesehatanibubersalin::where('tanggal_persalinan', 'like','%'.'2022'.'%')->count();
        $jumlahibubersalin2023 = Datakesehatanibubersalin::where('tanggal_persalinan', 'like','%'.'2023'.'%')->count();
        $jumlahibubersalin2024 = Datakesehatanibubersalin::where('tanggal_persalinan', 'like','%'.'2024'.'%')->count();
        
        $jumlahibunifas2020 = Datakesehatanibunifas::where('tanggal_kunjungan_1', 'like','%'.'2020'.'%')->count();
        $jumlahibunifas2021 = Datakesehatanibunifas::where('tanggal_kunjungan_1', 'like','%'.'2021'.'%')->count();
        $jumlahibunifas2022 = Datakesehatanibunifas::where('tanggal_kunjungan_1', 'like','%'.'2022'.'%')->count();
        $jumlahibunifas2023 = Datakesehatanibunifas::where('tanggal_kunjungan_1', 'like','%'.'2023'.'%')->count();
        $jumlahibunifas2024 = Datakesehatanibunifas::where('tanggal_kunjungan_1', 'like','%'.'2024'.'%')->count();
       
        return view('tabel.halamandashboard',[
            'jumlahibuposyandu' => $jumlahibuposyandu,
            'jumlahdataanak' => $jumlahdataanak,
            'jumlahibuhamilsaatini' => $jumlahibuhamilsaatini,
             'jumlahibuhamil' => $jumlahibuhamil,
            'jumlahibubersalin' => $jumlahibubersalin,
            'jumlahibunifas' => $jumlahibunifas,
            'jumlahibunifassaatini' => $jumlahibunifassaatini,
            'jumlahkematiananak' => $jumlahkematiananak,
            'jumlahibuhamil2020' => $jumlahibuhamil2020,
            'jumlahibuhamil2021' => $jumlahibuhamil2021,
            'jumlahibuhamil2022' => $jumlahibuhamil2022,
            'jumlahibuhamil2023' => $jumlahibuhamil2023,
            'jumlahibuhamil2024' => $jumlahibuhamil2024,
            
            'jumlahibubersalin2020' => $jumlahibubersalin2020,
            'jumlahibubersalin2021' => $jumlahibubersalin2021,
            'jumlahibubersalin2022' => $jumlahibubersalin2022,
            'jumlahibubersalin2023' => $jumlahibubersalin2023,
            'jumlahibubersalin2024' => $jumlahibubersalin2024,
            
            'jumlahibunifas2020' => $jumlahibunifas2020,
            'jumlahibunifas2021' => $jumlahibunifas2021,
            'jumlahibunifas2022' => $jumlahibunifas2022,
            'jumlahibunifas2023' => $jumlahibunifas2023,
            'jumlahibunifas2024' => $jumlahibunifas2024,
            'kematiananak_2020' => $kematiananak_2020,
            'kematiananak_2021' => $kematiananak_2021,
            'kematiananak_2022' => $kematiananak_2022,
            'kematiananak_2023' => $kematiananak_2023,
            'kematiananak_2024' => $kematiananak_2024,
            'kematiananak_2025' => $kematiananak_2025,
            
            'title' => 'Dashboard'
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
        //
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
