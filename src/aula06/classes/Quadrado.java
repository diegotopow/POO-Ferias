package aula06.classes;

public class Quadrado implements FiguraGeometrica{
    //Atributo
    private int lado;

    //Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }

    //Construtor 
    public double calcularArea() {
       return Math.pow(lado, 2);
    }
    
    //Getters e Setters
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {

    }
    
}
