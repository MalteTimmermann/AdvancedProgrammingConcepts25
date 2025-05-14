package homework5.exercise2;

public class InvalidShippingInfoException extends Exception{
    public InvalidShippingInfoException(String message) {
        super(message);
    }

    public InvalidShippingInfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidShippingInfoException(Throwable cause) {
        super(cause);
    }
}
