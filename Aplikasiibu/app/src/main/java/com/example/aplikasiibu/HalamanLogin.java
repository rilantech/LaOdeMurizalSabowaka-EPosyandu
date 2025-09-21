package com.example.aplikasiibu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class HalamanLogin extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String alamat;
    public static String foto;
    public static SharedPreferences getData;
    public static String kelas;
    public static String nama;
    public static String namapetugas = "";
    public static String nik_ibu = "";
    public static String nis;
    public static String nomorhp;
    public static String password;
    public static PreferenceHelper preferenceHelper;
    public static String status = "";
    public static String username;
    Button btnLogin;
    String channelid = "default";
    String channelnotif = "channelku";
    EditText etPassword;
    EditText etUsername;
    private Handler handler = new Handler();
    boolean passwordVisible;
    SharedPreferences.Editor setData;
    TextView tvRegister;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.halaman_login);
        this.setData = getSharedPreferences("data", 0).edit();
        getData = getSharedPreferences("data", 0);
        this.tvRegister = (TextView) findViewById(R.id.tvRegister);
        this.btnLogin = (Button) findViewById(R.id.btnLogin);
        this.etUsername = (EditText) findViewById(R.id.etUsername);
        this.etPassword = (EditText) findViewById(R.id.etPassword);
      //  String string = Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id");
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HalamanLogin.this.startActivity(new Intent(HalamanLogin.this.getApplicationContext(), Halaman_utama_app.class));
                HalamanLogin.this.finish();
            }
        });
        this.etPassword.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() != 1 || event.getRawX() < ((float) (HalamanLogin.this.etPassword.getRight() - HalamanLogin.this.etPassword.getCompoundDrawables()[2].getBounds().width()))) {
                    return false;
                }
                int selection = HalamanLogin.this.etPassword.getSelectionEnd();
                if (HalamanLogin.this.passwordVisible) {
                    HalamanLogin.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.showpassword, 0);
                    HalamanLogin.this.etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    HalamanLogin.this.passwordVisible = false;
                } else {
                    HalamanLogin.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.hidepassword, 0);
                    HalamanLogin.this.etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    HalamanLogin.this.passwordVisible = true;
                }
                HalamanLogin.this.etPassword.setSelection(selection);
                return true;
            }
        });
        this.tvRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HalamanLogin.this.startActivity(new Intent(HalamanLogin.this.getApplicationContext(), RegistrasiAkun.class));
                HalamanLogin.this.finish();
            }
        });
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (HalamanLogin.this.etUsername.getText().toString().length() == 0) {
                    HalamanLogin.this.etUsername.setError("Tidak Boleh Kosong");
                    HalamanLogin.this.etUsername.requestFocus();
                }
                if (HalamanLogin.this.etPassword.getText().toString().length() == 0) {
                    HalamanLogin.this.etPassword.setError("Tidak Boleh Kosong");
                    HalamanLogin.this.etPassword.requestFocus();
                    return;
                }
                Volley.newRequestQueue(HalamanLogin.this.getApplicationContext()).add(new StringRequest(1, new Configurasi().baseUrl() + "api/loginibu", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String status = jsonObject.getString(NotificationCompat.CATEGORY_STATUS);
                            HalamanLogin.namapetugas = jsonObject.getString("nama");
                            HalamanLogin.nik_ibu = jsonObject.getString("nik_ibu");
                            HalamanLogin.nama = jsonObject.getString("nama");
                            HalamanLogin.alamat = jsonObject.getString("alamat");
                            HalamanLogin.nomorhp = jsonObject.getString("nomorhp");
                            HalamanLogin.username = jsonObject.getString("username");
                            HalamanLogin.alamat = jsonObject.getString("alamat");
                            HalamanLogin.password = jsonObject.getString("password");
                            if (status.equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(HalamanLogin.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Selamat Datang");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        HalamanLogin.this.setData.putString("session_nama", HalamanLogin.username);
                                        HalamanLogin.this.setData.apply();
                                        Intent intent = new Intent(HalamanLogin.this, Halaman_utama_app.class);
                                        HalamanLogin.this.startActivity(intent);
                                        intent.addFlags(268468224);
                                        HalamanLogin.this.finish();
                                    }
                                });
                                builder.create().show();
                            }
                            if (status.equals("gagal")) {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(HalamanLogin.this);
                                builder2.setTitle((CharSequence) "Peringatan");
                                builder2.setMessage((CharSequence) "Username / Password Salah!");
                                builder2.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        HalamanLogin.this.onRestart();
                                    }
                                });
                                builder2.create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(HalamanLogin.this, "terjadi kesalahan", 0).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String, String> form = new HashMap<>();
                        form.put("username", HalamanLogin.this.etUsername.getText().toString());
                        form.put("password", HalamanLogin.this.etPassword.getText().toString());
                        return form;
                    }
                });
            }

            private void saveInfo(JSONObject response) {
                HalamanLogin.preferenceHelper.putIsLogin(true);
                HalamanLogin.preferenceHelper.putNama(HalamanLogin.namapetugas);
                HalamanLogin.preferenceHelper.putUsername(HalamanLogin.username);
                HalamanLogin.preferenceHelper.putPassword(HalamanLogin.password);
            }
        });
    }

    private void notif() {
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(getApplicationContext(), this.channelid).setSmallIcon((int) R.drawable.logokemendikbud).setContentText(nama + ", Kembalikan Buku Anda!").setContentTitle("Notifikasi").setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif, "contoh channel", 4);
            notificationChannel.enableLights(true);
            notificationBuilder.setChannelId(this.channelnotif);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                throw new AssertionError();
            }
        }
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
            return;
        }
        throw new AssertionError();
    }

    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }
}
