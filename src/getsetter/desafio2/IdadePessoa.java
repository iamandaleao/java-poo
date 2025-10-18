package getsetter.desafio2;

// Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

// Classe IdadePessoa — representa uma pessoa com nome e idade
public class IdadePessoa {

    // Atributo privado: armazena o nome da pessoa (não pode ser acessado diretamente fora da classe)
    private String nome;

    // Atributo privado: armazena a idade da pessoa
    private int idade;

    // Métdo getter — retorna o valor do atributo 'nome'
    public String getNome() {
        return nome;
    }

    // Métdo setter — define o valor do atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métdo getter — retorna o valor do atributo 'idade'
    public int getIdade() {
        return idade;
    }

    // Métdo setter — define o valor do atributo 'idade'
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métdo que verifica se a pessoa é maior de idade
    public void verificarIdade() {

        // Verifica se o valor do atributo 'idade' é maior ou igual a 18
        if (idade >= 18) {

            // Se for 18 ou mais, imprime que a pessoa é maior de idade
            System.out.println(nome + " é maior de idade.");

        } else {

            // Caso contrário, imprime que a pessoa não é maior de idade
            System.out.println(nome + " não é maior de idade.");
        }
    }
}
