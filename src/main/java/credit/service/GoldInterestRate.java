package credit.service;

import framework.service.InterestStrategy;


public class GoldInterestRate implements InterestStrategy {

	public Double getInterest(Double balance) {
		double interest = 0;
		interest = balance * 0.06;
		return interest;
		
	}
}
