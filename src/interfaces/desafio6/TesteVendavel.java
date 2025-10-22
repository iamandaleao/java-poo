package interfaces.desafio6;

public class TesteVendavel {
        public static void main(String[] args) {
            Produto produto = new Produto("Mouse Gamer", 150.0);
            Servico servico = new Servico("Manutenção de PC", 80.0);

            produto.aplicarDesconto(10); // 10% de desconto
            servico.aplicarDesconto(5);  // 5% de desconto

            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço unitário com desconto: " + produto.getPrecoUnitario());
            System.out.println("Preço total (3 unidades): " + produto.calcularPrecoTotal(3));

            System.out.println();

            System.out.println("Serviço: " + servico.getDescricao());
            System.out.println("Preço por hora com desconto: " + servico.getPrecoHora());
            System.out.println("Preço total (4 horas): " + servico.calcularPrecoTotal(4));
        }
    }