package com.example.dentista.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dentista.R;
import com.example.dentista.objeto.Procedimento_Medico;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

public class Cadastrar_ProcedimentoMedico extends AppCompatActivity {

    EditText nomeProced, especialidade;
    Button button;
    TextView btn_vt;
//    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__procedimento_medico);


        nomeProced = (EditText) findViewById(R.id.edt_nomeProcedimento);
        especialidade = (EditText) findViewById(R.id.edt_TipoEspecialidade);
        button  = (Button) findViewById(R.id.btn_adicionarProced);
        btn_vt = (TextView) findViewById(R.id.btn_retorne_home);

//        reference = FirebaseDatabase.getInstance().getReference("PROCEDIMENTO");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionarProcedimento();
            }
        });

        btn_vt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastrar_ProcedimentoMedico.this, Administrador.class);
                startActivity(intent);
                finish();
            }
        });


    }

    public void adicionarProcedimento(){

        String nomeP = nomeProced.getText().toString();
        String esp = especialidade.getText().toString();

//        String id = reference.getKey();
//        Procedimento_Medico pMedico = new Procedimento_Medico(id, nomeP, esp);
//
//        reference.child(id).setValue(pMedico);


    }
}
