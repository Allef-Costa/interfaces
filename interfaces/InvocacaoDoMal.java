package org.senai.interfaces;

public class InvocacaoDoMal implements Jogo{

    @Override
    public void jogar() {
        System.out.println("INVOCAÇÃO DO MAL");
        System.out.println("Escolha o caminho que deseja ir");
        System.out.println("'aparentemente você está com medo'"
                +  "\n- sussurou o demônio");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando partida...");
    }
    
    
}
