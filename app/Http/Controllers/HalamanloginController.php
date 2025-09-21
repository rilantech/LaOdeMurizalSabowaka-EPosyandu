<?php

namespace App\Http\Controllers;
use Illuminate\Support\Facades\Auth;
use Illuminate\Http\Request;
use Illuminate\Session\SessionServiceProvider;
class HalamanloginController extends Controller
{
    public function index()
    {
        return view('login.login', [
            'title' => 'Login'
        ]);
    }

    public function authenticate(Request $request)
    {
          $credentials= $request->validate([
            'username'=> 'required',
            'password'=>'required'
          ]);

          if(Auth::attempt($credentials)){

            $request->session()->regenerate();
            return redirect()->intended('/dashboard');
          }

          return back()->with('loginError','Username / Password Salah!');
    }

    public function logout()
    {
         Auth::logout();
         request()->session()->invalidate();
         request()->session()->regenerateToken();
         return redirect('/login');
         
    }
}

