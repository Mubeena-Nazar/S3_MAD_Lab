package com.example.p5_categorical_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t,t2;
        t=findViewById(R.id.t);
        t2=findViewById(R.id.t2);
        Bundle b=getIntent().getExtras();
        String n1=b.getString("key1");
        String n2=b.getString("key2");
        int f,s,th,num,i;

        double num1=Double.parseDouble(n1);
        if(num1<=1){
            t.setText(t.getText().toString()+"0\t1");
        }
        else{
            f=0;s=1;
            t.setText(t.getText().toString()+f+" "+s);
            for(i=2;i<=num1;i++){
                th=f+s;
                t.setText(t.getText()+" "+th);
                f=s;
                s=th;
            }
        }

        double num2=Double.parseDouble(n2);
        if(num2<=1){
            t.setText(t2.getText().toString()+"0\t1");
        }
        else{
            f=0;s=1;
            t2.setText(t2.getText().toString()+f+" "+s);
            for(i=2;i<=num2;i++){
                th=f+s;
                t2.setText(t2.getText()+" "+th);
                f=s;
                s=th;
            }
        }

    }
}