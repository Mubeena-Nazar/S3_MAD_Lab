package com.example.intent2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t=(TextView)findViewById(R.id.txt);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        Bundle bundle=getIntent().getExtras();
        String msg=bundle.getString("Message");
        t.setText(t.getText()+" "+msg);
    }
}