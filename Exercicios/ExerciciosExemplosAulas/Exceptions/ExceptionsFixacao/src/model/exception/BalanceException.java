package model.exception;

public class BalanceException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public BalanceException(String message) {
        super(message);
    }
}
