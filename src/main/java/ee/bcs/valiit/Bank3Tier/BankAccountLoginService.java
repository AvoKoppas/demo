package ee.bcs.valiit.Bank3Tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BankAccountLoginService {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private BankAccountLoginRepo bankAccountLoginRepo;

    public void registerNewUser(String name, String password) {
        bankAccountLoginRepo.registerNewUser(name, password);
    }
}
