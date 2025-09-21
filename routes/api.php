<?php

use App\Http\Controllers\api\AuthController;
use App\Http\Controllers\Api\DatauserController;
use App\Http\Controllers\Api\ApidaftarpengaduanController;
use App\Http\Controllers\AkunuserController;
use App\Http\Controllers\Api\ApiriwayatpengaduanController;
use App\Http\Controllers\ApiCatatankesehatanibubersalin;
use App\Http\Controllers\ApiCatatankesehatanibuhamil;
use App\Http\Controllers\ApiCatatankesehatanibunifas;
use App\Http\Controllers\ApiChattingController;
use App\Http\Controllers\ApiChattingPetugasController;
use App\Http\Controllers\ApiDaftaraknibu;
use App\Http\Controllers\ApiDaftarakunibuController;
use App\Http\Controllers\ApiDaftarakunpetugasController;
use App\Http\Controllers\ApiDatakesehatanibubersalin;
use App\Http\Controllers\ApiDatakesehatanibuhamil;
use App\Http\Controllers\ApiDatakesehatanibunifas;
use App\Http\Controllers\ApiDatakms;
use App\Http\Controllers\ApiDataobstetri;
use App\Http\Controllers\ApiDataobstetri2;
use App\Http\Controllers\ApiDataorangtuadananak;
use App\Http\Controllers\ApiDataAnak;
use App\Http\Controllers\ApiHitungdatanifas;
use App\Http\Controllers\ApiImunisasianakController;
use App\Http\Controllers\ApiJadwalposyanduController;
use App\Http\Controllers\ApiKesehatanbayibarulahir;
use App\Http\Controllers\ApiKesehatanbayibarulahir2;
use App\Http\Controllers\ApiMatrikpemantauanperkembangananak;
use App\Http\Controllers\ApiNotifJadwalposyanduController;
use App\Http\Controllers\ApiNotifikasiInteraktifController;
use App\Http\Controllers\ApiNotifikasiInteraktifIbuNifasController;
use App\Http\Controllers\ApiNotifikasiInteraktifAnakController;
use App\Http\Controllers\ApiNotifikasiChattingController;
use App\Http\Controllers\ApiSemuaNotifController;
use App\Http\Controllers\ApiPemberianvitamindanobatcacing;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "api" middleware group. Make something great!
|
*/


// API APLIKASI SUPARMAN
Route::apiResource('datapengaduan', ApidaftarpengaduanController::class);
Route::apiResource('riwayatpengaduan', ApiriwayatpengaduanController::class);
Route::post('register',[AkunuserController::class, 'register']);
Route::post('login',[AkunuserController::class, 'login']);
Route::get('/datauser/{username}', [DatauserController::class, 'index']);

// API APLIKASI DWI
Route::apiResource('apisemuanotif', ApiSemuaNotifController::class);
Route::apiResource('jadwalposyandu', ApiJadwalposyanduController::class);

Route::apiResource('notifjadwalposyandu', ApiNotifJadwalposyanduController::class);
Route::apiResource('notifinteraktif', ApiNotifikasiInteraktifController::class);
Route::apiResource('notifinteraktifkesehatanibunifas', ApiNotifikasiInteraktifIbuNifasController::class);
Route::apiResource('notifinteraktifanak', ApiNotifikasiInteraktifAnakController::class);
Route::apiResource('notifchatting', ApiNotifikasiChattingController::class);
Route::apiResource('dataorangtuadananak', ApiDataorangtuadananak::class);
Route::get('/detaildata/{id}', [ApiDataorangtuadananak::class, 'show']);
Route::put('/editdata/{id}', [ApiDataorangtuadananak::class, 'update']);
Route::delete('/hapusdata/{id}', [ApiDataorangtuadananak::class, 'destroy']);
Route::post('caridataorangtuadananak', [ApiDataorangtuadananak::class, 'create']);
Route::get('/lihatdataorangtuadananak/{nik_ibu}', [ApiDataorangtuadananak::class, 'edit']);

// Route::apiResource('editdataanak2', ApiDataAnak::class);
Route::put('/editdataanak2/{id}', [ApiDataAnak::class, 'update']);

