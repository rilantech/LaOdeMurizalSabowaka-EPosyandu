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
      href="{{ asset('templatedwi/img/kaiadmin/favicon.ico') }}"
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

    <h2 style="text-align: center; color:black;">Data Matriks Pemantauan Perkembangan Anak</h2>
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
                        <form action="{{ url('matriksperkembangananak/'.$id) }}" method='post'>
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
                            placeholder="..." name="tanggal_pemantauan_perkembangan_1" value="{{ $tanggal_pemantauan_perkembangan_1 }}"  autofocus autocomplete="off" style="width: 100px;">
                           
                         </th>
                          <th class="col-1"><input type="text" class="form-control @error('tanggal_pemantauan_perkembangan_3') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_3"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_3" value="{{ $tanggal_pemantauan_perkembangan_3 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_6') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_6"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_6" value="{{ $tanggal_pemantauan_perkembangan_6 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_9') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_9"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_9" value="{{ $tanggal_pemantauan_perkembangan_9 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_12') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_12"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_12" value="{{ $tanggal_pemantauan_perkembangan_12 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_15') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_15"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_15" value="{{ $tanggal_pemantauan_perkembangan_15 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_18') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_18"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_18" value="{{ $tanggal_pemantauan_perkembangan_18 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_21') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_21"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_21" value="{{ $tanggal_pemantauan_perkembangan_21 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_24') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_24"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_24" value="{{ $tanggal_pemantauan_perkembangan_24 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_30') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_30"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_30" value="{{ $tanggal_pemantauan_perkembangan_30 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_36') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_36"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_36" value="{{ $tanggal_pemantauan_perkembangan_36 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_42') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_42"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_42" value="{{ $tanggal_pemantauan_perkembangan_42 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_48') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_48"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_48" value="{{ $tanggal_pemantauan_perkembangan_48 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_54') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_54"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_54" value="{{ $tanggal_pemantauan_perkembangan_54 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_60') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_60"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_60" value="{{ $tanggal_pemantauan_perkembangan_60 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_66') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_66"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_66" value="{{ $tanggal_pemantauan_perkembangan_66 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('tanggal_pemantauan_perkembangan_72') is-invalid @enderror" id="tanggal_pemantauan_perkembangan_72"
                            placeholder="..." name="tanggal_pemantauan_perkembangan_72" value="{{ $tanggal_pemantauan_perkembangan_72 }}"  autofocus autocomplete="off" style="width: 100px;">
                          </th>
                        </tr>
                        <tr>
                          <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                              Hasil
                          </td>
                          <th class="col-1"><input type="text" class="form-control @error('hasil_1') is-invalid @enderror" id="hasil_1"
                            placeholder="..." name="hasil_1" value="{{ $hasil_1 }}"  autofocus autocomplete="off">
                           
                         </th>
                          <th class="col-1"><input type="text" class="form-control @error('hasil_3') is-invalid @enderror" id="hasil_3"
                            placeholder="..." name="hasil_3" value="{{ $hasil_3 }}"  autofocus autocomplete="off"></th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_6') is-invalid @enderror" id="hasil_6"
                            placeholder="..." name="hasil_6" value="{{ $hasil_6 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_9') is-invalid @enderror" id="hasil_9"
                            placeholder="..." name="hasil_9" value="{{ $hasil_9 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_12') is-invalid @enderror" id="hasil_12"
                            placeholder="..." name="hasil_12" value="{{ $hasil_12 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_15') is-invalid @enderror" id="hasil_15"
                            placeholder="..." name="hasil_15" value="{{ $hasil_15 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_18') is-invalid @enderror" id="hasil_18"
                            placeholder="..." name="hasil_18" value="{{ $hasil_18 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_21') is-invalid @enderror" id="hasil_21"
                            placeholder="..." name="hasil_21" value="{{ $hasil_21 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_24') is-invalid @enderror" id="hasil_24"
                            placeholder="..." name="hasil_24" value="{{ $hasil_24 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_30') is-invalid @enderror" id="hasil_30"
                            placeholder="..." name="hasil_30" value="{{ $hasil_30 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_36') is-invalid @enderror" id="hasil_36"
                            placeholder="..." name="hasil_36" value="{{ $hasil_36 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_42') is-invalid @enderror" id="hasil_42"
                            placeholder="..." name="hasil_42" value="{{ $hasil_42 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_48') is-invalid @enderror" id="hasil_48"
                            placeholder="..." name="hasil_48" value="{{ $hasil_48 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_54') is-invalid @enderror" id="hasil_54"
                            placeholder="..." name="hasil_54" value="{{ $hasil_54 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_60') is-invalid @enderror" id="hasil_60"
                            placeholder="..." name="hasil_60" value="{{ $hasil_60 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_66') is-invalid @enderror" id="hasil_66"
                            placeholder="..." name="hasil_66" value="{{ $hasil_66 }}"  autofocus autocomplete="off">
                          </th>
                          <th class="col-1">
                            <input type="text" class="form-control  @error('hasil_72') is-invalid @enderror" id="hasil_72"
                            placeholder="..." name="hasil_72" value="{{ $hasil_72 }}"  autofocus autocomplete="off">
                          </th>
                        </tr>
                       
                          <tr>
                            <td class="text-start" style="background-color: #9f97f0;" colspan="3"> 
                                Tindakan
                            </td>
                            <th class="col-1"><input type="text" class="form-control @error('tindakan_1') is-invalid @enderror" id="tindakan_1"
                              placeholder="..." name="tindakan_1" value="{{ $tindakan_1 }}"  autofocus autocomplete="off">
                             
                           </th>
                            <th class="col-1"><input type="text" class="form-control @error('tindakan_3') is-invalid @enderror" id="tindakan_3"
                              placeholder="..." name="tindakan_3" value="{{ $tindakan_3 }}"  autofocus autocomplete="off"></th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_6') is-invalid @enderror" id="tindakan_6"
                              placeholder="..." name="tindakan_6" value="{{ $tindakan_6 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_9') is-invalid @enderror" id="tindakan_9"
                              placeholder="..." name="tindakan_9" value="{{ $tindakan_9 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_12') is-invalid @enderror" id="tindakan_12"
                              placeholder="..." name="tindakan_12" value="{{ $tindakan_12 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_15') is-invalid @enderror" id="tindakan_15"
                              placeholder="..." name="tindakan_15" value="{{ $tindakan_15 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_18') is-invalid @enderror" id="tindakan_18"
                              placeholder="..." name="tindakan_18" value="{{ $tindakan_18 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_21') is-invalid @enderror" id="tindakan_21"
                              placeholder="..." name="tindakan_21" value="{{ $tindakan_21 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_24') is-invalid @enderror" id="tindakan_24"
                              placeholder="..." name="tindakan_24" value="{{ $tindakan_24 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_30') is-invalid @enderror" id="tindakan_30"
                              placeholder="..." name="tindakan_30" value="{{ $tindakan_30 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_36') is-invalid @enderror" id="tindakan_36"
                              placeholder="..." name="tindakan_36" value="{{ $tindakan_36 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_42') is-invalid @enderror" id="tindakan_42"
                              placeholder="..." name="tindakan_42" value="{{ $tindakan_42 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_48') is-invalid @enderror" id="tindakan_48"
                              placeholder="..." name="tindakan_48" value="{{ $tindakan_48 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_54') is-invalid @enderror" id="tindakan_54"
                              placeholder="..." name="tindakan_54" value="{{ $tindakan_54 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_60') is-invalid @enderror" id="tindakan_60"
                              placeholder="..." name="tindakan_60" value="{{ $tindakan_60 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_66') is-invalid @enderror" id="tindakan_66"
                              placeholder="..." name="tindakan_66" value="{{ $tindakan_66 }}"  autofocus autocomplete="off">
                            </th>
                            <th class="col-1">
                              <input type="text" class="form-control  @error('tindakan_72') is-invalid @enderror" id="tindakan_72"
                              placeholder="..." name="tindakan_72" value="{{ $tindakan_72 }}"  autofocus autocomplete="off">
                            </th>
                           
                          </tr>
                          
                            <tr>
                              <td class="text-start" style="background-color: #9f97f0;" colspan="3" > 
                                Tanggal Pemantauan Selanjutnya
                              </td>
                              <th class="col-1"><input type="text" class="form-control @error('tanggal_pemantauan_selanjutnya_1') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_1"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_1" value="{{ $tanggal_pemantauan_selanjutnya_1 }}"  autofocus autocomplete="off">
                               
                             </th>
                              <th class="col-1"><input type="text" class="form-control @error('tanggal_pemantauan_selanjutnya_3') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_3"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_3" value="{{ $tanggal_pemantauan_selanjutnya_3 }}"  autofocus autocomplete="off"></th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_6') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_6"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_6" value="{{ $tanggal_pemantauan_selanjutnya_6 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_9') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_9"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_9" value="{{ $tanggal_pemantauan_selanjutnya_9 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_12') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_12"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_12" value="{{ $tanggal_pemantauan_selanjutnya_12 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_15') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_15"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_15" value="{{ $tanggal_pemantauan_selanjutnya_15 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_18') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_18"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_18" value="{{ $tanggal_pemantauan_selanjutnya_18 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_21') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_21"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_21" value="{{ $tanggal_pemantauan_selanjutnya_21 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_24') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_24"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_24" value="{{ $tanggal_pemantauan_selanjutnya_24 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_30') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_30"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_30" value="{{ $tanggal_pemantauan_selanjutnya_30 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_36') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_36"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_36" value="{{ $tanggal_pemantauan_selanjutnya_36 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_42') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_42"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_42" value="{{ $tanggal_pemantauan_selanjutnya_42 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_48') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_48"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_48" value="{{ $tanggal_pemantauan_selanjutnya_48 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_54') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_54"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_54" value="{{ $tanggal_pemantauan_selanjutnya_54 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_60') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_60"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_60" value="{{ $tanggal_pemantauan_selanjutnya_60 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_66') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_66"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_66" value="{{ $tanggal_pemantauan_selanjutnya_66 }}"  autofocus autocomplete="off">
                              </th>
                              <th class="col-1">
                                <input type="text" class="form-control  @error('tanggal_pemantauan_selanjutnya_72') is-invalid @enderror" id="tanggal_pemantauan_selanjutnya_72"
                                placeholder="..." name="tanggal_pemantauan_selanjutnya_72" value="{{ $tanggal_pemantauan_selanjutnya_72 }}"  autofocus autocomplete="off">
                              </th>
                            
                               
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
                  {{-- <button type="button" onclick="window.location='{{ url('matriksperkembangananak') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button> --}}
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
    <script src="{{ asset('templatedwi/js/setting-demo.js') }} "></script>
    <script src="{{ asset('templatedwi/js/demo.js') }}"></script>
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
