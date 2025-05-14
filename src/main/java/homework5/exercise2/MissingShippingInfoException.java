package homework5.exercise2;

public class MissingShippingInfoException extends Exception{
    public MissingShippingInfoException(String message) {
        super(message);
    }

    public MissingShippingInfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingShippingInfoException(Throwable cause) {
        super(cause);
    }
}
