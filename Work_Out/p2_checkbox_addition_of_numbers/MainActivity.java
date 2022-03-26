package com.example.exam10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int sum=0;
    public void adding(View v){
        boolean isChecked=((CheckBox)v).isChecked();
        switch(v.getId()){
            case R.id.c1:
                if(isChecked){
                    sum=sum+1;
                }else{
                    sum=sum-1;
                }
                break;
            case R.id.c2:
                if(isChecked){
                    sum=sum+2;
                }else{
                    sum=sum-2;
                }
                break;
            case R.id.c3:
                if(isChecked){
                    sum=sum+3;
                }else{
                    sum=sum-3;
                }
                break;
            case R.id.c4:
                if(isChecked){
                    sum=sum+4;
                }else{
                    sum=sum-4;
                }
                break;
            case R.id.c5:
                if(isChecked){
                    sum=sum+5;
                }else{
                    sum=sum-5;
                }
                break;
        }
        Toast.makeText(MainActivity.this, "Sum  =  "+ sum , Toast.LENGTH_SHORT).show();
    }
}