package com.example.th01_bai01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText heSoA = findViewById(R.id.soA);
        EditText heSoB = findViewById(R.id.soB);
        TextView kQ = findViewById(R.id.txtKetQua);

        Button btn_Cong = findViewById(R.id.button1);
        Button btn_Tru = findViewById(R.id.button2);
        Button btn_Nhan = findViewById(R.id.button3);
        Button btn_Chia = findViewById(R.id.button4);
        Button btn_UCLN = findViewById(R.id.button5);
        Button btn_Thoat = findViewById(R.id.button6);

        btn_Cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(heSoA.getText().toString());
                int b = Integer.parseInt(heSoB.getText().toString());

                int c = a + b;
                kQ.setText("" + c);
            }
        });

        btn_Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(heSoA.getText().toString());
                int b = Integer.parseInt(heSoB.getText().toString());

                int c = a - b;
                kQ.setText("" + c);
            }
        });

        btn_Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(heSoA.getText().toString());
                int b = Integer.parseInt(heSoB.getText().toString());

                int c = a * b;
                kQ.setText("" + c);
            }
        });

        btn_Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int a = Integer.parseInt(heSoA.getText().toString());
//                int b = Integer.parseInt(heSoB.getText().toString());

                double a = Double.parseDouble(heSoA.getText().toString());
                double b = Double.parseDouble(heSoB.getText().toString());

                double c = a / b;
                kQ.setText("" + c);
            }
        });

        btn_UCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(heSoA.getText().toString());
                int b = Integer.parseInt(heSoB.getText().toString());
                int c = 1;

                for (int i=2;i<=a;i++){
                    if(a%i == 0 && b%i == 0){
                        c = i;
                    }
                }
                kQ.setText("" + c);
            }
        });

        btn_Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}