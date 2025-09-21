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
        Schema::create('tabel_data_anak', function (Blueprint $table) {
            $table->id();
            $table->string('nama', 100);
            $table->string('tempat_atau_tanggal_lahir', 50);
            $table->string('anak_ke', 5);
            $table->string('dari', 5);
            $table->string('no_akta_kelahiran', 30);
            $table->string('no_jkn_bpjs', 30);
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('dataanaks');
    }
};
