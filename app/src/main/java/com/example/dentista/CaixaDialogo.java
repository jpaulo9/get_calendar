package com.example.dentista;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.dentista.admin.Administrador;
import com.example.dentista.objeto.Gerenciador;
import com.example.dentista.objeto.Usuario;
import com.example.dentista.user.Cadastro;
import com.example.dentista.user.User_Perfil;

public class CaixaDialogo extends AppCompatDialogFragment {

    EditText emails;
    EditText senhas;
    TextView bt_criaConta, bt_senhaEsquecida;
    Button bt_logar;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();




        View view = inflater.inflate(R.layout.layout_cad, null);
        emails = view.findViewById(R.id.email_login);
        senhas = view.findViewById(R.id.senha_login);
        bt_criaConta =  view.findViewById(R.id.btn_IrCad);
        bt_logar = view.findViewById(R.id.bt_userLogin);
        bt_senhaEsquecida = view.findViewById(R.id.recuperar_senha);

        builder.setView(view)

                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Intent intent = new Intent(getContext(), MainActivity.class);
                        startActivity(intent);
                    }

                });


        bt_senhaEsquecida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String senha, email;
                senha = senhas.getText().toString().trim();
                email = emails.getText().toString().trim();

                if ((senha.equals("usuariosenha")) && (email.equals("usuarioemail"))) {
                    Usuario usuario = new Usuario("8968dsf","nome",email,senha,"09/09/2009",
                            "91097879889","21334444354","Capitão Poço");
                    Intent svent = new Intent(getContext(), User_Perfil.class);
                    svent.putExtra("DadosUser",usuario );
                    startActivity(svent);
                }

                if ((senha.equals("admin")) && (email.equals("admin"))) {
                    Gerenciador usuario = new Gerenciador("8968dsf","nome",email,senha);
                    Intent svent = new Intent(getContext(), Administrador.class);
                    svent.putExtra("DadosUser",usuario );
                    startActivity(svent);
                }
            }
        });

        bt_criaConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getContext(), Cadastro.class);
                startActivity(intent);
            }
        });         return builder.create();

    }
}
