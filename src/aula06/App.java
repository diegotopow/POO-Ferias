import javax.swing.JOptionPane;

import aula06.classes.Circulo;

public class App{

    public static void main(String[] args) throws Exception {
        // ENCPSULAMENTO -> interface
        Circulo circuloPequeno = new Circulo(2);
        double area = circuloPequeno.calcularArea();
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    } 
}