// Route::get('/{id}', [ApiDataobstetri2::class, 'show']);
Route::apiResource('dataobstetri', ApiDataobstetri::class);
Route::post('caridataobstetri', [ApiDataobstetri2::class, 'create']);
Route::get('/detaildataobstetri/{id}', [ApiDataobstetri::class, 'show']);
Route::get('/lihatdataobstetri/{nik_ibu}', [ApiDataobstetri::class, 'edit']);
Route::put('/updatedataobstetri/{id}', [ApiDataobstetri::class, 'update']);
Route::delete('/hapusdataobstetri/{id}', [ApiDataobstetri::class, 'destroy']);
Route::get('/editdataobstetri/{id}', [ApiDataobstetri2::class, 'show']);


Route::apiResource('datakesehatanibuhamil', ApiDatakesehatanibuhamil::class);
Route::get('/detaildatakesehatanibuhamil/{id}/{status_kehamilan}', [ApiDatakesehatanibuhamil::class, 'index']);
Route::get('/editdatakesehatanibuhamil/{id}', [ApiDatakesehatanibuhamil::class, 'show']);
Route::put('/updatedatakesehatanibuhamil/{id}', [ApiDatakesehatanibuhamil::class, 'update']);
Route::delete('/hapusdatakesehatanibuhamil/{id}', [ApiDatakesehatanibuhamil::class, 'destroy']);
Route::get('/lihatdatakesehatanibuhamil/{nik_ibu}', [ApiDatakesehatanibuhamil::class, 'edit']);
Route::post('caridetailkesehatanibuhamil', [ApiDatakesehatanibuhamil::class, 'create']);
Route::apiResource('catatan_kesehatanibuhamil', ApiCatatankesehatanibuhamil::class);
Route::get('/catatankesehatanibuhamil/{id}/{kehamilan_ke}', [ApiCatatankesehatanibuhamil::class, 'index']);
Route::get('/lihatcatatankesehatanibuhamil/{nik_ibu}/{kehamilan_ke}', [ApiCatatankesehatanibuhamil::class, 'edit']);
Route::get('/editcatatankesehatanibuhamil/{id}', [ApiCatatankesehatanibuhamil::class, 'show']);
Route::put('/updatecatatankesehatanibuhamil/{id}', [ApiCatatankesehatanibuhamil::class, 'update']);
Route::delete('/hapuscatatankesehatanibuhamil/{id}', [ApiCatatankesehatanibuhamil::class, 'destroy']);
Route::post('caricatatankesehatanibuhamil', [ApiCatatankesehatanibuhamil::class, 'create']);

Route::apiResource('catatan_kesehatanibubersalin', ApiCatatankesehatanibubersalin::class);
Route::post('caricatatankesehatanibubersalin', [ApiCatatankesehatanibubersalin::class, 'create']);
Route::get('/detaildatakesehatanibubersalin/{id}', [ApiDatakesehatanibubersalin::class, 'index']);
Route::get('/editcatatankesehatanibubersalin/{id}', [ApiDatakesehatanibubersalin::class, 'show']);
Route::put('/updatecatatankesehatanibubersalin/{id}', [ApiDatakesehatanibubersalin::class, 'update']);
Route::get('/lihatdatakesehatanibubersalin/{nik_ibu}', [ApiDatakesehatanibubersalin::class, 'edit']);
Route::delete('/hapusdatakesehatanibubersalin/{id}', [ApiDatakesehatanibubersalin::class, 'destroy']);

Route::get('/detaildatakesehatanibunifas/{id}', [ApiDatakesehatanibunifas::class, 'index']);
Route::apiResource('datakesehatanibunifas', ApiCatatankesehatanibunifas::class);
Route::apiResource('datakesehatanibunifas2', ApiDatakesehatanibunifas::class);
Route::get('/hitungdatanifas/{id}', [ApiHitungdatanifas::class, 'index']);
Route::get('/tambahkesehatanibunifas/{nik}',[ApiDatakesehatanibunifas::class, 'tambahkesehatanibunifas']);
Route::get('/tampildatanifas/{nik}/{nifas_ke}/{status_nifas}', [ApiDatakesehatanibunifas::class, 'edit']);
Route::put('/updatedatanifas/{id}', [ApiDatakesehatanibunifas::class, 'update']);



