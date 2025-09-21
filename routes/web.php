<?php

use App\Http\Controllers\CetakDatakms;
use App\Http\Controllers\CetakDataobstetriController;
use App\Http\Controllers\CetakDataorangtuadananakController;
use App\Http\Controllers\CetakImunisasianakController;
use App\Http\Controllers\CetakKesehatanbayibarulahir;
use App\Http\Controllers\CetakKesehatanibubersalinController;
use App\Http\Controllers\CetakKesehatanibuhamilController;
use App\Http\Controllers\CetakKesehatanibunifasController;
use App\Http\Controllers\CetakMatrikpemantauanperkembangananak;
use App\Http\Controllers\CetakPemberianvitamindanobatcacing;
use App\Http\Controllers\ChattingController;
use App\Http\Controllers\DaftarakunibuController;
use App\Http\Controllers\DaftarakunpetugasController;
use App\Http\Controllers\HalamanloginController;
use App\Http\Controllers\HalamanregisterController;
use App\Http\Controllers\TinggiBadanBerdasarkanUmurController;

use App\Http\Controllers\DaftarpengunjungwisataController;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\RegisterController;
use App\Http\Controllers\DashboardController;
use App\Http\Controllers\Datakms;
use App\Http\Controllers\DataobstetriController;
use App\Http\Controllers\DataorangtuadananakController;
use App\Http\Controllers\HapusdataanakController;
use App\Http\Controllers\DetailController;
use App\Http\Controllers\DetailriwayatpengaduanController;
use App\Http\Controllers\HalamandaftarpengaduanController;
use App\Http\Controllers\HalamandashboardController;
use App\Http\Controllers\HalamandatauserController;
use App\Http\Controllers\RiwayatpengaduanController;
use App\Http\Controllers\TempImageController;
use App\Http\Controllers\ValidasipengaduanController;
use App\Http\Controllers\HapusriwayatpengaduanController;
use App\Http\Controllers\ImunisasianakController;
use App\Http\Controllers\ProfiladminController;

use App\Http\Controllers\JadwalposyanduController;
use App\Http\Controllers\Kesehatanbayibarulahir;
use App\Http\Controllers\KesehatanibubersalinController;
use App\Http\Controllers\KesehatanibuhamilController;
use App\Http\Controllers\KesehatanibunifasController;
use App\Http\Controllers\Matrikpemantauanperkembangananak;
use App\Http\Controllers\Pemberianvitamindanobatcacing;
use App\Http\Controllers\Pemenuhangizidanmakan;
use App\Http\Controllers\PilihnikibuController;
use App\Http\Controllers\TambahdataobstetriController;
use App\Livewire\Wisata\WisataComponent;
use App\Livewire\Wisata\AddWisataComponent;
use App\Livewire\Wisata\EditWisataComponent;
use App\Models\Akunwisatawan;
use App\Models\Dataservis;
use App\Models\Jadwalposyandu;
use Illuminate\Support\Facades\Route;
use App\Models\Kategoriwisata;
use App\Models\Riwayatpengaduan;
use Illuminate\Database\Eloquent\Builder;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|

*/

Route::get('/', function () {
    return view('welcome');
});


Route::get('/login', [HalamanloginController::class, 'index'])->name('login')->middleware('guest');
Route::post('/login', [HalamanloginController::class, 'authenticate']);
Route::post('/logout', [HalamanloginController::class, 'logout']);

Route::get('/registrasi', [HalamanregisterController::class, 'index'])->middleware('guest');
Route::post('/registrasi', [HalamanregisterController::class, 'store']);

Route::resource('beranda',HalamandashboardController::class);
Route::resource('datauser',HalamandatauserController::class)->middleware('auth');
Route::get('/tambahdatauser',[HalamandatauserController::class, 'tambahdatauser'])->middleware('auth');
Route::resource('daftarpengaduan',HalamandaftarpengaduanController::class)->middleware('auth');
Route::get('/tambahdatapengaduan',[HalamandaftarpengaduanController::class, 'tambahdatapengaduan'])->middleware('auth');
Route::get('/detailriwayatpengaduan',[RiwayatpengaduanController::class, 'detailriwayatpengaduan'])->middleware('auth');
Route::resource('validasipengaduan',ValidasipengaduanController::class);
Route::resource('hapusriwayatpengaduan',HapusriwayatpengaduanController::class)->middleware('auth');

Route::resource('detailriwayatpengaduan',DetailriwayatpengaduanController::class)->middleware('auth');
Route::resource('riwayatpengaduan',RiwayatpengaduanController::class)->middleware('auth');
Route::resource('profiladmin',ProfiladminController::class)->middleware('auth');

