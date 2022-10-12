package com.belajarimplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_url, et_lokasi, et_teks;
    Button btnbukawebsite, btnbukalokasi, btnbagikanteks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_url = findViewById(R.id.et_url);
        et_lokasi = findViewById(R.id.et_lokasi);
        et_teks = findViewById(R.id.et_teks);
        btnbukawebsite = findViewById(R.id.btn_buka_website);
        btnbukalokasi = findViewById(R.id.btn_bagikan_teks);
        btnbagikanteks = findViewById(R.id.btn_buka_lokasi);

        btnbukawebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlWebsite = et_url.getText().toString();
                Uri uriurlWebsite = Uri.parse(urlWebsite);
                Intent intenWebsite = new Intent(Intent.ACTION_VIEW, uriurlWebsite);
                startActivity(intenWebsite);
                try {
                    startActivity(intenWebsite);

                }catch (Exception e){
                    et_url.setError("URL Tidak Sesuai");
                }


            }
        });

        btnbukalokasi.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }));

        btnbagikanteks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}