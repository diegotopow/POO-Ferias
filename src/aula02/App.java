package aula02;

public class App {
    public static void main(String[] args) throws Exception {

        //2ª AULA DO CURSO JAVA POO - ACADEMIA DOS DEVS (LUCAS MOURA)        

        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        Personagem vilao = new Personagem();
        vilao.nome = "Hades";
        vilao.nivel = 70;
        vilao.forca = 9;
/*
        System.out.format("Personagem %s (%d lv.) com %d de força.", heroi.nome, heroi.nivel, heroi.forca);
*/
        heroi.mostrarStatus();

        //executou o método 'atacar', usando uma String "Hydra" como argumento
        heroi.atacar("Hydra","");

        
    }
}