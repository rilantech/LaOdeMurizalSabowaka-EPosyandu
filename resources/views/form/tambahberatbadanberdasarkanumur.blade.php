@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Tambah Data</h4>
            <h4 class="text-center">Berat Badan Berdasarkan Umur</h4>
           
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
                                <form action="{{ url('datakms') }}" method='post'>
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
                                        <select class="form-select @error('nik') is-invalid @enderror" aria-label="Default select example" name="nama_anak" id="nik" onchange="window.location.href='tambahdatakms?nik={{ $item1->nik }}&namaanak='+this.value">
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
                                    Bulan Penimbangan
                                </td>
                                  <th><input type="date" class="form-control @error('bulan_penimbangan_0') is-invalid @enderror" id="bulan_penimbangan_0"
                                    placeholder="..." name="bulan_penimbangan_0" value="{{ old('bulan_penimbangan_0') }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="date" class="form-control @error('bulan_penimbangan_1') is-invalid @enderror" id="bulan_penimbangan_1"
                                    placeholder="..." name="bulan_penimbangan_1" value="{{ old('bulan_penimbangan_1') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_2') is-invalid @enderror" id="bulan_penimbangan_2"
                                    placeholder="..." name="bulan_penimbangan_2" value="{{ old('bulan_penimbangan_2') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_3') is-invalid @enderror" id="bulan_penimbangan_3"
                                    placeholder="..." name="bulan_penimbangan_3" value="{{ old('bulan_penimbangan_3') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_4') is-invalid @enderror" id="bulan_penimbangan_4"
                                    placeholder="..." name="bulan_penimbangan_4" value="{{ old('bulan_penimbangan_4') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_5') is-invalid @enderror" id="bulan_penimbangan_5"
                                    placeholder="..." name="bulan_penimbangan_5" value="{{ old('bulan_penimbangan_5') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_6') is-invalid @enderror" id="bulan_penimbangan_6"
                                    placeholder="..." name="bulan_penimbangan_6" value="{{ old('bulan_penimbangan_6') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_7') is-invalid @enderror" id="bulan_penimbangan_7"
                                    placeholder="..." name="bulan_penimbangan_7" value="{{ old('bulan_penimbangan_7') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_8') is-invalid @enderror" id="bulan_penimbangan_8"
                                    placeholder="..." name="bulan_penimbangan_8" value="{{ old('bulan_penimbangan_8') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_9') is-invalid @enderror" id="bulan_penimbangan_9"
                                    placeholder="..." name="bulan_penimbangan_9" value="{{ old('bulan_penimbangan_9') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_10') is-invalid @enderror" id="bulan_penimbangan_10"
                                    placeholder="..." name="bulan_penimbangan_10" value="{{ old('bulan_penimbangan_10') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_11') is-invalid @enderror" id="bulan_penimbangan_11"
                                    placeholder="..." name="bulan_penimbangan_11" value="{{ old('bulan_penimbangan_11') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_12') is-invalid @enderror" id="bulan_penimbangan_12"
                                    placeholder="..." name="bulan_penimbangan_12" value="{{ old('bulan_penimbangan_12') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_13') is-invalid @enderror" id="bulan_penimbangan_13"
                                    placeholder="..." name="bulan_penimbangan_13" value="{{ old('bulan_penimbangan_13') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                 
                                </tr>
                                <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                      BB (Kg)
                                  </td>
                                  <th><input type="text" class="form-control @error('bb_0') is-invalid @enderror" id="bb_0"
                                    placeholder="..." name="bb_0" value="{{ old('bb_0') }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_1') is-invalid @enderror" id="bb_1"
                                    placeholder="..." name="bb_1" value="{{ old('bb_1') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_2') is-invalid @enderror" id="bb_2"
                                    placeholder="..." name="bb_2" value="{{ old('bb_2') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_3') is-invalid @enderror" id="bb_3"
                                    placeholder="..." name="bb_3" value="{{ old('bb_3') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_4') is-invalid @enderror" id="bb_4"
                                    placeholder="..." name="bb_4" value="{{ old('bb_4') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_5') is-invalid @enderror" id="bb_5"
                                    placeholder="..." name="bb_5" value="{{ old('bb_5') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_6') is-invalid @enderror" id="bb_6"
                                    placeholder="..." name="bb_6" value="{{ old('bb_6') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_7') is-invalid @enderror" id="bb_7"
                                    placeholder="..." name="bb_7" value="{{ old('bb_7') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_8') is-invalid @enderror" id="bb_8"
                                    placeholder="..." name="bb_8" value="{{ old('bb_8') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_9') is-invalid @enderror" id="bb_9"
                                    placeholder="..." name="bb_9" value="{{ old('bb_9') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_10') is-invalid @enderror" id="bb_10"
                                    placeholder="..." name="bb_10" value="{{ old('bb_10') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_11') is-invalid @enderror" id="bb_11"
                                    placeholder="..." name="bb_11" value="{{ old('bb_11') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_12') is-invalid @enderror" id="bb_12"
                                    placeholder="..." name="bb_12" value="{{ old('bb_12') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_13') is-invalid @enderror" id="bb_13"
                                    placeholder="..." name="bb_13" value="{{ old('bb_13') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_14') is-invalid @enderror" id="bb_14"
                                    placeholder="..." name="bb_14" value="{{ old('bb_14') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_15') is-invalid @enderror" id="bb_15"
                                    placeholder="..." name="bb_15" value="{{ old('bb_15') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_16') is-invalid @enderror" id="bb_16"
                                    placeholder="..." name="bb_16" value="{{ old('bb_16') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="text" class="form-control @error('bb_17') is-invalid @enderror" id="bb_17"
                                    placeholder="..." name="bb_17" value="{{ old('bb_17') }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_18') is-invalid @enderror" id="bb_18"
                                    placeholder="..." name="bb_18" value="{{ old('bb_18') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_19') is-invalid @enderror" id="bb_19"
                                    placeholder="..." name="bb_19" value="{{ old('bb_19') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_20') is-invalid @enderror" id="bb_20"
                                    placeholder="..." name="bb_20" value="{{ old('bb_20') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_21') is-invalid @enderror" id="bb_21"
                                    placeholder="..." name="bb_21" value="{{ old('bb_21') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_22') is-invalid @enderror" id="bb_22"
                                    placeholder="..." name="bb_22" value="{{ old('bb_22') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_23') is-invalid @enderror" id="bb_23"
                                    placeholder="..." name="bb_23" value="{{ old('bb_23') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_24') is-invalid @enderror" id="bb_24"
                                    placeholder="..." name="bb_24" value="{{ old('bb_24') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_25') is-invalid @enderror" id="bb_25"
                                    placeholder="..." name="bb_25" value="{{ old('bb_25') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_26') is-invalid @enderror" id="bb_26"
                                    placeholder="..." name="bb_26" value="{{ old('bb_26') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_27') is-invalid @enderror" id="bb_27"
                                    placeholder="..." name="bb_27" value="{{ old('bb_27') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_28') is-invalid @enderror" id="bb_28"
                                    placeholder="..." name="bb_28" value="{{ old('bb_28') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_29') is-invalid @enderror" id="bb_29"
                                    placeholder="..." name="bb_29" value="{{ old('bb_29') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_30') is-invalid @enderror" id="bb_30"
                                    placeholder="..." name="bb_30" value="{{ old('bb_30') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_31') is-invalid @enderror" id="bb_31"
                                    placeholder="..." name="bb_31" value="{{ old('bb_31') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_32') is-invalid @enderror" id="bb_32"
                                    placeholder="..." name="bb_32" value="{{ old('bb_32') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_33') is-invalid @enderror" id="bb_33"
                                    placeholder="..." name="bb_33" value="{{ old('bb_33') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="text" class="form-control @error('bb_34') is-invalid @enderror" id="bb_34"
                                    placeholder="..." name="bb_34" value="{{ old('bb_34') }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_35') is-invalid @enderror" id="bb_35"
                                    placeholder="..." name="bb_35" value="{{ old('bb_35') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_36') is-invalid @enderror" id="bb_36"
                                    placeholder="..." name="bb_36" value="{{ old('bb_36') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_37') is-invalid @enderror" id="bb_37"
                                    placeholder="..." name="bb_37" value="{{ old('bb_37') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_38') is-invalid @enderror" id="bb_38"
                                    placeholder="..." name="bb_38" value="{{ old('bb_38') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_39') is-invalid @enderror" id="bb_39"
                                    placeholder="..." name="bb_39" value="{{ old('bb_39') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_40') is-invalid @enderror" id="bb_40"
                                    placeholder="..." name="bb_40" value="{{ old('bb_40') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_41') is-invalid @enderror" id="bb_41"
                                    placeholder="..." name="bb_41" value="{{ old('bb_41') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_42') is-invalid @enderror" id="bb_42"
                                    placeholder="..." name="bb_42" value="{{ old('bb_42') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_43') is-invalid @enderror" id="bb_43"
                                    placeholder="..." name="bb_43" value="{{ old('bb_43') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_44') is-invalid @enderror" id="bb_44"
                                    placeholder="..." name="bb_44" value="{{ old('bb_44') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_45') is-invalid @enderror" id="bb_45"
                                    placeholder="..." name="bb_45" value="{{ old('bb_45') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_46') is-invalid @enderror" id="bb_46"
                                    placeholder="..." name="bb_46" value="{{ old('bb_46') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_47') is-invalid @enderror" id="bb_47"
                                    placeholder="..." name="bb_47" value="{{ old('bb_47') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_48') is-invalid @enderror" id="bb_48"
                                    placeholder="..." name="bb_48" value="{{ old('bb_48') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_49') is-invalid @enderror" id="bb_49"
                                    placeholder="..." name="bb_49" value="{{ old('bb_49') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_50') is-invalid @enderror" id="bb_50"
                                    placeholder="..." name="bb_50" value="{{ old('bb_50') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="text" class="form-control @error('bb_51') is-invalid @enderror" id="bb_51"
                                    placeholder="..." name="bb_51" value="{{ old('bb_51') }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_52') is-invalid @enderror" id="bb_52"
                                    placeholder="..." name="bb_52" value="{{ old('bb_52') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_53') is-invalid @enderror" id="bb_53"
                                    placeholder="..." name="bb_53" value="{{ old('bb_53') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_54') is-invalid @enderror" id="bb_54"
                                    placeholder="..." name="bb_54" value="{{ old('bb_54') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_55') is-invalid @enderror" id="bb_55"
                                    placeholder="..." name="bb_55" value="{{ old('bb_55') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_56') is-invalid @enderror" id="bb_56"
                                    placeholder="..." name="bb_56" value="{{ old('bb_56') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_57') is-invalid @enderror" id="bb_57"
                                    placeholder="..." name="bb_57" value="{{ old('bb_57') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_58') is-invalid @enderror" id="bb_58"
                                    placeholder="..." name="bb_58" value="{{ old('bb_58') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_59') is-invalid @enderror" id="bb_59"
                                    placeholder="..." name="bb_59" value="{{ old('bb_59') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_60') is-invalid @enderror" id="bb_60"
                                    placeholder="..." name="bb_60" value="{{ old('bb_60') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                 
                                </tr>
                               
                                  <tr>
                                    <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                        KBM (Gr)
                                    </td>
                                    <th>
                                     
                                   </th>
                                    <th class="col-1">800</th>
                                    <th class="col-1">
                                     900
                                    </th>
                                    <th class="col-1">
                                     800
                                    </th>
                                    <th class="col-1">
                                    600
                                    </th>
                                    <th class="col-1">
                                      500
                                    </th>
                                    <th class="col-1">
                                     400
                                    </th>
                                    <th class="col-1" colspan="4">
                                     300
                                    </th>
                                    <th class="col-1" colspan="50">
                                      200
                                    </th>
                                  
                                   
                                  </tr>
                                  
                                    <tr>
                                      <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                       N/T
                                      </td>
                                      <th><input type="text" class="form-control @error('nt_0') is-invalid @enderror" id="nt_0"
                                        placeholder="..." name="nt_0" value="{{ old('nt_0') }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_1') is-invalid @enderror" id="nt_1"
                                        placeholder="..." name="nt_1" value="{{ old('nt_1') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_2') is-invalid @enderror" id="nt_2"
                                        placeholder="..." name="nt_2" value="{{ old('nt_2') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_3') is-invalid @enderror" id="nt_3"
                                        placeholder="..." name="nt_3" value="{{ old('nt_3') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_4') is-invalid @enderror" id="nt_4"
                                        placeholder="..." name="nt_4" value="{{ old('nt_4') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_5') is-invalid @enderror" id="nt_5"
                                        placeholder="..." name="nt_5" value="{{ old('nt_5') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_6') is-invalid @enderror" id="nt_6"
                                        placeholder="..." name="nt_6" value="{{ old('nt_6') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_7') is-invalid @enderror" id="nt_7"
                                        placeholder="..." name="nt_7" value="{{ old('nt_7') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_8') is-invalid @enderror" id="nt_8"
                                        placeholder="..." name="nt_8" value="{{ old('nt_8') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_9') is-invalid @enderror" id="nt_9"
                                        placeholder="..." name="nt_9" value="{{ old('nt_9') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_10') is-invalid @enderror" id="nt_10"
                                        placeholder="..." name="nt_10" value="{{ old('nt_10') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_11') is-invalid @enderror" id="nt_11"
                                        placeholder="..." name="nt_11" value="{{ old('nt_11') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_12') is-invalid @enderror" id="nt_12"
                                        placeholder="..." name="nt_12" value="{{ old('nt_12') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_13') is-invalid @enderror" id="nt_13"
                                        placeholder="..." name="nt_13" value="{{ old('nt_13') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_14') is-invalid @enderror" id="nt_14"
                                        placeholder="..." name="nt_14" value="{{ old('nt_14') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_15') is-invalid @enderror" id="nt_15"
                                        placeholder="..." name="nt_15" value="{{ old('nt_15') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_16') is-invalid @enderror" id="nt_16"
                                        placeholder="..." name="nt_16" value="{{ old('nt_16') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th><input type="text" class="form-control @error('nt_17') is-invalid @enderror" id="nt_17"
                                        placeholder="..." name="nt_17" value="{{ old('nt_17') }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_18') is-invalid @enderror" id="nt_18"
                                        placeholder="..." name="nt_18" value="{{ old('nt_18') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_19') is-invalid @enderror" id="nt_19"
                                        placeholder="..." name="nt_19" value="{{ old('nt_19') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_20') is-invalid @enderror" id="nt_20"
                                        placeholder="..." name="nt_20" value="{{ old('nt_20') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_21') is-invalid @enderror" id="nt_21"
                                        placeholder="..." name="nt_21" value="{{ old('nt_21') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_22') is-invalid @enderror" id="nt_22"
                                        placeholder="..." name="nt_22" value="{{ old('nt_22') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_23') is-invalid @enderror" id="nt_23"
                                        placeholder="..." name="nt_23" value="{{ old('nt_23') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_24') is-invalid @enderror" id="nt_24"
                                        placeholder="..." name="nt_24" value="{{ old('nt_24') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_25') is-invalid @enderror" id="nt_25"
                                        placeholder="..." name="nt_25" value="{{ old('nt_25') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_26') is-invalid @enderror" id="nt_26"
                                        placeholder="..." name="nt_26" value="{{ old('nt_26') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_27') is-invalid @enderror" id="nt_27"
                                        placeholder="..." name="nt_27" value="{{ old('nt_27') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_28') is-invalid @enderror" id="nt_28"
                                        placeholder="..." name="nt_28" value="{{ old('nt_28') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_29') is-invalid @enderror" id="nt_29"
                                        placeholder="..." name="nt_29" value="{{ old('nt_29') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_30') is-invalid @enderror" id="nt_30"
                                        placeholder="..." name="nt_30" value="{{ old('nt_30') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_31') is-invalid @enderror" id="nt_31"
                                        placeholder="..." name="nt_31" value="{{ old('nt_31') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_32') is-invalid @enderror" id="nt_32"
                                        placeholder="..." name="nt_32" value="{{ old('nt_32') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_33') is-invalid @enderror" id="nt_33"
                                        placeholder="..." name="nt_33" value="{{ old('nt_33') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th><input type="text" class="form-control @error('nt_34') is-invalid @enderror" id="nt_34"
                                        placeholder="..." name="nt_34" value="{{ old('nt_34') }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_35') is-invalid @enderror" id="nt_35"
                                        placeholder="..." name="nt_35" value="{{ old('nt_35') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_36') is-invalid @enderror" id="nt_36"
                                        placeholder="..." name="nt_36" value="{{ old('nt_36') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_37') is-invalid @enderror" id="nt_37"
                                        placeholder="..." name="nt_37" value="{{ old('nt_37') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_38') is-invalid @enderror" id="nt_38"
                                        placeholder="..." name="nt_38" value="{{ old('nt_38') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_39') is-invalid @enderror" id="nt_39"
                                        placeholder="..." name="nt_39" value="{{ old('nt_39') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_40') is-invalid @enderror" id="nt_40"
                                        placeholder="..." name="nt_40" value="{{ old('nt_40') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_41') is-invalid @enderror" id="nt_41"
                                        placeholder="..." name="nt_41" value="{{ old('nt_41') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_42') is-invalid @enderror" id="nt_42"
                                        placeholder="..." name="nt_42" value="{{ old('nt_42') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_43') is-invalid @enderror" id="nt_43"
                                        placeholder="..." name="nt_43" value="{{ old('nt_43') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_44') is-invalid @enderror" id="nt_44"
                                        placeholder="..." name="nt_44" value="{{ old('nt_44') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_45') is-invalid @enderror" id="nt_45"
                                        placeholder="..." name="nt_45" value="{{ old('nt_45') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_46') is-invalid @enderror" id="nt_46"
                                        placeholder="..." name="nt_46" value="{{ old('nt_46') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_47') is-invalid @enderror" id="nt_47"
                                        placeholder="..." name="nt_47" value="{{ old('nt_47') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_48') is-invalid @enderror" id="nt_48"
                                        placeholder="..." name="nt_48" value="{{ old('nt_48') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_49') is-invalid @enderror" id="nt_49"
                                        placeholder="..." name="nt_49" value="{{ old('nt_49') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_50') is-invalid @enderror" id="nt_50"
                                        placeholder="..." name="nt_50" value="{{ old('nt_50') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th><input type="text" class="form-control @error('nt_51') is-invalid @enderror" id="nt_51"
                                        placeholder="..." name="nt_51" value="{{ old('nt_51') }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_52') is-invalid @enderror" id="nt_52"
                                        placeholder="..." name="nt_52" value="{{ old('nt_52') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_53') is-invalid @enderror" id="nt_53"
                                        placeholder="..." name="nt_53" value="{{ old('nt_53') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_54') is-invalid @enderror" id="nt_54"
                                        placeholder="..." name="nt_54" value="{{ old('nt_54') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_55') is-invalid @enderror" id="nt_55"
                                        placeholder="..." name="nt_55" value="{{ old('nt_55') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_56') is-invalid @enderror" id="nt_56"
                                        placeholder="..." name="nt_56" value="{{ old('nt_56') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_57') is-invalid @enderror" id="nt_57"
                                        placeholder="..." name="nt_57" value="{{ old('nt_57') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_58') is-invalid @enderror" id="nt_58"
                                        placeholder="..." name="nt_58" value="{{ old('nt_58') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_59') is-invalid @enderror" id="nt_59"
                                        placeholder="..." name="nt_59" value="{{ old('nt_59') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_60') is-invalid @enderror" id="nt_60"
                                        placeholder="..." name="nt_60" value="{{ old('nt_60') }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      </tr>
                                      <tr>
                                        <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         ASI Eksklusif
                                        </td>
                                        <th><input type="text" class="form-control @error('asi_eksklusif_0') is-invalid @enderror" id="asi_eksklusif_0"
                                          placeholder="..." name="asi_eksklusif_0" value="{{ old('asi_eksklusif_0') }}"  autofocus autocomplete="off" style="width: 100px;">
                                         
                                       </th>
                                        <th class="col-1"><input type="text" class="form-control @error('asi_eksklusif_1') is-invalid @enderror" id="asi_eksklusif_1"
                                          placeholder="..." name="asi_eksklusif_1" value="{{ old('asi_eksklusif_1') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_2') is-invalid @enderror" id="asi_eksklusif_2"
                                          placeholder="..." name="asi_eksklusif_2" value="{{ old('asi_eksklusif_2') }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_3') is-invalid @enderror" id="asi_eksklusif_3"
                                          placeholder="..." name="asi_eksklusif_3" value="{{ old('asi_eksklusif_3') }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_4') is-invalid @enderror" id="asi_eksklusif_4"
                                          placeholder="..." name="asi_eksklusif_4" value="{{ old('asi_eksklusif_4') }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_5') is-invalid @enderror" id="asi_eksklusif_5"
                                          placeholder="..." name="asi_eksklusif_5" value="{{ old('asi_eksklusif_5') }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_6') is-invalid @enderror" id="asi_eksklusif_6"
                                          placeholder="..." name="asi_eksklusif_6" value="{{ old('asi_eksklusif_6') }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
            
                                        <th class="col-1" colspan="54">
                                          
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