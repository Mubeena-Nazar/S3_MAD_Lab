package com.example.p8_optionsmenu_interest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView com_t=findViewById(R.id.com_t);
        Bundle b=getIntent().getExtras();
        String com_st=b.getString("com_val");

        com_t.setText(com_t.getText()+" "+com_st);
    }
}