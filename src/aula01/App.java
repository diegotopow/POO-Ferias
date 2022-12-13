package aula01;

public class App {
    public static void main(String[] args) throws Exception {

        //1ª AULA DO CURSO JAVA POO - ACADEMIA DOS DEVS (LUCAS MOURA)        

        //Declarando um objeto do tipo Celular = Instanciando (criar um novo) um objeto
        Celular celularA = new Celular();
        celularA.nome = "iPhone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular(); //Objeto Celular B
        celularB.nome = "Galaxy Note 20 Ultra"; //Estado de nome definido para...
        celularB.tamanhoTela = 6.9f; //
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC;
        celularC = new Celular(); //Objeto Celular ...
        celularC.nome = "Xiaomi MI 11"; //Estado de nome definido para...
        celularC.tamanhoTela = 6.81f; //
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dgb de armazenamento e S.O. %s.\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb de armazenamento e S.O. %s.\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.2f, com %dgb de armazenamento e S.O. %s.", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

    }
}