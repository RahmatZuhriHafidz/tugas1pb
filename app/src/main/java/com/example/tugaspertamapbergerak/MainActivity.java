package com.example.tugaspertamapbergerak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView tvTitle, tvResult;
    private TextView etharga1, etharga2, etharga3;

    private Button btnmembership;
    private Button rbGold;
    private Button rbSilver;
    private Button rbBronze;
    private Button rbNon;
    private Button btnHasil;
    private Button btnhasil1, btnhasil2, btnhasil3;
    private Button resetButton;
    private EditText ettesting;
    private EditText etbut1, etbut2, etbut3;
    private int[] hargabarang = {18999999};
    private int[] hargabarang1 = {23999999};
    private int[] hargabarang2 = {7999999};
    private double totalbarang;
    private String vipmembership = "None";
    private double potonganharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle = findViewById(R.id.tvTitle);
        tvResult = findViewById(R.id.tvResult);
        etharga1 = findViewById(R.id.etharga1);
        etharga2 = findViewById(R.id.etharga2);
        etharga3 = findViewById(R.id.etharga3);
        rbBronze = findViewById(R.id.rbBronze);
        rbGold = findViewById(R.id.rbGold);
        rbSilver = findViewById(R.id.rbSilver);
        rbNon = findViewById(R.id.rbNon);
        btnHasil = findViewById(R.id.btnhasil);
        btnmembership = findViewById(R.id.btnmembership);



        rbGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vipmembership = "GOLD";
                potonganharga = 1500000;

            }
        });
        rbSilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vipmembership = "SILVER";
                potonganharga = 1000000;
            }
        });
        rbBronze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vipmembership = "BRONZE";
                potonganharga = 500000;

            }
        });
        rbNon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vipmembership = "None";
                potonganharga =0;
            }
        });
        btnmembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnmembership.setText("MAAF STOCK SUDAH HABIS");

            }
        });

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updatetotalSemua();
                totalbarang = hargabarang[0];

            }
        });
    }
    private void updatetotalSemua() {
        double finalHarga;
        switch (vipmembership){
            case "GOLD":
                finalHarga = totalbarang - potonganharga;
                break;
            case "SILVER":
                finalHarga = totalbarang - potonganharga;
                break;
            case "BRONZE":
                finalHarga = totalbarang - potonganharga;
                break;
            default:
                finalHarga = totalbarang;
                break;
        }
        tvResult.setText("Harga Belanjaan Anda Totalnya Adalah: " + String.format("%d",(int) finalHarga));


    }
}