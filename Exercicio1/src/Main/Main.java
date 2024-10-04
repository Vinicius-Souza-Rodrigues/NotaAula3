package Main;

import Funcionario.Funcionario;
import Gerente.Gerente;
import Programador.Programador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente1 = new Gerente();
        Programador programador1 = new Programador();

        System.out.println("Digite o seu nome!: ");
        gerente1.setNome(sc.next());
        System.out.println("Digite a sua data de nascimento!: ");
        gerente1.setNascimento(sc.nextInt());
        System.out.println("Digite o seu sálario!: ");
        gerente1.setSalario(sc.nextDouble());
        System.out.println("Digite o seu projeto!: ");
        gerente1.setProjeto(sc.next());
        System.out.printf(gerente1.toString());
        System.out.println();

        System.out.println("Digite o seu nome!: ");
        programador1.setNome(sc.next());
        System.out.println("Digite a sua data de nascimento!: ");
        programador1.setNascimento(sc.nextInt());
        System.out.println("Digite o seu sálario!: ");
        programador1.setSalario(sc.nextDouble());
        System.out.println("Digite a sua linguagem!: ");
        programador1.setLinguagem(sc.next());
        System.out.printf(programador1.toString());

        sc.close();
    }
}