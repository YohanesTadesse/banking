package framework.dataaccess;

import framework.entity.Account;

import java.util.Map;


public interface AccountDAO {
    void saveAccount(Account account);
    void updateAccount(Account account);
    Account loadAccount(String accountNumber);
    Map<String, Account> getAllAccounts();
}
