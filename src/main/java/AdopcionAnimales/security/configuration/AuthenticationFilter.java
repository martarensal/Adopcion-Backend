package AdopcionAnimales.security.configuration;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AdopcionAnimales.users.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.DefaultClock;

public class AuthenticationFilter extends OncePerRequestFilter {

    private UsersService usersService;

    private Clock clock = DefaultClock.INSTANCE;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private String secret;

    public AuthenticationFilter(UsersService usersService, String secret) {
        super();
        this.usersService = usersService;
        this.secret = secret;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String xApiKey = request.getHeader("X-API-KEY");
        Long idUser;
        Jws<Claims> jws;
        if (xApiKey != null) {
            try {
                jws = Jwts.parser().setSigningKey(secret).parseClaimsJws(xApiKey);
                idUser = Long.parseLong(jws.getBody().getSubject());

                if (SecurityContextHolder.getContext().getAuthentication() == null) {
                    UserDetails userDetails = usersService.findUserById(idUser);
                    log.debug("Se ha obtenido el usuario " + userDetails.getUsername());
                    if (isTokenNonExpired(jws)) {
                        UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
                                userDetails, null, userDetails.getAuthorities());
                        SecurityContextHolder.getContext().setAuthentication(usernamePAT);
                    }
                }
            } catch (JwtException ex) {
                log.error(ex.getMessage());
            }
        }

        filterChain.doFilter(request, response);

    }

    private boolean isTokenNonExpired(Jws<Claims> jws) {
        return jws.getBody().getExpiration().after(clock.now());
    }

}