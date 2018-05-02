package com.example.masit.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    private EditText first, second;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        init();
    }

    private void init() {
        buttonAdd = (Button) findViewById(R.id.button2);
        buttonSubtract = (Button) findViewById(R.id.button4);
        buttonMultiply = (Button) findViewById(R.id.button3);
        buttonDivide = (Button) findViewById(R.id.button);
        first = (EditText) findViewById(R.id.editText);
        second = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.textView4);

        buttonAdd.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String firstNum = first.getText().toString();
        String secondNum = second.getText().toString();
        switch(v.getId()) {
            case R.id.button2:
                int addition = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                result.setText(String.valueOf(addition));
                break;
            case R.id.button4:
                int subtraction = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.button3:
                int multiplication = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
                result.setText(String.valueOf(multiplication));
                break;
            case R.id.button:
                try {
                    int division = Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
                    result.setText(String.valueOf(division));
                } catch (Exception e) {
                    result.setText("Please don't divide by 0.");
                }
                break;
        }
    }
}
