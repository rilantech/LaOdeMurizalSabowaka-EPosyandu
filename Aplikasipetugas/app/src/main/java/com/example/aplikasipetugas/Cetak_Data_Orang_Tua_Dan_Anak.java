package com.example.aplikasipetugas;

import android.content.Context;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Cetak_Data_Orang_Tua_Dan_Anak extends AppCompatActivity {
    Button cetak;
    WebView webview1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_cetak_data_orang_tua_dan_anak);
        this.webview1 = (WebView) findViewById(R.id.webview1);
        this.cetak = (Button) findViewById(R.id.cetak);
        this.webview1.setWebChromeClient(new WebChromeClient());
        this.webview1.getSettings().setJavaScriptEnabled(true);
        this.webview1.getSettings().setUseWideViewPort(true);
        this.webview1.loadUrl(new Configurasi().baseUrl() + "cetakdataorangtuadananak/" + getIntent().getIntExtra("UploadTaskParameters.Companion.CodingKeys.id", 0));
        this.cetak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ((PrintManager) Cetak_Data_Orang_Tua_Dan_Anak.this.getSystemService(Context.PRINT_SERVICE)).print("Document", Cetak_Data_Orang_Tua_Dan_Anak.this.webview1.createPrintDocumentAdapter(), (PrintAttributes) null);
            }
        });
    }
}
