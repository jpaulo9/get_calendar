package com.example.dentista.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dentista.R;
import com.example.dentista.objeto.Consulta;

import java.util.List;

public class Marcar_Atendimento extends AppCompatActivity {

    CalendarView calendarView;
    TextView dataConsulta, btn_retorn;
    String tipoAtendimento;
    Spinner spin;
    Button btn_add;
    ArrayAdapter<String> listaAtendimentos;
    String atendimentos [] = {"SELECIONAR ATENDIMENTO","Remoção de Dente","Manutenção de Aparelho",
            "Limpeza","Abturação"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcar__atendimento);

        calendarView  = (CalendarView) findViewById(R.id.calendarView);
        dataConsulta = (TextView) findViewById(R.id.data_register);
        btn_retorn = (TextView) findViewById(R.id.btn_retorn_homeUser);
        spin = (Spinner) findViewById(R.id.spinner);
        btn_add  = (Button) findViewById(R.id.btn_addAgenga);


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int i, int i2, int i1) {

                String date = i1 +"/"+(i2+1)+"/"+i;
                dataConsulta.setText(date);
            }
        });

        listaAtendimentos = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, atendimentos);
        spin.setAdapter(listaAtendimentos);


        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:
                      tipoAtendimento = "SELECIONAR ATENDIMENTO";
                        break;
                    case 1:
                        tipoAtendimento = "Remoção de Dente";
                        break;

                    case 2:
                        tipoAtendimento ="Manutenção de Aparelho";
                        break;
                    case 3:
                        tipoAtendimento =  "Limpeza";
                        break;
                    case 4:
                        tipoAtendimento = "Abturação";
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    btn_add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            AdicionarConsulta();
        }
    });


    btn_retorn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Marcar_Atendimento.this, User_Perfil.class);
            startActivity(intent);
        }
    });


    }


    public void AdicionarConsulta(){

        final String data, idUser, cpfUser, nomeUser;

        data = dataConsulta.getText().toString();
        idUser = "9739847fd";
        cpfUser = "032749237493";
        nomeUser = "nomes";

        Consulta consulta = new Consulta(tipoAtendimento, data, idUser, cpfUser, nomeUser);

        Toast.makeText(Marcar_Atendimento.this, "Nome: "+consulta.getNomeUser()
                +" Tipo de Atendimento: "+consulta.getTipoConsulta()+" Data: "+consulta.getDataAtendimento(), Toast.LENGTH_LONG).show();



    }

}
