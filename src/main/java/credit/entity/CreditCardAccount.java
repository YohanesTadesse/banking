package credit.entity;

import credit.exception.LimitExceededException;
import credit.service.CreditCardReport;
import framework.entity.Account;
import framework.entity.Customer;
import framework.entity.Transaction;
import framework.service.Report;

import java.util.Date;


public abstract class CreditCardAccount extends Account {

    private Date expirationDate;
    private Double limit = -1500.0;

    public CreditCardAccount(String accountNumber, Customer customer, Date expirationDate) {
        super(accountNumber, customer);
        this.expirationDate = expirationDate;
    }

    @Override
    public void deposit(Double amount) {
        balance += amount;
        String description = "deposited";
        Transaction transaction = new Transaction(amount, new Date(), description);
        addTransaction(transaction);
    }

    @Override
    public void withdraw(Double amount) throws LimitExceededException {
        if((balance - amount) >= limit) {
            balance -= amount;

            String description = "withdrawn";
            Transaction transaction = new Transaction(amount, new Date(), description);
            addTransaction(transaction);
        } else {
            throw new LimitExceededException("Credit account exceeded the limit");
        }
    }

    @Override
    public void addInterest() throws LimitExceededException {
        withdraw(getInterestStrategy().getInterest(balance));
    }

    @Override
    public Report report(Date from, Date to) {
        return new CreditCardReport(this, from, to);
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }
}

