package AdopcionAnimales.users;

public class UniqueEmailException extends Exception {
    public UniqueEmailException(String errorMessage) {
        super(errorMessage);
    }
}
