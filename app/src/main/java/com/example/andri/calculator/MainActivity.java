package com.example.andri.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public String[] arrays = new String[1];
    int pointer = 0;
    private TextView value;
    private TextView act;
    private TextView result;
    private boolean valid = false;
    public String[] amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value = findViewById(R.id.value);
        act = findViewById(R.id.act);
        result = findViewById(R.id.result);


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

                                                                 addMasiv("+");
                                                                 valid = true;


                                                             }
                                                         }
        );

        findViewById(R.id.button_min).setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View view) {

                                                                  addMasiv("-");
                                                                  valid = true;
                                                                  result();


                                                              }
                                                          }
        );
        findViewById(R.id.button_x).setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View view) {

                                                                  addMasiv("X");
                                                                  result();
                                                                  valid = true;

                                                              }
                                                          }
        );
        findViewById(R.id.button_dev).setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View view) {

                                                                  addMasiv("/");
                                                                  valid = true;



                                                              }
                                                          }
        );


    }

    private static String removeCharAt(String s, int pos) {
        if(pos>0)return s.substring(0, pos) + s.substring(pos + 1);
        return "";
    }

    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(arrays, 0, newArray, 0, pointer);
        arrays =  newArray;
    }
    private  void addMasiv(String s){
        String arrAct = "";
        if (valid == false){
        arrays[pointer]=(String) value.getText();}
        else arrays[pointer]= ((String) value.getText()).substring(1);
        pointer++;
        System.out.println(pointer);

        for (int i=0; i<arrays.length; i++){
            arrAct = arrAct + arrays[i];
        }
        act.setText(arrAct);
        value.setText(s);
        resize(arrays.length + 2);
        arrays[pointer] = s;
        pointer ++;

        System.out.println(pointer);
    }

    private void result(){
       int res = 0;
       amount = new String[arrays.length-1];
       System.arraycopy(arrays,0,amount,0, arrays.length-1);
        for (int i = 0; i<amount.length-2; i++){
         if (amount[i].equals("X")){
            res = Integer.parseInt(amount[i-1]) * Integer.parseInt(amount[i+1]);
            amount[i-1] = Integer.toString(res);
            masivCrop(i);}

        // if (amount[i + 1]== "/")
          // res = Integer.parseInt(amount[i]) / Integer.parseInt(amount[i+2]);


        }
        result.setText(String.valueOf(res));
        System.out.println(amount);
    }

    private void masivCrop(int index){
        for (int i = index ; index<amount.length - 2; index++ ){
         amount[i] = amount[i+2];
        }
       resizeCrop(amount.length - 2);
    }

    private void resizeCrop(int newLength) {
        String[] newArray1 = new String[newLength];
        System.arraycopy(amount, 0, newArray1, 0, amount.length - 2);
        amount =  newArray1;
    }
}

