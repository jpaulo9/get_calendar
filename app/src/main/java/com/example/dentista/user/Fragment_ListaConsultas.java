package com.example.dentista.user;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dentista.R;

import com.example.dentista.objeto.Consulta;
import com.example.dentista.objeto.Usuario;

import java.util.ArrayList;
import java.util.List;


public class Fragment_ListaConsultas extends Fragment {


    View view;

    RecyclerView listaView;
    List<Consulta> listDados;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.listar_minhas_consultas, container, false);


        listaView = (RecyclerView) view.findViewById(R.id.list_view_mConsultas);


        listDados = new ArrayList<>();
        ListaMinhasConsultas();
        return view;
    }


    public void ListaMinhasConsultas(){

        Bundle bundle = getActivity().getIntent().getExtras();
        if ((bundle!= null) && (bundle.containsKey("DadosUser"))) {

            Usuario user = (Usuario) bundle.getSerializable("DadosUser");

                Toast.makeText(getActivity(), "Dados Recebidos", Toast.LENGTH_LONG).show();
//            Lista_Consulta_P consultas = new
//                    Lista_Consulta_P(getActivity(), listDados);
//            listaView.setLayoutManager(new LinearLayoutManager(getActivity()));
//            listaView.setHasFixedSize(true);
//            listaView.setAdapter(consultas);

        }else {
            Toast.makeText(getActivity(), "Sem Atendimentos Marcados!!!",
                    Toast.LENGTH_SHORT).show();
        }

    }



}
