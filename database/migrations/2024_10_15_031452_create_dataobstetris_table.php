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
        Schema::create('tabel_data_obstetri', function (Blueprint $table) {
            $table->id();
            $table->string('nik_ibu', 30);
            $table->string('kehamilan_ke', 5);
            $table->string('tahun', 4);
            $table->string('lahir_hidup', 10);
            $table->string('lahir_aterm', 10);
            $table->string('lahir_spontan', 10);
            $table->string('berat_lahir_atau_panjang_lahir', 10);
            $table->string('tempat_bersalin_dan_tenakes', 10);
            $table->string('kondisi_anak_saat_ini', 50);
            $table->string('komplikasi_kehamilan_atau_persalinan', 50);
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('dataobstetris');
    }
};
