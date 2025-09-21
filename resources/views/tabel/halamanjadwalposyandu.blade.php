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
                <div class="card" style="background-color: #F2F2F2;">
                    <div class="card-body">
                        <div class="row">
                        <div class="col-12 mb-4">
                            <h5 class="card-title text-center">Jadwal Posyandu</h5>  
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
                                <input type="text" placeholder="Cari Jadwal..." name="search" class="form-control search-input" value="{{ $search }}" id="search" >
                                <button type="submit" class="btn search-btn btn-primary" value="Search"><i class=" fas fa-search"></i></button> 
                            </div> 
                                @error('username')
                                    <div class="invalid-feedback">
                                    {{ $message }}
                                    </div>
                                @enderror
                            </form>

                        <div class="col-2">
                            <button type="button" class="btn text-white" onclick="window.location='{{ url('tambahjadwalposyandu') }}'" style="background-color: #4DA8DA;; margin-left:75px;">Tambah</button>
                        </div>
                        </div>
                                
                        </div>
                       <div class="card-body">
                        <div class="table-responsive bg-white">
                            <table class="table table-bordered table-hover text-center">
                                <thead class="text-center" style="background-color:  #4DA8DA;">
                                    <tr>
                                        <th class="col-1 text-capitalize">No</th>
                                        <th class="col-2 text-capitalize">Waktu Post</th>
                                        <th class="col-3 text-capitalize">Agenda</th>
                                        <th class="col-2 text-capitalize">Tanggal</th>
                                        <th class="col-2 text-capitalize">Jam</th>
                                        <th class="col-3 text-capitalize">Aksi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    @php
                                    $nomor = 1 + (($jadwalposyandu->currentPage()-1)* $jadwalposyandu->perPage());
                                     setlocale(LC_ALL, 'id_ID.UTF-8');
                                @endphp
                                    @foreach ($jadwalposyandu as $row)
                                    <tr>
                                        <td>{{ $nomor ++ }}</td>
                                        <td>{{ strftime('%d-%m-%Y %H:%M:%S', strtotime($row->waktu_post)) }}</td>
                                        <td>{{ $row->agenda }}</td>
                                        <td>{{ $row->tanggal }}</td>
                                        <td>{{ $row->jam }}</td>
                                        <td>  <div class="row">
                                           
                                            <div class="col-6 text-center">
                                             <button onclick="window.location='{{ url('jadwalposyandu/'.$row->id) }}'" type="button" class="btn btn-md btn-warning" title="Edit Data">
                                                  <i class="fa fa-edit"></i>
                                             </button>
                                            </div>
                                            <div class="col-6 text-center">
                                             <form onsubmit="return deleteData('{{ $row->agenda }}')" action="{{ url('jadwalposyandu/'.$row->id) }}" method="POST"> 
                                              @csrf
                                              @method('DELETE')
                                                 <button type="submit" title="Hapus Data" class="btn btn-danger btn-md">
                                                  <i class="fa fa-trash-alt"></i>
                                                 </button>
                                            </form>
                                          </div>
                                        </td>
                                       
                                    </tr>
                                
                                    @endforeach      
                                  
                                </tbody>
                             
                            </table>
                            {!! $jadwalposyandu->appends(Request::except('page'))->render() !!}
                        </div>
                    </div>
                    
                    </div>
             
@endsection