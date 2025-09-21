@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Detail Data KMS</h4>
           
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
        
        

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
                
                <div class="row">
                    <div class="col-md-12 mx-auto mt-2 p-5">
                      {{-- <input type="text" class="form-control  @error('id') is-invalid @enderror" id="nik_ibu"
                      placeholder="Masukan Nama Ibu..." name="id" value="{{ $id }}" autofocus autocomplete="off" hidden> --}}
                                <div class="row ">
                                  <div class="col-6 ">
                                    <div class="form-group">
                                      <label for="nama_ibu" class="col-12 fw-bold">NIK</label>
                                      <form method="get">
                                        <select class="form-select @error('nik') is-invalid @enderror"  aria-label="Default select example" name="nik" id="nik" onchange="this.form.submit()">
                                          <option selected>{{ $nik_ibu }}</option>
                                          @if($dataorangtua1 != null)
                                          @foreach ($dataorangtua1 as $item)
                                          <option value="{{ $item->nik }}">{{ $item->nik }}</option>
                                          @endforeach
                                          @else
                                          <option selected>--Pilih NIK--</option>
                                          @endif
                                          @if($dataorangtua2 != null)
                                          @foreach ($dataorangtua2 as $item1)
                                          <option value="test" {{ old('nik') }} selected>{{ $nik_ibu }}</option>
                                          @endforeach
                                          @endif
  
                                         
                                          </select>
                                          
                                        </form>
                                  </div>
                                     </div>
                                     <div class="col-6 ">
                                      <div class="form-group">
                                        <label for="nama_ibu" class="col-12 fw-bold">Jenis Kelamin</label>
                                        <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"
                                        placeholder="Masukan Jenis Kelamin." name="jenis_kelamin" value="{{ $jenis_kelamin }}" autocomplete="off">
                                        
                                    </div>
                                   
                                    
                                       </div>
                                       
                                     
                                    
                                </div>
                                <form action="{{ url('datakms/'.$id) }}" method='post'>
                                  @csrf
                                  @method('PUT')
                                  <div class="row">
                                    <div class="col-6">
                                      <input type="text" class="form-control  @error('jenis_kelamin') is-invalid @enderror" id="jenis_kelamin"
                                      placeholder="Masukan Nama Ibu..." name="jenis_kelamin" value="{{ $jenis_kelamin }}" autocomplete="off" hidden>
                                      <div class="form-group">
                                        @if($dataorangtua2 != null)
                                        @foreach ($dataorangtua2 as $item1)
                                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $item1->nik }}" autofocus autocomplete="off" hidden>
                                        @endforeach
                                        @else
                                        <input type="text" class="form-control  @error('nik_ibu') is-invalid @enderror" id="nik_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nik_ibu" value="{{ $nik_ibu }}" autofocus autocomplete="off" hidden>
                                        @endif
                                       <label for="nama_ibu" class="col-12 fw-bold">Nama Ibu</label>
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="nama_ibu" value="{{ $nama_ibu }}" autofocus autocomplete="off">
                                        
                                        @error('nama_ibu')
                                        <div class="invalid-feedback">
                                          {{ $message }}
                                        </div>
                                    @enderror
                                    </div>
                                    
                                     </div>
                                     <div class="col-6">
                                     
                                      <div class="form-group">
                                      
                                       <label for="nama_ibu" class="col-12 fw-bold">Status Berat Badan Terakhir</label>
                                        <input type="text" class="form-control  @error('nama_ibu') is-invalid @enderror" id="nama_ibu"
                                        placeholder="Masukan Nama Ibu..." name="" value="{{ $status_bb_terakhir }}" autofocus autocomplete="off">
                                        
                                        @error('nama_ibu')
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
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama Ayah</label>
                                        <input type="text" class="form-control  @error('nama_ayah') is-invalid @enderror" id="nama_ayah"
                                        placeholder="Masukan Nama Ayah..." name="nama_ayah" value="{{ $nama_ayah }}" autofocus autocomplete="off">
                                        @error('nama_ayah')
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
                                        <label for="nama_ibu" class="col-12 fw-bold">Nama Anak</label>
                                        <input type="text" class="form-control  @error('nama_anak') is-invalid @enderror" id="nama_anak"
                                        placeholder="Masukan Nama Anak..." name="nama_anak" value="{{ $nama_anak }}" autofocus autocomplete="off">
                                        @error('nama_anak')
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
                                        <div class="row">
                                          <div class="col-2 mt-3">
                                           <label for="kehamilan_ke" class="col-12 fw-bold">Anak Ke-</label>
                                          </div>
                                          <div class="col-3 mt-3">
                                           <input type="text" class="form-control  @error('anak_ke') is-invalid @enderror" id="anak_ke"
                                           placeholder="" name="anak_ke" value="{{ $anak_ke }}"  autofocus autocomplete="off">
                                          
                                           @error('anak_ke')
                                           <div class="invalid-feedback">
                                             {{ $message }}
                                           </div>
                                       @enderror
                                          </div>
                                         
                                       </div>
                                     
                                    </div>
                                    </div>
                                     
                                  </div>
                                                                
                             
                        </div>
                    </div>
                    
      
                  <!--</div>-->
                
                  <div class="row p-5" style="margin-bottom: 50px; margin-top:-50px;">
                    
                   
                    <div class="col-12">
                      
                      <div class="table-responsive bg-white" >
                        <table class="table table-bordered table-hover text-center" id="tabelku" >
                            <thead class="text-center" style="background-color: #88C273;">
          
                                <tr style="background-color: #88C273;">
                                    <th class="col-1 text-capitalize" colspan="3"  style="background-color: #88C273;">Umur (Bulan)</th>
                                    <th class="col-1 text-capitalize">0</th>
                                    <th class="col-1 text-capitalize">1</th>
                                    <th class="col-1 text-capitalize">2</th>
                                    <th class="col-1 text-capitalize">3</th>
                                    <th class="col-1 text-capitalize">4</th>
                                    <th class="col-1 text-capitalize">5</th>
                                    <th class="col-1 text-capitalize">6</th>
                                    <th class="col-1 text-capitalize">7</th>
                                    <th class="col-1 text-capitalize">8</th>
                                    <th class="col-1 text-capitalize">9</th>
                                    <th class="col-1 text-capitalize">10</th>
                                    <th class="col-1 text-capitalize">11</th>
                                    <th class="col-1 text-capitalize">12</th>
                                    <th class="col-1 text-capitalize">13</th>
                                    <th class="col-1 text-capitalize">14</th>
                                    <th class="col-1 text-capitalize">15</th>
                                    <th class="col-1 text-capitalize">16</th>   
                                    <th class="col-1 text-capitalize">17</th>
                                    <th class="col-1 text-capitalize">18</th>
                                    <th class="col-1 text-capitalize">19</th>
                                    <th class="col-1 text-capitalize">20</th>
                                    <th class="col-1 text-capitalize">21</th>
                                    <th class="col-1 text-capitalize">22</th>
                                    <th class="col-1 text-capitalize">23</th>
                                    <th class="col-1 text-capitalize">24</th>
                                    <th class="col-1 text-capitalize">25</th>
                                    <th class="col-1 text-capitalize">26</th>
                                    <th class="col-1 text-capitalize">27</th>
                                    <th class="col-1 text-capitalize">28</th>
                                    <th class="col-1 text-capitalize">29</th>
                                    <th class="col-1 text-capitalize">30</th>
                                    <th class="col-1 text-capitalize">31</th>
                                    <th class="col-1 text-capitalize">32</th>
                                    <th class="col-1 text-capitalize">33</th> 
                                    <th class="col-1 text-capitalize">34</th>
                                    <th class="col-1 text-capitalize">35</th>
                                    <th class="col-1 text-capitalize">36</th>
                                    <th class="col-1 text-capitalize">37</th>
                                    <th class="col-1 text-capitalize">38</th>
                                    <th class="col-1 text-capitalize">39</th>
                                    <th class="col-1 text-capitalize">40</th>
                                    <th class="col-1 text-capitalize">41</th>
                                    <th class="col-1 text-capitalize">42</th>
                                    <th class="col-1 text-capitalize">43</th>
                                    <th class="col-1 text-capitalize">44</th>
                                    <th class="col-1 text-capitalize">45</th>
                                    <th class="col-1 text-capitalize">46</th>
                                    <th class="col-1 text-capitalize">47</th>
                                    <th class="col-1 text-capitalize">48</th>
                                    <th class="col-1 text-capitalize">49</th>
                                    <th class="col-1 text-capitalize">50</th>   
                                    <th class="col-1 text-capitalize">51</th>
                                    <th class="col-1 text-capitalize">52</th>
                                    <th class="col-1 text-capitalize">53</th>
                                    <th class="col-1 text-capitalize">54</th>
                                    <th class="col-1 text-capitalize">55</th>
                                    <th class="col-1 text-capitalize">56</th>
                                    <th class="col-1 text-capitalize">57</th>
                                    <th class="col-1 text-capitalize">58</th>
                                    <th class="col-1 text-capitalize">59</th>
                                    <th class="col-1 text-capitalize">60</th>
                                 
                                </tr>
                            </thead>
                            <tbody>  
                              <tr>
                                <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                    Bulan Penimbangan
                                </td>
                                  <th><input type="date" class="form-control @error('bulan_penimbangan_0') is-invalid @enderror" id="bulan_penimbangan_0"
                                    placeholder="..." name="bulan_penimbangan_0" value="{{  $bulan_penimbangan_0  }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="date" class="form-control @error('bulan_penimbangan_1') is-invalid @enderror" id="bulan_penimbangan_1"
                                    placeholder="..." name="bulan_penimbangan_1" value="{{  $bulan_penimbangan_1 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_2') is-invalid @enderror" id="bulan_penimbangan_2"
                                    placeholder="..." name="bulan_penimbangan_2" value="{{  $bulan_penimbangan_2 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_3') is-invalid @enderror" id="bulan_penimbangan_3"
                                    placeholder="..." name="bulan_penimbangan_3" value="{{  $bulan_penimbangan_3 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_4') is-invalid @enderror" id="bulan_penimbangan_4"
                                    placeholder="..." name="bulan_penimbangan_4" value="{{  $bulan_penimbangan_4 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_5') is-invalid @enderror" id="bulan_penimbangan_5"
                                    placeholder="..." name="bulan_penimbangan_5" value="{{  $bulan_penimbangan_5 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_6') is-invalid @enderror" id="bulan_penimbangan_6"
                                    placeholder="..." name="bulan_penimbangan_6" value="{{  $bulan_penimbangan_6 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_7') is-invalid @enderror" id="bulan_penimbangan_7"
                                    placeholder="..." name="bulan_penimbangan_7" value="{{  $bulan_penimbangan_7 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_8') is-invalid @enderror" id="bulan_penimbangan_8"
                                    placeholder="..." name="bulan_penimbangan_8" value="{{  $bulan_penimbangan_8 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_9') is-invalid @enderror" id="bulan_penimbangan_9"
                                    placeholder="..." name="bulan_penimbangan_9" value="{{  $bulan_penimbangan_9 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_10') is-invalid @enderror" id="bulan_penimbangan_10"
                                    placeholder="..." name="bulan_penimbangan_10" value="{{  $bulan_penimbangan_10  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_11') is-invalid @enderror" id="bulan_penimbangan_11"
                                    placeholder="..." name="bulan_penimbangan_11" value="{{  $bulan_penimbangan_11  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_12') is-invalid @enderror" id="bulan_penimbangan_12"
                                    placeholder="..." name="bulan_penimbangan_12" value="{{  $bulan_penimbangan_12  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_13') is-invalid @enderror" id="bulan_penimbangan_13"
                                    placeholder="..." name="bulan_penimbangan_13" value="{{  $bulan_penimbangan_13  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_14') is-invalid @enderror" id="bulan_penimbangan_14"
                                    placeholder="..." name="bulan_penimbangan_14" value="{{  $bulan_penimbangan_14  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_15') is-invalid @enderror" id="bulan_penimbangan_15"
                                    placeholder="..." name="bulan_penimbangan_15" value="{{  $bulan_penimbangan_15  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_16') is-invalid @enderror" id="bulan_penimbangan_16"
                                    placeholder="..." name="bulan_penimbangan_16" value="{{  $bulan_penimbangan_16  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="date" class="form-control @error('bulan_penimbangan_17') is-invalid @enderror" id="bulan_penimbangan_17"
                                    placeholder="..." name="bulan_penimbangan_17" value="{{  $bulan_penimbangan_17  }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="date" class="form-control @error('bulan_penimbangan_18') is-invalid @enderror" id="bulan_penimbangan_18"
                                    placeholder="..." name="bulan_penimbangan_18" value="{{  $bulan_penimbangan_18  }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_19') is-invalid @enderror" id="bulan_penimbangan_19"
                                    placeholder="..." name="bulan_penimbangan_19" value="{{  $bulan_penimbangan_19  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_20') is-invalid @enderror" id="bulan_penimbangan_20"
                                    placeholder="..." name="bulan_penimbangan_20" value="{{  $bulan_penimbangan_20  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_21') is-invalid @enderror" id="bulan_penimbangan_21"
                                    placeholder="..." name="bulan_penimbangan_21" value="{{  $bulan_penimbangan_21  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_22') is-invalid @enderror" id="bulan_penimbangan_22"
                                    placeholder="..." name="bulan_penimbangan_22" value="{{  $bulan_penimbangan_22  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_23') is-invalid @enderror" id="bulan_penimbangan_23"
                                    placeholder="..." name="bulan_penimbangan_23" value="{{  $bulan_penimbangan_23  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_24') is-invalid @enderror" id="bulan_penimbangan_24"
                                    placeholder="..." name="bulan_penimbangan_24" value="{{  $bulan_penimbangan_24  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_25') is-invalid @enderror" id="bulan_penimbangan_25"
                                    placeholder="..." name="bulan_penimbangan_25" value="{{  $bulan_penimbangan_25  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_26') is-invalid @enderror" id="bulan_penimbangan_26"
                                    placeholder="..." name="bulan_penimbangan_26" value="{{  $bulan_penimbangan_26  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_27') is-invalid @enderror" id="bulan_penimbangan_27"
                                    placeholder="..." name="bulan_penimbangan_27" value="{{  $bulan_penimbangan_27  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_28') is-invalid @enderror" id="bulan_penimbangan_28"
                                    placeholder="..." name="bulan_penimbangan_28" value="{{  $bulan_penimbangan_28  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_29') is-invalid @enderror" id="bulan_penimbangan_29"
                                    placeholder="..." name="bulan_penimbangan_29" value="{{  $bulan_penimbangan_29  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_30') is-invalid @enderror" id="bulan_penimbangan_30"
                                    placeholder="..." name="bulan_penimbangan_30" value="{{  $bulan_penimbangan_30  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_31') is-invalid @enderror" id="bulan_penimbangan_31"
                                    placeholder="..." name="bulan_penimbangan_31" value="{{  $bulan_penimbangan_31  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_32') is-invalid @enderror" id="bulan_penimbangan_32"
                                    placeholder="..." name="bulan_penimbangan_32" value="{{  $bulan_penimbangan_32  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_33') is-invalid @enderror" id="bulan_penimbangan_33"
                                    placeholder="..." name="bulan_penimbangan_33" value="{{  $bulan_penimbangan_33  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="date" class="form-control @error('bulan_penimbangan_34') is-invalid @enderror" id="bulan_penimbangan_34"
                                    placeholder="..." name="bulan_penimbangan_34" value="{{  $bulan_penimbangan_34  }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="date" class="form-control @error('bulan_penimbangan_35') is-invalid @enderror" id="bulan_penimbangan_35"
                                    placeholder="..." name="bulan_penimbangan_35" value="{{  $bulan_penimbangan_35  }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_36') is-invalid @enderror" id="bulan_penimbangan_36"
                                    placeholder="..." name="bulan_penimbangan_36" value="{{  $bulan_penimbangan_36  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_37') is-invalid @enderror" id="bulan_penimbangan_37"
                                    placeholder="..." name="bulan_penimbangan_37" value="{{  $bulan_penimbangan_37  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_38') is-invalid @enderror" id="bulan_penimbangan_38"
                                    placeholder="..." name="bulan_penimbangan_38" value="{{  $bulan_penimbangan_38  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_39') is-invalid @enderror" id="bulan_penimbangan_39"
                                    placeholder="..." name="bulan_penimbangan_39" value="{{  $bulan_penimbangan_39  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_40') is-invalid @enderror" id="bulan_penimbangan_40"
                                    placeholder="..." name="bulan_penimbangan_40" value="{{  $bulan_penimbangan_40  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_41') is-invalid @enderror" id="bulan_penimbangan_41"
                                    placeholder="..." name="bulan_penimbangan_41" value="{{  $bulan_penimbangan_41  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_42') is-invalid @enderror" id="bulan_penimbangan_42"
                                    placeholder="..." name="bulan_penimbangan_42" value="{{  $bulan_penimbangan_42  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_43') is-invalid @enderror" id="bulan_penimbangan_43"
                                    placeholder="..." name="bulan_penimbangan_43" value="{{  $bulan_penimbangan_43  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_44') is-invalid @enderror" id="bulan_penimbangan_44"
                                    placeholder="..." name="bulan_penimbangan_44" value="{{  $bulan_penimbangan_44  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_45') is-invalid @enderror" id="bulan_penimbangan_45"
                                    placeholder="..." name="bulan_penimbangan_45" value="{{  $bulan_penimbangan_45  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_46') is-invalid @enderror" id="bulan_penimbangan_46"
                                    placeholder="..." name="bulan_penimbangan_46" value="{{  $bulan_penimbangan_46  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_47') is-invalid @enderror" id="bulan_penimbangan_47"
                                    placeholder="..." name="bulan_penimbangan_47" value="{{  $bulan_penimbangan_47  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_48') is-invalid @enderror" id="bulan_penimbangan_48"
                                    placeholder="..." name="bulan_penimbangan_48" value="{{  $bulan_penimbangan_48  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_49') is-invalid @enderror" id="bulan_penimbangan_49"
                                    placeholder="..." name="bulan_penimbangan_49" value="{{  $bulan_penimbangan_49  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_50') is-invalid @enderror" id="bulan_penimbangan_50"
                                    placeholder="..." name="bulan_penimbangan_50" value="{{  $bulan_penimbangan_50  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="date" class="form-control @error('bulan_penimbangan_51') is-invalid @enderror" id="bulan_penimbangan_51"
                                    placeholder="..." name="bulan_penimbangan_51" value="{{  $bulan_penimbangan_51  }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="date" class="form-control @error('bulan_penimbangan_52') is-invalid @enderror" id="bulan_penimbangan_52"
                                    placeholder="..." name="bulan_penimbangan_52" value="{{  $bulan_penimbangan_52  }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_53') is-invalid @enderror" id="bulan_penimbangan_53"
                                    placeholder="..." name="bulan_penimbangan_53" value="{{  $bulan_penimbangan_53  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_54') is-invalid @enderror" id="bulan_penimbangan_54"
                                    placeholder="..." name="bulan_penimbangan_54" value="{{  $bulan_penimbangan_54  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_55') is-invalid @enderror" id="bulan_penimbangan_55"
                                    placeholder="..." name="bulan_penimbangan_55" value="{{  $bulan_penimbangan_55  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_56') is-invalid @enderror" id="bulan_penimbangan_56"
                                    placeholder="..." name="bulan_penimbangan_56" value="{{  $bulan_penimbangan_56  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_57') is-invalid @enderror" id="bulan_penimbangan_57"
                                    placeholder="..." name="bulan_penimbangan_57" value="{{  $bulan_penimbangan_57  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_58') is-invalid @enderror" id="bulan_penimbangan_58"
                                    placeholder="..." name="bulan_penimbangan_58" value="{{  $bulan_penimbangan_58  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_59') is-invalid @enderror" id="bulan_penimbangan_59"
                                    placeholder="..." name="bulan_penimbangan_59" value="{{  $bulan_penimbangan_59  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="date" class="form-control  @error('bulan_penimbangan_60') is-invalid @enderror" id="bulan_penimbangan_60"
                                    placeholder="..." name="bulan_penimbangan_60" value="{{  $bulan_penimbangan_60  }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                 
                                </tr>
                                <tr>
                                  <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                      BB (Kg)
                                  </td>
                                  <th><input type="text" class="form-control @error('bb_0') is-invalid @enderror" id="bb_0"
                                    placeholder="..." name="bb_0" value="{{ $bb_0 }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_1') is-invalid @enderror" id="bb_1"
                                    placeholder="..." name="bb_1" value="{{ $bb_1 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_2') is-invalid @enderror" id="bb_2"
                                    placeholder="..." name="bb_2" value="{{ $bb_2 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_3') is-invalid @enderror" id="bb_3"
                                    placeholder="..." name="bb_3" value="{{ $bb_3 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_4') is-invalid @enderror" id="bb_4"
                                    placeholder="..." name="bb_4" value="{{ $bb_4 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_5') is-invalid @enderror" id="bb_5"
                                    placeholder="..." name="bb_5" value="{{ $bb_5 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_6') is-invalid @enderror" id="bb_6"
                                    placeholder="..." name="bb_6" value="{{ $bb_6 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_7') is-invalid @enderror" id="bb_7"
                                    placeholder="..." name="bb_7" value="{{ $bb_7 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_8') is-invalid @enderror" id="bb_8"
                                    placeholder="..." name="bb_8" value="{{ $bb_8 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_9') is-invalid @enderror" id="bb_9"
                                    placeholder="..." name="bb_9" value="{{ $bb_9 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_10') is-invalid @enderror" id="bb_10"
                                    placeholder="..." name="bb_10" value="{{ $bb_10 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_11') is-invalid @enderror" id="bb_11"
                                    placeholder="..." name="bb_11" value="{{ $bb_11 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_12') is-invalid @enderror" id="bb_12"
                                    placeholder="..." name="bb_12" value="{{ $bb_12 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_13') is-invalid @enderror" id="bb_13"
                                    placeholder="..." name="bb_13" value="{{ $bb_13 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_14') is-invalid @enderror" id="bb_14"
                                    placeholder="..." name="bb_14" value="{{ $bb_14 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_15') is-invalid @enderror" id="bb_15"
                                    placeholder="..." name="bb_15" value="{{ $bb_15 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_16') is-invalid @enderror" id="bb_16"
                                    placeholder="..." name="bb_16" value="{{ $bb_16 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="text" class="form-control @error('bb_17') is-invalid @enderror" id="bb_17"
                                    placeholder="..." name="bb_17" value="{{ $bb_17 }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_18') is-invalid @enderror" id="bb_18"
                                    placeholder="..." name="bb_18" value="{{ $bb_18 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_19') is-invalid @enderror" id="bb_19"
                                    placeholder="..." name="bb_19" value="{{ $bb_19 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_20') is-invalid @enderror" id="bb_20"
                                    placeholder="..." name="bb_20" value="{{ $bb_20 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_21') is-invalid @enderror" id="bb_21"
                                    placeholder="..." name="bb_21" value="{{ $bb_21 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_22') is-invalid @enderror" id="bb_22"
                                    placeholder="..." name="bb_22" value="{{ $bb_22 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_23') is-invalid @enderror" id="bb_23"
                                    placeholder="..." name="bb_23" value="{{ $bb_23 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_24') is-invalid @enderror" id="bb_24"
                                    placeholder="..." name="bb_24" value="{{ $bb_24 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_25') is-invalid @enderror" id="bb_25"
                                    placeholder="..." name="bb_25" value="{{ $bb_25 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_26') is-invalid @enderror" id="bb_26"
                                    placeholder="..." name="bb_26" value="{{ $bb_26 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_27') is-invalid @enderror" id="bb_27"
                                    placeholder="..." name="bb_27" value="{{ $bb_27 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_28') is-invalid @enderror" id="bb_28"
                                    placeholder="..." name="bb_28" value="{{ $bb_28 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_29') is-invalid @enderror" id="bb_29"
                                    placeholder="..." name="bb_29" value="{{ $bb_29 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_30') is-invalid @enderror" id="bb_30"
                                    placeholder="..." name="bb_30" value="{{ $bb_30 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_31') is-invalid @enderror" id="bb_31"
                                    placeholder="..." name="bb_31" value="{{ $bb_31 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_32') is-invalid @enderror" id="bb_32"
                                    placeholder="..." name="bb_32" value="{{ $bb_32 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_33') is-invalid @enderror" id="bb_33"
                                    placeholder="..." name="bb_33" value="{{ $bb_33 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="text" class="form-control @error('bb_34') is-invalid @enderror" id="bb_34"
                                    placeholder="..." name="bb_34" value="{{ $bb_34 }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_35') is-invalid @enderror" id="bb_35"
                                    placeholder="..." name="bb_35" value="{{ $bb_35 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_36') is-invalid @enderror" id="bb_36"
                                    placeholder="..." name="bb_36" value="{{ $bb_36 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_37') is-invalid @enderror" id="bb_37"
                                    placeholder="..." name="bb_37" value="{{ $bb_37 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_38') is-invalid @enderror" id="bb_38"
                                    placeholder="..." name="bb_38" value="{{ $bb_38 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_39') is-invalid @enderror" id="bb_39"
                                    placeholder="..." name="bb_39" value="{{ $bb_39 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_40') is-invalid @enderror" id="bb_40"
                                    placeholder="..." name="bb_40" value="{{ $bb_40 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_41') is-invalid @enderror" id="bb_41"
                                    placeholder="..." name="bb_41" value="{{ $bb_41 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_42') is-invalid @enderror" id="bb_42"
                                    placeholder="..." name="bb_42" value="{{ $bb_42 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_43') is-invalid @enderror" id="bb_43"
                                    placeholder="..." name="bb_43" value="{{ $bb_43 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_44') is-invalid @enderror" id="bb_44"
                                    placeholder="..." name="bb_44" value="{{ $bb_44 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_45') is-invalid @enderror" id="bb_45"
                                    placeholder="..." name="bb_45" value="{{ $bb_45 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_46') is-invalid @enderror" id="bb_46"
                                    placeholder="..." name="bb_46" value="{{ $bb_46 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_47') is-invalid @enderror" id="bb_47"
                                    placeholder="..." name="bb_47" value="{{ $bb_47 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_48') is-invalid @enderror" id="bb_48"
                                    placeholder="..." name="bb_48" value="{{ $bb_48 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_49') is-invalid @enderror" id="bb_49"
                                    placeholder="..." name="bb_49" value="{{ $bb_49 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_50') is-invalid @enderror" id="bb_50"
                                    placeholder="..." name="bb_50" value="{{ $bb_50 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th><input type="text" class="form-control @error('bb_51') is-invalid @enderror" id="bb_51"
                                    placeholder="..." name="bb_51" value="{{ $bb_51 }}"  autofocus autocomplete="off" style="width: 100px;">
                                   
                                 </th>
                                  <th class="col-1"><input type="text" class="form-control @error('bb_52') is-invalid @enderror" id="bb_52"
                                    placeholder="..." name="bb_52" value="{{ $bb_52 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_53') is-invalid @enderror" id="bb_53"
                                    placeholder="..." name="bb_53" value="{{ $bb_53 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_54') is-invalid @enderror" id="bb_54"
                                    placeholder="..." name="bb_54" value="{{ $bb_54 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_55') is-invalid @enderror" id="bb_55"
                                    placeholder="..." name="bb_55" value="{{ $bb_55 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_56') is-invalid @enderror" id="bb_56"
                                    placeholder="..." name="bb_56" value="{{ $bb_56 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_57') is-invalid @enderror" id="bb_57"
                                    placeholder="..." name="bb_57" value="{{ $bb_57 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_58') is-invalid @enderror" id="bb_58"
                                    placeholder="..." name="bb_58" value="{{ $bb_58 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_59') is-invalid @enderror" id="bb_59"
                                    placeholder="..." name="bb_59" value="{{ $bb_59 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                  <th class="col-1">
                                    <input type="text" class="form-control  @error('bb_60') is-invalid @enderror" id="bb_60"
                                    placeholder="..." name="bb_60" value="{{ $bb_60 }}"  autofocus autocomplete="off" style="width: 100px;">
                                  </th>
                                 
                                </tr>
                               
                                  <tr>
                                    <td class="text-start" style="background-color: #88C273;" colspan="3"> 
                                        KBM (Gr)
                                    </td>
                                    <th>
                                     
                                   </th>
                                    <th class="col-1">800</th>
                                    <th class="col-1">
                                     900
                                    </th>
                                    <th class="col-1">
                                     800
                                    </th>
                                    <th class="col-1">
                                    600
                                    </th>
                                    <th class="col-1">
                                      500
                                    </th>
                                    <th class="col-1">
                                     400
                                    </th>
                                    <th class="col-1" colspan="4">
                                     300
                                    </th>
                                    <th class="col-1" colspan="50">
                                      200
                                    </th>
                                  
                                   
                                  </tr>
                                  
                                    <tr>
                                      <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                       N/T
                                      </td>
                                      <th><input type="text" class="form-control @error('nt_0') is-invalid @enderror" id="nt_0"
                                        placeholder="..." name="nt_0" value="{{ $nt_0 }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_1') is-invalid @enderror" id="nt_1"
                                        placeholder="..." name="nt_1" value="{{ $nt_1 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_2') is-invalid @enderror" id="nt_2"
                                        placeholder="..." name="nt_2" value="{{ $nt_2 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_3') is-invalid @enderror" id="nt_3"
                                        placeholder="..." name="nt_3" value="{{ $nt_3 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_4') is-invalid @enderror" id="nt_4"
                                        placeholder="..." name="nt_4" value="{{ $nt_4 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_5') is-invalid @enderror" id="nt_5"
                                        placeholder="..." name="nt_5" value="{{ $nt_5 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_6') is-invalid @enderror" id="nt_6"
                                        placeholder="..." name="nt_6" value="{{ $nt_6 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_7') is-invalid @enderror" id="nt_7"
                                        placeholder="..." name="nt_7" value="{{ $nt_7 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_8') is-invalid @enderror" id="nt_8"
                                        placeholder="..." name="nt_8" value="{{ $nt_8 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_9') is-invalid @enderror" id="nt_9"
                                        placeholder="..." name="nt_9" value="{{ $nt_9 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_10') is-invalid @enderror" id="nt_10"
                                        placeholder="..." name="nt_10" value="{{ $nt_10 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_11') is-invalid @enderror" id="nt_11"
                                        placeholder="..." name="nt_11" value="{{ $nt_11 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_12') is-invalid @enderror" id="nt_12"
                                        placeholder="..." name="nt_12" value="{{ $nt_12 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_13') is-invalid @enderror" id="nt_13"
                                        placeholder="..." name="nt_13" value="{{ $nt_13 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_14') is-invalid @enderror" id="nt_14"
                                        placeholder="..." name="nt_14" value="{{ $nt_14 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_15') is-invalid @enderror" id="nt_15"
                                        placeholder="..." name="nt_15" value="{{ $nt_15 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_16') is-invalid @enderror" id="nt_16"
                                        placeholder="..." name="nt_16" value="{{ $nt_16 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th><input type="text" class="form-control @error('nt_17') is-invalid @enderror" id="nt_17"
                                        placeholder="..." name="nt_17" value="{{ $nt_17 }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_18') is-invalid @enderror" id="nt_18"
                                        placeholder="..." name="nt_18" value="{{ $nt_18 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_19') is-invalid @enderror" id="nt_19"
                                        placeholder="..." name="nt_19" value="{{ $nt_19 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_20') is-invalid @enderror" id="nt_20"
                                        placeholder="..." name="nt_20" value="{{ $nt_20 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_21') is-invalid @enderror" id="nt_21"
                                        placeholder="..." name="nt_21" value="{{ $nt_21 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_22') is-invalid @enderror" id="nt_22"
                                        placeholder="..." name="nt_22" value="{{ $nt_22 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_23') is-invalid @enderror" id="nt_23"
                                        placeholder="..." name="nt_23" value="{{ $nt_23 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_24') is-invalid @enderror" id="nt_24"
                                        placeholder="..." name="nt_24" value="{{ $nt_24 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_25') is-invalid @enderror" id="nt_25"
                                        placeholder="..." name="nt_25" value="{{ $nt_25 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_26') is-invalid @enderror" id="nt_26"
                                        placeholder="..." name="nt_26" value="{{ $nt_26 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_27') is-invalid @enderror" id="nt_27"
                                        placeholder="..." name="nt_27" value="{{ $nt_27 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_28') is-invalid @enderror" id="nt_28"
                                        placeholder="..." name="nt_28" value="{{ $nt_28 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_29') is-invalid @enderror" id="nt_29"
                                        placeholder="..." name="nt_29" value="{{ $nt_29 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_30') is-invalid @enderror" id="nt_30"
                                        placeholder="..." name="nt_30" value="{{ $nt_30 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_31') is-invalid @enderror" id="nt_31"
                                        placeholder="..." name="nt_31" value="{{ $nt_31 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_32') is-invalid @enderror" id="nt_32"
                                        placeholder="..." name="nt_32" value="{{ $nt_32 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_33') is-invalid @enderror" id="nt_33"
                                        placeholder="..." name="nt_33" value="{{ $nt_33 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th><input type="text" class="form-control @error('nt_34') is-invalid @enderror" id="nt_34"
                                        placeholder="..." name="nt_34" value="{{ $nt_34 }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_35') is-invalid @enderror" id="nt_35"
                                        placeholder="..." name="nt_35" value="{{ $nt_35 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_36') is-invalid @enderror" id="nt_36"
                                        placeholder="..." name="nt_36" value="{{ $nt_36 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_37') is-invalid @enderror" id="nt_37"
                                        placeholder="..." name="nt_37" value="{{ $nt_37 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_38') is-invalid @enderror" id="nt_38"
                                        placeholder="..." name="nt_38" value="{{ $nt_38 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_39') is-invalid @enderror" id="nt_39"
                                        placeholder="..." name="nt_39" value="{{ $nt_39 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_40') is-invalid @enderror" id="nt_40"
                                        placeholder="..." name="nt_40" value="{{ $nt_40 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_41') is-invalid @enderror" id="nt_41"
                                        placeholder="..." name="nt_41" value="{{ $nt_41 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_42') is-invalid @enderror" id="nt_42"
                                        placeholder="..." name="nt_42" value="{{ $nt_42 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_43') is-invalid @enderror" id="nt_43"
                                        placeholder="..." name="nt_43" value="{{ $nt_43 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_44') is-invalid @enderror" id="nt_44"
                                        placeholder="..." name="nt_44" value="{{ $nt_44 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_45') is-invalid @enderror" id="nt_45"
                                        placeholder="..." name="nt_45" value="{{ $nt_45 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_46') is-invalid @enderror" id="nt_46"
                                        placeholder="..." name="nt_46" value="{{ $nt_46 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_47') is-invalid @enderror" id="nt_47"
                                        placeholder="..." name="nt_47" value="{{ $nt_47 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_48') is-invalid @enderror" id="nt_48"
                                        placeholder="..." name="nt_48" value="{{ $nt_48 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_49') is-invalid @enderror" id="nt_49"
                                        placeholder="..." name="nt_49" value="{{ $nt_49 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_50') is-invalid @enderror" id="nt_50"
                                        placeholder="..." name="nt_50" value="{{ $nt_50 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th><input type="text" class="form-control @error('nt_51') is-invalid @enderror" id="nt_51"
                                        placeholder="..." name="nt_51" value="{{ $nt_51 }}"  autofocus autocomplete="off" style="width: 100px;">
                                       
                                     </th>
                                      <th class="col-1"><input type="text" class="form-control @error('nt_52') is-invalid @enderror" id="nt_52"
                                        placeholder="..." name="nt_52" value="{{ $nt_52 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_53') is-invalid @enderror" id="nt_53"
                                        placeholder="..." name="nt_53" value="{{ $nt_53 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_54') is-invalid @enderror" id="nt_54"
                                        placeholder="..." name="nt_54" value="{{ $nt_54 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_55') is-invalid @enderror" id="nt_55"
                                        placeholder="..." name="nt_55" value="{{ $nt_55 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_56') is-invalid @enderror" id="nt_56"
                                        placeholder="..." name="nt_56" value="{{ $nt_56 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_57') is-invalid @enderror" id="nt_57"
                                        placeholder="..." name="nt_57" value="{{ $nt_57 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_58') is-invalid @enderror" id="nt_58"
                                        placeholder="..." name="nt_58" value="{{ $nt_58 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_59') is-invalid @enderror" id="nt_59"
                                        placeholder="..." name="nt_59" value="{{ $nt_59 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      <th class="col-1">
                                        <input type="text" class="form-control  @error('nt_60') is-invalid @enderror" id="nt_60"
                                        placeholder="..." name="nt_60" value="{{ $nt_60 }}"  autofocus autocomplete="off" style="width: 100px;">
                                      </th>
                                      </tr>
                                      <tr>
                                        <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         ASI Eksklusif
                                        </td>
                                        <th><input type="text" class="form-control @error('asi_eksklusif_0') is-invalid @enderror" id="asi_eksklusif_0"
                                          placeholder="..." name="asi_eksklusif_0" value="{{ $asi_eksklusif_0 }}"  autofocus autocomplete="off" style="width: 100px;">
                                         
                                       </th>
                                        <th class="col-1"><input type="text" class="form-control @error('asi_eksklusif_1') is-invalid @enderror" id="asi_eksklusif_1"
                                          placeholder="..." name="asi_eksklusif_1" value="{{ $asi_eksklusif_1 }}"  autofocus autocomplete="off" style="width: 100px;"></th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_2') is-invalid @enderror" id="asi_eksklusif_2"
                                          placeholder="..." name="asi_eksklusif_2" value="{{ $asi_eksklusif_2 }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_3') is-invalid @enderror" id="asi_eksklusif_3"
                                          placeholder="..." name="asi_eksklusif_3" value="{{ $asi_eksklusif_3 }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_4') is-invalid @enderror" id="asi_eksklusif_4"
                                          placeholder="..." name="asi_eksklusif_4" value="{{ $asi_eksklusif_4 }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_5') is-invalid @enderror" id="asi_eksklusif_5"
                                          placeholder="..." name="asi_eksklusif_5" value="{{ $asi_eksklusif_5 }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
                                        <th class="col-1">
                                          <input type="text" class="form-control  @error('asi_eksklusif_6') is-invalid @enderror" id="asi_eksklusif_6"
                                          placeholder="..." name="asi_eksklusif_6" value="{{ $asi_eksklusif_6 }}"  autofocus autocomplete="off" style="width: 100px;">
                                        </th>
            
                                        <th class="col-1" colspan="54">
                                          
                                        </th>
                                      
                                       
                                         
                                        </tr>
                                        
                                          <tr>
                                        <td class="text-start" style="background-color: #88C273;" colspan="3" > 
                                         Status Berat Badan
                                        </td>
                                        <td>{{ $status_berat_badan_0 }}</td>
                                        <td>{{ $status_berat_badan_1 }}</td>
                                        <td>{{ $status_berat_badan_2 }}</td>
                                        <td>{{ $status_berat_badan_3 }}</td>
                                        <td>{{ $status_berat_badan_4 }}</td>
                                        <td>{{ $status_berat_badan_5 }}</td>
                                        <td>{{ $status_berat_badan_6 }}</td>
                                        <td>{{ $status_berat_badan_7 }}</td>
                                        <td>{{ $status_berat_badan_8 }}</td>
                                        <td>{{ $status_berat_badan_9 }}</td>
                                        <td>{{ $status_berat_badan_10 }}</td>
                                        <td>{{ $status_berat_badan_11 }}</td>
                                        <td>{{ $status_berat_badan_12 }}</td>
                                        <td>{{ $status_berat_badan_13 }}</td>
                                        <td>{{ $status_berat_badan_14 }}</td>
                                        <td>{{ $status_berat_badan_15 }}</td>
                                        <td>{{ $status_berat_badan_16 }}</td>
                                        <td>{{ $status_berat_badan_17 }}</td>
                                        <td>{{ $status_berat_badan_18 }}</td>
                                        <td>{{ $status_berat_badan_19 }}</td>
                                        <td>{{ $status_berat_badan_20 }}</td>
                                        <td>{{ $status_berat_badan_21 }}</td>
                                        <td>{{ $status_berat_badan_22 }}</td>
                                        <td>{{ $status_berat_badan_23 }}</td>
                                        <td>{{ $status_berat_badan_24 }}</td>
                                        <td>{{ $status_berat_badan_25 }}</td>
                                        <td>{{ $status_berat_badan_26 }}</td>
                                        <td>{{ $status_berat_badan_27 }}</td>
                                        <td>{{ $status_berat_badan_28 }}</td>
                                        <td>{{ $status_berat_badan_29 }}</td>
                                        <td>{{ $status_berat_badan_30 }}</td>
                                        <td>{{ $status_berat_badan_31 }}</td>
                                        <td>{{ $status_berat_badan_32 }}</td>
                                        <td>{{ $status_berat_badan_33 }}</td>
                                        <td>{{ $status_berat_badan_34 }}</td>
                                        <td>{{ $status_berat_badan_35 }}</td>
                                        <td>{{ $status_berat_badan_36 }}</td>
                                        <td>{{ $status_berat_badan_37 }}</td>
                                        <td>{{ $status_berat_badan_38 }}</td>
                                        <td>{{ $status_berat_badan_39 }}</td>
                                        <td>{{ $status_berat_badan_40 }}</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                      
                                         
                                        </tr>
                          
                          
                            </tbody>
                         
                        </table>
                    
                    </div>
                    <br>
                    <div class="card-body text-center" style="margin-top: 20px;">
                      <div class="row" style="">
                        <div class="col-1">
                          <button type="submit" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color:#88C273;">Simpan</button>
                       
                        </div>
                   
                        <div class="col-1" style="margin-left: 100px;">
                          <button type="button" onclick="window.location='{{ url('datakms') }}'" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; background-color: #F87A53;">Batal</button>
                        </form>
                        </div>

                        <div class="col-1" style="margin-left: 5px;">
                          <a href="{{ url('cetakdatakms/'.$id) }}" class="btn btn-outline-dark rounded-pill fw-bold" style="width: 150px; margin-left:100px; background-color: #4DA8DA;" target="_blank">Export</a>
                        </div>

                       
                      </div>
                       
                       
                    </div>
                    <div class="card-body bg-white">
                      <div class="chart-container" style="min-height: 375px">
                        <canvas id="chart"></canvas>
                        
                      </div>
                      <div id="myChartLegend"></div>
                    </div>
                    <div class="card-body bg-white mt-3">
                      <div class="chart-container" style="min-height: 375px">
                        <canvas id="chart2"></canvas>
                        
                      </div>
                      <div id="myChartLegend"></div>
                    </div>
        
                  </div>
                  <script
                  src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.js">
                  </script>
                  <script>
                        const ctx = document.getElementById("chart").getContext('2d');
                        const myChart = new Chart(ctx, {
                          type: 'line',
                          data: {
                            labels: ["0", "1", "2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                                     "13", "14", "15","16", "17", "18", "19", "20", "21", "22", "23", "24"
                            ],
                            datasets: [{
                              label: 'BB',
                              backgroundColor: 'transparent',
                              borderColor: 'rgb(47, 128, 237)',
                              data: [{{ $bb_0 }}, {{ $bb_1 }}, {{ $bb_2 }}, {{ $bb_3 }}, {{ $bb_4 }}, {{ $bb_5 }}, {{ $bb_6 }},
                                     {{ $bb_7 }}, {{ $bb_8 }}, {{ $bb_9 }}, {{ $bb_10 }}, {{ $bb_11 }}, {{ $bb_12 }}, {{ $bb_13 }},
                                     {{ $bb_14 }}, {{ $bb_15 }}, {{ $bb_16 }}, {{ $bb_17 }}, {{ $bb_18 }}, {{ $bb_19 }}, {{ $bb_20 }},
                                     {{ $bb_21 }}, {{ $bb_22 }}, {{ $bb_23 }}, {{ $bb_24 }}
                              ],
                            }]
                          },
                          options: {
                            title: {
                                display: true,
                                text: 'Grafik Data KMS Umur 0 - 24 Bulan',
                                position: 'top',
                                fontSize: 20,
                            },
                            scales: {
                              yAxes: [{
                                ticks: {
                                  beginAtZero: true,
                                },
                                
                              scaleLabel:{
                                display: true,
                                labelString: 'Berat Badan (Kg)'
                              }
                              }
                            ],
                            xAxes: [{
                              scaleLabel:{
                                display: true,
                                labelString: 'Umur (Bulan)'
                              }
                              }
                            ],
                            }
                          },
                        });

                    const ctx2 = document.getElementById("chart2").getContext('2d');
                    const myChart2 = new Chart(ctx2, {
                      type: 'line',
                      data: {
                        labels: ["24", "25", "26","27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
                                 "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
                                 "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"

                        ],
                        datasets: [{
                          label: 'BB',
                          backgroundColor: 'transparent',
                          borderColor: 'rgb(47, 128, 237)',
                          data: [{{ $bb_24 }}, {{ $bb_25 }}, {{ $bb_26 }}, {{ $bb_27 }}, {{ $bb_28 }}, {{ $bb_29 }}, {{ $bb_30 }},
                                 {{ $bb_31 }}, {{ $bb_32 }}, {{ $bb_33 }}, {{ $bb_34 }}, {{ $bb_35 }}, {{ $bb_36 }}, {{ $bb_37 }},
                                 {{ $bb_38 }}, {{ $bb_39 }}, {{ $bb_40 }}, {{ $bb_41 }}, {{ $bb_42 }}, {{ $bb_43 }}, {{ $bb_44 }},
                                 {{ $bb_45 }}, {{ $bb_46 }}, {{ $bb_47 }}, {{ $bb_48 }}, {{ $bb_49 }}, {{ $bb_50 }}, {{ $bb_51 }}, 
                                 {{ $bb_52 }}, {{ $bb_53 }}, {{ $bb_54 }}, {{ $bb_55 }}, {{ $bb_56 }}, {{ $bb_57 }}, {{ $bb_58 }}, {{ $bb_59 }}, {{ $bb_60 }},  
                          ],
                        }]
                      },
                      options: {
                        title: {
                            display: true,
                            text: 'Grafik Data KMS Umur 24 - 60 Bulan',
                            position: 'top',
                            fontSize: 20,
                        },
                        scales: {
                          yAxes: [{
                            ticks: {
                              beginAtZero: false,
                              min: 8
                            },
                            
                          scaleLabel:{
                            display: true,
                            labelString: 'Berat Badan (Kg)'
                          }
                          }
                        ],
                        xAxes: [{
                          scaleLabel:{
                            display: true,
                            labelString: 'Umur (Bulan)'
                          }
                          }
                        ],
                        }
                      },
                    });
                  </script>
                 
        
    
@endsection