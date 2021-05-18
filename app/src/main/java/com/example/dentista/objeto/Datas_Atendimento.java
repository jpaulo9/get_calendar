package com.example.dentista.objeto;

import java.io.Serializable;

public class Datas_Atendimento implements Serializable {

    String id_data,data_disponivel;


    public Datas_Atendimento(){}

    public Datas_Atendimento(String id_data, String data_disponivel) {
        this.id_data = id_data;
        this.data_disponivel = data_disponivel;
    }

    public String getId_data() {
        return id_data;
    }

    public void setId_data(String id_data) {
        this.id_data = id_data;
    }

    public String getData_disponivel() {
        return data_disponivel;
    }

    public void setData_disponivel(String data_disponivel) {
        this.data_disponivel = data_disponivel;
    }


}
