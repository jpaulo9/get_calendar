package com.example.dentista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dentista.user.Cadastro;
import com.example.dentista.user.User_Perfil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button contGoogle = (Button) findViewById(R.id.but_go);
        Button contFace = (Button) findViewById(R.id.but_face);
        Button contOther = (Button) findViewById(R.id.but_contas);

        contOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirLogin();
            }
        });

        contFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, User_Perfil.class);
                startActivity(intent);
            }
        });
        contGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, User_Perfil.class);
                startActivity(intent);
            }
        });


    }

    public void AbrirLogin (){

        CaixaDialogo dialogo  = new CaixaDialogo();
        dialogo.show(getSupportFragmentManager(),"Login Dialogo");



    }
}
