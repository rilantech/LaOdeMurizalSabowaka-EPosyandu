@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Tambah Data</h4>
            <h4 class="text-center">Tinggi Badan Berdasarkan Umur</h4>
           
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
                                     <div class="col-6 ">
                                      <div class="form-group">
                                        <label for="nama_ibu" class="col-12 fw-bold">Jenis Kelamin</label>
                                        @if($dataanak1 != null)
                                        @foreach ($dataanak1 as $item1)
                                        <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"
                                        placeholder="Masukan Nama Ibu..." name="jenis_kelamin" value="{{ $item1->jenis_kelamin }}" autocomplete="off">
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"
                                        placeholder="" name="jenis_kelamin" value="{{ old('jenis_kelamin') }}" autocomplete="off">
                                        @endif
                                         @error('jenis_kelamin')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                    </div>
                                       </div>
                                    
                                </div>
                                <form action="{{ url('tinggibadan') }}" method='post'>
                                  @csrf
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        @if($dataanak1 != null)
                                        @foreach ($dataanak1 as $item1)
                                        <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"
                                        placeholder="Masukan Nama Ibu..." name="jenis_kelamin" value="{{ $item1->jenis_kelamin }}" autocomplete="off" hidden>
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"
                                        placeholder="Masukan Nama Ibu..." name="jenis_kelamin" value="{{ old('jenis_kelamin') }}" autocomplete="off" hidden>
                                        @endif
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
                                        <select class="form-select @error('nik') is-invalid @enderror" aria-label="Default select example" name="nama_anak" id="nik" onchange="window.location.href='tambahtinggibadan?nik={{ $item1->nik }}&namaanak='+this.value">
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
                      
                      <div class="table-responsive bg-white" >
                        <table class="table table-bordered table-hover text-center" id="tabelku" >
                            <thead class="text-center" style="background-color: #88C273;">
          
                                <tr style="background-color: #88C273;">
                                    <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Minggu)</th>
                                    <th class="col-1 text-capitalize">0</th>
                                    <th class="col-1 text-capitalize">1</th>
                                    <th class="col-1 text-capitalize">2</th>
                                    <th class="col-1 text-capitalize">3</th>
                                    <th class="col-1 text-capitalize">4</th>
                                    <th class="col-1 text-capitalize">5</th>
                                    <th class="col-1 text-capitalize">6</th>
                                    <th class="col-1 text-capitalize">7</th>
                                    <th class="col-1 text-capitalize">8</th>
                                    <th class="col-1 text-capitalize">9</th>
                                    <th class="col-1 text-capitalize">10</th>
                                    <th class="col-1 text-capitalize">11</th>
                                    <th class="col-1 text-capitalize">12</th>
                                    <th class="col-1 text-capitalize">13</th>
                                   
                                </tr>
                            </thead>
                            <tbody>  
                                <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                      Tinggi Badan (Cm)
                                  </td>
                                  <th><input type="text" class="form-control @error('bb_0') is-invalid @enderror" id="bb_0"
                                    placeholder="..." name="tinggi_badan_0" value="{{ old('tinggi_badan_0') }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('tinggi_badan_1') is-invalid @enderror" id="tinggi_badan_1"
                                    placeholder="..." name="tinggi_badan_1" value="{{ old('tinggi_badan_1') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_2') is-invalid @enderror" id="tinggi_badan_2"
                                    placeholder="..." name="tinggi_badan_2" value="{{ old('tinggi_badan_2') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_3') is-invalid @enderror" id="tinggi_badan_3"
                                    placeholder="..." name="tinggi_badan_3" value="{{ old('tinggi_badan_3') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_4') is-invalid @enderror" id="tinggi_badan_4"
                                    placeholder="..." name="tinggi_badan_4" value="{{ old('tinggi_badan_4') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_5') is-invalid @enderror" id="tinggi_badan_5"
                                    placeholder="..." name="tinggi_badan_5" value="{{ old('tinggi_badan_5') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_6') is-invalid @enderror" id="tinggi_badan_6"
                                    placeholder="..." name="tinggi_badan_6" value="{{ old('tinggi_badan_6') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_7') is-invalid @enderror" id="tinggi_badan_7"
                                    placeholder="..." name="tinggi_badan_7" value="{{ old('tinggi_badan_7') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_8') is-invalid @enderror" id="tinggi_badan_8"
                                    placeholder="..." name="tinggi_badan_8" value="{{ old('tinggi_badan_8') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_9') is-invalid @enderror" id="tinggi_badan_9"
                                    placeholder="..." name="tinggi_badan_9" value="{{ old('tinggi_badan_9') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_10') is-invalid @enderror" id="tinggi_badan_10"
                                    placeholder="..." name="tinggi_badan_10" value="{{ old('tinggi_badan_10') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_11') is-invalid @enderror" id="tinggi_badan_11"
                                    placeholder="..." name="tinggi_badan_11" value="{{ old('tinggi_badan_11') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_12') is-invalid @enderror" id="tinggi_badan_12"
                                    placeholder="..." name="tinggi_badan_12" value="{{ old('tinggi_badan_12') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tinggi_badan_13') is-invalid @enderror" id="tinggi_badan_13"
                                    placeholder="..." name="tinggi_badan_13" value="{{ old('tinggi_badan_13') }}"  autofocus autocomplete="off" style="width: 100px;">
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
                          <button type="button" onclick="window.location='{{ url('datakms') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button>
                        </form>
                        </div>

                       
                      </div>
                       
                       
                    </div>
            
        </div>
       
        
    
@endsection