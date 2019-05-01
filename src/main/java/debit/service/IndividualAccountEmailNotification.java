package debit.service;

import framework.entity.Account;
import framework.entity.Customer;
import framework.entity.Transaction;
import framework.service.notification.EmailNotification;
import framework.service.notification.Observable;

public class IndividualAccountEmailNotification extends EmailNotification {

    @Override
    public void update(Observable observable, Object arg) {
        Account account = (Account)observable;
        Double amount = (Double)arg;

        Customer accountOwner = account.getCustomer();
        String name = accountOwner.getName();
        String accountNumber = account.getAccountNumber();
        String email = accountOwner.getAddress().getEmail();
        StringBuilder message = new StringBuilder("Hello, " + name + "! ");


        if (amount == null ) {
            message.append("Your account balance is insufficient to make the amount you were trying to withdraw from your account " + accountNumber);

        } else if(amount > 500.0) {
            Transaction lastTransaction = account.getAllTransactions().get(account.getAllTransactions().size() - 1);
            message.append("An amount of " + lastTransaction.getAmount());
            message.append(" has been " + lastTransaction.getDescription());
            message.append(" at " + lastTransaction.getDate());
        }
        sendEmail("donotreply@bank.com", email, message.toString());
    }
}
