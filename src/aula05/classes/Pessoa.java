package aula05.classes;

public class Pessoa {
    //Atributos da classe
    private String nome;
    private int idade;
    private float altura;

    //Métoodo construtor
    //Modificador de acesso + nome da classe(parametros)
    public Pessoa(String nome, int idade, float altura){
        System.out.println("Uma pessoa foi criada!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.format("Nome: %s, idade de %d anos e altura de %.2f metros.\n", nome,idade,altura);
    }

    //Metodos getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

}
