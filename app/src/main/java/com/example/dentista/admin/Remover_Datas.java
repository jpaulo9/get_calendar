package com.example.dentista.admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.dentista.R;

public class Remover_Datas extends AppCompatActivity {

    TextView data;
    Button remove;
        TextView voltar;

        CalendarView calendario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remover__datas);

        data = (TextView) findViewById(R.id.data_retire_ver);
        remove = (Button) findViewById(R.id.btn_bloquedate);
        voltar = (TextView) findViewById(R.id.btn_retorne);
        calendario = (CalendarView) findViewById(R.id.calendar_retire);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Remover_Datas.this, Administrador.class);
                startActivity(intent);
                finish();
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Remover_Datas.this, Administrador.class);
                startActivity(intent);
                finish();
            }
        });

        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int i, int i2, int i1) {

                String date = i1 +"/"+(i2+1)+"/"+i;
                data.setText(date);
            }
        });
    }
}
