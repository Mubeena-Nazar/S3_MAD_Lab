package com.example.p7_registration_from;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText n=findViewById(R.id.n);
        EditText r=findViewById(R.id.r);
        EditText m=findViewById(R.id.m);

        Button b=findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ns=n.getText().toString();
                Integer rs=Integer.parseInt(r.getText().toString());
                Integer ms=Integer.parseInt(m.getText().toString());


                String values="\nName : "+ns+"\nRoll No : "+rs+"\nMark :  "+ms;
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("detail",values+" ");
                startActivity(i);
            }
        });
    }
}