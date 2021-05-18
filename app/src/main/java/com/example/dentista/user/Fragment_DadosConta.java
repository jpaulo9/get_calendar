package com.example.dentista.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dentista.MainActivity;
import com.example.dentista.R;
import com.example.dentista.objeto.Usuario;

public class Fragment_DadosConta extends Fragment {


    View view;
    TextView dados, conv, sobre, logout;
    Usuario user;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dados_conta,container, false) ;

        dados = view.findViewById(R.id.btn_dados_pessoais);
        conv =  view.findViewById(R.id.btn_convenios);
        sobre =  view.findViewById(R.id.btn_sobre);
        logout =  view.findViewById(R.id.btn_logout);

        Bundle bundle = getActivity().getIntent().getExtras();
        if ((bundle!= null) && (bundle.containsKey("DadosUser"))) {

            user = (Usuario) bundle.getSerializable("DadosUser");

            Toast.makeText(getActivity(), "Dados Recebidos "+user.getEmail(), Toast.LENGTH_LONG).show();


        }else {
            Toast.makeText(getActivity(), "Sem Atendimentos Marcados!!!",
                    Toast.LENGTH_SHORT).show();
        }



        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Dados_User.class);
                intent.putExtra("DadosUser", user);
                startActivity(intent);


            }
        });

        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });


        return view;
    }

}
