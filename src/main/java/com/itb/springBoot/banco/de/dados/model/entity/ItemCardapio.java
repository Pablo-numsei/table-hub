package com.itb.springBoot.banco.de.dados.model.entity;

import java.math.BigDecimal;

public class ItemCardapio {


    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Boolean disponivel;
    private CategoriaCardapio categoria;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public CategoriaCardapio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCardapio categoria) {
        this.categoria = categoria;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;



    }
}
