/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.elevador;

import java.util.Comparator;

/**
 *
 * @author carlo
 */
public class ComparadorPassageiro implements Comparator<Passageiro>{

    @Override
    public int compare(Passageiro t, Passageiro t1) {
        return t.getOrdemAtendimento().compareTo(t1.getOrdemAtendimento());
    }



    
  
}
