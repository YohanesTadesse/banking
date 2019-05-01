package credit.entity;


import credit.service.GoldInterestRate;
import framework.entity.Customer;

import java.util.Date;


public class GoldAccount extends CreditCardAccount {

    public GoldAccount(String accountNumber, Customer customer) {
        super(accountNumber,customer, new Date());
        
        setInterestStrategy(new GoldInterestRate());
    }

}
