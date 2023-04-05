package org.senai.interfaces;


public class Main {

    
    public static void main(String[] args) {
       VideoGame console = new VideoGame();
       
      
       console.ligar();
       console.jogar(new Xadrez());
       console.fechar();
       System.out.println("\n");
       
       console.jogar(new PingPong());
       console.fechar();
       System.out.println("\n");
       
       
       console.jogar(new Rpg());
       console.fechar();
       System.out.println("\n");
       
       console.jogar(new InvocacaoDoMal());
       console.fechar();
       console.desligar();
       System.out.println("\n");
        
    }
    
}
