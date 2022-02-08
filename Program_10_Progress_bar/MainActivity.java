package com.adee.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
int counter=0;
ProgressBar p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar();
    }
    public void progressBar()
    {
        p=(ProgressBar)findViewById(R.id.progressBar);
        Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                counter++;
                p.setProgress(counter);
                if(counter==100) {
                    t.cancel();
                }

            }
        };
        t.schedule(tt,0,100);

    }
}