//Rout Web Dwi
Route::resource('dashboard',HalamandashboardController::class)->middleware('auth');;
Route::resource('jadwalposyandu',JadwalposyanduController::class);
Route::get('/tambahjadwalposyandu',[JadwalposyanduController::class, 'tambahjadwalposyandu']);

Route::resource('dataorangtuadananak',DataorangtuadananakController::class);
Route::get('/tambahdataorangtuadananak',[DataorangtuadananakController::class, 'tambahdataorangtuadananak']);
Route::resource('cetakdataorangtuadananak',CetakDataorangtuadananakController::class);
Route::post('/insertdataanak',[DataorangtuadananakController::class, 'create']);
// Route::resource('dataorangtuadananak/{id}',[DataorangtuadananakController::class, 'hapusdataanak']);

Route::resource('hapusdataanak',HapusdataanakController::class);

Route::resource('dataobstetri',DataobstetriController::class);
// Route::resource('tambahdataobstetri',TambahdataobstetriController::class);
Route::get('/tambahdataobstetri',[DataobstetriController::class, 'tambahdataobstetri']);
// Route::resource('pilihnikibu',PilihnikibuController::class);
Route::resource('cetakdataobstetri',CetakDataobstetriController::class);

Route::resource('kesehatanibuhamil',KesehatanibuhamilController::class);
Route::get('/tambahkesehatanibuhamil',[KesehatanibuhamilController::class, 'tambahkesehatanibuhamil']);
Route::resource('cetakkesehatanibuhamil',CetakKesehatanibuhamilController::class);

Route::resource('kesehatanibubersalin',KesehatanibubersalinController::class);
Route::get('/tambahkesehatanibubersalin',[KesehatanibubersalinController::class, 'tambahkesehatanibubersalin']);
Route::resource('cetakkesehatanibubersalin', CetakKesehatanibubersalinController::class);

Route::resource('kesehatanibunifas',KesehatanibunifasController::class);
Route::get('/tambahkesehatanibunifas',[KesehatanibunifasController::class, 'tambahkesehatanibunifas']);
Route::resource('cetakkesehatanibunifas', CetakKesehatanibunifasController::class);

Route::resource('kesehatanbayibarulahir',Kesehatanbayibarulahir::class);
Route::get('/tambahkesehatanbayibarulahir',[Kesehatanbayibarulahir::class, 'tambahkesehatanbayibarulahir']);
Route::resource('cetakkesehatanbayibarulahir', CetakKesehatanbayibarulahir::class);

Route::resource('imunisasianak',ImunisasianakController::class);
Route::get('/tambahdataimunisasianak',[ImunisasianakController::class, 'tambahdataimunisasianak']);
Route::resource('cetakdataimunisasianak', CetakImunisasianakController::class);

Route::resource('pemberianvitamindanobatcacing',Pemberianvitamindanobatcacing::class);
Route::get('/tambahpemberianvitamindanobatcacing',[Pemberianvitamindanobatcacing::class, 'tambahpemberianvitamindanobatcacing']);
Route::resource('cetakvitamindanobatcacing', CetakPemberianvitamindanobatcacing::class);

Route::resource('pemenuhangizidanmakan',Pemenuhangizidanmakan::class);
Route::get('/tambahpemenuhangizidanmakan',[Pemenuhangizidanmakan::class, 'tambahpemenuhangizidanmakan']);

Route::resource('matriksperkembangananak',Matrikpemantauanperkembangananak::class);
Route::get('/tambahmatriksperkembangananak',[Matrikpemantauanperkembangananak::class, 'tambahmatriksperkembangananak']);
Route::resource('cetakmatriksperkembangananak', CetakMatrikpemantauanperkembangananak::class);

Route::resource('datakms',Datakms::class);
Route::get('/tambahdatakms',[Datakms::class, 'tambahdatakms']);
Route::resource('cetakdatakms', CetakDatakms::class);

Route::resource('tinggibadan',TinggiBadanBerdasarkanUmurController::class);
Route::get('/tambahtinggibadan',[TinggiBadanBerdasarkanUmurController::class, 'tambahtinggibadan']);
Route::resource('cetaktinggibadan', CetakDatakms::class);

Route::resource('daftarakunpetugas',DaftarakunpetugasController::class);
Route::get('/tambahakunpetugas',[DaftarakunpetugasController::class, 'tambahakunpetugas']);

Route::resource('daftarakunibu',DaftarakunibuController::class);
Route::get('/tambahakunibu',[DaftarakunibuController::class, 'tambahakunibu']);
Route::get('/tentangaplikasi',[DaftarakunibuController::class, 'tentangaplikasi']);

Route::resource('chatting',ChattingController::class);
Route::get('/chatting/{id}/{pilih_akun}/', [ChattingController::class, 'show']);




