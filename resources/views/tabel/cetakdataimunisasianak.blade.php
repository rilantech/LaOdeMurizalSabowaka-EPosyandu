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

    <h2 style="text-align: center; color:black;">Data Imunisasi Anak</h2>
    <button class="btn btn-primary d-print-none" style="margin-left: 150px;" onclick="window.print()" title="cetak"><i><img
      src="{{ asset('templatedwi/img/iconprint.png') }}"
      alt="Img Profile"
      width="30"
      height="30"
    /></i></button>



      <div class="main-panel" style="margin-right: 80px;" >
        <div class="container" style="margin-top: 0px;">

          <div class="row">
            <div class="col-md-12 mx-auto mt-2 p-5">
                
                <table cellpadding="10">
                          <tbody>
                            <tr>
                              <th scope="row">NIK</th>
                              <td>:</td>
                              <td >{{ $nik_ibu }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Nama Ibu</th>
                              <td>:</td>
                              <td >{{ $nama_ibu }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Nama Ayah</th>
                              <td>:</td>
                              <td >{{ $nama_ayah }}</td>
                            </tr>
                             <tr>
                              <th scope="row">Nama Anak</th>
                              <td>:</td>
                              <td >{{ $nama_anak }}</td>
                            </tr>
                            <tr>
                              <th scope="row">Anak Ke-</th>
                              <td>:</td>
                              <td >{{ $anak_ke }}</td>
                            </tr>
                          </tbody>
                        </table>
              {{-- <input type="text" class="form-control  @error('id') is-invalid @enderror" id="nik_ibu"
              placeholder="Masukan Nama Ibu..." name="id" value="{{ $id }}" autofocus autocomplete="off" hidden> --}}
                        <div class="row ">
                          <!--<div class="col-6 ">-->
                          <!--  <div class="form-group">-->
                          <!--    <label for="nama_ibu" class="col-12 fw-bold">NIK</label>-->
                          <!--    <form method="get">-->
                          <!--      <select class="form-select @error('nik') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">-->
                          <!--        <option selected>{{ $nik_ibu }}</option>-->
                          <!--        @if($dataorangtua1 != null)-->
                          <!--        @foreach ($dataorangtua1 as $item)-->
                          <!--        <option value="{{ $item->nik }}">{{ $item->nik }}</option>-->
                          <!--        @endforeach-->
                          <!--        @else-->
                          <!--        <option selected>--Pilih NIK--</option>-->
                          <!--        @endif-->
                          <!--        @if($dataorangtua2 != null)-->
                          <!--        @foreach ($dataorangtua2 as $item1)-->
                          <!--        <option value="test" {{ old('nik') }} selected>{{ $item1->nik }}</option>-->
                          <!--        @endforeach-->
                          <!--        @endif-->

                                 
                          <!--        </select>-->
                                  
                          <!--      </form>-->
                          <!--</div>-->
                          <!--   </div>-->
                            
                        </div>
                        <form action="{{ url('imunisasianak/'.$id) }}" method='post'>
                          @csrf
                          @method('PUT')
                <!--          <div class="row">-->
                <!--            <div class="col-6">-->
                <!--              <div class="form-group">-->
                <!--                @if($dataorangtua2 != null)-->
                <!--                @foreach ($dataorangtua2 as $item1)-->
                <!--                <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"-->
                <!--                placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $item1->nik }}" autofocus autocomplete="off" hidden>-->
                <!--                @endforeach-->
                <!--                @else-->
                <!--                <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"-->
                <!--                placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $nik_ibu }}" autofocus autocomplete="off" hidden>-->
                <!--                @endif-->
                <!--                <label for="nama_ibu" class="col-12 fw-bold">Nama Ibu</label>-->
                <!--                <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"-->
                <!--                placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}" autofocus autocomplete="off">-->
                          
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
                <!--              <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"-->
                <!--                placeholder="Masukan Nama Anak..." name="nama_anak" value="{{ $nama_anak }}" autofocus autocomplete="off">-->
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
                <!--                   <label for="kehamilan_ke" class="col-12 fw-bold">Anak Ke-</label>-->
                <!--                  </div>-->
                <!--                  <div class="col-3 mt-3">-->
                <!--                   <input type="text" class="form-control  @error('anak_ke') is-invalid @enderror" id="anak_ke"-->
                <!--                   placeholder="" name="anak_ke" value="{{ $anak_ke }}"  autofocus autocomplete="off">-->
                <!--                   @error('anak_ke')-->
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
              
              <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover  text-center" id="tabelku" >
                    <thead class="text-center" style="background-color: #88C273;">
                        <tr >
                            <th class="col-1 text-capitalize" colspan="3" >UMUR (BULAN)</th>
                            <th class="col-1 text-capitalize ">0</th>
                            <th class="col-1 text-capitalize" >1</th>
                            <th class="col-1 text-capitalize" >2</th>
                            <th class="col-1 text-capitalize" >3</th>
                            <th class="col-1 text-capitalize" >4</th>
                            <th class="col-1 text-capitalize" >5</th>
                            <th class="col-1 text-capitalize" >6</th>
                         
                        </tr>
                        <tr style="background-color: #9f97f0;">
                          <th class="col-1" colspan="3">
                            <label for="kehamilan_ke" class="text-capitalize fw-bold" style="width: 200px;">Vaksin</label>
                          </th>
                          <th class="col-1 " colspan="7">
                            <div class="row">
                              <div class="col-12">
                                  <div class="row">
                                    <div class="col-12" >
                                     <label for="kehamilan_ke" class="text-capitalize text-center fw-bold">Tanggal Pemberian Imunisasi</label>
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
                         <td class="col-1"><?php if($hepatitis_0 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_0;
                                        }?>
                                        
                       </td>
                         <td class="col-1"><?php if($hepatitis_1 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_1;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_2 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_2;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_3 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_3;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_4 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_4;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_5 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_5;
                                        }?>
                                        </td>
                                          <td class="col-1"><?php if($hepatitis_6 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_6;
                                        }?>
                                        </td>
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                              BCG
                          </td>
                           <td class="col-1">
                                 <?php if($bcg_0 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_0;
                                        }?>
                                      
                           </td>
                         <td class="col-1"><?php if($bcg_1 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_1;
                                        }?></td>
                         <td class="col-1"><?php if($bcg_2 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_2;
                                        }?></td>
                         <td class="col-1"><?php if($bcg_3 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_3;
                                        }?></td>
                         <td class="col-1"><?php if($bcg_4 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_4;
                                        }?></td>
                         <td class="col-1"><?php if($bcg_5 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_5;
                                        }?></td>
                          <td class="col-1"><?php if($bcg_6 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_6;
                                        }?></td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                Polio tetes 1
                            </td>
                         <td class="col-1"><?php if($polio_tetes_0 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_0;
                                        }?>
                                        </td>
                           </td>
                         <td class="col-1"><?php if($polio_tetes_1 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_1;
                                        }?></td>
                         <td class="col-1"><?php if($polio_tetes_2 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_2;
                                        }?></td>
                         <td class="col-1"><?php if($polio_tetes_3 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_3;
                                        }?></td>
                         <td class="col-1"><?php if($polio_tetes_4 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_4;
                                        }?></td>
                         <td class="col-1"><?php if($polio_tetes_5 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_5;
                                        }?></td>
                          <td class="col-1"><?php if($polio_tetes_6 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_6;
                                        }?></td>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #9f97f0;" colspan="3" > 
                                  Dan Lain-lain
                              </td>
                         <td class="col-1"><?php if($dan_lain_lain_0 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_0;
                                        }?>
                                        </td>
                           </td>
                         <td class="col-1"><?php if($dan_lain_lain_1 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_1;
                                        }?></td>
                         <td class="col-1"><?php if($dan_lain_lain_2 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_2;
                                        }?></td>
                         <td class="col-1"><?php if($dan_lain_lain_3 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_3;
                                        }?></td>
                         <td class="col-1"><?php if($dan_lain_lain_4 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_4;
                                        }?></td>
                         <td class="col-1"><?php if($dan_lain_lain_5 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_5;
                                        }?></td>
                          <td class="col-1"><?php if($dan_lain_lain_6 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_6;
                                        }?></td>
                              </tr>
                  
                    </tbody>
                 
                </table>
            
            </div>
            <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover  text-center" id="tabelku" >
                    <thead class="text-center" style="background-color: #88C273;">
                        <tr >
                            <th class="col-1 text-capitalize" colspan="3" >UMUR (BULAN)</th>
                            <th class="col-1 text-capitalize " >7</th>
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
                          <th class="col-1 " colspan="6">
                            <div class="row">
                              <div class="col-12">
                                  <div class="row">
                                    <div class="col-12" >
                                     <label for="kehamilan_ke" class="text-capitalize text-center fw-bold">Tanggal Pemberian Imunisasi</label>
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
                        <td class="col-1"><?php if($hepatitis_7 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_7;
                                        }?>
                                        </td>
                          <td class="col-1"><?php if($hepatitis_8 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_8;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_9 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_9;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_10 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_10;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_11 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_11;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($hepatitis_12 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $hepatitis_12;
                                        }?>
                                        </td>
                                        
                        
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                              BCG
                          </td>
                       <td class="col-1"><?php if($bcg_7 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_7;
                                        }?>
                                        </td>
                          <td class="col-1"><?php if($bcg_8 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_8;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($bcg_9 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_9;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($bcg_10 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_10;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($bcg_11 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_11;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($bcg_12 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bcg_12;
                                        }?>
                                        </td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                Polio tetes 1
                            </td>
                             <td class="col-1"><?php if($polio_tetes_7 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_7;
                                        }?>
                                        </td>
                          <td class="col-1"><?php if($polio_tetes_8 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_8;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($polio_tetes_9 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_9;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($polio_tetes_10 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_10;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($polio_tetes_11 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_11;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($polio_tetes_12 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $polio_tetes_12;
                                        }?>
                                        </td>
                         
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #9f97f0;" colspan="3" > 
                                  Dan Lain-lain
                              </td>
                         <td class="col-1"><?php if($dan_lain_lain_7 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_7;
                                        }?>
                                        </td>
                          <td class="col-1"><?php if($dan_lain_lain_8 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_8;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($dan_lain_lain_9 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_9;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($dan_lain_lain_10 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_10;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($dan_lain_lain_11 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_11;
                                        }?>
                                        </td>
                         <td class="col-1"><?php if($dan_lain_lain_12 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $dan_lain_lain_12;
                                        }?>
                                        </td>
                             
                              </tr>
                  
                    </tbody>
                 
                </table>
            
            </div>
            <br>
            <div class="card-body text-center" style="margin-top: 20px;">
              <div class="row" style="">
                <div class="col-1">
                  {{-- <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button> --}}
               
                </div>
           
                <div class="col-1" style="margin-left: 100px;">
                  {{-- <button type="button" onclick="window.location='{{ url('imunisasianak') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button> --}}
                </form>
                </div>

               
              </div>
               
               
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
