package org.senai.interfaces;


public class VideoGame {
    private Jogo jogo;
            
    public void ligar(){
        System.out.println("Ligando console.");
    }
    
    public void jogar(Jogo jogo){
        this.jogo = jogo;
        jogo.jogar();
    }
    
    public void fechar(){
        this.jogo.fechar();
        
    }
    public void desligar(){
        System.out.println("Desligando console...");
    }
}
