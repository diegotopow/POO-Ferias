package aula06.classes;

public class Videogame {
    private boolean estaLigado; // O valor padrão de um boolean é 'false';
    
    private Jogo jogo; // Objetos tem valor 'null' se não forem inicializados;
    
    public void ligar(){
        System.out.println("Ligando o videogame...");
        this.estaLigado = true;
    }

    public void jogar(){
        if(estaLigado == true){
            System.out.println("Jogando...");
                this.jogo = jogo;
                jogo.jogar();
        }else{
            System.out.println("O videogame está desligado.");
        }        
    }

    public void desligar(){
        if(estaLigado == true){
            System.out.println("Desligando o videogame...");
            boolean temJogoRodando = jogo != null;
            if(temJogoRodando){
                jogo.fechar();
                jogo = null; // Definindo o valor de 'null' significa que o objeto (jogo) não está rodando;
            }else{
                System.out.println("Não há jogo para fechar.");
            }   
        }else{
            System.out.println("O videogame está desligado.");        
        }
    }   
}
