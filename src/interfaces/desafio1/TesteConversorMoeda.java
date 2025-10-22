package interfaces.desafio1;

// Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o métdo converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

// Classe de Teste
public class TesteConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50); // Exemplo com o valor em dólar
    }
}
