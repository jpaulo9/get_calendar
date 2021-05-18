package com.example.dentista.objeto;

import java.io.Serializable;

public class Gerenciador implements Serializable {

    String Id_Geren, nomeLog, email, senha;
    public Gerenciador (){

    }

    public Gerenciador(String id_Geren, String nomeLog, String email, String senha) {
        Id_Geren = id_Geren;
        this.nomeLog = nomeLog;
        this.email = email;
        this.senha = senha;
    }

    public String getId_Geren() {
        return Id_Geren;
    }

    public void setId_Geren(String id_Geren) {
        Id_Geren = id_Geren;
    }

    public String getNomeLog() {
        return nomeLog;
    }

    public void setNomeLog(String nomeLog) {
        this.nomeLog = nomeLog;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
