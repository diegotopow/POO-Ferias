package aula03;

public class App {
   
    public static void main(String[] args) throws Exception {
/*
        //3ª AULA DO CURSO JAVA POO - ACADEMIA DOS DEVS (LUCAS MOURA)        
        //Tipos de modificadores de acesso:
        //private
        //public
        //protected
        //defaul -> package-private

        FestaVip festa = new FestaVip();
        festa.entrar();
*/        
        ContaNetflix conta = new ContaNetflix();
        conta.entrar();
        conta.assistirFilme("O Poderoso Chefão");

    }
}