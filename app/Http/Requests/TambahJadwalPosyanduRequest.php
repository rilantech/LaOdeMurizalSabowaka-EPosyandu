<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahJadwalPosyanduRequest extends FormRequest
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
            'agenda' => 'required|max:500',
            'tanggal' => 'required|max:5000',
            'jam' => 'required|max:500',
           
        ];
        
    }

    public function messages(): array
    {
        return [
            'agenda.required' => ':attribute Tidak Boleh Kosong',
            'tanggal.required' => ':attribute Tidak Boleh Kosong',
            'jam.required' => ':attribute Tidak Boleh Kosong',
                       

        ];
    }

    public function attributes(): array
    {
        return [
           
            'agenda' => 'Nama Agenda',
            'tanggal' => 'Tanggal Pelaksanaan',
            'jam' => 'Jam Pelaksanaan',
           
        ];
    }

}
