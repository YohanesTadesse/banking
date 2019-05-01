package debit.exception;

import framework.service.exception.AccountException;


public class InsufficientBalanceException extends AccountException {

    public InsufficientBalanceException() {
        super("Insufficient balance exception");
    }
}
