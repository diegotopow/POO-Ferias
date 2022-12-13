package aula03.festas;

public class FestaVip {
    // modificador tipo nome-atributo 
    private int quantidadeCafe = 30;
    private int quantidadeSalgados = 50;

    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    // modificador retorno-método nome-método
    private void beberCafe(){
        quantidadeCafe--;
        System.out.println("Bebeu 1x xícara de café!");
    }

    private void comerSalgado(){
        quantidadeSalgados--;
        System.out.println("Comeu 5x salgados!");
    }

}
