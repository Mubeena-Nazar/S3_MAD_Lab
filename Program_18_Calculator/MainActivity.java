package com.example.exam6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView r;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = (TextView) findViewById(R.id.res);
        Button b0 = (Button) findViewById(R.id.id0);
        Button b1 = (Button) findViewById(R.id.id1);
        Button b2 = (Button) findViewById(R.id.id2);
        Button b3 = (Button) findViewById(R.id.id3);
        Button b4 = (Button) findViewById(R.id.id4);
        Button b5 = (Button) findViewById(R.id.id5);
        Button b6 = (Button) findViewById(R.id.id6);
        Button b7 = (Button) findViewById(R.id.id7);
        Button b8 = (Button) findViewById(R.id.id8);
        Button b9 = (Button) findViewById(R.id.id9);

        Button bp = (Button) findViewById(R.id.idp);
        Button bs = (Button) findViewById(R.id.ids);
        Button bm = (Button) findViewById(R.id.idm);
        Button bd = (Button) findViewById(R.id.idd);
        Button be = (Button) findViewById(R.id.ide);
        Button br = (Button) findViewById(R.id.idr);



        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.setText(r.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText() + "9");

            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r.getText().length() != 0) {
                    input1 = Float.parseFloat(r.getText() + "");
                    Addition = true;
                    decimal = false;
                    r.setText(null);
                }
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r.getText().length() != 0) {
                    input1 = Float.parseFloat(r.getText() + "");
                    Subtract = true;
                    decimal = false;
                    r.setText(null);
                }
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r.getText().length() != 0) {
                    input1 = Float.parseFloat(r.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    r.setText(null);
                }
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r.getText().length() != 0) {
                    input1 = Float.parseFloat(r.getText() + "");
                    Division = true;
                    decimal = false;
                    r.setText(null);
                }
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(r.getText() + "");
                }

                if (Addition) {

                    r.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    r.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    r.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    r.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    r.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });



//        buttonDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (decimal) {
//                    //do nothing or you can show the error
//                } else {
//                    edt1.setText(edt1.getText() + ".");
//                    decimal = true;
//                }
//
//            }
//        });
//    }
//}
    }
}