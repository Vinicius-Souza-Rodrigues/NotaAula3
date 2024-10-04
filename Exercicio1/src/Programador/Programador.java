package Programador;

import Funcionario.Funcionario;

public class Programador extends Funcionario {
    private String linguagem;

    public Programador() {

    }

    public Programador(String linguagem, String nome, int idade, double salario) {
        super(nome, idade, salario);
        setLinguagem(linguagem);
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public String toString() {
        return "Nome: " + getNome() + "%nIdade: " + calcularAniversario() + "%nSálario: " + getSalario() + "%nLinguagem: " + getLinguagem();
    }
}
