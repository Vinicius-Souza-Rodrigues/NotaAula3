package Main;

import Cachorro.Cachorro;
import Gato.Gato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gato gato1 = new Gato();
        Cachorro cachorro1 = new Cachorro();

        System.out.println("Qual o animal?!: ");
        cachorro1.setAnimal(sc.next());
        System.out.println("Qual a raça?!: ");
        cachorro1.setRaca(sc.next());

        cachorro1.latir();
        cachorro1.latir();
        cachorro1.Caminha();
        cachorro1.Caminha();

        sc.close();
    }
}