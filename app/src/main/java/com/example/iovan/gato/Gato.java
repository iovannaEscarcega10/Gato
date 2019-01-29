package com.example.iovan.gato;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;

import java.util.Random;

import android.content.Intent;

public class Gato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);

        new CountDownTimer(10000, 500) {
            @Override
            public void onTick(long millsUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent s = new Intent(Gato.this,GatitoActivity.class);
                startActivity(s);
            }


        }.start();
    }
}