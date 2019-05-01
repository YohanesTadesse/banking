package framework.entity;


import framework.service.Report;
import framework.service.exception.AccountException;
import framework.service.InterestStrategy;
import framework.service.notification.Observable;

import java.util.Date;
import java.util.List;


public abstract class Account extends Observable {
    private String accountNumber;
    private InterestStrategy interestStrategy;
    private Customer customer;
    protected Double balance = 0.0;

    private List<Transaction> transactions;

    public Account(String accountNumber, Customer customer) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        customer.addAccount(this);
    }


    protected void setInterestStrategy(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public abstract void addInterest() throws AccountException;

    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount) throws AccountException;

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Double getBalance() {
        return balance;
    }

    public InterestStrategy getInterestStrategy() {
        return interestStrategy;
    }

    protected void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public abstract Report report(Date from, Date to);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountNumber.equals(account.accountNumber);

    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}
