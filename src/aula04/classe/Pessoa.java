package aula04.classe;

public class Pessoa {
    private String nome = "Diego";
    private int idade = 37;
    private double altura = 1.71;

    //modificador-acesso tipo-retorno nomeDoMetodo()
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(Double altura){
        this.altura = altura;
    }


}
