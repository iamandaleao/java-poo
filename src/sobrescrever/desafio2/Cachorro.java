package sobrescrever.desafio2;

// Crie uma classe Animal com um métdo emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o métdo emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o métdo. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}
