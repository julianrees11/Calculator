package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView display;
    private int num1 = -1;
    private String equation = "";
    private int num2 = 0;
    private int answer = 0;
    private String num1S = "";
    private String num2S = "";
    private CharSequence dis;
    private CharSequence dis2;
    private String str2 = "";

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
                display.append("0");
                break;

            case R.id.btn1:
                display.append("1");
                break;

            case R.id.btn2:
                display.append("2");
                break;

            case R.id.btn3:
                display.append("3");
                break;

            case R.id.btn4:
                display.append("4");
                break;
            case R.id.btn5:
                display.append("5");
                break;

            case R.id.btn6:
                display.append("6");
                break;

            case R.id.btn7:
                display.append("7");
                break;

            case R.id.btn8:
                display.append("8");
                break;

            case R.id.btn9:
                display.append("9");
                break;

            case R.id.btnDivide:
                dis2 = display.getText();
                num1S = str2.valueOf(dis2);
                equation = "/";
                display.append(equation);
                break;

            case R.id.btnEquals:
                dis = display.getText();
                String str = dis.toString();                                 //012           01234                012
                int index = str.indexOf(equation);//=2                      // 1+1           10+10                9+9

                for (;dis.length() > index;){
                    int i;
                    i = dis.length() - index + 1;
                    System.out.println(i);
                }







                num1 = Integer.valueOf(num1S);
                num2 = Integer.valueOf(num2S);
                display.append("=");
                System.out.println(num1 + " " + num2);
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
                num1 = 0;
                num2 = 0;
                break;

            case R.id.btnMinus:
                dis2 = display.getText();
                num1S = str2.valueOf(dis2);
                equation = "-";
                display.append(equation);
                break;

            case R.id.btnPlus:
                dis2 = display.getText();
                num1S = str2.valueOf(dis2);
                equation = "+";
                display.append(equation);
                break;

            case R.id.btnx:
                dis2 = display.getText();
                num1S = str2.valueOf(dis2);
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