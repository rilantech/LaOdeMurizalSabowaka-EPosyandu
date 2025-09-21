@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-5">
            <h4 class="text-center">Kesehatan Ibu Hamil</h4>
        </div>
        <div class="row">
          <div class="col-9">
              @if (session()->has('msg'))

              <div class="alert alert-success alert-dismissible col-xl-6 col-sm-6 fade show mb-2" role="alert">
                    {{ session('msg') }}
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
              </div>
                  
             @endif
          </div> 
      </div>
        <div class="row" style="margin-left: 850px; margin-top:-30px;">
          <div class="col-6">
            <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color:  #4DA8DA;" onclick="window.location='{{ url('tambahkesehatanibuhamil') }}'">Tambah Data Kehamilan</button>
          </div>
        
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
               
                <div class="row" >
                  <div class="form-group">
                  <div class="col-4 mt-3" style="margin-left: 50px;"> 
                    <label for="kehamilan_ke" class="col-12">Kehamilan Ke-</label>
                   </div>
                  <div style="margin-left: 50px; width:300px;">
                    <form method="get">
                      <select class="form-select @error('nik') is-invalid @enderror"  aria-label="Default select example" name="kehamilan_keberapa" id="nik" onchange="window.history.pushState({}, '', window.location.href='/kesehatanibuhamil/'+<?=$id;?>+'?status_kehamilan=<?=$status_kehamilan;?>'+'&kehamilan_keberapa='+this.value)">
                        <option selected>--Pilih Kehamilan--</option>
                        @if($data2 != null)
                        @foreach ($data2 as $item)
                        <option value="{{ $item->kehamilan_ke }}">{{ $item->kehamilan_ke }}</option>
                        @endforeach
                        <!--@else-->
                        <!--<option selected>--Pilih Kehamilan--</option>-->
                        @endif
                        <!--@if($data4 != null)-->
                        <!--@foreach ($data4 as $item1)-->
                        <!--<option value="test" {{ old('nik') }} selected>{{ $item1->kehamilan_ke }}</option>-->
                        <!--@endforeach-->
                        <!--@endif-->
                        </select>
                      </form>
                  
                  </div>
                  </div>
                </div>
                <div class="row mt-3">
                    <div class="form-group col-4"  style="margin-left:50px;width:330px;" >
                      <label for="nik">NIK</label>
                      <input type="text" class="form-control @error('hari_pertama_haid_terakhir') is-invalid @enderror"  placeholder="Masukan Hari Pertama Haid Terakhir..." name="hari_pertama_haid_terakhir" value="{{ $nik }}">        
                        
                        @error('nik')
                        <div class="invalid-feedback">
                          {{ $message }}
                        </div>
                    @enderror
        
           
        </div>
   
                </div>
                <div class="row" >
                    <div class="col-md-12 mx-auto p-5" >
                       
                            {{-- <form class="form-horizontal" action='{{  url('dataorangtuadananak') }}' method='post'>
                                @csrf --}}
                             
      
                    </div>
                </div>
              
               
                   
                <form action="{{ url('kesehatanibuhamil/'.$id.'?status_kehamilan='.$status_kehamilan) }}" method='post'>
                  @csrf
                  @method('PUT')
                  @foreach($data4 as $item)
                  <input type="text" class="form-control" id="nik"
                  placeholder="Tahun.." name="id[]" value="{{ $item->id }}"  autofocus autocomplete="off" hidden>
                  @endforeach
                  
                  @foreach($data4 as $item)
                  <input type="text" class="form-control" id="nik"
                  placeholder="Tahun.." name="nik_ibu[]" value="{{ $item->nik_ibu }}" autofocus autocomplete="off" hidden>
                  @endforeach
                  @foreach($data4 as $item)
                  <input type="text" class="form-control" id="nik"
                  placeholder="Tahun.." name="kehamilan_ke[]" value="{{ $item->kehamilan_ke }}" autofocus autocomplete="off" hidden>
                  @endforeach
                  @foreach($data4 as $item)
                  <input type="text" class="form-control" id="nik"
                  placeholder="Tahun.." name="kehamilan_ke1" value="{{ $item->kehamilan_ke }}" autofocus autocomplete="off" hidden>
                  @endforeach
                  <div class="row p-5" style="margin-bottom: 50px; margin-top:-150px;">
                    <div class="col-12">
                      <div class="row" style="margin-top: -58px; margin-left:325px;">
                      <div class="col-6">         
                        <div class="form-group">
            
                          <label for="nik" class="col-12">Hari Pertama Haid Terakhir (HPTP)</label>
                          @if(!$data4 == null)
                          @foreach($data4 as $item1)
                           <!--<input type="text" class="form-control @error('hari_pertama_haid_terakhir') is-invalid @enderror"  placeholder="Masukan Hari Pertama Haid Terakhir..." name="hari_pertama_haid_terakhir[]" value="{{ $item1->hari_pertama_haid_terakhir }}">-->
                          
                           <input class="form-control @error('hari_pertama_haid_terakhir') is-invalid @enderror"  id="datepicker" 
                        data-date-format="dd-mm-yyyy" name="hari_pertama_haid_terakhir[]" value="{{ $item1->hari_pertama_haid_terakhir }}"/>
                          @endforeach
                          @else
                           <input class="form-control @error('hari_pertama_haid_terakhir') is-invalid @enderror"  id="datepicker" 
                        data-date-format="dd-mm-yyyy" name="hari_pertama_haid_terakhir[]"/>
                          @endif 
                          @error('hari_pertama_haid_terakhir')
                           <div class="invalid-feedback">
                             {{ $message }}
                           </div>
                       @enderror
                          </div>
                      </div>
                      <div class="col-6">
                        <div class="form-group">
                          <label for="nik" class="col-12">Riwayat Penyakit Yang Di Derita Ibu</label>
                          @if(!$data4 == null)
                          @foreach($data4 as $item1)
                          <select class="form-select @error('riwayat_penyakit_yg_di_derita_ibu') is-invalid @enderror"  aria-label="Default select example" name="riwayat_penyakit_yg_di_derita_ibu[]" id="riwayat_penyakit_yg_di_derita_ibu">
                                          <option selected value="{{ $item1->riwayat_penyakit_yg_di_derita_ibu }}">{{ $item1->riwayat_penyakit_yg_di_derita_ibu }}</option>
                                          <option value= "Preeklamsia" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Preeklamsia</option>
                                          <option value= "Diabetes" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Diabetes</option>
                                          <option value= "Muntah Kronis" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Muntah Kronis</option>
                                          <option value= "Pendarahan" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Pendarahan</option>
                                          <option value= "Toksoplasmosis" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Toksoplasmosis</option>
                                          <option value= "Berat Badan Yang Rendah" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Berat Badan Yang Rendah</option>
                                          <option value= "Depresi" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Depresi</option>
                                          <option value= "Kehamilan Ektopik" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Kehamilan Ektopik</option>
                                          <option value= "Tidak Ada" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Tidak Ada</option>
                         </select>
                          
                           <!--<input type="text" class="form-control @error('riwayat_penyakit_yg_di_derita_ibu') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Riwayat Penyakit Yg Di Derita Ibu..." name="riwayat_penyakit_yg_di_derita_ibu[]" value="{{ $item1->riwayat_penyakit_yg_di_derita_ibu }}">-->
                           @endforeach
                           @else
                            <select class="form-select @error('riwayat_penyakit_yg_di_derita_ibu') is-invalid @enderror"  aria-label="Default select example" name="riwayat_penyakit_yg_di_derita_ibu[]" id="riwayat_penyakit_yg_di_derita_ibu">
                                          <option selected>--Pilih Riwayat Penyakit--</option>
                                          <option value= "Preeklamsia" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Preeklamsia</option>
                                          <option value= "Diabetes" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Diabetes</option>
                                          <option value= "Muntah Kronis" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Muntah Kronis</option>
                                          <option value= "Pendarahan" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Pendarahan</option>
                                          <option value= "Toksoplasmosis" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Toksoplasmosis</option>
                                          <option value= "Berat Badan Yang Rendah" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Berat Badan Yang Rendah</option>
                                          <option value= "Depresi" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Depresi</option>
                                          <option value= "Kehamilan Ektopik" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Kehamilan Ektopik</option>
                                          <option value= "Tidak Ada" {{ old('riwayat_penyakit_yg_di_derita_ibu') }}>Tidak Ada</option>
                         </select>
                           
                           <!--<input type="text" class="form-control @error('riwayat_penyakit_yg_di_derita_ibu') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Riwayat Penyakit Yg Di Derita Ibu..." name="riwayat_penyakit_yg_di_derita_ibu[]" value="{{ old('riwayat_penyakit_yg_di_derita_ibu') }}">-->
                           @endif 
                          </div>
                         @error('riwayat_penyakit_yg_di_derita_ibu')
                           <div class="invalid-feedback">
                             {{ $message }}
                           </div>
                       @enderror
                      </div>
                      
                    </div>
                      <div class="row">
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Nama Ibu</label>
                             <input type="text" class="form-control" id="nama_ibu" placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}">
                           </div>
                        </div>
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Hari Taksiran Persalinan (HTP)</label>
                            @if(!$data4 == null)
                            @foreach($data4 as $item1)
                            <input class="form-control @error('hari_taksiran_persalinan') is-invalid @enderror" id="datepicker2" 
                        data-date-format="dd-mm-yyyy" name="hari_taksiran_persalinan[]" value="{{ $item1->hari_taksiran_persalinan }}"/>
                        
                             <!--<input type="text" class="form-control @error('hari_taksiran_persalinan') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Hari Taksiran Persalinan (HTP)..." name="hari_taksiran_persalinan[]" value="{{ $item1->hari_taksiran_persalinan }}">-->
                            @endforeach
                            @else
                            <input class="form-control @error('hari_taksiran_persalinan') is-invalid @enderror" id="datepicker2" 
                        data-date-format="dd-mm-yyyy" name="hari_taksiran_persalinan[]" value="{{ old('hari_taksiran_persalinan') }}"/>
                            <!--<input type="text" class="form-control @error('hari_taksiran_persalinan') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Hari Taksiran Persalinan (HTP)..." name="hari_taksiran_persalinan[]" value="{{ old('hari_taksiran_persalinan') }}">-->
                            @endif
                            @error('hari_taksiran_persalinan')
                            <div class="invalid-feedback">
                               {{ $message }}
                             </div>
                         @enderror
                            </div>
                        </div>
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Riwayat Alergi</label>
                            @if(!$data4 == null)
                            @foreach($data4 as $item1)
                             <select class="form-select @error('riwayat_alergi') is-invalid @enderror"  aria-label="Default select example" name="riwayat_alergi[]" id="riwayat_alergi">
                                          <option selected value="{{ $item1->riwayat_alergi }}">{{ $item1->riwayat_alergi }}</option>
                                          <option value= "Asma" {{ old('riwayat_alergi') }}>Asma</option>
                                          <option value= "Gatal Pada Mata" {{ old('riwayat_alergi') }}>Gatal Pada Mata</option>
                                          <option value= "Roam Kulit" {{ old('riwayat_alergi') }}>Roam Kulit</option>
                                          <option value= "Hidung Gatal Dan Berair" {{ old('riwayat_alergi') }}>Hidung Gatal Dan Berair</option>
                                          <option value= "Bersin-bersin" {{ old('riwayat_alergi') }}>Bersin-bersin</option>
                                          <option value= "Diare atau Muntah" {{ old('riwayat_alergi') }}>Diare atau Muntah</option>
                                          <option value= "Tidak Ada" {{ old('riwayat_alergi') }}>Tidak Ada</option>
                              
                            </select>
                            
                             <!--<input type="text" class="form-control @error('riwayat_alergi') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Riwayat Alergi..." name="riwayat_alergi" value="{{ $item1->riwayat_alergi }}">-->
                            @endforeach
                            @else
                             <select class="form-select @error('riwayat_alergi') is-invalid @enderror"  aria-label="Default select example" name="riwayat_alergi[]" id="riwayat_alergi">
                                    <option selected>--Pilih Riwayat Alergi--</option>
                                    <option value= "Asma" {{ old('riwayat_alergi') }}>Asma</option>
                                    <option value= "Gatal Pada Mata" {{ old('riwayat_alergi') }}>Gatal Pada Mata</option>
                                    <option value= "Roam Kulit" {{ old('riwayat_alergi') }}>Roam Kulit</option>
                                    <option value= "Hidung Gatal Dan Berair" {{ old('riwayat_alergi') }}>Hidung Gatal Dan Berair</option>
                                    <option value= "Bersin-bersin" {{ old('riwayat_alergi') }}>Bersin-bersin</option>
                                    <option value= "Diare atau Muntah" {{ old('riwayat_alergi') }}>Diare atau Muntah</option>
                                    <option value= "Tidak Ada" {{ old('riwayat_alergi') }}>Tidak Ada</option>
                              
                            </select>
                            
                            <!--<input type="text" class="form-control @error('riwayat_alergi') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Riwayat Alergi..." name="riwayat_alergi" value="{{ old('riwayat_alergi') }}">-->
                            @endif 
                            @error('riwayat_alergi')
                             <div class="invalid-feedback">
                               {{ $message }}
                             </div>
                         @enderror
                            </div>
                        </div>
                      </div>
                       @php
                            setlocale(LC_ALL, 'id_ID.UTF-8');
                        @endphp
                      <div class="row">
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Tempat/Tanggal Lahir</label>
                              <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                              placeholder="Masukan Tempat/Tanggal Lahir..." name="tempat_atau_tanggal_lahir" value="{{$tempat_lahir_ibu }}/{{ strftime('%d %B %Y', strtotime($tanggal_lahir_ibu))}}"  autofocus autocomplete="off">
                                @error('nama_ibu')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                              
                           </div>
                        </div>
                        <div class="col-4">
                          <div class="form-group">
                            <div class="row">
                              <div class="col-4 mt-3">
                               <label for="kehamilan_ke" class="col-12">Golongan Darah</label>
                              </div>
                              <div class="col-8 mt-3">
                                @if(!$data4 == null)
                                @foreach($data4 as $item1)
                                <select class="form-select @error('golongan_darah') is-invalid @enderror"  aria-label="Default select example" name="golongan_darah[]" id="golongan_darah">
                                          <option selected value="{{ $item1->golongan_darah }}">{{ $item1->golongan_darah }}</option>
                                          <option value= "A" {{ old('golongan_darah') }}>A</option>
                                          <option value= "B" {{ old('golongan_darah') }}>B</option>
                                          <option value= "AB" {{ old('golongan_darah') }}>AB</option>
                                          <option value= "O" {{ old('golongan_darah') }}>O</option>
                                    </select>
                                @endforeach
                                @else
                                  <select class="form-select @error('golongan_darah') is-invalid @enderror"  aria-label="Default select example" name="golongan_darah[]" id="golongan_darah">
                                          <option selected>--Pilih Golongan Darah--</option>
                                          <option value= "A" {{ old('golongan_darah') }}>A</option>
                                          <option value= "B" {{ old('golongan_darah') }}>B</option>
                                          <option value= "AB" {{ old('golongan_darah') }}>AB</option>
                                          <option value= "O" {{ old('golongan_darah') }}>O</option>
                                    </select>
                                    
                                <!--<input type="text" class="form-control  @error('golongan_darah') is-invalid @enderror" id="kehamilan_ke"-->
                                <!--placeholder="Masukan Gol. Darah..." name="golongan_darah[]" value="{{ old('golongan_darah') }}"  autofocus autocomplete="off">-->
                                @endif
                                @error('golongan_darah')
                               <div class="invalid-feedback">
                                 {{ $message }}
                               </div>
                           @enderror
                              </div>
                             
                           </div>
                           </div>
                        </div>
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Status Imunisasi Tetanus (T) Terakhir</label>
                            @if(!$data4 == null)
                            @foreach($data4 as $item1)
                            <select class="form-select @error('status_imunisasi_tetanus_terakhir') is-invalid @enderror"  aria-label="Default select example" name="status_imunisasi_tetanus_terakhir[]" id="status_imunisasi_tetanus_terakhir">
                                          <option selected value="{{ $item1->status_imunisasi_tetanus_terakhir }}">{{ $item1->status_imunisasi_tetanus_terakhir }}</option>
                                          <option value= "TT1" {{ old('status_imunisasi_tetanus_terakhir') }}>TT1</option>
                                          <option value= "TT2" {{ old('status_imunisasi_tetanus_terakhir') }}>TT2</option>
                                          <option value= "TT3" {{ old('status_imunisasi_tetanus_terakhir') }}>TT3</option>
                                          <option value= "TT4" {{ old('status_imunisasi_tetanus_terakhir') }}>TT4</option>
                                          <option value= "TT5" {{ old('status_imunisasi_tetanus_terakhir') }}>TT5</option>
                            </select>
                            
                            <!--<input type="text" class="form-control  @error('status_imunisasi_tetanus_terakhir') is-invalid @enderror" id="nama_ibu"-->
                            <!--        placeholder="Status Imunisasi Tetanus..." name="status_imunisasi_tetanus_terakhir" value="{{ $item1->status_imunisasi_tetanus_terakhir }}"  autofocus autocomplete="off">-->
                             @endforeach
                             @else
                             <select class="form-select @error('status_imunisasi_tetanus_terakhir') is-invalid @enderror"  aria-label="Default select example" name="status_imunisasi_tetanus_terakhir[]" id="status_imunisasi_tetanus_terakhir">
                                          <option selected>--Pilih Status Imunisasi Tetanus (T) Terakhir--</option>
                                          <option value= "TT1" {{ old('status_imunisasi_tetanus_terakhir') }}>TT1</option>
                                          <option value= "TT2" {{ old('status_imunisasi_tetanus_terakhir') }}>TT2</option>
                                          <option value= "TT3" {{ old('status_imunisasi_tetanus_terakhir') }}>TT3</option>
                                          <option value= "TT4" {{ old('status_imunisasi_tetanus_terakhir') }}>TT4</option>
                                          <option value= "TT5" {{ old('status_imunisasi_tetanus_terakhir') }}>TT5</option>
                                         
                            </select>
                            
                              <!--<input type="text" class="form-control  @error('status_imunisasi_tetanus_terakhir') is-invalid @enderror" id="nama_ibu"-->
                              <!--  placeholder="Status Imunisasi Tetanus..." name="status_imunisasi_tetanus_terakhir" value="{{ old('status_imunisasi_tetanus_terakhir') }}"  autofocus autocomplete="off">-->
                                @endif
                                @error('status_imunisasi_tetanus_terakhir')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                              
                           </div>
                        </div>
                      </div>
                      <div class="row">
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Penggunaan Kontrasepsi Sebelum Hamil</label>
                            @if(!$data4 == null)
                            @foreach($data4 as $item1)
                             <select class="form-select @error('penggunaan_kontrasepsi_sebelum_hamil') is-invalid @enderror"  aria-label="Default select example" name="penggunaan_kontrasepsi_sebelum_hamil[]" id="agama_ibu">
                                <option selected value="{{ $item1->penggunaan_kontrasepsi_sebelum_hamil }}">{{ $item1->penggunaan_kontrasepsi_sebelum_hamil }}</option>
                                <option value= "Pil KB" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Pil KB</option>
                                <option value= "Suntik KB 1 Bulan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Suntik KB 1 Bulan</option>
                                <option value= "Suntik 3 Bulan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Suntik 3 Bulan</option>
                                <option value= "Implan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Implan</option>
                                <option value= "Kondom" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Kondom</option>
                                <option value= "AKDR (IUD)" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>AKDR (IUD)</option>
                                <option value= "Tidak Ada" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Tidak Ada</option>
                            </select>
                            <!--<input type="text" class="form-control  @error('penggunaan_kontrasepsi_sebelum_hamil') is-invalid @enderror" id="nama_ibu"-->
                            <!--        placeholder="Masukan Penggunaan Kontrasepsi..." name="penggunaan_kontrasepsi_sebelum_hamil" value="{{ $item1->penggunaan_kontrasepsi_sebelum_hamil }}"  autofocus autocomplete="off">-->
                            @endforeach
                            @else
                             <select class="form-select @error('penggunaan_kontrasepsi_sebelum_hamil') is-invalid @enderror"  aria-label="Default select example" name="penggunaan_kontrasepsi_sebelum_hamil[]" id="agama_ibu" >
                                <option selected>--Pilih Kontrasepsi Sebelum Hamil--</option>
                                <option value= "Pil KB" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Pil KB</option>
                                <option value= "Suntik KB 1 Bulan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Suntik KB 1 Bulan</option>
                                <option value= "Suntik 3 Bulan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Suntik 3 Bulan</option>
                                <option value= "Implan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Implan</option>
                                <option value= "Kondom" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Kondom</option>
                                <option value= "AKDR (IUD)" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>AKDR (IUD)</option>
                                <option value= "Tidak Ada" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Tidak Ada</option>
                            </select>
                            <!--<input type="text" class="form-control  @error('penggunaan_kontrasepsi_sebelum_hamil') is-invalid @enderror" id="nama_ibu"-->
                            <!--placeholder="Masukan Penggunaan Kontrasepsi..." name="penggunaan_kontrasepsi_sebelum_hamil" value="{{ old('penggunaan_kontrasepsi_sebelum_hamil') }}"  autofocus autocomplete="off">-->
                            @endif   
                            @error('penggunaan_kontrasepsi_sebelum_hamil')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                              
                           </div>
                        </div>
                       
                        <div class="col-4">
                          <div class="form-group">
                            <div class="row">
                              <div class="col-5 mt-3">
                               <label for="kehamilan_ke" class="col-12">Tinggi Badan (cm)</label>
                              </div>
                              <div class="col-7 mt-3">
                                @if(!$data4 == null)
                                @foreach($data4 as $item1)
                               <input type="text" class="form-control  @error('tinggi_badan') is-invalid @enderror" id="kehamilan_ke"
                               placeholder="Masukan Tinggi Badan..." name="tinggi_badan" value="{{ $item1->tinggi_badan }}"  autofocus autocomplete="off">
                               @endforeach
                               @else
                               <input type="text" class="form-control  @error('tinggi_badan') is-invalid @enderror" id="kehamilan_ke"
                               placeholder="Masukan Tinggi Badan..." name="tinggi_badan" value="{{ old('tinggi_badan') }}"  autofocus autocomplete="off">
                               @endif
                               @error('tinggi_badan')
                               <div class="invalid-feedback">
                                 {{ $message }}
                               </div>
                           @enderror
                              </div>
                             
                           </div>
                           </div>
                        </div>
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Status Kehamilan</label>
                            @if(!$data4 == null)
                            @foreach($data4 as $item1)
                             <select class="form-select @error('riwayat_alergi') is-invalid @enderror"  aria-label="Default select example" name="status_kehamilan[]" id="riwayat_alergi">
                                          <option selected value="{{ $item1->status_kehamilan }}">{{ $item1->status_kehamilan }}</option>
                                          <option value= "Sedang Berlangsung" {{ old('status_kehamilan') }}>Sedang Berlangsung</option>
                                          <option value= "Berakhir" {{ old('status_kehamilan') }}>Berakhir</option>
                            </select>
                            
                             <!--<input type="text" class="form-control @error('riwayat_alergi') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Riwayat Alergi..." name="riwayat_alergi" value="{{ $item1->riwayat_alergi }}">-->
                            @endforeach
                            @else
                             <select class="form-select @error('riwayat_alergi') is-invalid @enderror"  aria-label="Default select example" name="status_kehamilan[]" id="riwayat_alergi">
                                          <option selected>--Pilih Status Kehamilan--</option>
                                          <option value= "Sedang Berlangsung" {{ old('status_kehamilan') }}>Sedang Berlangsung</option>
                                          <option value= "Berakhir" {{ old('status_kehamilan') }}>Berakhir</option>
                            </select>
                            
                            <!--<input type="text" class="form-control @error('riwayat_alergi') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Riwayat Alergi..." name="riwayat_alergi" value="{{ old('riwayat_alergi') }}">-->
                            @endif 
                            @error('status_kehamilan')
                             <div class="invalid-feedback">
                               {{ $message }}
                             </div>
                         @enderror
                            </div>
                        </div>
                      </div>
                      <div class="row" style="margin-left: 800px; margin-top:50px; margin-bottom:50px;">
                        <div class="col-6">
                          <button type="button" id="tambahbaris" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color:  #4DA8DA;">Tambah</button>
                        </div>
                      
                      </div>
                      <batascopy>
                      <div class="table-responsive bg-white">
                        <table class="table table-bordered table-hover text-center" id="tabelku">
                            <thead class="text-center">
                                <tr style="background-color: #4DA8DA;">
                                    <th class="col-1 text-capitalize">Nama Pemeriksa, Tempat Pelayanan</th>
                                    <th class="col-1 text-capitalize">Tanggal</th>
                                    <th class="col-1 text-capitalize">Keluhan</th>
                                    <th class="col-1 text-capitalize">U.K (mg)</th>
                                    <th class="col-1 text-capitalize">BB (kg)</th>
                                    <th class="col-1 text-capitalize">TD (mm/Hg)</th>
                                    <th class="col-1 text-capitalize">LILA (cm)</th>
                                    <th class="col-1 text-capitalize">Tinggi Fundus</th>
                                    <th class="col-1 text-capitalize">Letak Janin</th>
                                    <th class="col-1 text-capitalize">Imunisasi</th>
                                    <th class="col-1 text-capitalize">Tablet Tambah Darah</th>
                                    <th class="col-1 text-capitalize">Lab</th>
                                    <th class="col-1 text-capitalize">Analisa</th>
                                    <th class="col-1 text-capitalize">Tata Laksana</th>
                                    <th class="col-1 text-capitalize">Konseling</th>
                                    <th class="col-1 text-capitalize">Catatan Tambahan</th>
                                    <!--<th class="col-1 text-capitalize">Aksi</th>-->
                                </tr>
                            </thead>
                            <tbody  style="background-color: white;">  
                              @foreach ($data3 as $item)
                              <tr>
                              <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"
                              placeholder="Tahun.." name="nik_ibuku[]" value="{{ $item->nik_ibu }}"  autofocus autocomplete="off" hidden>     
                              
                              <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"
                              placeholder="Tahun.." name="id1[]" value="{{ $item->id }}"  autofocus autocomplete="off" hidden>

                              <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"
                              placeholder="Tahun.." name="kehamilan_ke1[]" value="{{ $item->kehamilan_ke }}"  autofocus autocomplete="off" hidden>

                                     <th class="col-1">
                                      <input type="text" class="form-control  @error('nama_pemeriksa') is-invalid @enderror" id="tahun"
                                       placeholder="Nama Pemeriksa.." name="nama_pemeriksa[]" value="{{ $item->nama_pemeriksa_dan_tempat_pelayanan }}"  autofocus autocomplete="off">
                                        @error('nama_pemeriksa')
                                        <div class="invalid-feedback">
                                      {{ $message }}
                                       </div>
                                    @enderror</th>
                                 
                                 <th class="col-1"><input type="text" class="form-control  @error('tanggal') is-invalid @enderror" id="berat_lahir"
                                 placeholder="Tanggal..." name="tanggal[]" value="{{ $item->tanggal }}"  autofocus autocomplete="off">
                                  @error('tanggal')
                                 <div class="invalid-feedback">
                                  {{ $message }}
                                       </div>
                                   @enderror</th>
                                     <th class="col-1"><input type="text" class="form-control  @error('keluhan') is-invalid @enderror" id="keluhan"
                                        placeholder="Tempat Bersalin..." name="keluhan[]" value="{{ $item->keluhan }}"  autofocus autocomplete="off">
                                        @error('keluhan')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('uk') is-invalid @enderror" id="uk"
                                        placeholder="U.K..." name="uk[]" value="{{ $item->uk }}"  autofocus autocomplete="off">
                                        @error('uk')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('bb') is-invalid @enderror" id="bb"
                                        placeholder="BB..." name="bb[]" value="{{ $item->bb }}"  autofocus autocomplete="off">
                                        @error('bb')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('td') is-invalid @enderror" id="td"
                                        placeholder="TD..." name="td[]" value="{{ $item->td }}"  autofocus autocomplete="off">
                                        @error('td')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('lila') is-invalid @enderror" id="lila"
                                        placeholder="LILA..." name="lila[]" value="{{ $item->lila }}"  autofocus autocomplete="off">
                                        @error('lila')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('tinggi_fundus') is-invalid @enderror" id="tinggi_fundus"
                                        placeholder="Tinggi Fundus..." name="tinggi_fundus[]" value="{{ $item->tinggi_fundus }}"  autofocus autocomplete="off">
                                        @error('tinggi_fundus')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('letak_janin') is-invalid @enderror" id="letak_janin"
                                        placeholder="Letak Janin..." name="letak_janin[]" value="{{ $item->letak_janin }}"  autofocus autocomplete="off">
                                        @error('letak_janin')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                   @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('imunisasi') is-invalid @enderror" id="imunisasi"
                                        placeholder="Imunisasi..." name="imunisasi[]" value="{{ $item->imunisasi }}"  autofocus autocomplete="off">
                                        @error('imunisasi')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('tablet_tambah_darah') is-invalid @enderror" id="tablet_tambah_darah"
                                        placeholder="Tablet Tambah Darah..." name="tablet_tambah_darah[]" value="{{ $item->tablet_tambah_darah }}"  autofocus autocomplete="off">
                                        @error('tablet_tambah_darah')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('lab') is-invalid @enderror" id="lab"
                                        placeholder="Lab..." name="lab[]" value="{{ $item->lab }}"  autofocus autocomplete="off">
                                        @error('lab')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('analisa') is-invalid @enderror" id="analisa"
                                        placeholder="Analisa..." name="analisa[]" value="{{ $item->analisa }}"  autofocus autocomplete="off">
                                        @error('analisa')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('tata_laksana') is-invalid @enderror" id="tata_laksana"
                                        placeholder="Tata Laksana..." name="tata_laksana[]" value="{{ $item->tata_laksana }}"  autofocus autocomplete="off">
                                        @error('tata_laksana')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                      </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('konseling') is-invalid @enderror" id="konseling"
                                        placeholder="Konseling..." name="konseling[]" value="{{ $item->konseling }}"  autofocus autocomplete="off">
                                        @error('konseling')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('catatan_tambahan') is-invalid @enderror" id="catatan_tambahan"
                                        placeholder="Catatan Tambahan..." name="catatan_tambahan[]" value="{{ $item->catatan_tambahan }}"  autofocus autocomplete="off">
                                        @error('catatan_tambahan')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                    <th class="col-3">
                                      <div class="row">
                                        <div class="col-4 text-center">
                                        {{-- <form onsubmit="return deleteData('{{ $item->tanggal }}')" action="{{ url('kesehatanibuhamil/'.$item->id) }}" method="POST"> 
                                         @csrf
                                         @method('DELETE')
                                         <input type="text"
                                         placeholder="Tahun.." name="nik_ibuku4[]" value="{{ $item->nik_ibu }}"  autofocus autocomplete="off" hidden>     
                                         
                                         <input type="text" 
                                          placeholder="Lab..." name="kehamilan_ke4[]" value="{{ $item->kehamilan_ke }}"  autofocus autocomplete="off" hidden>
                                          <input type="text" id="lab"
                                            placeholder="Lab..." name="id4" value="{{ $id }}"  autofocus autocomplete="off" hidden>
                                            <button type="submit" title="Hapus" class="btn btn-danger btn-md">
                                              <i class="fa fa-trash-alt">Hapus</i>
                                            </button> --}}
                                       {{-- </form> --}}
                                      </div>
                                      </div>
                                    </th>
                                     
                              </tr>
                              @endforeach
                        </tbody>
                         
                        </table>
                        
                          
                        </div>
                    
             

            <div class="card-body text-center" style="margin-top: 20px;">
              <div class="row" >
                <div class="col-1">
                
                <script>
                  $('#tambahbaris').click( function() {      
                    var tableID = "tabelku";
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;
                    var row = table.insertRow(rowCount);
                    
                    var element1 = 
                    '<tr>'+
                      '@foreach($data4 as $row)'+
                      '<input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"'+
                      'placeholder="Tahun.." name="kehamilan_ke2[]" value="{{ $row->kehamilan_ke }}"  autofocus autocomplete="off" hidden>'+                
                      '@endforeach'+
                      '<input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"'+
                      'placeholder="Tahun.." name="nik_ibuku2[]" value="{{ $nik }}"  autofocus autocomplete="off" hidden>'+                
                            ' <th class="col-1"><input type="text" class="form-control  @error('nama_pemeriksa') is-invalid @enderror" id="tahun"'+
                               ' placeholder="Nama Pemeriksa.." name="nama_pemeriksa2[]" value="{{ old('nama_pemeriksa2[]') }}"  autofocus autocomplete="off">'+
              
                                '@error('nama_pemeriksa')'+
                                '<div class="invalid-feedback">'+
                                  '{{ $message }}'+
                               ' </div>'+
                            '@enderror</th>'+
                         
                         '     <th class="col-1"><input type="text" class="form-control  @error('tanggal') is-invalid @enderror" id="berat_lahir"'+
                         '       placeholder="Tanggal..." name="tanggal2[]" value="{{ old('tanggal2[]') }}"  autofocus autocomplete="off">'+
                         '       @error('tanggal')'+
                         '       <div class="invalid-feedback">'+
                         '         {{ $message }}'+
                         '       </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('keluhan') is-invalid @enderror" id="keluhan"'+
                          '      placeholder="Tempat Bersalin..." name="keluhan2[]" value="{{ old('keluhan2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('keluhan')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                        '      <th class="col-1"><input type="text" class="form-control  @error('uk') is-invalid @enderror" id="uk"'+
                        '        placeholder="U.K..." name="uk2[]" value="{{ old('uk2[]') }}"  autofocus autocomplete="off">'+
                        '        @error('uk')'+
                        '        <div class="invalid-feedback">'+
                        '          {{ $message }}'+
                        '        </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('bb') is-invalid @enderror" id="bb"'+
                          '      placeholder="BB..." name="bb2[]" value="{{ old('bb2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('bb')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('td') is-invalid @enderror" id="td"'+
                          '      placeholder="TD..." name="td2[]" value="{{ old('td2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('td')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('lila') is-invalid @enderror" id="lila"'+
                          '      placeholder="LILA..." name="lila2[]" value="{{ old('lila2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('lila')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('tinggi_fundus') is-invalid @enderror" id="tinggi_fundus"'+
                          '      placeholder="Tinggi Fundus..." name="tinggi_fundus2[]" value="{{ old('tinggi_fundus2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('tinggi_fundus')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('letak_janin') is-invalid @enderror" id="letak_janin"'+
                          '      placeholder="Letak Janin..." name="letak_janin2[]" value="{{ old('letak_janin2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('letak_janin')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('imunisasi') is-invalid @enderror" id="imunisasi"'+
                          '      placeholder="Imunisasi..." name="imunisasi2[]" value="{{ old('imunisasi2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('imunisasi')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('tablet_tambah_darah') is-invalid @enderror" id="tablet_tambah_darah"'+
                          '      placeholder="Tablet Tambah Darah..." name="tablet_tambah_darah2[]" value="{{ old('tablet_tambah_darah2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('tablet_tambah_darah')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('lab') is-invalid @enderror" id="lab"'+
                          '      placeholder="Lab..." name="lab2[]" value="{{ old('lab2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('lab')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('analisa') is-invalid @enderror" id="analisa"'+
                          '      placeholder="Analisa..." name="analisa2[]" value="{{ old('analisa2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('analisa')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('tata_laksana') is-invalid @enderror" id="tata_laksana"'+
                          '      placeholder="Tata Laksana..." name="tata_laksana2[]" value="{{ old('tata_laksana2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('tata_laksana')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('konseling') is-invalid @enderror" id="konseling"'+
                          '      placeholder="Konseling..." name="konseling2[]" value="{{ old('konseling2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('konseling')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1"><input type="text" class="form-control  @error('catatan_tambahan') is-invalid @enderror" id="catatan_tambahan"'+
                          '      placeholder="Catatan Tambahan..." name="catatan_tambahan2[]" value="{{ old('catatan_tambahan2[]') }}"  autofocus autocomplete="off">'+
                          '      @error('catatan_tambahan')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                               ' <td>  <div class="row">'+
                                 ' </div>'+
                            
                              '  </td>'+
                            '</tr>';
                  row.innerHTML = element1; 
                 });
      
                 
                 </script> 
                <button type="submit" value="simpan" name="btnSimpan" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button>
              </form>
                </div>
                <div class="col-1" style="margin-left: 30px;">
                  <button type="button" onclick="window.location='{{ url('kesehatanibuhamil') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                </div>
                {{-- <div class="col-1" style="margin-left: 130px;">
                  <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFB0B0;">Edit</button>
              
                </div> --}}
               <!--@foreach ($data2 as $item)-->
               <!--      @php $kehamilan = $item->kehamilan_ke; @endphp-->
               <!--@endforeach-->
                      
                <div class="col-1" style="margin-left: 135px;">
                  <a href="{{ url('cetakkesehatanibuhamil/'.$id.'?kehamilan_keberapa='.$kehamilan_ke) }}" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFE700;" target="_blank">Eksport</a>
              
                </div>
              
            
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