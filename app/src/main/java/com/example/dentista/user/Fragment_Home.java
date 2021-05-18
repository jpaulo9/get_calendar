package com.example.dentista.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.dentista.R;
import com.example.dentista.objeto.Usuario;

public class Fragment_Home extends Fragment {


    View view;
    Button agendar, especialidades;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_home, container, false);


        agendar =(Button) view.findViewById(R.id.btn_cad_consulta);
        especialidades = (Button) view.findViewById(R.id.btn_userEsp);

        agendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Marcar_Atendimento.class);
                startActivity(intent);
            }
        });

        especialidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


//        EnviarDados();
        return view;


    }


//    public void EnviarDados(){
//
//        Usuario user = new Usuario();
//        Intent dataIntent = new Intent(getActivity(), Fragment_ListaConsultas.class);
//        dataIntent.putExtra("DadosUser", user);
//
//
//
//    }
}
