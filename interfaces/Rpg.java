package org.senai.interfaces;


public class Rpg implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando jogo de RPG");
        System.out.println("Escolha o seu campeão: /");
    }

    @Override
    public void fechar() {
        System.out.println("Partida finalizada.");
    }
    
    
}
