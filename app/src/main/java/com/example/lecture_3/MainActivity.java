package com.example.lecture_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSubtract, buttonMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}