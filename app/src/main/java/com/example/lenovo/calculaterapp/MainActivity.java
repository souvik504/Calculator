package com.example.lenovo.calculaterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button btn1,btn2,btn3,btn4,btn5;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.et_1);
        editText2=findViewById(R.id.et_2);
        btn1=findViewById(R.id.bt_1);
        btn2=findViewById(R.id.bt_2);
        btn3=findViewById(R.id.bt_3);
        btn4=findViewById(R.id.bt_4);
        btn5=findViewById(R.id.bt_5);
        tv=findViewById(R.id.tv);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1=editText1.getText().toString();
                String input2=editText2.getText().toString();
                if(input1.equals("")||input2.equals("")) {
                    Toast.makeText(MainActivity.this,"Enter the all values in all field",Toast.LENGTH_LONG).show();

                } else
                {
                    double a=Double.parseDouble(input1);
                    double b=Double.parseDouble(input2);
                    tv.setText(String.valueOf(a+b));

                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1=editText1.getText().toString();
                String input2=editText2.getText().toString();
                if(input1.equals("")||input2.equals("")) {
                    Toast.makeText(MainActivity.this,"Enter values  in all field",Toast.LENGTH_LONG).show();

                } else
                {
                    double a=Double.parseDouble(input1);
                    double b=Double.parseDouble(input2);
                    tv.setText(String.valueOf(a-b));

                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1=editText1.getText().toString();
                String input2=editText2.getText().toString();
                if(input1.equals("")||input2.equals("")) {
                    Toast.makeText(MainActivity.this,"Enter values  in all field",Toast.LENGTH_LONG).show();

                } else
                {
                    double a=Double.parseDouble(input1);
                    double b=Double.parseDouble(input2);
                    tv.setText(String.valueOf(a*b));

                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1=editText1.getText().toString();
                String input2=editText2.getText().toString();
                if(input1.equals("")||input2.equals("")) {
                    Toast.makeText(MainActivity.this,"Enter values  in all field",Toast.LENGTH_LONG).show();

                } else
                {
                    double a=Double.parseDouble(input1);
                    double b=Double.parseDouble(input2);
                    tv.setText(String.valueOf(a/b));

                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1=editText1.getText().toString();
                String input2=editText2.getText().toString();
                if(input1.equals("")||input2.equals("")) {
                    Toast.makeText(MainActivity.this,"Enter values  in all field",Toast.LENGTH_LONG).show();

                } else
                {
                    double a=Double.parseDouble(input1);
                    double b=Double.parseDouble(input2);
                    tv.setText(String.valueOf(a%b));

                }
            }
        });
    }
}
