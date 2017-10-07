package com.example.logonrm.shiftcarros.model;

import com.google.gson.annotations.SerializedName;

public class Pokemon {
    private String nome;

    @SerializedName(value = "name")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
