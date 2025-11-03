//package atividades.sexto;
/// / Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista
/// / de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
//
//import java.util.ArrayList;
//
//record ContaBancaria(int numeroConta, double saldo) {
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
//        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
//        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);
//
//        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
//        listaContas.add(conta1);
//        listaContas.add(conta2);
//        listaContas.add(conta3);
//
//        ContaBancaria contaMaiorSaldo = listaContas.get(0);
//        for (ContaBancaria conta : listaContas) {
//            if (conta.saldo() > contaMaiorSaldo.saldo()) {
//                contaMaiorSaldo = conta;
//            }
//        }
//
//        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.numeroConta() +
//                ", Saldo: " + contaMaiorSaldo.saldo());
//    }
//}
