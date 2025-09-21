@extends('layout.templatehalamanlogin')

@section('halaman')
<div class="container-fluid ">
    <div class="row">
        <div class="col-sm-6 mx-auto">
            <!-- Authentication card start -->
            <div class="login-card card-block auth-body">
                <form class="md-float-material" action="/login" method="post" >
                    @csrf
                    <div class="row m-b-5">
                        <div class="col-md-12 text-center">
                            <h3 class="text-center text-white">Aplikasi Bidan Koordinator</h3>
                            <h3 class="text-center text-white">E-Posyandu Marawali</h3>
                          
                        </div>
                    </div>
                 
                    <div class="auth-box col-9 mx-auto rounded-5" style="background-color:  white; border:5px black solid; height:450px; border-radius:50px;">
                        <div class="row m-b-15">
                            <div class="col-12 text-center">
                                <img 
                            
                            src="{{ asset('templatedwi/img/logopuskesmas.png') }}"
                            alt="Img Profile"
                            width="100"
                            height="100"
                          />
                            </div>
                        </div>
                        @if (session()->has('msg'))
          
                        <div class="alert alert-success alert-dismissible col-xl-12 col-sm-6 fade show mb-2" role="alert">
                              {{ session('msg') }}
                              <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                        </div>
                        @endif
                        @if (session()->has('loginError'))
                        <div class="alert alert-danger alert-dismissible fade show col-xl-12 col-sm-12 " role="alert">
                            {{ session('loginError') }}
                            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                        </div>
                                       
                       @endif

                        <div class="input-group form-outline" style="margin-top: 50px;">
                            <input type="text" class="form-control @error('username') is-invalid @enderror " autofocus value="{{ old('username') }}"  placeholder="Masukan Username" name="username">
                            @error('username')
                            <div class="invalid-feedback">
                                {{ $message }}
                            </div>
                            @enderror
                        </div>
                        <div class="input-group">
                            <input type="password" class="form-control @error('password') is-invalid @enderror"  value="{{ old('password') }}"  placeholder="Masukan Password" id="password" name="password">
                            @error('password')
                            <div class="invalid-feedback">
                                {{ $message }}
                            </div>
                        
                            @enderror
                        </div>
                        
                    
                        <div class="row m-t-30 text-left">
                            <div class="col-sm-6 col-xs-12">
                                <div class="checkbox-fade fade-in-primary ">
                                    <label>
                                        <input type="checkbox" value="" onclick="myFunction()">Tampilkan Password
                                        <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                      
                                    </label>
                                </div>
                            </div>
                          
                        </div>
                        <script>
                            function myFunction() {
                                var x = document.getElementById("password");
                                if (x.type === "password") {
                                    x.type = "text";
                                } else {
                                    x.type = "password";
                                }
                            }
                        </script>
                        <div class="row m-t-50" style="margin-top: 20px;">
                            <div class="col-md-12">
                                <button type="submit" class="btn btn-outline-dark btn-md btn-block waves-effect text-center text-white m-b-20 rounded-pill" style="background-color: #4791D1;">Login</button>
                            </div>
                           
                        </div>
                        
                        
                       
                    </div>
                </form>
                <!-- end of form -->
            </div>
            <!-- Authentication card end -->
        </div>
        <!-- end of col-sm-12 -->
    </div>
    <!-- end of row -->
</div>
@endsection

