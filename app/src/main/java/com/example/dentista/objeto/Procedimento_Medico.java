package com.example.dentista.objeto;

import java.io.Serializable;

public class Procedimento_Medico implements Serializable {

    String idProcedimento, nome, tipoEspecialidade;

    public Procedimento_Medico(){}

    public Procedimento_Medico(String idProced, String nome, String tipoEspecialidade) {
        this.nome = nome;
        this.tipoEspecialidade = tipoEspecialidade;
        this.idProcedimento = idProced;
    }

    public String getIdProcedimento() {
        return idProcedimento;
    }

    public void setIdProcedimento(String idProcedimento) {
        this.idProcedimento = idProcedimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoEspecialidade() {
        return tipoEspecialidade;
    }

    public void setTipoEspecialidade(String tipoEspecialidade) {
        this.tipoEspecialidade = tipoEspecialidade;
    }
}
