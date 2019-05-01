package credit.service;

import framework.service.InterestStrategy;

public class BronzeInterestRate implements InterestStrategy {
    @Override
    public Double getInterest(Double balance) {
    	double interest = 0;
		interest = balance * 0.1;
		return interest;
		
    }
}
