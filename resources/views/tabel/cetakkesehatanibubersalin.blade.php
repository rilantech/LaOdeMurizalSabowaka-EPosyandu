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
   <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script> 
  </head>
  <body >

    <h2 style="text-align: center; color:black;">Data Kesehatan Ibu Bersalin</h2>
    <button class="btn btn-primary d-print-none" style="margin-left: 30px;" onclick="window.print()" title="cetak"><i><img
      src="{{ asset('templatedwi/img/iconprint.png') }}"
      alt="Img Profile"
      width="30"
      height="30"
    /></i></button>
    
    

            <div class="row">
                

              @php
              $nomor = 1 + (($data2->currentPage()-1)* $data2->perPage());
          @endphp
                <div class="col-md-12 mx-auto mt-2 p-5">
                    <h4 class="text-start text-decoration-underline">Ibu Bersalin</h4>
                    @foreach($data2 as $item)

                           <table cellpadding="10">
                          <tbody>
                            <tr>
                              <th scope="row">Nama</th>
                              <td>:</td>
                              <td >{{ $nama_ibu }}</td>
                            </tr>
                             <tr>
                              <th scope="row">NIK</th>
                              <td>:</td>
                              <td >{{ $nik }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Tanggal Persalinan</th>
                              <td>:</td>
                              <td >{{ $item->tanggal_persalinan }}</td>
                               <th scope="row">Pukul</th>
                              <td>:</td>
                              <td >{{ $item->pukul }}</td>
                            </tr>
                            <tr>
                              <th scope="row">Umur Kehamilan</th>
                              <td>:</td>
                              <td >{{ $item->umur_kehamilan }} Minggu</td>
                            </tr>
                            <tr>
                              <th scope="row">Penolong Persalinan</th>
                              <td>:</td>
                              <td >{{ $item->penolong_persalinan }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Cara Persalinan</th>
                              <td>:</td>
                              <td >{{ $item->cara_persalinan }}</td>
                            </tr>
                            <tr>
                              <th scope="row">Keadaan Ibu</th>
                              <td>:</td>
                              <td >{{ $item->keadaan_ibu }}</td>
                            </tr>
                          </tbody>
                        </table>
                        
                   @endforeach
                   
                    <h4 class="text-start text-decoration-underline mt-5">Bayi Saat Lahir</h4>
                    @foreach($data2 as $item)

                           <table cellpadding="10">
                          <tbody>
                            <tr>
                              <th scope="row">Anak Ke-</th>
                              <td>:</td>
                              <td >{{ $item->anak_ke }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Berat Lahir</th>
                              <td>:</td>
                              <td >{{ $item->berat_lahir }} gram</td>
                            </tr>
                             <tr>
                              <th scope="row">Panjang Badan</th>
                              <td>:</td>
                              <td >{{ $item->panjang_badan }} cm</td>
                            </tr>
                             <tr>
                               <th scope="row">Lingkar Kepala</th>
                              <td>:</td>
                              <td >{{ $item->lingkar_kepala }} cm</td>
                            </tr>
                            <tr>
                              <th scope="row">Jenis Kelamin</th>
                              <td>:</td>
                              <td >{{ $item->jenis_kelamin }}</td>
                            </tr>
                            <tr>
                              <th scope="row">Kondisi Bayi Saat Lahir</th>
                              <td>:</td>
                              <td >{{ $item->kondisi_bayi_saat_lahir }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Asuhan Bayi Baru Lahir</th>
                              <td>:</td>
                              <td >{{ $item->asuhan_bayi_baru_lahir }}</td>
                            </tr>
                          </tbody>
                        </table>
                        
                   @endforeach
                            
                            
                    <!--<div  class="card border-dark" style="background-color: #EE66A6; border-radius: 30px 30px 30px 30px; border:solid 3px black;">-->
                        
                    <!--    <form class="form-horizontal" action='{{  url('kesehatanibubersalin/'.$id) }}' method='post'>-->
                    <!--        @csrf-->
                    <!--        @method('PUT')-->
                          
                    <!--        @foreach($data2 as $item)-->
                    <!--        <div class="card-body">-->
                    <!--          <div class="row">-->
                    <!--            <div class="col-6">-->
                    <!--               <div class="form-group">-->
                    <!--                <label for="nik" class="col-3 fw-bold">Namak</label>-->
                    <!--                <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"-->
                    <!--                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}"  autofocus autocomplete="off">-->
                    <!--                        @error('nama_ibu')-->
                    <!--                        <div class="invalid-feedback">-->
                    <!--                          {{ $message }}-->
                    <!--                        </div>-->
                    <!--                    @enderror-->

                    <!--               </div>-->
                                
                    <!--            </div>-->
                    <!--            <div class="col-6">-->
                    <!--                <div class="form-group">-->
                    <!--                  <div class="row">-->
                    <!--                    <div class="col-4 mt-3">-->
                    <!--                     <label for="panjang_badan[]" class="col-12 fw-bold">Panjang Badan (cm)</label>-->
                    <!--                    </div>-->
                    <!--                    <div class="col-2 mt-3">-->
                    <!--                     <input type="text" class="form-control  @error('panjang_badan[]') is-invalid @enderror" id="panjang_badan[]"-->
                    <!--                     placeholder="" name="panjang_badan[]" value="{{ $item->panjang_badan }}"  autofocus autocomplete="off">-->
                    <!--                     @error('panjang_badan[]')-->
                    <!--                     <div class="invalid-feedback">-->
                    <!--                       {{ $message }}-->
                    <!--                     </div>-->
                    <!--                 @enderror-->
                    <!--                    </div>-->
                    <!--                    <div class="col-4 mt-3">-->
                    <!--                      <label for="lingkar_kepala[]" class="col-12 fw-bold">Lingkar Kepala (cm)</label>-->
                    <!--                     </div>-->
                    <!--                     <div class="col-2 mt-3">-->
                    <!--                      <input type="text" class="form-control  @error('lingkar_kepala[]') is-invalid @enderror" id="lingkar_kepala[]"-->
                    <!--                      placeholder="" name="lingkar_kepala[]" value="{{ $item->lingkar_kepala }}"  autofocus autocomplete="off">-->
                    <!--                      @error('lingkar_kepala[]')-->
                    <!--                      <div class="invalid-feedback">-->
                    <!--                        {{ $message }}-->
                    <!--                      </div>-->
                    <!--                  @enderror-->
                    <!--                     </div>-->
                    <!--                 </div>-->
                    <!--                 <div class="row">-->
                    <!--                  <div class="col-4 mt-3">-->
                    <!--                    <label class="form-check-label fw-bold" for="inlineRadio1">Jenis Kelamin</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="col-4">-->
                    <!--                    <div class="form-check form-check-inline">-->
                                    
                    <!--                         @if($item->jenis_kelamin == 'Laki-Laki')-->
                    <!--                            <input class="form-check-input" type="radio" name="jenis_kelamin[]" id="inlineRadio1" value="Laki-laki" checked>-->
                    <!--                            @else-->
                    <!--                            <input class="form-check-input" type="radio" name="jenis_kelamin[]" id="inlineRadio1" value="Laki-laki">-->
                    <!--                            @endif-->
                    <!--                      <label class="form-check-label" for="inlineRadio1">Laki-laki</label>-->
                    <!--                    </div>-->
                    <!--                  </div>-->
                    <!--                 <div class="col-3">-->
                    <!--                  <div class="form-check form-check-inline">-->
                    <!--                      @if($item->jenis_kelamin == 'Perempuan')-->
                    <!--                        <input class="form-check-input" type="radio" name="jenis_kelamin[]" id="inlineRadio2" value="Perempuan" style="margin-left:-30px;" checked>-->
                    <!--                            @else-->
                    <!--                            <input class="form-check-input" type="radio" name="jenis_kelamin[]" id="inlineRadio2" value="Perempuan" style="margin-left:-30px;">-->
                    <!--                            @endif-->
                    <!--                    <label class="form-check-label" for="inlineRadio2">Perempuan</label>-->
                    <!--                  </div>-->
                    <!--                 </div>-->
                    <!--                 </div>-->
                    <!--              </div>-->
                                 
                    <!--            </div>-->
                              
                    <!--          </div>-->
                    <!--          <div class="row">-->
                    <!--            <div class="col-6">-->
                    <!--              <div class="form-group">-->
                    <!--                <label for="nik" class="col-3 fw-bold">NIK</label>-->
                    <!--                <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"-->
                    <!--                        placeholder="Masukan NIK Ibu..." name="nik_ibu" value="{{ $nik }}"  autofocus autocomplete="off">-->
                    <!--                        @error('nik_ibu')-->
                    <!--                        <div class="invalid-feedback">-->
                    <!--                          {{ $message }}-->
                    <!--                        </div>-->
                    <!--                    @enderror-->
                    <!--              </div>-->
                    <!--              <div class="row">-->
                    <!--                <div class="col-6">-->
                    <!--                  <div class="form-group">-->
                    <!--                    <label for="tempat_atau_tanggal_lahir_ibu" class="col-12 fw-bold">Tanggal Persalinan</label>-->
                    <!--                    <input type="text" class="form-control  @error('tanggal_persalinan') is-invalid @enderror" id="tanggal_persalinan"-->
                    <!--                            placeholder="Masukan Tanggal Persalinan..." name="tanggal_persalinan" value="{{ $item->tanggal_persalinan }}"  autofocus autocomplete="off">-->
                    <!--                            @error('tanggal_persalinan')-->
                    <!--                            <div class="invalid-feedback">-->
                    <!--                              {{ $message }}-->
                    <!--                            </div>-->
                    <!--                        @enderror-->
                                           
                    <!--                   </div>-->
                    <!--                </div>-->
                    <!--                <div class="col-6">-->
                    <!--                  <div class="form-group">-->
                    <!--                    <label for="tempat_atau_tanggal_lahir_ibu" class="col-12 fw-bold">Pukul</label>-->
                    <!--                    <input type="text" class="form-control  @error('pukul') is-invalid @enderror" id="pukul"-->
                    <!--                            placeholder="Masukan Jam Persalinan..." name="pukul" value="{{ $item->pukul }}"  autofocus autocomplete="off">-->
                    <!--                            @error('pukul')-->
                    <!--                            <div class="invalid-feedback">-->
                    <!--                              {{ $message }}-->
                    <!--                            </div>-->
                    <!--                        @enderror-->
                                           
                    <!--                   </div>-->
                    <!--                </div>-->
                    <!--              </div>-->
                    <!--              <div class="form-group">-->
                    <!--                <div class="row">-->
                    <!--                  <div class="col-6 mt-3">-->
                    <!--                   <label for="kehamilan_ke" class="col-12 fw-bold">Umur Kehamilan (Minggu)</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="col-3 mt-3">-->
                    <!--                   <input type="text" class="form-control  @error('umur_kehamilan[]') is-invalid @enderror" id="umur_kehamilan[]"-->
                    <!--                   placeholder="" name="umur_kehamilan[]" value="{{ $item->umur_kehamilan }}"  autofocus autocomplete="off">-->
                    <!--                   @error('umur_kehamilan[]')-->
                    <!--                   <div class="invalid-feedback">-->
                    <!--                     {{ $message }}-->
                    <!--                   </div>-->
                    <!--               @enderror-->
                    <!--                  </div>-->
                                     
                    <!--               </div>-->
                                 
                    <!--            </div>-->
                    <!--              <div class="form-group">-->
                    <!--                    <label class="form-check-label fw-bold" for="inlineRadio1">Penolong Persalinan</label>-->
                    <!--                    <input type="text" class="form-control  @error('penolong_persalinan') is-invalid @enderror" id="penolong_persalinan"-->
                    <!--                  placeholder="Masukan Keterangan Tambahan Anak..." name="penolong_persalinan[]" value="{{ $item->berat_lahir }}"  autofocus autocomplete="off">-->
                    <!--                  </div>-->
 
                    <!--            <div class="form-group">-->
                    <!--                    <label class="form-check-label fw-bold" for="inlineRadio1">Cara Persalinan</label>-->
                    <!--                    <input type="text" class="form-control  @error('cara_persalinan') is-invalid @enderror" id="cara_persalinan"-->
                    <!--                  placeholder="Masukan Keterangan Tambahan Anak..." name="cara_persalinan[]" value="{{ $item->cara_persalinan }}"  autofocus autocomplete="off">-->
                    <!--                  </div>-->
                    <!--             <div class="form-group">-->
                    <!--                    <label class="form-check-label fw-bold" for="inlineRadio1">Keadaan Ibu</label>-->
                    <!--                    <input type="text" class="form-control  @error('keadaan_ibu') is-invalid @enderror" id="keadaan_ibu"-->
                    <!--                  placeholder="Masukan Keterangan Tambahan Anak..." name="keadaan_ibu[]" value="{{ $item->keadaan_ibu }}"  autofocus autocomplete="off">-->
                    <!--                  </div>-->
                    <!--             <div class="form-group">-->
                    <!--              <label for="nik" class="col-3 fw-bold">Keterangan Tambahan Ibu</label>-->
                    <!--              <input type="text" class="form-control  @error('keterangan_tambahan_ibu[]') is-invalid @enderror" id="keterangan_tambahan_ibu[]"-->
                    <!--                      placeholder="Masukan Keterangan Tambahan Ibu..." name="keterangan_tambahan_ibu[]" value="{{ $item->keterangan_tambahan_ibu }}"  autofocus autocomplete="off">-->
                    <!--                      @error('keterangan_tambahan_ibu[]')-->
                    <!--                      <div class="invalid-feedback">-->
                    <!--                        {{ $message }}-->
                    <!--                      </div>-->
                    <!--                  @enderror-->
                    <!--            </div>-->
                    <!--            <div class="form-group">-->
                    <!--              <div class="row">-->
                    <!--                <div class="col-2 mt-3">-->
                    <!--                 <label for="kehamilan_ke" class="col-12 fw-bold">Anak Ke-</label>-->
                    <!--                </div>-->
                    <!--                <div class="col-3 mt-3">-->
                    <!--                 <input type="text" class="form-control  @error('anak_ke[]') is-invalid @enderror" id="anak_ke[]"-->
                    <!--                 placeholder="" name="anak_ke[]" value="{{ $item->anak_ke }}"  autofocus autocomplete="off">-->
                    <!--                 @error('anak_ke[]')-->
                    <!--                 <div class="invalid-feedback">-->
                    <!--                   {{ $message }}-->
                    <!--                 </div>-->
                    <!--             @enderror-->
                    <!--                </div>-->
                                   
                    <!--             </div>-->
                               
                    <!--          </div>-->
                    <!--          <div class="form-group">-->
                    <!--            <div class="row">-->
                    <!--              <div class="col-4 mt-3">-->
                    <!--               <label for="kehamilan_ke" class="col-12 fw-bold">Berat Lahir (gram)</label>-->
                    <!--              </div>-->
                    <!--              <div class="col-3 mt-3">-->
                    <!--               <input type="text" class="form-control  @error('berat_lahir[]') is-invalid @enderror" id="berat_lahir[]"-->
                    <!--               placeholder="" name="berat_lahir[]" value="{{ $item->berat_lahir }}"  autofocus autocomplete="off">-->
                    <!--               @error('berat_lahir[]')-->
                    <!--               <div class="invalid-feedback">-->
                    <!--                 {{ $message }}-->
                    <!--               </div>-->
                    <!--           @enderror-->
                    <!--              </div>-->
                                 
                    <!--           </div>-->
                             
                    <!--        </div>-->
                                  
                                 
                    <!--            </div>-->
                    <!--            <div class="col-6">-->
                    <!--              <div class="form-group">-->
                    <!--                <label class="form-check-label fw-bold" for="inlineRadio1">Kondisi Bayi Saat Lahir :</label>-->
                    <!--              </div>-->
                    <!--             <div class="form-group form-check-inline">-->
                    <!--                     @if($item->kondisi_bayi_saat_lahir == 'Segera menangis')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" name="kondisi_bayi_saat_lahir[]" value="Segera menangis" checked>-->
                    <!--                     @else-->
                    <!--                     <input class="form-check-input" type="checkbox" id="inlineCheckbox1" name="kondisi_bayi_saat_lahir[]" value="Segera menangis">-->
                    <!--                     @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox1">Segera menangis</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group form-check form-check-inline" style="margin-left: 43px;">-->
                    <!--                    @if($item->kondisi_bayi_saat_lahir == 'Anggota gerak kebiruan')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" name="kondisi_bayi_saat_lahir[]" value="Anggota gerak kebiruan" checked>-->
                    <!--                    @else-->
                    <!--                     <input class="form-check-input" type="checkbox" id="inlineCheckbox2" name="kondisi_bayi_saat_lahir[]" value="Anggota gerak kebiruan">-->
                    <!--                    @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox2">Anggota gerak kebiruan</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group form-check-inline">-->
                    <!--                     @if($item->kondisi_bayi_saat_lahir == 'Menangis beberapa saat')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Menangis beberapa saat" name="kondisi_bayi_saat_lahir[]" checked>-->
                    <!--                     @else-->
                    <!--                       <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Menangis beberapa saat">-->
                    <!--                     @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox1">Menangis beberapa saat</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group form-check form-check-inline" style="margin-left: 1px;">-->
                    <!--                      @if($item->kondisi_bayi_saat_lahir == 'Seluruh tubuh biru')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Seluruh tubuh biru" name="kondisi_bayi_saat_lahir[]" checked>-->
                    <!--                      @else-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Seluruh tubuh biru">-->
                    <!--                      @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox2">Seluruh tubuh biru</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group form-check-inline">-->
                    <!--                     @if($item->kondisi_bayi_saat_lahir == 'Tidak menangis')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Tidak menangis" name="kondisi_bayi_saat_lahir[]" checked>-->
                    <!--                     @else-->
                    <!--                     <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Tidak menangis">-->
                    <!--                     @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox1">Tidak menangis</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group form-check form-check-inline" style="margin-left: 55px;">-->
                    <!--                      @if($item->kondisi_bayi_saat_lahir == 'Kelainan bawaan')-->
                    <!--                      <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Kelainan bawaan" name="kondisi_bayi_saat_lahir[]" checked>-->
                    <!--                      @else-->
                    <!--                      <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Kelainan bawaan">-->
                    <!--                      @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox2">Kelainan bawaan</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group form-check-inline">-->
                    <!--                     @if($item->kondisi_bayi_saat_lahir == 'Seluruh tubuh kemerahan')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Seluruh tubuh kemerahan" name="kondisi_bayi_saat_lahir[]" checked>-->
                    <!--                    @else-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Seluruh tubuh kemerahan">-->
                    <!--                    @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox1">Seluruh tubuh kemerahan</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group form-check form-check-inline" style="margin-left: -6px;">-->
                    <!--                     @if($item->kondisi_bayi_saat_lahir == 'Meninggal')-->
                    <!--                     <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Meninggal" name="kondisi_bayi_saat_lahir[]" checked>-->
                    <!--                     @else-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Meninggal">-->
                    <!--                     @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox2">Meninggal</label>-->
                    <!--                  </div>-->
                                     
                    <!--              <div class="form-group">-->
                    <!--                <label class="form-check-label fw-bold" for="inlineRadio1">Asuhan Bayi Baru Lahir :</label>-->
                    <!--              </div>-->
                    <!--               <div class="form-group form-check-inline">-->
                    <!--                     @if($item->asuhan_bayi_baru_lahir == 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi" name="asuhan_bayi_baru_lahir[]" checked>-->
                    <!--                     @else-->
                    <!--                     <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi">-->
                    <!--                     @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox1">Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi</label>-->
                    <!--                  </div>-->
                                    
                    <!--                  <div class="form-group form-check-inline">-->
                    <!--                     @if($item->asuhan_bayi_baru_lahir == 'Suntikan Vitamin K1')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Suntikan Vitamin K1" name="asuhan_bayi_baru_lahir[]" checked>-->
                    <!--                    @else-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Suntikan Vitamin K1">-->
                    <!--                    @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox1">Suntikan Vitamin K1</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group">-->
                    <!--                     @if($item->asuhan_bayi_baru_lahir == 'Salep mata antibiotika profilaksis')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Salep mata antibiotika profilaksis" name="asuhan_bayi_baru_lahir[]" checked>-->
                    <!--                     @else-->
                    <!--                     <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Salep mata antibiotika profilaksis">-->
                    <!--                     @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox2">Salep mata antibiotika profilaksis</label>-->
                    <!--                  </div>-->
                    <!--                  <div class="form-group">-->
                    <!--                     @if($item->asuhan_bayi_baru_lahir == 'Imunisasi Hepatitis B')-->
                    <!--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Imunisasi Hepatitis B" name="asuhan_bayi_baru_lahir[]" checked>-->
                    <!--                     @else-->
                    <!--                     <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Imunisasi Hepatitis B">-->
                    <!--                     @endif-->
                    <!--                    <label class="form-check-label" for="inlineCheckbox2">Imunisasi Hepatitis B</label>-->
                    <!--                  </div>-->
                    <!--              <div class="form-group">-->
                    <!--                <label class="form-check-label fw-bold" for="inlineRadio1">Keterangan Tambahan Anak</label>-->
                    <!--              </div>-->
                    <!--              <div class="form-group">-->
                    <!--                <input type="text" class="form-control  @error('keterangan_tambahan_anak') is-invalid @enderror" id="keterangan_tambahan_anak"-->
                    <!--              placeholder="Masukan Keterangan Tambahan Anak..." name="keterangan_tambahan_anak" value="{{ $item->berat_lahir }}"  autofocus autocomplete="off">-->
                    <!--              </div>-->

                    <!--          </div>-->
                    <!--          </div>-->
                    <!--        </div>-->
                    <!--        @endforeach-->
                            
                    <!--</div>-->
                    {{-- {!! $data2->appends(Request::except('page'))->render() !!} --}}
                </div>
               
              </div>
              {{-- <div class="card-body text-center" style="margin-top: -50px; margin-left:80px;">
                <div class="row" style="background-color: skyblue;" >
                  <div class="col-1">
                  <button type="submit" value="simpan" name="btnSimpan" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button>
                </form>
                  </div>
                  <div class="col-1" style="margin-left: 30px;">
                    <button type="button" onclick="window.location='{{ url('kesehatanibubersalin') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                  </div>
                  {{-- <div class="col-1" style="margin-left: 130px;">
                    <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFB0B0;">Edit</button>
                
                  </div> --}}
                  {{-- <div class="col-1" style="margin-left: 130px;">
                    <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFE700;">Eksport</button>
                
                  </div> --}}
                  {{-- <div class="col-4" style="margin-left: 80px;">
                    <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #EE66A6;">Rujukan</button>
                  
                  </div> --}}
                {{-- </div>
                 
                 
              </div>  --}}
        
                      
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
