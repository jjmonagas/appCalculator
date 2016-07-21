package com.jjmonagas.appcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operando1;
    private EditText operando2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operando1 = (EditText) findViewById(R.id.editTextOp1);
        operando2 = (EditText) findViewById(R.id.editTextOp2);
    }


    public void sumar(View v) {
        int op1 = Integer.parseInt(operando1.getText().toString());
        int op2 = Integer.parseInt(operando2.getText().toString());
        int resultado = op1 + op2;
        Toast.makeText(this, "El resultado de la suma es: " + resultado, Toast.LENGTH_LONG).show();
    }

    public void restar(View v) {
        int op1 = Integer.parseInt(operando1.getText().toString());
        int op2 = Integer.parseInt(operando2.getText().toString());
        int resultado = op1 - op2;
        Toast.makeText(this, "El resultado de la resta es: " + resultado, Toast.LENGTH_LONG).show();
    }

    public void dividir(View v) {
        int op1 = Integer.parseInt(operando1.getText().toString());
        int op2 = Integer.parseInt(operando2.getText().toString());
        int resultado = op1 / op2;
        Toast.makeText(this, "El resultado de la division es: " + resultado, Toast.LENGTH_LONG).show();
    }

    public void multiplicar(View v) {
        int op1 = Integer.parseInt(operando1.getText().toString());
        int op2 = Integer.parseInt(operando2.getText().toString());
        int resultado = op1 * op2;
        Toast.makeText(this, "El resultado de la multiplicacion es: " + resultado, Toast.LENGTH_LONG).show();
    }

    public void restar2(View v) {
        int op1 = Integer.parseInt(operando1.getText().toString());
        int op2 = Integer.parseInt(operando2.getText().toString());
        int resultado = op1 - op2;
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);

        //Creamos la información a pasar entre actividades
        Bundle b = new Bundle();
        b.putInt("RESULTADO", resultado);

        //Añadimos la información al intent
        intent.putExtras(b);

        //Iniciamos la nueva actividad
        startActivity(intent);
    }

}
