package com.example.dentista.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dentista.R;

public class Dados_Admin extends AppCompatActivity {

    Button button;
    EditText nomeAdmin, emailAdmin, senhaAdmin;
    TextView volt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados__admin);


        button = (Button) findViewById(R.id.btn_atualizar);
        nomeAdmin = (EditText) findViewById(R.id.edt_Adminup_nome);
        emailAdmin = (EditText) findViewById(R.id.edt_AdminUp_email);
        senhaAdmin = (EditText) findViewById(R.id.edt_AdminUp_senha);

        volt = (TextView) findViewById(R.id.btn_voltar_menu);

        volt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dados_Admin.this, Administrador.class);
                startActivity(intent);
                finish();
            }
        });

        nomeAdmin.setText("Administrador");
        emailAdmin.setText("email@gmail.com");
        senhaAdmin.setText("senha0123");
    }
}
