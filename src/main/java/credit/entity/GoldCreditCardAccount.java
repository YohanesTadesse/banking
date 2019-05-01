package credit.entity;

import java.util.Date;

import credit.service.GoldInterestRate;
import framework.entity.Customer;

public class GoldCreditCardAccount extends CreditCardAccount {


    public GoldCreditCardAccount(String accountNumber, Customer customer, Date expirationDate) {
        super(accountNumber, customer,expirationDate);
        
        setInterestStrategy(new GoldInterestRate());
    }
}
