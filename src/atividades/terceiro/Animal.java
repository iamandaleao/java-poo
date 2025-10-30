package atividades.terceiro;
// Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo
// correto antes de fazer o casting.

class Animal {
    // propriedades e métodos comuns
}

class Cachorro extends Animal {
    // propriedades e métodos do cachorro
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro cachorro) {
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}

