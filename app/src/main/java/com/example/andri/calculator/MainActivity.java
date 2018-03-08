package com.example.andri.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public String[] arrays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView value = findViewById(R.id.value);
        final TextView act = findViewById(R.id.act);
        TextView result = findViewById(R.id.result);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() + "1");
            }
        }
        );
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "2");
                                                          }
                                                      }
        );
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "3");
                                                          }
                                                      }
        );
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "4");
                                                          }
                                                      }
        );
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "5");
                                                          }
                                                      }
        );
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "6");
                                                          }
                                                      }
        );
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "7");
                                                          }
                                                      }
        );
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "8");
                                                          }
                                                      }
        );
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "9");
                                                          }
                                                      }
        );
        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + "0");
                                                          }
                                                      }
        );
        findViewById(R.id.button_dot).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              value.setText(value.getText() + ".");
                                                          }
                                                      }
        );



        findViewById(R.id.button_bs).setOnClickListener(new View.OnClickListener() {
                                                             @Override
                                                             public void onClick(View view) {
                                                                 int pos = value.getText().length();
                                                                 value.setText(removeCharAt(
                                                                         (String) value.getText(), pos-1));
                                                             }
                                                         }
        );

        findViewById(R.id.button_plus).setOnClickListener(new View.OnClickListener() {
                                                             @Override
                                                             public void onClick(View view) {
                                                                 arrays = new String[]{(String) value.getText()};

                                                                 act.setText(arrays[0]);
                                                                 value.setText("+");
                                                             }
                                                         }
        );


    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}

