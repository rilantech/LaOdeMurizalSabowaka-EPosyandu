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

    <h2 style="text-align: center; color:black;">Data Kesehatan Ibu Hamil</h2>
    <button class="btn btn-primary d-print-none" style="margin-left: 150px;" onclick="window.print()" title="cetak"><i><img
      src="{{ asset('templatedwi/img/iconprint.png') }}"
      alt="Img Profile"
      width="30"
      height="30"
    /></i></button>

      <div class="main-panel" style="margin-right: 80px;" >
        <div class="container" style="margin-top: 0px;">
    @foreach($data4 as $item)

   <table cellpadding="10">
  <tbody>
    <tr>
      <th scope="row">Kehamilan Ke-</th>
      <td>:</td>
      <td >{{ $item->kehamilan_ke }}</td>
    </tr>
    <tr>
      <th scope="row">NIK</th>
      <td>:</td>
      <td>{{ $item->nik_ibu }}</td>
    </tr>
     <tr>
      <th scope="row">Nama Ibu</th>
      <td>:</td>
      <td>{{ $nama_ibu }}</td>
    </tr>
    <tr>
      <th scope="row">Tempat/Tanggal Lahir</th>
      <td>:</td>
      <td>{{ $tempat_atau_tanggal_lahir }}</td>
    </tr>
     <tr>
      <th scope="row">Penggunaan Kontrasepsi Sebelum Hamil</th>
      <td>:</td>
      <td>{{ $item->penggunaan_kontrasepsi_sebelum_hamil }}</td>
    </tr>
    <tr>
      <th scope="row">Hari Pertama Haid Terakhir (HPTP)</th>
      <td>:</td>
      <td>{{ $item->hari_pertama_haid_terakhir }}</td>
    </tr>
    <tr>
      <th scope="row">Hari Taksiran Persalinan (HTP)</th>
      <td>:</td>
      <td>{{ $item->hari_taksiran_persalinan }}</td>
    </tr>
     <tr>
      <th scope="row">Golongan Darah</th>
      <td>:</td>
      <td>{{ $item->golongan_darah }}</td>
    </tr>
    <tr>
      <th scope="row">Tinggi Badan</th>
      <td>:</td>
      <td>{{ $item->tinggi_badan }} cm</td>
    </tr>
    <tr>
      <th scope="row">Riwayat Penyakit Yang Di Derita Ibu</th>
      <td>:</td>
      <td>{{ $item->riwayat_penyakit_yg_di_derita_ibu }}</td>
    </tr>
    <tr>
      <th scope="row">Riwayat Alergi</th>
      <td>:</td>
      <td>{{ $item->riwayat_alergi }}</td>
    </tr>
     <tr>
      <th scope="row">Status Imunisasi Tetanus (T) Terakhir</th>
      <td>:</td>
      <td>{{ $item->status_imunisasi_tetanus_terakhir }}</td>
    </tr>
   
  </tbody>
