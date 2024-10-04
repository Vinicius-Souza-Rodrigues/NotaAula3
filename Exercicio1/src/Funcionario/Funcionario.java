package Funcionario;

public class Funcionario {
    protected String nome;
    protected int nascimento;
    protected double salario;

    public Funcionario(String nome, int nascimento, double salario) {
        setSalario(salario);
        setNascimento(nascimento);
        setNome(nome);
    }

    public Funcionario() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public int calcularAniversario() {
        return 2024 - getNascimento();
    }
}