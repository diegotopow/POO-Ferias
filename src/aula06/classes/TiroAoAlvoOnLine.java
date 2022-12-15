package aula06.classes;

public class TiroAoAlvoOnLine implements Jogo{

    @Override
    public void fechar() {
        System.out.println("Salvar o progresso.");
        System.out.println("Sair do jogo.");
        
    }

    @Override
    public void jogar() {
        System.out.println("Carregando o jogo.");
        System.out.println("Conectando ao servidor...");
        System.out.println("Carregando partida.");
                
    }
    
}
    
}
