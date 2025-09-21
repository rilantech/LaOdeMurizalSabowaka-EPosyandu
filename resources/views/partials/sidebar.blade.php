<div class="sidebar-wrapper scrollbar scrollbar-inner " style="background-color: white;">
    <div class="sidebar-content">
      <ul class="nav nav-secondary">
        <li class="nav-item {{ ($title == "Dashboard") ?  'active sidebar1' : '' }}">
          <a
            href="{{ url('/dashboard') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/icondashboard1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Dashboard</p>
          </a>
        </li>
        <li class="nav-item {{ ($title == "JadwalPosyandu") ?  'active sidebar1' : '' }}">
          <a
            href="{{ url('/jadwalposyandu') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/iconjadwal1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p  style="color: #4DA8DA;">Jadwal Posyandu</p>
          </a>
        </li>
        <li class="nav-item {{ ($title == "Data Orang Tua Anak") ?  'active sidebar1' : '' }} ">
          <a
            href="{{ url('/dataorangtuadananak') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/iconorangtuadananak1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Data Orang Tua & Anak</p>
          </a>
        </li>
        <li class="nav-item {{ ($title == "Data Obstetri") ?  'active sidebar1' : '' }} ">
          <a
            href="{{ url('/dataobstetri') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/iconobstetri1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Data Obstetri</p>
          </a>
        </li>
         <li class="nav-item {{ ($title == "Kesehatan Ibu Hamil" || $title == "Kesehatan Ibu Bersalin" || $title == "Kesehatan Ibu Nifas") ?  'active sidebar1' : '' }} ">
          <a
            href="{{ url('/kesehatanibuhamil') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/iconkesehatanibu1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Data Kesehatan Ibu</p>
          </a>
        </li>
        <li class="nav-item {{ ($title == "Kesehatan Bayi Baru Lahir" || $title == "Imunisasi Anak" || $title == "Pemberian Vitamin & Obat Cacing" || $title == "Matriks Perkembangan Anak" || $title == "Data KMS") ?  'active sidebar1' : '' }} ">
          <a
            href="{{ url('/kesehatanbayibarulahir') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/icondatakesehatananak1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Data Kesehatan Anak</p>
          </a>
        </li>
       
        <!--<li class="nav-item {{ ($title == "Kesehatan Ibu Hamil") ?  'active' : '' }} ">-->
        <!--  <a data-bs-toggle="collapse" href="#base">-->
        <!--    <i>  -->
        <!--      <div class="notif-img">-->
        <!--      <img-->
        <!--        src="{{ asset('templatedwi/img/iconkesehatanibu.png') }}"-->
        <!--        alt="Img Profile"-->
        <!--        width="20"-->
        <!--        height="20"-->
        <!--      />-->
        <!--    </div></i>-->
        <!--    <p style="color: #4DA8DA;">Data Kesehatan Ibu</p>-->
        <!--    <span class="caret"></span>-->
        <!--  </a>-->
        <!--  <div class="collapse" id="base">-->
        <!--    <ul class="nav nav-collapse">-->
        <!--      <li class="nav-item {{ ($title == "Kesehatan Ibu Hamil") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/kesehatanibuhamil') }}">-->
        <!--          <span class="sub-item text-white">Kesehatan Ibu Hamil</span>-->
        <!--        </a>-->
        <!--      </li>-->
        <!--      <li class="nav-item {{ ($title == "Kesehatan Ibu Bersalin") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/kesehatanibubersalin') }}">-->
        <!--          <span class="sub-item text-white">Kesehatan Ibu Bersalin</span>-->
        <!--        </a>-->
        <!--      </li>-->
        <!--      <li class="nav-item {{ ($title == "Kesehatan Ibu Nifas") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/kesehatanibunifas') }}">-->
        <!--          <span class="sub-item text-white">Kesehatan Ibu Nifas</span>-->
        <!--        </a>-->
        <!--      </li>-->
            
        <!--    </ul>-->
        <!--  </div>-->
        <!--</li>-->
        <!--<li class="nav-item">-->
        <!--  <a data-bs-toggle="collapse" href="#base2">-->
        <!--    <i>  -->
        <!--      <div class="notif-img">-->
        <!--      <img-->
        <!--        src="{{ asset('templatedwi/img/icondatakesehatananak.png') }}"-->
        <!--        alt="Img Profile"-->
        <!--        width="20"-->
        <!--        height="20"-->
        <!--      />-->
        <!--    </div></i>-->
        <!--    <p style="color: #4DA8DA;">Data Kesehatan Anak</p>-->
        <!--    <span class="caret"></span>-->
        <!--  </a>-->
        <!--  <div class="collapse" id="base2">-->
        <!--    <ul class="nav nav-collapse">-->
        <!--      <li class="nav-item {{ ($title == "Kesehatan Bayi Baru Lahir") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/kesehatanbayibarulahir') }}">-->
        <!--          <span class="sub-item text-white">Kesehatan Bayi Baru Lahir</span>-->
        <!--        </a>-->
        <!--      </li>-->
        <!--      <li class="nav-item {{ ($title == "Imunisasi Anak") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/imunisasianak') }}">-->
        <!--          <span class="sub-item text-white">Imunisasi Anak</span>-->
        <!--        </a>-->
        <!--      </li>-->
        <!--      <li class="nav-item {{ ($title == "Pemberian Vitamin & Obat Cacing") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/pemberianvitamindanobatcacing') }}">-->
        <!--          <span class="sub-item text-white">Pemberian Vitamin A & Obat Cacing</span>-->
        <!--        </a>-->
        <!--      </li>-->
        <!--      {{-- <li class="nav-item {{ ($title == "Pemenuhan Gizi & Makan") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/pemenuhangizidanmakan') }}">-->
        <!--          <span class="sub-item text-white">Pemenuhan Gizi & Pemenuhan Makan</span>-->
        <!--        </a>-->
        <!--      </li> --}}-->
        <!--      <li class="nav-item {{ ($title == "Matriks Perkembangan Anak") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/matriksperkembangananak') }}">-->
        <!--          <span class="sub-item text-white">Matriks Pemantauan Perkembangan Anak</span>-->
        <!--        </a>-->
        <!--      </li>-->
        <!--      <li class="nav-item {{ ($title == "Data KMS") ?  'active' : '' }} ">-->
        <!--        <a href="{{ url('/datakms') }}">-->
        <!--          <span class="sub-item text-white">Data KMS</span>-->
        <!--        </a>-->
        <!--      </li>-->
             
        <!--    </ul>-->
        <!--  </div>-->
        <!--</li>-->
        <li class="nav-item {{ ($title == "Daftar Akun Petugas") ?  'active sidebar1' : '' }} "">
          <a
            href="{{ url('/daftarakunpetugas') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/icondaftarakunpetugas1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Daftar Akun Petugas</p>
          </a>
        </li>
        <li class="nav-item {{ ($title == "Daftar Akun Ibu") ?  'active sidebar1' : '' }} "">
          <a
            href="{{ url('/daftarakunibu') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/icondaftarakunibu1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Daftar Akun Ibu</p>
          </a>
        </li>
        <li class="nav-item {{ ($title == "Chatting") ?  'active sidebar1' : '' }} ">
          <a
            href="{{ url('/chatting') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/iconchatting1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Chatting</p>
          </a>
        </li>
        <li class="nav-item {{ ($title == "Tentang Aplikasi") ?  'active sidebar1' : '' }} ">
          <a
            href="{{ url('/tentangaplikasi') }}"
            class="collapsed"
            aria-expanded="false"
          >
            <i>  
              <div class="notif-img">
              <img
                src="{{ asset('templatedwi/img/icontentangaplikasi1.png') }}"
                alt="Img Profile"
                width="20"
                height="20"
              />
            </div></i>
            <p style="color: #4DA8DA;">Tentang Aplikasi</p>
          </a>
        </li>
      </ul>
    </div>
  </div>