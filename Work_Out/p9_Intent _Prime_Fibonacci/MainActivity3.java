package com.example.p5_categorical_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView tt=findViewById(R.id.tt);
        Bundle b=getIntent().getExtras();
        String n1=b.getString("key1");
        String n2=b.getString("key2");


        double num1=Double.parseDouble(n1);
        double num2=Double.parseDouble(n2);

        for(double j=num1;j<num2;j++){
            if(j==1){
                continue;
            }
            int f=0;
            for(int i=2;i<j;i++){
                if(j%i==0.0){
                    f++;
                }
            }
            if(f==0){
                tt.setText(tt.getText().toString()+"\n"+j);
            }
        }

    }
}