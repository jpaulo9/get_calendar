package com.example.dentista.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.dentista.R;

public class Dados_Minha_Consulta extends AppCompatActivity {

    private TextView nomeUser, DataCon, TipoCon, cpfUser, btnretor;
    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados__minha__consulta);

        nomeUser = (TextView) findViewById(R.id.txt_dado_nome);
        DataCon = (TextView) findViewById(R.id.txt_dado_dataconsulta);
        TipoCon = (TextView) findViewById(R.id.txt_dado_tipoConsul);
        cpfUser = (TextView) findViewById(R.id.txt_dado_cpf);
        btnretor = (TextView) findViewById(R.id.btn_retornarCP);
        btnCancel = (Button) findViewById(R.id.btn_cancelar_consul);

    }
}
