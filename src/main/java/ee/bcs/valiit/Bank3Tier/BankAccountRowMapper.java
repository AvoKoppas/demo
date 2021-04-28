package ee.bcs.valiit.Bank3Tier;

import ee.bcs.valiit.ClassesCreated.BankAccount;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccountRowMapper implements RowMapper<BankAccount> {
    @Override
    public BankAccount mapRow(ResultSet resultSet, int i) throws SQLException {
        BankAccount result = new BankAccount();
        result.setBalance(resultSet.getDouble("balance"));
        result.setAccountNr(resultSet.getString("account_number"));
        return result;
    }
}