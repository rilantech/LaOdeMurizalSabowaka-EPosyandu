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
                            <h5 class="card-title text-center">Data Imunisasi Anak</h5>  
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
                          <form class="app-search-form col-4 mt-3" method="GET"> 
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
                        
                            <div class="form-group col-4" style="margin-top:-25px;">
                                <label for="agama_ibu">Pilih Data</label>
                                    <select class="form-select @error('agama_ibu') is-invalid @enderror"  aria-label="Default select example" name="agama_ibu" id="agama_ibu" onchange="pindahHalaman(this.value)">
                                          <option selected>--Pilih Data Kesehatan Anak--</option>
                                          <option value= "/kesehatanbayibarulahir" {{ old('agama_ibu') }}>Kesehatan Bayi Baru Lahir</option>
                                          <option value= "/imunisasianak" {{ old('agama_ibu') }}>Imunisasi Anak</option>
                                          <option value= "/pemberianvitamindanobatcacing" {{ old('agama_ibu') }}>Pemberian Vitamin A & Obat Cacing</option>
                                          <!--<option value= "/matriksperkembangananak" {{ old('agama_ibu') }}>Matriks Pemantauan Perkembangan Anak</option>-->
                                          <option value= "/datakms" {{ old('agama_ibu') }}>Data KMS</option>
                                    </select>
                                          @error('agama_ibu')
                                          <div class="invalid-feedback">
                                            {{ $message }}
                                          </div>
                                      @enderror
                        
                        </div>

                        <div class="col-4">
                            <button type="button" class="btn btn-outline-dark rounded-pill fw-bold text-white" style="background-color: #4DA8DA;margin-left: 250px;" onclick="window.location='{{ url('/tambahdataimunisasianak') }}';" style="margin-left: 75px; background-color: #EE66A6;">Tambah</button>
                        </div>
                        </div>
                        </div>
                       <div class="card-body">
                        <div class="table-responsive bg-white">
                            <table class="table table-bordered table-hover text-center">
                                <thead class="text-center" style="background-color: #4DA8DA;">
                                    <tr>
                                         <th class="col-1 text-capitalize" style="width:20px;padding:0px;">No</th>
                                        <th class="col-3 text-capitalize">Nama Bayi</th>
                                        <th class="col-3 text-capitalize">Nama Ibu</th>
                                        <th class="col-2 text-capitalize">Nama Ayah</th>
                                        <th class="col-1 text-capitalize">Anak Ke-</th>
                                        <th class="col-2 text-capitalize">Aksi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    @php
                                    $nomor = 1 + (( $dataimunisasianak->currentPage()-1)* $dataimunisasianak->perPage());;
                                @endphp
                                    @foreach ($dataimunisasianak as $row)
                                    <tr>
                                        <td>{{ $nomor ++ }}</td>
                                        <td>{{ $row->nama_anak }}</td>
                                        <td>{{ $row->nama_ibu }}</td>
                                        <td>{{ $row->nama_ayah }}</td>
                                        <td>{{ $row->anak_ke }}</td>
                                        <td>  <div class="row">
                                            <div class="col-6 text-center">
                                                <button onclick="window.location='{{ url('imunisasianak/'.$row->id) }}'" type="button" class="btn btn-success btn-md" title="Detail">
                                                     <i class="fas fa-list"></i>
                                                </button>
                                               </div>
                                            <div class="col-6 text-center">
                                             <form onsubmit="return deleteData('{{ $row->nama_anak }}')" action="{{ url('imunisasianak/'.$row->id) }}" method="POST"> 
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
                            {!! $dataimunisasianak->appends(Request::except('page'))->render() !!}
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