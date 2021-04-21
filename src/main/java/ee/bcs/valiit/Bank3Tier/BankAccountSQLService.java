package ee.bcs.valiit.Bank3Tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Service
public class BankAccountSQLService {
    @Autowired
    private BankAccountSQLRepo bankAccountSQLRepo;
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void createAccount(String accountNr, Double initialBalance) {
        bankAccountSQLRepo.createAccount(accountNr, initialBalance);
    }

    public Double getBalance(String accountNr) {
        return bankAccountSQLRepo.initialBalance(accountNr);
    }

    public String deposit(@PathVariable("accountNr") String accountNr,
                          @PathVariable("deposit") double deposit) {
        if (deposit < 0) {
            return "Amount must be positive value!";
        }
        Double balance = bankAccountSQLRepo.initialBalance(accountNr);
        balance = balance + deposit;
        bankAccountSQLRepo.finalBalanceDeposit(accountNr, balance);
        return "Deposit made, new balance is " + balance;
    }

    public String withdraw(@PathVariable("accountNr") String accountNr,
                           @PathVariable("withdraw") double withdraw) {
        if (withdraw < 0) {
            return "Amount must be positive value!";
        }
        Double balance = bankAccountSQLRepo.initialBalance(accountNr);
        balance = balance - withdraw;
        bankAccountSQLRepo.finalBalanceWithdraw(accountNr, balance);
        return "Withdraw made";
    }

    public String transfer(@PathVariable("from") String fromAccount,
                           @PathVariable("to") String toAccount,
                           @PathVariable("amount") double amount) {
        String sqlFrom = "SELECT balance FROM account WHERE account_number = :muutuja1";
        Map<String, Object> paramMapFrom = new HashMap<>();
        paramMapFrom.put("muutuja1", fromAccount);
        Double balanceFrom = jdbcTemplate.queryForObject(sqlFrom, paramMapFrom, Double.class);
        String sqlTo = "SELECT balance FROM account WHERE account_number = :muutuja2";
        Map<String, Object> paramMapTo = new HashMap<>();
        paramMapTo.put("muutuja2", toAccount);
        Double balanceTo = jdbcTemplate.queryForObject(sqlTo, paramMapTo, Double.class);
        balanceFrom = balanceFrom - amount;
        balanceTo = balanceTo + amount;
        sqlFrom = "UPDATE account SET balance = :fromBalance WHERE account_number = :muutuja1";
        sqlTo = "UPDATE account SET balance = :toBalance WHERE account_number = :muutuja2";
        paramMapFrom.put("fromBalance", balanceFrom);
        paramMapTo.put("toBalance", balanceTo);
        jdbcTemplate.update(sqlFrom, paramMapFrom);
        jdbcTemplate.update(sqlTo, paramMapTo);
        return "Transfer made";
    }
}