package getsetter.desafio2;

//Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métdos getters e setters para acessar e modificar esses atributos. Adicione um métdo verificarIdade que imprime se a pessoa é maior de idade ou não.

// Classe screenmatch.principal.Principal — usada para testar a classe IdadePessoa
public class Principal {
    public static void main(String[] args) {

        // Cria um objeto pessoa1 da classe IdadePessoa
        IdadePessoa pessoa1 = new IdadePessoa();

        // Define o nome da pessoa1 como "Amanda"
        pessoa1.setNome("Amanda");

        // Define a idade da pessoa1 como 22
        pessoa1.setIdade(22);

        // Cria um objeto pessoa2 da classe IdadePessoa
        IdadePessoa pessoa2 = new IdadePessoa();

        // Define o nome da pessoa2 como "Beatriz"
        pessoa2.setNome("Beatriz");

        // Define a idade da pessoa2 como 20
        pessoa2.setIdade(20);

        // Imprime o nome e a idade de pessoa1 usando os getters
        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");

        // Chama o métdo verificarIdade de pessoa1 para ver se é maior de idade
        pessoa1.verificarIdade();

        // Imprime o nome e a idade de pessoa2 usando os getters
        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");

        // Chama o métdo verificarIdade de pessoa2 para ver se é maior de idade
        pessoa2.verificarIdade();
    }
}
