package aula06.classes;

public class CalculadorArea {
        public double somarAreas(Quadrado quadrado, Circulo circulo){
            double totalArea = quadrado.calcularArea() + circulo.calcularArea();
            return totalArea;
        }
}
