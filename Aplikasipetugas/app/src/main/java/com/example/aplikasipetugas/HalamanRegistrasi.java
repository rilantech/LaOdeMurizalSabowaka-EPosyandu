package com.example.aplikasipetugas;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
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

public class HalamanRegistrasi extends AppCompatActivity {
    Bitmap bitmap;
    Button btnRegister;
    EditText etAlamat;
    EditText etNama;
    EditText etNomorhp;
    EditText etPassword;
    EditText etUsername;
    ImageView tombol_kembali;
    TextView tvLogin;
    private boolean passwordVisible;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.halaman_registrasi);
        this.tombol_kembali = (ImageView) findViewById(R.id.tombol_kembali);
        this.tvLogin = (TextView) findViewById(R.id.tvLogin);
        this.btnRegister = (Button) findViewById(R.id.btnRegister);
        this.etNama = (EditText) findViewById(R.id.etNama);
        this.etAlamat = (EditText) findViewById(R.id.etAlamat);
        this.etNomorhp = (EditText) findViewById(R.id.etNomorhp);
        this.etUsername = (EditText) findViewById(R.id.etUsername);
        this.etPassword = (EditText) findViewById(R.id.etPassword);
        this.tombol_kembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HalamanRegistrasi.this.startActivity(new Intent(HalamanRegistrasi.this, Halaman_Login.class));
            }
        });
        this.tvLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HalamanRegistrasi.this.startActivity(new Intent(HalamanRegistrasi.this.getApplicationContext(), Halaman_Login.class));
                HalamanRegistrasi.this.finish();
            }
        });
        this.etPassword.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() != 1 || event.getRawX() < ((float) (HalamanRegistrasi.this.etPassword.getRight() - HalamanRegistrasi.this.etPassword.getCompoundDrawables()[2].getBounds().width()))) {
                    return false;
                }
                int selection = HalamanRegistrasi.this.etPassword.getSelectionEnd();
                if (HalamanRegistrasi.this.passwordVisible) {
                    HalamanRegistrasi.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.showpassword, 0);
                    HalamanRegistrasi.this.etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    HalamanRegistrasi.this.passwordVisible = false;
                } else {
                    HalamanRegistrasi.this.etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.hidepassword, 0);
                    HalamanRegistrasi.this.etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    HalamanRegistrasi.this.passwordVisible = true;
                }
                HalamanRegistrasi.this.etPassword.setSelection(selection);
                return true;
            }
        });
        
        this.btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (HalamanRegistrasi.this.etNama.getText().toString().length() == 0) {
                    HalamanRegistrasi.this.etNama.setError("Tidak Boleh Kosong");
                }
                if (HalamanRegistrasi.this.etAlamat.getText().toString().length() == 0) {
                    HalamanRegistrasi.this.etAlamat.setError("Tidak Boleh Kosong");
                }
                if (HalamanRegistrasi.this.etNomorhp.getText().toString().length() == 0) {
                    HalamanRegistrasi.this.etNomorhp.setError("Tidak Boleh Kosong");
                }
                if (HalamanRegistrasi.this.etUsername.getText().toString().length() == 0) {
                    HalamanRegistrasi.this.etUsername.setError("Tidak Boleh Kosong");
                }
                if (HalamanRegistrasi.this.etPassword.getText().toString().length() == 0) {
                    HalamanRegistrasi.this.etPassword.setError("Tidak Boleh Kosong");
                    return;
                }
                Volley.newRequestQueue(HalamanRegistrasi.this).add(new StringRequest(1, new Configurasi().baseUrl() + "api/registrasiakun", new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            if (new JSONObject(response).getString(NotificationCompat.CATEGORY_STATUS).equals("berhasil")) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(HalamanRegistrasi.this);
                                builder.setTitle((CharSequence) "Sukses");
                                builder.setMessage((CharSequence) "Berhasil Registrasi");
                                builder.setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        HalamanRegistrasi.this.startActivity(new Intent(HalamanRegistrasi.this, Halaman_Login.class));
                                        HalamanRegistrasi.this.finish();
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
                        Toast.makeText(HalamanRegistrasi.this, "Error :" + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
                    /* access modifiers changed from: protected */
                    public Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> myParams = new HashMap<>();
                        myParams.put("nama", HalamanRegistrasi.this.etNama.getText().toString());
                        myParams.put("alamat", HalamanRegistrasi.this.etAlamat.getText().toString());
                        myParams.put("nomorhp", HalamanRegistrasi.this.etNomorhp.getText().toString());
                        myParams.put("username", HalamanRegistrasi.this.etUsername.getText().toString());
                        myParams.put("password", HalamanRegistrasi.this.etPassword.getText().toString());
                        return myParams;
                    }
                });
            }
        });
    }
}
