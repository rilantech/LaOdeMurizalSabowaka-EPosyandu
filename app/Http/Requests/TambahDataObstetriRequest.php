<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahDataObstetriRequest extends FormRequest
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
            'kehamilan_ke' => 'required|max:5',
            'tahun' => 'required|max:500',
            'status_lahir_hidup' => 'required|max:10',
            'status_lahir_aterm' => 'required|max:10',
            'status_lahir_spontan' => 'required|max:10',
            'berat_lahir' => 'required|max:10',
            'tempat_bersalin' => 'required|max:10',
            'kondisi_anak' => 'required|max:50',
            'komplikasi_kehamilan' => 'required|max:50',

           
        ];
        
    }

    public function messages(): array
    {
        return [
            'nik_ibu.required' => ':attribute Tidak Boleh Kosong',
            'kehamilan_ke.required' => ':attribute Tidak Boleh Kosong',
            'tahun.required' => ':attribute Tidak Boleh Kosong',
            'status_lahir_hidup.required' => ':attribute Tidak Boleh Kosong',
            'status_lahir_aterm.required' => ':attribute Tidak Boleh Kosong',
            'status_lahir_spontan.required' => ':attribute Tidak Boleh Kosong',
            'berat_lahir.required' => ':attribute Tidak Boleh Kosong',
            'tempat_bersalin.required' => ':attribute Tidak Boleh Kosong',
            'kondisi_anak.required' => ':attribute Tidak Boleh Kosong',
            'komplikasi_kehamilan.required' => ':attribute Tidak Boleh Kosong',
            
                       

        ];
    }

    public function attributes(): array
    {
        return [
           
            'nik_ibu' => 'NIK Ibu',
            'kehamilan_ke' => 'Kehamilan Ke-',
            'tahun' => 'Tahun',
            'status_lahir_hidup' => 'Status Lahir Hidup',
            'status_lahir_aterm' => 'Status Lahir Aterm',
            'status_lahir_spontan' => 'Status Lahir Spontan',
            'berat_lahir' => 'Berat Lahir',
            'tempat_bersalin' => 'Tempat Bersalin',
            'kondisi_anak' => 'Kondisi Anak',
            'komplikasi_kehamilan' => 'Komplikasi Kehamilan',
        ];
    }

}
