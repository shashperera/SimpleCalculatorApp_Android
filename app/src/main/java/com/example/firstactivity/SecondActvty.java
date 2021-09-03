package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActvty extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv_ans;

    String Num1;
    String Num2;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actvty);

        //Declare textviews
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv_ans = findViewById(R.id.tv_ans);

        Intent intent = getIntent();
        //Extract the string
        Num1 = intent.getStringExtra("n1");
        Num2 = intent.getStringExtra("n2");

        //Set text and pass values of Num1 and Num2
        et1.setText(Num1);
        et2.setText(Num2);

        //Convert string to int
        n1 = Integer.parseInt(Num1);
        n2 = Integer.parseInt(Num2);
    }
//
    public void add(View view){

        tv_ans.setText(Num1 + "+"+Num2 + "="+(n1+n2));
    }
    public void sub(View view){
        tv_ans.setText(Num1 + "-"+Num2 + "="+(n1 - n2));
    }
//    public void mul(View view){
//        tv_ans.setText(Num1 + "*"+Num2 + "="+(n1 * n2));
//    }
//    public void div(View view){
//        tv_ans.setText(Num1 + "/"+Num2 + "="+(n1 / n2));
//    }

}