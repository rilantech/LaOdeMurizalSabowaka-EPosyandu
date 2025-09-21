@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-5">
            <h4 class="text-center">Tambah Kesehatan Ibu Hamil</h4>
        </div>
        {{-- <div class="row" style="margin-left: 850px; margin-top:-30px;">
          <div class="col-6">
            <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color: #EE66A6;">Tambah Data Kehamilan</button>
          </div>
        
        </div> --}}

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
               
                <div class="row mt-5">
                    <div class="form-group col-4"  style="margin-left:50px;width:330px;" >
                      <label for="nik">NIK</label>
                      <form method="get">
                       
                        <select class="form-select @error('nik_ibuku') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">
                        
                          <option selected>--Pilih NIK Ibu--</option>
                          @if($dataorangtua != null)
                          @foreach ($dataorangtua as $item)
                          <option value="{{ $item->nik }}">{{ $item->nik }}</option>
                          @endforeach
                          @else
                          <option selected>--Pilih NIK--</option>
                          @endif
                          @if($dataorangtua1 != null)
                          @foreach ($dataorangtua1 as $item1)
                          <option value="test" {{ old('nik') }} selected>{{ $item1->nik }}</option>
                          @endforeach
                          @endif
                          </select>
                             @error('nik_ibuku')
                        <div class="invalid-feedback">
                          {{ $message }}
                        </div>
                    @enderror
                        </form>
                      
                     
        
           
        </div>
   
                </div>
                <div class="row" >
                    <div class="col-md-12 mx-auto p-5" >
                       
                            {{-- <form class="form-horizontal" action='{{  url('dataorangtuadananak') }}' method='post'>
                                @csrf --}}
                             
      
                    </div>
                </div>
                   
                    <form action="{{ url('kesehatanibuhamil') }}" method='post' >
                      @csrf
             
                  <div class="row p-5" style="margin-bottom: 50px; margin-top:-150px;">
                    <div class="col-12">
                      <div class="row" style="margin-top: -58px; margin-left:325px;">
                      <div class="col-6">
                                   
                        <div class="form-group">
                          <input type="text" class="form-control  @error('nik') is-invalid @enderror" id="nik"
                          placeholder="Tahun.." name="nikibu1" value="{{ $nikibuku }}"  autofocus autocomplete="off" hidden>
                          <label for="nik" class="col-12">Hari Pertama Haid Terakhir (HPTP)</label>
                        
                   
                        <input class="form-control @error('hari_pertama_haid_terakhir') is-invalid @enderror"  id="datepicker" 
                        data-date-format="dd-mm-yyyy" name="hari_pertama_haid_terakhir"/>
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
                          <select class="form-select @error('riwayat_penyakit_yg_di_derita_ibu') is-invalid @enderror"  aria-label="Default select example" name="riwayat_penyakit_yg_di_derita_ibu" id="riwayat_penyakit_yg_di_derita_ibu">
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
                          @error('riwayat_penyakit_yg_di_derita_ibu')
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
                            <label for="nik" class="col-12">Nama Ibu</label>
                            @if ($dataorangtua1 != null)
                            @foreach ($dataorangtua1 as $item1)
                             <input type="text" class="form-control" id="nama_ibu" placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $item1->nama_ibu }}">
                             @endforeach
                             @else
                             <input type="text" class="form-control" id="nama_ibu" placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ old('nama_ibu') }}">
                             @endif
                           </div>
                        </div>
                        <div class="col-4">
                          <div class="form-group">
                            <label for="nik" class="col-12">Hari Taksiran Persalinan (HTP)</label>
                             <input class="form-control @error('hari_taksiran_persalinan') is-invalid @enderror" id="datepicker2" 
                        data-date-format="dd-mm-yyyy" name="hari_taksiran_persalinan"/>
                             <!--<input type="text" class="form-control @error('hari_taksiran_persalinan') is-invalid @enderror" id="nama_ibu" placeholder="Masukan Hari Taksiran Persalinan (HTP)..." name="hari_taksiran_persalinan" value="{{ old('hari_taksiran_persalinan') }}">-->
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
                            <select class="form-select @error('riwayat_alergi') is-invalid @enderror"  aria-label="Default select example" name="riwayat_alergi" id="riwayat_alergi">
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
                            @if ($dataorangtua1 != null)
                            @foreach ($dataorangtua1 as $item1)
                              <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                              placeholder="Masukan Tempat/Tanggal Lahir..." name="tempat_atau_tanggal_lahir" value="{{$item1->tempat_lahir_ibu }}/{{ strftime('%d %B %Y', strtotime($item1->tanggal_lahir_ibu))}}"  autofocus autocomplete="off">
                            @endforeach
                              @else
                                <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                placeholder="Masukan Tempat/Tanggal Lahir..." name="tempat_atau_tanggal_lahir" value="{{ old('tempat_atau_tanggal_lahir') }}"  autofocus autocomplete="off">
                                @endif    
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
                                    <select class="form-select @error('golongan_darah') is-invalid @enderror"  aria-label="Default select example" name="golongan_darah" id="golongan_darah">
                                          <option selected>--Pilih Golongan Darah--</option>
                                          <option value= "A" {{ old('golongan_darah') }}>A</option>
                                          <option value= "B" {{ old('golongan_darah') }}>B</option>
                                          <option value= "AB" {{ old('golongan_darah') }}>AB</option>
                                          <option value= "O" {{ old('golongan_darah') }}>O</option>
                                    </select>
                              
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
                            <!--<input type="text" class="form-control  @error('status_imunisasi_tetanus_terakhir') is-invalid @enderror" id="nama_ibu"-->
                            <!--        placeholder="Status Imunisasi Tetanus..." name="status_imunisasi_tetanus_terakhir" value="{{ old('status_imunisasi_tetanus_terakhir') }}"  autofocus autocomplete="off">-->
                            <select class="form-select @error('status_imunisasi_tetanus_terakhir') is-invalid @enderror"  aria-label="Default select example" name="status_imunisasi_tetanus_terakhir" id="status_imunisasi_tetanus_terakhir">
                                          <option selected>--Pilih Status Imunisasi Tetanus (T) Terakhir--</option>
                                          <option value= "TT1" {{ old('status_imunisasi_tetanus_terakhir') }}>TT1</option>
                                          <option value= "TT2" {{ old('status_imunisasi_tetanus_terakhir') }}>TT2</option>
                                          <option value= "TT3" {{ old('status_imunisasi_tetanus_terakhir') }}>TT3</option>
                                          <option value= "TT4" {{ old('status_imunisasi_tetanus_terakhir') }}>TT4</option>
                                          <option value= "TT5" {{ old('status_imunisasi_tetanus_terakhir') }}>TT5</option>
                                         
                            </select>
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
                            <div class="row">
                              <div class="col-4 mt-3">
                               <label for="kehamilan_ke" class="col-12">Kehamilan Ke-</label>
                              </div>
                              <div class="col-8 mt-3">
                               <input type="text" class="form-control  @error('kehamilan_ke') is-invalid @enderror" id="kehamilan_ke"
                               placeholder="Masukan Kehamilan Ke-..." name="kehamilan_ke" value="{{ old('kehamilan_ke') }}"  autofocus autocomplete="off">
                               @error('kehamilan_ke')
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
                                        <label for="penggunaan_kontrasepsi_sebelum_hamil" class="col-12">Penggunaan Kontrasepsi Sebelum Hamil</label>
                                        <select class="form-select @error('penggunaan_kontrasepsi_sebelum_hamil') is-invalid @enderror"  aria-label="Default select example" name="penggunaan_kontrasepsi_sebelum_hamil" id="agama_ibu">
                                          <option selected>--Pilih Kontrasepsi Sebelum Hamil--</option>
                                          <option value= "Pil KB" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Pil KB</option>
                                          <option value= "Suntik KB 1 Bulan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Suntik KB 1 Bulan</option>
                                          <option value= "Suntik 3 Bulan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Suntik 3 Bulan</option>
                                          <option value= "Implan" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Implan</option>
                                          <option value= "Kondom" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Kondom</option>
                                          <option value= "AKDR (IUD)" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>AKDR (IUD)</option>
                                          <option value= "Tidak Ada" {{ old('penggunaan_kontrasepsi_sebelum_hamil') }}>Tidak Ada</option>
                                          </select>
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
                               <input type="text" class="form-control  @error('tinggi_badan') is-invalid @enderror" id="kehamilan_ke"
                               placeholder="Masukan Tinggi Badan..." name="tinggi_badan" value="{{ old('tinggi_badan') }}"  autofocus autocomplete="off">
                               @error('tinggi_badan')
                               <div class="invalid-feedback">
                                 {{ $message }}
                               </div>
                           @enderror
                              </div>
                             
                           </div>
                           </div>
                        </div>
                      </div>
                      <div class="row" style="margin-left: 800px; margin-top:50px; margin-bottom:50px;">
                        <div class="col-6">
                          <button type="button" id="tambahbaris" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color: #4DA8DA;">Tambah</button>
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
                                    <th class="col-1 text-capitalize">Aksi</th>
                                </tr>
                            </thead>
                            <tbody  style="background-color: white;">  
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
                      '<input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"'+
                      'placeholder="Tahun.." name="nik_ibuku[]" value="{{ $nikibuku2 }}"  autofocus autocomplete="off" hidden>'+                
                            ' <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('nama_pemeriksa') is-invalid @enderror" id="tahun"'+
                               ' placeholder="Nama Pemeriksa.." name="nama_pemeriksa[]" value="{{ old('nama_pemeriksa[]') }}"  autofocus autocomplete="off">'+
              
                                '@error('nama_pemeriksa')'+
                                '<div class="invalid-feedback">'+
                                  '{{ $message }}'+
                               ' </div>'+
                            '@enderror</th>'+
                         
                         '     <th class="col-1 text-capitalize"><input type="text" id="datapicker3" class="form-control  @error('tanggal') is-invalid @enderror" id="berat_lahir"'+
                         '       placeholder="Tanggal..." name="tanggal[]" value="{{ old('tanggal[]') }}"  autofocus autocomplete="off">'+
                         '       @error('tanggal')'+
                         '       <div class="invalid-feedback">'+
                         '         {{ $message }}'+
                         '       </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('keluhan') is-invalid @enderror" id="keluhan"'+
                          '      placeholder="Tempat Bersalin..." name="keluhan[]" value="{{ old('keluhan[]') }}"  autofocus autocomplete="off">'+
                          '      @error('keluhan')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                        '      <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('uk') is-invalid @enderror" id="uk"'+
                        '        placeholder="U.K..." name="uk[]" value="{{ old('uk[]') }}"  autofocus autocomplete="off">'+
                        '        @error('uk')'+
                        '        <div class="invalid-feedback">'+
                        '          {{ $message }}'+
                        '        </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('bb') is-invalid @enderror" id="bb"'+
                          '      placeholder="BB..." name="bb[]" value="{{ old('bb[]') }}"  autofocus autocomplete="off">'+
                          '      @error('bb')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('td') is-invalid @enderror" id="td"'+
                          '      placeholder="TD..." name="td[]" value="{{ old('td[]') }}"  autofocus autocomplete="off">'+
                          '      @error('td')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('lila') is-invalid @enderror" id="lila"'+
                          '      placeholder="LILA..." name="lila[]" value="{{ old('lila[]') }}"  autofocus autocomplete="off">'+
                          '      @error('lila')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('tinggi_fundus') is-invalid @enderror" id="tinggi_fundus"'+
                          '      placeholder="Tinggi Fundus..." name="tinggi_fundus[]" value="{{ old('tinggi_fundus[]') }}"  autofocus autocomplete="off">'+
                          '      @error('tinggi_fundus')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('letak_janin') is-invalid @enderror" id="letak_janin"'+
                          '      placeholder="Letak Janin..." name="letak_janin[]" value="{{ old('letak_janin[]') }}"  autofocus autocomplete="off">'+
                          '      @error('letak_janin')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('imunisasi') is-invalid @enderror" id="imunisasi"'+
                          '      placeholder="Imunisasi..." name="imunisasi[]" value="{{ old('imunisasi[]') }}"  autofocus autocomplete="off">'+
                          '      @error('imunisasi')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('tablet_tambah_darah') is-invalid @enderror" id="tablet_tambah_darah"'+
                          '      placeholder="Tablet Tambah Darah..." name="tablet_tambah_darah[]" value="{{ old('tablet_tambah_darah[]') }}"  autofocus autocomplete="off">'+
                          '      @error('tablet_tambah_darah')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('lab') is-invalid @enderror" id="lab"'+
                          '      placeholder="Lab..." name="lab[]" value="{{ old('lab[]') }}"  autofocus autocomplete="off">'+
                          '      @error('lab')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('analisa') is-invalid @enderror" id="analisa"'+
                          '      placeholder="Analisa..." name="analisa[]" value="{{ old('analisa[]') }}"  autofocus autocomplete="off">'+
                          '      @error('analisa')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('tata_laksana') is-invalid @enderror" id="tata_laksana"'+
                          '      placeholder="Tata Laksana..." name="tata_laksana[]" value="{{ old('tata_laksana[]') }}"  autofocus autocomplete="off">'+
                          '      @error('tata_laksana')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('konseling') is-invalid @enderror" id="konseling"'+
                          '      placeholder="Konseling..." name="konseling[]" value="{{ old('konseling[]') }}"  autofocus autocomplete="off">'+
                          '      @error('konseling')'+
                          '      <div class="invalid-feedback">'+
                          '        {{ $message }}'+
                          '      </div>'+
                          '  @enderror</th>'+
                          '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('catatan_tambahan') is-invalid @enderror" id="catatan_tambahan"'+
                          '      placeholder="Catatan Tambahan..." name="catatan_tambahan[]" value="{{ old('catatan_tambahan[]') }}"  autofocus autocomplete="off">'+
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
              
                </div>
                <div class="col-1" style="margin-left: 80px;">
                  <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFE700;">Eksport</button>
              
                </div>
                <div class="col-4" style="margin-left: 30px;">
                  <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px; background-color: #EE66A6;">Menyambut Persalinan</button>
                
                </div> --}}
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
        
           $('#datepicker3').datepicker({
            uiLibrary: 'bootstrap5',
            format: 'dd/mm/yyyy',
        });
        </script>

  
@endsection