package AdopcionAnimales.authentication;

import AdopcionAnimales.api.authentication.LoginRequest;
import AdopcionAnimales.api.authentication.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    public LoginResponse loginUser(LoginRequest loginRequest) throws UnsuccessfulLoginException;
}