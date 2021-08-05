package com.example.dts_mobile_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inNumX;
    EditText inNumY;
    TextView vHasil;
    Button btnTambah;
    Button btnKurang;
    Button btnKali;
    Button btnBagi;
    Button btnBersihkan;

    float numX;
    float numY;
    float result = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vHasil = findViewById(R.id.result);
        inNumX = findViewById(R.id.inNumX);
        inNumY = findViewById(R.id.inNumY);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnBersihkan = findViewById(R.id.btnBersihkan);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(inNumX.getText().toString()) || TextUtils.isEmpty(inNumY.getText().toString())) {
                    vHasil.setText("\'Input tidak boleh kosong\'");
                } else {
                    numX = Float.parseFloat(inNumX.getText().toString());
                    numY = Float.parseFloat(inNumY.getText().toString());
                    result = numX + numY;

                    vHasil.setText(String.valueOf(result));
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(inNumX.getText().toString()) || TextUtils.isEmpty(inNumY.getText().toString())) {
                    vHasil.setText("\'Input tidak boleh kosong\'");
                } else {
                    numX = Float.parseFloat(inNumX.getText().toString());
                    numY = Float.parseFloat(inNumY.getText().toString());
                    result = numX - numY;

                    vHasil.setText(String.valueOf(result));
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(inNumX.getText().toString()) || TextUtils.isEmpty(inNumY.getText().toString())) {
                    vHasil.setText("\'Input tidak boleh kosong\'");
                } else {
                    numX = Float.parseFloat(inNumX.getText().toString());
                    numY = Float.parseFloat(inNumY.getText().toString());
                    result = numX * numY;

                    vHasil.setText(String.valueOf(result));
                }

            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(inNumX.getText().toString()) || TextUtils.isEmpty(inNumY.getText().toString())) {
                    vHasil.setText("\'Input tidak boleh kosong\'");
                } else {
                    numX = Float.parseFloat(inNumX.getText().toString());
                    numY = Float.parseFloat(inNumY.getText().toString());
                    result = numX / numY;

                    vHasil.setText(String.valueOf(result));
                }
            }
        });

        btnBersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inNumX.setText(null);
                inNumY.setText(null);
                result = 0f;

                vHasil.setText(String.valueOf(result));
            }
        });

    }
}