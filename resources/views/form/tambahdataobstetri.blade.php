@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Tambah Data Obstetri</h4>
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-md-12 mx-auto mt-2 p-5">
                       
                                <div class="row ">
                                  <div class="col-6 ">
                                  
                                    <div class="form-group fw-bold">
                                      <label for="tempat_atau_tanggal_lahir" class="col-12">NIK</label>
                                      <form method="get">
                                      <select class="form-select @error('nik_ibu') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">
                                      
                                        <option selected>--Pilih NIK Ibu--</option>
                                        @if($dataorangtua != null)
                                        @foreach ($dataorangtua as $item)
                                        <option value="{{ $item->nik }}">{{ $item->nik }}</option>
                                        @endforeach
                                        @else
                                        <option selected>--Pilih NIK--</option>
                                        @endif
                                        @if($dataorangtua1 != null)
                                        @foreach ($dataorangtua1 as $item1)
                                        <option value="test" {{ old('nik') }} selected>{{ $item1->nik }}</option>
                                        @endforeach
                                        @endif

                                       
                                        </select>
                                        @error('nik_ibu')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                      </form>
                                        
                                    
                                     </div>
                                  </div>
                                </div>
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="nama_ibu" class="col-12">Nama</label>
                                        @if ($dataorangtua1 != null)
                                        @foreach ($dataorangtua1 as $item1)
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
                                  @php
                                        setlocale(LC_ALL, 'id_ID.UTF-8');
                                    @endphp
                                  <div class="row">
                                    <div class="col-6">
                                      <div class="form-group">
                                        <label for="tempat_atau_tanggal_lahir" class="col-12">Tempat/Tanggal Lahir</label>
                                        @if ($dataorangtua1 != null)
                                        @foreach ($dataorangtua1 as $item1)
                                        <input type="text" class="form-control  @error('tempat_atau_tanggal_lahir') is-invalid @enderror" id="tempat_atau_tanggal_lahir"
                                                placeholder="Masukan Nama Ibu..." name="tempat_atau_tanggal_lahir" value="{{$item1->tempat_lahir_ibu }}/{{ strftime('%d %B %Y', strtotime($item1->tanggal_lahir_ibu))}}"  autofocus autocomplete="off">
                                              
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('tempat_atau_tanggal_lahir') is-invalid @enderror" id="tempat_atau_tanggal_lahir"
                                                placeholder="Masukan Nama Ibu..." name="tempat_atau_tanggal_lahir" value="{{ old('tempat_atau_tanggal_lahir') }}"  autofocus autocomplete="off">
                                        @endif
                                                @error('tempat_atau_tanggal_lahir')
                                                <div class="invalid-feedback">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                          
                                       </div>
                                    </div>
                                     
                                  </div>
                                  <div class="row" style="margin-left: 800px;">
                                    <div class="col-6">
                                      <button type="button" id="tambahbaris" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 200px;background-color:  #4DA8DA;">Tambah</button>
                                    </div>
                                  
                                  </div>
                                  
                                 
                             
                        </div>
                    </div>
                    
      
                  </div>
                  <form action="{{  url('dataobstetri') }}" method='post'>
                    @csrf
              
                  <div class="row p-5" style="margin-bottom: 50px; margin-top:-50px;">
                    <div class="col-12">
                     
                       
                        <table class="table table-bordered table-hover text-center" id="tabelku">
                            <thead class="text-center" style="background-color:  #4DA8DA;">
                                <tr>

                                  <th class="col-1 text-capitalize">Kehamilan Ke-</th>
                                    <th class="col-1 text-capitalize">Tahun</th>
                                    <th class="col-1 text-capitalize">Lahir Hidup/Mati/Abortus</th>
                                    <th class="col-1 text-capitalize">Lahir Aterm/Mati/Preterm/Post Term</th>
                                    <th class="col-1 text-capitalize">Lahir Spontan/SC/Lnjang Lahir (cm)</th>
                                    <th class="col-1 text-capitalize">Tempat Bersalin, Tenakes</th>
                                    <th class="col-1 text-capitalize">Kondisi Anak Saat Ini</th>
                                    <th class="col-1 text-capitalize">Komplikasi Kehamilan/Persalinan</th>
                                    <th class="col-1 text-capitalize">Aksi</th>
                                </tr>
                            </thead>
                          
                            <tbody>  
                              
                           
                          
                            </tbody>
                         
                        </table>
                      
                    
                    </div>
                    
                    <div class="card-body text-center" style="margin-top: 20px;">
                      <div class="row" style="">
                        <div class="col-1">
                          <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button>
                        </form>
                        <script>
                          $('#tambahbaris').click( function() {      
                            var tableID = "tabelku";
                            var table = document.getElementById(tableID);
                            var rowCount = table.rows.length;
                            var row = table.insertRow(rowCount);
                            
                            var element1 = 
                            '<tr>'+
                                      '<input type="text" class="form-control  @error('nik') is-invalid @enderror" id="nik"'+
                                      'placeholder="Tahun.." name="nik_ibu[]" value="{{ $nikibu }}"  autofocus autocomplete="off" hidden>'+
                                      
                                        '<th class="col-1 text-capitalize"> <select class="form-select @error('kehamilan_ke') is-invalid @enderror"  aria-label="Default select example" name="kehamilan_ke[]" id="kehamilan_ke">'+
                                          '<option selected>--Pilih--</option>'+
                                          '<option value= "1" {{ old('kehamilan_ke') }}>1</option>'+
                                          '<option value= "2" {{ old('kehamilan_ke') }}>2</option>'+
                                          '<option value= "3" {{ old('kehamilan_ke') }}>3</option>'+
                                          '<option value= "4" {{ old('kehamilan_ke') }}>4</option>'+
                                          '<option value= "5" {{ old('kehamilan_ke') }}>5</option>'+
                                          '<option value= "6" {{ old('kehamilan_ke') }}>6</option>'+
                                          '</select>'+
                                          '@error('kehamilan_ke')'+
                                          '<div class="invalid-feedback text-success">'+
                                            '{{ $message }}'+
                                          '</div>'+
                                    '  @enderror</th>'+
                                      '  <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('tahun') is-invalid @enderror" id="tahun"'+
                                         ' placeholder="Tahun.." name="tahun[]" value="{{ old('tahun') }}"  autofocus autocomplete="off">'+
                                          '@foreach ($dataorangtua1 as $item1)'+
                                          '<input type="text" class="form-control  @error('nik') is-invalid @enderror" id="nik"'+
                                         ' placeholder="Tahun.." name="nik" value="{{ $item1->nik }}"  autofocus autocomplete="off" hidden>'+
                                          '@endforeach'+
                                          '@error('tahun')'+
                                          '<div class="invalid-feedback text-success">'+
                                            '{{ $message }}'+
                                         ' </div>'+
                                      '@enderror</th>'+
                                    '  <th class="col-1 text-capitalize"><select class="form-select @error('status_lahir_hidup') is-invalid @enderror" '+
                                    '     aria-label="Default select example" name="status_lahir_hidup[]" id="status_lahir_hidup">'+
                                    '      <option selected>--Pilih--</option>'+
                                    '      <option value= "Hidup" {{ old('status_lahir_hidup') }}>Hidup</option>'+
                                    '      <option value= "Mati" {{ old('status_lahir_hidup') }}>Mati</option>'+
                                    '      <option value= "Abortus" {{ old('status_lahir_hidup') }}>Abortus</option>'+
                                    '      </select>'+
                                    '      @error('status_lahir_hidup')'+
                                    '      <div class="invalid-feedback text-success">'+
                                    '        {{ $message }}'+
                                    '      </div>'+
                                    '  @enderror</th>'+
                                    '  <th class="col-1 text-capitalize">'+
                                         '<select class="form-select @error('status_lahir_aterm') is-invalid @enderror"  aria-label="Default select example" name="status_lahir_aterm[]" id="status_lahir_aterm">'+
                                          '<option selected>--Pilih--</option>'+
                                        '  <option value= "Aterm" {{ old('status_lahir_aterm') }}>Aterm</option>'+
                                         ' <option value= "Mati" {{ old('status_lahir_aterm') }}>Mati</option>'+
                                         ' <option value= "Preterm" {{ old('status_lahir_aterm') }}>Preterm</option>'+
                                         ' <option value= "Post Term" {{ old('status_lahir_aterm') }}>Post Term</option>'+
                                        '  </select>'+
                             '             @error('status_lahir_aterm')'+
                             '             <div class="invalid-feedback text-success">'+
                             '               {{ $message }}'+
                             '             </div>'+
                             '         @enderror'+
                             '           </th>'+
                             '           <th class="col-1 text-capitalize"> <select class="form-select @error('status_lahir_spontan') is-invalid @enderror" '+
                             '              aria-label="Default select example" name="status_lahir_spontan[]" id="status_lahir_spontan">'+
                             '             <option selected>--Pilih--</option>'+
                             '             <option value= "Spontan" {{ old('status_lahir_spontan') }}>Spontan</option>'+
                             '             <option value= "SC" {{ old('status_lahir_spontan') }}>SC</option>'+
                             '             <option value= "Lainnya" {{ old('status_lahir_spontan') }}>Lainnya</option>'+
                             '             </select>'+
                             '             @error('status_lahir_spontan')'+
                             '             <div class="invalid-feedback text-success">'+
                             '               {{ $message }}'+
                             '             </div>'+
                             '         @enderror</th>'+
                                   '     <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('berat_lahir') is-invalid @enderror" id="berat_lahir"'+
                                   '       placeholder="Berat Lahir..." name="berat_lahir[]" value="{{ old('berat_lahir') }}"  autofocus autocomplete="off">'+
                                   '       @error('berat_lahir')'+
                                   '       <div class="invalid-feedback text-success">'+
                                   '         {{ $message }}'+
                                   '       </div>'+
                                    '  @enderror</th>'+
                                    '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('tempat_bersalin') is-invalid @enderror" id="tempat_bersalin"'+
                                    '      placeholder="Tempat Bersalin..." name="tempat_bersalin[]" value="{{ old('tempat_bersalin') }}"  autofocus autocomplete="off">'+
                                    '      @error('tempat_bersalin')'+
                                    '      <div class="invalid-feedback text-success">'+
                                    '        {{ $message }}'+
                                    '      </div>'+
                                    '  @enderror</th>'+
                                  '      <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('kondisi_anak') is-invalid @enderror" id="kondisi_anak"'+
                                  '        placeholder="Kondisi Anak..." name="kondisi_anak[]" value="{{ old('kondisi_anak') }}"  autofocus autocomplete="off">'+
                                  '        @error('kondisi_anak')'+
                                  '        <div class="invalid-feedback text-success">'+
                                  '          {{ $message }}'+
                                  '        </div>'+
                                    '  @enderror</th>'+
                                    '    <th class="col-1 text-capitalize"><input type="text" class="form-control  @error('komplikasi_kehamilan') is-invalid @enderror" id="komplikasi_kehamilan"'+
                                    '      placeholder="Komplikasi Kehamilan..." name="komplikasi_kehamilan[]" value="{{ old('komplikasi_kehamilan') }}"  autofocus autocomplete="off">'+
                                    '      @error('komplikasi_kehamilan')'+
                                    '      <div class="invalid-feedback text-success">'+
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
                        <div class="col-1" style="margin-left: 30px;">
                          <button type="button" onclick="window.location='{{ url('dataorangtuadananak') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                        </div>
                        <div class="col-1" style="margin-left: 130px;">
                          <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFB0B0;">Edit</button>
                    
                        </div>
                       
                      </div>
                       
                       
                    </div>
            
        </div>
    
@endsection