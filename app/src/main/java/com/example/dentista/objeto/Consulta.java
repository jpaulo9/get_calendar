package com.example.dentista.objeto;

import java.io.Serializable;

public class Consulta implements Serializable {

    String tipoConsulta, dataAtendimento, id_user, cpf_user, nomeUser;

    public Consulta(){}

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public Consulta(String tipoConsulta, String dataAtendimento, String id_user, String cpf_user, String nomeUser) {
        this.tipoConsulta = tipoConsulta;
        this.dataAtendimento = dataAtendimento;
        this.id_user = id_user;
        this.cpf_user = cpf_user;
        this.nomeUser = nomeUser;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }


    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getCpf_user() {
        return cpf_user;
    }

    public void setCpf_user(String cpf_user) {
        this.cpf_user = cpf_user;
    }
}
