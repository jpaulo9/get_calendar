package com.example.dentista.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dentista.R;
import com.example.dentista.objeto.Procedimento_Medico;

import java.util.ArrayList;
import java.util.List;

public class Lista_Especialidades extends AppCompatActivity {

    RecyclerView listEspecialidades;

    List<Procedimento_Medico> listEP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__especialidades);

        TextView btn = (TextView) findViewById(R.id.btn_retorn_adminEsp);

        listEspecialidades = (RecyclerView) findViewById(R.id.list_especialidades);

        listEP = new ArrayList<>();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lista_Especialidades.this, Administrador.class);
                startActivity(intent);
                finish();
            }
        });


        Especialidades();

    }


    public void Especialidades(){

        Procedimento_Medico procedimento = new Procedimento_Medico();

        procedimento.setIdProcedimento("283746sfs");
        procedimento.setNome("Clareamento Dental");
        procedimento.setTipoEspecialidade("ODONTOLOGIA");

        listEP.add(procedimento);

        Especialidade_RecyclerView local_cat = new
                Especialidade_RecyclerView(Lista_Especialidades.this, listEP);
        listEspecialidades.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        listEspecialidades.setHasFixedSize(true);
        listEspecialidades.setAdapter(local_cat);



    }



}
