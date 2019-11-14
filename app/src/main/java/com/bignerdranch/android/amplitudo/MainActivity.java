package com.bignerdranch.android.amplitudo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnHash, btnStar ;
    Button btnDelete;
    ImageView btnCall;
    TextView numDisplay;
    String callNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsById();
        setActionListeners();
        callNumber = "";
        numDisplay.setText(callNumber);
    }

    public void findViewsById() {
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnHash = findViewById(R.id.btn_hasht);
        btnStar = findViewById(R.id.btn_star);

        btnDelete = findViewById(R.id.btn_del);
        btnCall = findViewById(R.id.btn_call);

        numDisplay = findViewById(R.id.disp_numb_txt);
    }

    public void setActionListeners() {

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "0";
                numDisplay.setText(callNumber);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "1";
                numDisplay.setText(callNumber);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "2";
                numDisplay.setText(callNumber);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "3";
                numDisplay.setText(callNumber);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "4";
                numDisplay.setText(callNumber);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "5";
                numDisplay.setText(callNumber);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "6";
                numDisplay.setText(callNumber);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "7";
                numDisplay.setText(callNumber);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "8";
                numDisplay.setText(callNumber);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "9";
                numDisplay.setText(callNumber);
            }
        });

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "*";
                numDisplay.setText(callNumber);
            }
        });

        btnHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber + "#";
                numDisplay.setText(callNumber);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNumber = callNumber.substring(0, callNumber.length()-1);
                numDisplay.setText(callNumber);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, callNumber, Toast.LENGTH_SHORT).show();
            }
        });
    }




}
