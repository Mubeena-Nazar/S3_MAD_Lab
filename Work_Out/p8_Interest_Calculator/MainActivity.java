package com.example.p8_optionsmenu_interest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText p,r,t;
    Integer pi,ri,ti,s,c;
    String pass_s,pass_c;
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
        p=findViewById(R.id.p);
        r=findViewById(R.id.r);
        t=findViewById(R.id.t);

        pi=Integer.parseInt(p.getText().toString());
        ri=Integer.parseInt(r.getText().toString());
        ti=Integer.parseInt(t.getText().toString());

        s=(pi*ri*ti)/100;
        pass_s=s+" ";

        c=(pi*((1+ (ri/100) )*ti))-pi;
        pass_c=c+" ";




        switch (item.getItemId()){
            case R.id.sim:
                Toast.makeText(this, "Simple", Toast.LENGTH_SHORT).show();
                Intent sim_i=new Intent(MainActivity.this,MainActivity2.class);
                sim_i.putExtra("sim_val",pass_s+" ");
                startActivity(sim_i);
                return true;
            case R.id.com:
                Toast.makeText(this, "Compound", Toast.LENGTH_SHORT).show();
                Intent com_i=new Intent(MainActivity.this,MainActivity3.class);
                com_i.putExtra("com_val",pass_c+" ");
                startActivity(com_i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}