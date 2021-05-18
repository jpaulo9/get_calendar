package com.example.dentista.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dentista.R;
import com.example.dentista.objeto.Consulta;

import java.util.ArrayList;
import java.util.List;

public class Listar_DatasAtendimentosMarcados extends AppCompatActivity {

    RecyclerView listaDatas;

    List <Consulta> Listaconsultas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar__datas_atendimentos_marcados);

        listaDatas = (RecyclerView) findViewById(R.id.list_datasAtendimentos);

        Listaconsultas = new ArrayList<>();

        TextView btn = (TextView) findViewById(R.id.btn_ret_admin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Listar_DatasAtendimentosMarcados.this, Administrador.class);
                startActivity(intent);
                finish();
            }
        });

        Datas();

    }

    public void Datas(){

        Consulta consulta = new Consulta();
        Consulta consulta1 = new Consulta();

        consulta.setId_user("lasdfsdlhf");
        consulta.setCpf_user("8274823457");
        consulta.setNomeUser("Celio Souza");
        consulta.setTipoConsulta("Manutenção do Aparelho");
        consulta.setDataAtendimento("22/05/2020");
        //segundo user
        consulta1.setId_user("kdsjfbsd1232");
        consulta1.setCpf_user("098213021");
        consulta1.setNomeUser("Celio Souza");
        consulta1.setTipoConsulta("Limpeza");
        consulta1.setDataAtendimento("13/06/2020");
        Listaconsultas.add(consulta);
        Listaconsultas.add(consulta1);

        if (!Listaconsultas.isEmpty()) {
            ListarDatas_Recycler datasCons = new
                    ListarDatas_Recycler(Listar_DatasAtendimentosMarcados.this, Listaconsultas);
            listaDatas.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            listaDatas.setHasFixedSize(true);
            listaDatas.setAdapter(datasCons);
        }



    }

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
