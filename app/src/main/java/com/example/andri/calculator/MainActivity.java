package com.example.andri.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView value = findViewById(R.id.value);
        TextView act = findViewById(R.id.act);
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
    }
}

