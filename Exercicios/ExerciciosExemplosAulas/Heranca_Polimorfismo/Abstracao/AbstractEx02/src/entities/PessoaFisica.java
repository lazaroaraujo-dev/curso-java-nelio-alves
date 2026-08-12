package entities;

public class PessoaFisica extends Pessoa{

    private Double healthExpedintures;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double anualIncome, Double healthExpedintures) {
        super(name, anualIncome);
        this.healthExpedintures = healthExpedintures;
    }

    public Double getHealthExpedintures() {
        return healthExpedintures;
    }

    public void setHealthExpedintures(Double healthExpedintures) {
        this.healthExpedintures = healthExpedintures;
    }

    @Override
    public Double tax(){
        if (super.getAnualIncome()<20000.00){
            return (getAnualIncome()*0.15);
        }
        else {
            if (getHealthExpedintures()>0.0){
                return (getAnualIncome()*0.25)-(getHealthExpedintures()*0.50);
            }else {
                return (getAnualIncome()*0.25);
            }
        }
    }
}
