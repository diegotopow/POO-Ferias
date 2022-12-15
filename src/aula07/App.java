package aula07;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    
    public static void main(String[] args) {
        /* ARRAY (vetor) -> criado com um tamanho fixo de 5 posições;
        /*String[] nomes = new String[5];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";
        nomes[3] = "Pedro";
        nomes[4] = "Ana"; 

        // Classe nomeObjeto = new Classe();
        // ArrayList<tipo> nome = new ArrayList<tipo>(); -> criado com um tamanho dinâmico;
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("João"); // Índice 0;
        arrayDinamico.add("Maria"); // Índice 1;
        arrayDinamico.add("José"); // Índice 2;
        arrayDinamico.add("Pedro"); // Índice 3;
        arrayDinamico.add("Ana"); // Índice 4;

        System.out.println("Remover o José.");
        arrayDinamico.remove(2); // Remove o elemento do índice (2);
        //arrayDinamico.clear(); // Remove todos os elementos do arrayList;
        System.out.println(arrayDinamico.size()); // Retorna o tamanho do arrayList;

        /*System.out.println("IMPRIMINDO O ARRAY DINÂMICO: ");
        for(int indice =0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }

        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }*/
        
        /*
         * TIPO PRIMITIVO   -> int, double, float, char, boolean, byte, short, long 
         * wRAPPER CLASSES -> Integer, Double, Float, Character, Boolean, Byte, Short, Long
         */
        
        //ArrayList<String> filmes = new ArrayList<String>();

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(78);
        numeros.add(4);
        numeros.add(-32);
        numeros.add(4);
        numeros.add(8);

        // Sort -> ordena os elementos do ArrayList;
        Collections.sort(numeros, Collections.reverseOrder());
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //Pessoa joao = new Pessoa("João", 20);
        //Pessoa maria = new Pessoa("Maria", 25);
        //Pessoa jose = new Pessoa("José", 30);

        /*ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 20));
        pessoas.add(new Pessoa("Maria", 25));
        pessoas.add(new Pessoa("José", 30));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }*/



    }
}
