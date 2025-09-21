@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Detail Data Obstetri</h4>
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
                                      
                                      <select class="form-select @error('nik') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">
                                      
                                        <option selected>{{ $nik }}</option>
                                        @if($dataorangtua != null)
                                        @foreach ($dataorangtua as $item)
                                        <option value="{{ $item->nik }}">{{ $item->nik }}</option>
                                        @endforeach
                                        {{-- @else
                                        <option selected>--Pilih NIK--</option>
                                        @endif
                                        @if($dataorangtua1 != null)
                                        @foreach ($dataorangtua1 as $item1)
                                        <option value="test" {{ old('nik') }} selected>{{ $item1->nik }}</option>
                                        @endforeach --}}
                                        @endif

                                       
                                        </select>
                                        
                                     
                                        @error('nik')
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
                                        <label for="nama_ibu" class="col-12">Nama</label>
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}" autofocus autocomplete="off">
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
                        
                                        <input type="text" class="form-control  @error('tempat_atau_tanggal_lahir') is-invalid @enderror" id="tempat_atau_tanggal_lahir"
                                                placeholder="Masukan Nama Ibu..." name="tempat_atau_tanggal_lahir" value="{{$tempat_lahir_ibu }}/{{ strftime('%d %B %Y', strtotime($tanggal_lahir_ibu))}}"  autofocus autocomplete="off">
                                       
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
                  <form action="{{ url('dataobstetri/'.$id) }}" method='post'>
                    @csrf
                    @method('PUT')
                  <div class="row p-5" style="margin-bottom: 50px; margin-top:-50px;">
                    <div class="col-12">
                      <div class="table-responsive bg-white">
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
                                    <!--<th class="col-1 text-capitalize">Aksi</th>-->
                                </tr>
                            </thead>
                            <tbody>  
                              @foreach ($data2 as $row)
                              <input type="text" class="form-control" id="nik"
                          placeholder="Tahun.." name="nik_ibu[]" value="{{ $row->nik_ibu }}" autofocus autocomplete="off" hidden>
                            <tr>
                              <input type="text" class="form-control" id="nik"
                              placeholder="Tahun.." name="id[]" value="{{ $row->id }}"  autofocus autocomplete="off" hidden>
                                  <th class="col-1"> <select class="form-select @error('kehamilan_ke[]') is-invalid @enderror"  aria-label="Default select example" name="kehamilan_ke[]" id="kehamilan_ke">
                                    <option selected>{{ $row->kehamilan_ke }}</option>
                                    <option value= "{{ '1' }}" {{ old('kehamilan_ke[]') == '1' ? 'selected':null }}">1</option>
                                    <option value= "{{ '2' }}" {{ old('kehamilan_ke[]') == '2' ? 'selected':null }}">2</option>
                                    <option value= "{{ '3' }}" {{ old('kehamilan_ke[]') == '3' ? 'selected':null }}">3</option>
                                    <option value= "{{ '4' }}" {{ old('kehamilan_ke[]') == '4' ? 'selected':null }}">4</option>
                                    <option value= "{{ '5' }}" {{ old('kehamilan_ke[]') == '5' ? 'selected':null }}">5</option>
                                    <option value= "{{ '6' }}" {{ old('kehamilan_ke[]') == '6' ? 'selected':null }}">6</option>
                                    </select>
                                    @error('kehamilan_ke[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><input type="text" class="form-control  @error('tahun') is-invalid @enderror" id="tahun"
                                    placeholder="Tahun.." name="tahun[]" value="{{ $row->tahun }}"  autofocus autocomplete="off">
                                   
                                    @error('tahun')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><select class="form-select @error('status_lahir_hidup[]') is-invalid @enderror"  aria-label="Default select example" name="status_lahir_hidup[]" id="status_lahir_hidup">
                                    <option selected>{{ $row->lahir_hidup }}</option>
                                    <option value= "{{ 'Hidup' }}" {{ old('status_lahir_hidup[]') == 'Hidup' ? 'selected':null }}">Hidup</option>
                                    <option value= "{{ 'Mati' }}" {{ old('status_lahir_hidup[]') == 'Mati' ? 'selected':null }}">Mati</option>
                                    <option value= "{{ 'Abortus' }}" {{ old('status_lahir_hidup[]') == 'Abortus' ? 'selected':null }}">Abortus</option>
                                    </select>
                                    @error('status_lahir_hidup[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1">
                                   <select class="form-select @error('status_lahir_aterm[]') is-invalid @enderror"  aria-label="Default select example" name="status_lahir_aterm[]" id="status_lahir_aterm">
                                    <option selected>{{ $row->lahir_aterm }}</option>
                                    <option value= "{{ 'Aterm' }}" {{ old('status_lahir_aterm[]') == 'Aterm' ? 'selected':null }}">Aterm</option>
                                    <option value= "{{ 'Mati' }}" {{ old('status_lahir_aterm[]') == 'Mati' ? 'selected':null }}" >Mati</option>
                                    <option value= "{{ 'Preterm' }}" {{ old('status_lahir_aterm[]') == 'Preterm' ? 'selected':null }}" >Preterm</option>
                                    <option value= "{{ 'Post Term' }}" {{ old('status_lahir_aterm[]') == 'Post Term' ? 'selected':null }}" >Post Term</option>
                                    </select>
                                    @error('status_lahir_aterm[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror
                                  </th>
                                  <th class="col-1"> <select class="form-select @error('status_lahir_spontan[]') is-invalid @enderror"  aria-label="Default select example" name="status_lahir_spontan[]" id="status_lahir_spontan">
                                    <option selected>{{ $row->lahir_spontan }}</option>
                                    <option value= "{{ 'Spontan' }}" {{ old('status_lahir_spontan[]') == 'Spontan' ? 'selected':null }}" >Spontan</option>
                                    <option value= "{{ 'SC' }}" {{ old('status_lahir_spontan[]') == 'SC' ? 'selected':null }}" >SC</option>
                                    <option value= "{{ 'Lainnya' }}" {{ old('status_lahir_spontan[]') == 'Lainnya' ? 'selected':null }}" >Lainnya</option>
                                    </select>
                                    @error('status_lahir_spontan[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><input type="text" class="form-control  @error('berat_lahir[]') is-invalid @enderror" id="berat_lahir"
                                    placeholder="Berat Lahir..." name="berat_lahir[]" value="{{ $row->berat_lahir_atau_panjang_lahir }}"  autofocus autocomplete="off">
                                    @error('berat_lahir[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><input type="text" class="form-control  @error('tempat_bersalin[]') is-invalid @enderror" id="tempat_bersalin"
                                    placeholder="Tempat Bersalin..." name="tempat_bersalin[]" value="{{ $row->tempat_bersalin_dan_tenakes }}"  autofocus autocomplete="off">
                                    @error('tempat_bersalin[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><input type="text" class="form-control  @error('kondisi_anak[]') is-invalid @enderror" id="kondisi_anak"
                                    placeholder="Kondisi Anak..." name="kondisi_anak[]" value="{{ $row->kondisi_anak_saat_ini }}"  autofocus autocomplete="off">
                                    @error('kondisi_anak[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                  <th class="col-1"><input type="text" class="form-control  @error('komplikasi_kehamilan[]') is-invalid @enderror" id="komplikasi_kehamilan"
                                    placeholder="Komplikasi Kehamilan..." name="komplikasi_kehamilan[]" value="{{ $row->komplikasi_kehamilan_atau_persalinan }}"  autofocus autocomplete="off">
                                    @error('komplikasi_kehamilan[]')
                                    <div class="invalid-feedback">
                                      {{ $message }}
                                    </div>
                                @enderror</th>
                                    <!--<td>  <div class="row">-->
                                        
                                    <!--    <div class="col-3 text-center">-->
                                    <!--     {{-- <form onsubmit="return deleteData('')" action="{{ url('dataorangtuadananak') }}" method="POST"> -->
                                    <!--      @csrf-->
                                    <!--      @method('DELETE')-->
                                    <!--         <button type="submit" title="Hapus" class="btn btn-danger btn-md">-->
                                    <!--          <i class="fa fa-trash-alt"></i>-->
                                    <!--         </button>-->
                                    <!--    </form> --}}-->
                                    <!--  </div>-->
                                      
                            
                                    <!--</td>-->
                                   
                                </tr>
                            @endforeach
                          
                            </tbody>
                         
                        </table>
                    
                    </div>
                    
                    <div class="card-body text-center" style="margin-top: 20px;">
                      <div class="row" style="">
                        <div class="col-1">
                          <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Edit</button>
                         
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
                        <div class="col-1" style="margin-left: 30px;">
                          <button type="button" onclick="window.location='{{ url('dataobstetri') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:50px; background-color: #F87A53;">Batal</button>
                        </div>
                   
                        <div class="col-1" style="margin-left: 130px;">
                          <!--<button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #FFB0B0;">Simpan</button>-->
                        </form>
                        </div>
                       
                      </div>
                       
                       
                    </div>
            
        </div>
    
@endsection