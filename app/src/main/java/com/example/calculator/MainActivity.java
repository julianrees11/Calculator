package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView answers = findViewById(R.id.answerText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button buttonPlus = findViewById(R.id.btnPlus);
        Button buttonMinus = findViewById(R.id.btnMinus);
        Button buttonMultiply = findViewById(R.id.btnx);
        Button buttonDivide = findViewById(R.id.btnDivide);
        Button equals = findViewById(R.id.btnEquals);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        equals.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int num1 = -1;
        String equation = "";
        int num2 = 0;
        double answer = 0;
        boolean whilel = true;

        while(whilel){
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 1;
                } else {
                    num1 = 1;
                }
                break;

            case R.id.btn2:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 2;
                } else {
                    num1 = 2;
                }
                break;

            case R.id.btn3:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 3;
                } else {
                    num1 = 3;
                }
                break;

            case R.id.btn4:
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 4;
                } else {
                    num1 = 4;
                }
                break;
            case R.id.btn5:
                Toast.makeText(this, "5", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 5;
                } else {
                    num1 = 5;
                }
                break;

            case R.id.btn6:
                Toast.makeText(this, "6", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 6;
                } else {
                    num1 = 6;
                }
                break;

            case R.id.btn7:
                Toast.makeText(this, "7", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 7;
                } else {
                    num1 = 7;
                }
                break;

            case R.id.btn8:
                Toast.makeText(this, "8", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 8;
                } else {
                    num1 = 8;
                }
                break;

            case R.id.btn9:
                Toast.makeText(this, "9", Toast.LENGTH_SHORT).show();
                if (num1 > -1) {
                    num2 = 9;
                } else {
                    num1 = 9;
                }
                break;

            case R.id.btnDivide:
                Toast.makeText(this, "/", Toast.LENGTH_SHORT).show();
                equation = "/";
                break;

            case R.id.btnEquals:
                Toast.makeText(this, "=", Toast.LENGTH_SHORT).show();
                if (equation.equalsIgnoreCase("/")) {
                    answer = num1 / num2;
                } else if (equation.equalsIgnoreCase("+")) {
                    answer = num1 + num1;
                } else if (equation.equalsIgnoreCase("-")) {
                    answer = num1 - num2;
                } else if (equation.equalsIgnoreCase("X")) {
                    answer = num1 * num2;
                }
                answers.setText((int) answer);
                break;

            case R.id.btnMinus:
                Toast.makeText(this, "-", Toast.LENGTH_SHORT).show();
                equation = "-";
                break;

            case R.id.btnPlus:
                Toast.makeText(this, "+", Toast.LENGTH_SHORT).show();
                equation = "+";
                break;

            case R.id.btnx:
                Toast.makeText(this, "X", Toast.LENGTH_SHORT).show();
                equation = "X";
                break;
            }
        }
    }
}
