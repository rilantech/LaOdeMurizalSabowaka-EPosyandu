<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahKesehatanBayiBaruLahirRequest extends FormRequest
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
            'nama_ibu' => 'required|max:30',
            'nama_ayah' => 'required|max:20',
            'nama_anak' => 'required|max:20',
            'anak_ke' => 'required|max:30',
            // 'tanggal_kunjungan_1' => 'required|max:30',
            // 'tanggal_kunjungan_2' => 'required|max:30',
            // 'tanggal_kunjungan_3' => 'required|max:30',
            'berat_badan_1' => 'required|max:30',
            'berat_badan_2' => 'required|max:30',
            'berat_badan_3' => 'required|max:30',
            'panjang_badan_1' => 'required|max:30',
            'panjang_badan_2' => 'required|max:30',
            'panjang_badan_3' => 'required|max:30',
            'suhu_1' => 'required|max:30',
            'suhu_2' => 'required|max:30',
            'suhu_3' => 'required|max:30',
            'dan_lain_lain_1' => 'required|max:30',
            'dan_lain_lain_2' => 'required|max:30',
            'dan_lain_lain_3' => 'required|max:30'
        ];
        
    }

    public function messages(): array
    {
        return [
            'nik_ibu' => ':attribute Tidak Boleh Kosong',
            'nama_ibu' => ':attribute Tidak Boleh Kosong',
            'nama_ayah' => ':attribute Tidak Boleh Kosong',
            'nama_anak' => ':attribute Tidak Boleh Kosong',
            'anak_ke' => ':attribute Tidak Boleh Kosong',
            // 'tanggal_kunjungan_1' => ':attribute Tidak Boleh Kosong',
            // 'tanggal_kunjungan_2' => ':attribute Tidak Boleh Kosong',
            // 'tanggal_kunjungan_3' => ':attribute Tidak Boleh Kosong',
            'berat_badan_1' => ':attribute Tidak Boleh Kosong',
            'berat_badan_2' => ':attribute Tidak Boleh Kosong',
            'berat_badan_3' => ':attribute Tidak Boleh Kosong',
            'panjang_badan_1' => ':attribute Tidak Boleh Kosong',
            'panjang_badan_2' => ':attribute Tidak Boleh Kosong',
            'panjang_badan_3' => ':attribute Tidak Boleh Kosong',
            'suhu_1' => ':attribute Tidak Boleh Kosong',
            'suhu_2' => ':attribute Tidak Boleh Kosong',
            'suhu_3' => ':attribute Tidak Boleh Kosong',
            'dan_lain_lain_1' => ':attribute Tidak Boleh Kosong',
            'dan_lain_lain_2' => ':attribute Tidak Boleh Kosong',
            'dan_lain_lain_3' => ':attribute Tidak Boleh Kosong'
            
        ];
    }

    public function attributes(): array
    {
        return [
            
            'nik_ibu' => 'NIK Ibu',
            'nama_ibu' => 'Nama Ibu',
            'nama_ayah' => 'Nama Ayah',
            'nama_anak' => 'Nama Anak',
            'anak_ke' => 'Anak Ke',
            // 'tanggal_kunjungan_1' => 'Tanggal Kunjungan 1',
            // 'tanggal_kunjungan_2' => 'Tanggal Kunjungan 2',
            // 'tanggal_kunjungan_3' => 'Tanggal Kunjungan 3',
            'berat_badan_1' => 'Berat Badan 1',
            'berat_badan_2' => 'Berat Badan 2',
            'berat_badan_3' => 'Berat Badan 3',
            'panjang_badan_1' => 'Panjang Badan 1',
            'panjang_badan_2' => 'Panjang Badan 2',
            'panjang_badan_3' => 'Panjang Badan 3',
            'suhu_1' => 'Suhu 1',
            'suhu_2' => 'Suhu 2',
            'suhu_3' => 'Suhu 3',
            'dan_lain_lain_1' => 'Dan Lain-Lain 1',
            'dan_lain_lain_2' => 'Dan Lain-Lain 2',
            'dan_lain_lain_3' => 'Dan Lain-Lain 3'
           
        ];
    }

}
