/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.elevador;

import java.util.Objects;

/**
 *
 * @author carlo
 */
public class Passageiro {
    private int andarOrigem;
    private int andarDestino;
    private Integer ordemAtendimento;
    private boolean levado;

    public boolean isLevado() {
        return levado;
    }

    public void setLevado(boolean levado) {
        this.levado = levado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.andarOrigem;
        hash = 17 * hash + this.andarDestino;
        hash = 17 * hash + this.ordemAtendimento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Passageiro other = (Passageiro) obj;
        if (this.andarOrigem != other.andarOrigem) {
            return false;
        }
        if (this.andarDestino != other.andarDestino) {
            return false;
        }
        if (!Objects.equals(this.ordemAtendimento, other.ordemAtendimento)) {
            return false;
        }
        return true;
    }

    public Passageiro(int andarOrigem, int andarDestino) {
        this.andarOrigem = andarOrigem;
        this.andarDestino = andarDestino;
    }

    public int getAndarOrigem() {
        return andarOrigem;
    }

    public void setAndarOrigem(int andarOrigem) {
        this.andarOrigem = andarOrigem;
    }

    public int getAndarDestino() {
        return andarDestino;
    }

    public void setAndarDestino(int andarDestino) {
        this.andarDestino = andarDestino;
    }

    public Integer getOrdemAtendimento() {
        return ordemAtendimento;
    }

    public void setOrdemAtendimento(Integer ordemAtendimento) {
        this.ordemAtendimento = ordemAtendimento;
    }



    
}
