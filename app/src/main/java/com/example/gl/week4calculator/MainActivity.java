package com.example.gl.week4calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView resultingText;

    String operationString="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultingText =(TextView)findViewById(R.id.txtResult);
    }

    public void calculate(View view) {

        int ID = view.getId();

        switch (ID){
            case R.id.btn1:
                operationString+= "1";
                break;
            case R.id.btn2:
                operationString+= "2";
                break;
            case R.id.btnEqual:
                resultingText.setText(operationString);
                break;
        }

    }
}
