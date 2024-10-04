package Main;

import Cachorro.Cachorro;
import Gato.Gato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digte o nome e a raca do gato!");
        Gato gato1 = new Gato(sc.next(), sc.next());
        System.out.println("Digite o nome e raca do cachorro!: ");
        Cachorro cachorro1 = new Cachorro(sc.next(), sc.next());

        cachorro1.latir();
        cachorro1.latir();
        cachorro1.Caminha();
        cachorro1.Caminha();

        gato1.Caminha();
        gato1.Miar();

        sc.close();
    }
}