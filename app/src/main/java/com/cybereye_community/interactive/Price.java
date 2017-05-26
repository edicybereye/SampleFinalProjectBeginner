package com.cybereye_community.interactive;

import android.app.Activity;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Price extends Activity {

    RadioButton rd1, rd2, rd3, rd4;
    CheckBox chk1, chk2;
    TextView totalHarga, txtNama;
    Button submit;
    String txt_nama;
    int harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price);
        txtNama = (TextView)findViewById(R.id.nama);

        txt_nama = getIntent().getStringExtra("a");
        txtNama.setText(txt_nama);

        totalHarga = (TextView)findViewById(R.id.total);
        rd1 = (RadioButton)findViewById(R.id.radio1);
        rd2 = (RadioButton)findViewById(R.id.radio2);
        rd3 = (RadioButton)findViewById(R.id.radio3);
        rd4 = (RadioButton)findViewById(R.id.radio4);
        chk1 = (CheckBox)findViewById(R.id.check1);
        chk2 = (CheckBox)findViewById(R.id.check2);
        submit = (Button)findViewById(R.id.order);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalHarga.setText("Provider anda Pilih : "+txt_nama+"\n"+
                        " Total Harga Rp. " +harga+",-");
            }
        });
        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd1.isChecked()){
                    harga = 5000;
                    totalHarga.setText(""+harga);
                }
            }
        });
        rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd2.isChecked()){
                    harga = 10000;
                    totalHarga.setText(""+harga);
                }
            }
        });
        rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd3.isChecked()){
                    harga = 25000;
                    totalHarga.setText(""+harga);
                }
            }
        });
        rd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd4.isChecked()){
                    harga = 50000;
                    totalHarga.setText(""+harga);
                }
            }
        });
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked()){
                    harga = harga + 3000;
                    totalHarga.setText(""+harga);
                }else if (!chk1.isChecked()){
                    harga = harga - 3000;
                    totalHarga.setText(""+harga);
                }
            }
        });
        chk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk2.isChecked()){
                    harga = harga + 5000;
                    totalHarga.setText(""+harga);
                }else if (!chk2.isChecked()){
                    harga = harga - 5000;
                    totalHarga.setText(""+harga);
                }
            }
        });

    }
}
