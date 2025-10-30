package atividades.quinto;
// Crie uma interface Forma com um métdo calcularArea(). Implemente a interface em duas classes, por exemplo,
//  Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para
//  calcular e imprimir a área de cada forma.

interface Forma {
    double calcularArea();
}

class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        // Lista de formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}