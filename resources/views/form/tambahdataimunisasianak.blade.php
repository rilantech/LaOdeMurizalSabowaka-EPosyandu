@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Tambah Data Imunisasi</h4>
           
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
                                <form action="{{ url('imunisasianak') }}" method='post'>
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
                                        <select class="form-select @error('nik') is-invalid @enderror" aria-label="Default select example" name="nama_anak" id="nik" onchange="window.location.href='tambahdataimunisasianak?nik={{ $item1->nik }}&namaanak='+this.value">
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
                                <tr >
                                    <th class="col-1 text-capitalize" colspan="3" >UMUR (BULAN)</th>
                                    <th class="col-1 text-capitalize " >0</th>
                                    <th class="col-1 text-capitalize" >1</th>
                                    <th class="col-1 text-capitalize" >2</th>
                                    <th class="col-1 text-capitalize" >3</th>
                                    <th class="col-1 text-capitalize" >4</th>
                                    <th class="col-1 text-capitalize" >5</th>
                                    <th class="col-1 text-capitalize" >6</th>
                                    <th class="col-1 text-capitalize" >7</th>
                                    <th class="col-1 text-capitalize" >8</th>
                                    <th class="col-1 text-capitalize" >9</th>
                                    <th class="col-1 text-capitalize" >10</th>
                                    <th class="col-1 text-capitalize" >11</th>
                                    <th class="col-1 text-capitalize" >12</th>
                                 
                                </tr>
                                <tr style="background-color: #9f97f0;">
                                  <th class="col-1" colspan="3">
                                    <label for="kehamilan_ke" class="text-capitalize fw-bold" style="width: 200px;">Vaksin</label>
                                  </th>
                                  <th class="col-1 " colspan="13">
                                    <div class="row">
                                      <div class="col-12">
                                          <div class="row">
                                            <div class="col-12" >
                                             <label for="kehamilan_ke" class="text-capitalize text-center fw-bold" style="margin-left: -900px;">Tanggal Pemberian Imunisasi</label>
                                            </div>
                                           
                                        
                                      </div>
                                      </div>
                                       
                                    </div>
                                  </th>
                                 
                                 
                              </tr>
                            </thead>
                            <tbody>  
                              <tr>
                                <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                    Hepatitis B (<24 Jam)
                                </td>
                                  <th class="col-1"><input type="date" class="form-control @error('hepatitis_0') is-invalid @enderror" id="hepatitis_0"
                                    placeholder="..." name="hepatitis_0" value="{{ old('hepatitis_0') }}"  autofocus autocomplete="off">
                                   
                                 </th>
                                  <th class="col-1"><input type="date" class="form-control @error('hepatitis_1') is-invalid @enderror" id="$item->hepatitis_1"
                                    placeholder="..." name="hepatitis_1" value="{{ old('hepatitis_1') }}"  autofocus autocomplete="off" ></th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_2') is-invalid @enderror" id="hepatitis_2"
                                    placeholder="..." name="hepatitis_2" value="{{ old('hepatitis_2') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_3') is-invalid @enderror" id="hepatitis_3"
                                    placeholder="..." name="hepatitis_3" value="{{ old('hepatitis_3') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_4') is-invalid @enderror" id="hepatitis_4"
                                    placeholder="..." name="hepatitis_4" value="{{ old('hepatitis_4') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_5') is-invalid @enderror" id="hepatitis_5"
                                    placeholder="..." name="hepatitis_5" value="{{ old('hepatitis_5') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_6') is-invalid @enderror" id="hepatitis_6"
                                    placeholder="..." name="hepatitis_6" value="{{ old('hepatitis_6') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_7') is-invalid @enderror" id="hepatitis_7"
                                    placeholder="..." name="hepatitis_7" value="{{ old('hepatitis_7') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_8') is-invalid @enderror" id="hepatitis_8"
                                    placeholder="..." name="hepatitis_8" value="{{ old('hepatitis_8') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_9') is-invalid @enderror" id="hepatitis_9"
                                    placeholder="..." name="hepatitis_9" value="{{ old('hepatitis_9') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_10') is-invalid @enderror" id="hepatitis_10"
                                    placeholder="..." name="hepatitis_10" value="{{ old('hepatitis_10') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_11') is-invalid @enderror" id="hepatitis_11"
                                    placeholder="..." name="hepatitis_11" value="{{ old('hepatitis_11') }}"  autofocus autocomplete="off"
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('hepatitis_12') is-invalid @enderror" id="hepatitis_12"
                                    placeholder="..." name="hepatitis_12" value="{{ old('hepatitis_12') }}"  autofocus autocomplete="off">
                                  </th>
                                </tr>
                                <tr>
                                  <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                      BCG
                                  </td>
                                  <th class="col-1"><input type="date" class="form-control @error('bcg_0') is-invalid @enderror" id="bcg_0"
                                    placeholder="..." name="bcg_0" value="{{ old('bcg_0') }}"  autofocus autocomplete="off">
                                   
                                 </th>
                                  <th class="col-1"><input type="date" class="form-control @error('bcg_1') is-invalid @enderror" id="$item->bcg_1"
                                    placeholder="..." name="bcg_1" value="{{ old('bcg_1') }}"  autofocus autocomplete="off"></th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_2') is-invalid @enderror" id="bcg_2"
                                    placeholder="..." name="bcg_2" value="{{ old('bcg_2') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_3') is-invalid @enderror" id="bcg_3"
                                    placeholder="..." name="bcg_3" value="{{ old('bcg_3') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_4') is-invalid @enderror" id="bcg_4"
                                    placeholder="..." name="bcg_4" value="{{ old('bcg_4') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_5') is-invalid @enderror" id="bcg_5"
                                    placeholder="..." name="bcg_5" value="{{ old('bcg_5') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_6') is-invalid @enderror" id="bcg_6"
                                    placeholder="..." name="bcg_6" value="{{ old('bcg_6') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_7') is-invalid @enderror" id="bcg_7"
                                    placeholder="..." name="bcg_7" value="{{ old('bcg_7') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_8') is-invalid @enderror" id="bcg_8"
                                    placeholder="..." name="bcg_8" value="{{ old('bcg_8') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_9') is-invalid @enderror" id="bcg_9"
                                    placeholder="..." name="bcg_9" value="{{ old('bcg_9') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_10') is-invalid @enderror" id="bcg_10"
                                    placeholder="..." name="bcg_10" value="{{ old('bcg_10') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_11') is-invalid @enderror" id="bcg_11"
                                    placeholder="..." name="bcg_11" value="{{ old('bcg_11') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bcg_12') is-invalid @enderror" id="bcg_12"
                                    placeholder="..." name="bcg_12" value="{{ old('bcg_12') }}"  autofocus autocomplete="off">
                                  </th>
                                </tr>
                               
                                  <tr>
                                    <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                        Polio tetes 1
                                    </td>
                                    <th class="col-1"><input type="date" class="form-control @error('polio_tetes_0') is-invalid @enderror" id="polio_tetes_0"
                                      placeholder="..." name="polio_tetes_0" value="{{ old('polio_tetes_0') }}"  autofocus autocomplete="off">
                                     
                                   </th>
                                    <th class="col-1"><input type="date" class="form-control @error('polio_tetes_1') is-invalid @enderror" id="$item->polio_tetes_1"
                                      placeholder="..." name="polio_tetes_1" value="{{ old('polio_tetes_1') }}"  autofocus autocomplete="off"></th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_2') is-invalid @enderror" id="polio_tetes_2"
                                      placeholder="..." name="polio_tetes_2" value="{{ old('polio_tetes_2') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_3') is-invalid @enderror" id="polio_tetes_3"
                                      placeholder="..." name="polio_tetes_3" value="{{ old('polio_tetes_3') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_4') is-invalid @enderror" id="polio_tetes_4"
                                      placeholder="..." name="polio_tetes_4" value="{{ old('polio_tetes_4') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_5') is-invalid @enderror" id="polio_tetes_5"
                                      placeholder="..." name="polio_tetes_5" value="{{ old('polio_tetes_5') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_6') is-invalid @enderror" id="polio_tetes_6"
                                      placeholder="..." name="polio_tetes_6" value="{{ old('polio_tetes_6') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_7') is-invalid @enderror" id="polio_tetes_7"
                                      placeholder="..." name="polio_tetes_7" value="{{ old('polio_tetes_7') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_8') is-invalid @enderror" id="polio_tetes_8"
                                      placeholder="..." name="polio_tetes_8" value="{{ old('polio_tetes_8') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_9') is-invalid @enderror" id="polio_tetes_9"
                                      placeholder="..." name="polio_tetes_9" value="{{ old('polio_tetes_9') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_10') is-invalid @enderror" id="polio_tetes_10"
                                      placeholder="..." name="polio_tetes_10" value="{{ old('polio_tetes_10') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_11') is-invalid @enderror" id="polio_tetes_11"
                                      placeholder="..." name="polio_tetes_11" value="{{ old('polio_tetes_11') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('polio_tetes_12') is-invalid @enderror" id="polio_tetes_12"
                                      placeholder="..." name="polio_tetes_12" value="{{ old('polio_tetes_12') }}"  autofocus autocomplete="off">
                                    </th>
                                  </tr>
                                  
                                    <tr>
                                      <td class="text-start" style="background-color: #9f97f0;" colspan="3" > 
                                          Dan Lain-lain
                                      </td>
                                      <th class="col-1"><input type="date" class="form-control @error('dan_lain_lain_0') is-invalid @enderror" id="dan_lain_lain_0"
                                        placeholder="..." name="dan_lain_lain_0" value="{{ old('dan_lain_lain_0') }}"  autofocus autocomplete="off">
                                       
                                     </th>
                                      <th class="col-1"><input type="date" class="form-control @error('dan_lain_lain_1') is-invalid @enderror" id="$item->dan_lain_lain_1"
                                        placeholder="..." name="dan_lain_lain_1" value="{{ old('dan_lain_lain_1') }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_2') is-invalid @enderror" id="dan_lain_lain_2"
                                        placeholder="..." name="dan_lain_lain_2" value="{{ old('dan_lain_lain_2') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_3') is-invalid @enderror" id="dan_lain_lain_3"
                                        placeholder="..." name="dan_lain_lain_3" value="{{ old('dan_lain_lain_3') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_4') is-invalid @enderror" id="dan_lain_lain_4"
                                        placeholder="..." name="dan_lain_lain_4" value="{{ old('dan_lain_lain_4') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_5') is-invalid @enderror" id="dan_lain_lain_5"
                                        placeholder="..." name="dan_lain_lain_5" value="{{ old('dan_lain_lain_5') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_6') is-invalid @enderror" id="dan_lain_lain_6"
                                        placeholder="..." name="dan_lain_lain_6" value="{{ old('dan_lain_lain_6') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_7') is-invalid @enderror" id="dan_lain_lain_7"
                                        placeholder="..." name="dan_lain_lain_7" value="{{ old('dan_lain_lain_7') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_8') is-invalid @enderror" id="dan_lain_lain_8"
                                        placeholder="..." name="dan_lain_lain_8" value="{{ old('dan_lain_lain_8') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_9') is-invalid @enderror" id="dan_lain_lain_9"
                                        placeholder="..." name="dan_lain_lain_9" value="{{ old('dan_lain_lain_9') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_10') is-invalid @enderror" id="dan_lain_lain_10"
                                        placeholder="..." name="dan_lain_lain_10" value="{{ old('dan_lain_lain_10') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_11') is-invalid @enderror" id="dan_lain_lain_11"
                                        placeholder="..." name="dan_lain_lain_11" value="{{ old('dan_lain_lain_11') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('dan_lain_lain_12') is-invalid @enderror" id="dan_lain_lain_12"
                                        placeholder="..." name="dan_lain_lain_12" value="{{ old('dan_lain_lain_12') }}"  autofocus autocomplete="off">
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
                          <button type="button" onclick="window.location='{{ url('imunisasianak') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button>
                        </form>
                        </div>

                       
                      </div>
                       
                       
                    </div>
            
        </div>
       
        
    
@endsection