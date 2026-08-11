package entities;

public class Account {

    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account() {
    }

    public Account(String holder, Integer number, Double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withDraw(double ammount){
        this.balance -= ammount + 5;
    }

    public void deposit(double ammount){
        this.balance += ammount;
    }

}
