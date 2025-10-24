package desafio2;

//Crie uma classe Calculadora com um métdo que recebe um número como parâmetro e retorna o dobro desse número.
public class Principal {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);
    }
}


