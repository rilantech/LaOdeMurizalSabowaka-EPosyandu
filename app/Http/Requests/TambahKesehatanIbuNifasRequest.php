<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahKesehatanIbuNifasRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     */
    public function authorize(): bool
    {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, \Illuminate\Contracts\Validation\ValidationRule|array|string>
     */
    public function rules(): array
    {
        
        return [
            'nik_ibu' => 'required|max:30',
            'nama_anak' => 'required|max:30',
            'nifas_ke' => 'required|max:20',
            'status_nifas' => 'required|max:20',
            'kondisi_ibu_secara_umum_1' => 'required|max:30',
            'kondisi_ibu_secara_umum_2' => 'required|max:30',
            'kondisi_ibu_secara_umum_3' => 'required|max:30',
            'tekanan_darah_1' => 'required|max:30',
            'tekanan_darah_2' => 'required|max:30',
            'tekanan_darah_3' => 'required|max:30',
            'pendarahan_pervaginam_1' => 'required|max:30',
            'pendarahan_pervaginam_2' => 'required|max:30',
            'pendarahan_pervaginam_3' => 'required|max:30',
            'kondisi_perineum_1' => 'required|max:30',
            'kondisi_perineum_2' => 'required|max:30',
            'kondisi_perineum_3' => 'required|max:30',
            'tanda_infeksi_1' => 'required|max:30',
            'tanda_infeksi_2' => 'required|max:30',
            'tanda_infeksi_3' => 'required|max:30',
            'kontraksi_uteri_1' => 'required|max:30',
            'kontraksi_uteri_2' => 'required|max:30',
            'kontraksi_uteri_3' => 'required|max:30',
            'tinggi_fundus_uteri_1' => 'required|max:30',
            'tinggi_fundus_uteri_2' => 'required|max:30',
            'tinggi_fundus_uteri_3' => 'required|max:30',
            'lokhia_1' => 'required|max:30',
            'lokhia_2' => 'required|max:30',
            'lokhia_3' => 'required|max:30',
            'pemeriksaan_jalan_lahir_1' => 'required|max:30',
            'pemeriksaan_jalan_lahir_2' => 'required|max:30',
            'pemeriksaan_jalan_lahir_3' => 'required|max:30',
            'pemeriksaan_payudara_1' => 'required|max:30',
            'pemeriksaan_payudara_2' => 'required|max:30',
            'pemeriksaan_payudara_3' => 'required|max:30',
            'produksi_asi_1' => 'required|max:30',
            'produksi_asi_2' => 'required|max:30',
            'produksi_asi_3' => 'required|max:30',
            'pemberian_kapsul_vitamin_a_1' => 'required|max:30',
            'pemberian_kapsul_vitamin_a_2' => 'required|max:30',
            'pemberian_kapsul_vitamin_a_3' => 'required|max:30',
            'pelayanan_kontrasepsi_1' => 'required|max:30',
            'pelayanan_kontrasepsi_2' => 'required|max:30',
            'pelayanan_kontrasepsi_3' => 'required|max:30',
            'penanganan_resiko_tinggi_1' => 'required|max:30',
            'penanganan_resiko_tinggi_2' => 'required|max:30',
            'penanganan_resiko_tinggi_3' => 'required|max:30',
            'buang_air_besar_1' => 'required|max:30',
            'buang_air_besar_2' => 'required|max:30',
            'buang_air_besar_3' => 'required|max:30',
            'buang_air_kecil_1' => 'required|max:30',
            'buang_air_kecil_2' => 'required|max:30',
            'buang_air_kecil_3' => 'required|max:30',
            'catatan_dokter_1' => 'required|max:30',
            'catatan_dokter_2' => 'required|max:30',
            'catatan_dokter_3' => 'required|max:30',
           
        ];
        
    }

    public function messages(): array
    {
        return [
        'nik_ibu' => ':attribute Tidak Boleh Kosong',
            'nama_anak' => ':attribute Tidak Boleh Kosong',
            'nifas_ke' => ':attribute Tidak Boleh Kosong',
            'status_nifas' => ':attribute Tidak Boleh Kosong',
            'kondisi_ibu_secara_umum_1' => ':attribute Tidak Boleh Kosong',
            'kondisi_ibu_secara_umum_2' => ':attribute Tidak Boleh Kosong',
            'kondisi_ibu_secara_umum_3' => ':attribute Tidak Boleh Kosong',
            'tekanan_darah_1' => ':attribute Tidak Boleh Kosong',
            'tekanan_darah_2' => ':attribute Tidak Boleh Kosong',
            'tekanan_darah_3' => ':attribute Tidak Boleh Kosong',
            'pendarahan_pervaginam_1' => ':attribute Tidak Boleh Kosong',
            'pendarahan_pervaginam_2' => ':attribute Tidak Boleh Kosong',
            'pendarahan_pervaginam_3' => ':attribute Tidak Boleh Kosong',
            'kondisi_perineum_1' => ':attribute Tidak Boleh Kosong',
            'kondisi_perineum_2' => ':attribute Tidak Boleh Kosong',
            'kondisi_perineum_3' => ':attribute Tidak Boleh Kosong',
            'tanda_infeksi_1' => ':attribute Tidak Boleh Kosong',
            'tanda_infeksi_2' => ':attribute Tidak Boleh Kosong',
            'tanda_infeksi_3' => ':attribute Tidak Boleh Kosong',
            'kontraksi_uteri_1' => ':attribute Tidak Boleh Kosong',
            'kontraksi_uteri_2' => ':attribute Tidak Boleh Kosong',
            'kontraksi_uteri_3' => ':attribute Tidak Boleh Kosong',
            'tinggi_fundus_uteri_1' => ':attribute Tidak Boleh Kosong',
            'tinggi_fundus_uteri_2' => ':attribute Tidak Boleh Kosong',
            'tinggi_fundus_uteri_3' => ':attribute Tidak Boleh Kosong',
            'lokhia_1' => ':attribute Tidak Boleh Kosong',
            'lokhia_2' => ':attribute Tidak Boleh Kosong',
            'lokhia_3' => ':attribute Tidak Boleh Kosong',
            'pemeriksaan_jalan_lahir_1' => ':attribute Tidak Boleh Kosong',
            'pemeriksaan_jalan_lahir_2' => ':attribute Tidak Boleh Kosong',
            'pemeriksaan_jalan_lahir_3' => ':attribute Tidak Boleh Kosong',
            'pemeriksaan_payudara_1' => ':attribute Tidak Boleh Kosong',
            'pemeriksaan_payudara_2' => ':attribute Tidak Boleh Kosong',
            'pemeriksaan_payudara_3' => ':attribute Tidak Boleh Kosong',
            'produksi_asi_1' => ':attribute Tidak Boleh Kosong',
            'produksi_asi_2' => ':attribute Tidak Boleh Kosong',
            'produksi_asi_3' => ':attribute Tidak Boleh Kosong',
            'pemberian_kapsul_vitamin_a_1' => ':attribute Tidak Boleh Kosong',
            'pemberian_kapsul_vitamin_a_2' => ':attribute Tidak Boleh Kosong',
            'pemberian_kapsul_vitamin_a_3' => ':attribute Tidak Boleh Kosong',
            'pelayanan_kontrasepsi_1' => ':attribute Tidak Boleh Kosong',
            'pelayanan_kontrasepsi_2' => ':attribute Tidak Boleh Kosong',
            'pelayanan_kontrasepsi_3' => ':attribute Tidak Boleh Kosong',
            'penanganan_resiko_tinggi_1' => ':attribute Tidak Boleh Kosong',
            'penanganan_resiko_tinggi_2' => ':attribute Tidak Boleh Kosong',
            'penanganan_resiko_tinggi_3' => ':attribute Tidak Boleh Kosong',
            'buang_air_besar_1' => ':attribute Tidak Boleh Kosong',
            'buang_air_besar_2' => ':attribute Tidak Boleh Kosong',
            'buang_air_besar_3' => ':attribute Tidak Boleh Kosong',
            'buang_air_kecil_1' => ':attribute Tidak Boleh Kosong',
            'buang_air_kecil_2' => ':attribute Tidak Boleh Kosong',
            'buang_air_kecil_3' => ':attribute Tidak Boleh Kosong',
            'catatan_dokter_1' => ':attribute Tidak Boleh Kosong',
            'catatan_dokter_2' => ':attribute Tidak Boleh Kosong',
            'catatan_dokter_3' => ':attribute Tidak Boleh Kosong',

           
            
        ];
    }

    public function attributes(): array
    {
        return [
            'nama_anak' => 'Nama Anak',
            'nifas_ke' => 'Nifas Ke',
            'status_nifas' => 'Status Nifas',
            // <!-- 'kondisi_ibu_secara_umum_1' => 'Kondisi Ibu Secara Umum',
            // 'kondisi_ibu_secara_umum_2' => ':attribute Tidak Boleh Kosong',
            // 'kondisi_ibu_secara_umum_3' => ':attribute Tidak Boleh Kosong',
            // 'tekanan_darah_1' => ':attribute Tidak Boleh Kosong',
            // 'tekanan_darah_2' => ':attribute Tidak Boleh Kosong',
            // 'tekanan_darah_3' => ':attribute Tidak Boleh Kosong',
            // 'pendarahan_pervaginam_1' => ':attribute Tidak Boleh Kosong',
            // 'pendarahan_pervaginam_2' => ':attribute Tidak Boleh Kosong',
            // 'pendarahan_pervaginam_3' => ':attribute Tidak Boleh Kosong',
            // 'kondisi_perineum_1' => ':attribute Tidak Boleh Kosong',
            // 'kondisi_perineum_2' => ':attribute Tidak Boleh Kosong',
            // 'kondisi_perineum_3' => ':attribute Tidak Boleh Kosong',
            // 'tanda_infeksi_1' => ':attribute Tidak Boleh Kosong',
            // 'tanda_infeksi_2' => ':attribute Tidak Boleh Kosong',
            // 'tanda_infeksi_3' => ':attribute Tidak Boleh Kosong',
            // 'tinggi_fundus_uteri_1' => ':attribute Tidak Boleh Kosong',
            // 'tinggi_fundus_uteri_2' => ':attribute Tidak Boleh Kosong',
            // 'tinggi_fundus_uteri_3' => ':attribute Tidak Boleh Kosong',
            // 'lokhia_1' => ':attribute Tidak Boleh Kosong',
            // 'lokhia_2' => ':attribute Tidak Boleh Kosong',
            // 'lokhia_3' => ':attribute Tidak Boleh Kosong',
            // 'pemeriksaan_jalan_lahir_1' => ':attribute Tidak Boleh Kosong',
            // 'pemeriksaan_jalan_lahir_2' => ':attribute Tidak Boleh Kosong',
            // 'pemeriksaan_jalan_lahir_3' => ':attribute Tidak Boleh Kosong',
            // 'pemeriksaan_payudara_1' => ':attribute Tidak Boleh Kosong',
            // 'pemeriksaan_payudara_2' => ':attribute Tidak Boleh Kosong',
            // 'pemeriksaan_payudara_3' => ':attribute Tidak Boleh Kosong',
            // 'produksi_asi_1' => ':attribute Tidak Boleh Kosong',
            // 'produksi_asi_2' => ':attribute Tidak Boleh Kosong',
            // 'produksi_asi_3' => ':attribute Tidak Boleh Kosong',
            // 'pemberian_kapsul_vitamin_a_1' => ':attribute Tidak Boleh Kosong',
            // 'pemberian_kapsul_vitamin_a_2' => ':attribute Tidak Boleh Kosong',
            // 'pemberian_kapsul_vitamin_a_3' => ':attribute Tidak Boleh Kosong',
            // 'pelayanan_kontrasepsi_1' => ':attribute Tidak Boleh Kosong',
            // 'pelayanan_kontrasepsi_2' => ':attribute Tidak Boleh Kosong',
            // 'pelayanan_kontrasepsi_3' => ':attribute Tidak Boleh Kosong',
            // 'penanganan_resiko_tinggi_1' => ':attribute Tidak Boleh Kosong',
            // 'penanganan_resiko_tinggi_2' => ':attribute Tidak Boleh Kosong',
            // 'penanganan_resiko_tinggi_3' => ':attribute Tidak Boleh Kosong',
            // 'buang_air_besar_1' => ':attribute Tidak Boleh Kosong',
            // 'buang_air_besar_2' => ':attribute Tidak Boleh Kosong',
            // 'buang_air_besar_3' => ':attribute Tidak Boleh Kosong',
            // 'buang_air_kecil_1' => ':attribute Tidak Boleh Kosong',
            // 'buang_air_kecil_2' => ':attribute Tidak Boleh Kosong',
            // 'buang_air_kecil_3' => ':attribute Tidak Boleh Kosong',
            // 'catatan_dokter_1' => ':attribute Tidak Boleh Kosong',
            // 'catatan_dokter_2' => ':attribute Tidak Boleh Kosong',
            // 'catatan_dokter_3' => ':attribute Tidak Boleh Kosong', -->

            'nik_ibu' => 'NIK Ibu',
            'nama_anak' => 'Tanggal Persalinan',
            'nifas_ke' => 'Nifas Ke',
            'umur_kehamilan' => 'Umur Kehamilan',
            'penolong_persalinan' => 'Penolong Persalinan',
            'cara_persalinan' => 'Cara Persalinan',
            'keadaan_ibu' => 'Keadaan Ibu',
            'anak_ke' => 'Anak Ke',
            'berat_lahir' => 'Berat Lahir',
            'panjang_badan' => 'Panjang Badan',
            'lingkar_kepala' => 'Lingkar Kepala',
            'jenis_kelamin' => 'Jenis Kelamin',
            'kondisi_bayi_saat_lahir' => 'Kondisi Bayi Saat Lahir',
            'asuhan_bayi_baru_lahir' => 'Asuhan Bayi Baru Lahir'
           
        ];
    }

}
