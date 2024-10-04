package Gato;

import Animal.Animal;

public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void Miar() {
        System.out.println("Miau!");
    }
}
