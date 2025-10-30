package getsetter.desafio1;

//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

// Classe screenmatch.principal.Principal — ponto de entrada do programa
public class Principal {
    public static void main(String[] args) {
        // Cria um novo objeto do tipo ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        // Define o número da conta usando o métdo setter
        conta.setNumeroConta(123);

        // Define o saldo diretamente com setSaldo
        conta.setSaldo(1000);

        // Aqui o atributo 'titular' é acessado diretamente (sem métdo get/set)
        // Isso quebra o encapsulamento, pois o campo deveria ser privado.
        conta.titular = "João";

        // Impressão dos dados da conta
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        // Altera o saldo novamente direto pelo setter (novamente sem verificação)
        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
    }
}
