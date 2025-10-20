package sobrescrever.desafio2;

// Crie uma classe Animal com um métdo emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o métdo emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o métdo. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}

