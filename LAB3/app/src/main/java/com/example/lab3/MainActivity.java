package com.example.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //declaramos las variables de los controles que vamos a utilizar
    EditText txtNum1;
    EditText txtNum2;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InicializarControles();
    }

    private void InicializarControles() {
        txtNum1 = (EditText)findViewById(R.id.txtNum1);
        txtNum2 = (EditText)findViewById(R.id.txtNum2);

        lblResultado = (TextView)findViewById(R.id.lblRes);
    }

    public void SumarNumeros(View view)
    {
        try{
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            int resultado = n1+n2;

            lblResultado.setText(Integer.toString(resultado));
        }
        catch (Exception e)
        {
            Toast.makeText(this,"Error en la suma de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}