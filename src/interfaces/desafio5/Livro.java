package interfaces.desafio5;

public class Livro extends Produto implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}

