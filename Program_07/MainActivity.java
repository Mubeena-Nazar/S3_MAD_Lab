package com.example.myapplication;

import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickmethod(View v)
    {
        Toast.makeText(this,"You are always welcome",Toast.LENGTH_SHORT).show();
    }
}