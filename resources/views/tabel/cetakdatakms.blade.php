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

    <h2 style="text-align: center; color:black;">Data KMS</h2>
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
                              <th scope="row">Jenis Kelamin</th>
                              <td>:</td>
                              <td >{{ $jenis_kelamin }}</td>
                            </tr>
                            <tr>
                              <th scope="row">Anak Ke-</th>
                              <td>:</td>
                              <td >{{ $anak_ke }}</td>
                            </tr>
                              <tr>
                              <th scope="row">Status Berat Badan Terakhir</th>
                              <td>:</td>
                              <td >{{ $status_bb_terakhir }}</td>
                            </tr>
                          </tbody>
                        </table>
              {{-- <input type="text" class="form-control  @error('id') is-invalid @enderror" id="nik_ibu"
              placeholder="Masukan Nama Ibu..." name="id" value="{{ $id }}" autofocus autocomplete="off" hidden> --}}
                        <!--<div class="row ">-->
                        <!--  <div class="col-6 ">-->
                        <!--    <div class="form-group">-->
                        <!--      <label for="nama_ibu" class="col-12 fw-bold">NIK</label>-->
                        <!--      <form method="get">-->
                        <!--        <select class="form-select @error('nik') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">-->
                        <!--          <option selected>{{ $nik_ibu }}</option>-->
                        <!--          @if($dataorangtua1 != null)-->
                        <!--          @foreach ($dataorangtua1 as $item)-->
                        <!--          <option value="{{ $item->nik }}">{{ $item->nik }}</option>-->
                        <!--          @endforeach-->
                        <!--          @else-->
                        <!--          <option selected>--Pilih NIK--</option>-->
                        <!--          @endif-->
                        <!--          @if($dataorangtua2 != null)-->
                        <!--          @foreach ($dataorangtua2 as $item1)-->
                        <!--          <option value="test" {{ old('nik') }} selected>{{ $nik_ibu }}</option>-->
                        <!--          @endforeach-->
                        <!--          @endif-->

                                 
                        <!--          </select>-->
                                  
                        <!--        </form>-->
                        <!--  </div>-->
                        <!--     </div>-->
                        <!--     <div class="col-6 ">-->
                        <!--      <div class="form-group">-->
                        <!--        <label for="nama_ibu" class="col-12 fw-bold">Jenis Kelamin</label>-->
                        <!--        <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"-->
                        <!--        placeholder="Masukan Jenis Kelamin." name="jenis_kelamin" value="{{ $jenis_kelamin }}" autocomplete="off">-->
                        <!--    </div>-->
                        <!--       </div>-->
                            
                        <!--</div>-->
                        <form action="{{ url('datakms/'.$id) }}" method='post'>
                          @csrf
                          @method('PUT')
                <!--          <div class="row">-->
                <!--            <div class="col-6">-->
                <!--              <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"-->
                <!--              placeholder="Masukan Nama Ibu..." name="jenis_kelamin" value="{{ $jenis_kelamin }}" autocomplete="off" hidden>-->
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
                <!--                <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"-->
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
                
            <div class="card-body bg-white">
              <div class="chart-container" style="min-height: 375px; width:1000px;">
                <canvas id="chart"></canvas>
      
            </div>
              <div id="myChartLegend"></div>
            </div>
            <div class="card-body bg-white mt-3">
              <div class="chart-container col-12" style="min-height: 375px; width:1000px;">
                <canvas id="chart2"></canvas>
                
              </div>
              <div id="myChartLegend"></div>
            </div>
              
              <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">0</th>
                            <th class="col-1 text-capitalize">1</th>
                            <th class="col-1 text-capitalize">2</th>
                            <th class="col-1 text-capitalize">3</th>
                            <th class="col-1 text-capitalize">4</th>
                            <th class="col-1 text-capitalize">5</th>
                            <th class="col-1 text-capitalize">6</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_0 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_0;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_1 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_1;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_2 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_2;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_3 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_3;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_4 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_4;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_5 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_5;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_6 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_6;
                                        }?>
                          </td>
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_0 }}</td>
                          <td>{{ $bb_1 }}</td>
                          <td>{{ $bb_2 }}</td>
                          <td>{{ $bb_3 }}</td>
                          <td>{{ $bb_4 }}</td>
                          <td>{{ $bb_5 }}</td>
                          <td>{{ $bb_6 }}</td>
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
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_0 }}</td>
                                  <td>{{ $nt_1 }}</td>
                                  <td>{{ $nt_2 }}</td>
                                  <td>{{ $nt_3 }}</td>
                                  <td>{{ $nt_4 }}</td>
                                  <td>{{ $nt_5 }}</td>
                                  <td>{{ $nt_6 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td>{{ $asi_eksklusif_0 }}</td>
                                  <td>{{ $asi_eksklusif_1 }}</td>
                                  <td>{{ $asi_eksklusif_2 }}</td>
                                  <td>{{ $asi_eksklusif_3 }}</td>
                                  <td>{{ $asi_eksklusif_4 }}</td>
                                  <td>{{ $asi_eksklusif_5 }}</td>
                                  <td>{{ $asi_eksklusif_6 }}</td>
                        </tr>
                         <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                        <td>{{ $status_berat_badan_0 }}</td>
                                        <td>{{ $status_berat_badan_1 }}</td>
                                        <td>{{ $status_berat_badan_2 }}</td>
                                        <td>{{ $status_berat_badan_3 }}</td>
                                        <td>{{ $status_berat_badan_4 }}</td>
                                        <td>{{ $status_berat_badan_5 }}</td>
                                        <td>{{ $status_berat_badan_6 }}</td>
                                       
                                      
                            </tr>
                  
                    </tbody>
                 
                </table>
            
            </div>
            <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
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
                          <td>
                               <?php if($bulan_penimbangan_7 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_7;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_8 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_8;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_9 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_9;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_10 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_10;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_11 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_11;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_12 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_12;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_13 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_13;
                                        }?>
                          </td>
                          <!--<td>{{ $bulan_penimbangan_7 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_8 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_9 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_10 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_11 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_12 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_13 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_7 }}</td>
                          <td>{{ $bb_8 }}</td>
                          <td>{{ $bb_9 }}</td>
                          <td>{{ $bb_10 }}</td>
                          <td>{{ $bb_11 }}</td>
                          <td>{{ $bb_12 }}</td>
                          <td>{{ $bb_13 }}</td>
                        </tr>
                        
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="4">300</th>
                           <th class="col-1" colspan="3">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_7 }}</td>
                                  <td>{{ $nt_8 }}</td>
                                  <td>{{ $nt_9 }}</td>
                                  <td>{{ $nt_10 }}</td>
                                  <td>{{ $nt_11 }}</td>
                                  <td>{{ $nt_12 }}</td>
                                  <td>{{ $nt_13 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                
                        </tr>
                         <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                        <td>{{ $status_berat_badan_7 }}</td>
                                        <td>{{ $status_berat_badan_8 }}</td>
                                        <td>{{ $status_berat_badan_9 }}</td>
                                        <td>{{ $status_berat_badan_10 }}</td>
                                        <td>{{ $status_berat_badan_11 }}</td>
                                        <td>{{ $status_berat_badan_12 }}</td>
                                        <td>{{ $status_berat_badan_13 }}</td>
                        </tr>
                  
                    </tbody>
                 
                </table>
            
            </div>
            
            <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">14</th>
                            <th class="col-1 text-capitalize">15</th>
                            <th class="col-1 text-capitalize">16</th>
                            <th class="col-1 text-capitalize">17</th>
                            <th class="col-1 text-capitalize">18</th>
                            <th class="col-1 text-capitalize">19</th>
                            <th class="col-1 text-capitalize">20</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_14 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_14;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_15 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_15;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_16 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_16;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_17 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_17;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_18 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_18;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_19 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_19;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_20 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_20;
                                        }?>
                          </td>
                          <!--<td>{{ $bulan_penimbangan_14 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_15 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_16 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_17 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_18 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_19 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_20 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_14 }}</td>
                          <td>{{ $bb_15 }}</td>
                          <td>{{ $bb_16 }}</td>
                          <td>{{ $bb_17 }}</td>
                          <td>{{ $bb_18 }}</td>
                          <td>{{ $bb_19 }}</td>
                          <td>{{ $bb_20 }}</td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="7">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_14 }}</td>
                                  <td>{{ $nt_15 }}</td>
                                  <td>{{ $nt_16 }}</td>
                                  <td>{{ $nt_17 }}</td>
                                  <td>{{ $nt_18 }}</td>
                                  <td>{{ $nt_19 }}</td>
                                  <td>{{ $nt_20 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                
                        </tr>
                         <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                        <td>{{ $status_berat_badan_14 }}</td>
                                        <td>{{ $status_berat_badan_15 }}</td>
                                        <td>{{ $status_berat_badan_16 }}</td>
                                        <td>{{ $status_berat_badan_17 }}</td>
                                        <td>{{ $status_berat_badan_18 }}</td>
                                        <td>{{ $status_berat_badan_19 }}</td>
                                        <td>{{ $status_berat_badan_20 }}</td>
                        </tr>
                  
                    </tbody>
                 
                </table>
            
            </div>
            
            <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">21</th>
                            <th class="col-1 text-capitalize">22</th>
                            <th class="col-1 text-capitalize">23</th>
                            <th class="col-1 text-capitalize">24</th>
                            <th class="col-1 text-capitalize">25</th>
                            <th class="col-1 text-capitalize">26</th>
                            <th class="col-1 text-capitalize">27</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_21 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_21;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_22 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_22;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_23 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_23;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_24 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_24;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_25 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_25;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_26 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_26;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_27 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_27;
                                        }?>
                          </td>
                          <!--<td>{{ $bulan_penimbangan_21 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_22 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_23 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_24 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_25 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_26 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_27 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_21 }}</td>
                          <td>{{ $bb_22 }}</td>
                          <td>{{ $bb_23 }}</td>
                          <td>{{ $bb_24 }}</td>
                          <td>{{ $bb_25 }}</td>
                          <td>{{ $bb_26 }}</td>
                          <td>{{ $bb_27 }}</td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="7">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_21 }}</td>
                                  <td>{{ $nt_22 }}</td>
                                  <td>{{ $nt_23 }}</td>
                                  <td>{{ $nt_24 }}</td>
                                  <td>{{ $nt_25 }}</td>
                                  <td>{{ $nt_26 }}</td>
                                  <td>{{ $nt_27 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                
                        </tr>
                          <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                            
                                        <td>{{ $status_berat_badan_21 }}</td>
                                        <td>{{ $status_berat_badan_22 }}</td>
                                        <td>{{ $status_berat_badan_23 }}</td>
                                        <td>{{ $status_berat_badan_24 }}</td>
                                        <td>{{ $status_berat_badan_25 }}</td>
                                        <td>{{ $status_berat_badan_26 }}</td>
                                        <td>{{ $status_berat_badan_27 }}</td>
                        </tr>
                  
                    </tbody>
                 
                </table>
            
            </div>
            
            <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">28</th>
                            <th class="col-1 text-capitalize">29</th>
                            <th class="col-1 text-capitalize">30</th>
                            <th class="col-1 text-capitalize">31</th>
                            <th class="col-1 text-capitalize">32</th>
                            <th class="col-1 text-capitalize">33</th>
                            <th class="col-1 text-capitalize">34</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_28 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_28;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_29 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_29;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_30 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_30;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_31 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_31;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_32 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_32;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_33 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_33;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_34 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_34;
                                        }?>
                          </td>
                          <!--<td>{{ $bulan_penimbangan_28 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_29 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_30 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_31 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_32 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_33 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_34 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_28 }}</td>
                          <td>{{ $bb_29 }}</td>
                          <td>{{ $bb_30 }}</td>
                          <td>{{ $bb_31 }}</td>
                          <td>{{ $bb_32 }}</td>
                          <td>{{ $bb_33 }}</td>
                          <td>{{ $bb_34 }}</td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="7">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_28 }}</td>
                                  <td>{{ $nt_29 }}</td>
                                  <td>{{ $nt_30 }}</td>
                                  <td>{{ $nt_31 }}</td>
                                  <td>{{ $nt_32 }}</td>
                                  <td>{{ $nt_33 }}</td>
                                  <td>{{ $nt_34 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                
                        </tr>
                          <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                    <td>{{ $status_berat_badan_28 }}</td>
                                        <td>{{ $status_berat_badan_29 }}</td>
                                        <td>{{ $status_berat_badan_30 }}</td>
                                        <td>{{ $status_berat_badan_31 }}</td>
                                        <td>{{ $status_berat_badan_32 }}</td>
                                        <td>{{ $status_berat_badan_33 }}</td>
                                        <td>{{ $status_berat_badan_34 }}</td>
                          </tr>
                           
                  
                    </tbody>
                 
                </table>
            
            </div>
            
            <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">35</th>
                            <th class="col-1 text-capitalize">36</th>
                            <th class="col-1 text-capitalize">37</th>
                            <th class="col-1 text-capitalize">38</th>
                            <th class="col-1 text-capitalize">39</th>
                            <th class="col-1 text-capitalize">40</th>
                            <th class="col-1 text-capitalize">41</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_35 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_35;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_36 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_36;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_37 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_37;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_38 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_38;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_39 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_39;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_40 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_40;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_41 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_41;
                                        }?>
                          </td>
                          <!--<td>{{ $bulan_penimbangan_35 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_36 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_37 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_38 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_39 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_40 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_41 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_35 }}</td>
                          <td>{{ $bb_36 }}</td>
                          <td>{{ $bb_37 }}</td>
                          <td>{{ $bb_38 }}</td>
                          <td>{{ $bb_39 }}</td>
                          <td>{{ $bb_40 }}</td>
                          <td>{{ $bb_41 }}</td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="7">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_35 }}</td>
                                  <td>{{ $nt_36 }}</td>
                                  <td>{{ $nt_37 }}</td>
                                  <td>{{ $nt_38 }}</td>
                                  <td>{{ $nt_39 }}</td>
                                  <td>{{ $nt_40 }}</td>
                                  <td>{{ $nt_41 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                
                        </tr>
                           <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                    <td>{{ $status_berat_badan_35 }}</td>
                                        <td>{{ $status_berat_badan_36 }}</td>
                                        <td>{{ $status_berat_badan_37 }}</td>
                                        <td>{{ $status_berat_badan_38 }}</td>
                                        <td>{{ $status_berat_badan_39 }}</td>
                                        <td>{{ $status_berat_badan_40 }}</td>
                                        <td>-</td>
                            </tr>
                    </tbody>
                 
                </table>
            
            </div>
            
            <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">42</th>
                            <th class="col-1 text-capitalize">43</th>
                            <th class="col-1 text-capitalize">44</th>
                            <th class="col-1 text-capitalize">45</th>
                            <th class="col-1 text-capitalize">46</th>
                            <th class="col-1 text-capitalize">47</th>
                            <th class="col-1 text-capitalize">48</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_42 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_42;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_43 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_43;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_44 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_44;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_45 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_45;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_46 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_46;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_47 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_47;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_48 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_48;
                                        }?>
                          </td>
                          <!--<td>{{ $bulan_penimbangan_42 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_43 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_44 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_45 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_46 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_47 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_48 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_42 }}</td>
                          <td>{{ $bb_43 }}</td>
                          <td>{{ $bb_44 }}</td>
                          <td>{{ $bb_45 }}</td>
                          <td>{{ $bb_46 }}</td>
                          <td>{{ $bb_47 }}</td>
                          <td>{{ $bb_48 }}</td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="7">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_42 }}</td>
                                  <td>{{ $nt_43 }}</td>
                                  <td>{{ $nt_44 }}</td>
                                  <td>{{ $nt_45 }}</td>
                                  <td>{{ $nt_46 }}</td>
                                  <td>{{ $nt_47 }}</td>
                                  <td>{{ $nt_48 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                  <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                
                        </tr>
                           <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                        
                          </tr>
                        
                        
                  
                    </tbody>
                 
                </table>
            
            </div>
            
             <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">49</th>
                            <th class="col-1 text-capitalize">50</th>
                            <th class="col-1 text-capitalize">51</th>
                            <th class="col-1 text-capitalize">52</th>
                            <th class="col-1 text-capitalize">53</th>
                            <th class="col-1 text-capitalize">54</th>
                            <th class="col-1 text-capitalize">55</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_49 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_49;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_50 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_50;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_51 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_51;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_52 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_52;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_53 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_53;
                                        }?>
                          </td>
                          <td> <?php if($bulan_penimbangan_54 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_54;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_55 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_55;
                                        }?>
                          </td>
                          <!--<td>{{ $bulan_penimbangan_49 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_50 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_51 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_52 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_53 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_54 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_55 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_49 }}</td>
                          <td>{{ $bb_50 }}</td>
                          <td>{{ $bb_51 }}</td>
                          <td>{{ $bb_52 }}</td>
                          <td>{{ $bb_53 }}</td>
                          <td>{{ $bb_54 }}</td>
                          <td>{{ $bb_55 }}</td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="7">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_49 }}</td>
                                  <td>{{ $nt_50 }}</td>
                                  <td>{{ $nt_51 }}</td>
                                  <td>{{ $nt_52 }}</td>
                                  <td>{{ $nt_53 }}</td>
                                  <td>{{ $nt_54 }}</td>
                                  <td>{{ $nt_55 }}</td>
                             
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                
                        </tr>
                  
                    </tbody>
                 
                </table>
            
            </div>
            
             <div class="table-responsive bg-white" >
                <table class="table table-bordered table-hover text-center" id="tabelku" style="page-break-inside: avoid;">
                    <thead class="text-center" style="background-color: #88C273; display: table-header-group;">
  
                        <tr style="background-color: #88C273;">
                            <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                            <th class="col-1 text-capitalize">56</th>
                            <th class="col-1 text-capitalize">57</th>
                            <th class="col-1 text-capitalize">58</th>
                            <th class="col-1 text-capitalize">59</th>
                            <th class="col-1 text-capitalize">60</th>
                        </tr>
                    </thead>
                    <tbody>  
                      <tr>
                        <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                            Bulan Penimbangan
                        </td>
                          <td>
                               <?php if($bulan_penimbangan_56 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_56;
                                        }?>
                              </td>
                          <td> <?php if($bulan_penimbangan_57 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_57;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_58 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_58;
                                        }?></td>
                          <td> <?php if($bulan_penimbangan_59 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_59;
                                        }?></td>
                          <td>
                               <?php if($bulan_penimbangan_60 == '01-01-1970') {
                                        echo "";
                                       } else{
                                            echo $bulan_penimbangan_60;
                                        }?>
                          </td>
                        
                          <!--<td>{{ $bulan_penimbangan_56 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_57 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_58 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_59 }}</td>-->
                          <!--<td>{{ $bulan_penimbangan_60 }}</td>-->
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                              BB (Kg)
                          </td>
                           <td>{{ $bb_56 }}</td>
                          <td>{{ $bb_57 }}</td>
                          <td>{{ $bb_58 }}</td>
                          <td>{{ $bb_59 }}</td>
                          <td>{{ $bb_60 }}</td>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                KBM (Gr)
                            </td>
                            <th class="col-1" colspan="7">200</th>
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                               N/T
                              </td>
                               <td>{{ $nt_56 }}</td>
                                  <td>{{ $nt_57 }}</td>
                                  <td>{{ $nt_58 }}</td>
                                  <td>{{ $nt_59 }}</td>
                                  <td>{{ $nt_60 }}</td>
                              </tr>
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                 ASI Eksklusif
                                </td>
                                <td colspan="7"></td>
                                
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
                  {{-- <button type="button" onclick="window.location='{{ url('datakms') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button> --}}
                </form>
                </div>

               
              </div>
               
               
            </div>
         

          </div>
          <script
          src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.js">
          </script>
          <script>
                const ctx = document.getElementById("chart").getContext('2d');
                const myChart = new Chart(ctx, {
                  type: 'line',
                  data: {
                    labels: ["0", "1", "2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                             "13", "14", "15","16", "17", "18", "19", "20", "21", "22", "23", "24"
                    ],
                    datasets: [{
                      label: 'BB',
                      backgroundColor: 'transparent',
                      borderColor: 'rgb(47, 128, 237)',
                      data: [{{ $bb_0 }}, {{ $bb_1 }}, {{ $bb_2 }}, {{ $bb_3 }}, {{ $bb_4 }}, {{ $bb_5 }}, {{ $bb_6 }},
                             {{ $bb_7 }}, {{ $bb_8 }}, {{ $bb_9 }}, {{ $bb_10 }}, {{ $bb_11 }}, {{ $bb_12 }}, {{ $bb_13 }},
                             {{ $bb_14 }}, {{ $bb_15 }}, {{ $bb_16 }}, {{ $bb_17 }}, {{ $bb_18 }}, {{ $bb_19 }}, {{ $bb_20 }},
                             {{ $bb_21 }}, {{ $bb_22 }}, {{ $bb_23 }}, {{ $bb_24 }}
                      ],
                    }]
                  },
                  options: {
                    title: {
                        display: true,
                        text: 'Grafik Data KMS Umur 0 - 24 Bulan',
                        position: 'top',
                        fontSize: 20,
                    },
                    scales: {
                      yAxes: [{
                        ticks: {
                          beginAtZero: true,
                        },
                        
                      scaleLabel:{
                        display: true,
                        labelString: 'Berat Badan (Kg)'
                      }
                      }
                    ],
                    xAxes: [{
                      scaleLabel:{
                        display: true,
                        labelString: 'Umur (Bulan)'
                      }
                      }
                    ],
                    }
                  },
                });

            const ctx2 = document.getElementById("chart2").getContext('2d');
            const myChart2 = new Chart(ctx2, {
              type: 'line',
              data: {
                labels: ["24", "25", "26","27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
                         "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
                         "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"

                ],
                datasets: [{
                  label: 'BB',
                  backgroundColor: 'transparent',
                  borderColor: 'rgb(47, 128, 237)',
                  data: [{{ $bb_24 }}, {{ $bb_25 }}, {{ $bb_26 }}, {{ $bb_27 }}, {{ $bb_28 }}, {{ $bb_29 }}, {{ $bb_30 }},
                         {{ $bb_31 }}, {{ $bb_32 }}, {{ $bb_33 }}, {{ $bb_34 }}, {{ $bb_35 }}, {{ $bb_36 }}, {{ $bb_37 }},
                         {{ $bb_38 }}, {{ $bb_39 }}, {{ $bb_40 }}, {{ $bb_41 }}, {{ $bb_42 }}, {{ $bb_43 }}, {{ $bb_44 }},
                         {{ $bb_45 }}, {{ $bb_46 }}, {{ $bb_47 }}, {{ $bb_48 }}, {{ $bb_49 }}, {{ $bb_50 }}, {{ $bb_51 }}, 
                         {{ $bb_52 }}, {{ $bb_53 }}, {{ $bb_54 }}, {{ $bb_55 }}, {{ $bb_56 }}, {{ $bb_57 }}, {{ $bb_58 }}, {{ $bb_59 }}, {{ $bb_60 }},  
                  ],
                }]
              },
              options: {
                title: {
                    display: true,
                    text: 'Grafik Data KMS Umur 24 - 60 Bulan',
                    position: 'top',
                    fontSize: 20,
                },
                scales: {
                  yAxes: [{
                    ticks: {
                      beginAtZero: false,
                      min: 8
                    },
                    
                  scaleLabel:{
                    display: true,
                    labelString: 'Berat Badan (Kg)'
                  }
                  }
                ],
                xAxes: [{
                  scaleLabel:{
                    display: true,
                    labelString: 'Umur (Bulan)'
                  }
                  }
                ],
                }
              },
            });
          </script>
         

                      
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
