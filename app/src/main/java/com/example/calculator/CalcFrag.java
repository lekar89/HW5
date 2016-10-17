package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Влад on 04.10.2016.
 */

public class CalcFrag extends Fragment implements View.OnClickListener {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button plus;
    Button minus;
    Button point;
    Button multi;
    Button degree;
    Button res;
    Button clear;
    EditText display;
    double a;
    double b;
    double result;
    char mark;
    boolean clicable = true;
    boolean pointClic = true;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Config.LOG, "onCreate");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.farg_calc, container, false);
        Log.d(Config.LOG, "onCreateView");

        display = (EditText) v.findViewById(R.id.display);
        display.setOnClickListener(this);

        one = (Button) v.findViewById(R.id.btnOne);
        one.setOnClickListener(this);

        two = (Button) v.findViewById(R.id.btnTwo);
        two.setOnClickListener(this);

        three = (Button) v.findViewById(R.id.btnThree);
        three.setOnClickListener(this);

        four = (Button) v.findViewById(R.id.btnFour);
        four.setOnClickListener(this);

        five = (Button) v.findViewById(R.id.btnFive);
        five.setOnClickListener(this);

        six = (Button) v.findViewById(R.id.btnSix);
        six.setOnClickListener(this);

        seven = (Button) v.findViewById(R.id.btnSeven);
        seven.setOnClickListener(this);

        eight = (Button) v.findViewById(R.id.btnEight);
        eight.setOnClickListener(this);

        nine = (Button) v.findViewById(R.id.btnNine);
        nine.setOnClickListener(this);

        zero = (Button) v.findViewById(R.id.btnZero);
        zero.setOnClickListener(this);

        plus = (Button) v.findViewById(R.id.btnPlus);
        plus.setOnClickListener(this);

        minus = (Button) v.findViewById(R.id.btnMinus);
        minus.setOnClickListener(this);

        degree = (Button) v.findViewById(R.id.btnDegree);
        degree.setOnClickListener(this);

        point = (Button) v.findViewById(R.id.btnPoint);
        point.setOnClickListener(this);

        multi = (Button) v.findViewById(R.id.btnMulti);
        multi.setOnClickListener(this);

        res = (Button) v.findViewById(R.id.btnRez);
        res.setOnClickListener(this);

        clear = (Button) v.findViewById(R.id.btnC);
        clear.setOnClickListener(this);


        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(Config.LOG, "onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(Config.LOG, "onStop");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(Config.LOG, "onPause");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                Log.d(Config.LOG, "One");
                display.setText(display.getText() + "1");
                break;
            case R.id.btnTwo:
                Log.d(Config.LOG, "btnTwo");
                display.setText(display.getText() + "2");
                break;
            case R.id.btnThree:
                Log.d(Config.LOG, "btnThree");
                display.setText(display.getText() + "3");
                break;
            case R.id.btnFour:
                Log.d(Config.LOG, "btnFour");
                display.setText(display.getText() + "4");
                break;
            case R.id.btnFive:
                Log.d(Config.LOG, "btnFive");
                display.setText(display.getText() + "5");
                break;
            case R.id.btnSix:
                Log.d(Config.LOG, "btnSix");
                display.setText(display.getText() + "6");
                break;
            case R.id.btnSeven:
                Log.d(Config.LOG, "btnSeven");
                display.setText(display.getText() + "7");
                break;
            case R.id.btnEight:
                Log.d(Config.LOG, "btnEight");
                display.setText(display.getText() + "8");
                break;
            case R.id.btnNine:
                Log.d(Config.LOG, "btnNine");
                display.setText(display.getText() + "9");
                break;
            case R.id.btnZero:
                Log.d(Config.LOG, "btnZero");
                if (display.getText().toString().equals("0")) {
                    return;
                } else {
                    display.setText(display.getText() + "0");
                }
                break;


            case R.id.btnPlus:
                Log.d(Config.LOG, "btnPlus");
                a = Double.parseDouble(display.getText().toString());
                display.setText(display.getText() + "+");
                mark = '+';
                plus.setClickable(clicable);
                clicable = false;

                break;
            case R.id.btnMinus:
                Log.d(Config.LOG, "btnMinus");
                a = Double.parseDouble(display.getText().toString());
                display.setText(display.getText() + "-");
                mark = '-';
                minus.setClickable(clicable);
                clicable = false;
                break;
            case R.id.btnMulti:
                Log.d(Config.LOG, "btnMulti");
                a = Double.parseDouble(display.getText().toString());
                display.setText(display.getText() + "*");
                mark = '*';
                multi.setClickable(clicable);
                clicable = false;
                break;
            case R.id.btnDegree:
                Log.d(Config.LOG, "btnDegree");
                a = Double.parseDouble(display.getText().toString());
                display.setText(display.getText() + "/");
                mark = '/';
                degree.setClickable(clicable);
                clicable = false;
                break;
            case R.id.btnC:
                Log.d(Config.LOG, "btnC");
                display.setText("");
                a = 0;
                b = 0;
                mark = '0';
                clicable = true;
                pointClic = true;
                break;
            case R.id.btnPoint:
                Log.d(Config.LOG, "btnPoint");
                if (pointClic) {
                    display.setText(display.getText() + ".");

                    pointClic = false;
                }
                break;

            case R.id.btnRez:

                Log.d(Config.LOG, "btnRez");

                String s = display.getText().toString();
                int end = s.length();
                int start;

                switch (mark) {
                    case '+':

                        start = s.indexOf('+');
                        s = s.substring(start + 1, end);
                        b = Double.parseDouble(s);
                        result = a + b;
                        break;
                    case '-':
                        start = s.indexOf('-');
                        s = s.substring(start + 1, end);
                        b = Double.parseDouble(s);
                        result = a - b;
                        break;
                    case '*':
                        start = s.indexOf('*');
                        s = s.substring(start + 1, end);
                        b = Double.parseDouble(s);
                        result = a * b;
                        break;
                    case '/':
                        start = s.indexOf('*');
                        s = s.substring(start + 1, end);
                        b = Double.parseDouble(s);
                        result = a / b;
                        break;
                }
                display.setText(result + "");
                Log.d(Config.LOG, "" + result);

                ResFrag resFrag = new ResFrag();
                Bundle bundle = new Bundle();

                bundle.putString("RES", result + "");
                resFrag.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.conteinerCalc, resFrag);
                fragmentTransaction.commit();
                break;
        }


    }
}
