package com.delgadom.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);
        Double dollarAmount = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double lpsAmount = 23.7;
        Double totalAmount = dollarAmount * lpsAmount;
        Toast.makeText(this, "Lps. " + String.format("%.2f", totalAmount), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