</table>

    @endforeach
  
                <div class="row" style="margin-left: 800px; margin-top:20px; margin-bottom:50px;">
                  {{-- <div class="col-6">
                    <button type="button" id="tambahbaris" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color: #EE66A6;">Tambah</button>
                  </div> --}}
                
                </div>
                <batascopy>
                <div class="table bg-white" style="margin-top: -40px;">
                  <table class="table table-bordered table-hover text-center" id="tabelku">
                      <thead class="text-center">
                          <tr style="background-color: #4DA8DA;">
                              <th class="col-1 text-capitalize">Nama Pemeriksa, Tempat Pelayanan</th>
                              <th class="col-1 text-capitalize">Tanggal</th>
                              <th class="col-1 text-capitalize">Keluhan</th>
                              <th class="col-1 text-capitalize">U.K (mg)</th>
                              <th class="col-1 text-capitalize">BB (kg)</th>
                              <th class="col-1 text-capitalize">TD (mm/Hg)</th>
                              <th class="col-1 text-capitalize">LILA (cm)</th>
                              <th class="col-1 text-capitalize">Tinggi Fundus</th>
                              <th class="col-1 text-capitalize">Letak Janin</th>
                              <th class="col-1 text-capitalize">Imunisasi</th>
                              <th class="col-1 text-capitalize">Tablet Tambah Darah</th>
                              <th class="col-1 text-capitalize">Lab</th>
                              <th class="col-1 text-capitalize">Analisa</th>
                              <th class="col-1 text-capitalize">Tata Laksana</th>
                              <th class="col-1 text-capitalize">Konseling</th>
                              <th class="col-1 text-capitalize">Catatan Tambahan</th>
                              {{-- <th class="col-1 text-capitalize">Aksi</th> --}}
                          </tr>
                      </thead>
                      <tbody  style="background-color: white;">  
                        @foreach ($data3 as $item)
                        <tr>
                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"
                        placeholder="Tahun.." name="nik_ibuku[]" value="{{ $item->nik_ibu }}"    autocomplete="off" hidden>     
                        
                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"
                        placeholder="Tahun.." name="id1[]" value="{{ $item->id }}"    autocomplete="off" hidden>

                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"
                        placeholder="Tahun.." name="kehamilan_ke1[]" value="{{ $item->kehamilan_ke }}"    autocomplete="off" hidden>

                               <td class="col-1">
                                    {{ $item->nama_pemeriksa_dan_tempat_pelayanan }}
                               </td>
                               <td class="col-1">
                                    {{ $item->tanggal }}
                               </td>
                               <td class="col-1">
                                    {{ $item->keluhan }}
                               </td>
                                <td class="col-1">
                                    {{ $item->uk }}
                               </td>
                               <td class="col-1">
                                    {{ $item->bb }}
                               </td>
                                <td class="col-1">
                                    {{ $item->td }}
                               </td>
                                <td class="col-1">
                                    {{ $item->lila }}
                               </td>
                                <td class="col-1">
                                    {{ $item->tinggi_fundus }}
                               </td>
                               <td class="col-1">
                                    {{ $item->letak_janin }}
                               </td>
                               
                                <td class="col-1">
                                    {{ $item->imunisasi }}
                               </td>
                               
                               <td class="col-1">
                                    {{ $item->tablet_tambah_darah }}
                               </td>
                               
                                <td class="col-1">
                                    {{ $item->lab }}
                               </td>
                               
                               <td class="col-1">
                                    {{ $item->analisa }}
                               </td>
                               
                               <td class="col-1">
                                    {{ $item->tata_laksana }}
                               </td>
                               
                               <td class="col-1">
                                    {{ $item->konseling }}
                               </td>
                           
                               <td class="col-1">
                                    {{ $item->catatan_tambahan }}
                               </td>
                           
                              {{-- <th class="col-3">
                                <div class="row">
                                  <div class="col-4 text-center">
                                  {{-- <form onsubmit="return deleteData('{{ $item->tanggal }}')" action="{{ url('kesehatanibuhamil/'.$item->id) }}" method="POST"> 
                                   @csrf
                                   @method('DELETE')
                                   <input type="text"
                                   placeholder="Tahun.." name="nik_ibuku4[]" value="{{ $item->nik_ibu }}"    autocomplete="off" hidden>     
                                   
                                   <input type="text" 
                                    placeholder="Lab..." name="kehamilan_ke4[]" value="{{ $item->kehamilan_ke }}"    autocomplete="off" hidden>
                                    <input type="text" id="lab"
                                      placeholder="Lab..." name="id4" value="{{ $id }}"    autocomplete="off" hidden>
                                      <button type="submit" title="Hapus" class="btn btn-danger btn-md">
                                        <i class="fa fa-trash-alt">Hapus</i>
                                      </button> --}}
                                 {{-- </form> --}}
                                {{-- </div>
                                </div>
                              </th>  --}}
                               
                        </tr>
                        @endforeach
                  </tbody>
                   
                  </table>
                  
                    
                  </div>
              
       

      <div class="card-body text-center" style="margin-top: 20px;">
        <div class="row" style="background-color: skyblue;" >
          <div class="col-1">
          
          <script>
            $('#tambahbaris').click( function() {      
              var tableID = "tabelku";
              var table = document.getElementById(tableID);
              var rowCount = table.rows.length;
              var row = table.insertRow(rowCount);
              
              var element1 = 
              '<tr>'+
                '@foreach($data4 as $row)'+
                '<input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"'+
                'placeholder="Tahun.." name="kehamilan_ke2[]" value="{{ $row->kehamilan_ke }}"    autocomplete="off" hidden>'+                
                '@endforeach'+
                '<input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror"'+
                'placeholder="Tahun.." name="nik_ibuku2[]" value="{{ $nik }}"    autocomplete="off" hidden>'+                
                      ' <th class="col-1"><input type="text" class="form-control  @error('nama_pemeriksa') is-invalid @enderror" id="tahun"'+
                         ' placeholder="Nama Pemeriksa.." name="nama_pemeriksa2[]" value="{{ old('nama_pemeriksa2[]') }}"    autocomplete="off">'+
        
                          '@error('nama_pemeriksa')'+
                          '<div class="invalid-feedback">'+
                            '{{ $message }}'+
                         ' </div>'+
                      '@enderror</th>'+
                   
                   '     <th class="col-1"><input type="text" class="form-control  @error('tanggal') is-invalid @enderror" id="berat_lahir"'+
                   '       placeholder="Tanggal..." name="tanggal2[]" value="{{ old('tanggal2[]') }}"    autocomplete="off">'+
                   '       @error('tanggal')'+
                   '       <div class="invalid-feedback">'+
                   '         {{ $message }}'+
                   '       </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('keluhan') is-invalid @enderror" id="keluhan"'+
                    '      placeholder="Tempat Bersalin..." name="keluhan2[]" value="{{ old('keluhan2[]') }}"    autocomplete="off">'+
                    '      @error('keluhan')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                  '      <th class="col-1"><input type="text" class="form-control  @error('uk') is-invalid @enderror" id="uk"'+
                  '        placeholder="U.K..." name="uk2[]" value="{{ old('uk2[]') }}"    autocomplete="off">'+
                  '        @error('uk')'+
                  '        <div class="invalid-feedback">'+
                  '          {{ $message }}'+
                  '        </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('bb') is-invalid @enderror" id="bb"'+
                    '      placeholder="BB..." name="bb2[]" value="{{ old('bb2[]') }}"    autocomplete="off">'+
                    '      @error('bb')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('td') is-invalid @enderror" id="td"'+
                    '      placeholder="TD..." name="td2[]" value="{{ old('td2[]') }}"    autocomplete="off">'+
                    '      @error('td')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('lila') is-invalid @enderror" id="lila"'+
                    '      placeholder="LILA..." name="lila2[]" value="{{ old('lila2[]') }}"    autocomplete="off">'+
                    '      @error('lila')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('tinggi_fundus') is-invalid @enderror" id="tinggi_fundus"'+
                    '      placeholder="Tinggi Fundus..." name="tinggi_fundus2[]" value="{{ old('tinggi_fundus2[]') }}"    autocomplete="off">'+
                    '      @error('tinggi_fundus')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('letak_janin') is-invalid @enderror" id="letak_janin"'+
                    '      placeholder="Letak Janin..." name="letak_janin2[]" value="{{ old('letak_janin2[]') }}"    autocomplete="off">'+
                    '      @error('letak_janin')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('imunisasi') is-invalid @enderror" id="imunisasi"'+
                    '      placeholder="Imunisasi..." name="imunisasi2[]" value="{{ old('imunisasi2[]') }}"    autocomplete="off">'+
                    '      @error('imunisasi')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('tablet_tambah_darah') is-invalid @enderror" id="tablet_tambah_darah"'+
                    '      placeholder="Tablet Tambah Darah..." name="tablet_tambah_darah2[]" value="{{ old('tablet_tambah_darah2[]') }}"    autocomplete="off">'+
                    '      @error('tablet_tambah_darah')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('lab') is-invalid @enderror" id="lab"'+
                    '      placeholder="Lab..." name="lab2[]" value="{{ old('lab2[]') }}"    autocomplete="off">'+
                    '      @error('lab')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('analisa') is-invalid @enderror" id="analisa"'+
                    '      placeholder="Analisa..." name="analisa2[]" value="{{ old('analisa2[]') }}"    autocomplete="off">'+
                    '      @error('analisa')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('tata_laksana') is-invalid @enderror" id="tata_laksana"'+
                    '      placeholder="Tata Laksana..." name="tata_laksana2[]" value="{{ old('tata_laksana2[]') }}"    autocomplete="off">'+
                    '      @error('tata_laksana')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('konseling') is-invalid @enderror" id="konseling"'+
                    '      placeholder="Konseling..." name="konseling2[]" value="{{ old('konseling2[]') }}"    autocomplete="off">'+
                    '      @error('konseling')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                    '    <th class="col-1"><input type="text" class="form-control  @error('catatan_tambahan') is-invalid @enderror" id="catatan_tambahan"'+
                    '      placeholder="Catatan Tambahan..." name="catatan_tambahan2[]" value="{{ old('catatan_tambahan2[]') }}"    autocomplete="off">'+
                    '      @error('catatan_tambahan')'+
                    '      <div class="invalid-feedback">'+
                    '        {{ $message }}'+
                    '      </div>'+
                    '  @enderror</th>'+
                         ' <td>  <div class="row">'+
                           ' </div>'+
                      
                        '  </td>'+
                      '</tr>';
            row.innerHTML = element1; 
           });

           
           </script> 
          {{-- <button type="submit" value="simpan" name="btnSimpan" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button> --}}
        </form>
          </div>
          {{-- <div class="col-1" style="margin-left: 30px;">
            <button type="button" onclick="window.location='{{ url('kesehatanibuhamil') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
          </div>
          <div class="col-1" style="margin-left: 130px;">
            <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFB0B0;">Edit</button>
        
          </div>
          <div class="col-1" style="margin-left: 80px;">
            <button  onclick="window.location='{{ url('cetakdataorangtuadananak/'.$row->id) }}'" type="button"  class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFE700;">Eksport</button>
        
          </div>
          <div class="col-4" style="margin-left: 30px;">
            <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px; background-color: #EE66A6;">Menyambut Persalinan</button>
          
          </div> --}}
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
