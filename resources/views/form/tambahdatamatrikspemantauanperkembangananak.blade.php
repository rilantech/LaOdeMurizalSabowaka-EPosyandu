@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Tambah Data Matriks Pemantauan Perkembangan Anak</h4>
           
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
                                          <option selected>--Pilih NIK Ibu--</option>
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
                                <form action="{{ url('matriksperkembangananak') }}" method='post'>
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
                                        <select class="form-select @error('nik') is-invalid @enderror" aria-label="Default select example" name="nama_anak" id="nik" onchange="window.location.href='tambahmatriksperkembangananak?nik={{ $item1->nik }}&namaanak='+this.value">
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
                                    <th class="col-1 text-capitalize" colspan="3" ></th>
                                    <th class="col-1 text-capitalize text-start" colspan="17" >Usia Anak (Bulan)</th>                             
                                </tr>
                                <tr style="background-color: #9f97f0;">
                                    <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;"></th>
                                    <th class="col-1 text-capitalize">1</th>
                                    <th class="col-1 text-capitalize">3</th>
                                    <th class="col-1 text-capitalize">6</th>
                                    <th class="col-1 text-capitalize">9</th>
                                    <th class="col-1 text-capitalize">12</th>
                                    <th class="col-1 text-capitalize">15</th>
                                    <th class="col-1 text-capitalize">18</th>
                                    <th class="col-1 text-capitalize">21</th>
                                    <th class="col-1 text-capitalize">24</th>
                                    <th class="col-1 text-capitalize">30</th>
                                    <th class="col-1 text-capitalize">36</th>
                                    <th class="col-1 text-capitalize">42</th>
                                    <th class="col-1 text-capitalize">48</th>
                                    <th class="col-1 text-capitalize">54</th>
                                    <th class="col-1 text-capitalize">60</th>
                                    <th class="col-1 text-capitalize">66</th>
                                    <th class="col-1 text-capitalize">72</th>                                 
                                </tr>
                            </thead>
                            <tbody>  
                              <tr>
                                <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                    Tanggal Pemantauan Perkembangan
                                </td>
                                  <th><input type="text" class="form-control @error('tanggal_pemantauan_perkembangan_1') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_1"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_1" value="{{ old('tanggal_pemantauan_perkembangan_1') }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('tanggal_pemantauan_perkembangan_3') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_3"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_3" value="{{ old('tanggal_pemantauan_perkembangan_3') }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_6') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_6"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_6" value="{{ old('tanggal_pemantauan_perkembangan_6') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_9') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_9"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_9" value="{{ old('tanggal_pemantauan_perkembangan_9') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_12') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_12"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_12" value="{{ old('tanggal_pemantauan_perkembangan_12') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_15') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_15"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_15" value="{{ old('tanggal_pemantauan_perkembangan_15') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_18') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_18"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_18" value="{{ old('tanggal_pemantauan_perkembangan_18') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_21') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_21"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_21" value="{{ old('tanggal_pemantauan_perkembangan_21') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_24') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_24"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_24" value="{{ old('tanggal_pemantauan_perkembangan_24') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_30') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_30"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_30" value="{{ old('tanggal_pemantauan_perkembangan_30') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_36') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_36"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_36" value="{{ old('tanggal_pemantauan_perkembangan_36') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_42') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_42"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_42" value="{{ old('tanggal_pemantauan_perkembangan_42') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_48') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_48"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_48" value="{{ old('tanggal_pemantauan_perkembangan_48') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_54') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_54"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_54" value="{{ old('tanggal_pemantauan_perkembangan_54') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_60') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_60"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_60" value="{{ old('tanggal_pemantauan_perkembangan_60') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_66') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_66"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_66" value="{{ old('tanggal_pemantauan_perkembangan_66') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_72') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_72"
                                    placeholder="..." name="tanggal_pemantauan_perkembangan_72" value="{{ old('tanggal_pemantauan_perkembangan_72') }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                </tr>
                                <tr>
                                  <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                      Hasil
                                  </td>
                                  <th class="col-1"><input type="text" class="form-control @error('hasil_1') is-invalid @enderror" id="hasil_1"
                                    placeholder="..." name="hasil_1" value="{{ old('hasil_1') }}"  autofocus autocomplete="off">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('hasil_3') is-invalid @enderror" id="hasil_3"
                                    placeholder="..." name="hasil_3" value="{{ old('hasil_3') }}"  autofocus autocomplete="off"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_6') is-invalid @enderror" id="hasil_6"
                                    placeholder="..." name="hasil_6" value="{{ old('hasil_6') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_9') is-invalid @enderror" id="hasil_9"
                                    placeholder="..." name="hasil_9" value="{{ old('hasil_9') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_12') is-invalid @enderror" id="hasil_12"
                                    placeholder="..." name="hasil_12" value="{{ old('hasil_12') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_15') is-invalid @enderror" id="hasil_15"
                                    placeholder="..." name="hasil_15" value="{{ old('hasil_15') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_18') is-invalid @enderror" id="hasil_18"
                                    placeholder="..." name="hasil_18" value="{{ old('hasil_18') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_21') is-invalid @enderror" id="hasil_21"
                                    placeholder="..." name="hasil_21" value="{{ old('hasil_21') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_24') is-invalid @enderror" id="hasil_24"
                                    placeholder="..." name="hasil_24" value="{{ old('hasil_24') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_30') is-invalid @enderror" id="hasil_30"
                                    placeholder="..." name="hasil_30" value="{{ old('hasil_30') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_36') is-invalid @enderror" id="hasil_36"
                                    placeholder="..." name="hasil_36" value="{{ old('hasil_36') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_42') is-invalid @enderror" id="hasil_42"
                                    placeholder="..." name="hasil_42" value="{{ old('hasil_42') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_48') is-invalid @enderror" id="hasil_48"
                                    placeholder="..." name="hasil_48" value="{{ old('hasil_48') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_54') is-invalid @enderror" id="hasil_54"
                                    placeholder="..." name="hasil_54" value="{{ old('hasil_54') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_60') is-invalid @enderror" id="hasil_60"
                                    placeholder="..." name="hasil_60" value="{{ old('hasil_60') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_66') is-invalid @enderror" id="hasil_66"
                                    placeholder="..." name="hasil_66" value="{{ old('hasil_66') }}"  autofocus autocomplete="off">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('hasil_72') is-invalid @enderror" id="hasil_72"
                                    placeholder="..." name="hasil_72" value="{{ old('hasil_72') }}"  autofocus autocomplete="off">
                                  </th>
                                </tr>
                               
                                  <tr>
                                    <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                        Tindakan
                                    </td>
                                    <th class="col-1"><input type="text" class="form-control @error('tindakan_1') is-invalid @enderror" id="tindakan_1"
                                      placeholder="..." name="tindakan_1" value="{{ old('tindakan_1') }}"  autofocus autocomplete="off">
                                     
                                   </th>
                                    <th class="col-1"><input type="text" class="form-control @error('tindakan_3') is-invalid @enderror" id="tindakan_3"
                                      placeholder="..." name="tindakan_3" value="{{ old('tindakan_3') }}"  autofocus autocomplete="off"></th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_6') is-invalid @enderror" id="tindakan_6"
                                      placeholder="..." name="tindakan_6" value="{{ old('tindakan_6') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_9') is-invalid @enderror" id="tindakan_9"
                                      placeholder="..." name="tindakan_9" value="{{ old('tindakan_9') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_12') is-invalid @enderror" id="tindakan_12"
                                      placeholder="..." name="tindakan_12" value="{{ old('tindakan_12') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_15') is-invalid @enderror" id="tindakan_15"
                                      placeholder="..." name="tindakan_15" value="{{ old('tindakan_15') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_18') is-invalid @enderror" id="tindakan_18"
                                      placeholder="..." name="tindakan_18" value="{{ old('tindakan_18') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_21') is-invalid @enderror" id="tindakan_21"
                                      placeholder="..." name="tindakan_21" value="{{ old('tindakan_21') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_24') is-invalid @enderror" id="tindakan_24"
                                      placeholder="..." name="tindakan_24" value="{{ old('tindakan_24') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_30') is-invalid @enderror" id="tindakan_30"
                                      placeholder="..." name="tindakan_30" value="{{ old('tindakan_30') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_36') is-invalid @enderror" id="tindakan_36"
                                      placeholder="..." name="tindakan_36" value="{{ old('tindakan_36') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_42') is-invalid @enderror" id="tindakan_42"
                                      placeholder="..." name="tindakan_42" value="{{ old('tindakan_42') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_48') is-invalid @enderror" id="tindakan_48"
                                      placeholder="..." name="tindakan_48" value="{{ old('tindakan_48') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_54') is-invalid @enderror" id="tindakan_54"
                                      placeholder="..." name="tindakan_54" value="{{ old('tindakan_54') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_60') is-invalid @enderror" id="tindakan_60"
                                      placeholder="..." name="tindakan_60" value="{{ old('tindakan_60') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_66') is-invalid @enderror" id="tindakan_66"
                                      placeholder="..." name="tindakan_66" value="{{ old('tindakan_66') }}"  autofocus autocomplete="off">
                                    </th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tindakan_72') is-invalid @enderror" id="tindakan_72"
                                      placeholder="..." name="tindakan_72" value="{{ old('tindakan_72') }}"  autofocus autocomplete="off">
                                    </th>
                                   
                                  </tr>
                                  
                                    <tr>
                                      <td class="text-start" style="background-color: #9f97f0;" colspan="3" > 
                                        Tanggal Pemantauan Selanjutnya
                                      </td>
                                      <th class="col-1"><input type="text" class="form-control @error('tanggal_pemantauan_selanjutnya_1') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_1"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_1" value="{{ old('tanggal_pemantauan_selanjutnya_1') }}"  autofocus autocomplete="off">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('tanggal_pemantauan_selanjutnya_3') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_3"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_3" value="{{ old('tanggal_pemantauan_selanjutnya_3') }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_6') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_6"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_6" value="{{ old('tanggal_pemantauan_selanjutnya_6') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_9') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_9"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_9" value="{{ old('tanggal_pemantauan_selanjutnya_9') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_12') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_12"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_12" value="{{ old('tanggal_pemantauan_selanjutnya_12') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_15') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_15"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_15" value="{{ old('tanggal_pemantauan_selanjutnya_15') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_18') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_18"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_18" value="{{ old('tanggal_pemantauan_selanjutnya_18') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_21') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_21"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_21" value="{{ old('tanggal_pemantauan_selanjutnya_21') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_24') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_24"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_24" value="{{ old('tanggal_pemantauan_selanjutnya_24') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_30') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_30"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_30" value="{{ old('tanggal_pemantauan_selanjutnya_30') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_36') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_36"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_36" value="{{ old('tanggal_pemantauan_selanjutnya_36') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_42') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_42"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_42" value="{{ old('tanggal_pemantauan_selanjutnya_42') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_48') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_48"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_48" value="{{ old('tanggal_pemantauan_selanjutnya_48') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_54') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_54"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_54" value="{{ old('tanggal_pemantauan_selanjutnya_54') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_60') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_60"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_60" value="{{ old('tanggal_pemantauan_selanjutnya_60') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_66') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_66"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_66" value="{{ old('tanggal_pemantauan_selanjutnya_66') }}"  autofocus autocomplete="off">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_72') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_72"
                                        placeholder="..." name="tanggal_pemantauan_selanjutnya_72" value="{{ old('tanggal_pemantauan_selanjutnya_72') }}"  autofocus autocomplete="off">
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
                          <button type="button" onclick="window.location='{{ url('matriksperkembangananak') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button>
                        </form>
                        </div>

                       
                      </div>
                       
                       
                    </div>
            
        </div>
       
        
    
@endsection