<?php

namespace App\Http\Controllers;

use App\Models\Dataorangtua;
use Illuminate\Http\Request;

class PilihnikibuController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(HttpRequest $request)
    {
        $nik = $request->query('nik');

        if(!empty($nik)){
            $NIKibu = Dataorangtua::where('tabel_data_orangtua.nik', $nik);
        }
        return view('form.tambahdataobstetri',[
            'nikibu' => $NIKibu,
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
