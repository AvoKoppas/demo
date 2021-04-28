package ee.bcs.valiit.Bank3Tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BankAccountSQLRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public String createAccount(String accountNr, double initialBalance) {
        String sql = "INSERT INTO account (account_number, balance) " +
                "VALUES (:muutuja1, :muutuja2)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("muutuja1", accountNr);
        paramMap.put("muutuja2", initialBalance);
        jdbcTemplate.update(sql, paramMap);
        return "Account created!";
    }

    public Double initialBalance(String accountNr) {
        String sqlOldBalance = "SELECT balance FROM account WHERE account_number = :muutuja2";
        Map<String, Object> paramMapOldBalance = new HashMap<>();
        paramMapOldBalance.put("muutuja2", accountNr);
        return jdbcTemplate.queryForObject(sqlOldBalance, paramMapOldBalance, Double.class);
    }

    public void finalBalance(String accountNr, double balance) {
        String sql = "UPDATE account SET balance = :muutuja1 WHERE account_number = :muutuja2";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("muutuja1", balance);
        paramMap.put("muutuja2", accountNr);
        jdbcTemplate.update(sql, paramMap);
    }

    public void deleteOne(String accountNr) {
        String sql = "DELETE FROM account WHERE account_number =:a";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a", accountNr);
        jdbcTemplate.update(sql, paramMap);
    }

    public void deleteAll() {
        String sql = "DELETE FROM account";
        Map<String, Object> paramMap = new HashMap<>();
        // paramMap.put("a", accountNr);
        jdbcTemplate.update(sql, paramMap);
    }

    public Double getAllBalance() {
        String sql = "SELECT * FROM account";
        Map<String, Object> paramMap = new HashMap<>();
        return jdbcTemplate.queryForObject(sql, paramMap, Double.class);
    }
}