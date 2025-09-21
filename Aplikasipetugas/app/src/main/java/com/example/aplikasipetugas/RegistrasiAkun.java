package com.example.aplikasipetugas;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public class RegistrasiAkun extends AppCompatActivity {
    Button btnRegister;
    EditText etAlamat;
    EditText etNama;
    EditText etNomorhp;
    EditText etPassword;
    EditText etUsername;
    ImageView panah_kembali;
    TextView tvLogin;
    private boolean passwordVisible;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_registrasi_akun);
        this.panah_kembali = (ImageView) findViewById(R.id.panahkembali);
        this.tvLogin = (TextView) findViewById(R.id.tvLogin);
        this.btnRegister = (Button) findViewById(R.id.btnRegister);
        this.etNama = (EditText) findViewById(R.id.etNama);
        this.etAlamat = (EditText) findViewById(R.id.etAlamat);
        this.etNomorhp = (EditText) findViewById(R.id.etNomorhp);
        this.etUsername = (EditText) findViewById(R.id.etUsername);
        this.etPassword = (EditText) findViewById(R.id.etPassword);
        this.etPassword.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() != 1 || event.getRawX() < ((float) (RegistrasiAkun.this.etPassword.getRight() - RegistrasiAkun.this.etPassword.getCompoundDrawables()[2].getBounds().width()))) {
                    return false;
                }
                int selection = RegistrasiAkun.this.etPassword.getSelectionEnd();
                if (RegistrasiAkun.this.passwordVisible) {
                    RegistrasiAkun.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.showpassword, 0);
                    RegistrasiAkun.this.etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    RegistrasiAkun.this.passwordVisible = false;
                } else {
                    RegistrasiAkun.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.hidepassword, 0);
                    RegistrasiAkun.this.etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    RegistrasiAkun.this.passwordVisible = true;
                }
                RegistrasiAkun.this.etPassword.setSelection(selection);
                return true;
            }
        });
        this.panah_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RegistrasiAkun.this.startActivity(new Intent(RegistrasiAkun.this.getApplicationContext(), Halaman_Login.class));
                RegistrasiAkun.this.finish();
            }
        });
        this.tvLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RegistrasiAkun.this.startActivity(new Intent(RegistrasiAkun.this.getApplicationContext(), Halaman_Login.class));
                RegistrasiAkun.this.finish();
            }
        });
        this.btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (RegistrasiAkun.this.etNama.getText().toString().length() == 0) {
                    RegistrasiAkun.this.etNama.setError("Tidak Boleh Kosong");
                }
                if (RegistrasiAkun.this.etAlamat.getText().toString().length() == 0) {
                    RegistrasiAkun.this.etAlamat.setError("Tidak Boleh Kosong");
                }
                if (RegistrasiAkun.this.etNomorhp.getText().toString().length() == 0) {
                    RegistrasiAkun.this.etNomorhp.setError("Tidak Boleh Kosong");
                }
                if (RegistrasiAkun.this.etUsername.getText().toString().length() == 0) {
                    RegistrasiAkun.this.etUsername.setError("Tidak Boleh Kosong");
                }
                if (RegistrasiAkun.this.etPassword.getText().toString().length() == 0) {
                    RegistrasiAkun.this.etPassword.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(RegistrasiAkun.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/registrasiakun", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegistrasiAkun.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Registrasi");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        RegistrasiAkun.this.startActivity(new Intent(RegistrasiAkun.this, Halaman_Login.class));
                                        RegistrasiAkun.this.finish();
                                    }
                                });
                                builder.create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(RegistrasiAkun.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nama", RegistrasiAkun.this.etNama.getText().toString());
                        myParams.put("alamat", RegistrasiAkun.this.etAlamat.getText().toString());
                        myParams.put("nomor_hp", RegistrasiAkun.this.etNomorhp.getText().toString());
                        myParams.put("username", RegistrasiAkun.this.etUsername.getText().toString());
                        myParams.put("password", RegistrasiAkun.this.etPassword.getText().toString());
                        return myParams;
                    }
                });
            }
        });
    }
}
