@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center">Tambah Jadwal Posyandu</h4>
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-md-6 mx-auto mt-2">
                        <div class="card" style="background-color: #4791D1;">
                            <form class="form-horizontal" action='{{  url('jadwalposyandu') }}' method='post'>
                                @csrf
                                <div class="card-body">
                                   
                                    <div class="form-group">
                                        <label for="agenda" class="col-12">Nama Agenda</label>
                                        <input type="text" class="form-control  @error('agenda') is-invalid @enderror" id="agenda"
                                                placeholder="Masukan agenda" name="agenda" value="{{ old('agenda') }}"  autofocus autocomplete="off">
                                                @error('agenda')
                                                <div class="invalid-feedback text-success">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                           
                                    </div>
                                    <div class="form-group">
                                        <label for="tanggal" class="col-12 text-start control-label col-form-label">Tanggal Pelaksanaan</label>
                                        <input id="datepicker" name="tanggal" class="form-fontrol @error('tanggal') is-invalid @enderror">
                                        @error('tanggal')
                                      <div class="invalid-feedback text-success">
                                        {{ $message }}
                                      </div>
                                  @enderror
                                       <script>
                                       
                                  $('#datepicker').datepicker({
                                      uiLibrary: 'bootstrap5',
                                       format: 'dd-mm-yyyy'
                                  });
                                  
                                     $('#update-form').bootstrapValidator({
                                      fields: {
                                        tanggal_kirim: {
                                          validators: {
                                            notEmpty: {
                                              message: 'timervalue is required'
                                            },
                                            between: {
                                              min: 1,
                                              max: 100,
                                              message: 'Number of minutes must be between 1 and 100.'
                                            }
                                          }
                                        }
                                      }
                                    });
                              
                              
                              </script>
                                    
                                       
                                    </div>
                                    <div class="form-group">
                                        <label for="jam" class="col-12 text-start control-label col-form-label">Jam Pelaksanaan</label>
                                            <input type="time" class="form-control @error('jam') is-invalid @enderror" id="lname"
                                                placeholder="Masukan Jam Pelaksanaan"  name="jam" value="{{ old('jam') }}" >
                                                @error('jam')
                                                <div class="invalid-feedback text-success">
                                                  {{ $message }}
                                                </div>
                                            @enderror
                                       
                                    </div>
                                </div>
                                <div class="border-top">
                                    <div class="card-body">
                                        <button type="submit" class="btn btn-success border-bordered">Simpan</button>
                                    </form>
                                        <button type="button" onclick="window.location='{{ url('jadwalposyandu') }}'" class="btn btn-warning">Batal</button>
                                    </div>
                                    
                                </div>
                                
                           
                        </div>
                    </div>
                </div>
@endsection