package entities;



public abstract class Pessoa {
    protected String name;
    protected Double anualIncome;

    public Pessoa() {
    }

    public Pessoa(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public abstract Double tax();
}
