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

    <h2 style="text-align: center; color:black;">Data Obstetri</h2>
    <button class="btn btn-primary d-print-none" style="margin-left: 150px;" onclick="window.print()" title="cetak"><i><img
      src="{{ asset('templatedwi/img/iconprint.png') }}"
      alt="Img Profile"
      width="30"
      height="30"
    /></i></button>

      <div class="main-panel" style="margin-right: 80px;" >
        <div class="container" style="margin-top: -10px;">
         
          <div class="row">
            <div class="col-md-12 mx-auto mt-2 p-5">
                  
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
                              <th scope="row">Tempat/Tanggal Lahir</th>
                              <td>:</td>
                              <td >{{ $tempat_atau_tanggal_lahir }}</td>
                            </tr>
                          </tbody>
                        </table>
               
               
                <!--        <div class="row ">-->
                <!--          <div class="col-6 ">-->
                          
                <!--            <div class="form-group fw-bold">-->
                <!--              <label for="tempat_atau_tanggal_lahir" class="col-12">NIK</label>-->
                              
                <!--              <select class="form-select @error('nik') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">-->
                              
                <!--                <option selected>{{ $nik }}</option>-->
                <!--                @if($dataorangtua != null)-->
                <!--                @foreach ($dataorangtua as $item)-->
                <!--                <option value="{{ $item->nik }}">{{ $item->nik }}</option>-->
                <!--                @endforeach-->
                <!--                {{-- @else-->
                <!--                <option selected>--Pilih NIK--</option>-->
                <!--                @endif-->
                <!--                @if($dataorangtua1 != null)-->
                <!--                @foreach ($dataorangtua1 as $item1)-->
                <!--                <option value="test" {{ old('nik') }} selected>{{ $item1->nik }}</option>-->
                <!--                @endforeach --}}-->
                <!--                @endif-->

                               
                <!--                </select>-->
                                
                             
                <!--                @error('nik')-->
                <!--                <div class="invalid-feedback">-->
                <!--                  {{ $message }}-->
                <!--                </div>-->
                <!--            @enderror-->
                            
                <!--             </div>-->
                <!--          </div>-->
                <!--        </div>-->
                <!--          <div class="row">-->
                <!--            <div class="col-6">-->
                <!--              <div class="form-group">-->
                <!--                <label for="nama_ibu" class="col-12">Nama</label>-->
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
                <!--                <label for="tempat_atau_tanggal_lahir" class="col-12">Tempat/Tanggal Lahir</label>-->
                
                <!--                <input type="text" class="form-control  @error('tempat_atau_tanggal_lahir') is-invalid @enderror" id="tempat_atau_tanggal_lahir"-->
                <!--                        placeholder="Masukan Nama Ibu..." name="tempat_atau_tanggal_lahir" value="{{ $tempat_atau_tanggal_lahir }}"  autofocus autocomplete="off">-->
                               
                <!--                        @error('tempat_atau_tanggal_lahir')-->
                <!--                        <div class="invalid-feedback">-->
                <!--                          {{ $message }}-->
                <!--                        </div>-->
                <!--                    @enderror-->
                                  
                <!--               </div>-->
                <!--            </div>-->
                             
                <!--          </div>-->
                <!--          <div class="row" style="margin-left: 800px;">-->
                <!--            {{-- <div class="col-6">-->
                <!--              <button type="button" id="tambahbaris" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color: #EE66A6;">Tambah</button>-->
                <!--            </div>-->
                <!--           --}}-->
                <!--          </div>-->
                          
                         
                     
                <!--</div>-->
            </div>
            

          </div>
          <form action="{{ url('dataobstetri/'.$id) }}" method='post'>
            @csrf
            @method('PUT')
          <div class="row p-5" style="margin-bottom: 50px; margin-top:-50px;">
            <div class="col-12">
              <div class="table bg-white">
                <table class="table table-bordered table-hover text-center" id="tabelku">
                    <thead class="text-center" style="background-color:  #4DA8DA;">
                        <tr>
                          <th class="col-1 text-capitalize">Kehamilan Ke-</th>
                            <th class="col-1 text-capitalize">Tahun</th>
                            <th class="col-1 text-capitalize">Lahir Hidup/Mati/Abortus</th>
                            <th class="col-1 text-capitalize">Lahir Aterm/Mati/Preterm/Post Term</th>
                            <th class="col-1 text-capitalize">Lahir Spontan/SC/Lainnya</th>
                            <th class="col-1 text-capitalize">Berat Lahir (g)/Panjang Lahir (cm)</th>
                            <th class="col-1 text-capitalize">Tempat Bersalin, Tenakes</th>
                            <th class="col-1 text-capitalize">Kondisi Anak Saat Ini</th>
                            <th class="col-1 text-capitalize">Komplikasi Kehamilan/Persalinan</th>
                        </tr>
                    </thead>
                    <tbody>  
                      @foreach ($data2 as $row)
                      <input type="text" class="form-control" id="nik"
                  placeholder="Tahun.." name="nik_ibu[]" value="{{ $row->nik_ibu }}" autofocus autocomplete="off" hidden>
                    <tr>
                      <input type="text" class="form-control" id="nik"
                      placeholder="Tahun.." name="id[]" value="{{ $row->id }}"  autofocus autocomplete="off" hidden>
                          <td class="col-1">{{ $row->kehamilan_ke }}</td>
                          <td class="col-1">{{ $row->tahun }}</td>
                          <td class="col-1">{{ $row->lahir_hidup }}</td>
                          <td class="col-1">{{ $row->lahir_aterm }}</td>
                          <td class="col-1">{{ $row->lahir_spontan }}</td>
                          <td class="col-1">{{ $row->berat_lahir_atau_panjang_lahir }}</td>
                          <td class="col-1">{{ $row->tempat_bersalin_dan_tenakes }}</td>
                          <td class="col-1">{{ $row->kondisi_anak_saat_ini }}</td>
                          <td class="col-1">{{ $row->komplikasi_kehamilan_atau_persalinan }}</td>
                            {{-- <td>  <div class="row">
                                
                                <div class="col-3 text-center">
                                 {{-- <form onsubmit="return deleteData('')" action="{{ url('dataorangtuadananak') }}" method="POST"> 
                                  @csrf
                                  @method('DELETE')
                                     <button type="submit" title="Hapus" class="btn btn-danger btn-md">
                                      <i class="fa fa-trash-alt"></i>
                                     </button>
                                </form> --}}
                              </div>
                              
                    
                            {{-- </td> --}} 
                           
                        </tr>
                    @endforeach
                  
                    </tbody>
                 
                </table>
            
            </div>
            
            <div class="card-body text-center" style="margin-top: 20px;">
              <div class="row" style="">
                <div class="col-1">
                  {{-- <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Edit</button> --}}
                 
                <script>

                  $('#tambahbaris').click( function() {      
                    var tableID = "tabelku";
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;
                    var row = table.insertRow(rowCount);
                    
                    var element1 = 
                    '<tr>'+'<input type="text" class="form-control" id="nik"'+
                  'placeholder="Tahun.." name="nik_ibu2[]" value="{{ $nik }}" autofocus autocomplete="off" hidden>'+
                    
                                '<th class="col-1"> <select class="form-select @error('kehamilan_ke') is-invalid @enderror"  aria-label="Default select example" name="kehamilan_ke2[]" id="kehamilan_ke">'+
                                  '<option selected>--Pilih--</option>'+
                                  '<option value= "1" {{ old('kehamilan_ke2[]') }}>1</option>'+
                                  '<option value= "2" {{ old('kehamilan_ke2[]') }}>2</option>'+
                                  '<option value= "3" {{ old('kehamilan_ke2[]') }}>3</option>'+
                                  '<option value= "4" {{ old('kehamilan_ke2[]') }}>4</option>'+
                                  '<option value= "5" {{ old('kehamilan_ke2[]') }}>5</option>'+
                                  '<option value= "6" {{ old('kehamilan_ke2[]') }}>6</option>'+
                                  '</select>'+
                                  '@error('kehamilan_ke')'+
                                  '<div class="invalid-feedback">'+
                                    '{{ $message }}'+
                                  '</div>'+
                            '  @enderror</th>'+
                              '  <th class="col-1"><input type="text" class="form-control  @error('tahun') is-invalid @enderror" id="tahun"'+
                                 ' placeholder="Tahun.." name="tahun2[]" value="{{ old('tahun2[]') }}"  autofocus autocomplete="off">'+
                                  
                                  '@error('tahun')'+
                                  '<div class="invalid-feedback">'+
                                    '{{ $message }}'+
                                 ' </div>'+
                              '@enderror</th>'+
                            '  <th class="col-1"><select class="form-select @error('status_lahir_hidup') is-invalid @enderror" '+
                            '     aria-label="Default select example" name="status_lahir_hidup2[]" id="status_lahir_hidup">'+
                            '      <option selected>--Pilih--</option>'+
                            '      <option value= "Hidup" {{ old('status_lahir_hidup2[]') }}>Hidup</option>'+
                            '      <option value= "Mati" {{ old('status_lahir_hidup2[]') }}>Mati</option>'+
                            '      <option value= "Abortus" {{ old('status_lahir_hidup2[]') }}>Abortus</option>'+
                            '      </select>'+
                            '      @error('status_lahir_hidup')'+
                            '      <div class="invalid-feedback">'+
                            '        {{ $message }}'+
                            '      </div>'+
                            '  @enderror</th>'+
                            '  <th class="col-1">'+
                                 '<select class="form-select @error('status_lahir_aterm') is-invalid @enderror"  aria-label="Default select example" name="status_lahir_aterm2[]" id="status_lahir_aterm">'+
                                  '<option selected>--Pilih--</option>'+
                                '  <option value= "Aterm" {{ old('status_lahir_aterm2[]') }}>Aterm</option>'+
                                 ' <option value= "Mati" {{ old('status_lahir_aterm2[]') }}>Mati</option>'+
                                 ' <option value= "Preterm" {{ old('status_lahir_aterm2[]') }}>Preterm</option>'+
                                 ' <option value= "Post Term" {{ old('status_lahir_aterm2[]') }}>Post Term</option>'+
                                '  </select>'+
                     '             @error('status_lahir_aterm')'+
                     '             <div class="invalid-feedback">'+
                     '               {{ $message }}'+
                     '             </div>'+
                     '         @enderror'+
                     '           </th>'+
                     '           <th class="col-1"> <select class="form-select @error('status_lahir_spontan') is-invalid @enderror" '+
                     '              aria-label="Default select example" name="status_lahir_spontan2[]" id="status_lahir_spontan">'+
                     '             <option selected>--Pilih--</option>'+
                     '             <option value= "Spontan" {{ old('status_lahir_spontan2[]') }}>Spontan</option>'+
                     '             <option value= "SC" {{ old('status_lahir_spontan2[]') }}>SC</option>'+
                     '             <option value= "Lainnya" {{ old('status_lahir_spontan2[]') }}>Lainnya</option>'+
                     '             </select>'+
                     '             @error('status_lahir_spontan')'+
                     '             <div class="invalid-feedback">'+
                     '               {{ $message }}'+
                     '             </div>'+
                     '         @enderror</th>'+
                           '     <th class="col-1"><input type="text" class="form-control  @error('berat_lahir') is-invalid @enderror" id="berat_lahir"'+
                           '       placeholder="Berat Lahir..." name="berat_lahir2[]" value="{{ old('berat_lahir2[]') }}"  autofocus autocomplete="off">'+
                           '       @error('berat_lahir')'+
                           '       <div class="invalid-feedback">'+
                           '         {{ $message }}'+
                           '       </div>'+
                            '  @enderror</th>'+
                            '    <th class="col-1"><input type="text" class="form-control  @error('tempat_bersalin') is-invalid @enderror" id="tempat_bersalin"'+
                            '      placeholder="Tempat Bersalin..." name="tempat_bersalin2[]" value="{{ old('tempat_bersalin2[]') }}"  autofocus autocomplete="off">'+
                            '      @error('tempat_bersalin')'+
                            '      <div class="invalid-feedback">'+
                            '        {{ $message }}'+
                            '      </div>'+
                            '  @enderror</th>'+
                          '      <th class="col-1"><input type="text" class="form-control  @error('kondisi_anak') is-invalid @enderror" id="kondisi_anak"'+
                          '        placeholder="Kondisi Anak..." name="kondisi_anak2[]" value="{{ old('kondisi_anak2[]') }}"  autofocus autocomplete="off">'+
                          '        @error('kondisi_anak')'+
                          '        <div class="invalid-feedback">'+
                          '          {{ $message }}'+
                          '        </div>'+
                            '  @enderror</th>'+
                            '    <th class="col-1"><input type="text" class="form-control  @error('komplikasi_kehamilan') is-invalid @enderror" id="komplikasi_kehamilan"'+
                            '      placeholder="Komplikasi Kehamilan..." name="komplikasi_kehamilan2[]" value="{{ old('komplikasi_kehamilan2[]') }}"  autofocus autocomplete="off">'+
                            '      @error('komplikasi_kehamilan')'+
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
           

                </div>
                {{-- <div class="col-1" style="margin-left: 30px;">
                  <button type="button" onclick="window.location='{{ url('dataobstetri') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                </div>
           
                <div class="col-1" style="margin-left: 130px;">
                  <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFB0B0;">Simpan</button> --}}
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
