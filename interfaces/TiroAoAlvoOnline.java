package org.senai.interfaces;

public class TiroAoAlvoOnline implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando o game...");
        System.out.println("Carrengando o servidor...");
        System.out.println("Preparando a partidar...");
        System.out.println("Acerta o alvo. ");
        
    }

    @Override
    public void fechar() {
        
        System.out.println("Fechando a partida...");
        System.out.println("Fechando a conexão com o servidor...");
    }
    
    
}
