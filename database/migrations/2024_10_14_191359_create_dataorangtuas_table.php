<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('tabel_data_orangtua', function (Blueprint $table) {
            $table->id();
            $table->string('nama_ibu', 100);
            $table->string('nik', 30);
            $table->string('tempat_atau_tanggal_lahir_ibu', 50);
            $table->string('kehamilan_ke', 10);
            $table->string('anak_terakhir_umur', 10);
            $table->string('agama_ibu', 20);
            $table->string('pendidikan_ibu', 50);
            $table->string('golongan_darah_ibu', 5);
            $table->string('pekerjaan_ibu', 30);
            $table->string('no_jkn_bpjs', 30);
            $table->string('nama_ayah', 100);
            $table->string('tempat_atau_tanggal_lahir_ayah', 50);
            $table->string('agama_ayah', 20);
            $table->string('pendidikan_ayah', 50);
            $table->string('golongan_darah_ayah', 5);
            $table->string('pekerjaan_ayah', 30);
            $table->string('alamat_rumah', 100);
            $table->string('kecamatan', 30);
            $table->string('kabupaten_atau_kota', 30);
            $table->string('no_telepon', 30);
            $table->timestamps();
        });

    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('dataorangtuas');
    }
};
