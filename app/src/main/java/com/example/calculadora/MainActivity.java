package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText primeroN;
    private EditText segundoN;
    private TextView resultadoOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primeroN = findViewById(R.id.primer);
        segundoN = findViewById(R.id.segundo);

        resultadoOperacion = findViewById(R.id.resultado);
    }
    public void sumar(View  view){
        double calculo = Double.parseDouble(primeroN.getText().toString())+Double.parseDouble(segundoN.getText().toString());
        resultadoOperacion.setText(calculo+"");
    }

    public void restar(View  view){
        double calculo = Double.parseDouble(primeroN.getText().toString())-Double.parseDouble(segundoN.getText().toString());
        resultadoOperacion.setText(calculo+"");
    }

    public void multiplicar(View  view){
        double calculo = Double.parseDouble(primeroN.getText().toString())*Double.parseDouble(segundoN.getText().toString());
        resultadoOperacion.setText(calculo+"");
    }

    public void dividir(View  view){
        double calculo = Double.parseDouble(primeroN.getText().toString())/Double.parseDouble(segundoN.getText().toString());
        resultadoOperacion.setText(calculo+"");
    }

    public void boorarM(View view){
        Clear llamarMetodo = new Clear();
        llamarMetodo.borrar(findViewById(R.id.resultado));
        llamarMetodo.borrar(findViewById(R.id.primer));
        llamarMetodo.borrar(findViewById(R.id.segundo));
    }

}