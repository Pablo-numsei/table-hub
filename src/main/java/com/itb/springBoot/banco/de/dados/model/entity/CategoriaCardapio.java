package com.itb.springBoot.banco.de.dados.model.entity;

import java.util.List;

public class CategoriaCardapio {

    private Long id;
    private String nome;
    private List<ItemCardapio> itens;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }

    public void setItens(List<ItemCardapio> itens) {
        this.itens = itens;
    }
}
