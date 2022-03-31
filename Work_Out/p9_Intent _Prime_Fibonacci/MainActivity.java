package com.example.p5_categorical_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_res,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Integer num1,num2;
        EditText n1,n2;

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);

        num1=Integer.parseInt(n1.getText().toString());
        num2=Integer.parseInt(n2.getText().toString());

        String num1_st=num1+" ";
        String num2_st=num2+" ";

    switch(item.getItemId()) {
        case R.id.f:
            Intent ifib=new Intent(MainActivity.this,MainActivity2.class);
            ifib.putExtra("key1",num1_st);
            ifib.putExtra("key2",num2_st);
            startActivity(ifib);
            return true;
        case R.id.p:
            Intent ip=new Intent(MainActivity.this,MainActivity3.class);
            ip.putExtra("key1",num1_st);
            ip.putExtra("key2",num2_st);
            startActivity(ip);
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}