Route::apiResource('kesehatanbayibarulahir', ApiKesehatanbayibarulahir::class);
Route::get('/detailkesehatanbayibarulahir/{id}', [ApiKesehatanbayibarulahir::class, 'show']);
Route::put('/updatekesehatanbayibarulahir/{id}', [ApiKesehatanbayibarulahir::class, 'update']);
Route::delete('/hapuskesehatanbayibarulahir/{id}', [ApiKesehatanbayibarulahir::class, 'destroy']);
Route::get('/tambahkesehatanbayibarulahir',[ApiKesehatanbayibarulahir::class, 'tambahkesehatanbayibarulahir']);
Route::get('/caridataibudananak/{nik}/{namaanak}',[ApiKesehatanbayibarulahir2::class, 'index']);
Route::post('carikesehatanbayibarulahir', [ApiKesehatanbayibarulahir::class, 'create']);
Route::get('/lihatkesehatanbayibarulahir/{nik_ibu}', [ApiKesehatanbayibarulahir::class, 'edit']);

Route::apiResource('imunisasianak', ApiImunisasianakController::class);
Route::get('/detailkesehatanimunisasianak/{id}', [ApiImunisasianakController::class, 'show']);
Route::put('/updatekesehatanimunisasianak/{id}', [ApiImunisasianakController::class, 'update']);
Route::post('carikesehatanimunisasianak', [ApiImunisasianakController::class, 'create']);
Route::get('/lihatimunisasianak/{nik_ibu}', [ApiImunisasianakController::class, 'edit']);

Route::apiResource('pemberianvitamindanobatcacing', ApiPemberianvitamindanobatcacing::class);
Route::get('/detailpemberianvitamindanobatcacing/{id}', [ApiPemberianvitamindanobatcacing::class, 'show']);
Route::put('/updatepemberianvitamindanobatcacing/{id}', [ApiPemberianvitamindanobatcacing::class, 'update']);
Route::post('caripemberianvitamindanobatcacing', [ApiPemberianvitamindanobatcacing::class, 'create']);
Route::get('/lihatpemberianvitamindanobatcacing/{nik_ibu}', [ApiPemberianvitamindanobatcacing::class, 'edit']);

Route::apiResource('matrikspantauperkembangananak', ApiMatrikpemantauanperkembangananak::class);
Route::post('carimatrikspantauperkembangananak', [ApiMatrikpemantauanperkembangananak::class, 'create']);
Route::get('/detailmatrikspantauperkembangananak/{id}', [ApiMatrikpemantauanperkembangananak::class, 'show']);
Route::put('/updatematrikspantauperkembangananak/{id}', [ApiMatrikpemantauanperkembangananak::class, 'update']);
Route::get('/lihatmatrikspantauperkembangananak/{nik_ibu}', [ApiMatrikpemantauanperkembangananak::class, 'edit']);

Route::apiResource('datakms', ApiDatakms::class);
Route::get('/detaildatakms/{id}', [ApiDatakms::class, 'show']);
Route::put('/updatedatakms/{id}', [ApiDatakms::class, 'update']);
Route::post('caridatakms', [ApiDatakms::class, 'create']);
Route::get('/lihatdatakms/{nik_ibu}', [ApiDatakms::class, 'edit']);


Route::apiResource('chatting7', ApiChattingController::class);
Route::post('cariakunibu', [ApiChattingController::class, 'create']);
Route::apiResource('chattingpetugas', ApiChattingPetugasController::class);
Route::post('cariakunpetugas', [ApiChattingPetugasController::class, 'create']);

Route::get('/detailchatting/{id}/{nomor_hp}/{posisi}', [ApiChattingController::class, 'show']);

Route::apiResource('registrasiakun',ApiDaftarakunpetugasController::class);
Route::post('login',[ApiDaftarakunpetugasController::class, 'login']);

Route::apiResource('registrasiaknibu',ApiDaftaraknibu::class);
Route::post('loginibu',[ApiDaftaraknibu::class, 'login']);
// Route::get('/detaildata/{id}', [ApiDataorangtuadananak::class, 'show']);
// Route::put('/editdata/{id}', [ApiDataorangtuadananak::class, 'update']);


// Route::delete('/hapusdata/{id}', [ApiDataorangtuadananak::class, 'destroy']);

