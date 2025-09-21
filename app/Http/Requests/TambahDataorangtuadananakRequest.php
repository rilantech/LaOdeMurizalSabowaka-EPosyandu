<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TambahDataorangtuadananakRequest extends FormRequest
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
            'nama_ibu' => 'required|max:100',
            'nik' => 'required|max:30',
            'tempat_atau_tanggal_lahir_ibu' => 'required|max:50',
            'tempat_lahir_ibu' => 'required|max:30',
            'tanggal_lahir_ibu' => 'required|max:30',
            'agama_ibu' => 'required|max:19',
            'pendidikan_ibu' => 'required|max:50',
            'golongan_darah_ibu' => 'required|max:5',
            'pekerjaan_ibu' => 'required|max:30',
            'no_jkn_bpjs' => 'required|max:30',
            'nama_ayah' => 'required|max:100',
            'tempat_atau_tanggal_lahir_ayah' => 'required|max:50',
            'tempat_lahir_ayah' => 'required|max:30',
            'tanggal_lahir_ayah' => 'required|max:30',
            'agama_ayah' => 'required|max:20',
            'pendidikan_ayah' => 'required|max:50',
            'golongan_darah_ayah' => 'required|max:5',
            'pekerjaan_ayah' => 'required|max:30',
            'alamat_rumah' => 'required|max:100',
            'kecamatan' => 'required|max:30',
            'kabupaten_atau_kota' => 'required|max:30',
            'no_telepon' => 'required|max:30',
            'nama_ayah' => 'required|max:100',
            'nama_anak' => 'required|max:100',
            'jenis_kelamin' => 'required|max:100',
            'tempat_atau_tanggal_lahir_anak' => 'required|max:50',
            'tempat_lahir_anak' => 'required|max:30',
            'tanggal_lahir_anak' => 'required|max:30',
            'anak_ke' => 'required|max:5',
            'dari' => 'required|max:5',
            'no_akta_kelahiran' => 'required|max:30',
            'no_jkn_bpjs_anak' => 'required|max:30',
            'nama_anak2' => 'required|max:100',
            'jenis_kelamin2' => 'required|max:100',
            'tempat_atau_tanggal_lahir_anak2' => 'required|max:50',
            'anak_ke2' => 'required|max:5',
            'dari2' => 'required|max:5',
            'no_akta_kelahiran2' => 'required|max:30',
            'no_jkn_bpjs_anak2' => 'required|max:30',
        ];
        
    }

    public function messages(): array
    {
        return [
            'nama_ibu' => ':attribute Tidak Boleh Kosong',
            'nik' => ':attribute Tidak Boleh Kosong',
            'tempat_atau_tanggal_lahir_ibu' => ':attribute Tidak Boleh Kosong',
            'tempat_lahir_ibu' => ':attribute Tidak Boleh Kosong',
            'tanggal_lahir_ibu' => ':attribute Tidak Boleh Kosong',
            'agama_ibu' => ':attribute Tidak Boleh Kosong',
            'pendidikan_ibu' =>':attribute Tidak Boleh Kosong',
            'golongan_darah_ibu' => ':attribute Tidak Boleh Kosong',
            'pekerjaan_ibu' => ':attribute Tidak Boleh Kosong',
            'no_jkn_bpjs' => ':attribute Tidak Boleh Kosong',
            'nama_ayah' => ':attribute Tidak Boleh Kosong',
            'jenis_kelamin' => ':attribute Tidak Boleh Kosong',
            'tempat_atau_tanggal_lahir_ayah' =>':attribute Tidak Boleh Kosong',
            'tempat_lahir_ayah' => ':attribute Tidak Boleh Kosong',
            'tanggal_lahir_ayah' => ':attribute Tidak Boleh Kosong',
            'agama_ayah' => ':attribute Tidak Boleh Kosong',
            'pendidikan_ayah' => ':attribute Tidak Boleh Kosong',
            'golongan_darah_ayah' => ':attribute Tidak Boleh Kosong',
            'pekerjaan_ayah' => ':attribute Tidak Boleh Kosong',
            'alamat_rumah' => ':attribute Tidak Boleh Kosong',
            'kecamatan' => ':attribute Tidak Boleh Kosong',
            'kabupaten_atau_kota' => ':attribute Tidak Boleh Kosong',
            'no_telepon' => ':attribute Tidak Boleh Kosong',
            'nama_anak' => ':attribute Tidak Boleh Kosong',
             'jenis_kelamin' => 'Jenis Kelamin',
            'tempat_atau_tanggal_lahir_anak' => ':attribute Tidak Boleh Kosong',
            'tempat_lahir_anak' => ':attribute Tidak Boleh Kosong',
            'tanggal_lahir_anak' => ':attribute Tidak Boleh Kosong',
            'anak_ke' => ':attribute Tidak Boleh Kosong',
            'dari' => ':attribute Tidak Boleh Kosong',
            'no_akta_kelahiran' => ':attribute Tidak Boleh Kosong',
            'no_jkn_bpjs_anak' => ':attribute Tidak Boleh Kosong',
            'nama_anak2' => ':attribute Tidak Boleh Kosong',
            'tempat_atau_tanggal_lahir_anak2' => ':attribute Tidak Boleh Kosong',
            'anak_ke2' => ':attribute Tidak Boleh Kosong',
            'dari2' => ':attribute Tidak Boleh Kosong',
            'no_akta_kelahiran2' => ':attribute Tidak Boleh Kosong',
            'no_jkn_bpjs_anak2' => ':attribute Tidak Boleh Kosong',
            

        ];
    }

    public function attributes(): array
    {
        return [
            'nama_ibu' => 'Nama Ibu',
            'nik' => 'NIK',
            'tempat_atau_tanggal_lahir_ibu' => 'Tempat/Tanggal Lahir Ibu',
            'tempat_lahir_ibu' => 'Tempat Lahir Ibu',
            'tanggal_lahir_ibu' => 'Tanggal Lahir Ibu',
            'agama_ibu' => 'Agama Ibu',
            'pendidikan_ibu' =>'Pendidikan Ibu',
            'golongan_darah_ibu' => 'Golongan Darah Ibu',
            'pekerjaan_ibu' => 'Pekerjaan Ibu',
            'no_jkn_bpjs' => 'No. JKN/BPJS',
            'nama_ayah' => 'Nama Ayah',
            'tempat_atau_tanggal_lahir_ayah' =>'Tempat/Tanggal Lahir Ayah',
            'tempat_lahir_ayah' => 'Tempat Lahir Ayah',
            'tanggal_lahir_ayah' => 'Tanggal Lahir Ayah',
            'agama_ayah' => 'Agama Ayah',
            'pendidikan_ayah' => 'Pendidikan Ayah',
            'golongan_darah_ayah' => 'Golongan Darah Ayah',
            'pekerjaan_ayah' => 'Pekerjaan Ayah',
            'alamat_rumah' => 'Alamat Rumah',
            'kecamatan' => 'Kecamatan',
            'kabupaten_atau_kota' => 'Kabupaten/Kota',
            'no_telepon' => 'No. Telp. Yang Bisa Di Hubungi',
            'nama_anak' => 'Nama Anak',
            'jenis_kelamin' => 'Jenis Kelamin',
            'tempat_atau_tanggal_lahir_anak' => 'Tempat/Tanggal Lahir Anak',
            'tempat_lahir_anak' => 'Tempat Lahir Anak',
            'tanggal_lahir_anak' => 'Tanggal Lahir Anak',
            'anak_ke' => 'Anak Ke',
            'dari' => 'Dari',
            'no_akta_kelahiran' => 'No. Akte Kelahiran',
            'no_jkn_bpjs_anak' => 'No. JKN/BPJS',
            'nama_anak2' => 'Nama Anak',
            'tempat_atau_tanggal_lahir_anak2' => 'Tempat/Tanggal Lahir Anak',
            'anak_ke2' => 'Anak Ke',
            'dari2' => 'Dari',
            'no_akta_kelahiran2' => 'No. Akte Kelahiran',
            'no_jkn_bpjs_anak2' => 'No. JKN/BPJS',
            
        ];
    }

}
