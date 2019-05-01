package framework.service;

import framework.entity.Account;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface AccountService {
    void createAccount(Account account);
    Account getAccount(String accountNumber);
    Map<String, Account> getAllAccounts();
    void deposit(String accountNumber, Double amount);
    void withdraw(String accountNumber, Double amount);
    void addInterest();
    List<String> generateReport(String[] accountNumbers, Date from, Date to);
}
