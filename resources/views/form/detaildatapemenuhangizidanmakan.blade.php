@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Detail Data Pemenuhan Gizi & Makan</h4>
           
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
                                        <select class="form-select @error('nik') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">
                                          <option selected>{{ $nik_ibu }}</option>
                                          @if($dataorangtua1 != null)
                                          @foreach ($dataorangtua1 as $item)
                                          <option value="{{ $item->nik }}">{{ $item->nik }}</option>
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
                                          
                                        </form>
                                  </div>
                                     </div>
                                    
                                </div>
                                <form action="{{ url('pemenuhangizidanmakan/'.$id) }}" method='post'>
                                  @csrf
                                  @method('PUT')
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
                                        placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $nik_ibu }}" autofocus autocomplete="off" hidden>
                                        @endif
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama Ibu</label>
                                        @if($dataorangtua2 != null)
                                        @foreach ($dataorangtua2 as $item1)
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $item1->nama_ibu }}" autofocus autocomplete="off">
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}" autofocus autocomplete="off">
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
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama Anak</label>
                                        <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"
                                        placeholder="Masukan Nama Anak..." name="nama_anak" value="{{ $nama_anak }}" autofocus autocomplete="off">
                                       
                                        @error('nama_anak')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div> --}}
                                    @enderror
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
                                            <input type="text" class="form-control  @error('anak_ke') is-invalid @enderror" id="anak_ke"
                                            placeholder="" name="anak_ke" value="{{ $anak_ke }}"  autofocus autocomplete="off">
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
                                    <th class="col-1 text-capitalize" colspan="3" rowspan="2">UMUR</th>
                                    <th class="col-1 text-capitalize " colspan="6">Nasehat Pemenuhan Gizi & Pemberian Makan</th>
                                </tr>
                              </thead>
                            <tbody>  
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                </td>
                                  <th style="background-color: #9f97f0;">Tgl / Bulan / Tahun</th>
                                  <th class="col-1" style="background-color: #9f97f0;">Tgl / Bulan / Tahun</th>
                                  <th class="col-1" style="background-color: #9f97f0;">Tgl / Bulan / Tahun</th>
                                  <th class="col-1" style="background-color: #9f97f0;">Tgl / Bulan / Tahun</th>
                                 
                                </tr>
                                 <tr>
                                    <td class="text-start" colspan="3"> 
                                        0 - 6 Bulan
                                    </td>
                                    <th class="col-1"><input type="text" class="form-control @error('nol_sampai_enam_bulan_1') is-invalid @enderror" id="nol_sampai_enam_bulan_1"
                                      placeholder="..." name="nol_sampai_enam_bulan_1" value="{{ $nol_sampai_enam_bulan_1 }}"  autofocus autocomplete="off">
                                   </th>
                                    <th class="col-1"><input type="text" class="form-control @error('nol_sampai_enam_bulan_2') is-invalid @enderror" id="$item->nol_sampai_enam_bulan_2"
                                      placeholder="..." name="nol_sampai_enam_bulan_2" value="{{ $nol_sampai_enam_bulan_2 }}"  autofocus autocomplete="off"></th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('nol_sampai_enam_bulan_3') is-invalid @enderror" id="nol_sampai_enam_bulan_3"
                                      placeholder="..." name="nol_sampai_enam_bulan_3" value="{{ $nol_sampai_enam_bulan_3 }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('nol_sampai_enam_bulan_4') is-invalid @enderror" id="nol_sampai_enam_bulan_4"
                                      placeholder="..." name="nol_sampai_enam_bulan_4" value="{{ $nol_sampai_enam_bulan_4 }}"  autofocus autocomplete="off">
                                    </th>
                                  </tr>
                                   <tr>
                                      <td class="text-start" colspan="3" > 
                                         6 - 11 Bulan
                                      </td>
                                      <th class="col-1"><input type="text" class="form-control @error('enam_sampai_sebelas_bulan_1') is-invalid @enderror" id="enam_sampai_sebelas_bulan_1"
                                        placeholder="..." name="enam_sampai_sebelas_bulan_1" value="{{ $enam_sampai_sebelas_bulan_1 }}"  autofocus autocomplete="off">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('enam_sampai_sebelas_bulan_2') is-invalid @enderror" id="$item->enam_sampai_sebelas_bulan_2"
                                        placeholder="..." name="enam_sampai_sebelas_bulan_2" value="{{ $enam_sampai_sebelas_bulan_2 }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('enam_sampai_sebelas_bulan_3') is-invalid @enderror" id="enam_sampai_sebelas_bulan_3"
                                        placeholder="..." name="enam_sampai_sebelas_bulan_3" value="{{ $enam_sampai_sebelas_bulan_3 }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('enam_sampai_sebelas_bulan_4') is-invalid @enderror" id="enam_sampai_sebelas_bulan_4"
                                        placeholder="..." name="enam_sampai_sebelas_bulan_4" value="{{ $enam_sampai_sebelas_bulan_4 }}"  autofocus autocomplete="off">
                                      </th>
                                     </tr>
                                     <tr>
                                      <td class="text-start" colspan="3" > 
                                         Lainnya
                                      </td>
                                      <th class="col-1"><input type="text" class="form-control @error('lainnya_1') is-invalid @enderror" id="lainnya_1"
                                        placeholder="..." name="lainnya_1" value="{{ $lainnya_1 }}"  autofocus autocomplete="off">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('lainnya_2') is-invalid @enderror" id="$item->lainnya_2"
                                        placeholder="..." name="lainnya_2" value="{{ $lainnya_2 }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('lainnya_3') is-invalid @enderror" id="lainnya_3"
                                        placeholder="..." name="lainnya_3" value="{{ $lainnya_3 }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('lainnya_4') is-invalid @enderror" id="lainnya_4"
                                        placeholder="..." name="lainnya_4" value="{{ $lainnya_4 }}"  autofocus autocomplete="off">
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
                          <button type="button" onclick="window.location='{{ url('pemenuhangizidanmakan') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button>
                        </form>
                        </div>

                       
                      </div>
                       
                       
                    </div>
            
        </div>
       
        
    
@endsection