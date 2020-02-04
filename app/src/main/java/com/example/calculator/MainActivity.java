package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        resultText = (TextView) findViewById(R.id.textView);
    }

    public void sum(View view){
        if(editText.getText().toString().equals("") || editText2.getText().toString().equals("")){
            resultText.setText("Sayi Giriniz");
        }
        else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int resultInteger = a + b;
            resultText.setText("Result: " + resultInteger);
        }
    }
    public void deduct(View view){
        if(editText.getText().toString().equals("") || editText2.getText().toString().equals("")){
            resultText.setText("Sayi Giriniz");
        }
        else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int resultInteger = a - b;
            resultText.setText("Result: " + resultInteger);
        }
    }
    public void multiply(View view){
        if(editText.getText().toString().equals("") || editText2.getText().toString().equals("")){
            resultText.setText("Sayi Giriniz");
        }
        else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int resultInteger = a * b;
            resultText.setText("Result: " + resultInteger);
        }
    }
    public void divide(View view){
        if(editText.getText().toString().equals("") || editText2.getText().toString().equals("")){
            resultText.setText("Sayi Giriniz");
        }
        else {
            double a = Double.parseDouble(editText.getText().toString());
            double b = Double.parseDouble(editText2.getText().toString());
            double resultInteger = a / b;
            resultText.setText("Result: " + resultInteger);
        }

    }

}
