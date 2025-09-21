<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahKesehatanIbuBersalinRequest extends FormRequest
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
            'tanggal_persalinan' => 'required|max:30',
            'pukul' => 'required|max:20',
            'umur_kehamilan' => 'required|max:20',
            'penolong_persalinan' => 'required|max:30',
            'cara_persalinan' => 'required|max:30',
            'keadaan_ibu' => 'required|max:50',
            'anak_ke' => 'required|max:5',
            'berat_lahir' => 'required|max:20',
            'panjang_badan' => 'required|max:20',
            'lingkar_kepala' => 'required|max:20',
            'jenis_kelamin' => 'required|max:15',
            'kondisi_bayi_saat_lahir' => 'required|max:100',
            'asuhan_bayi_baru_lahir' => 'required|max:100'
           
        ];
        
    }

    public function messages(): array
    {
        return [
            'nik_ibu' => ':attribute Tidak Boleh Kosong',
            'tanggal_persalinan' => ':attribute Tidak Boleh Kosong',
            'pukul' => ':attribute Tidak Boleh Kosong',
            'umur_kehamilan' => ':attribute Tidak Boleh Kosong',
            'penolong_persalinan' => ':attribute Tidak Boleh Kosong',
            'cara_persalinan' => ':attribute Tidak Boleh Kosong',
            'keadaan_ibu' => ':attribute Tidak Boleh Kosong',
            'anak_ke' => ':attribute Tidak Boleh Kosong',
            'berat_lahir' => ':attribute Tidak Boleh Kosong',
            'panjang_badan' => ':attribute Tidak Boleh Kosong',
            'lingkar_kepala' => ':attribute Tidak Boleh Kosong',
            'jenis_kelamin' => ':attribute Tidak Boleh Kosong',
            'kondisi_bayi_saat_lahir' => ':attribute Tidak Boleh Kosong',
            'asuhan_bayi_baru_lahir' => ':attribute Tidak Boleh Kosong'
            
        ];
    }

    public function attributes(): array
    {
        return [
            
            'nik_ibu' => 'NIK Ibu',
            'tanggal_persalinan' => 'Tanggal Persalinan',
            'pukul' => 'Pukul',
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
