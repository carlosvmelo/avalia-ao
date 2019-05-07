/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.elevador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Main {

    public static void main(String[] args) {
        Passageiro p1=new Passageiro(3,15);
        Passageiro p2=new Passageiro(8,1);
        Passageiro p3=new Passageiro(1,7);
        List<Passageiro> passageiros=new ArrayList<>();
        passageiros.add(p1);
        passageiros.add(p2);
        passageiros.add(p3);
        Elevador elevador=new Elevador();
        elevador.setAndarAtual(5);
        elevador.setPassageiros(passageiros);
        elevador.defineMelhorRota();
        elevador.imprimeRota();
        
    }
    
    
    
}
