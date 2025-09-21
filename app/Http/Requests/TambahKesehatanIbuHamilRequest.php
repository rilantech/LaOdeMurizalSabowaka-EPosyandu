<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahKesehatanIbuHamilRequest extends FormRequest
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
            'nik_ibuku' => 'required|max:30',
            'hari_pertama_haid_terakhir' => 'required|max:30',
            'riwayat_penyakit_yg_di_derita_ibu' => 'required|max:30',
            'hari_taksiran_persalinan' => 'required|max:30',
            'riwayat_alergi' => 'required|max:30',
            'golongan_darah' => 'required|max:5',
            'status_imunisasi_tetanus_terakhir' => 'required|max:30',
            'kehamilan_ke' => 'required|max:5',
            'penggunaan_kontrasepsi_sebelum_hamil' => 'required|max:30',
            'tinggi_badan' => 'required|max:10',
            'nama_pemeriksa' => 'required|max:50',
            'tanggal' => 'required|max:20',
            'keluhan' => 'required|max:100',
            'uk' => 'required|max:10',
            'bb' => 'required|max:10',
            'td' => 'required|max:10',
            'lila' => 'required|max:10',
            'tinggi_fundus' => 'required|max:10',
            'letak_janin' => 'required|max:30',
            'imunisasi' => 'required|max:30',
            'tablet_tambah_darah' => 'required|max:50',
            'lab' => 'required|max:50',
            'analisa' => 'required|max:100',
            'tata_laksana' => 'required|max:50',
            'konseling' => 'required|max:50',
            'catatan_tambahan' => 'required|max:50',
           
        ];
        
    }

    public function messages(): array
    {
        return [
            'nik_ibuku' => ':attribute Tidak Boleh Kosong',
            'hari_pertama_haid_terakhir' => ':attribute Tidak Boleh Kosong',
            'riwayat_penyakit_yg_di_derita_ibu' => ':attribute Tidak Boleh Kosong',
            'hari_taksiran_persalinan' => ':attribute Tidak Boleh Kosong',
            'riwayat_alergi' => ':attribute Tidak Boleh Kosong',
            'golongan_darah' => ':attribute Tidak Boleh Kosong',
            'status_imunisasi_tetanus_terakhir' => ':attribute Tidak Boleh Kosong',
            'kehamilan_ke' => ':attribute Tidak Boleh Kosong',
            'penggunaan_kontrasepsi_sebelum_hamil' => ':attribute Tidak Boleh Kosong',
            'tinggi_badan' => ':attribute Tidak Boleh Kosong',
            'nama_pemeriksa' => ':attribute Tidak Boleh Kosong',
            'tanggal' => ':attribute Tidak Boleh Kosong',
            'keluhan' => ':attribute Tidak Boleh Kosong',
            'uk' => ':attribute Tidak Boleh Kosong',
            'bb' => ':attribute Tidak Boleh Kosong',
            'td' => ':attribute Tidak Boleh Kosong',
            'lila' => ':attribute Tidak Boleh Kosong',
            'tinggi_fundus' => ':attribute Tidak Boleh Kosong',
            'letak_janin' => ':attribute Tidak Boleh Kosong',
            'imunisasi' => ':attribute Tidak Boleh Kosong',
            'tablet_tambah_darah' => ':attribute Tidak Boleh Kosong',
            'lab' => ':attribute Tidak Boleh Kosong',
            'analisa' => ':attribute Tidak Boleh Kosong',
            'tata_laksana' => ':attribute Tidak Boleh Kosong',
            'konseling' => ':attribute Tidak Boleh Kosong',
            'catatan_tambahan' => ':attribute Tidak Boleh Kosong',
            
                       

        ];
    }

    public function attributes(): array
    {
        return [
           
            'nik_ibuku' => 'NIK Ibu',
            'hari_pertama_haid_terakhir' => 'Hari Pertama Haid Terakhir',
            'riwayat_penyakit_yg_di_derita_ibu' => 'Riwayat Penyakit Yang Di Derita Ibu',
            'hari_taksiran_persalinan' => 'Hari Taksiran Persalinan',
            'riwayat_alergi' => 'Riwayat Alergi',
            'golongan_darah' => 'Golongan Darah',
            'status_imunisasi_tetanus_terakhir' => 'Status Imunisasi Tetanus Terakhir',
            'kehamilan_ke' => 'Kehamilan Ke',
            'penggunaan_kontrasepsi_sebelum_hamil' => 'Penggunaan Kontrasepsi Sebelum Hamil',
            'tinggi_badan' => 'Tinggi Badan',
            'nama_pemeriksa' => 'Nama Pemeriksa',
            'tanggal' => 'Tanggal',
            'keluhan' => 'Keluhan',
            'uk' => 'UK',
            'bb' => 'Tidak Boleh Kosong',
            'td' => 'Tidak Boleh Kosong',
            'lila' => 'Tidak Boleh Kosong',
            'tinggi_fundus' => 'Tidak Boleh Kosong',
            'letak_janin' => 'Tidak Boleh Kosong',
            'imunisasi' => 'Tidak Boleh Kosong',
            'tablet_tambah_darah' => 'Tidak Boleh Kosong',
            'lab' => 'Tidak Boleh Kosong',
            'analisa' => 'Tidak Boleh Kosong',
            'tata_laksana' => 'Tidak Boleh Kosong',
            'konseling' => 'Tidak Boleh Kosong',
            'catatan_tambahan' => 'Tidak Boleh Kosong',
            
          
        ];
    }

}
