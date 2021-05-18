package com.example.dentista.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.dentista.Campos;
import com.example.dentista.MainActivity;
import com.example.dentista.R;
import com.example.dentista.objeto.Usuario;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

public class Cadastro extends AppCompatActivity {

        private EditText celular, data, cpf, nome, email, senha, cidade;
        private Button btn_salvar;
        private ImageView btn_retorne;

//        DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

//        reference  = FirebaseDatabase.getInstance().getReference("USER");

         celular = (EditText) findViewById(R.id.edt_celular);
         data = (EditText) findViewById(R.id.edt_data);
         cpf = (EditText) findViewById(R.id.edt_cpf);
         nome = (EditText) findViewById(R.id.cad_nomeUser);
        email = (EditText) findViewById(R.id.cad_emailUser);
        senha = (EditText) findViewById(R.id.cad_senhaUser);
        cidade = (EditText) findViewById(R.id.cad_cidadeUser);
         btn_retorne = (ImageView) findViewById(R.id.btn_retorn_login);
         btn_salvar = (Button) findViewById(R.id.btn_cadastrarUser);


        SimpleMaskFormatter CelularFormater = new SimpleMaskFormatter("NN)N-NNNN-NNNN");
        SimpleMaskFormatter CpfFormater = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
        SimpleMaskFormatter DataFormatter = new SimpleMaskFormatter("NN/NN/NNNN");


        MaskTextWatcher DataWatcher = new MaskTextWatcher(data, DataFormatter);
        MaskTextWatcher CPFWatcher = new MaskTextWatcher(cpf,CpfFormater);
        MaskTextWatcher CelularWatcher = new MaskTextWatcher(celular, CelularFormater);


        celular.addTextChangedListener(CelularWatcher);
        data.addTextChangedListener(DataWatcher);
        cpf.addTextChangedListener(CPFWatcher);


        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CadastrarUser();
            }
        });

        btn_retorne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    public void CadastrarUser(){


        String id, nomeU, emailU, senhaU, dataU, celularU, cpfU, citiU;

        nomeU = nome.getText().toString().trim();
        emailU = email.getText().toString().trim();
        senhaU = senha.getText().toString().trim();
        dataU = data.getText().toString().trim();
        celularU = celular.getText().toString().trim();
        cpfU = cpf.getText().toString().trim();
        citiU = cidade.getText().toString().trim();

        boolean validar = false;
        Campos teste = new Campos();

        if (validar = teste.CamposText(nomeU)) {

            nome.requestFocus();
        } else if (validar = teste.Email(emailU)){
            email.requestFocus();

        }else if (validar = teste.CamposText(senhaU)){
            senha.requestFocus();
        }else if (validar = teste.CamposText(dataU)){
            data.requestFocus();
        }else if (validar = teste.CamposText(celularU)){

            celular.requestFocus();
        }else if (validar = teste.CamposText(cpfU)){
            cpf.requestFocus();
        }else if (validar = teste.CamposText(citiU)){
             cidade.requestFocus();
        }

        if(!validar) {
//            id = reference.getKey();
//            Usuario usuario = new Usuario(id, nomeU, emailU, senhaU, dataU, celularU, cpfU, citiU);
//            //código de banco de dados
//
//            reference.child(id).setValue(usuario);
//
//            Toast.makeText(Cadastro.this, "Sua conta foi criada",
//                    Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(Cadastro.this, MainActivity.class);
//            startActivity(intent);
//            finish();
        }

    }
}
