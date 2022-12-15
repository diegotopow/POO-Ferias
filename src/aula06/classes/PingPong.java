package aula06.classes;

public class PingPong implements Jogo{

    @Override
    public void fechar() {
        System.out.println("Salvando o jogo.");
        System.out.println("Fechando o jogo.");
        
    }

    @Override
    public void jogar() {
        System.out.println("Cutscene inicial.");
        System.out.println("Mostrando o menu inicial.");
        System.out.println("Tocando música de fundo.");
        
    }
    
}
