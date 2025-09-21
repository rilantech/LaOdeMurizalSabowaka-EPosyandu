@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Detail Kesehatan Ibu Nifas</h4>
           
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
                
                                      <div class="row" style="margin-left: 800px; margin-top:20px;">
                                        <div class="col-12">
                                          <a class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color: #4DA8DA;" onclick="window.location='{{ url('tambahkesehatanibunifas/'.'?nik='.$nik.'&'.'nama_ibu='.$nama_ibu.'&'.'id='.$id) }}'" >Tambah Data</a>
                                        </div>
                                      
                                      </div>
                  
                @php
                $nomor = 1 + (($data2->currentPage()-1)* $data2->perPage());
            @endphp
                @foreach($data2 as $item)
                <form action="{{ url('kesehatanibunifas/'.$id) }}" method='post'>
                  @csrf
                  @method('PUT')
                <div class="row">
                    <div class="col-md-12 mx-auto mt-2 p-5">
                       
                                <div class="row ">
                                  <div class="col-6 ">
                                    <div class="form-group">
                                      <label for="nama_ibu" class="col-12 fw-bold">NIK</label>
                                      <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"
                                      placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $nik }}" autofocus autocomplete="off">
                                      @error('nik_ibu')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror
                                  </div>
                                     </div>
                                     <!--<div class="col-6">-->
                                     <!-- <div class="row" style="margin-left: 270px; margin-top:20px;">-->
                                     <!--   <div class="col-6">-->
                                     <!--     <a class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color: #EE66A6;" onclick="window.location='{{ url('tambahkesehatanibunifas/'.'?nik='.$nik.'&'.'nama_ibu='.$nama_ibu.'&'.'id='.$id) }}'" >Tambah Data</a>-->
                                     <!--   </div>-->
                                      
                                     <!-- </div>-->
                                     <!--</div>-->
                                 
                                </div>
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama</label>
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Anak..." name="nama_ibu" value="{{ $nama_ibu }}" autofocus autocomplete="off">
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
                                        placeholder="Masukan Nama Anak..." name="nama_anak" value="{{ $item->nama_anak }}" autofocus autocomplete="off">
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
                                           <label for="kehamilan_ke" class="col-12 fw-bold">Nifas Ke-</label>
                                          </div>
                                          <div class="col-3 mt-3">
                                           <input type="text" class="form-control  @error('nifas_ke') is-invalid @enderror" id="nifas_ke"
                                           placeholder="" name="nifas_ke" value="{{ $item->nifas_ke }}"  autofocus autocomplete="off">
                                           @error('nifas_ke')
                                           <div class="invalid-feedback">
                                             {{ $message }}
                                           </div>
                                       @enderror
                                          </div>
                                         
                                       </div>
                                     
                                    </div>
                                    </div>
                                     
                                  </div>
                                  <!--<div class="row">-->
                                  <!--      <div class="col-6">-->
                                  <!--    <div class="form-group">-->
                                  <!--      <label for="pendidikan_ibu" class="col-12 fw-bold">Status Nifas</label>-->
                                  <!--      <select class="form-select @error('status_nifas') is-invalid @enderror"  aria-label="Default select example" name="status_nifas" id="pendidikan_ibu">-->
                                  <!--        <option selected value="{{ $item->status_nifas }}">{{ $item->status_nifas }}</option>-->
                                  <!--        <option value= "Sedang Berlangsung" {{ old('status_nifas') }}>Sedang Berlangsung</option>-->
                                  <!--        <option value= "Berakhir" {{ old('status_nifas') }}>Berakhir</option>-->
                                  <!--      </select>-->
                                  <!--        @error('status_nifas')-->
                                  <!--        <div class="invalid-feedback">-->
                                  <!--          {{ $message }}-->
                                  <!--        </div>-->
                                  <!--    @enderror-->
                                  <!--     </div>-->
                                  <!--  </div>-->
                                  <!--</div>-->
                                                                
                             
                        </div>
                    </div>
                    
      
                  </div>
                 
                  <div class="row p-5" style="margin-bottom: 50px; margin-top:-50px; ">
                   
                    <div class="col-12">
                      
                      <div class="table-responsive bg-white" >
                        <table class="table table-bordered table-hover text-center" id="tabelku">
                                <tr>
                                    <th class="col-1 text-capitalize" rowspan="2" style="background-color: #4DA8DA;">JENIS PELAYANAN <br> DAN <br>PEMANTAUAN</th>
                                    <th class="col-1 text-capitalize " style="background-color: #9f97f0;">KUNJUNGAN 1 <br> (6 Jam - 3 Hari)</th>
                                    <th class="col-1 text-capitalize" style="background-color: #9f97f0;">KUNJUNGAN 2 <br> (4 - 28 Hari)</th>
                                    <th class="col-1 text-capitalize" style="background-color: #9f97f0;">KUNJUNGAN 3 <br> (29 - 42 Hari)</th>
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
                                             placeholder="" name="tanggal_kunjungan_1" value="{{ $item->tanggal_kunjungan_1 }}"  autofocus autocomplete="off">
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
                                           placeholder="" name="tanggal_kunjungan_2" value="{{ $item->tanggal_kunjungan_2 }}"  autofocus autocomplete="off">
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
                                             placeholder="" name="tanggal_kunjungan_3" value="{{ $item->tanggal_kunjungan_3 }}"  autofocus autocomplete="off">
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
                                    Kondisi ibu secara umum
                                </td>
                                  <th class="col-1"><input type="text" class="form-control  @error('kondisi_ibu_secara_umum_1') is-invalid @enderror" id="kondisi_ibu_secara_umum_1"
                                    placeholder="..." name="kondisi_ibu_secara_umum_1" value="{{ $item->kondisi_ibu_secara_umum_1 }}"  autofocus autocomplete="off">
                                   
                                    @error('kondisi_ibu_secara_umum')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><input type="text" class="form-control  @error('$item->kondisi_ibu_secara_umum_2') is-invalid @enderror" id="$item->kondisi_ibu_secara_umum_2"
                                    placeholder="..." name="kondisi_ibu_secara_umum_2" value="{{ $item->kondisi_ibu_secara_umum_2 }}"  autofocus autocomplete="off"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('kondisi_ibu_secara_umum_3') is-invalid @enderror" id="kondisi_ibu_secara_umum_3"
                                    placeholder="..." name="kondisi_ibu_secara_umum_3" value="{{ $item->kondisi_ibu_secara_umum_3 }}"  autofocus autocomplete="off">
                                  </th>
                                </tr>
                                <tr>
                                  <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                      Tekanan darah, suhu tubuh, respirasi, nadi
                                  </td>
                                    <th class="col-1"><input type="text" class="form-control  @error('tekanan_darah_1') is-invalid @enderror" id="tekanan_darah_1"
                                      placeholder="..." name="tekanan_darah_1" value="{{ $item->tekanan_darah_1 }}"  autofocus autocomplete="off">
                                     
                                      @error('tekanan_darah_1')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror</th>
                                    <th class="col-1"><input type="text" class="form-control  @error('tekanan_darah_2') is-invalid @enderror" id="tekanan_darah_2"
                                      placeholder="..." name="tekanan_darah_2" value="{{ $item->tekanan_darah_2 }}"  autofocus autocomplete="off"></th>
                                    <th class="col-1">
                                      <input type="text" class="form-control  @error('tekanan_darah_3') is-invalid @enderror" id="tekanan_darah_3"
                                      placeholder="..." name="tekanan_darah_3" value="{{ $item->tekanan_darah_3 }}"  autofocus autocomplete="off">
                                    </th>
                                  </tr>
                                  <tr>
                                    <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                        Pendarahan pervaginam
                                    </td>
                                      <th class="col-1"><input type="text" class="form-control  @error('pendarahan_pervaginam_1') is-invalid @enderror" id="pendarahan_pervaginam_1"
                                        placeholder="..." name="pendarahan_pervaginam_1" value="{{ $item->pendarahan_pervaginam_1 }}"  autofocus autocomplete="off">
                                       
                                        @error('pendarahan_pervaginam_1')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('pendarahan_pervaginam_2') is-invalid @enderror" id="pendarahan_pervaginam_2"
                                        placeholder="..." name="pendarahan_pervaginam_2" value="{{ $item->pendarahan_pervaginam_2 }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('pendarahan_pervaginam_3') is-invalid @enderror" id="pendarahan_pervaginam_3"
                                        placeholder="..." name="pendarahan_pervaginam_3" value="{{ $item->pendarahan_pervaginam_3 }}"  autofocus autocomplete="off">
                                      </th>
                                    </tr>
                                  <tr>
                                    <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                        Kondisi perineum
                                    </td>
                                      <th class="col-1"><input type="text" class="form-control  @error('kondisi_perineum_1') is-invalid @enderror" id="kondisi_perineum_1"
                                        placeholder="..." name="kondisi_perineum_1" value="{{ $item->kondisi_perineum_1 }}"  autofocus autocomplete="off">
                                       
                                        @error('kondisi_perineum_1')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror</th>
                                      <th class="col-1"><input type="text" class="form-control  @error('kondisi_perineum_2') is-invalid @enderror" id="kondisi_perineum_2"
                                        placeholder="..." name="kondisi_perineum_2" value="{{ $item->kondisi_perineum_2 }}"  autofocus autocomplete="off"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('kondisi_perineum_3') is-invalid @enderror" id="kondisi_perineum_3"
                                        placeholder="..." name="kondisi_perineum_3" value="{{ $item->kondisi_perineum_3 }}"  autofocus autocomplete="off">
                                      </th>
                                    </tr>
                                    <tr>
                                      <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                          Tanda Infeksi
                                      </td>
                                        <th class="col-1"><input type="text" class="form-control  @error('tanda_infeksi_1') is-invalid @enderror" id="tanda_infeksi_1"
                                          placeholder="..." name="tanda_infeksi_1" value="{{ $item->tanda_infeksi_1 }}"  autofocus autocomplete="off">
                                         
                                          @error('dan_lain_lain_1')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror</th>
                                        <th class="col-1"><input type="text" class="form-control  @error('tanda_infeksi_2') is-invalid @enderror" id="tanda_infeksi_2"
                                          placeholder="..." name="tanda_infeksi_2" value="{{ $item->tanda_infeksi_2 }}"  autofocus autocomplete="off"></th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('tanda_infeksi_3') is-invalid @enderror" id="tanda_infeksi_3"
                                          placeholder="..." name="tanda_infeksi_3" value="{{ $item->tanda_infeksi_3 }}"  autofocus autocomplete="off">
                                        </th>
                                      </tr>
                                      <tr>
                                        <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                            Kontraksi uteri
                                        </td>
                                          <th class="col-1"><input type="text" class="form-control  @error('kontraksi_uteri_1') is-invalid @enderror" id="kontraksi_uteri_1"
                                            placeholder="..." name="kontraksi_uteri_1" value="{{ $item->kontraksi_uteri_1 }}"  autofocus autocomplete="off">
                                           
                                            @error('dan_lain_lain_1')
                                            <div class="invalid-feedback">
                                              {{ $message }}
                                            </div>
                                        @enderror</th>
                                          <th class="col-1"><input type="text" class="form-control  @error('kontraksi_uteri_2') is-invalid @enderror" id="kontraksi_uteri_2"
                                            placeholder="..." name="kontraksi_uteri_2" value="{{ $item->kontraksi_uteri_2 }}"  autofocus autocomplete="off"></th>
                                          <th class="col-1">
                                            <input type="text" class="form-control  @error('kontraksi_uteri_3') is-invalid @enderror" id="kontraksi_uteri_3"
                                            placeholder="..." name="kontraksi_uteri_3" value="{{ $item->kontraksi_uteri_3 }}"  autofocus autocomplete="off">
                                          </th>
                                        </tr>
                                        <tr>
                                          <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                              Tinggi Fundus Uteri
                                          </td>
                                            <th class="col-1"><input type="text" class="form-control  @error('tinggi_fundus_uteri_1') is-invalid @enderror" id="tinggi_fundus_uteri_1"
                                              placeholder="..." name="tinggi_fundus_uteri_1" value="{{ $item->tinggi_fundus_uteri_1 }}"  autofocus autocomplete="off">
                                             
                                              @error('dan_lain_lain_1')
                                              <div class="invalid-feedback">
                                                {{ $message }}
                                              </div>
                                          @enderror</th>
                                            <th class="col-1"><input type="text" class="form-control  @error('tinggi_fundus_uteri_2') is-invalid @enderror" id="tinggi_fundus_uteri_2"
                                              placeholder="..." name="tinggi_fundus_uteri_2" value="{{ $item->tinggi_fundus_uteri_2 }}"  autofocus autocomplete="off"></th>
                                            <th class="col-1">
                                              <input type="text" class="form-control  @error('tinggi_fundus_uteri_3') is-invalid @enderror" id="tinggi_fundus_uteri_3"
                                              placeholder="..." name="tinggi_fundus_uteri_3" value="{{ $item->tinggi_fundus_uteri_3 }}"  autofocus autocomplete="off">
                                            </th>
                                          </tr>
                                          <tr>
                                            <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                Lokhia
                                            </td>
                                              <th class="col-1"><input type="text" class="form-control  @error('lokhia_1') is-invalid @enderror" id="lokhia_1"
                                                placeholder="..." name="lokhia_1" value="{{ $item->lokhia_1 }}"  autofocus autocomplete="off">
                                               
                                                @error('dan_lain_lain_1')
                                                <div class="invalid-feedback">
                                                  {{ $message }}
                                                </div>
                                            @enderror</th>
                                              <th class="col-1"><input type="text" class="form-control  @error('lokhia_2') is-invalid @enderror" id="lokhia_2"
                                                placeholder="..." name="lokhia_2" value="{{ $item->lokhia_2 }}"  autofocus autocomplete="off"></th>
                                              <th class="col-1">
                                                <input type="text" class="form-control  @error('lokhia_3') is-invalid @enderror" id="lokhia_3"
                                                placeholder="..." name="lokhia_3" value="{{ $item->lokhia_3 }}"  autofocus autocomplete="off">
                                              </th>
                                            </tr>
                                            <tr>
                                              <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                  Pemeriksaan jalan lahir
                                              </td>
                                                <th class="col-1"><input type="text" class="form-control  @error('pemeriksaan_jalan_lahir_1') is-invalid @enderror" id="pemeriksaan_jalan_lahir_1"
                                                  placeholder="..." name="pemeriksaan_jalan_lahir_1" value="{{ $item->pemeriksaan_jalan_lahir_1 }}"  autofocus autocomplete="off">
                                                 
                                                  @error('dan_lain_lain_1')
                                                  <div class="invalid-feedback">
                                                    {{ $message }}
                                                  </div>
                                              @enderror</th>
                                                <th class="col-1"><input type="text" class="form-control  @error('pemeriksaan_jalan_lahir_2') is-invalid @enderror" id="pemeriksaan_jalan_lahir_2"
                                                  placeholder="..." name="pemeriksaan_jalan_lahir_2" value="{{ $item->pemeriksaan_jalan_lahir_2 }}"  autofocus autocomplete="off"></th>
                                                <th class="col-1">
                                                  <input type="text" class="form-control  @error('pemeriksaan_jalan_lahir_3') is-invalid @enderror" id="pemeriksaan_jalan_lahir_3"
                                                  placeholder="..." name="pemeriksaan_jalan_lahir_3" value="{{ $item->pemeriksaan_jalan_lahir_3 }}"  autofocus autocomplete="off">
                                                </th>
                                              </tr>
                                              <tr>
                                                <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                    Pemeriksaan payudara
                                                </td>
                                                  <th class="col-1"><input type="text" class="form-control  @error('pemeriksaan_payudara_1') is-invalid @enderror" id="pemeriksaan_payudara_1"
                                                    placeholder="..." name="pemeriksaan_payudara_1" value="{{ $item->pemeriksaan_payudara_1 }}"  autofocus autocomplete="off">
                                                   
                                                    @error('dan_lain_lain_1')
                                                    <div class="invalid-feedback">
                                                      {{ $message }}
                                                    </div>
                                                @enderror</th>
                                                  <th class="col-1"><input type="text" class="form-control  @error('pemeriksaan_payudara_2') is-invalid @enderror" id="pemeriksaan_payudara_2"
                                                    placeholder="..." name="pemeriksaan_payudara_2" value="{{ $item->pemeriksaan_payudara_2 }}"  autofocus autocomplete="off"></th>
                                                  <th class="col-1">
                                                    <input type="text" class="form-control  @error('pemeriksaan_payudara_3') is-invalid @enderror" id="pemeriksaan_payudara_3"
                                                    placeholder="..." name="pemeriksaan_payudara_3" value="{{ $item->pemeriksaan_payudara_3 }}"  autofocus autocomplete="off">
                                                  </th>
                                                </tr>
                                                <tr>
                                                  <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                      Produksi ASI
                                                  </td>
                                                    <th class="col-1"><input type="text" class="form-control  @error('produksi_asi_1') is-invalid @enderror" id="produksi_asi_1"
                                                      placeholder="..." name="produksi_asi_1" value="{{ $item->produksi_asi_1 }}"  autofocus autocomplete="off">
                                                     
                                                      @error('dan_lain_lain_1')
                                                      <div class="invalid-feedback">
                                                        {{ $message }}
                                                      </div>
                                                  @enderror</th>
                                                    <th class="col-1"><input type="text" class="form-control  @error('produksi_asi_2') is-invalid @enderror" id="produksi_asi_2"
                                                      placeholder="..." name="produksi_asi_2" value="{{ $item->produksi_asi_2 }}"  autofocus autocomplete="off"></th>
                                                    <th class="col-1">
                                                      <input type="text" class="form-control  @error('produksi_asi_3') is-invalid @enderror" id="produksi_asi_3"
                                                      placeholder="..." name="produksi_asi_3" value="{{ $item->produksi_asi_3 }}"  autofocus autocomplete="off">
                                                    </th>
                                                  </tr>
                                                  <tr>
                                                    <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                        Pemberian Kapsul Vit.A
                                                    </td>
                                                      <th class="col-1"><input type="text" class="form-control  @error('pemberian_kapsul_vitamin_a_1') is-invalid @enderror" id="pemberian_kapsul_vitamin_a_1"
                                                        placeholder="..." name="pemberian_kapsul_vitamin_a_1" value="{{ $item->pemberian_kapsul_vitamin_a_1 }}"  autofocus autocomplete="off">
                                                       
                                                        @error('dan_lain_lain_1')
                                                        <div class="invalid-feedback">
                                                          {{ $message }}
                                                        </div>
                                                    @enderror</th>
                                                      <th class="col-1"><input type="text" class="form-control  @error('pemberian_kapsul_vitamin_a_2') is-invalid @enderror" id="pemberian_kapsul_vitamin_a_2"
                                                        placeholder="..." name="pemberian_kapsul_vitamin_a_2" value="{{ $item->pemberian_kapsul_vitamin_a_2 }}"  autofocus autocomplete="off"></th>
                                                      <th class="col-1">
                                                        <input type="text" class="form-control  @error('pemberian_kapsul_vitamin_a_3') is-invalid @enderror" id="pemberian_kapsul_vitamin_a_3"
                                                        placeholder="..." name="pemberian_kapsul_vitamin_a_3" value="{{ $item->pemberian_kapsul_vitamin_a_3 }}"  autofocus autocomplete="off">
                                                      </th>
                                                    </tr>
                                                    <tr>
                                                      <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                          Pelayanan kontrasepsi pascapersalinan
                                                      </td>
                                                        <th class="col-1"><input type="text" class="form-control  @error('pelayanan_kontrasepsi_1') is-invalid @enderror" id="pelayanan_kontrasepsi_1"
                                                          placeholder="..." name="pelayanan_kontrasepsi_1" value="{{ $item->pelayanan_kontrasepsi_1 }}"  autofocus autocomplete="off">
                                                         
                                                          @error('dan_lain_lain_1')
                                                          <div class="invalid-feedback">
                                                            {{ $message }}
                                                          </div>
                                                      @enderror</th>
                                                        <th class="col-1"><input type="text" class="form-control  @error('pelayanan_kontrasepsi_2') is-invalid @enderror" id="pelayanan_kontrasepsi_2"
                                                          placeholder="..." name="pelayanan_kontrasepsi_2" value="{{ $item->pelayanan_kontrasepsi_2 }}"  autofocus autocomplete="off"></th>
                                                        <th class="col-1">
                                                          <input type="text" class="form-control  @error('pelayanan_kontrasepsi_3') is-invalid @enderror" id="pelayanan_kontrasepsi_3"
                                                          placeholder="..." name="pelayanan_kontrasepsi_3" value="{{ $item->pelayanan_kontrasepsi_3 }}"  autofocus autocomplete="off">
                                                        </th>
                                                      </tr>
                                                      <tr>
                                                        <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                            Penanganan resiko tinggi dan komplikasi pada nifas
                                                        </td>
                                                          <th class="col-1"><input type="text" class="form-control  @error('penanganan_resiko_tinggi_1') is-invalid @enderror" id="penanganan_resiko_tinggi_1"
                                                            placeholder="..." name="penanganan_resiko_tinggi_1" value="{{ $item->penanganan_resiko_tinggi_1 }}"  autofocus autocomplete="off">
                                                           
                                                            @error('dan_lain_lain_1')
                                                            <div class="invalid-feedback">
                                                              {{ $message }}
                                                            </div>
                                                        @enderror</th>
                                                          <th class="col-1"><input type="text" class="form-control  @error('penanganan_resiko_tinggi_2') is-invalid @enderror" id="penanganan_resiko_tinggi_2"
                                                            placeholder="..." name="penanganan_resiko_tinggi_2" value="{{ $item->penanganan_resiko_tinggi_2 }}"  autofocus autocomplete="off"></th>
                                                          <th class="col-1">
                                                            <input type="text" class="form-control  @error('penanganan_resiko_tinggi_3') is-invalid @enderror" id="penanganan_resiko_tinggi_3"
                                                            placeholder="..." name="penanganan_resiko_tinggi_3" value="{{ $item->penanganan_resiko_tinggi_3 }}"  autofocus autocomplete="off">
                                                          </th>
                                                        </tr>
                                                        <tr>
                                                          <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                              Buang Air Besar (BAB)
                                                          </td>
                                                            <th class="col-1"><input type="text" class="form-control  @error('buang_air_besar_1') is-invalid @enderror" id="buang_air_besar_1"
                                                              placeholder="..." name="buang_air_besar_1" value="{{ $item->buang_air_besar_1 }}"  autofocus autocomplete="off">
                                                             
                                                              @error('dan_lain_lain_1')
                                                              <div class="invalid-feedback">
                                                                {{ $message }}
                                                              </div>
                                                          @enderror</th>
                                                            <th class="col-1"><input type="text" class="form-control  @error('buang_air_besar_2') is-invalid @enderror" id="buang_air_besar_2"
                                                              placeholder="..." name="buang_air_besar_2" value="{{ $item->buang_air_besar_2 }}"  autofocus autocomplete="off"></th>
                                                            <th class="col-1">
                                                              <input type="text" class="form-control  @error('buang_air_besar_3') is-invalid @enderror" id="buang_air_besar_3"
                                                              placeholder="..." name="buang_air_besar_3" value="{{ $item->buang_air_besar_3 }}"  autofocus autocomplete="off">
                                                            </th>
                                                          </tr>
                                                          <tr>
                                                            <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                                Buang Air Kecil (BAK)
                                                            </td>
                                                              <th class="col-1"><input type="text" class="form-control  @error('buang_air_kecil_1') is-invalid @enderror" id="buang_air_kecil_1"
                                                                placeholder="..." name="buang_air_kecil_1" value="{{ $item->buang_air_kecil_1 }}"  autofocus autocomplete="off">
                                                               
                                                                @error('dan_lain_lain_1')
                                                                <div class="invalid-feedback">
                                                                  {{ $message }}
                                                                </div>
                                                            @enderror</th>
                                                              <th class="col-1"><input type="text" class="form-control  @error('buang_air_kecil_2') is-invalid @enderror" id="buang_air_kecil_2"
                                                                placeholder="..." name="buang_air_kecil_2" value="{{ $item->buang_air_kecil_2 }}"  autofocus autocomplete="off"></th>
                                                              <th class="col-1">
                                                                <input type="text" class="form-control  @error('buang_air_kecil_3') is-invalid @enderror" id="buang_air_kecil_3"
                                                                placeholder="..." name="buang_air_kecil_3" value="{{ $item->buang_air_kecil_3 }}"  autofocus autocomplete="off">
                                                              </th>
                                                            </tr>
                          
                            </tbody>
                         
                        </table>
                    
                    </div>

                    <div class="table-responsive bg-white" style="margin-top: 50px;">
                      <table class="table table-bordered table-hover text-center" id="tabelku">
                          <thead class="text-center" style="background-color: #4DA8DA;">
                              <tr>
                                  <th class="col-1 text-capitalize">Kunjungan Nifas</th>
                                  <th class="col-1 text-capitalize " style="background-color: #9f97f0;" colspan="3">Catatan Dokter / Bidan</th>
                              </tr>
                             
                          </thead>
                          <tbody>  
                            <tr>
                              <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                  Kunjungan Nifas 1 (KF1)
                                <th class="col-1" colspan="3"><textarea cols="125" rows="3" name="catatan_dokter_1">{{ $item->catatan_dokter_1 }}</textarea>
              
                                  @error('kondisi_ibu_secara_umum')
                                  <div class="invalid-feedback">
                                    {{ $message }}
                                  </div>
                              @enderror</th>
                              </tr>
                              <tr>
                                <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                  Kunjungan Nifas 2 (KF2)
                                </td>
                                  <th class="col-1" colspan="3"><textarea cols="125" rows="3"  name="catatan_dokter_2">{{ $item->catatan_dokter_2 }}</textarea>
                                    @error('tekanan_darah_1')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                </tr>
                                <tr>
                                  <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                    Kunjungan Nifas 3 (KF3) 
                                  </td>
                                    <th class="col-1" colspan="3"><textarea cols="125" rows="3"  name="catatan_dokter_3">{{ $item->catatan_dokter_3 }}</textarea>
                                      @error('kondisi_perineum_1')
                                      <div class="invalid-feedback">
                                        {{ $message }}
                                      </div>
                                  @enderror</th>
                                   
                                  </tr>
                                                                                            
                        
                          </tbody>
                       
                      </table>
                  
                  </div>

                  <div class="col-md-12 mx-auto p-5">
                    <div  class="card border-dark" style="background-color: #4DA8DA; border-radius: 30px 30px 30px 30px; border:solid 3px black;">
                            <div class="card-body">
                              <div class="row">
                                <div class="col-12">
                                  <h4 class="text-center">Kesimpulan Akhir Nifas</h4>
                                  <div class="form-group">
                                    <label class="form-check-label fw-bold" for="inlineRadio1">Keadaan Ibu:</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                     @if($item->keadaan_ibu == 'Sehat')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Sehat" name="keadaan_ibu" checked>
                                    @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Sehat" name="keadaan_ibu">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Sehat</label>
                                  </div>
                                  <div class="form-group form-check form-check-inline" style="margin-left: 43px;">
                                    @if($item->keadaan_ibu == 'Sakit')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Sakit" name="keadaan_ibu" checked>
                                    @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Sakit" name="keadaan_ibu">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox2">Sakit</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                     @if($item->keadaan_ibu == 'Meninggal')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Meninggal" name="keadaan_ibu" checked>
                                     @else
                                     <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Meninggal" name="keadaan_ibu">
                                     @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Meninggal</label>
                                  </div>
                                
                                  <div class="form-group">
                                    <label class="form-check-label fw-bold" for="inlineRadio1">Komplikasi Nifas :</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                     @if($item->komplikasi_nifas == 'Pendaharahan')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Pendarahan" name="komplikasi_nifas" checked>
                                      @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Pendarahan" name="komplikasi_nifas">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Pendaharahan</label>
                                  </div>
                                  <div class="form-group form-check form-check-inline" style="margin-left: 43px;">
                                    @if($item->komplikasi_nifas == 'Infeksi')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Infeksi" name="komplikasi_nifas" checked>
                                    @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Infeksi" name="komplikasi_nifas">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox2">Infeksi</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                     @if($item->komplikasi_nifas == 'Hipertensi')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Hipertensi" name="komplikasi_nifas" checked>
                                    @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Hipertensi" name="komplikasi_nifas">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Hipertensi</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                     @if($item->komplikasi_nifas == 'Lain-lain: Depresi post partum')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Lain-lain: Depresi post partum" name="komplikasi_nifas" checked>
                                    @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Lain-lain: Depresi post partum" name="komplikasi_nifas">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Lain-lain: Depresi post partum</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                    @if($item->komplikasi_nifas == 'Tidak Ada')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Tidak Ada" name="komplikasi_nifas" checked>
                                    @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Tidak Ada" name="komplikasi_nifas">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Tidak Ada</label>
                                  </div>
                                  <div class="form-group">
                                    <label class="form-check-label fw-bold" for="inlineRadio1">Keadaan Bayi :</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                     @if($item->keadaan_bayi == 'Sehat')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Sehat" name="keadaan_bayi" checked>
                                     @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Sehat" name="keadaan_bayi">
                                     @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Sehat</label>
                                  </div>
                                  <div class="form-group form-check form-check-inline" style="margin-left: 43px;">
                                     @if($item->keadaan_bayi == 'Sakit')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Sakit" name="keadaan_bayi" checked>
                                     @else
                                     <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Sakit" name="keadaan_bayi">
                                     @endif
                                    <label class="form-check-label" for="inlineCheckbox2">Sakit</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                     @if($item->keadaan_bayi == 'Kelainan Bawaan')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Kelainan Bawaan" name="keadaan_bayi" checked>
                                     @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Kelainan Bawaan" name="keadaan_bayi">
                                     @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Kelainan Bawaan</label>
                                  </div>
                                  <div class="form-group form-check-inline">
                                    @if($item->keadaan_bayi == 'Meninggal')
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Meninggal" name="keadaan_bayi" checked>
                                    @else
                                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Meninggal" name="keadaan_bayi">
                                    @endif
                                    <label class="form-check-label" for="inlineCheckbox1">Meninggal</label>
                                  </div>
                                 
                              </div>
                              </div>
                            
                            </div>
                          
                            
                    </div>
                  
                </div>
                    <br>
                    <div class="row ">
                      <div class="col-10 ">

                         </div>
                         <div class="col-2 text-start">
                             <p>Pilih Nifas Ke :</p>
                          </div>
                         </div>
                     
                    </div>
                 
                    {!! $data2->appends(Request::except('page'))->render() !!}
                    
                    <div class="card-body text-center" style="margin-top: 20px;">
                      <div class="row" style="">
                        <div class="col-1">
                          <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Ubah</button>
                         
                       
                        </div>
                      </form>
                   
                        <div class="col-1" style="margin-left: 50px;">
                          <form action="{{ url('kesehatanibunifas/'.$id) }}" method="POST"> 
                            @csrf
                            @method('DELETE')
                            <input type="text" name="nik_ibu" value="{{ $nik }}" hidden>
                            <input type="text" name="nifas_ke" value="{{ $item->nifas_ke }}" hidden>
                            <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #f31f34;">Hapus</button>
                          </form>
                          @endforeach
                        </div>
                        <div class="col-1" style="margin-left: 100px;">
                          <button type="button" onclick="window.location='{{ url('kesehatanibunifas') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                        </div>

                        <div class="col-1" style="margin-left: 50px;">
                          <a href="{{ url('cetakkesehatanibunifas/'.$id.'?page='.$nomor.'#srv') }}"  class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:100px; background-color: #4DA8DA;" target="_blank">Export</a>
                        </div>
                       
                      </div>
                       
                       
                    </div>
            
        </div>
       
        
    
@endsection