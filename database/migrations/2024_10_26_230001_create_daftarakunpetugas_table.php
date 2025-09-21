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
        Schema::create('tabel_akun_petugas', function (Blueprint $table) {
            $table->id();
            $table->string('nama', 50);
            $table->string('username', 20);
            $table->string('password', 20);
            $table->string('alamat', 100);
            $table->string('nomor_hp', 15);
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('tabel_akun_petugas');
    }
};
