package atividades.quarto;
// Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize
// um loop para calcular e imprimir o preço médio dos produtos.

import java.util.ArrayList;

record Produto(String nome, double preco) {
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Ar condicionado", 2000.0);
        Produto produto2 = new Produto("Aquecedor", 800.0);
        Produto produto3 = new Produto("Ventilador", 150.0);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.preco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
