package credit.exception;

import framework.service.exception.AccountException;

public class LimitExceededException extends AccountException {
    public LimitExceededException(String message) {
        super(message);
    }
}
