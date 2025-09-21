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
 

    <h2 style="text-align: center; color:black;">Data Orang Tua & Anak</h2>
    <button class="btn btn-primary d-print-none" style="margin-left: 150px;" onclick="window.print()" title="cetak"><i><img
      src="{{ asset('templatedwi/img/iconprint.png') }}"
      alt="Img Profile"
      width="30"
      height="30"
    /></i></button>
      <div class="main-panel" style="margin-right: 70px;" >

        <div class="container" style="margin-top: -10px;">
          <div class="row">
            <div class="col-md-12 mx-auto p-3">
                <div class="" style="background-color: white;">
                  <div class="col-12 mt-4">
                    <h4 class="text-center text-decoration-underline">Data Ibu</h4>
                </div>
                
                @php
                    setlocale(LC_ALL, 'id_ID.UTF-8');
                @endphp
    <table cellpadding="10">
 
  <tbody>
    <tr>
      <th scope="row">Nama</th>
      <td>:</td>
      <td>{{ $nama_ibu }}</td>
    </tr>
    <tr>
      <th scope="row">NIK</th>
      <td>:</td>
      <td>{{ $nik }}</td>
    </tr>
    <tr>
      <th scope="row">Tempat/Tanggal Lahir</th>
      <td>:</td>
      <td>{{ $tempat_lahir_ibu }}/{{ strftime('%d %B %Y', strtotime($tanggal_lahir_ibu)) }}</td>
    </tr>
     <tr>
      <th scope="row">Agama</th>
      <td>:</td>
      <td>{{ $agama_ibu }}</td>
    </tr>
    <tr>
      <th scope="row">Pendidikan</th>
      <td>:</td>
      <td>{{ $pendidikan_ibu }}</td>
    </tr>
    <tr>
      <th scope="row">Golongan Darah</th>
      <td>:</td>
      <td>{{ $golongan_darah_ibu }}</td>
    </tr>
    <tr>
      <th scope="row">Pekerjaan</th>
      <td>:</td>
      <td>{{ $pekerjaan_ibu }}</td>
    </tr>
    <tr>
      <th scope="row">No. JKN/BPJS</th>
      <td>:</td>
      <td>{{ $no_jkn_bpjs }}</td>
    </tr>
  </tbody>
</table>

 <div class="col-12 mt-2">
                    <h4 class="text-center text-decoration-underline">Data Suami</h4>
                </div>
    <table cellpadding="10">
 
  <tbody>
    <tr>
      <th scope="row">Nama</th>
      <td>:</td>
      <td>{{ $nama_ayah }}</td>
    </tr>
    <tr>
      <th scope="row">Tempat/Tanggal Lahir</th>
      <td>:</td>
      <td>{{ $tempat_lahir_ayah }}/{{ strftime('%d %B %Y', strtotime($tanggal_lahir_ayah)) }}</td>
    </tr>
     <tr>
      <th scope="row">Agama</th>
      <td>:</td>
      <td>{{ $agama_ayah }}</td>
    </tr>
    <tr>
      <th scope="row">Pendidikan</th>
      <td>:</td>
      <td>{{ $pendidikan_ayah }}</td>
    </tr>
    <tr>
      <th scope="row">Golongan Darah</th>
      <td>:</td>
      <td>{{ $golongan_darah_ayah }}</td>
    </tr>
    <tr>
      <th scope="row">Pekerjaan</th>
      <td>:</td>
      <td>{{ $pekerjaan_ayah }}</td>
    </tr>
  </tbody>
</table>

 <div class="col-12 mt-2">
                    <h4 class="text-center text-decoration-underline">Data Lain Orang Tua</h4>
                </div>
    <table cellpadding="10">
 
  <tbody>
    <tr>
      <th scope="row">Alamat Rumah</th>
      <td>:</td>
      <td>{{ $alamat_rumah }}</td>
    </tr>
    <tr>
      <th scope="row">Kecamatan</th>
      <td>:</td>
      <td>{{ $kecamatan }}</td>
    </tr>
     <tr>
      <th scope="row">Kabupaten/Kota</th>
      <td>:</td>
      <td>{{ $kabupaten_atau_kota }}</td>
    </tr>
    <tr>
      <th scope="row">No. Telp Yang Bisa Di Hubungi</th>
      <td>:</td>
      <td>{{ $no_telepon }}</td>
    </tr>
  </tbody>
</table>
  
      
            @php $nomor = 1; @endphp
            @foreach($dataanak as $data)
            <div class="col-12 mt-2">
                    <h4 class="text-center text-decoration-underline">Data Anak Ke- {{ $nomor }}</h4>
                </div>
                 <table cellpadding="10">
                  <tbody>
                    <tr>
                      <th scope="row">Nama</th>
                      <td>:</td>
                      <td>{{ $data->nama }}</td>
                    </tr>
                    <tr>
                      <th scope="row">Jenis Kelamin</th>
                      <td>:</td>
                      <td>{{ $data->jenis_kelamin }}</td>
                    </tr>
                     <tr>
                      <th scope="row">Tempat/Tanggal Lahir</th>
                      <td>:</td>
                      <td>{{ $data->tempat_lahir_anak }}/{{ strftime('%d %B %Y', strtotime($data->tanggal_lahir_anak)) }}</td>
                    </tr>
                    <tr>
                      <th scope="row">Anak Ke-</th>
                      <td>:</td>
                      <td>{{ $data->anak_ke }}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dari&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{ $data->dari }}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Anak</td>
                    </tr>
                    <tr>
                      <th scope="row">No. Akte Kelahiran</th>
                      <td>:</td>
                      <td>{{ $data->no_akta_kelahiran }}</td>
                    </tr>
                     <tr>
                      <th scope="row">No.JKN/BPJS</th>
                      <td>:</td>
                      <td>{{ $data->no_jkn_bpjs }}</td>
                    </tr>
                  </tbody>
                </table>
            <div class="col-md-12 mx-auto p-5" style="margin-top: -60px;">
                
            </div>
            @php $nomor++; @endphp
            
            @endforeach
   
  
    
    
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
