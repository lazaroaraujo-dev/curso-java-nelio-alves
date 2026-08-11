package entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(String holder, Integer number, Double balance, Double interestRate) {
        super(holder, number, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
    // Sobreposicao
    @Override
    public void withDraw(double ammount){
        balance -= ammount;
    }
}
