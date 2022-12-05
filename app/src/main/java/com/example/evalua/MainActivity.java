package com.example.evalua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imAncla, imFondo, imEscudo;
    ConstraintLayout clPrincipal, clLogin, clEscudoco, clUsuario, clPie;
    boolean menuancla = false;
    TextView tvRepcol, tvCorreo, tvClave;
    EditText etCorreo, etClave;
    Button btIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imAncla = findViewById(R.id.imAncla);
        clPrincipal = findViewById(R.id.clPrincipal);
        clLogin = findViewById(R.id.clLogin);
        clEscudoco = findViewById(R.id.clEscudoco);
        clUsuario = findViewById(R.id.clUsuario);
        clPie = findViewById(R.id.clPie);
        etCorreo = findViewById(R.id.etCorreo);
        etClave = findViewById(R.id.etClave);
        etCorreo.setText("");
        etClave.setText("");
        btIngresar = findViewById(R.id.btIngresar);

        btIngresar.setOnClickListener(new View.OnClickListener() { /*Asi se declara un evento click*/
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Oficiales.class);
                startActivity(intent);
            }
        });




    }

}






