@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Detail Data Pemberian Vitamin & Obat Cacing</h4>
           
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
                                <form action="{{ url('pemberianvitamindanobatcacing/'.$id) }}" method='post'>
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
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}" autofocus autocomplete="off">
                                      
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
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama Ayah</label>
                                        <input type="text" class="form-control  @error('nama_ayah') is-invalid @enderror" id="nama_ayah"
                                        placeholder="Masukan Nama Ayah..." name="nama_ayah" value="{{ $nama_ayah }}" autofocus autocomplete="off">
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
                                      
                                        <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"
                                        placeholder="Masukan Nama Anak..." name="nama_anak" value="{{ $nama_anak }}" autofocus autocomplete="off">
                                        @error('nama_anak')
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
                            <thead class="text-center" style="background-color: #65e138;">
                                <tr >
                                    <th class="col-1 text-capitalize" colspan="3" >UMUR</th>
                                    <th class="col-1 text-capitalize " colspan="4">Kapsul Vitamin A</th>
                                    <th class="col-1 text-capitalize" >Obat Cacing</th>
                                </tr>
                              </thead>
                            <tbody>  
                              <tr>
                                <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                </td>
                                  <th colspan="2" style="background-color: #9f97f0;">VIA A Kapsul Biru <br>(100 IU)</th>
                                  <th class="col-1" colspan="2" style="background-color: #9f97f0;">VIA A Kapsul Merah<br> (200 IU)</th>
                                  <th class="col-1" style="background-color: #9f97f0;">
                                   
                                  </th>
                                 
                                </tr>
                                <tr>
                                  <td class="text-start" colspan="3"> 
                                  </td>
                                  <th class="col-1" colspan="2">Februari Atau Agustus</th>
                                  <th class="col-1">Februari</th>
                                  <th class="col-1">Agustus</th>
                                  <th class="col-1">Februari Atau Agustus</th>
                                </tr>
                               
                                  <tr>
                                    <td class="text-start"  colspan="3"> 
                                        6 - 11 Bulan
                                    </td>
                                    <th class="col-1" colspan="2"><input type="date" class="form-control @error('kapsul_biru_1') is-invalid @enderror" id="kapsul_biru_1"
                                      placeholder="..." name="kapsul_biru_1" value="{{ $kapsul_biru_1  }}"  autofocus autocomplete="off">
                                   </th>
                                    <th class="col-1"><input type="date" class="form-control @error('kapsul_merah_1') is-invalid @enderror" id="$item->kapsul_merah_1"
                                      placeholder="..." name="kapsul_merah_1" value="{{ $kapsul_merah_1  }}"  autofocus autocomplete="off"></th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('kapsul_merah_2') is-invalid @enderror" id="kapsul_merah_2"
                                      placeholder="..." name="kapsul_merah_2" value="{{ $kapsul_merah_2  }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="date" class="form-control  @error('obat_cacing_1') is-invalid @enderror" id="obat_cacing_1"
                                      placeholder="..." name="obat_cacing_1" value="{{ $obat_cacing_1  }}"  autofocus autocomplete="off">
                                    </th>
                                  </tr>
                                   <tr>
                                      <td class="text-start"  colspan="3" > 
                                         1 - 2 Tahun
                                      </td>
                                      <th class="col-1" colspan="2"><input type="date" class="form-control @error('kapsul_biru_2') is-invalid @enderror" id="kapsul_biru_2"
                                        placeholder="..." name="kapsul_biru_2" value="{{ $kapsul_biru_2  }}"  autofocus autocomplete="off">
                                       
                                     </th>
                                      <th class="col-1"><input type="date" class="form-control @error('kapsul_merah_3') is-invalid @enderror" id="$item->kapsul_merah_3"
                                        placeholder="..." name="kapsul_merah_3" value="{{ $kapsul_merah_3  }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('kapsul_merah_4') is-invalid @enderror" id="kapsul_merah_4"
                                        placeholder="..." name="kapsul_merah_4" value="{{ $kapsul_merah_4  }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('obat_cacing_2') is-invalid @enderror" id="obat_cacing_2"
                                        placeholder="..." name="obat_cacing_2" value="{{ $obat_cacing_2  }}"  autofocus autocomplete="off">
                                      </th>
                                     </tr>
                                     <tr>
                                      <td class="text-start"  colspan="3" > 
                                         Lainnya
                                      </td>
                                      <th class="col-1" colspan="2"><input type="date" class="form-control @error('kapsul_biru_3') is-invalid @enderror" id="kapsul_biru_3"
                                        placeholder="..." name="kapsul_biru_3" value="{{ $kapsul_biru_3 }}"  autofocus autocomplete="off">
                                       
                                     </th>
                                      <th class="col-1"><input type="date" class="form-control @error('kapsul_merah_5') is-invalid @enderror" id="$item->kapsul_merah_5"
                                        placeholder="..." name="kapsul_merah_5" value="{{ $kapsul_merah_5  }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('kapsul_merah_6') is-invalid @enderror" id="kapsul_merah_6"
                                        placeholder="..." name="kapsul_merah_6" value="{{ $kapsul_merah_6  }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="date" class="form-control  @error('obat_cacing_3') is-invalid @enderror" id="obat_cacing_3"
                                        placeholder="..." name="obat_cacing_3" value="{{ $obat_cacing_3  }}"  autofocus autocomplete="off">
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
                          <button type="button" onclick="window.location='{{ url('pemberianvitamindanobatcacing') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button>
                        </form>
                        </div>

                        <div class="col-1" style="margin-left: 5px;">
                          <a href="{{ url('cetakvitamindanobatcacing/'.$id) }}" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:100px; background-color: #4DA8DA;" target="_blank">Export</a>
                        </div>

                       
                      </div>
                       
                       
                    </div>
            
        </div>
       
        
    
@endsection