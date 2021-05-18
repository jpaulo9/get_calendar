package com.example.dentista.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dentista.R;
import com.example.dentista.objeto.Consulta;

import java.util.ArrayList;
import java.util.List;

public class ListaPacientes extends AppCompatActivity {

    RecyclerView listaDatas;

    List<Consulta> listaConsultas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacientes);

        listaDatas = (RecyclerView) findViewById(R.id.list_pacienteC);
        listaConsultas = new ArrayList<>();

        TextView btn = (TextView) findViewById(R.id.btn_retornar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaPacientes.this, Listar_DatasAtendimentosMarcados.class);
                startActivity(intent);
                finish();
            }
        });


        ListandDados();
    }

    public void ListandDados(){

        Bundle dados = getIntent().getExtras();
        if ((dados!= null) && (dados.containsKey("Datas"))) {
            Consulta consulta = (Consulta) dados.getSerializable("Datas");

            listaConsultas.add(consulta);


            ListarPacientes_Recycler local_cat = new
                    ListarPacientes_Recycler(ListaPacientes.this, listaConsultas);
                listaDatas.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                listaDatas.setHasFixedSize(true);
                listaDatas.setAdapter(local_cat);



        }else {

            Toast.makeText(ListaPacientes.this,"Dados Não importados", Toast.LENGTH_SHORT).show();


        }


    }

//

//
//    public List<String> RemoverCategoria(List<String> lista){
//
//        int Plista = 0;
//
//        while (Plista<lista.size()){
//            int j = 0;
//
//            boolean isRemove = false;
//
//            while (j < Plista){
//                if (lista.get(Plista).equals(lista.get(j))){
//                    lista.remove(Plista);
//                    isRemove = true;
//                    break;
//                }
//
//                else j++;
//            }
//            if (!isRemove) Plista++;
//
//
//        }
//
//
//
//        return lista;
//    }
}
