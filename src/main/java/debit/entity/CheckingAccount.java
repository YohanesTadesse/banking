package debit.entity;

import debit.service.CheckingInterestStrategy;
import framework.entity.Customer;


public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
        setInterestStrategy(new CheckingInterestStrategy());
    }
}
