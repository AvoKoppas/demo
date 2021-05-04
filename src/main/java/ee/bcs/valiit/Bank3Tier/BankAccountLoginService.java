package ee.bcs.valiit.Bank3Tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BankAccountLoginService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private BankAccountLoginRepo bankAccountLoginRepo;

    public void registerNewUser(String name, String encodedPassword) {
        bankAccountLoginRepo.registerNewUser(name, encodedPassword);
    }

    public String getEncodedPassword(String user) {
        return bankAccountLoginRepo.checkPassword(user);
    }

//      public boolean validate(String user, String password) {
//        String encodedPassword = getEncodedPassword(user); // from DB by userName
//        return bCryptPasswordEncoder.matches(password, encodedPassword);
//    }

//    public void savePassword(String password) {
//        String encodedPassword = passwordEncoder().encode(password);
//    }
}