package framework.dataaccess;

import framework.entity.Account;

import java.util.Map;

public class AccountDAOMock implements AccountDAO {
    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public Account loadAccount(String accountNumber) {
        return null;
    }

    @Override
    public Map<String, Account> getAllAccounts() {
        return null;
    }
}
