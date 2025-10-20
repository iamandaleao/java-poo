package sobrescrever.desafio1;

// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

// Classe de Teste
public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}
