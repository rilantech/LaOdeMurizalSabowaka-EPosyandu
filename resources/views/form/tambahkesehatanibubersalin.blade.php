@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Ibu Bersalin</h4>
            
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
               
                <div class="row">
                  
                    <div class="col-md-12 mx-auto mt-2 p-5">
                        <div  class="card border-dark" style="background-color: #4DA8DA; border-radius: 30px 30px 30px 30px; border:solid 3px black;">
                            <form class="form-horizontal" action='{{  url('kesehatanibubersalin') }}' method='post'>
                                @csrf
                                <div class="card-body">
                                  <div class="row">
                                    <div class="col-6">
                                       <div class="form-group">
                                        <label for="nik" class="col-3 fw-bold">Nama</label>
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                                placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}"  autofocus autocomplete="off">
                                                @error('nama_ibu')
                                                <div class="invalid-feecback text-success">
                                                  {{ $message }}
                                                </div>
                                            @enderror

                                       </div>
                                          <div class="form-group">
                                        <label for="nik" class="col-3 fw-bold">NIK</label>
                                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"
                                                placeholder="Masukan NIK Ibu..." name="nik_ibu" value="{{ $nik }}"  autofocus autocomplete="off">
                                                @error('nik_ibu')
                                                <div class="invalid-feecback text-success">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                      </div>
                                    
                                    </div>
                                    <div class="col-6">
                                        <div class="form-group">
                                          <div class="row">
                                            <div class="col-4 mt-3">
                                             <label for="panjang_badan" class="col-12 fw-bold">Panjang Badan (cm)</label>
                                            </div>
                                            <div class="col-2 mt-3">
                                             <input type="text" class="form-control  @error('panjang_badan') is-invalid @enderror" id="panjang_badan"
                                             placeholder="" name="panjang_badan" value="{{ old('panjang_badan') }}"  autofocus autocomplete="off">
                                             @error('panjang_badan')
                                             <div class="invalid-feecback text-success">
                                               {{ $message }}
                                             </div>
                                         @enderror
                                            </div>
                                            <div class="col-4 mt-3">
                                              <label for="lingkar_kepala" class="col-12 fw-bold">Lingkar Kepala (cm)</label>
                                             </div>
                                             <div class="col-2 mt-3">
                                              <input type="text" class="form-control  @error('lingkar_kepala') is-invalid @enderror" id="lingkar_kepala"
                                              placeholder="" name="lingkar_kepala" value="{{ old('lingkar_kepala') }}"  autofocus autocomplete="off">
                                              @error('lingkar_kepala')
                                              <div class="invalid-feecback text-success">
                                                {{ $message }}
                                              </div>
                                          @enderror
                                             </div>
                                         </div>
                                         <div class="row">
                                          <div class="col-4 mt-3">
                                            <label class="form-check-label fw-bold" for="inlineRadio1">Jenis Kelamin</label>
                                          </div>
                                          <div class="col-4">
                                            <div class="form-check form-check-inline">
                                              <input class="form-check-input" type="radio" name="jenis_kelamin" id="inlineRadio1" value="Laki-laki">
                                              <label class="form-check-label" for="inlineRadio1">Laki-laki</label>
                                            </div>
                                          </div>
                                         <div class="col-3">
                                          <div class="form-check form-check-inline">
                                            <input class="form-check-input" type="radio" name="jenis_kelamin" id="inlineRadio2" value="Perempuan" style="margin-left:-30px;">
                                            <label class="form-check-label" for="inlineRadio2">Perempuan</label>
                                          </div>
                                         </div>
                                         </div>
                                         @error('jenis_kelamin')
                                                <div class="invalid-feecback text-success">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                      </div>
                                     
                                    </div>
                                  
                                  </div>
                                  <div class="row">
                                    <div class="col-6">
                                   
                                      <div class="row">
                                        <div class="col-6">
                                          <div class="form-group">
                                            <label for="tempat_atau_tanggal_lahir_ibu" class="col-12 fw-bold">Tanggal Persalinan</label>
                                              <input class="form-control  @error('tanggal_persalinan') is-invalid @enderror" id="datepicker2" 
                                    placeholder="Tanggal" data-date-format="dd-mm-yyyy" name="tanggal_persalinan"/>
                                            <!--<input type="text" class="form-control  @error('tanggal_persalinan') is-invalid @enderror" id="tanggal_persalinan"-->
                                            <!--        placeholder="Masukan Tanggal Persalinan..." name="tanggal_persalinan" value="{{ old('tanggal_persalinan') }}"  autofocus autocomplete="off">-->
                                                    @error('tanggal_persalinan')
                                                    <div class="invalid-feecback text-success">
                                                      {{ $message }}
                                                    </div>
                                                @enderror
                                               
                                           </div>
                                        </div>
                                        <div class="col-6">
                                          <div class="form-group">
                                            <label for="tempat_atau_tanggal_lahir_ibu" class="col-12 fw-bold">Pukul</label>
                                            <input type="time" class="form-control  @error('pukul') is-invalid @enderror" id="pukul"
                                                    placeholder="Masukan Jam Persalinan..." name="pukul" value="{{ old('pukul') }}"  autofocus autocomplete="off">
                                                    @error('pukul')
                                                    <div class="invalid-feecback text-success">
                                                      {{ $message }}
                                                    </div>
                                                @enderror
                                               
                                           </div>
                                        </div>
                                      </div>
                                      <div class="form-group">
                                        <div class="row">
                                          <div class="col-6 mt-3">
                                           <label for="kehamilan_ke" class="col-12 fw-bold">Umur Kehamilan (Minggu)</label>
                                          </div>
                                          <div class="col-3 mt-3">
                                           <input type="text" class="form-control  @error('umur_kehamilan') is-invalid @enderror" id="umur_kehamilan"
                                           placeholder="" name="umur_kehamilan" value="{{ old('umur_kehamilan') }}"  autofocus autocomplete="off">
                                           @error('umur_kehamilan')
                                           <div class="invalid-feecback text-success">
                                             {{ $message }}
                                           </div>
                                       @enderror
                                          </div>
                                         
                                       </div>
                                     
                                    </div>
                                    <div class="form-group">
                                      <label for="pendidikan_ibu" class="col-12 fw-bold">Penolong Persalinan</label>
                                      <select class="form-select @error('penolong_persalinan') is-invalid @enderror"  aria-label="Default select example" name="penolong_persalinan" id="penolong_persalinan">
                                        <option selected>--Pilih Penolong Persalinan--</option>
                                        <option value= "Dokter Kandungan" {{ old('penolong_persalinan') }}>Dokter Kandungan</option>
                                        <option value= "Bidan" {{ old('penolong_persalinan') }}>Bidan</option>
                                        <option value= "Perawat Yang Terlatih" {{ old('penolong_persalinan') }}>Perawat Yang Terlatih</option>
                                        <option value= "Dukun Bayi" {{ old('penolong_persalinan') }}>Dukun Bayi</option>
                                      </select>
                                        @error('penolong_persalinan')
                                        <div class="invalid-feecback text-success">
                                          {{ $message }}
                                        </div>
                                        @enderror
                                     </div>
                                     <div class="form-group">
                                      <label for="pendidikan_ibu" class="col-12 fw-bold">Cara Persalinan</label>
                                      <select class="form-select @error('cara_persalinan') is-invalid @enderror"  aria-label="Default select example" name="cara_persalinan" id="cara_persalinan">
                                        <option>--Pilih Cara Persalinan--</option>
                                        <option value= "Persalinan Pervaginam" {{ old('cara_persalinan') }}>Persalinan Pervaginam</option>
                                        <option value= "Operasi Caesar" {{ old('cara_persalinan') }}>Operasi Caesar</option>
                                        </select>
                                        @error('cara_persalinan')
                                        <div class="invalid-feecback text-success">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                     </div>
                                     <div class="form-group">
                                       <label for="nik" class="col-3 fw-bold">Keadaan Ibu</label>
                                        <input type="text" class="form-control  @error('keadaan_ibu') is-invalid @enderror" id="nama_ibu"
                                                placeholder="Masukan Keadaan Ibu..." name="keadaan_ibu" value="{{ old('keadaan_ibu') }}"  autofocus autocomplete="off">
                                      <!--<select class="form-select @error('keadaan_ibu') is-invalid @enderror"  aria-label="Default select example" name="keadaan_ibu" id="keadaan_ibu">-->
                                      <!--  <option selected></option>-->
                                      <!--  <option value= "TK/Sederajat" {{ old('keadaan_ibu') }}>TK/Sederajat</option>-->
                                      <!--  <option value= "SD/Sederajat" {{ old('keadaan_ibu') }}>SD/Sederajat</option>-->
                                      <!--  <option value= "SMP/Sederajat" {{ old('keadaan_ibu') }}>SMP/Sederajat</option>-->
                                      <!--  <option value= "SMA/Sederajat" {{ old('keadaan_ibu') }}>SMA/Sederajat</option>-->
                                      <!--  </select>-->
                                        @error('keadaan_ibu')
                                        <div class="invalid-feecback text-success">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                     </div>
                                    <!-- <div class="form-group">-->
                                    <!--  <label for="nik" class="col-3 fw-bold">Keterangan Tambahan Ibu</label>-->
                                    <!--  <input type="text" class="form-control  @error('keterangan_tambahan_ibu') is-invalid @enderror" id="keterangan_tambahan_ibu"-->
                                    <!--          placeholder="Masukan Keterangan Tambahan Ibu..." name="keterangan_tambahan_ibu" value="{{ old('keterangan_tambahan_ibu') }}"  autofocus autocomplete="off">-->
                                    <!--          @error('keterangan_tambahan_ibu')-->
                                    <!--          <div class="invalid-feecback text-success">-->
                                    <!--            {{ $message }}-->
                                    <!--          </div>-->
                                    <!--      @enderror-->
                                    <!--</div>-->
                                    <div class="form-group">
                                      <div class="row">
                                        <div class="col-2 mt-3">
                                         <label for="kehamilan_ke" class="col-12 fw-bold">Anak Ke-</label>
                                        </div>
                                        <div class="col-3 mt-3">
                                         <input type="text" class="form-control  @error('anak_ke') is-invalid @enderror" id="anak_ke"
                                         placeholder="" name="anak_ke" value="{{ old('anak_ke') }}"  autofocus autocomplete="off">
                                         @error('anak_ke')
                                         <div class="invalid-feecback text-success">
                                           {{ $message }}
                                         </div>
                                     @enderror
                                        </div>
                                       
                                     </div>
                                   
                                  </div>
                                  <div class="form-group">
                                    <div class="row">
                                      <div class="col-4 mt-3">
                                       <label for="kehamilan_ke" class="col-12 fw-bold">Berat Lahir (gram)</label>
                                      </div>
                                      <div class="col-3 mt-3">
                                       <input type="text" class="form-control  @error('berat_lahir') is-invalid @enderror" id="berat_lahir"
                                       placeholder="" name="berat_lahir" value="{{ old('berat_lahir') }}"  autofocus autocomplete="off">
                                       @error('berat_lahir')
                                       <div class="invalid-feecback text-success">
                                         {{ $message }}
                                       </div>
                                   @enderror
                                      </div>
                                     
                                   </div>
                                 
                                </div>
                                      
                                     
                                    </div>
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label class="form-check-label fw-bold" for="inlineRadio1">Kondisi Bayi Saat Lahir :</label>
                                      </div>
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Segera menangis" name="kondisi_bayi_saat_lahir">
                                        <label class="form-check-label" for="inlineCheckbox1">Segera menangis</label>
                                      </div>
                                      <div class="form-group form-check form-check-inline" style="margin-left: 43px;">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Anggota gerak kebiruan" name="kondisi_bayi_saat_lahir">
                                        <label class="form-check-label" for="inlineCheckbox2">Anggota gerak kebiruan</label>
                                      </div>
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Menangis beberapa saat">
                                        <label class="form-check-label" for="inlineCheckbox1">Menangis beberapa saat</label>
                                      </div>
                                      <div class="form-group form-check form-check-inline" style="margin-left: 1px;">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Seluruh tubuh biru">
                                        <label class="form-check-label" for="inlineCheckbox2">Seluruh tubuh biru</label>
                                      </div>
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Tidak menangis">
                                        <label class="form-check-label" for="inlineCheckbox1">Tidak menangis</label>
                                      </div>
                                      <div class="form-group form-check form-check-inline" style="margin-left: 55px;">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Kelainan bawaan">
                                        <label class="form-check-label" for="inlineCheckbox2">Kelainan bawaan</label>
                                      </div>
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Seluruh tubuh kemerahan">
                                        <label class="form-check-label" for="inlineCheckbox1">Seluruh tubuh kemerahan</label>
                                      </div>
                                      <div class="form-group form-check form-check-inline" style="margin-left: -6px;">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Meninggal">
                                        <label class="form-check-label" for="inlineCheckbox2">Meninggal</label>
                                      </div>
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Tidak menangis">
                                        <label class="form-check-label" for="inlineCheckbox1">Tidak menangis</label>
                                      </div>
                                      <div class="form-group form-check form-check-inline" style="margin-left: 55px;">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Kelainan bawaan">
                                        <label class="form-check-label" for="inlineCheckbox2">Kelainan bawaan</label>
                                      </div>
                                      <div class="form-group">
                                        <label class="form-check-label fw-bold" for="inlineRadio1">Asuhan Bayi Baru Lahir :</label>
                                      </div>
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi" name="asuhan_bayi_baru_lahir">
                                        <label class="form-check-label" for="inlineCheckbox1">Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi</label>
                                      </div>
                                    
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Suntikan Vitamin K1">
                                        <label class="form-check-label" for="inlineCheckbox1">Suntikan Vitamin K1</label>
                                      </div>
                                      <div class="form-group">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Salep mata antibiotika profilaksis">
                                        <label class="form-check-label" for="inlineCheckbox2">Salep mata antibiotika profilaksis</label>
                                      </div>
                                      <div class="form-group">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Imunisasi Hepatitis B">
                                        <label class="form-check-label" for="inlineCheckbox2">Imunisasi Hepatitis B</label>
                                      </div>
                                      <div class="form-group form-check-inline">
                                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Tidak menangis">
                                        <label class="form-check-label" for="inlineCheckbox1">Tidak menangis</label>
                                      </div>
                                      <!--<div class="form-group">-->
                                      <!--  <label class="form-check-label fw-bold" for="inlineRadio1">Keterangan Tambahan Anak</label>-->
                                      <!--</div>-->
                                      <!--<div class="form-group">-->
                                      <!--  <input type="text" class="form-control  @error('keterangan_tambahan_anak') is-invalid @enderror" id="keterangan_tambahan_anak"-->
                                      <!--placeholder="Masukan Keterangan Tambahan Anak..." name="keterangan_tambahan_anak" value="{{ old('berat_lahir') }}"  autofocus autocomplete="off">-->
                                      <!--</div>-->
 
                                  </div>
                                  </div>
                                </div>
                              
                                
                        </div>
                      
                    </div>
                   
                  </div>
                  <div class="card-body text-center" style="margin-top: -50px; margin-left:80px;">
                    <div class="row" >
                      <div class="col-1">
                      <button type="submit" value="simpan" name="btnSimpan" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button>
                    </form>
                      </div>
                      <div class="col-1" style="margin-left: 30px;">
                        <button type="button" onclick="window.location='{{ url('kesehatanibubersalin') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                      </div>
                     
                    </div>
                     
                     
                  </div>
            
        </div>
      
                 <script>
     
             $('#datepicker').datepicker({
            uiLibrary: 'bootstrap5',
            format: 'dd/mm/yyyy',
                });
                
                
             $('#datepicker2').datepicker({
            uiLibrary: 'bootstrap5',
            format: 'dd/mm/yyyy',
                });
                
           
        
        
        </script>
@endsection