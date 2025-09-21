<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahImunisasiAnakRequest extends FormRequest
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
            
        ];
    }

}
