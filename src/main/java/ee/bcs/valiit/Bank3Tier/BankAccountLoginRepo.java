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

    public void registerNewUser(String name, String encodedPassword) {
        String sql = "INSERT INTO users (username, password) VALUES (:a, :b)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a", name);
        paramMap.put("b", encodedPassword);
        jdbcTemplate.update(sql, paramMap);
    }

    public String checkPassword(String user) {
        String sql = "SELECT password FROM users WHERE username= :a";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a", user);
        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }
}
