package com.example.dentista.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.dentista.R;
import com.example.dentista.objeto.Usuario;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class User_Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__perfil);


        BottomNavigationView barra = findViewById(R.id.bt_barra);
        barra.setOnNavigationItemSelectedListener(selectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_actv, new Fragment_Home()).commit();

        Bundle bundle = getIntent().getExtras();

        if ((bundle!= null) && (bundle.containsKey("DadosUser"))) {

            Usuario usuario = (Usuario) bundle.getSerializable("DadosUser");

            Toast.makeText(User_Perfil.this,"Nome: "+usuario.getNome()+" Senha: "+
                    usuario.getSenha(), Toast.LENGTH_LONG).show();


        }


    }


    BottomNavigationView.OnNavigationItemSelectedListener selectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;

            switch (menuItem.getItemId()){

                case R.id.opt_home:
                    fragment = new Fragment_Home();
                    Usuario usuario = new Usuario();

                    break;
                case R.id.opt_consulta:
                    fragment = new Fragment_ListaConsultas();
                    Intent dadosLista = new Intent(User_Perfil.this, Fragment_ListaConsultas.class);

                    break;
                case R.id.opt_conta:
                    fragment = new Fragment_DadosConta();

                    break;



            }

            getSupportFragmentManager().beginTransaction().replace(R.id.frame_actv, fragment).commit();
            return true;
        }
    };
}
