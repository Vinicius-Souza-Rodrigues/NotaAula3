package Cachorro;

import Animal.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println("AU AU");
    }
}
