package aula06;

import aula06.classes.PingPong;
import aula06.classes.Videogame;

public class App{

    public static void main(String[] args) throws Exception {
        // ENCPSULAMENTO -> interface
        //Circulo circulo = new Circulo(2);
        //double area = circuloPequeno.calcularArea();
        //JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
        //Quadrado quadrado = new Quadrado(5);
        //JOptionPane.showMessageDialog(null, "A área do quadrado é: " + quadrado.calcularArea());
        //CalculadorArea calculador = new CalculadorArea();
        //JOptionPane.showMessageDialog(null, calculador.somarAreas(quadrado, circulo));

        PingPong pingpong = new PingPong();
        Videogame XdevOne = new Videogame();
        XdevOne.ligar();
        XdevOne.jogar(pingpong);
        XdevOne.desligar();

    } 
}
