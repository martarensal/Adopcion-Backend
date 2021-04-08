package AdopcionAnimales.authentication;

public class UnsuccessfulLoginException extends Exception {
    private static final long serialVersionUID = 1L;

    public UnsuccessfulLoginException(String errorMessage) {
        super(errorMessage);
    }
}