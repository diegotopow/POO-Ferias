package aula05.classes;

import javax.swing.JOptionPane;

public class Personagem {
    //Atributos da classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;


    //Método Construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel*53;
        
        if(classe.equals("Guerreiro")){
            forca = nivel*3;
        }else {
            forca = nivel;
        }

    }

    //Métodos específicos != construtor e getters and setters
    public void mostrarStatus(){
        String status = String.format("Nome: %s\n Nível: %d\n Vida: %d\n Classe: %s\n Força: %d\n",nome,nivel,vida,classe,forca);
        JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    //Métodos getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

}
