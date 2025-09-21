<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>E-Posyandu Marawali | {{ $title }}</title>
    <meta
      content="width=device-width, initial-scale=1.0, shrink-to-fit=no"
      name="viewport"
    />
    <link
      rel="icon"
      href="{{ asset('templatedwi/img/logopuskesmas.png') }}"
      type="image/x-icon"
    />
    <style>
      @media print{
        btn btn-primary{
              display: none;
          }
      }
      </style>


    <!-- Fonts and icons -->
    <script src="{{ asset('templatedwi/js/plugin/webfont/webfont.min.js') }}"></script>
    <script>
      WebFont.load({
        google: { families: ["Public Sans:300,400,500,600,700"] },
        custom: {
          families: [
            "Font Awesome 5 Solid",
            "Font Awesome 5 Regular",
            "Font Awesome 5 Brands",
            "simple-line-icons",
          ],
          urls: ["templatedwi/css/fonts.min.css"],
        },
        active: function () {
          sessionStorage.fonts = true;
        },
      });
    </script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="{{ asset('templatedwi/css/bootstrap.min.css') }}" />
    <link rel="stylesheet" href="{{ asset('templatedwi/css/plugins.min.css') }}" />
    <link rel="stylesheet" href="{{ asset('templatedwi/css/kaiadmin.min.css') }}" />
{{-- 
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel="stylesheet" href="{{ asset('templatedwi/css/demo.css') }}" /> --}}

    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css"/>  
   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>  
   <style>
       input{
           border-width:none;
       }
   </style>
   <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script> 
  </head>
  <body >

    <h2 style="text-align: center; color:black;">Data Kesehatan Ibu Nifas</h2>
    <button class="btn btn-primary d-print-none" style="margin-left: 150px;" onclick="window.print()" title="cetak"><i><img
      src="{{ asset('templatedwi/img/iconprint.png') }}"
      alt="Img Profile"
      width="30"
      height="30"
    /></i></button>

      <div class="main-panel" style="margin-right: 80px;" >
        <div class="container" style="margin-top: 0px;">
       

          @foreach($data2 as $item)
          <form action="{{ url('kesehatanibunifas/'.$id) }}" method='post'>
            @csrf
            @method('PUT')
          <div class="row">
              <div class="col-md-12 mx-auto mt-2 p-5">
                 
                  @foreach($data2 as $item)
                        <table cellpadding="10">
                          <tbody>
                            <tr>
                              <th scope="row">NIK</th>
                              <td>:</td>
                              <td >{{ $nik }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Nama</th>
                              <td>:</td>
                              <td >{{ $nama_ibu }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Nama Anak</th>
                              <td>:</td>
                              <td >{{ $item->nama_anak }}</td>
                            </tr>
                            <tr>
                              <th scope="row">Nifas Ke</th>
                              <td>:</td>
                              <td >{{ $item->nifas_ke }}</td>
                            </tr>
                          </tbody>
                        </table>
        
        @endforeach             
                  <!--        <div class="row ">-->
                  <!--          <div class="col-6 ">-->
                  <!--            <div class="form-group">-->
                  <!--              <label for="nama_ibu" class="col-12 fw-bold">NIK</label>-->
                  <!--              <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"-->
                  <!--              placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $nik }}" autofocus autocomplete="off">-->
                  <!--              @error('nik_ibu')-->
                  <!--              <div class="invalid-feedback">-->
                  <!--                {{ $message }}-->
                  <!--              </div>-->
                  <!--          @enderror-->
                  <!--          </div>-->
                  <!--             </div>-->
                  <!--             <div class="col-6">-->
                  <!--              <div class="row" style="margin-left: 270px; margin-top:20px;">-->
                  <!--                <div class="col-6">-->
                  <!--                  {{-- <a class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color: #EE66A6;" onclick="window.location='{{ url('tambahkesehatanibunifas/'.'?nik='.$nik.'&'.'nama_ibu='.$nama_ibu.'&'.'id='.$id) }}'" >Tambah Data</a> --}}-->
                  <!--                </div>-->
                                
                  <!--              </div>-->
                  <!--             </div>-->
                           
                  <!--        </div>-->
                  <!--          <div class="row">-->
                  <!--            <div class="col-6">-->
                  <!--              <div class="form-group">-->
                  <!--                <label for="nama_ibu" class="col-12 fw-bold">Nama</label>-->
                  <!--                <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"-->
                  <!--                placeholder="Masukan Nama Anak..." name="nama_ibu" value="{{ $nama_ibu }}" autofocus autocomplete="off">-->
                  <!--                @error('nama_ibu')-->
                  <!--                <div class="invalid-feedback">-->
                  <!--                  {{ $message }}-->
                  <!--                </div>-->
                  <!--            @enderror-->
                  <!--            </div>-->
                  <!--          </div>-->
                  <!--          <div class="row">-->
                  <!--            <div class="col-6">-->
                  <!--              <div class="form-group">-->
                  <!--                <label for="nama_ibu" class="col-12 fw-bold">Nama Anak</label>-->
                  <!--                <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"-->
                  <!--                placeholder="Masukan Nama Anak..." name="nama_anak" value="{{ $item->nama_anak }}" autofocus autocomplete="off">-->
                  <!--                @error('nama_anak')-->
                  <!--                <div class="invalid-feedback">-->
                  <!--                  {{ $message }}-->
                  <!--                </div>-->
                  <!--            @enderror-->
                  <!--            </div>-->
                  <!--          </div>-->
                  <!--        </div>-->
                  <!--          <div class="row">-->
                  <!--            <div class="col-6">-->
                  <!--              <div class="form-group">-->
                  <!--                <div class="row">-->
                  <!--                  <div class="col-2 mt-3">-->
                  <!--                   <label for="kehamilan_ke" class="col-12 fw-bold">Nifas Ke-</label>-->
                  <!--                  </div>-->
                  <!--                  <div class="col-3 mt-3">-->
                  <!--                   <input type="text" class="form-control  @error('nifas_ke') is-invalid @enderror" id="nifas_ke"-->
                  <!--                   placeholder="" name="nifas_ke" value="{{ $item->nifas_ke }}"  autofocus autocomplete="off">-->
                  <!--                   @error('nifas_ke')-->
                  <!--                   <div class="invalid-feedback">-->
                  <!--                     {{ $message }}-->
                  <!--                   </div>-->
                  <!--               @enderror-->
                  <!--                  </div>-->
                                   
                  <!--               </div>-->
                               
                  <!--            </div>-->
                  <!--            </div>-->
                               
                  <!--          </div>-->
                                                          
                       
                  <!--</div>-->
              </div>
              

            </div>
           
            <div class="row p-5" style="margin-bottom: 50px; margin-top:-50px;">
             
              <div class="col-12">
                
                <div class="table-responsive bg-white">
                  <table class="table table-bordered table-hover text-center" id="tabelku">
                      <thead class="text-center" style="background-color: #4DA8DA;">
                          <tr>
                              <th class="col-1 text-capitalize" rowspan="2">JENIS PELAYANAN <br> DAN <br>PEMANTAUAN</th>
                              <th class="col-1 text-capitalize " style="background-color: #9f97f0;">KUNJUNGAN 1 <br> (6 Jam - 3 Hari)</th>
                              <th class="col-1 text-capitalize" style="background-color: #9f97f0;">KUNJUNGAN 2 <br> (4 - 28 Hari)</th>
                              <th class="col-1 text-capitalize" style="background-color: #9f97f0;">KUNJUNGAN 3 <br> (29 - 42 Hari)</th>
                          </tr>
                          <tr style="background-color: #9f97f0;">
                            <th class="col-1 " >
                              <div class="row">
                                <div class="col-12">
                                    <div class="row">
                              <div class="col-12 text-capitalize">
                                  Tgl : {{ $item->tanggal_kunjungan_1 }}
                                 
                              </div>
                               
                            </div>
                                </div>
                                 
                              </div>
                            </th>
                            <th class="col-1 "><div class="row">
                              <div class="col-12 text-capitalize">
                                  Tgl : {{ $item->tanggal_kunjungan_2 }}
                                 
                              </div>
                               
                            </div>
                          </th>
                            <th class="col-1 ">
                              <div class="row">
                                <div class="col-12">
                                     <div class="row">
                              <div class="col-12 text-capitalize">
                                  Tgl : {{ $item->tanggal_kunjungan_3 }}
                                 
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
                            <td class="col-1">{{ $item->kondisi_ibu_secara_umum_1 }}</td>
                            <td class="col-1">{{ $item->kondisi_ibu_secara_umum_2 }}</td>
                            <td class="col-1">{{ $item->kondisi_ibu_secara_umum_3 }}</td>
                          </tr>
                          <tr>
                            <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                Tekanan darah, suhu tubuh, respirasi, nadi
                            </td>
                              <td class="col-1">{{ $item->tekanan_darah_1 }}</td>
                              <td class="col-1">{{ $item->tekanan_darah_2 }}</td>
                              <td class="col-1">{{ $item->tekanan_darah_3 }}</td>
                             
                            </tr>
                         
                            <tr>
                              <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                  Pendarahan pervaginam
                              </td>
                              <td class="col-1">{{ $item->pendarahan_pervaginam_1 }}</td>
                              <td class="col-1">{{ $item->pendarahan_pervaginam_2 }}</td>
                              <td class="col-1">{{ $item->pendarahan_pervaginam_3 }}</td>
                              </tr>
                            <tr>
                              <td class="col-1 text-start" style="background-color:#C7D9DD;"> 
                                  Kondisi perineum
                               
                              </td>
                              <td class="col-1">{{ $item->kondisi_perineum_1 }}</td>
                              <td class="col-1">{{ $item->kondisi_perineum_2 }}</td>
                              <td class="col-1">{{ $item->kondisi_perineum_3 }}</td>
                              </tr>
                              <tr>
                                <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                    Tanda Infeksi
                                    
                                </td>
                                 <td class="col-1">{{ $item->tanda_infeksi_1 }}</td>
                              <td class="col-1">{{ $item->tanda_infeksi_2 }}</td>
                              <td class="col-1">{{ $item->tanda_infeksi_3 }}</td>
                                </tr>
                                <tr>
                                  <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                      Kontraksi uteri
                                      
                                  </td>
                                  <td class="col-1">{{ $item->kontraksi_uteri_1 }}</td>
                                  <td class="col-1">{{ $item->kontraksi_uteri_2 }}</td>
                                  <td class="col-1">{{ $item->kontraksi_uteri_3 }}</td>
                                  
                                  </tr>
                                  <tr>
                                    <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                        Tinggi Fundus Uteri
                                        
                                    </td>
                                      <td class="col-1">{{ $item->tinggi_fundus_uteri_1 }}</td>
                                  <td class="col-1">{{ $item->tinggi_fundus_uteri_2 }}</td>
                                  <td class="col-1">{{ $item->tinggi_fundus_uteri_3 }}</td>
                                    </tr>
                                    <tr>
                                      <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                          Lokhia
                                          
                                      </td>
                                           <td class="col-1">{{ $item->lokhia_1 }}</td>
                                          <td class="col-1">{{ $item->lokhia_2 }}</td>
                                          <td class="col-1">{{ $item->lokhia_3 }}</td>
                                      </tr>
                                      <tr>
                                        <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                            Pemeriksaan jalan lahir
                                            
                                        </td>
                                          <td class="col-1">{{ $item->pemeriksaan_jalan_lahir_1 }}</td>
                                          <td class="col-1">{{ $item->pemeriksaan_jalan_lahir_2 }}</td>
                                          <td class="col-1">{{ $item->pemeriksaan_jalan_lahir_3 }}</td>
                                        </tr>
                                        <tr>
                                          <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                              Pemeriksaan payudara
                                              
                                          </td>
                                             <td class="col-1">{{ $item->pemeriksaan_payudara_1 }}</td>
                                          <td class="col-1">{{ $item->pemeriksaan_payudara_2 }}</td>
                                          <td class="col-1">{{ $item->pemeriksaan_payudara_3 }}</td>
                                          </tr>
                                          <tr>
                                            <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                Produksi ASI
                                                
                                            </td>
                                              <td class="col-1">{{ $item->produksi_asi_1 }}</td>
                                              <td class="col-1">{{ $item->produksi_asi_2 }}</td>
                                              <td class="col-1">{{ $item->produksi_asi_3 }}</td>
                                            </tr>
                                            <tr>
                                              <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                  Pemberian Kapsul Vit.A
                                                  
                                              </td>
                                               <td class="col-1">{{ $item->pemberian_kapsul_vitamin_a_1 }}</td>
                                              <td class="col-1">{{ $item->pemberian_kapsul_vitamin_a_2 }}</td>
                                              <td class="col-1">{{ $item->pemberian_kapsul_vitamin_a_3 }}</td>
                                              </tr>
                                              <tr>
                                                <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                    Pelayanan kontrasepsi pascapersalinan
                                                    
                                                </td>
                                              <td class="col-1">{{ $item->pelayanan_kontrasepsi_1 }}</td>
                                              <td class="col-1">{{ $item->pelayanan_kontrasepsi_2 }}</td>
                                              <td class="col-1">{{ $item->pelayanan_kontrasepsi_3 }}</td>
                                                </tr>
                                                <tr>
                                                  <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                      Penanganan resiko tinggi dan komplikasi pada nifas
                                                      
                                                  </td>
                                                   <td class="col-1">{{ $item->penanganan_resiko_tinggi_1 }}</td>
                                              <td class="col-1">{{ $item->penanganan_resiko_tinggi_2 }}</td>
                                              <td class="col-1">{{ $item->penanganan_resiko_tinggi_3 }}</td>
                                                  </tr>
                                                  <tr>
                                                    <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                        Buang Air Besar (BAB)
                                                        
                                                    </td>
                                                      <td class="col-1">{{ $item->buang_air_besar_1 }}</td>
                                                      <td class="col-1">{{ $item->buang_air_besar_2 }}</td>
                                                      <td class="col-1">{{ $item->buang_air_besar_3 }}</td>
                                                    </tr>
                                                    <tr>
                                                      <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                                                          Buang Air Kecil (BAK)
                                                          
                                                      </td>
                                                        <td class="col-1">{{ $item->buang_air_kecil_1 }}</td>
                                                      <td class="col-1">{{ $item->buang_air_kecil_2 }}</td>
                                                      <td class="col-1">{{ $item->buang_air_kecil_3 }}</td>
                                                      </tr>
                    
                      </tbody>
                   
                  </table>
              
              </div>

              <div class="table-responsive bg-white" style="margin-top: 50px;">
                <table class="table table-bordered table-hover text-center" id="tabelku">
                    <thead class="text-center" style="background-color: #4DA8DA;">
                        <tr>
                            <th class="col-1 text-capitalize">Kunjungan Nifas</th>
                            <th class="col-1 text-capitalize text-start" style="background-color: #9f97f0;" colspan="3">Catatan Dokter / Bidan</th>
                        </tr>
                       
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="col-1 text-start" style="background-color: #C7D9DD;"> 
                            Kunjungan Nifas 1 (KF1)
                        </td>
                          <th class="col-1" colspan="3"><textarea cols="125" rows="3" name="catatan_dokter_1" style="border:none;">{{ $item->catatan_dokter_1 }}</textarea>
        
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
                            <th class="col-1" colspan="3"><textarea cols="125" rows="3"  name="catatan_dokter_2" style="border:none;">{{ $item->catatan_dokter_2 }}</textarea>
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
                              <th class="col-1" colspan="3"><textarea cols="125" rows="3"  name="catatan_dokter_3" style="border:none;">{{ $item->catatan_dokter_3 }}</textarea>
                                @error('kondisi_perineum_1')
                                <div class="invalid-feedback">
                                  {{ $message }}
                                </div>
                            @enderror</th>
                             
                            </tr>
                                                                                      
                  
                    </tbody>
                 
                </table>
                
                 <h4 class="text-center text-decoration-underline mt-5">Kesimpulan Akhir Nifas</h4>
                            
                        
                            <table cellpadding="10">
                          <tbody>
                            <tr>
                              <th scope="row">Keadaan Ibu</th>
                              <td>:</td>
                              <td>{{ $item->keadaan_ibu }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Komplikasi Nifas</th>
                              <td>:</td>
                              <td>{{ $item->komplikasi_nifas }}</td>
                            </tr>
                            <tr>
                              <th scope="row">Keadaan Bayi</th>
                              <td>:</td>
                              <td>{{ $item->keadaan_bayi }}</td>
                            </tr>
                          </tbody>
                        </table>
            
            </div>

            <div class="col-md-12 mx-auto p-5">
                 
              <!--<div  class="card border-dark" style="background-color: #EE66A6; border-radius: 30px 30px 30px 30px; border:solid 3px black;">-->
              <!--        <div class="card-body">-->
              <!--          <div class="row">-->
              <!--            <div class="col-12">-->
              <!--              <h4 class="text-center">Kesimpulan Akhir Nifas</h4>-->
                            
                        
              <!--              <table cellpadding="10">-->
              <!--            <tbody>-->
              <!--              <tr>-->
              <!--                <th scope="row">Keadaan Ibu</th>-->
              <!--                <td>:</td>-->
              <!--                <td>{{ $item->keadaan_ibu }}</td>-->
              <!--              </tr>-->
                            
                            
              <!--            </tbody>-->
              <!--          </table>-->
              <!--              <div class="form-group">-->
              <!--                <label class="form-check-label fw-bold" for="inlineRadio1">Keadaan Ibu:</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Sehat" name="keadaan_ibu_1">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Sehat</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check form-check-inline" style="margin-left: 43px;">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Sakit" name="keadaan_ibu_2">-->
              <!--                <label class="form-check-label" for="inlineCheckbox2">Sakit</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Meninggal" name="keadaan_ibu_3">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Meninggal</label>-->
              <!--              </div>-->
                          
              <!--              <div class="form-group">-->
              <!--                <label class="form-check-label fw-bold" for="inlineRadio1">Komplikasi Nifas :</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Pendarahan" name="komplikasi_nifas_1">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Pendaharahan</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check form-check-inline" style="margin-left: 43px;">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Infeksi" name="komplikasi_nifas_2">-->
              <!--                <label class="form-check-label" for="inlineCheckbox2">Infeksi</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Hipertensi" name="komplikasi_nifas_3">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Hipertensi</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Lain-lain: Depresi post partum" name="komplikasi_nifas_4">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Lain-lain: Depresi post partum</label>-->
              <!--              </div>-->
              <!--              <div class="form-group">-->
              <!--                <label class="form-check-label fw-bold" for="inlineRadio1">Keadaan Bayi :</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Sehat" name="keadaan_bayi_1">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Sehat</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check form-check-inline" style="margin-left: 43px;">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Sakit" name="keadaan_bayi_2">-->
              <!--                <label class="form-check-label" for="inlineCheckbox2">Sakit</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Kelainan Bawaan" name="keadaan_bayi_3">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Kelainan Bawaan</label>-->
              <!--              </div>-->
              <!--              <div class="form-group form-check-inline">-->
              <!--                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Meninggal" name="keadaan_bayi_4">-->
              <!--                <label class="form-check-label" for="inlineCheckbox1">Meninggal</label>-->
              <!--              </div>-->
                           
              <!--          </div>-->
              <!--          </div>-->
                      
              <!--        </div>-->
                    
                      
              <!--</div>-->
            
          </div>
              <br>
              <div class="row ">
                <div class="col-10 ">

                   </div>
                   {{-- <div class="col-2 text-start">
                       <p>Pilih Nifas Ke :</p>
                    </div> --}}
                   </div>
               
              </div>
           
              {{-- {!! $data2->appends(Request::except('page'))->render() !!} --}}
              
              <div class="card-body text-center" style="margin-top: 20px;">
                <div class="row" style="">
                  {{-- <div class="col-1">
                    <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Ubah</button>
                   
                 
                  </div> --}}
                </form>
             
                  <div class="col-1" style="margin-left: 50px;">
                    {{-- <form action="{{ url('kesehatanibunifas/'.$id) }}" method="POST"> 
                      @csrf
                      @method('DELETE')
                      <input type="text" name="nik_ibu" value="{{ $nik }}" hidden>
                      <input type="text" name="nifas_ke" value="{{ $item->nifas_ke }}" hidden>
                      <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #f31f34;">Hapus</button>
                    </form> --}}
                    @endforeach
                  </div>
                  {{-- <div class="col-1" style="margin-left: 100px;">
                    <button type="button" onclick="window.location='{{ url('kesehatanibunifas') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                  </div>

                  <div class="col-1" style="margin-left: 50px;">
                    <button type="button" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:100px; background-color: #f1377e;">Export</button>
                  </div> --}}
                 
                </div>
                 
                 
              </div>
                      
        </div>            
      </div>  
                      
   
  
    <!--   Core JS Files   -->
    <script src="{{ asset('templatedwi/js/core/jquery-3.7.1.min.js') }}"></script>
    <script src="{{ asset('templatedwi/js/core/popper.min.js') }}"></script>
    <script src="{{ asset('templatedwi/js/core/bootstrap.min.js') }}"></script>

    <!-- jQuery Scrollbar -->
    <script src="{{ asset('templatedwi/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js') }}"></script>

    <!-- Chart JS -->
    <script src="{{ asset('templatedwi/js/plugin/chart.js/chart.min.js') }}"></script>

    <!-- jQuery Sparkline -->
    <script src="{{ asset('templatedwi/js/plugin/jquery.sparkline/jquery.sparkline.min.js') }}"></script>

    <!-- Chart Circle -->
    <script src="{{ asset('templatedwi/js/plugin/chart-circle/circles.min.js') }}"></script>

    <!-- Datatables -->
    <script src="{{ asset('templatedwi/js/plugin/datatables/datatables.min.js') }}"></script>

    <!-- Bootstrap Notify -->
    <script src="{{ asset('templatedwi/js/plugin/bootstrap-notify/bootstrap-notify.min.js') }}"></script>

    <!-- jQuery Vector Maps -->
    <script src="{{ asset('templatedwi/js/plugin/jsvectormap/jsvectormap.min.js') }}"></script>
    <script src="{{ asset('templatedwi/js/plugin/jsvectormap/world.js') }}"></script>

    <!-- Sweet Alert -->
    <script src="{{ asset('templatedwi/js/plugin/sweetalert/sweetalert.min.js') }}"></script>

    <!-- Kaiadmin JS -->
    <script src="{{ asset('templatedwi/js/kaiadmin.min.js') }}"></script>

    <!-- Kaiadmin DEMO methods, don't include it in your project! -->
    <!--<script src="{{ asset('templatedwi/js/setting-demo.js') }} "></script>-->
    <!--<script src="{{ asset('templatedwi/js/demo.js') }}"></script>-->
    <script>
      $("#lineChart").sparkline([102, 109, 120, 99, 110, 105, 115], {
        type: "line",
        height: "70",
        width: "100%",
        lineWidth: "2",
        lineColor: "#177dff",
        fillColor: "rgba(23, 125, 255, 0.14)",
      });

      $("#lineChart2").sparkline([99, 125, 122, 105, 110, 124, 115], {
        type: "line",
        height: "70",
        width: "100%",
        lineWidth: "2",
        lineColor: "#f3545d",
        fillColor: "rgba(243, 84, 93, .14)",
      });

      $("#lineChart3").sparkline([105, 103, 123, 100, 95, 105, 115], {
        type: "line",
        height: "70",
        width: "100%",
        lineWidth: "2",
        lineColor: "#ffa534",
        fillColor: "rgba(255, 165, 52, .14)",
      });
    </script>
    <script>
      function toggleField(hideObj, showObj){
       hideObj.disabled=true;
       hideObj.style.display='none';
       showObj.disabled=true;
       showObj.style.display='inline';
       showObj.focus();
      }
       </script>
  </body>
</html>
