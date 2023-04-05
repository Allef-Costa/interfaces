package org.senai.interfaces;


public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando jogo do xadrez");
        System.out.println("Mova uma peça");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando jogo de Xadrez.");
    }
    
}
