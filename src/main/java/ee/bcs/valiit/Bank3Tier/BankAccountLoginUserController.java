package ee.bcs.valiit.Bank3Tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountLoginUserController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    BankAccountLoginService bankAccountLoginService;

    @CrossOrigin
    @PostMapping("registerNewUser/{username}/{password}")
    public String registerNewUser(@PathVariable("username") String username,
                                  @PathVariable("password") String password) {
        bankAccountLoginService.registerNewUser(username, password);
        return "Account created!";
    }
}
