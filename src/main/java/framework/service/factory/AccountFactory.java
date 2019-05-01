package framework.service.factory;

import framework.service.AccountService;

public interface AccountFactory {
    //AccountDAO createAccountDAO(AccountDAOType accountDAOType);
    AccountService createAccountService(AccountDAOType accountDAOType);
}
