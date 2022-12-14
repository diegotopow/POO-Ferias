package aula06.classes;

public class Circulo {
    //Atributos
    private int raio;

   
    //Construtor
    public Circulo(int raio){
        this.raio = raio;
    }
    
    //Métodos específicos da classe
    public double calcularArea(){
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
