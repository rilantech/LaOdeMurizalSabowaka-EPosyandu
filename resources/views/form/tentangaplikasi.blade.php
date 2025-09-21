@extends('layout.template')    
@section('judul')

        <div class="col-12 mt-4">
            <h4 class="text-center fw-bold">Tentang Aplikasi</h4>
        </div>

@endsection
@section('konten')
<!-- ============================================================== -->
                <!-- Sales Cards  -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-md-10 mx-auto mt-2">
                        <div class="card border-dark" style="background-color: white; border-radius: 30px 30px 30px 30px; border:solid 1px black;">
                            <form class="form-horizontal" action='{{  url('daftarakunibu') }}' method='post'>
                                @csrf
                                <div class="card-body">
                                 <p style="text-align: justify;">
                                    Aplikasi E-Posyandu ini dapat membantu petugas dalam melakukan proses pencatatan hasil pemeriksaan ibu dan anak yang sebelumnya menggunakan buku KIA diubah menjadi sistem aplikasi yang dapat mengamankan data dari kerusakan dan kehilangan. Selain itu, aplikasi ini juga dapat memberikan kemudahan bagi ibu dalam mengakses informasi jadwal pelaksanaan Posyandu dan informasi perkembangan kesehatan ibu dan anak secara realtime kapanpun dan dimanapun ibu berada dikarenakan sistem penyampaian melalui notifikasi interaktif smartphone. Serta, aplikasi ini terdapat fitur chatting yang membantu ibu dalam melakukan konsultasi pada petugas Posyandu tanpa harus menunggu waktu pelaksanaan Posyandu.
                                 </p>
                                </div>
                      
                        </div>
                    </div>
                </div>
@endsection