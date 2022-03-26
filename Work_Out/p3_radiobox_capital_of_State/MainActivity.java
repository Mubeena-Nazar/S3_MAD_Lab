package com.example.exam10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void capital(View v){
        boolean isChecked = ((RadioButton)v).isChecked();

        switch(v.getId()){
            case R.id.c1:
                if(isChecked){
                    Toast.makeText(this, "Thiruvananthapuram", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c2:
                if(isChecked){
                    Toast.makeText(this, "Chennai", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c3:
                if(isChecked){
                    Toast.makeText(this, "Hyderarbad", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
