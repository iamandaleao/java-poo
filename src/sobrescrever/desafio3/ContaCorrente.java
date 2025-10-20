package sobrescrever.desafio3;

// Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um métdo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.


//Subclasse ContaCorrente
public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
