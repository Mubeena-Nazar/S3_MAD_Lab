package com.example.exam10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.b1);
        t=findViewById(R.id.t1);
        e=findViewById(R.id.e1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n=Integer.parseInt(e.getText().toString());
                for(int i=1;i<10;i++){
                    t.setText(t.getText().toString()+ n +" * "+ i + " = "+ n*i+"\n");
                }
            }
        });

    }
}