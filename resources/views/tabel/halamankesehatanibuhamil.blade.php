@extends('layout.template')    

{{-- @section('judul')
<div class="page-breadcrumb">
    <div class="row">
        <div class="col-12 d-flex no-block align-items-center">
            <h4 class="page-title">Daftar Pengaduan</h4>
        </div>
    </div>
    @if (session()->has('msg'))
          
    <div class="alert alert-success alert-dismissible col-xl-6 col-sm-6 fade show mb-2" role="alert">
          {{ session('msg') }}
          <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>
        
   @endif --}}
{{-- </div>
@endsection --}}
@section('konten')

<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
        
                    <div class="card-body">
                        <div class="row">
                        <div class="col-12 mb-4">
                            <h5 class="card-title text-center">Kesehatan Ibu Hamil</h5>  
                        </div> 
                        
                        </div>
                        <div class="row">
                            <div class="col-9">
                                @if (session()->has('msg'))
              
                                <div class="alert alert-success alert-dismissible col-xl-6 col-sm-6 fade show mb-2" role="alert">
                                      {{ session('msg') }}
                                      <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                </div>
                                    
                               @endif
                            </div> 
                        </div>
                       
                        <div class="row">
                            <form class="app-search-form col-8 mt-3" method="GET"> 
                            <div class="input-group" style="width: 300px;">
                                <input type="text" placeholder="Cari Data..." name="search" class="form-control search-input" value="{{ $search }}" id="search" onkeyup="window.history.pushState({}, '', window.location.href='/kesehatanibuhamil/?search='+this.value+'&status_kehamilan=<?=$status_kehamilan;?>')">
                                <button type="submit" class="btn search-btn btn-primary" value="Search"><i class=" fas fa-search"></i></button> 
                            </div> 
                                @error('username')
                                    <div class="invalid-feedback">
                                    {{ $message }}
                                    </div>
                                @enderror
                            </form>
                        
                            <div class="form-group col-4" style="margin-top:-25px;">
                                <label for="agama_ibu">Pilih Data</label>
                                    <select class="form-select @error('agama_ibu') is-invalid @enderror"  aria-label="Default select example" name="agama_ibu" id="agama_ibu" onchange="pindahHalaman(this.value)">
                                          <option selected>--Pilih Data Kesehatan Ibu--</option>
                                         <option value= "/kesehatanibuhamil" {{ old('agama_ibu') }}>Kesehatan Ibu Hamil</option>
                                          <option value= "/kesehatanibuhamil?status_kehamilan=Berakhir" {{ old('agama_ibu') }}>Riwayat Kesehatan Ibu Hamil</option>
                                          <option value= "/kesehatanibuhamil?status_kehamilan=Sedang Berlangsung" {{ old('agama_ibu') }}>Kesehatan Ibu Sedang Hamil</option>
                                          <option value= "/kesehatanibubersalin" {{ old('agama_ibu') }}>Kesehatan Ibu Bersalin</option>
                                          <option value= "/kesehatanibunifas" {{ old('agama_ibu') }}>Kesehatan Ibu Nifas</option>
                                          <!--<option value= "/kesehatanibunifas?status_nifas=Berakhir" {{ old('agama_ibu') }}>Riwayat Kesehatan Ibu Nifas</option>-->
                                          <!--<option value= "/kesehatanibunifas?status_nifas=Sedang Berlangsung" {{ old('agama_ibu') }}>Kesehatan Ibu Sedang Nifas</option>-->
                                    </select>
                                          @error('agama_ibu')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                        
                        </div>
                        </div>
                                
                        </div>
                       <div class="card-body">
                        <div class="table-responsive bg-white">
                            <table class="table table-bordered table-hover text-center">
                                <thead class="text-center" style="background-color:  #4DA8DA;">
                                    <tr>
                                        <th class="col-1 text-capitalize" style="width:20px;">No</th>
                                        <th class="col-4 text-capitalize">Nama Ibu</th>
                                        <th class="col-1 text-capitalize">NIK</th>
                                        <th class="col-3 text-capitalize">Tempat/Tanggal Lahir</th>
                                        <th class="col-2 text-capitalize">Alamat</th>
                                        <!--<th class="col-1">Jumlah Kehamilan</th>-->
                                         <th class="col-1 text-capitalize">Aksi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    @php
                                    $nomor = 1 + (($dataorangtuadananak->currentPage()-1)* $dataorangtuadananak->perPage());;
                                    $i=0;
                                    setlocale(LC_ALL, 'id_ID.UTF-8');
                                @endphp
                                    
                                    @foreach ($dataorangtuadananak as $row)
                                     
                                    <tr>
                                        <td>{{ $nomor ++ }}</td>
                                        <td>{{ $row->nama_ibu }}</td>
                                        <td>{{ $row->nik }}</td>
                                        <td>{{ $row->tempat_lahir_ibu }}/{{ strftime('%d %B %Y', strtotime($row->tanggal_lahir_ibu)) }}</td>
                                        <td>{{ $row->alamat_rumah }}</td>
                                        <!--<td>4</td>-->
                                        <td>  <div class="row">
                                            <div class="col-4 text-center">
                                                <button onclick="window.location='{{ url('kesehatanibuhamil/'.$row->id.'?status_kehamilan='.$status_kehamilan) }}'" type="button" class="btn btn-success btn-md" title="Detail">
                                                     <i class="fas fa-list"></i>
                                                </button>
                                               </div>
                                            {{-- <div class="col-6 text-center">
                                             {{-- <form onsubmit="return deleteData('{{ $row->id}}')" action="{{ url('kesehatanibuhamil/'.$row->id) }}" method="POST"> 
                                              @csrf
                                              @method('DELETE')
                                                 <button type="submit" title="Hapus" class="btn btn-danger btn-md">
                                                  <i class="fa fa-trash-alt"></i>
                                                 </button>
                                            </form> --}}
                                          {{-- </div> --}} 
                                          
                    
                                        </td>
                                       
                                    </tr>
                              
                                 
                                    @endforeach
                                  
                                </tbody>
                             
                            </table>
                            {!! $dataorangtuadananak->appends(Request::except('page'))->render() !!}
                        </div>
                    </div>
                    
                    <script>
                        function pindahHalaman(url){
                            if(url !== ""){
                                window.location.href=url;
                            }
                        }
                    </script>

             
@endsection