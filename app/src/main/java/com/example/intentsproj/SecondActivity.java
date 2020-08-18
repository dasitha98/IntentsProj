package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView t1,t2;
    String s1,s2;

    Button add,sub,div,mul;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Context context = getApplicationContext();
        CharSequence message = "You just click the ok button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

        t1 = findViewById(R.id.editTextNumber3);
        t2 = findViewById(R.id.editTextNumber4);

        s1 = getIntent().getExtras().getString("value1");
        s2 = getIntent().getExtras().getString("value2");

        t1.setText(s1);
        t2.setText(s2);

        ans = findViewById(R.id.textView4);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(s1.length() == 0){
                    s1 = ("0");
                }
                if(s2.length() == 0){
                    s2 = ("0");
                }
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int sum = num1 + num2;

                ans.setText((String.valueOf(num1 +"+"+ num2 +"=" + sum)));

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(s1.length() == 0){
                    s1 = ("0");
                }
                if(s2.length() == 0){
                    s2 = ("0");
                }
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int sum = num1 - num2;

                ans.setText((String.valueOf(num1 +"-"+ num2 +"=" + sum)));

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(s1.length() == 0){
                    s1 = ("0");
                }
                if(s2.length() == 0){
                    s2 = ("0");
                }
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int sum = num1 * num2;

                ans.setText((String.valueOf(num1 +"*"+ num2 +"=" + sum)));

            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(s1.length() == 0){
                    s1 = ("0");
                }
                if(s2.length() == 0){
                    s2 = ("0");
                }
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int sum = num1 / num2;

                ans.setText((String.valueOf(num1 +"/"+ num2 +"=" + sum)));

            }
        });







    }
}