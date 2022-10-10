package com.if3b.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
//    Deklarasi
    Button btnPindah;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Layout A");


//      Cari Id
        btnPindah = findViewById(R.id.btn_pindah);
        etNama  = findViewById(R.id.et_nama);


//      Set The Program
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = etNama.getText().toString();

                if (nama.trim().equals("")) {
                    etNama.setError("Nama Harus Diisi");
                }
                else{
                    Intent pindah = new Intent(MainActivity.this, secondActivity.class);
                    pindah.putExtra("xNama", nama);
                    startActivity(pindah);
                }
            }
        });


    }
}