package homework5.exercise2;

public class InvalidCustomerException extends Exception{
    public InvalidCustomerException(String message) {
        super(message);
    }

    public InvalidCustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCustomerException(Throwable cause) {
        super(cause);
    }
}
