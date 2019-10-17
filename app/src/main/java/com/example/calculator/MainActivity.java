package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView display;
    private double num1 = 0;
    private String equation = "";
    private double num2 = 0;
    private double answer = 0;
    private boolean isPressed = false;
    private boolean isPressedD = false;
    private boolean isPressedDEL = false;

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
        Button buttonD = findViewById(R.id.btnDecimal);
        Button buttonDEL = findViewById(R.id.btnDEL);

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
        buttonD.setOnClickListener(this);
        buttonDEL.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                display.append("0");
                isPressedDEL = true;
                break;

            case R.id.btn1:
                display.append("1");
                isPressedDEL = true;
                break;

            case R.id.btn2:
                display.append("2");
                isPressedDEL = true;
                break;

            case R.id.btn3:
                display.append("3");
                isPressedDEL = true;
                break;

            case R.id.btn4:
                display.append("4");
                isPressedDEL = true;
                break;
            case R.id.btn5:
                display.append("5");
                isPressedDEL = true;
                break;

            case R.id.btn6:
                display.append("6");
                isPressedDEL = true;
                break;

            case R.id.btn7:
                display.append("7");
                isPressedDEL = true;
                break;

            case R.id.btn8:
                display.append("8");
                isPressedDEL = true;
                break;

            case R.id.btn9:
                display.append("9");
                isPressedDEL = true;
                break;

            case R.id.btnDivide:
                if (isPressed == false) {
                    num1 = Double.valueOf(display.getText().toString());
                    equation = "/";
                    display.append(equation);
                    isPressedD = false;
                    isPressedDEL = true;
                } else {
                    Toast.makeText(this, "You need to press 'Clear' first!", Toast.LENGTH_SHORT).show();
                }
                isPressed = true;
                break;

            case R.id.btnEquals:
                if (!equation.equals("")) {
                    int index = display.getText().toString().indexOf(equation);
                    num2 = Double.valueOf(display.getText().toString().substring(index + 1));

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
                    num1 = 0;
                    num2 = 0;
                    equation = "";
                    isPressedD = false;
                    isPressedDEL = false;
                } else {
                    Toast.makeText(this, "You need an operator!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btnMinus:
                if (isPressed == false) {
                    num1 = Double.valueOf(display.getText().toString());
                    equation = "-";
                    display.append(equation);
                    isPressedD = false;
                    isPressedDEL = true;
                } else {
                    Toast.makeText(this, "You need to press 'Clear' first!", Toast.LENGTH_SHORT).show();
                }
                isPressed = true;
                break;

            case R.id.btnPlus:
                if (isPressed == false) {
                    num1 = Double.valueOf(display.getText().toString());
                    equation = "+";
                    display.append(equation);
                    isPressedD = false;
                    isPressedDEL = true;
                } else {
                    Toast.makeText(this, "You need to press 'Clear' first!", Toast.LENGTH_SHORT).show();
                }
                isPressed = true;
                break;

            case R.id.btnx:
                if (isPressed == false) {
                    num1 = Double.valueOf(display.getText().toString());
                    equation = "X";
                    display.append(equation);
                    isPressedD = false;
                    isPressedDEL = true;
                } else {
                    Toast.makeText(this, "You need to press 'Clear' first!", Toast.LENGTH_SHORT).show();
                }
                isPressed = true;
                break;

            case R.id.btnClear:
                display.setText("");
                equation = "";
                isPressed = false;
                isPressedD = false;
                isPressedDEL = false;
                break;
            case R.id.btnDecimal:
                if (!isPressedD) {
                    display.append(".");
                    isPressedD = true;
                    isPressedDEL = true;
                }else{
                    Toast.makeText(this, "You've already pressed this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnDEL:
                if (!display.getText().toString().equalsIgnoreCase("")) {
                    if (isPressedDEL) {
                        String i = display.getText().toString();
                        String s = i.substring(0, i.length() - 1);
                        display.setText(s);
                        isPressed = false;
                    }
                }
                break;
        }
    }
}