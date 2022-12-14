package aula06.classes;

public class Circulo implements FiguraGeometrica{
    //Atributos
    private int raio;

   
    //Construtor
    public Circulo(int raio){
        this.raio = raio;
    }
    
    public double calcularArea() {
       return Math.PI * Math.pow(raio, 2);
    }
    
    //Métodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }


}
