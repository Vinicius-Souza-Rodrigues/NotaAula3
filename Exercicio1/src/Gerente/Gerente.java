package Gerente;

import Funcionario.Funcionario;

public class Gerente extends Funcionario {
    private String projeto;

    public Gerente() {

    }

    public Gerente(String projeto, String nome, int idade, double salario) {
        super(nome, idade, salario);
        setProjeto(projeto);
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getProjeto() {
        return projeto;
    }

    public String informarProjeto() {
        return getProjeto();
    }

    public String toString() {
        return "Nome: " + getNome() + "%nIdade: " + calcularAniversario() + "%nSálario: " + getSalario() + "%nProjeto: " + getProjeto();
    }
}
