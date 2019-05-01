package credit.service;

import framework.entity.Account;
import framework.entity.Customer;
import framework.service.notification.EmailNotification;
import framework.service.notification.Observable;

public class CreditCardEmailNotification extends EmailNotification {
    @Override
    public void update(Observable observable, Object arg) {
        Account account = (Account) observable;
        Double amount = (Double) arg;

        Customer accountOwner = account.getCustomer();
        String name = accountOwner.getName();
        String email = accountOwner.getAddress().getEmail();
        String accountNumber = account.getAccountNumber();


        if (amount > 400.0) {
            StringBuilder message = new StringBuilder();
            message.append("Hello, " + name + "! ");
            message.append("An amount of $" + amount);
            message.append(" has been charged from your credit card ending with");
            message.append(accountNumber.substring(accountNumber.length() - 4));

            sendEmail("donotreply@creditCard.com", email, message.toString());
        }
    }
}
