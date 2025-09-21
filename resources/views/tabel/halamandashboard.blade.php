@extends('layout.template')    

{{-- @section('judul')
<div class="page-breadcrumb">
    <div class="row">
        <div class="col-12 d-flex no-block align-items-center">
            <h4 class="page-title">Beranda</h4>
           
        </div>
    </div>
</div>
@endsection --}}
@section('konten')


<div class="page-inner">
    <div
      class="d-flex align-items-left align-items-md-center flex-column flex-md-row pt-2 pb-4"
    >
      
    </div>
      <div class="row">
                    <div class="col-md-12 mt-2">
                        <div class="card border-dark" style="background-color: succes;  border-radius: 10px 10px 10px 10px; border:solid 1px black;">
                            <form class="form-horizontal" action='{{  url('daftarakunibu') }}' method='post'>
                                @csrf
                                <div class="card-body">
                                 <p style="text-align: justify;">
                                    Selamat Datang Di Sistem Bidan Koordinator (BiKor) E-Posyandu Desa Marawali !
                                 </p>
                                </div>
                      
                        </div>
                    </div>
    </div>
    <div class="row">
      <div class="col-sm-6 col-md-3">
        <div class="card card-stats card-round">
          <div class="card-body">
                <p class="card-category">Jumlah Ibu Posyandu</p>
            
            <div class="row align-items-center">
              <div class="col-icon">
                <div
                  class="icon-big text-center icon-primary bubble-shadow-small"
                >
                  <i> <div class="notif-img">
                    <img
                      src="{{ asset('templatedwi/img/icondaftarakunibu.png') }}"
                      alt="Img Profile"
                      width="50"
                      height="50"
                    />
                  </div></i>
                </div>
              </div>
              <div class="col col-stats ms-3 ms-sm-0">
                <div class="numbers">
                  <h4 class="card-title">{{ $jumlahibuposyandu }}</h4>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-3">
        <div class="card card-stats card-round">
          <div class="card-body">
                <p class="card-category">Jumlah Anak</p>
             
            <div class="row align-items-center">
              <div class="col-icon">
                <div
                  class="icon-big text-center icon-info bubble-shadow-small"
                >
                  <i>  <div class="notif-img">
                    <img
                      src="{{ asset('templatedwi/img/icondatakesehatananak.png') }}"
                      alt="Img Profile"
                      width="50"
                      height="50"
                    />
                  </div></i>
                </div>
              </div>
              <div class="col col-stats ms-3 ms-sm-0">
                <div class="numbers">
                  <h4 class="card-title">{{ $jumlahdataanak }}</h4>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-3">
        <div class="card card-stats card-round">
          <div class="card-body">
                <p class="card-category">Jumlah Ibu Hamil</p>
            <div class="row align-items-center">
              <div class="col-icon">
                <div
                  class="icon-big text-center icon-primary bubble-shadow-small"
                >
                  <i>
                    <div class="notif-img">
                      <img
                        src="{{ asset('templatedwi/img/iconibuhamil.png') }}"
                        alt="Img Profile"
                        width="50"
                        height="50"
                      />
                    </div>
                  </i>
                </div>
              </div>
              <div class="col col-stats ms-3 ms-sm-0">
                <div class="numbers">
                  <h4 class="card-title">{{ $jumlahibuhamil }}</h4>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    
        <div class="col-sm-6 col-md-3">
        <div class="card card-stats card-round">
          <div class="card-body">
                <p class="card-category">Jumlah Ibu Bersalin</p>
             
            <div class="row align-items-center">
              <div class="col-icon">
                <div
                  class="icon-big text-center icon-info bubble-shadow-small"
                >
                  <i><div class="notif-img">
                    <img
                      src="{{ asset('templatedwi/img/iconibubersalin.png') }}"
                      alt="Img Profile"
                      width="50"
                      height="50"
                    />
                  </div></i>
                </div>
              </div>
              <div class="col col-stats ms-3 ms-sm-0">
                <div class="numbers">
                  <h4 class="card-title">{{ $jumlahibubersalin }}</h4>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      
        <div class="col-sm-6 col-md-3">
        <div class="card card-stats card-round">
          <div class="card-body">
                <p class="card-category">Jumlah Ibu Nifas</p>
             
            <div class="row align-items-center">
              <div class="col-icon">
                <div
                  class="icon-big text-center icon-success bubble-shadow-small"
                >
                  <i><div class="notif-img">
                    <img
                      src="{{ asset('templatedwi/img/iconibumelahirkan.png') }}"
                      alt="Img Profile"
                      width="50"
                      height="50"
                    />
                  </div></i>
                </div>
              </div>
              <div class="col col-stats ms-3 ms-sm-0">
                <div class="numbers">
                  <h4 class="card-title">{{ $jumlahibunifas }}</h4>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      
        <div class="col-sm-6 col-md-3">
        <div class="card card-stats card-round">
          <div class="card-body">
                <p class="card-category">Jumlah Kematian Anak</p>
             
            <div class="row align-items-center">
              <div class="col-icon">
                <div
                  class="icon-big text-center icon-secondary bubble-shadow-small"
                >
                  <i><div class="notif-img">
                    <img
                      src="{{ asset('templatedwi/img/iconkematiananak.png') }}"
                      alt="Img Profile"
                      width="50"
                      height="50"
                    />
                  </div></i>
                </div>
              </div>
              <div class="col col-stats ms-3 ms-sm-0">
                <div class="numbers">
                  <h4 class="card-title">{{ $jumlahkematiananak }}</h4>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
       
      
    </div>
    
   
    <div class="row">
                <div class="col-12 mb-4">
                    <h5 class="card-title text-center">Grafik Data Keseluruhan Posyandu Marawali</h5>  
                </div> 
                        
                </div>
    <!--<div class="row">-->
    <!--    <div class="col-12">-->
    <!--        <div class="card-body bg-white">-->
    <!--                  <div class="chart-container" style="min-height: 375px;">-->
    <!--                    <canvas id = "sampleChart"> </canvas>-->
    <!--                    <div id = "output"> </div>-->
                        
    <!--                  </div>-->
                      <!--<div id="myChartLegend"></div>-->
    <!--                </div>-->
    <!--    </div>-->
         
    <!--</div>-->
     <div class="row">
          <div class="card-body bg-white mt-3">
                      <div class="chart-container" style="min-height: 50px">
                        <canvas id="chart1"></canvas>
                        
                      </div>
                      <div id="myChartLegend"></div>
                    </div>
        </div>
    
     <div class="row">
                <div class="col-12 mb-4">
                    <h5 class="card-title text-center">Grafik Data Kematian Anak</h5>  
                </div> 
                        
                </div>
    <div class="row">
          <div class="card-body bg-white mt-3">
                      <div class="chart-container" style="min-height: 375px">
                        <canvas id="chart2"></canvas>
                        
                      </div>
                      <div id="myChartLegend"></div>
                    </div>
        </div>
        
        
         
    </div>
   
    <!--<div class="row">-->
    <!--  <div class="col-md-8">-->
    <!--    <div class="card card-round">-->
    <!--      <div class="card-header">-->
    <!--        <div class="card-head-row">-->
    <!--          <div class="card-title">User Statistics</div>-->
    <!--          <div class="card-tools">-->
    <!--            <a-->
    <!--              href="#"-->
    <!--              class="btn btn-label-success btn-round btn-sm me-2"-->
    <!--            >-->
    <!--              <span class="btn-label">-->
    <!--                <i class="fa fa-pencil"></i>-->
    <!--              </span>-->
    <!--              Export-->
    <!--            </a>-->
    <!--            <a href="#" class="btn btn-label-info btn-round btn-sm">-->
    <!--              <span class="btn-label">-->
    <!--                <i class="fa fa-print"></i>-->
    <!--              </span>-->
    <!--              Print-->
    <!--            </a>-->
    <!--          </div>-->
    <!--        </div>-->
    <!--      </div>-->
    <!--      <div class="card-body">-->
    <!--        <div class="chart-container" style="min-height: 375px">-->
    <!--          <canvas id="chart"></canvas>-->
              
    <!--        </div>-->
    <!--        <div id="myChartLegend"></div>-->
    <!--      </div>-->
    <!--    </div>-->
    <!--  </div>-->
    <!--  <div class="col-md-4">-->
    <!--    <div class="card card-primary card-round">-->
    <!--      <div class="card-header">-->
    <!--        <div class="card-head-row">-->
    <!--          <div class="card-title">Daily Sales</div>-->
    <!--          <div class="card-tools">-->
    <!--            <div class="dropdown">-->
    <!--              <button-->
    <!--                class="btn btn-sm btn-label-light dropdown-toggle"-->
    <!--                type="button"-->
    <!--                id="dropdownMenuButton"-->
    <!--                data-bs-toggle="dropdown"-->
    <!--                aria-haspopup="true"-->
    <!--                aria-expanded="false"-->
    <!--              >-->
    <!--                Export-->
    <!--              </button>-->
    <!--              <div-->
    <!--                class="dropdown-menu"-->
    <!--                aria-labelledby="dropdownMenuButton"-->
    <!--              >-->
    <!--                <a class="dropdown-item" href="#">Action</a>-->
    <!--                <a class="dropdown-item" href="#">Another action</a>-->
    <!--                <a class="dropdown-item" href="#"-->
    <!--                  >Something else here</a-->
    <!--                >-->
    <!--              </div>-->
    <!--            </div>-->
    <!--          </div>-->
    <!--        </div>-->
    <!--        <div class="card-category">March 25 - April 02</div>-->
    <!--      </div>-->
    <!--      <div class="card-body pb-0">-->
    <!--        <div class="mb-4 mt-2">-->
    <!--          <h1>$4,578.58</h1>-->
    <!--        </div>-->
    <!--        <div class="pull-in">-->
    <!--          <canvas id="dailySalesChart"></canvas>-->
    <!--        </div>-->
    <!--      </div>-->
    <!--    </div>-->
    <!--    <div class="card card-round">-->
    <!--      <div class="card-body pb-0">-->
    <!--        <div class="h1 fw-bold float-end text-primary">+5%</div>-->
    <!--        <h2 class="mb-2">17</h2>-->
    <!--        <p class="text-muted">Users online</p>-->
    <!--        <div class="pull-in sparkline-fix">-->
    <!--          <div id="lineChart"></div>-->
    <!--        </div>-->
    <!--      </div>-->
    <!--    </div>-->
    <!--  </div>-->
    <!--</div>-->
   
  </div>
  <script>
            const ctx = document.getElementById("chart1").getContext('2d');
                        const myChart = new Chart(ctx, {
                          type: 'bar',
                          data: {
                            labels: ["Ibu Posyandu", "Anak", "Ibu Hamil", "Ibu Bersalin", "Ibu Nifas"
                            ],
                            datasets: [{
                        
                              barThickness: 50,
                              label: '',
                              backgroundColor: ['#0D5EA6', '#D98324', 'skyblue', 'pink', '#3B060A'],
                              borderColor: 'rgb(47, 128, 237)',
                              data: [{{$jumlahibuposyandu}}, {{$jumlahdataanak}}, {{$jumlahibuhamil}}, {{$jumlahibubersalin}}, {{$jumlahibunifas}}],
                            }]
                          },
                          options: {
                           
                            scales: {
                            
                              yAxes: [{
                                ticks: {
                                  beginAtZero: true,
                                },
                                
                              scaleLabel:{
                                display: true,
                                labelString: 'Jumlah (Jiwa)'
                              }
                              }
                            ],
                            xAxes: [{
                              scaleLabel:{
                                display: true,
                                labelString: 'Data 2020 - 2025'
                              }
                              }
                             
                            ],
                            
                            x:{
                                barThickness: 10
                            }
                            }
                          },
                        });
  </script>
  <script>
            const ctx2 = document.getElementById("chart2").getContext('2d');
                        const myChart2 = new Chart(ctx2, {
                          type: 'bar',
                          data: {
                            labels: ["2020", "2021", "2022", "2023", "2024", "2025"
                            ],
                            datasets: [{
                        
                              barThickness: 50,
                              label: 'Kematian Anak',
                              backgroundColor: '#0C0950',
                              borderColor: 'rgb(47, 128, 237)',
                              data: [{{$kematiananak_2020}}, {{$kematiananak_2021}}, {{$kematiananak_2022}}, {{$kematiananak_2023}}, {{$kematiananak_2024}}, {{$kematiananak_2025}}],
                            }]
                          },
                          options: {
                           
                            scales: {
                            
                              yAxes: [{
                                ticks: {
                                  stepSize:1
                                },
                                
                              scaleLabel:{
                                display: true,
                                labelString: 'Jumlah (Jiwa)'
                              }
                              }
                            ],
                            xAxes: [{
                              scaleLabel:{
                                display: true,
                                labelString: 'Tahun'
                              }
                              }
                             
                            ],
                            
                            x:{
                                barThickness: 10
                            }
                            }
                          },
                        });
  </script>
  <!--<script>-->
  <!--    let output = document.getElementById('output');-->
  <!--    let canvas = document.getElementById("sampleChart");-->
  <!--    let ibuposyandu = [2, 20, 30, 5, 15];-->
  <!--    let dataanak = [20, 20, 40, 50, 30];-->
  <!--    let ibuhamil = [{{$jumlahibuhamil2020}}, {{$jumlahibuhamil2021}}, {{$jumlahibuhamil2022}}, {{$jumlahibuhamil2023}}, {{$jumlahibuhamil2024}}];-->
  <!--    let ibubersalin = [{{$jumlahibubersalin2020}}, {{$jumlahibubersalin2021}}, {{$jumlahibubersalin2022}}, {{$jumlahibubersalin2023}}, {{$jumlahibubersalin2024}}];-->
  <!--    let ibunifas = [{{$jumlahibunifas2020}}, {{$jumlahibunifas2021}}, {{$jumlahibunifas2022}}, {{$jumlahibunifas2023}}, {{$jumlahibunifas2024}}];-->
  <!--    var xValues = [2020, 2021, 2022, 2023, 2024];-->
  <!--    new Chart(canvas, {-->
  <!--       type: "bar",-->
  <!--       data: {-->
  <!--          labels: xValues,-->
  <!--          datasets: [{-->
  <!--             backgroundColor: "blue",-->
  <!--             borderColor: "red",-->
  <!--             pointBackgroundColor: "green",-->
  <!--             fill: false,-->
  <!--             data: ibuposyandu,-->
  <!--             label: "Ibu Posyandu"-->
  <!--          }, {-->
  <!--             backgroundColor: "yellow",-->
  <!--             borderColor: "yellow",-->
  <!--             pointBackgroundColor: "blue",-->
  <!--             fill: false,-->
  <!--             data: dataanak,-->
  <!--             label: "Jumlah Anak"-->
  <!--          }, {-->
  <!--             backgroundColor: "skyblue",-->
  <!--             borderColor: "black",-->
  <!--             pointBackgroundColor: "pink",-->
  <!--             fill: false,-->
  <!--             data: ibuhamil,-->
  <!--             label: "Jumlah Ibu Hamil"-->
  <!--          },-->
  <!--          {-->
  <!--             backgroundColor: "pink",-->
  <!--             borderColor: "black",-->
  <!--             pointBackgroundColor: "pink",-->
  <!--             fill: false,-->
  <!--             data: ibubersalin,-->
  <!--             label: "Jumlah Ibu Bersalin"-->
  <!--          },-->
  <!--           {-->
  <!--             backgroundColor: "red",-->
  <!--             borderColor: "black",-->
  <!--             pointBackgroundColor: "pink",-->
  <!--             fill: false,-->
  <!--             data: ibunifas,-->
  <!--             label: "Jumlah Ibu Nifas"-->
  <!--          }-->
  <!--          ]-->
  <!--       },-->
  <!--       options: {-->
  <!--          scales: {-->
  <!--             yAxes: [{-->
  <!--                          ticks: {-->
  <!--                            beginAtZero: false,-->
  <!--                            min: 0-->
  <!--                          },-->
                            
  <!--                        scaleLabel:{-->
  <!--                          display: true,-->
  <!--                          labelString: 'Jumlah (Jiwa)',-->
  <!--                          fontSize: 15,-->
  <!--                        }-->
  <!--                        }-->
  <!--                      ],-->
                        
  <!--                      xAxes: [{-->
  <!--                        scaleLabel:{-->
  <!--                          display: true,-->
  <!--                          labelString: 'Tahun',-->
  <!--                          fontSize: 15,-->
  <!--                        }-->
  <!--                        }-->
  <!--                      ],-->
  <!--          }-->
  <!--       }-->
  <!--    });-->
      

  <!-- </script>-->
   
   
     <script>
      let output = document.getElementById('output');
      let canvas = document.getElementById("sampleChart");
      let ibuposyandu = [{{$jumlahibuposyandu}}];
      let dataanak = [{{$jumlahdataanak}}];
      let ibuhamil = [{{$jumlahibuhamil}}];
      let ibubersalin = [{{$jumlahibubersalin}}];
      let ibunifas = [{{$jumlahibunifas}}];
      var xValues = ['Ibu Posyandu', 'Anak', 'Ibu Hamil', 'Ibu Bersalin', 'Ibu Nifas'];
      new Chart(canvas, {
         type: "bar",
         data: {
            labels: xValues,
            datasets: [
               backgroundColor: #0D5EA6,
               borderColor: "red",
               pointBackgroundColor: "green",
               fill: false,
               data: [ibuposyandu, dataanak, ibuhamil, ibubersalin, ibunifas], 
               label: "Ibu Posyandu"
            
            
            //   backgroundColor: "yellow",
            //   borderColor: "yellow",
            //   pointBackgroundColor: "blue",
            //   fill: false,
            //   data: dataanak,
            //   label: "Jumlah Anak"
            // }, {
            //   backgroundColor: "skyblue",
            //   borderColor: "black",
            //   pointBackgroundColor: "pink",
            //   fill: false,
            //   data: ibuhamil,
            //   label: "Jumlah Ibu Hamil"
            // },
            // {
            //   backgroundColor: "pink",
            //   borderColor: "black",
            //   pointBackgroundColor: "pink",
            //   fill: false,
            //   data: ibubersalin,
            //   label: "Jumlah Ibu Bersalin"
            // },
            //  {
            //   backgroundColor: "red",
            //   borderColor: "black",
            //   pointBackgroundColor: "pink",
            //   fill: false,
            //   data: ibunifas,
            //   label: "Jumlah Ibu Nifas"
            // }
            ]
         },
         options: {
            scales: {
               yAxes: [{
                            ticks: {
                              beginAtZero: false,
                              min: 0
                            },
                            
                          scaleLabel:{
                            display: true,
                            labelString: 'Jumlah (Jiwa)',
                            fontSize: 15,
                          }
                          }
                        ],
                        
                        xAxes: [{
                          scaleLabel:{
                            display: true,
                            labelString: 'Tahun',
                            fontSize: 15,
                          }
                          }
                        ],
            }
         }
      });
      

   </script>


@endsection