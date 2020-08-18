package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn1;
    EditText t1,t2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //layout instance
        LayoutInflater li = getLayoutInflater();

        //view layout
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));


        //toast
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();


        //button and text
        btn1 = findViewById(R.id.btn1);
        t1 = findViewById(R.id.editTextNumber);
        t2 = findViewById(R.id.editTextNumber2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                s1 = t1.getText().toString();
                s2 = t2.getText().toString();
                intent.putExtra("value1",s1);
                intent.putExtra("value2",s2);
                startActivity(intent);
                finish();
            }
        });

    }















}