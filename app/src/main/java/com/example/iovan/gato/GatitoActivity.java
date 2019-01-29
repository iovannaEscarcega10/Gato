package com.example.iovan.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GatitoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn_reset;
    EditText txt1;
    int c, turno,cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gatito);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        txt1 = findViewById(R.id.edit1);
        btn_reset = findViewById(R.id.juego);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_reset.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        c++;
        turno = c % 2;

        if (v.getId()==R.id.juego)
        {
            txt1.setEnabled(true);
            txt1.setText("");
            btn1.setEnabled(true);
            btn1.setText("");

            btn2.setEnabled(true);
            btn2.setText("");

            btn3.setEnabled(true);
            btn3.setText("");

            btn4.setEnabled(true);
            btn4.setText("");

            btn5.setEnabled(true);
            btn5.setText("");

            btn6.setEnabled(true);
            btn6.setText("");

            btn7.setEnabled(true);
            btn7.setText("");

            btn8.setEnabled(true);
            btn8.setText("");

            btn9.setEnabled(true);
            btn9.setText("");
        }

        if (turno == 1) {
            imprime('X', v);
        } else {
            imprime('O', v);
        }
    }

    public void imprime(char hola, View v) {
        switch (v.getId()) {
            case R.id.btn1:
                btn1.setText(hola + "");
                btn1.setEnabled(false);
                break;
            case R.id.btn2:
                btn2.setText(hola + "");
                btn2.setEnabled(false);
                break;
            case R.id.btn3:
                btn3.setText(hola + "");
                btn3.setEnabled(false);
                break;
            case R.id.btn4:
                btn4.setText(hola + "");
                btn4.setEnabled(false);
                break;
            case R.id.btn5:
                btn5.setText(hola + "");
                btn5.setEnabled(false);
                break;
            case R.id.btn6:
                btn6.setText(hola + "");
                btn6.setEnabled(false);
                break;
            case R.id.btn7:
                btn7.setText(hola + "");
                btn7.setEnabled(false);
                break;
            case R.id.btn8:
                btn8.setText(hola + "");
                btn8.setEnabled(false);
                break;
            default:
                btn9.setText(hola + "");
                btn9.setEnabled(false);
                break;
        }
        winner(hola);


    }
    public void winner(char letra)
    {
        if (btn1.getText().toString().equals(letra+"") && btn2.getText().toString().equals(letra+"")&& btn3.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if (btn4.getText().toString().equals(letra+"") && btn5.getText().toString().equals(letra+"")&& btn6.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
       else if (btn7.getText().toString().equals(letra+"") && btn8.getText().toString().equals(letra+"")&& btn9.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }
        else if (btn1.getText().toString().equals(letra+"") && btn4.getText().toString().equals(letra+"")&& btn7.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn2.setEnabled(false);
            btn5.setEnabled(false);
            btn8.setEnabled(false);
            btn3.setEnabled(false);
            btn6.setEnabled(false);
            btn9.setEnabled(false);
        }

        else if (btn2.getText().toString().equals(letra+"") && btn5.getText().toString().equals(letra+"")&& btn8.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn1.setEnabled(false);
            btn4.setEnabled(false);
            btn7.setEnabled(false);
            btn3.setEnabled(false);
            btn6.setEnabled(false);
            btn9.setEnabled(false);
        }

        else if (btn3.getText().toString().equals(letra+"") && btn6.getText().toString().equals(letra+"")&& btn9.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn1.setEnabled(false);
            btn4.setEnabled(false);
            btn7.setEnabled(false);
            btn2.setEnabled(false);
            btn5.setEnabled(false);
            btn8.setEnabled(false);
        }
        else if (btn1.getText().toString().equals(letra+"") && btn5.getText().toString().equals(letra+"")&& btn9.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
        }

        else if (btn3.getText().toString().equals(letra+"") && btn5.getText().toString().equals(letra+"")&& btn7.getText().toString().equals(letra+"")){
            txt1.setText("El ganador es:" +letra);
            txt1.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else  {
            txt1.setText("Hay un empate X0");
            txt1.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
    }
}
