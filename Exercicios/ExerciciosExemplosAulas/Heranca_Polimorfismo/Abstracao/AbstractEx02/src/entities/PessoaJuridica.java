package entities;

public class PessoaJuridica extends Pessoa{
    private int numberOfEmployees;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        if (getNumberOfEmployees()>10){
            return getAnualIncome()*0.14;
        } else {
            return getAnualIncome()*0.16;
        }
    }
}
