package exarraylist;

//Crie uma classe Pessoa com atributos como nome, idade, e um métdo toString que represente esses atributos.

// Declaração da classe chamada Pessoa
public class Pessoa01 {

    // Atributos (ou campos) da classe.
    // São as "características" que toda Pessoa tem.
    // O modificador 'private' impede que outras classes acessem diretamente esses valores.
    // O 'final' significa que, depois que o valor for atribuído no construtor, ele não pode mais ser alterado.
    private final String nome;
    private final int idade;

    // Construtor da classe.
    // Serve para "montar" um objeto Pessoa quando ele é criado.
    // Recebe o nome e a idade como parâmetros e armazena nos atributos.
    public Pessoa01(String nome, int idade) {
        this.nome = nome;   // O 'this' se refere ao atributo da classe.
        this.idade = idade; // Assim o Java sabe que 'idade' da direita é o parâmetro, e o da esquerda é o atributo.
    }

    // Métdo principal (main).
    // É o ponto de entrada do programa: é daqui que o Java começa a executar o código.
    public static void main(String[] args) {

        // Aqui criamos um novo objeto do tipo Pessoa, passando os valores "Leão" e 25 para o construtor.
        Pessoa01 p = new Pessoa01("Leão", 25);

        // Quando imprimimos o objeto, o Java chama automaticamente o métdo 'toString()' da classe.
        // Então o texto definido lá embaixo será mostrado no console.
        System.out.println(p);
    }

    // Métdo sobrescrito (Override) do métdo padrão 'toString()' da classe Object.
    // Serve para mostrar o objeto como texto de uma forma mais legível, em vez do formato padrão do Java.
    @Override
    public String toString() {
        // Retorna uma String com o nome e idade formatados.
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
}


