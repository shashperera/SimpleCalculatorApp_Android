package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   //edit text objects
    EditText et1;
    EditText et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1); //capture text values into new objects
        et2 = findViewById(R.id.et2);
    }


    public void OK(View view){

        Intent intent= new Intent(this, SecondActvty.class);

        String value1 = et1.getText().toString(); //Save the values into a string variable
        String value2 = et2.getText().toString();

        //Add extended data to the intent(Add edit text values to the intent)
        intent.putExtra("n1",value1);
        intent.putExtra("n2",value2);

        //Custom Toast
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup)findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        startActivity(intent);

    }

}