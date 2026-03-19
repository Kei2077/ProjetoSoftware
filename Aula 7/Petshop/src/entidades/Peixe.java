package entidades;

public class Peixe extends Animal {
    private String especie;


    public Peixe(String nome, int idade, double peso, String especie) {
        super(nome, peso, idade);
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Peixe  (String nome, String especie){
        super(nome);
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Peixe{" + super.toString() + "especie=" + especie + '}';
    }
}