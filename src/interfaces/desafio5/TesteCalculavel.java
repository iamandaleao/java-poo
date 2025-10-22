package interfaces.desafio5;


public class TesteCalculavel {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.preco = 100.0; // preço base
        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());

        ProdutoFisico produto = new ProdutoFisico();
        produto.preco = 200.0; // preço base
        System.out.println("Preço final do produto físico: " + produto.calcularPrecoFinal());
    }
}

