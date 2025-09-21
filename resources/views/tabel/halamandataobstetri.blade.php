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
                            <h5 class="card-title text-center">Data Obstetri</h5>  
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
                        <form class="app-search-form col-10" method="GET"> 
                            <div class="input-group" style="width: 300px;">
                                <input type="text" placeholder="Cari Data..." name="search" class="form-control search-input" value="{{ $search }}" id="search">
                                <button type="submit" class="btn search-btn btn-primary" value="Search"><i class=" fas fa-search"></i></button> 
                            </div> 
                                @error('username')
                                    <div class="invalid-feedback">
                                    {{ $message }}
                                    </div>
                                @enderror
                            </form>

                        <!--<div class="col-2">-->
                        <!--    <button type="button" class="btn btn-outline-dark rounded-pill fw-bold text-white" style="background-color: #EE66A6;margin-left: 75px;" onclick="window.location='{{ url('tambahdataobstetri') }}'" >Tambah</button>-->
                        <!--</div>-->
                        </div>
                                
                        </div>
                       <div class="card-body">
                        <div class="table-responsive bg-white">
                            <table class="table table-bordered border-dark table-hover text-center">
                                <thead class="text-center" style="background-color:  #4DA8DA;" >
                                    <tr>
                                        <th class="col-1 text-capitalize" style="width:20px;">No</th>
                                        <th class="col-3 text-capitalize">Nama Ibu</th>
                                        <th class="col-1 text-capitalize">NIK</th>
                                        <th class="col-3 text-capitalize">Tempat/Tanggal Lahir</th>
                                        <th class="col-1 text-capitalize">Alamat</th>
                                        <!--<th class="col-1 text-capitalize">Jumlah Kehamilan</th>-->
                                        <th class="col-3 text-capitalize">Aksi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    @php
                                        setlocale(LC_ALL, 'id_ID.UTF-8');
                                    @endphp
                                    @php
                                    $nomor = 1 + (($dataorangtuadananak->currentPage()-1)* $dataorangtuadananak->perPage());
                                @endphp
                                    @foreach ($dataorangtuadananak as $row)
                                    <tr>
                                        <td>{{ $nomor ++ }}</td>
                                        <td>{{ $row->nama_ibu }}</td>
                                        <td>{{ $row->nik }}</td>
                                        <td>{{ $row->tempat_lahir_ibu }}/{{ strftime('%d %B %Y', strtotime($row->tanggal_lahir_ibu))}}</td>
                                        <td>{{ $row->alamat_rumah }}</td>
                                        <!--<td>4</td>-->
                                        <td>  <div class="row" style="margin-left:6px;">
                                            <div class="col-3 text-center">
                                                <button onclick="window.location='{{ url('dataobstetri/'.$row->id) }}'" type="button" class="btn btn-success btn-md" title="Detail">
                                                     <i class="fas fa-list"></i>
                                                </button>
                                               </div>
                                            <div class="col-3 text-center">
                                             <form onsubmit="return deleteData('{{ $row->nama_ibu }}')" action="{{ url('dataorangtuadananak/'.$row->id) }}" method="POST"> 
                                              @csrf
                                              @method('DELETE')
                                                 <button type="submit" title="Hapus" class="btn btn-danger btn-md">
                                                  <i class="fa fa-trash-alt"></i>
                                                 </button>
                                            </form>
                                          </div>
                                          
                                          <div class="col-3 text-center">
                                            <a href="{{ url('cetakdataobstetri/'.$row->id) }}" class="btn btn-primary btn-md" title="Cetak" target="_blank">
                                                <i><img
                                                    src="{{ asset('templatedwi/img/icon_print.png') }}"
                                                    alt="Img Profile"
                                                    width="20"
                                                    height="20"
                                                  /></i>
                                                </a>
                                          </div>
                                        </td>
                                       
                                    </tr>
                                
                                    @endforeach      
                                  
                                </tbody>
                             
                            </table>
                              {!! $dataorangtuadananak->appends(Request::except('page'))->render() !!}
                        </div>
                    </div>
             
             
@endsection