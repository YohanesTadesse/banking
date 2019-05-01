package debit.entity;

import debit.service.SavingInterestStrategy;
import framework.entity.Customer;


public class SavingAccount extends BankAccount {

	public SavingAccount(String accountNumber, Customer customer) {
		super(accountNumber, customer);
		setInterestStrategy(new SavingInterestStrategy());
	}
}
