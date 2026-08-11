package entities;

public class BusinessAccount extends Account{
    private Double loanLImit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(String holder, Integer number, Double balance, Double loanLImit) {
        super(holder, number, balance);
        this.loanLImit = loanLImit;
    }

    public BusinessAccount(Double loanLImit) {
        this.loanLImit = loanLImit;
    }

    public void loan(Double ammount){
        if (ammount <= loanLImit){
            balance += ammount - 10.0;
        }
    }

    @Override
    public void withDraw(double ammount){
        super.withDraw(ammount);
        balance -= 2.0;
    }
}
