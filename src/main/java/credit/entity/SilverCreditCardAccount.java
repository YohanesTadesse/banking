package credit.entity;

import credit.service.SilverInterestRate;
import framework.entity.Customer;

import java.util.Date;

public class SilverCreditCardAccount extends CreditCardAccount {

	public SilverCreditCardAccount(String accountNumber, Customer customer, Date expirationDate) {
		super(accountNumber, customer, expirationDate);
		
		setInterestStrategy(new SilverInterestRate());
	}

}
