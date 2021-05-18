package com.example.dentista.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dentista.R;
import com.example.dentista.objeto.Usuario;

public class Dados_User extends AppCompatActivity {

    EditText nomeUp, dataUp, celularUp,
            cpfUp, emailUp,senhaUp, cidadeUp;
    Button btn_atualizar;
    TextView btn_retorne;

    Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados__user);


        nomeUp = (EditText) findViewById(R.id.edt_up_nome);
        dataUp = (EditText) findViewById(R.id.edt_data_up);
        celularUp = (EditText) findViewById(R.id.edt_up_celular);
        cpfUp = (EditText) findViewById(R.id.edt_cpf_up);
        emailUp = (EditText) findViewById(R.id.edt_up_email);
        senhaUp = (EditText) findViewById(R.id.edt_senha_up);
        cidadeUp = (EditText) findViewById(R.id.edt_up_cidade);

        btn_atualizar = (Button) findViewById(R.id.btn_up_date);
        btn_retorne = (TextView) findViewById(R.id.btn_volt_home_up);

        AtulizarDados();
        btn_atualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        btn_retorne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dados_User.this, User_Perfil.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void AtulizarDados(){

        Bundle bundle = getIntent().getExtras();
        if ((bundle!= null) && (bundle.containsKey("DadosUser"))) {

            user = (Usuario) bundle.getSerializable("DadosUser");
            nomeUp.setText(user.getNome());
            dataUp.setText(user.getDataNasc());
            celularUp.setText(user.getCelular());
            cpfUp.setText(user.getCpf());
            emailUp.setText(user.getEmail());
            senhaUp.setText(user.getSenha());
            cidadeUp.setText(user.getCidade());



        }else {
            Toast.makeText(Dados_User.this, "Usuario não logado",
                    Toast.LENGTH_SHORT).show();
        }




    }
}
