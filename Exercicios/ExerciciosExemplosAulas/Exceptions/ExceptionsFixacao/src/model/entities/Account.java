package model.entities;

import model.exception.BalanceException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if (!(balance>=0 && withdrawLimit>=0)){
            throw new BalanceException("Invalid arguments.");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double ammount){
        if (ammount<=0){
            throw new BalanceException("Value of deposit is not integer positive.");
        }
        this.balance += ammount;
    }

    public void withdraw(Double ammount){
        if (ammount>withdrawLimit){
            throw new BalanceException("The amount exceed limit.");
        } else if (ammount>balance){
             throw new BalanceException("The withdrawal amount exceeded the account balance.");
         }
        this.balance -= ammount;
    }

    @Override
    public String toString() {
        return "Number: "+number+"\n"+
                "Holder: "+holder+"\n"+
                "Balance: $ "+balance+"\n"+
                "Withdraw limit: $ "+withdrawLimit+"\n";
    }
}
