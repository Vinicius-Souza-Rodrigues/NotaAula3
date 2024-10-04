package Animal;

public class Animal {
    protected String animal;
    protected String raca;
    protected int passos = 0;

    public Animal(String animal, String raca) {
        setAnimal(animal);
        setRaca(raca);
    }
    public Animal() {

    }

    public void Caminha() {
        setPassos(getPassos() + incremeto());
        System.out.printf("%nCaminhou %s Passos", getPassos());
    }

    public int incremeto() {
        return 1;
    }

    public int getPassos() {
        return passos;
    }

    public void setPassos(int passos) {
        this.passos = passos;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
