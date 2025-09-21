package com.example.aplikasipetugas;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
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

public class Halaman_Login extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String alamat;
    public static String foto;
    public static String kelas;
    public static String nama;
    public static String namapetugas = "";
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
    TextView tvRegister;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_login);
        preferenceHelper = new PreferenceHelper(this);
        this.tvRegister = (TextView) findViewById(R.id.tvRegister);
        this.btnLogin = (Button) findViewById(R.id.btnLogin);
        this.etUsername = (EditText) findViewById(R.id.etUsername);
        this.etPassword = (EditText) findViewById(R.id.etPassword);
        String string = Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id");
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Halaman_Login.this.startActivity(new Intent(Halaman_Login.this.getApplicationContext(), Halaman_utama_app.class));
                Halaman_Login.this.finish();
            }
        });
        this.etPassword.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() != 1 || event.getRawX() < ((float) (Halaman_Login.this.etPassword.getRight() - Halaman_Login.this.etPassword.getCompoundDrawables()[2].getBounds().width()))) {
                    return false;
                }
                int selection = Halaman_Login.this.etPassword.getSelectionEnd();
                if (Halaman_Login.this.passwordVisible) {
                    Halaman_Login.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.showpassword, 0);
                    Halaman_Login.this.etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    Halaman_Login.this.passwordVisible = false;
                } else {
                    Halaman_Login.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.hidepassword, 0);
                    Halaman_Login.this.etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    Halaman_Login.this.passwordVisible = true;
                }
                Halaman_Login.this.etPassword.setSelection(selection);
                return true;
            }
        });
        this.tvRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Halaman_Login.this.startActivity(new Intent(Halaman_Login.this.getApplicationContext(), RegistrasiAkun.class));
                Halaman_Login.this.finish();
            }
        });
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Halaman_Login.this.etUsername.getText().toString().length() == 0) {
                    Halaman_Login.this.etUsername.setError("Tidak Boleh Kosong");
                    Halaman_Login.this.etUsername.requestFocus();
                }
                if (Halaman_Login.this.etPassword.getText().toString().length() == 0) {
                    Halaman_Login.this.etPassword.setError("Tidak Boleh Kosong");
                    Halaman_Login.this.etPassword.requestFocus();
                    return;
                }
                Volley.newRequestQueue(Halaman_Login.this.getApplicationContext()).add(new StringRequest(1, new Configurasi().baseUrl() + "api/login", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String status = jsonObject.getString(NotificationCompat.CATEGORY_STATUS);
                            Halaman_Login.namapetugas = jsonObject.getString("nama");
                            Halaman_Login.nama = jsonObject.getString("nama");
                            Halaman_Login.alamat = jsonObject.getString("alamat");
                            Halaman_Login.nomorhp = jsonObject.getString("nomorhp");
                            Halaman_Login.username = jsonObject.getString("username");
                            Halaman_Login.alamat = jsonObject.getString("alamat");
                            Halaman_Login.password = jsonObject.getString("password");
                            if (status.equals("berhasil")) {
                                saveInfo(jsonObject);
                                AlertDialog.Builder builder = new AlertDialog.Builder(Halaman_Login.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Selamat Datang");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    @SuppressLint("WrongConstant")
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent intent = new Intent(Halaman_Login.this, Halaman_utama_app.class);
                                        Halaman_Login.this.startActivity(intent);
                                        Halaman_Login.this.finish();
                                    }
                                });
                                builder.create().show();
                            }
                            if (status.equals("gagal")) {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(Halaman_Login.this);
                                builder2.setTitle((CharSequence) "Peringatan");
                                builder2.setMessage((CharSequence) "Username / Password Salah!");
                                builder2.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Halaman_Login.this.onRestart();
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
                        Toast.makeText(Halaman_Login.this, "terjadi kesalahan", Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String, String> form = new HashMap<>();
                        form.put("username", Halaman_Login.this.etUsername.getText().toString());
                        form.put("password", Halaman_Login.this.etPassword.getText().toString());
                        return form;
                    }
                });
            }

            /* access modifiers changed from: private */
            public void saveInfo(JSONObject response) {
                Halaman_Login.preferenceHelper.putIsLogin(true);
                try {
                    Halaman_Login.foto = response.getString("foto");
                    Halaman_Login.nis = response.getString("nis");
                    Halaman_Login.nama = response.getString("nama");
                    Halaman_Login.kelas = response.getString("kelas");
                    Halaman_Login.nomorhp = response.getString("nomorhp");
                    Halaman_Login.username = response.getString("username");
                    Halaman_Login.password = response.getString("password");
                    Halaman_Login.preferenceHelper.putNama(Halaman_Login.nama);
                    Halaman_Login.preferenceHelper.putUsername(Halaman_Login.username);
                    Halaman_Login.preferenceHelper.putPassword(Halaman_Login.password);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void notif() {
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(getApplicationContext(), this.channelid).setSmallIcon((int) R.drawable.logokemendikbud).setContentText(nama + ", Kembalikan Buku Anda!").setContentTitle("Notifikasi").setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.channelnotif, "contoh channel", NotificationManager.IMPORTANCE_HIGH);
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
