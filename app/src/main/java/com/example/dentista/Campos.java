package com.example.dentista;

import android.text.TextUtils;
import android.util.Patterns;

public class Campos {


    public Campos(){}
    public boolean Email(String email){

        boolean emailOff = false;

        if (emailOff = !Patterns.EMAIL_ADDRESS.matcher(email).matches()){

            emailOff = true;
        }
            return emailOff;


    }
    public boolean CamposText(String campo){

            boolean palavra = (TextUtils.isEmpty(campo) || campo.trim().isEmpty());

            return palavra;

    }


}
