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
                            <h5 class="card-title text-center">Data Pemenuhan Gizi & Makan</h5>  
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

                        <div class="col-2">
                            <button type="button" class="btn btn-outline-dark rounded-pill fw-bold text-white" style="background-color: #EE66A6;margin-left: 75px;" onclick="window.location='{{ url('/tambahpemenuhangizidanmakan') }}';" style="margin-left: 75px; background-color: #EE66A6;">Tambah</button>
                        </div>
                        </div>
                                
                        </div>
                       <div class="card-body">
                        <div class="table-responsive bg-white">
                            <table class="table table-bordered table-hover text-center">
                                <thead class="text-center" style="background-color: #EE66A6;">
                                    <tr>
                                        <th class="col-1 text-capitalize">No</th>
                                        <th class="col-2 text-capitalize">Nama Bayi</th>
                                        <th class="col-2 text-capitalize">Nama Ibu</th>
                                        <th class="col-4 text-capitalize">NIK</th>
                                        <th class="col-1 text-capitalize">Anak Ke-</th>
                                        <th class="col-2 text-capitalize">Aksi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    @php
                                    $nomor = 1 + (( $datapemenuhangizidanmakan->currentPage()-1)* $datapemenuhangizidanmakan->perPage());;
                                @endphp
                                    @foreach ($datapemenuhangizidanmakan as $row)
                                    <tr>
                                        <td>{{ $nomor ++ }}</td>
                                        <td>{{ $row->nama_anak }}</td>
                                        <td>{{ $row->nama_ibu }}</td>
                                        <td>{{ $row->nik_ibu }}</td>
                                        <td>{{ $row->anak_ke }}</td>
                                        <td>  <div class="row">
                                            <div class="col-6 text-center">
                                                <button onclick="window.location='{{ url('pemenuhangizidanmakan/'.$row->id) }}'" type="button" class="btn btn-success btn-md" title="Detail">
                                                     <i class="fas fa-list"></i>
                                                </button>
                                               </div>
                                            <div class="col-6 text-center">
                                             <form onsubmit="return deleteData('{{ $row->nama_anak }}')" action="{{ url('pemenuhangizidanmakan/'.$row->id) }}" method="POST"> 
                                              @csrf
                                              @method('DELETE')
                                                 <button type="submit" title="Hapus" class="btn btn-danger btn-md">
                                                  <i class="fa fa-trash-alt"></i>
                                                 </button>
                                            </form>
                                          </div>
                                          
                    
                                        </td>
                                       
                                    </tr>
                                
                                    @endforeach      
                                  
                                </tbody>
                             
                            </table>
                            {!! $datapemenuhangizidanmakan->appends(Request::except('page'))->render() !!}
                        </div>
                    </div>

             
@endsection