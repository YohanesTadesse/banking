package debit.entity;

import debit.exception.InsufficientBalanceException;
import debit.service.BankReport;
import framework.entity.Account;
import framework.entity.Customer;
import framework.entity.Transaction;
import framework.service.Report;

import java.util.Date;


public abstract class BankAccount extends Account {
    public BankAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    @Override
    public void deposit(Double amount) {
        balance += amount;
        String description = "deposited";
        Transaction transaction = new Transaction(amount, new Date(), description);
        addTransaction(transaction);
    }

    @Override
    public void withdraw(Double amount) throws InsufficientBalanceException {
        if((balance - amount) < 0 ) {
            throw new InsufficientBalanceException();
        }else{
			balance -= amount;
			String description = "withdrawn";
			Transaction transaction = new Transaction(amount, new Date(), description);
			addTransaction(transaction);
        }
       
    }

    @Override
    public void addInterest() {
        deposit(getInterestStrategy().getInterest(balance));
    }

    @Override
    public Report report(Date from, Date to) {
        return new BankReport(this, from, to);
    }
}
