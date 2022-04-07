package AdopcionAnimales.users;

public class UniqueUsernameException extends Exception {
    public UniqueUsernameException(String errorMessage) {
        super(errorMessage);
    }

}