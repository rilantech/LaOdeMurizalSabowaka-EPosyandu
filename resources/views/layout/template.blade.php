<!DOCTYPE html>
<html lang="id">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>E-Posyandu Marawali | {{ $title }}</title>
    <meta
      content="width=device-width, initial-scale=1.0, shrink-to-fit=no"
      name="viewport"
    />
    <link
      rel="icon"
      href="{{ asset('templatedwi/img/logopuskesmas.png') }}"
      type="image/x-icon"
    />

    <!-- Fonts and icons -->
    <script src="{{ asset('templatedwi/js/plugin/webfont/webfont.min.js') }}"></script>
    <script>
      WebFont.load({
        google: { families: ["Public Sans:300,400,500,600,700"] },
        custom: {
          families: [
            "Font Awesome 5 Solid",
            "Font Awesome 5 Regular",
            "Font Awesome 5 Brands",
            "simple-line-icons",
          ],
          urls: ["templatedwi/css/fonts.min.css"],
        },
        active: function () {
          sessionStorage.fonts = true;
        },
      });
    </script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="{{ asset('templatedwi/css/bootstrap.min.css') }}" />
    <link rel="stylesheet" href="{{ asset('templatedwi/css/plugins.min.css') }}" />
    <link rel="stylesheet" href="{{ asset('templatedwi/css/kaiadmin.min.css') }}" />

    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel="stylesheet" href="{{ asset('templatedwi/css/demo.css') }}" />

    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css"/>  
   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>  
   <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script> 
   
  
   <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/locale/id.js"></script>
