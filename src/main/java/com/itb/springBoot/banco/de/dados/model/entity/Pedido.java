package com.itb.springBoot.banco.de.dados.model.entity;

import com.itb.springBoot.banco.de.dados.model.enums.StatusPedido;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private LocalDateTime dataHora;
    private StatusPedido status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
