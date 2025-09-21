@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Tambah Kesehatan Bayi Baru Lahir</h4>
           
        </div>
        

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
                
                <div class="row">
                    <div class="col-md-12 mx-auto mt-2 p-5">
                      {{-- <input type="text" class="form-control  @error('id') is-invalid @enderror" id="nik_ibu"
                      placeholder="Masukan Nama Ibu..." name="id" value="{{ $id }}" autofocus autocomplete="off" hidden> --}}
                                <div class="row ">
                                  <div class="col-6 ">
                                    <div class="form-group">
                                      <label for="nama_ibu" class="col-12 fw-bold">NIK</label>
                                      <form method="get">
                                        <select class="form-select @error('nik_ibu') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">
                                          <option selected>--Pilih NIK Ibu--</option>
                                          @if($dataorangtua1 != null)
                                          @foreach ($dataorangtua1 as $item)
                                          <option value="{{ $item->nik }}">{{ $item->nik }} - {{ $item->nama_ibu }}</option>
                                          @endforeach
                                          @else
                                          <option selected>--Pilih NIK--</option>
                                          @endif
                                          @if($dataorangtua2 != null)
                                          @foreach ($dataorangtua2 as $item1)
                                          <option value="test" {{ old('nik') }} selected>{{ $item1->nik }}</option>
                                          @endforeach
                                          @endif
  
                                         
                                          </select>
                                     @error('nik_ibu')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                          
                                        </form>
                                  </div>
                                     </div>
                                    
                                </div>
                                <form action="{{ url('kesehatanbayibarulahir') }}" method='post'>
                                  @csrf
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        @if($dataorangtua2 != null)
                                        @foreach ($dataorangtua2 as $item1)
                                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $item1->nik }}" autofocus autocomplete="off" hidden>
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ old('nik_ibu') }}" autofocus autocomplete="off" hidden>
                                        @endif
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama Ibu</label>
                                        @if($dataorangtua2 != null)
                                        @foreach ($dataorangtua2 as $item1)
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $item1->nama_ibu }}" autofocus autocomplete="off">
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ old('nama_ibu') }}" autofocus autocomplete="off">
                                        @endif
                                       
                                        @error('nama_ibu')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                    
                                    </div>
                                   
                                  </div>
                                     <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                          <div class="col-2">
                                           <label for="kehamilan_ke" class="col-12 fw-bold">Nama Ayah</label>
                                          </div>
                                        @if($dataorangtua2 != null)
                                        @foreach ($dataorangtua2 as $item1)
                                        <input type="text" class="form-control  @error('nama_ayah') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ayah..." name="nama_ayah" value="{{ $item1->nama_ayah }}" autofocus autocomplete="off">
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('nama_ayah') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ayah..." name="nama_ayah" value="{{ old('nama_ayah') }}" autofocus autocomplete="off">
                                        @endif
                                       
                                        @error('nama_ayah')
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
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama Anak</label>
                                        @if($dataorangtua2 != null)
                                        @foreach ($dataorangtua2 as $item1)
                                        <select class="form-select @error('nik') is-invalid @enderror" aria-label="Default select example" name="nama_anak" id="nik" onchange="window.location.href='tambahkesehatanbayibarulahir?nik={{ $item1->nik }}&namaanak='+this.value">
                                          <option selected>--Pilih Nama Anak--</option>
                                          @if($dataanak != null)
                                          @foreach ($dataanak as $item)
                                          <option value="{{ $item->nama }}">{{ $item->nama}}</option>
                                          @endforeach
                                          @else
                                          <option selected>--Pilih Nama Anak--</option>
                                          @endif
                                          @if($dataanak1 != null)
                                          @foreach ($dataanak1 as $item1)
                                          <option value="{{ $item1->nama }}" selected>{{ $item1->nama }}</option>
                                          @endforeach
                                          @endif
                                          </select>
                                          @endforeach
                                          @endif
                                          @if($dataanak == null)
                                          <select class="form-select @error('nik') is-invalid @enderror" aria-label="Default select example" name="nama_anak">
                                            <option selected>--Pilih Nama Anak--</option>
                                          </select>
                                          @endif
                                        {{-- <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"
                                        placeholder="Masukan Nama Anak..." name="nama_anak" value="{{ old('nama_anak') }}" autofocus autocomplete="off">
                                        @error('nama_anak')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror --}}
                                    </div>
                                  </div>
                                </div>
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        <div class="row">
                                          <div class="col-2 mt-3">
                                           <label for="kehamilan_ke" class="col-12 fw-bold">Anak Ke-</label>
                                          </div>
                                          <div class="col-3 mt-3">
                                            @if($dataanak1!=null)
                                            @foreach ($dataanak1 as $item)
                                           <input type="text" class="form-control  @error('anak_ke') is-invalid @enderror" id="anak_ke"
                                           placeholder="" name="anak_ke" value="{{ $item->anak_ke }}"  autofocus autocomplete="off">
                                           @endforeach
                                           @else
                                           <input type="text" class="form-control  @error('anak_ke') is-invalid @enderror" id="anak_ke"
                                           placeholder="" name="anak_ke" value="{{ old('anak_ke') }}"  autofocus autocomplete="off">
                                           @endif
                                           @error('anak_ke')
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
                    
      
                  </div>
                
                  <div class="row p-5" style="margin-bottom: 50px; margin-top:-50px;">
                   
                    <div class="col-12">
                      
                      <div class="table-responsive bg-white">
                        <table class="table table-bordered table-hover text-center" id="tabelku">
                            <thead class="text-center" style="background-color: #4DA8DA;">
                                <tr>
                                    <th class="col-1 text-capitalize" rowspan="2">JENIS PEMERIKSAAN</th>
                                    <th class="col-1 text-capitalize " style="background-color: #9f97f0;">KUNJUNGAN 1 <br> (6 Jam - 48 Jam)</th>
                                    <th class="col-1 text-capitalize" style="background-color: #9f97f0;">KUNJUNGAN 2 <br> (Hari 3 - 7)</th>
                                    <th class="col-1 text-capitalize" style="background-color: #9f97f0;">KUNJUNGAN 3 <br> (Hari 8 - 28 Hari)</th>
                                </tr>
                                <tr style="background-color: #9f97f0;">
                                  <th class="col-1 " >
                                    <div class="row">
                                      <div class="col-12">
                                          <div class="row">
                                            <div class="col-2">
                                             <label for="kehamilan_ke" class="text-capitalize">Tgl:</label>
                                            </div>
                                            <div class="col-10">
                                             <input type="date" class="form-control  @error('tanggal_kunjungan_1') is-invalid @enderror" id="tanggal_kunjungan_1"
                                             placeholder="" name="tanggal_kunjungan_1" value="{{ old('tanggal_kunjungan_1') }}"  autofocus autocomplete="off">
                                             @error('tanggal_kunjungan_1')
                                             <div class="invalid-feedback">
                                               {{ $message }}
                                             </div>
                                         @enderror
                                            </div>
                                        
                                      </div>
                                      </div>
                                       
                                    </div>
                                  </th>
                                  <th class="col-1 "> <div class="row">
                                    <div class="col-12">
                                        <div class="row">
                                          <div class="col-2">
                                           <label for="kehamilan_ke" class="text-capitalize">Tgl:</label>
                                          </div>
                                          <div class="col-10">
                                           <input type="date" class="form-control  @error('tanggal_kunjungan_2') is-invalid @enderror" id="tanggal_kunjungan_2"
                                           placeholder="" name="tanggal_kunjungan_2" value="{{ old('tanggal_kunjungan_2') }}"  autofocus autocomplete="off">
                                           @error('tanggal_kunjungan_2')
                                           <div class="invalid-feedback">
                                             {{ $message }}
                                           </div>
                                       @enderror
                                          </div>
                                      
                                    </div>
                                    </div>
                                     
                                  </div>
                                </th>
                                  <th class="col-1 ">
                                    <div class="row">
                                      <div class="col-12">
                                          <div class="row">
                                            <div class="col-2">
                                             <label for="kehamilan_ke" class="text-capitalize">Tgl:</label>
                                            </div>
                                            <div class="col-10">
                                             <input type="date" class="form-control  @error('tanggal_kunjungan_3') is-invalid @enderror" id="tanggal_kunjungan_3"
                                             placeholder="" name="tanggal_kunjungan_3" value="{{ old('tanggal_kunjungan_3') }}"  autofocus autocomplete="off">
                                             @error('tanggal_kunjungan_3')
                                             <div class="invalid-feedback">
                                               {{ $message }}
                                             </div>
                                         @enderror
                                            </div>
                                        
                                      </div>
                                      </div>
                                       
                                    </div>
                                  </th>
                              </tr>
                            </thead>
                            <tbody>  
                              <tr>
                                <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                    Berat Badan (gram)
                                </td>
                                  <th class="col-1"><input type="text" class="form-control  @error('berat_badan_1') is-invalid @enderror" id="berat_badan_1"
                                    placeholder="..." name="berat_badan_1" value="{{ old('berat_badan_1') }}"  autofocus autocomplete="off">
                                   
                                    @error('berat_badan_1')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><input type="text" class="form-control  @error('berat_badan_2') is-invalid @enderror" id="$item->berat_badan_2"
                                    placeholder="..." name="berat_badan_2" value="{{ old('berat_badan_2') }}"  autofocus autocomplete="off">
                                     @error('berat_badan_2')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                    </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('berat_badan_3') is-invalid @enderror" id="berat_badan_3"
                                    placeholder="..." name="berat_badan_3" value="{{ old('berat_badan_3') }}"  autofocus autocomplete="off">
                                     @error('berat_badan_3')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                  </th>
                                </tr>
                                <tr>
                                  <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                      Panjang badan (cm)
                                  </td>
                                    <th class="col-1"><input type="text" class="form-control  @error('panjang_badan_1') is-invalid @enderror" id="panjang_badan_1"
                                      placeholder="..." name="panjang_badan_1" value="{{ old('panjang_badan_1') }}"  autofocus autocomplete="off">
                                     
                                      @error('panjang_badan_1')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror</th>
                                    <th class="col-1"><input type="text" class="form-control  @error('panjang_badan_2') is-invalid @enderror" id="panjang_badan_2"
                                      placeholder="..." name="panjang_badan_2" value="{{ old('panjang_badan_2') }}"  autofocus autocomplete="off">
                                       @error('panjang_badan_2')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror
                                      </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('panjang_badan_3') is-invalid @enderror" id="panjang_badan_3"
                                      placeholder="..." name="panjang_badan_3" value="{{ old('panjang_badan_3') }}"  autofocus autocomplete="off">
                                       @error('panjang_badan_3')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror
                                    </th>
                                  </tr>
                                  <tr>
                                    <td class="col-1 text-start" style="background-color:#C7D9DD;"> 
                                        Suhu (℃)
                                    </td>
                                      <th class="col-1"><input type="text" class="form-control  @error('suhu_1') is-invalid @enderror" id="suhu_1"
                                        placeholder="..." name="suhu_1" value="{{ old('suhu_1') }}"  autofocus autocomplete="off">
                                       
                                        @error('suhu_1')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('suhu_2') is-invalid @enderror" id="suhu_2"
                                        placeholder="..." name="suhu_2" value="{{ old('suhu_2') }}"  autofocus autocomplete="off">
                                          @error('suhu_2')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                        </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('suhu_3') is-invalid @enderror" id="suhu_3"
                                        placeholder=".." name="suhu_3" value="{{ old('suhu_3') }}"  autofocus autocomplete="off">
                                          @error('suhu_3')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                      </th>
                                    </tr>
                                    <tr>
                                      <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                          Dan Lain-lain
                                      </td>
                                        <th class="col-1"><input type="text" class="form-control  @error('dan_lain_lain_1') is-invalid @enderror" id="dan_lain_lain_1"
                                          placeholder="..." name="dan_lain_lain_1" value="{{ old('dan_lain_lain_1') }}"  autofocus autocomplete="off">
                                         
                                          @error('dan_lain_lain_1')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror</th>
                                        <th class="col-1"><input type="text" class="form-control  @error('dan_lain_lain_2') is-invalid @enderror" id="dan_lain_lain_2"
                                          placeholder="..." name="dan_lain_lain_2" value="{{ old('dan_lain_lain_2') }}"  autofocus autocomplete="off">
                                          @error('dan_lain_lain_2')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                                          </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('dan_lain_lain_3') is-invalid @enderror" id="dan_lain_lain_3"
                                          placeholder="..." name="dan_lain_lain_3" value="{{ old('dan_lain_lain_3') }}"  autofocus autocomplete="off">
                                          @error('dan_lain_lain_3')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                                        </th>
                                      </tr>
                          
                            </tbody>
                         
                        </table>
                    
                    </div>
                    <br>
                    <div class="card-body text-center" style="margin-top: 20px;">
                      <div class="row" style="">
                        <div class="col-1">
                          <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button>
                         
                       
                        </div>
                   
                        <div class="col-1" style="margin-left: 100px;">
                          <button type="button" onclick="window.location='{{ url('kesehatanbayibarulahir') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button>
                        </form>
                        </div>

                       
                      </div>
                       
                       
                    </div>
            
        </div>
       
        
    
@endsection