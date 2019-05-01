package credit.entity;

import credit.service.BronzeInterestRate;
import framework.entity.Customer;

import java.util.Date;

public class BronzeCreditCardAccount extends CreditCardAccount {

    public BronzeCreditCardAccount(final String accountNumber, final Customer customer, final Date expirationDate) {
        super(accountNumber, customer, expirationDate);
        setInterestStrategy(new BronzeInterestRate());
        setLimit(-1500.0);
	}
}
