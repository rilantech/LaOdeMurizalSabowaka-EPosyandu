<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahAkunPetugasRequest extends FormRequest
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
            'nama' => 'required|max:50',
            'nik' => 'required|max:50',
            'username' => 'required|max:20',
            'password' => 'required|max:20',
            'alamat' => 'required|max:100',
            'nomor_hp' => 'required|max:15',
           
        ];
        
    }

    public function messages(): array
    {
        return [
            'nama.required' => ':attribute Tidak Boleh Kosong',
            'nik.required' => ':attribute Tidak Boleh Kosong',
            'username.required' => ':attribute Tidak Boleh Kosong',
            'password.required' => ':attribute Tidak Boleh Kosong',
            'alamat.required' => ':attribute Tidak Boleh Kosong',
            'nomor_hp.required' => ':attribute Tidak Boleh Kosong',
                       

        ];
    }

    public function attributes(): array
    {
        return [
           
            'nama' => 'Nama',
            'nik' => 'NIK',
            'username' => 'Username',
            'password' => 'Password',
            'alamat' => 'Alamat',
            'nomor_hp' => 'Nomor HP',
           
        ];
    }

}
