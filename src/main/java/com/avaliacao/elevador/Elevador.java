/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.elevador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Elevador {

    int qtdAndares;
    int andarAtual;
    List<Passageiro> passageiros;
    private List<Integer[]> rota;

    public Elevador() {

        this.passageiros = new ArrayList<>();
        this.rota = new ArrayList<>();
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQtdAndares() {
        return qtdAndares;
    }

    public void setQtdAndares(int qtdAndares) {
        this.qtdAndares = qtdAndares;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<Integer[]> getRota() {
        return rota;
    }

    public void setRota(List<Integer[]> rota) {
        this.rota = rota;
    }

    public void defineMelhorRota() {

        for (int i = 0; i < passageiros.size(); i++) {
            passageiros.get(i).setOrdemAtendimento(Math.abs(andarAtual - passageiros.get(i).getAndarOrigem()));
        }
        Collections.sort(passageiros, new ComparadorPassageiro());
        Integer[] r = new Integer[2];

        if (passageiros.size() > 1) {
            if (passageiros.get(0).getAndarDestino() > passageiros.get(1).getAndarOrigem()) {
                r[0] = passageiros.get(0).getAndarOrigem();
                r[1] = passageiros.get(1).getAndarOrigem();
                rota.add(r);

                r = new Integer[2];
                r[0] = passageiros.get(1).getAndarOrigem();
                r[1] = passageiros.get(0).getAndarDestino();
                rota.add(r);

                r = new Integer[2];
                r[0] = passageiros.get(0).getAndarDestino();
                r[1] = passageiros.get(1).getAndarDestino();
                rota.add(r);

                passageiros.remove(passageiros.get(0));

            } else {
                r[0] = passageiros.get(0).getAndarOrigem();
                r[1] = passageiros.get(0).getAndarDestino();
            }

            if (r[0] != null && r[1] != null && !rota.contains(r)) {
                rota.add(r);
            }
            andarAtual = passageiros.get(0).getAndarDestino();

            passageiros.remove(passageiros.get(0));
            if (passageiros.size() > 0) {
                defineMelhorRota();
            }

        }
    }

    public void imprimeRota() {
        for (int i = 0; i < rota.size(); i++) {
            System.out.println(rota.get(i)[0] + "->" + rota.get(i)[1]);
        }

    }

}
