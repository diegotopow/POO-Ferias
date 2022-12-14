package aula05;

import javax.swing.JOptionPane;

import aula05.classes.Personagem;
import aula05.classes.Pessoa;

public class App {
   
    public static void main(String[] args) throws Exception {

        //5ª AULA DO CURSO JAVA POO - ACADEMIA DOS DEVS (LUCAS MOURA)        
        //Pessoa pessoa = new Pessoa("Diego", 25, 1.80f);
        //pessoa.imprimirDados();
        //System.out.format("Nome: %s, idade de %d anos e altura de %.2f metros.", pessoa.getNome(),pessoa.getIdade(), pessoa.getAltura());
        
        String nome = JOptionPane.showInputDialog(null, "Nome do Personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do Personagem: ");
        
        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();

    }
}