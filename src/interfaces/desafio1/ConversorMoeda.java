package interfaces.desafio1;

// Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o métdo converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

// Classe ConversorMoeda implementando ConversaoFinanceira
public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
