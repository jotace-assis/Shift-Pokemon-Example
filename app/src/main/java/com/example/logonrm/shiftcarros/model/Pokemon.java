package com.example.logonrm.shiftcarros.model;

import com.google.gson.annotations.SerializedName;

public class Pokemon {

    @SerializedName(value = "name")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
