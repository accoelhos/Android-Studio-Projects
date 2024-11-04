package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //Variaveis
    double n1, n2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botões
        Button somar = (Button)findViewById(R.id.somar);
        Button subtrair = (Button)findViewById(R.id.subtrair);
        Button multiplicar = (Button)findViewById(R.id.multiplicar);
        Button dividir = (Button)findViewById(R.id.dividir);
        //Textos
        TextView resultado = (TextView)findViewById(R.id.resultado);
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        //Funções dos botões
        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(num1.getText().toString());
                n2= Double.parseDouble(num2.getText().toString());
                result = n1+n2;
                resultado.setText(String.valueOf(result));

            }
        });
        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(num1.getText().toString());
                n2= Double.parseDouble(num2.getText().toString());
                result = n1-n2;
                resultado.setText(String.valueOf(result));
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(num1.getText().toString());
                n2= Double.parseDouble(num2.getText().toString());
                result = n1*n2;
                resultado.setText(String.valueOf(result));
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1= Double.parseDouble(num1.getText().toString());
                n2= Double.parseDouble(num2.getText().toString());
                result = n1/n2;
                resultado.setText(String.valueOf(result));
            }
        });


    }

}