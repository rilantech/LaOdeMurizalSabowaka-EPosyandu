@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center fw-bold">Edit Akun Ibu</h4>
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-md-6 mx-auto mt-2">
                        <div class="card border-dark" style="background-color: #4DA8DA; border-radius: 30px 30px 30px 30px; border:solid 3px black;">
                            <form class="form-horizontal" action='{{  url('daftarakunibu/'.$id) }}' method='post'>
                                @csrf
                                @method('PUT')
                                <div class="card-body">
                                   
                                    <div class="form-group">
                                        <label for="nama" class="col-12 fw-bold">Nama</label>
                                        <input type="text" class="form-control  @error('nama') is-invalid @enderror" id="nama"
                                                placeholder="Masukan Nama..." name="nama" value="{{ $nama }}"  autofocus autocomplete="off">
                                                @error('nama')
                                                <div class="invalid-feedback text-dark">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                           
                                    </div>
                                     <div class="form-group">
                                        <label for="nik" class="col-12 fw-bold">NIK</label>
                                        <input type="text" class="form-control  @error('nama') is-invalid @enderror" id="nik"
                                                placeholder="Masukan NIK..." name="nik" value="{{ $nik }}"  autofocus autocomplete="off">
                                                @error('nik')
                                                <div class="invalid-feedback text-dark">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                           
                                    </div>
                                    <div class="form-group">
                                        <label for="username" class="col-12 text-start control-label col-form-label fw-bold">Username</label>
                                        <input type="text" class="form-control  @error('username') is-invalid @enderror" id="username"
                                        placeholder="Masukan Username..." name="username" value="{{ $username }}"  autofocus autocomplete="off">
                                        @error('username')
                                        <div class="invalid-feedback text-dark">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                   
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="col-12 text-start control-label col-form-label fw-bold">Password</label>
                                            <input type="text" class="form-control @error('password') is-invalid @enderror" id="password"
                                                placeholder="Masukan Password..."  name="password" value="{{ $password }}" >
                                                @error('password')
                                                <div class="invalid-feedback text-dark">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                       
                                    </div>
                                    <div class="form-group">
                                      <label for="alamat" class="col-12 text-start control-label col-form-label fw-bold">Alamat</label>
                                          <input type="text" class="form-control @error('alamat') is-invalid @enderror" id="alamat"
                                              placeholder="Masukan Alamat..."  name="alamat" value="{{ $alamat }}" >
                                              @error('alamat')
                                              <div class="invalid-feedback text-dark">
                                                {{ $message }}
                                              </div>
                                          @enderror
                                     
                                  </div>
                                    <div class="form-group">
                                      <label for="nomor_hp" class="col-12 text-start control-label col-form-label fw-bold">Nomor HP</label>
                                          <input type="text" class="form-control @error('nomor_hp') is-invalid @enderror" id="nomor_hp"
                                              placeholder="Masukan Nomor HP..."  name="nomor_hp" value="{{ $nomor_hp }}" >
                                              @error('nomor_hp')
                                              <div class="invalid-feedback text-dark">
                                                {{ $message }}
                                              </div>
                                          @enderror
                                     
                                  </div>
                                </div>
                                <div class="border-top">
                                    <div class="card-body">
                                        <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold bg-success" style="width: 100px;">Simpan</button>
                                    </form>
                                        <button type="button" onclick="window.location='{{ url('daftarakunibu') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 100px; background-color: rgb(255, 251, 13);">Batal</button>
                                    </div>
                                    
                                </div>
                                
                           
                        </div>
                    </div>
                </div>
@endsection