<!--    <script-->
<!--src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.3/moment.min.js"></script>-->
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.13.2/themes/base/jquery-ui.min.css"/>
 
  
<!-- CDN untuk grafik di Dashboard -->   
   <style> #sampleChart {  max-width: 1000px; height: 300px;} </style>
   <script src = "https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js">
   </script>
   <style>
       .sidebar1{
           background-color: #4DA8DA;
           color: white;
       }
   </style>

  </head>
  <body>
    <div class="wrapper">
      <!-- Sidebar -->
      <div class="sidebar" style="background-color: #EE66A6;">
        <div class="sidebar-logo">
          <!-- Logo Header -->
          <div class="logo-header" style="background-color: #4791D1;">
            <a href="{{ url('beranda') }}" class="logo">
              <span class="sub-item text-white">E-Posyandu Marawali</span>
              
            </a>
            <div class="nav-toggle">
              <button class="btn btn-toggle toggle-sidebar">
                <i class="gg-menu-right"></i>
              </button>
              <button class="btn btn-toggle sidenav-toggler">
                <i class="gg-menu-left"></i>
              </button>
            </div>
            <button class="topbar-toggler more">
              <i class="gg-more-vertical-alt"></i>
            </button>
          </div>
          <!-- End Logo Header -->
        </div>
      @include('partials.sidebar')
      </div>
      <!-- End Sidebar -->

      <div class="main-panel">
        <div class="main-header">
          <div class="main-header-logo">
            <!-- Logo Header -->
            <div class="logo-header" data-background-color="dark">
              <a href="index.html" class="logo">
                <img
                  src="assets/img/kaiadmin/logo_light.svg"
                  alt="navbar brand"
                  class="navbar-brand"
                  height="20"
                />
              </a>
              <div class="nav-toggle">
                <button class="btn btn-toggle toggle-sidebar">
                  <i class="gg-menu-right"></i>
                </button>
                <button class="btn btn-toggle sidenav-toggler">
                  <i class="gg-menu-left"></i>
                </button>
              </div>
              <button class="topbar-toggler more">
                <i class="gg-more-vertical-alt"></i>
              </button>
            </div>
            <!-- End Logo Header -->
          </div>
          <!-- Navbar Header -->
          <nav
            class="navbar navbar-header navbar-header-transparent navbar-expand-lg border-bottom" style="background-color: #4791D1;"
          >
            <div class="container-fluid">
              <nav
                class="navbar navbar-header-left text-center"
              >
              <h4 class="fw-bold mb-3 text-white">Sistem Bidan Koordinator</h4>
              </nav>

              <ul class="navbar-nav topbar-nav ms-md-auto align-items-center">
                <li
                  class="nav-item topbar-icon dropdown hidden-caret d-flex d-lg-none"
                >
                  <a
                    class="nav-link dropdown-toggle"
                    data-bs-toggle="dropdown"
                    href="#"
                    role="button"
                    aria-expanded="false"
                    aria-haspopup="true"
                  >
                    <i class="fa fa-search"></i>
                  </a>
                  <ul class="dropdown-menu dropdown-search animated fadeIn">
                    <form class="navbar-left navbar-form nav-search">
                      <div class="input-group">
                        <input
                          type="text"
                          placeholder="Search ..."
                          class="form-control"
                        />
                      </div>
                    </form>
                  </ul>
                </li>
               
              
                <li class="nav-item topbar-user dropdown hidden-caret">
                  <a
                    class="dropdown-toggle profile-pic"
                    data-bs-toggle="dropdown"
                    href="#"
                    aria-expanded="false"
                  >
                    <div class="avatar-sm">
                      <img
                        src="{{ asset('templatedwi/img/iconsuserlogin.png') }}"
                        alt="..."
                        class="avatar-img rounded-circle"
                      />
                    </div>
                    <span class="profile-username text-white">
                      <span class="op-7">Hi,</span>
                      <span class="fw-bold">BiKor</span>
                    </span>
                  </a>
                  <ul class="dropdown-menu dropdown-user animated fadeIn">
                    <div class="dropdown-user-scroll scrollbar-outer">
                      {{-- <li>
                        <div class="user-box">
                          <div class="avatar-lg">
                            <img
                              src="{{ asset('templatedwi/img/profile.jpg') }}"
                              alt="image profile"
                              class="avatar-img rounded"
                            />
                          </div>
                          <div class="u-text">
                            <h4>Hizrian</h4>
                            <p class="text-muted">hello@example.com</p>
                            <a
                              href="profile.html"
                              class="btn btn-xs btn-secondary btn-sm"
                              >View Profile</a
                            >
                          </div>
                        </div>
                      </li> --}}
                      <li>
                        <div class="dropdown-divider"></div>
                        {{-- <a class="dropdown-item" href="#">My Profile</a>
                        <a class="dropdown-item" href="#">My Balance</a>
                        <a class="dropdown-item" href="#">Inbox</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Account Setting</a>
                        <div class="dropdown-divider"></div> --}}
                        <form action="/logout" method="post">
                          @csrf
                        <button type="submit" class="dropdown-item" href="{{ url('logout') }}">Logout</button>
                        </form>
                      </li>
                    </div>
                  </ul>
                </li>
              </ul>
            </div>
          </nav>
          <!-- End Navbar -->
        </div>
        <div class="container" style="background-color: #F2F2F2;">
         @yield('judul')
         @yield('konten')
        </div>
        <footer class="footer" style="background-color: #4A4947;">
          <div class="container-fluid d-flex justify-content-between">
            <nav class="pull-left">
              <ul class="nav">
                <li class="nav-item">
                  <a class="nav-link" href="http://www.themekita.com">
                    
                  </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#"></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#"></a>
                </li>
              </ul>
            </nav>
            <div class="copyright text-white">
              Copyright Teknik Informatika &copy 2025
            </div>
            <div>
           
              <a target="_blank" href="https://themewagon.com/"></a>.
            </div>
          </div>
        </footer>
      </div>

      <!-- Custom template | don't include it in your project! -->
      <!--<div class="custom-template">-->
      <!--  <div class="title">Settings</div>-->
      <!--  <div class="custom-content">-->
      <!--    <div class="switcher">-->
      <!--      <div class="switch-block">-->
      <!--        <h4>Logo Header</h4>-->
      <!--        <div class="btnSwitch">-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="selected changeLogoHeaderColor"-->
      <!--            data-color="dark"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="blue"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="purple"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="light-blue"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="green"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="orange"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="red"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="white"-->
      <!--          ></button>-->
      <!--          <br />-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="dark2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="blue2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="purple2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="light-blue2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="green2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="orange2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeLogoHeaderColor"-->
      <!--            data-color="red2"-->
      <!--          ></button>-->
      <!--        </div>-->
      <!--      </div>-->
      <!--      <div class="switch-block">-->
      <!--        <h4>Navbar Header</h4>-->
      <!--        <div class="btnSwitch">-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="dark"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="blue"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="purple"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="light-blue"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="green"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="orange"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="red"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="selected changeTopBarColor"-->
      <!--            data-color="white"-->
      <!--          ></button>-->
      <!--          <br />-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="dark2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="blue2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="purple2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="light-blue2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="green2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="orange2"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeTopBarColor"-->
      <!--            data-color="red2"-->
      <!--          ></button>-->
      <!--        </div>-->
      <!--      </div>-->
      <!--      <div class="switch-block">-->
      <!--        <h4>Sidebar</h4>-->
      <!--        <div class="btnSwitch">-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeSideBarColor"-->
      <!--            data-color="white"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="selected changeSideBarColor"-->
      <!--            data-color="dark"-->
      <!--          ></button>-->
      <!--          <button-->
      <!--            type="button"-->
      <!--            class="changeSideBarColor"-->
      <!--            data-color="dark2"-->
      <!--          ></button>-->
      <!--        </div>-->
      <!--      </div>-->
      <!--    </div>-->
      <!--  </div>-->
      <!--  <div class="custom-toggle">-->
      <!--    <i class="icon-settings"></i>-->
      <!--  </div>-->
      <!--</div>-->
      <!-- End Custom template -->
    </div>
    <!--   Core JS Files   -->
    <script src="{{ asset('templatedwi/js/core/jquery-3.7.1.min.js') }}"></script>
    <script src="{{ asset('templatedwi/js/core/popper.min.js') }}"></script>
    <script src="{{ asset('templatedwi/js/core/bootstrap.min.js') }}"></script>

    <!-- jQuery Scrollbar -->
    <script src="{{ asset('templatedwi/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js') }}"></script>

    <!-- Chart JS -->
    <script src="{{ asset('templatedwi/js/plugin/chart.js/chart.min.js') }}"></script>

    <!-- jQuery Sparkline -->
    <script src="{{ asset('templatedwi/js/plugin/jquery.sparkline/jquery.sparkline.min.js') }}"></script>

    <!-- Chart Circle -->
    <script src="{{ asset('templatedwi/js/plugin/chart-circle/circles.min.js') }}"></script>

    <!-- Datatables -->
    <script src="{{ asset('templatedwi/js/plugin/datatables/datatables.min.js') }}"></script>

    <!-- Bootstrap Notify -->
    <script src="{{ asset('templatedwi/js/plugin/bootstrap-notify/bootstrap-notify.min.js') }}"></script>

    <!-- jQuery Vector Maps -->
    <script src="{{ asset('templatedwi/js/plugin/jsvectormap/jsvectormap.min.js') }}"></script>
    <script src="{{ asset('templatedwi/js/plugin/jsvectormap/world.js') }}"></script>

    <!-- Sweet Alert -->
    <script src="{{ asset('templatedwi/js/plugin/sweetalert/sweetalert.min.js') }}"></script>

    <!-- Kaiadmin JS -->
    <script src="{{ asset('templatedwi/js/kaiadmin.min.js') }}"></script>

    <!-- Kaiadmin DEMO methods, don't include it in your project! -->
    <script src="{{ asset('templatedwi/js/setting-demo.js') }} "></script>
    <!--<script src="{{ asset('templatedwi/js/demo.js') }}"></script>-->
    <script>
      $("#lineChart").sparkline([102, 109, 120, 99, 110, 105, 115], {
        type: "line",
        height: "70",
        width: "100%",
        lineWidth: "2",
        lineColor: "#177dff",
        fillColor: "rgba(23, 125, 255, 0.14)",
      });

      $("#lineChart2").sparkline([99, 125, 122, 105, 110, 124, 115], {
        type: "line",
        height: "70",
        width: "100%",
        lineWidth: "2",
        lineColor: "#f3545d",
        fillColor: "rgba(243, 84, 93, .14)",
      });

      $("#lineChart3").sparkline([105, 103, 123, 100, 95, 105, 115], {
        type: "line",
        height: "70",
        width: "100%",
        lineWidth: "2",
        lineColor: "#ffa534",
        fillColor: "rgba(255, 165, 52, .14)",
      });
    </script>
    <script>
      function toggleField(hideObj, showObj){
       hideObj.disabled=true;
       hideObj.style.display='none';
       showObj.disabled=true;
       showObj.style.display='inline';
       showObj.focus();
      }
       </script>
       
          
  </body>
</html>
