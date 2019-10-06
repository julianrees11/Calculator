package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView display;
    private int num1 = -1;
    private String equation = "";
    private int num2 = 0;
    private int answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = findViewById(R.id.btn0);
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
        display = findViewById(R.id.answerText);
        Button clear = findViewById(R.id.btnClear);

        button0.setOnClickListener(this);
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
        clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                if (equation.equals("")){
                    num1 = 0;
                    display.append(String.valueOf(num1));
                }else{
                    num2 = 0;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btn1:
                if (equation.equals("")) {
                    num1 = 1;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 1;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btn2:
                if (equation.equals("")) {
                    num1 = 2;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 2;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btn3:
                if (equation.equals("")) {
                    num1 = 3;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 3;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btn4:
                if (equation.equals("")) {
                    num1 = 4;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 4;
                    display.append(String.valueOf(num2));
                }
                break;
            case R.id.btn5:
                if (equation.equals("")) {
                    num1 = 5;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 5;
                    display.append(String.valueOf(num1));
                }
                break;

            case R.id.btn6:
                if (equation.equals("")) {
                    num1 = 6;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 6;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btn7:
                if (equation.equals("")) {
                    num1 = 7;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 7;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btn8:
                if (equation.equals("")) {
                    num1 = 8;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 8;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btn9:
                if (equation.equals("")) {
                    num1 = 9;
                    display.append(String.valueOf(num1));
                } else {
                    num2 = 9;
                    display.append(String.valueOf(num2));
                }
                break;

            case R.id.btnDivide:
                equation = "/";
                display.append(equation);
                break;

            case R.id.btnEquals:
                display.append("=");
                if (equation.equalsIgnoreCase("/")) {
                    answer = num1 / num2;
                } else if (equation.equalsIgnoreCase("+")) {
                    answer = num1 + num2;
                } else if (equation.equalsIgnoreCase("-")) {
                    answer = num1 - num2;
                } else if (equation.equalsIgnoreCase("X")) {
                    answer = num1 * num2;
                }
                display.append(String.valueOf(answer));
                num1 = -1;
                num2 = 0;
                break;

            case R.id.btnMinus:
                equation = "-";
                display.append(equation);
                break;

            case R.id.btnPlus:
                equation = "+";
                display.append(equation);
                break;

            case R.id.btnx:
                equation = "X";
                display.append(equation);
                break;

            case R.id.btnClear:
                display.setText("");
                equation = "";
                break;
        }
    }
}
