@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center fw-bold">Chatting</h4>
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
             
                <div class="row">
                    <div class="col-md-5 mt-2 mx-auto p-4">
                        <div class="card border-dark" style="background-color: #C7D9DD; border-radius: 10px 10px 10px 10px; border:solid 1px black;">
                          <div class="row ">
                            <div class="col-6 ">
                            
                              <div class="form-group fw-bold">
                                <label for="tempat_atau_tanggal_lahir" class="col-12">Pilih Akun</label>
                                {{-- <form method="get"> --}}
                                <select class="form-select"  aria-label="Default select example" name="pilih_akun" id="nik" onchange="window.history.pushState({}, '', window.location.href='/chatting/?pilih_akun='+this.value)">
                                  <option selected>--Pilih Akun--</option>
                                  <option value="Petugas_Posyandu">Petugas Posyandu</option>
                                  <option value="Ibu_Posyandu">Ibu Posyandu</option>
                                  </select>
                                  
                                {{-- </form> --}}
                              
                               </div>
                            </div>
                          
                              <form class="app-search-form col-6" method="GET" style="margin-top:37px; margin-left:-10px;"> 
                            <div class="input-group">
                                <input type="text" placeholder="Cari Data..." name="search" class="form-control search-input" value="{{ $search }}" id="search" onkeyup="window.history.pushState({}, '', window.location.href='/chatting/?search='+this.value+'&pilih_akun=<?=$pilihanakun;?>')">
                                <button type="button" class="btn search-btn btn-primary" value="Search"><i class=" fas fa-search"></i></button> 
                            </div> 
                                @error('username')
                                    <div class="invalid-feedback">
                                    {{ $message }}
                                    </div>
                                @enderror
                            </form>
                          
                          </div>
                       
                                <div class="card-body data-bs-spy="scroll" style="height: 480px; overflow-y:scroll;" >
                                 
                                    @foreach($akunibu as $row)
                                    <a href="{{ url('chatting/'.$row->id.'?search=&pilih_akun='.$pilihanakun) }}" class="card-hover">
                                      
                                        <div class="d-flex">
                                          <div class="avatar avatar-online">
                                            <span
                                              class="avatar-title rounded-circle border border-white bg-info"
                                              >{{ substr($row->nama, 0, 1) }}</span
                                            >
                                          </div>
                                          <div class="flex-1 ms-3 pt-1">
                                            <h6 class="text-uppercase fw-bold mb-1">
                                              {{ $row->nama }}
                                              {{-- <span class="text-warning ps-3">{{ $row->nomor_hp }}</span> --}}
                                            </h6>
                                            <span class="text-muted"
                                              >
                                              {{ $row->nomor_hp }}
                                          </div>
                                          {{-- <div class="float-end pt-1">
                                            <small class="text-muted">8:40 PM</small>
                                          </div> --}}
                                        </div>
                                        
                                        <div class="separator-dashed"></div>
                                    </a>
                                        @endforeach
                                </div>
                           
                        </div>
                    </div>
                    <div class="col-md-7 mt-2 mx-auto p-4">
                        <div class="card border-dark " style="background-color: #C7D9DD; border-radius: 10px 10px 10px 10px; border:solid 5px black; margin-left:-40px;">
                            <div class="card-header" style="background-color: #C7D9DD;">
                                <div class="card-head-row" >
                                  <div class="col fw-bold text-title">{{ $nama }}</div>
                                                                  
                                </div>
                                <div class="card-head-row">
                                    <div class="col fw-bold">{{ $nomor_hp }}</div>
                                                                    
                                  </div>
                              </div>
                              <div class="card-body"  data-bs-spy="scroll" style="height: 400px; overflow-y:scroll; background-color:white; display:flex;flex-direction: column-reverse;"  id="chatku" >
                                
                                @if($pilihanakun == false)
                                <p>Silahkan Pilih Akun!</p>
                                @else
                                @foreach($chatting as $chat)
                                @if($chat->nomor_hp_pengirim != '081119009287')
                                  <div class="d-flex flex-row justify-content-start" id="cardku">
                                  <div>
                                    <p class="small p-2 ms-3 mb-3 rounded-3" style="background-color: #BFBBA9;">{{ $chat->isi_pesan }}</p>
                                  </div>
                                </div>
                                <div class="d-flex justify-content-between">
                                  <p class="small mb-1 text-muted">{{ $chat->waktu_kirim }}</p>
                                </div>
                              
                                @else
                             
                                <div class="d-flex flex-row justify-content-end mb-4 pt-1" id="cardku">
                                  <div>
                                    <p class="small p-2 me-3 mb-3 text-white rounded-3 bg-warning">
                                      {{ $chat->isi_pesan }}
                                    </p>
                                  </div>
                                  
                                </div>
                                   <div class="d-flex justify-content-between">
                                  <p class="small mb-1 text-muted"></p>
                                  <p class="small mb-1">{{ $chat->waktu_kirim }}</p>
                                </div>
                                @endif
                                  
                                @endforeach
                                @endif
                               

                              </div>
                              <form action="{{ url('chatting/'.$id) }}" method="post" > 
                                @csrf
                                @method('PUT')
                              <div class="card-header"  style="background-color: #C7D9DD;">
                                <div class="card-head-row" >
                                  <input type="text" class="form-control" id="isi_pesan"
                                    placeholder="Ketik Pesan..."  name="pilihan_akun" value="{{ $pilihanakun }}" hidden >
                                  <!--<input type="text" class="form-control" id="isi_pesan"-->
                                  <!--  placeholder="Ketik Pesan..."  name="id_penerima" value="{{ $id }}" hidden >-->
                                  
                                   <div class="col-11">
                                    <input type="text" class="form-control @error('nomor_hp_penerima') is-invalid @enderror" id="nomor_hp_penerima"
                                    placeholder="Ketik Pesan..."  name="nomor_hp_penerima" value="{{ $nomor_hp }}" hidden>
                                    <input type="text" class="form-control @error('isi_pesan') is-invalid @enderror" id="isi_pesan"
                                    placeholder="Ketik Pesan..."  name="isi_pesan" value="{{ old('isi_pesan') }}" >
                                   </div>
                                   <div class="col-1">
                                  
                                    <button type="submit" class="btn btn-transparent"><i>  
                                      <div class="notif-img">
                                      <img
                                        src="{{ asset('templatedwi/img/iconkirim1.png') }}"
                                        alt="Img Profile"
                                        width="30"
                                        height="20"
                                      />
                                    </div></i></button>
                                   </div>
                                    
                                </div>
                              
                              </div>
                            </form>     
                        
                      
                        </div>
                    </div>
                </div>
                <script>
                
                        var timeoutId= setInterval(function () {
                          location.reload(); 
                        }, 1000);
                        
                        document.addEventListener('mousemove', function(){
                            clearTimeout(timeoutId);
                            timeoutId = setInterval(function () {
                            location.reload();
                            //  document.getElementById("chatku").innerHTML=new Date().getSeconds();
                        }, 5000);
                        });
                        
                          document.addEventListener('keypress', function(){
                            clearTimeout(timeoutId);
                            timeoutId = setInterval(function () {
                            location.reload();
                            //  document.getElementById("chatku").innerHTML=new Date().getSeconds();
                        }, 5000);
                        });
                        
                          document.addEventListener('focus', function(){
                            clearTimeout(timeoutId);
                            timeoutId = setInterval(function () {
                            location.reload();
                            //  document.getElementById("chatku").innerHTML=new Date().getSeconds();
                        }, 5000);
                        });
                        
                         document.addEventListener('click', function(){
                            clearTimeout(timeoutId);
                            timeoutId = setInterval(function () {
                            location.reload();
                            //  document.getElementById("chatku").innerHTML=new Date().getSeconds();
                        }, 5000);
                        });
                        
                         document.addEventListener('blur', function(){
                            clearTimeout(timeoutId);
                            timeoutId = setInterval(function () {
                            location.reload();
                            //  document.getElementById("chatku").innerHTML=new Date().getSeconds();
                        }, 5000);
                        });
                    // setInterval(function(){
                   
                    // function autoRefresh(){
                    //     location.reload();
                        
                    // }
                    
                    // setInterval('autoRefresh()', 1000);
                </script>
@endsection