package ee.bcs.valiit.Bank3Tier;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BankAccountLoginController {

    @PostMapping
    public String login(@PathVariable("login") LoginRequest loginRequest) {
        Date today = new Date();
        Date tokenExpirationDate = new Date(today.getTime() + 1000 * 60);
        JwtBuilder jwtBuilder = Jwts.builder()
                .setExpiration(tokenExpirationDate)
                .setIssuedAt(new Date())
                .setIssuer("issuer")
                .signWith(SignatureAlgorithm.HS256, "secret")
                .claim("username", userName);
        String jwt = jwtBuilder.compact();
        return "Generated";
    }

}
