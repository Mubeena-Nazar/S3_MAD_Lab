package com.example.p8_optionsmenu_interest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView sim_t=findViewById(R.id.sim_t);
        Bundle b=getIntent().getExtras();
        String sim_st=b.getString("sim_val");

        sim_t.setText(sim_t.getText()+" "+sim_st);
    }
}