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
    //http://localhost:8080/login/Tiit/rull
    @PostMapping("login/{user}/{password}")
    public String login(@PathVariable("user") String user,
                        @PathVariable("password") String password) {
        Date today = new Date();
        Date tokenExpirationDate = new Date(today.getTime() + 1000 * 60 * 60);
        JwtBuilder jwtBuilder = Jwts.builder()
                .setExpiration(tokenExpirationDate)
                .setIssuedAt(new Date())
                .setIssuer("issuer")
                .signWith(SignatureAlgorithm.HS256, "secret")
                .claim("user", user);
        String jwt = jwtBuilder.compact();
        return jwtBuilder.compact();
    }

}