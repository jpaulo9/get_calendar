package com.example.dentista.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import com.example.dentista.MainActivity;
import com.example.dentista.R;

public class Administrador extends AppCompatActivity {

    private Button listaPaciente, dataAtendimento, addProced,
            visualizarEspec, dadosPess, logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);


        listaPaciente = (Button) findViewById(R.id.btn_lista_datas);
        dataAtendimento = (Button) findViewById(R.id.btn_remove_datas);
        addProced = (Button) findViewById(R.id.btn_cad_procedimento);
        visualizarEspec = (Button) findViewById(R.id.btn_especverLista);
        dadosPess = (Button) findViewById(R.id.btn_dados_admin);
        logout = (Button) findViewById(R.id.btn_sair_admin);

        listaPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Administrador.this, Listar_DatasAtendimentosMarcados.class);
                startActivity(intent);
            }
        });
        dataAtendimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Administrador.this, Remover_Datas.class);
                startActivity(intent);
            }
        });

        addProced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Administrador.this, Cadastrar_ProcedimentoMedico.class);
                startActivity(intent);
            }
        });
        visualizarEspec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Administrador.this, Lista_Especialidades.class);
                startActivity(intent);
            }
        });

        dadosPess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Administrador.this, Dados_Admin.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Administrador.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
