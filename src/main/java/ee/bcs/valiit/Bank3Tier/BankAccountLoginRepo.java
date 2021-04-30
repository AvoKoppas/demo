package ee.bcs.valiit.Bank3Tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BankAccountLoginRepo {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public void registerNewUser(String name, String password) {
        String sql = "INSERT INTO users (username, password) VALUES (:a, :b)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a", name);
        paramMap.put("b", password);
        jdbcTemplate.update(sql, paramMap);
    }
}
