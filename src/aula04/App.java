package aula04;

import aula04.classe.Conta;
import aula04.classe.Pessoa;

public class App {
   
    public static void main(String[] args) throws Exception {

        //4ª AULA DO CURSO JAVA POO - ACADEMIA DOS DEVS (LUCAS MOURA)        
        Pessoa pessoa = new Pessoa();
        // modificar -> setNomeVariavel
        // pegar -> getNomeVariavel
        /*pessoa.setNome("Elizama");
        pessoa.setAltura(1.59);
        pessoa.setIdade(28);*/

        /*System.out.println(pessoa.getNome());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getIdade());*/

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(200);
        System.out.println(conta.getSaldo());

    }
}