@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Detail Data Orang Tua & Anak</h4>
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-md-12 mx-auto mt-2 p-5">
                        <div class="card" style="background-color: #4DA8DA;">
                          <div class="col-12 mt-4">
                            <h4 class="text-center">Data Ibu</h4>
                        </div>
                            <form class="form-horizontal" id="form1" method="post" action='{{ url('dataorangtuadananak/'.$id) }}'>
                                @csrf
                                @method('PUT')
                                <div class="card-body">
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="nik" class="col-12">Nama</label>
                                        <input type="text" id="id"
                  placeholder="Masukan Nama Anak..." name="id" value="{{ $id }}"  hidden>
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                                placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}"  autofocus autocomplete="off">
                                                @error('nama_ibu')
                                                <div class="invalid-feedback">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                           
                                       </div>
                                    </div>
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="agama_ibu" class="col-12">Agama</label>
                                        <select class="form-select @error('agama_ibu') is-invalid @enderror"  aria-label="Default select example" name="agama_ibu" id="agama_ibu">
                                          <option selected>{{ $agama_ibu }}</option>
                                          <option value= "Islam" {{ old('agama_ibu') }}>Islam</option>
                                          <option value= "Kristen" {{ old('agama_ibu') }}>Kristen</option>
                                          <option value= "Hindu" {{ old('agama_ibu') }}>Hindu</option>
                                          </select>
                                          @error('agama_ibu')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                                       </div>
                                    </div>
                                  </div>
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="nik" class="col-12">NIK</label>
                                        <input type="text" class="form-control  @error('nik') is-invalid @enderror" id="nik"
                                                placeholder="Masukan NIK..." name="nik" value="{{ $nik }}"  autofocus autocomplete="off">
                                                @error('nik')
                                                <div class="invalid-feedback">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                           
                                       </div>
                                    </div>
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="pendidikan_ibu" class="col-12">Pendidikan</label>
                                        <select class="form-select @error('pendidikan_ibu') is-invalid @enderror"  aria-label="Default select example" name="pendidikan_ibu" id="pendidikan_ibu">
                                          <option selected>{{ $pendidikan_ibu }}</option>
                                          <option value= "TK/Sederajat" {{ old('pendidikan_ibu') }}>TK/Sederajat</option>
                                          <option value= "SD/Sederajat" {{ old('pendidikan_ibu') }}>SD/Sederajat</option>
                                          <option value= "SMP/Sederajat" {{ old('pendidikan_ibu') }}>SMP/Sederajat</option>
                                          <option value= "SMA/Sederajat" {{ old('pendidikan_ibu') }}>SMA/Sederajat</option>
                                          </select>
                                          @error('pendidikan_ibu')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                                       </div>
                                    </div>
                                  </div>
                                  <div class="row">
                                   <div class="col-6">
                                      <div class="form-group">
                                        <label for="tempat_atau_tanggal_lahir_ibu" class="col-12">Tempat/Tanggal Lahir</label>
                                         <div class="row">
                                   <div class="col-6">
                                    <input type="text" class="form-control  @error('tempat_lahir_ibu') is-invalid @enderror" id="anak_ke"
                                    placeholder="Tempat..." name="tempat_lahir_ibu" value="{{ $tempat_lahir_ibu }}"  autofocus autocomplete="off">
                                    @error('tempat_lahir_ibu')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                   </div>
                                   <div class="col-1">
                                    <label for="dari" class="col-12">/</label>
                                   </div>
                                   <div class="col-5">
                                    <input type="date" class="form-control  @error('tanggal_lahir_ibu') is-invalid @enderror" id="datepicker" 
                                    placeholder="Tanggal" data-date-format="dd-mm-yyyy" name="tanggal_lahir_ibu" value="{{ $tanggal_lahir_ibu }}" />
                                    @error('tanggal_lahir_ibu')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
        <!--                        <script>-->
     
        <!--     $('#datepicker').datepicker({-->
        <!--    uiLibrary: 'bootstrap5',-->
        <!--    format: 'dd/mm/yyyy'-->
        <!--        });-->
                

        
        <!--</script>-->
                                   </div>
                                       </div>
                                    </div>
                                    </div>
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="golongan_darah_ibu" class="col-12">Golongan Darah</label>
                                        <input type="text" class="form-control  @error('golongan_darah_ibu') is-invalid @enderror" id="golongan_darah_ibu"
                                                placeholder="Masukan Golongan Darah Ibu..." name="golongan_darah_ibu" value="{{ $golongan_darah_ibu }}"  autofocus autocomplete="off">
                                                @error('golongan_darah_ibu')
                                                <div class="invalid-feedback">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                           
                                       </div>
                                    </div>
                                   
                                  </div>
                                  <div class="row">
                                    
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="pekerjaan_ibu" class="col-12">Pekerjaan</label>
                                        <input type="text" class="form-control  @error('pekerjaan_ibu') is-invalid @enderror" id="pekerjaan_ibu"
                                                placeholder="Masukan Pekerjaan Ibu..." name="pekerjaan_ibu" value="{{ $pekerjaan_ibu }}"  autofocus autocomplete="off">
                                                @error('pekerjaan_ibu')
                                                <div class="invalid-feedback">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                           
                                       </div>
                                    </div>
                                  
                                  <div class="col-6">
                                    <div class="form-group">
                                      <label for="no_jkn_bpjs" class="col-12">No. JKN/BPJS</label>
                                      <input type="text" class="form-control  @error('no_jkn_bpjs') is-invalid @enderror" id="no_jkn_bpjs"
                                              placeholder="Masukan No. JKN/BPJS..." name="no_jkn_bpjs" value="{{ $no_jkn_bpjs }}"  autofocus autocomplete="off">
                                              @error('no_jkn_bpjs')
                                              <div class="invalid-feedback">
                                                {{ $message }}
                                              </div>
                                          @enderror
                                         
                                     </div>
                                  </div>
                                
                                
                                </div>
                                </div>
                               
                                
                           
                        </div>
                    </div>
                </div>

                <div class="row" style="margin-top: -100px;">
                  <div class="col-md-12 mx-auto p-5">
                      <div class="card" style="background-color: #4DA8DA;">
                        <div class="col-12 mt-4">
                          <h4 class="text-center">Data Suami</h4>
                      </div>
                     
                              <div class="card-body">
                                <div class="row">
                                  <div class="col-6">
                                    <div class="form-group">
                                      <label for="nama_ayah" class="col-12">Nama</label>
                                      <input type="text" class="form-control  @error('nama_ayah') is-invalid @enderror" id="nama_ayah"
                                              placeholder="Masukan Nama Suami..." name="nama_ayah" value="{{ $nama_ayah }}"  autofocus autocomplete="off">
                                              @error('nama_ayah')
                                              <div class="invalid-feedback">
                                                {{ $message }}
                                              </div>
                                          @enderror
                                         
                                     </div>
                                  </div>
                                  <div class="col-6">
                                    <div class="form-group">
                                      <label for="pendidikan_ayah" class="col-12">Pendidikan</label>
                                      <select class="form-select @error('pendidikan_ayah') is-invalid @enderror"  aria-label="Default select example" name="pendidikan_ayah" id="pendidikan_ayah">
                                        <option selected>{{ $pendidikan_ayah }}</option>
                                        <option value= "TK/Sederajat" {{ old('pendidikan_ayah') }}>TK/Sederajat</option>
                                        <option value= "SD/Sederajat" {{ old('pendidikan_ayah') }}>SD/Sederajat</option>
                                        <option value= "SMP/Sederajat" {{ old('pendidikan_ayah') }}>SMP/Sederajat</option>
                                        <option value= "SMA/Sederajat" {{ old('pendidikan_ayah') }}>SMA/Sederajat</option>
                                        </select>
                                        @error('pendidikan_ayah')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                     </div>
                                  </div>
                                </div>
                                <div class="row">
                                        <div class="col-6">
                                      <div class="form-group">
                                        <label for="tempat_atau_tanggal_lahir_ibu" class="col-12">Tempat/Tanggal Lahir</label>
                                         <div class="row">
                                   <div class="col-6">
                                    <input type="text" class="form-control  @error('tempat_lahir_ayah') is-invalid @enderror" id="anak_ke"
                                    placeholder="Tempat..." name="tempat_lahir_ayah" value="{{ $tempat_lahir_ayah }}"  autofocus autocomplete="off">
                                    @error('tempat_lahir_ayah')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                   </div>
                                   <div class="col-1">
                                    <label for="dari" class="col-12">/</label>
                                   </div>
                                   <div class="col-5">
                                    <input type="date" class="form-control  @error('tgllahir') is-invalid @enderror" 
                                    placeholder="Tanggal"  name="tanggal_lahir_ayah" value="{{ $tanggal_lahir_ayah }}"/>
                                    @error('tgllahir')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                <script>
                                          
                                //      $('#datepicker2').datepicker({
                                //     uiLibrary: 'bootstrap5',
                                //     format: 'dd/mm/yyyy'
                                //         });
                
                                </script>
                                
                                
                                   </div>
                                       </div>
                                    </div>
                                  </div>
                                  <div class="col-6">
                                    <div class="form-group">
                                      <label for="golongan_darah_ayah" class="col-12">Golongan Darah</label>
                                      <input type="text" class="form-control  @error('golongan_darah_ayah') is-invalid @enderror" id="golongan_darah_ayah"
                                              placeholder="Masukan Golongan Darah Suami..." name="golongan_darah_ayah" value="{{ $golongan_darah_ayah }}"  autofocus autocomplete="off">
                                              @error('golongan_darah_ayah')
                                              <div class="invalid-feedback">
                                                {{ $message }}
                                              </div>
                                          @enderror
                                         
                                     </div>
                                 
                                </div>
                                </div>
                                <div class="row">
                                  <div class="col-6">
                                    <div class="form-group">
                                      <label for="agama_ayah" class="col-12">Agama</label>
                                      <select class="form-select @error('nama_pengadu') is-invalid @enderror"  aria-label="Default select example" name="agama_ayah" id="agama_ayah">
                                        <option selected>{{ $agama_ayah }}</option>
                                        <option value= "Islam" {{ old('agama_ayah') }}>Islam</option>
                                        <option value= "Kristen" {{ old('agama_ayah') }}>Kristen</option>
                                        <option value= "Hindu" {{ old('agama_ayah') }}>Hindu</option>
                                        </select>
                                        @error('agama_ayah')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                     </div>
                                  </div>
                                  <div class="col-6">
                                    <div class="form-group">
                                      <label for="pekerjaan_ayah" class="col-12">Pekerjaan</label>
                                      <input type="text" class="form-control  @error('pekerjaan_ayah') is-invalid @enderror" id="pekerjaan_ayah"
                                              placeholder="Masukan Pekerjaan Suami..." name="pekerjaan_ayah" value="{{ $pekerjaan_ayah }}"  autofocus autocomplete="off">
                                              @error('pekerjaan_ayah')
                                              <div class="invalid-feedback">
                                                {{ $message }}
                                              </div>
                                          @enderror
                                         
                              
                                      </div>
                                  
                                </div>
                                </div>  
                                
                              </div>
                             
                            </div>
                  
                         
                      </div>
                  </div>
       

              <div class="row" style="margin-top: -100px;">
                <div class="col-md-12 mx-auto p-5">
                    <div class="card" style="background-color: #4DA8DA;">
                      <div class="col-12 mt-4">
                        <h4 class="text-center">Data Lain Orang Tua</h4>
                    </div>
                        
                            <div class="card-body">
                              <div class="row">
                                <div class="col-6">
                                  <div class="form-group">
                                    <label for="kabupaten_atau_kota" class="col-12">Alamat Rumah</label>
                                    <input type="text" class="form-control  @error('alamat_rumah') is-invalid @enderror" id="alamat_rumah"
                                            placeholder="Masukan Alamat Rumah..." name="alamat_rumah" value="{{ $alamat_rumah }}"  autofocus autocomplete="off">
                                            @error('alamat_rumah')
                                            <div class="invalid-feedback">
                                              {{ $message }}
                                            </div>
                                        @enderror
                                       
                                   </div>
                                </div>
                                <div class="col-6">
                                  <div class="form-group">
                                    <label for="kabupaten_atau_kota" class="col-12">Kabupaten / Kota</label>
                                    <input type="text" class="form-control  @error('kabupaten_atau_kota') is-invalid @enderror" id="kabupaten_atau_kota"
                                            placeholder="Masukan Alamat Rumah..." name="kabupaten_atau_kota" value="{{ $kabupaten_atau_kota }}"  autofocus autocomplete="off">
                                            @error('kabupaten_atau_kota')
                                            <div class="invalid-feedback">
                                              {{ $message }}
                                            </div>
                                        @enderror
                                       
                                   </div>
                                </div>
                              </div>
                              <div class="row">
                                <div class="col-6">
                                  <div class="form-group">
                                    <label for="kecamatan" class="col-12">Kecamatan</label>
                                    <input type="text" class="form-control  @error('kecamatan') is-invalid @enderror" id="kecamatan"
                                            placeholder="Masukan Kecamatan..." name="kecamatan" value="{{ $kecamatan }}"  autofocus autocomplete="off">
                                            @error('kecamatan')
                                            <div class="invalid-feedback">
                                              {{ $message }}
                                            </div>
                                        @enderror
                                       
                                   </div>
                                   
                                </div>
                                <div class="col-6">
                                  <div class="form-group">
                                    <label for="no_telepon" class="col-12">No. Telp Yang Bisa Di Hubungi</label>
                                    <input type="text" class="form-control  @error('no_telepon') is-invalid @enderror" id="no_telepon"
                                            placeholder="Masukan No. Telepon..." name="no_telepon" value="{{ $no_telepon }}"  autofocus autocomplete="off">
                                            @error('no_telepon')
                                            <div class="invalid-feedback">
                                              {{ $message }}
                                            </div>
                                        @enderror
                                       
                                   </div>
                               
                              </div>
                              </div>
                            
                              </div>  
                              
                            </div>
                          
                       
                    </div>
                </div>
            <div class="row">
              {{-- <div class="col-6 p-5" style="margin-top: -80px;">
                <button type="button" id="tambah_data"  class="btn btn-primary" style="width: 200px;">Tambah Data Anak</button>
              </div> --}}
             
              @php $nomor = 1; @endphp
              @foreach($dataanak as $data)
              
              <div class="col-md-12 mx-auto p-5" style="margin-top: -60px;">
                  <div class="card" style="background-color: #4DA8DA;">
                    <div class="col-12-mt-4">
                      <h4 class="text-center">Data Anak Ke- {{ $nomor }}</h4>
                  </div>
                  <!--<div class="col" style="margin-left:960px;">-->
                                    
                  <!--                              <a href="{{ url('hapusdataanak/'.$data->id) }}">-->
                  <!--                                  @csrf-->
                  <!--                                    @method('DELETE')-->
                                                   
                                              <!--<input type="text" hidden value='{{ $data->id }}' name="idanak[]"/>-->
                  <!--                               <button type="submit" title="Hapus" class="btn btn-danger btn-md">-->
                  <!--                                  <i>  -->
                  <!--                                    <div class="notif-img">-->
                  <!--                                    <img-->
                  <!--                                      src="{{ asset('templatedwi/img/iconhapus.png') }}"-->
                  <!--                                      alt="Img Profile"-->
                  <!--                                      width="20"-->
                  <!--                                      height="20"-->
                  <!--                                    />-->
                  <!--                                  </div></i>-->
                  <!--                               </button>-->
                  <!--                               </a>-->
                                                 
                                                
                                      
                  <!--</div>-->
    
                     
                                     
                  <input type="text" id="id"
                  placeholder="Masukan Nama Anak..." name="id2[]" value="{{ $data->id }}"  hidden>
                  <input type="text" class="form-control" id="nik"
                         placeholder="Tahun.." name="nik_ibu[]" value="{{ $data->nik_ibu }}" autofocus autocomplete="off" hidden>
                  
                          <div class="card-body" style="background-color: #4DA8DA;">
                            <div class="row">
                              <div class="col-6">
                                <div class="form-group">
                                  <label for="nama_anak" class="col-12">Nama</label>
                                  <input type="text" class="form-control  @error('nama_anak[]') is-invalid @enderror" id="nama_anak"
                                          placeholder="Masukan Nama Anak..." name="nama_anak[]" value="{{ $data->nama }}"  autofocus autocomplete="off">
                                          @error('nama_anak[]')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                                     
                                 </div>
                              </div>
                              <div class="col-6">
                                <div class="form-group">
                                  <label for="no_akta_kelahiran" class="col-12">No. Akte Kelahiran</label>
                                  <input type="text" class="form-control  @error('no_akta_kelahiran[]') is-invalid @enderror" id="no_akta_kelahiran"
                                          placeholder="Masukan No. JKN/BPJS Anak..." name="no_akta_kelahiran[]" value="{{ $data->no_akta_kelahiran }}"  autofocus autocomplete="off">
                                    @error('no_akta_kelahiran[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                 </div>
                              </div> 
                            </div>
                            <div class="row">
                              <div class="col-6">
                                <div class="form-group">
                                 <label for="nama_anak" class="col-12">Jenis Kelamin</label>
                                 <select class="form-select @error('jenis_kelamin[]') is-invalid @enderror"  aria-label="Default select example" name="jenis_kelamin[]" id="jenis_kelamin">
                                   <option selected>{{ $data->jenis_kelamin }}</option>
                                   <option value= "Laki-Laki" {{ old('jenis_kelamin[]') }}>Laki-Laki</option>
                                   <option value= "Perempuan" {{ old('jenis_kelamin[]') }}>Perempuan</option>
                                   </select>
                                   @error('jenis_kelamin[]')
                                   <div class="invalid-feedback">
                                     {{ $message }}
                                   </div>
                               @enderror
                                     
                                </div>
                             </div>
                              <div class="col-6">
                                <div class="form-group">
                                  <label for="no_jkn_bpjs_anak" class="col-12">No. JKN/BPJS</label>
                                  <input type="text" class="form-control  @error('no_jkn_bpjs_anak[]') is-invalid @enderror" id="no_jkn_bpjs_anak"
                                          placeholder="Masukan No. JKN/BPJS Anak..." name="no_jkn_bpjs_anak[]" value="{{ $data->no_jkn_bpjs }}"  autofocus autocomplete="off">
                                          @error('no_jkn_bpjs_anak[]')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                                     
                                 </div>
                             
                            </div>
                            <div class="row">
                               <div class="col-6">
                              <div class="form-group">
                                <label for="tempat_atau_tanggal_lahir_anak" class="col-12">Tempat/Tanggal Lahir</label>
                                  <div class="row">
                                   <div class="col-6">
                                    <input type="text" class="form-control  @error('tempat_lahir_anak') is-invalid @enderror" id="anak_ke"
                                    placeholder="Tempat..." name="tempat_lahir_anak[]" value="{{ $data->tempat_lahir_anak }}"  autofocus autocomplete="off">
                                    @error('tempat_lahir_anak')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                   </div>
                                   <div class="col-1">
                                    <label for="dari" class="col-12">/</label>
                                   </div>
                                   <div class="col-5">
                                  <input type="date" class="form-control  @error('tanggal_lahir_anak') is-invalid @enderror" id="tanggal_lahir_anak"
                                    placeholder="Tanggal" name="tanggal_lahir_anak[]" value="{{ $data->tanggal_lahir_anak }}"  autofocus autocomplete="off">
                                    @error('tanggal_lahir_anak')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                   </div>
                                       </div>
                                       </div>
                               <!-- <input type="text" class="form-control  @error('tempat_atau_tanggal_lahir_anak') is-invalid @enderror" id="tempat_atau_tanggal_lahir_anak"-->
                               <!--         placeholder="Masukan Tempat/Tanggal Lahir Anak" name="tempat_atau_tanggal_lahir_anak" value="{{ old('tempat_atau_tanggal_lahir') }}"  autofocus autocomplete="off">-->
                               <!--         @error('tempat_atau_tanggal_lahir_anak')-->
                               <!--         <div class="invalid-feedback">-->
                               <!--           {{ $message }}-->
                               <!--         </div>-->
                               <!--     @enderror-->
                                   
                               <!--</div>-->
                               
                            </div>
                              <div class="col-6">
                                <div class="form-group">
                                  <div class="row" style="margin-left: 5px;margin-top:15px;">
                                     <div class="col-2">
                                      <label for="anak_ke" class="col-12">Anak Ke-</label>
                                     </div>
                                     <div class="col-3">
                                      <input type="text" class="form-control  @error('anak_ke[]') is-invalid @enderror" id="anak_ke"
                                      placeholder="" name="anak_ke[]" value="{{ $data->anak_ke }}"  autofocus autocomplete="off">
                                      @error('anak_ke[]')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror
                                     </div>
                                     <div class="col-2">
                                      <label for="dari" class="col-12">Dari</label>
                                     </div>
                                     <div class="col-3">
                                      <input type="text" class="form-control  @error('dari[]') is-invalid @enderror" id="dari"
                                      placeholder="" name="dari[]" value="{{ $data->dari }}"  autofocus autocomplete="off">
                                      @error('dari[]')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror
                                     </div>
                                     <div class="col-2">
                                      <label for="dari" class="col-12">Anak</label>
                                     </div>
                                  </div>
                                 
                                  
                                     
                                 </div>
                                 
                              </div>
                             
                            </div>
                          
                            </div>  
                            
                          </div>
                        
                     
                  </div>
             
              </div>
              @php $nomor++; @endphp
              
              @endforeach
                {{-- <input type="text" id="id"
                  placeholder="Masukan Nama Anak..." name="id2[]" value="{{ $data->id }}"  hidden> --}}
            
                  <div class="col-md-12 mx-auto p-5" style="margin-top: -90px;">
                    <div class="card" style="background-color: #4DA8DA;">
                      <div class="col-12 mt-4">
                        <h4 class="text-center">Tambah Data Anak</h4>
                    </div>
                    
                            <div class="card-body" style="background-color: #4DA8DA;">
                              <div class="row">
                                <div class="col-6">
                                  <div class="form-group">
                                    <label for="nama_anak" class="col-12">Nama</label>
                                    <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"
                                            placeholder="Masukan Nama Anak..." name="nama_anak2" value="{{ old('nama_anak2') }}"  autofocus autocomplete="off">
                                            @error('nama_anak')
                                            <div class="invalid-feedback">
                                              {{ $message }}
                                            </div>
                                        @enderror
                                       
                                   </div>
                                </div>
                                <div class="col-6">
                                  <div class="form-group">
                                    <label for="no_akta_kelahiran" class="col-12">No. Akte Kelahiran</label>
                                    <input type="text" class="form-control  @error('no_akta_kelahiran') is-invalid @enderror" id="no_akta_kelahiran"
                                            placeholder="Masukan No. JKN/BPJS Anak..." name="no_akta_kelahiran2" value="{{ old('no_akta_kelahiran2') }}"  autofocus autocomplete="off">
                                      @error('no_akta_kelahiran')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror
                                   </div>
                                </div> 
                              </div>
                              <div class="row">
                                <div class="col-6">
                                  <div class="form-group">
                                   <label for="nama_anak" class="col-12">Jenis Kelamin</label>
                                   <select class="form-select @error('jenis_kelamin') is-invalid @enderror"  aria-label="Default select example" name="jenis_kelamin2" id="jenis_kelamin">
                                     <option selected>-Pilih Jenis Kelamin-</option>
                                     <option value= "Laki-Laki" {{ old('jenis_kelamin2') }}>Laki-Laki</option>
                                     <option value= "Perempuan" {{ old('jenis_kelamin2') }}>Perempuan</option>
                                     </select>
                                     @error('jenis_kelamin')
                                     <div class="invalid-feedback">
                                       {{ $message }}
                                     </div>
                                 @enderror
                                       
                                  </div>
                               </div>
                                <div class="col-6">
                                  <div class="form-group">
                                    <label for="no_jkn_bpjs_anak" class="col-12">No. JKN/BPJS</label>
                                    <input type="text" class="form-control  @error('no_jkn_bpjs_anak') is-invalid @enderror" id="no_jkn_bpjs_anak"
                                            placeholder="Masukan No. JKN/BPJS Anak..." name="no_jkn_bpjs_anak2" value="{{ old('no_jkn_bpjs_anak2') }}"  autofocus autocomplete="off">
                                            @error('no_jkn_bpjs_anak')
                                            <div class="invalid-feedback">
                                              {{ $message }}
                                            </div>
                                        @enderror
                                       
                                   </div>
                               
                              </div>
                              <div class="row">
                                   <div class="col-6">
                              <div class="form-group">
                                <label for="tempat_atau_tanggal_lahir_anak" class="col-12">Tempat/Tanggal Lahir</label>
                                  <div class="row">
                                   <div class="col-6">
                                    <input type="text" class="form-control  @error('tempat_lahir_anak2') is-invalid @enderror" id="anak_ke"
                                    placeholder="Tempat..." name="tempat_lahir_anak2" value="{{ old('tempat_lahir_anak2') }}"  autofocus autocomplete="off">
                                    @error('tempat_lahir_anak2')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                   </div>
                                   <div class="col-1">
                                    <label for="dari" class="col-12">/</label>
                                   </div>
                                   <div class="col-5">
                                  <input type="date" class="form-control  @error('tanggal_lahir_anak2') is-invalid @enderror" id="tanggal_lahir_anak"
                                    placeholder="Tanggal" name="tanggal_lahir_anak2" value="{{ old('tanggal_lahir_anak2') }}"  autofocus autocomplete="off">
                                    @error('tanggal_lahir_anak2')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                   </div>
                                      
                               </div>
                            </div>
                                </div>
                                <div class="col-6">
                                  <div class="form-group">
                                    <div class="row" style="margin-left: 5px;margin-top:15px;">
                                       <div class="col-2">
                                        <label for="anak_ke" class="col-12">Anak Ke-</label>
                                       </div>
                                       <div class="col-3">
                                        <input type="text" class="form-control  @error('anak_ke') is-invalid @enderror" id="anak_ke"
                                        placeholder="" name="anak_ke2" value="{{ old('anak_ke2') }}"  autofocus autocomplete="off">
                                        @error('anak_ke')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                       </div>
                                       <div class="col-2">
                                        <label for="dari" class="col-12">Dari</label>
                                       </div>
                                       <div class="col-3">
                                        <input type="text" class="form-control  @error('dari') is-invalid @enderror" id="dari"
                                        placeholder="" name="dari2" value="{{ old('dari2') }}"  autofocus autocomplete="off">
                                        @error('dari')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                       </div>
                                       <div class="col-2">
                                        <label for="dari" class="col-12">Anak</label>
                                       </div>
                                    </div>
                                   
                                    
                                       
                                   </div>
                                   
                                </div>
                               
                              </div>
                            
                              </div>  
                              
                           
                          
                       
                    </div>
               
                </div>
                             <div class="card-body text-center" style="margin-top: -20px;">
                  <div class="row" style="margin-left:300px;">
                    <div class="col-3">
                     
                  
                  <button type="submit" class="btn btn-primary" style="width: 200px;" >Simpan</button>
              {{-- <table id="tabelku" border="0">
                
                <tbody>  
                  
               
              
                </tbody>
             
            </table> --}}
                      
             
           
              {{-- <script>
                $('#tombol_update').click( function(){
                  var formData1 = $('#form1').serialize();
                  $.ajax({
                    type: 'PUT',
                    url: '/dataorangtuadananak/' + $('#id').val(),
                    data: formData1;
                    }
                  );
                });

                
                </script> --}}
                   {{-- <script>
                    $('#tombol_kirim').click( function(){
                      var formData2 = $('#form2').serialize();
    
                      $.ajax({
                        type: 'POST',
                        url: '/insertdataanak/' + $('#id').val(),
                        data: formData2;
                        }
                      );
                    });
    
                    
                    </script> --}}
                {{-- <script>
                  $('#tambah_data').click( function() {      
                    var tableID = "tabelku";
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;
                    var row = table.insertRow(rowCount);
                  
                    var element1 = 
                    '<tr>'+ 
                      '<th class="col-1">'+ 
                        '<input type="text" class="form-control" id="nik"'+
                          'placeholder="Tahun.." name="nik_ibu2[]" value="{{ $nik }}" autofocus autocomplete="off" hidden>'+
                      '<div class="col-md-12 mx-auto p-5" style="margin-top: -50px;">'+
                    '<div class="card" style="background-color: #4DA8DA;" >'+
                      '<div class="col-12 mt-4">'+
                   '     <h4 class="text-center">Data Anak</h4>'+
                   ' </div>'+
                    
                           ' <div class="card-body" style="background-color: #4DA8DA;">'+
                              '<div class="row">'+
                               ' <div class="col-6">'+
                                 ' <div class="form-group">'+
                                    '<label for="nama_anak" class="col-12">Nama</label>'+
                                 ' <input type="text" class="form-control  @error('nama_anak2')'+
                                    'is-invalid @enderror" id="nama_anak"'+
                                            'placeholder="Masukan Nama Anak..." name="nama_anak2[]" value="{{ old('nama_anak2[]') }}"  autofocus autocomplete="off">'+
                                          '  @error('nama_anak2')'+
                                          '  <div class="invalid-feedback">'+
                                             ' {{ $message }}'+
                                            '</div>'+
                                      '  @enderror'+
                                   ' </div>'+
                                '</div>'+
                               ' <div class="col-6">'+
                                 ' <div class="form-group">'+
                                    '<label for="no_akta_kelahiran" class="col-12">No. Akte Kelahiran</label>'+
                                    ' <input type="text" class="form-control  @error('no_akta_kelahiran2')'+
                                    'is-invalid @enderror" id="nama_anak"'+
                                            'placeholder="Masukan No Akte Kelahiran..." name="no_akta_kelahiran2[]" value="{{ old('no_akta_kelahiran2[]') }}"  autofocus autocomplete="off">'+
                                          '  @error('no_akta_kelahiran2')'+
                                          '  <div class="invalid-feedback">'+
                                             ' {{ $message }}'+
                                            '</div>'+
                                      '  @enderror'+
                                 '  </div>'+
                                '</div>' +
                              '</div>'+
                             ' <div class="row">'+
                               ' <div class="col-6">'+
                                  '<div class="form-group">'+
                                  '  <label for="nama_anak" class="col-12">Jenis Kelamin</label>'+
                                   ' <select class="form-select @error('jenis_kelamin2') is-invalid @enderror"  aria-label="Default select example" name="jenis_kelamin2[]" id="jenis_kelamin">'+
                                      '<option selected>--Pilih Jenis Kelamin--</option>'+
                                     ' <option value= "Laki-Laki" {{ old('jenis_kelamin2[]') }}>Laki-Laki</option>'+
                                     ' <option value= "Perempuan" {{ old('jenis_kelamin2[]') }}>Perempuan</option>'+
                                     ' </select>'+
                                     ' @error('jenis_kelamin2')'+
                                     ' <div class="invalid-feedback">'+
                                       ' {{ $message }}'+
                                    '  </div>'+
                                '  @enderror'+
                                       
                                  ' </div>'+
                               ' </div>'+
                              '  <div class="col-6">'+
                                  '<div class="form-group">'+
                                    '<label for="no_jkn_bpjs_anak" class="col-12">No. JKN/BPJS</label>'+
                                   ' <input type="text" class="form-control  @error('no_jkn_bpjs_anak') is-invalid @enderror" id="no_jkn_bpjs_anak"'+
                                           ' placeholder="Masukan No. JKN/BPJS Anak..." name="no_jkn_bpjs_anak2[]" value="{{ old('no_jkn_bpjs_anak2[]') }}"  autofocus autocomplete="off">'+
                                          '  @error('no_jkn_bpjs_anak')'+
                                           ' <div class="invalid-feedback">'+
                                             ' {{ $message }}'+
                                           ' </div>'+
                                       ' @enderror'+
                                       
                                  ' </div>'+
                               
                             ' </div>'+
                             ' </div>'+
                             
                             ' <div class="row">'+
                               ' <div class="col-6">'+
                                 ' <div class="form-group">'+
                                   ' <label for="tempat_atau_tanggal_lahir_anak" class="col-12">Tempat/Tanggal Lahir</label>'+
                                    '<input type="text" class="form-control  @error('tempat_atau_tanggal_lahir_anak2') is-invalid @enderror" id="tempat_atau_tanggal_lahir_anak"'+
                                         '   placeholder="Masukan Tempat/Tanggal Lahir Anak" name="tempat_atau_tanggal_lahir_anak[]" value="{{ old('tempat_atau_tanggal_lahir_anak2[]') }}"  autofocus autocomplete="off">'+
                                          '  @error('tempat_atau_tanggal_lahir_anak2')'+
                                            '<div class="invalid-feedback">'+
                                              '{{ $message }}'+
                                            '</div>'+
                                       ' @enderror'+
                                       
                                  ' </div>'+
                                   
                               ' </div>'+
                               ' <div class="col-6">'+
                          '        <div class="form-group">'+
                          '          <div class="row"style="margin-left: 5px;margin-top:15px;">'+
                          '             <div class="col-2">'+
                                 '       <label for="anak_ke" class="col-12">Anak Ke-</label>'+
                                 '      </div>'+
                                 '      <div class="col-3">'+
                                        '<input type="text" class="form-control  @error('anak_ke2') is-invalid @enderror" id="anak_ke"'+
                                        'placeholder="" name="anak_ke2[]" value="{{ old('anak_ke2[]') }}"  autofocus autocomplete="off">'+
                                     '   @error('anak_ke2')'+
                                    '    <div class="invalid-feedback">'+
                                      '    {{ $message }}'+
                                      '  </div>'+
                                    '@enderror'+
                                      ' </div>'+
                                      ' <div class="col-2">'+
                                       ' <label for="dari" class="col-12">Dari</label>'+
                                      ' </div>'+
                                      ' <div class="col-3">'+
                                       ' <input type="text" class="form-control  @error('dari2') is-invalid @enderror" id="dari"'+
                                       ' placeholder="" name="dari2[]" value="{{ old('dari2[]') }}"  autofocus autocomplete="off">'+
                                       ' @error('dari2')'+
                                       ' <div class="invalid-feedback">'+
                                       '   {{ $message }}'+
                                       ' </div>'+
                                    '@enderror'+
                                     '  </div>'+
                                       '<div class="col-2">'+
                                       ' <label for="dari" class="col-12">Anak</label>'+
                                      ' </div>'+
                                   ' </div>'+
                                       
                                  ' </div>'+
                                   
                              '  </div>'+
                              '</div> ' +
                              
                          '  </div>'+
                          
                                 
                              
                        '</th>'+
                        
                                      '</tr>';
  
  
                    row.innerHTML = element1; 
                  });
                    </script> --}}
               

               <script>
                                                     function deleteData(id){
                                                         $.ajax({
                                                             type:"DELETE",
                                                             url: '/hapusdataanak',
                                                             data: {id : id},
                                                             success:
                                                             function:(data){
                                                                 location:reload();
                                                             }
                                                         });
                                                     }
                                                 </script>
                                            
             
                
              </div>
            </form>
              <div class="col-3">
                <button type="button" onclick="window.location='{{ url('dataorangtuadananak') }}'" class="btn btn-warning" style="width: 200px; margin-left:50px;">Batal</button>
              </div>
            </div>
             
             
          </div>
          
      </div>
    
@endsection