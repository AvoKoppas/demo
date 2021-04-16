package ee.bcs.valiit.testController;

import ee.bcs.valiit.tasks.Lesson4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Lesson4Controller {
    //   public List<String, Double> bankClients = new ArrayList<>();

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    //http://localhost:8080/createAccount/EE123/0.0
    @GetMapping("createAccount/{accountNr}/{initialBalance}")
    public String createAccount(@PathVariable("accountNr") String accountNr,
                                @PathVariable("initialBalance") double initialBalance) {
        String sql = "INSERT INTO account (name, balance) VALUES (:muutuja1, :muutuja2)";
        Map<String, Double> paramMap = new HashMap<>();
        paramMap.put("muutuja1", accountNr);
        paramMap.put("muutuja2", initialBalance);
        return Lesson4.createAccount(accountNr, initialBalance);
    }

    //http://localhost:8080/getBalance/EE123
    @GetMapping("getBalance/{accountNr}")
    public Double getBalance(@PathVariable("accountNr") String accountNr) {
        String sql = "SELECT balance FROM account WHERE account_number = :dbAccNo";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccNo", accountNr);
        Double balance = jdbcTemplate.queryForObject(sql, paramMap, Double.class);
        return balance;
    }

    //http://localhost:8080/deposit/EE123/50
    @GetMapping("deposit/{accountNr}/{deposit}")
    public String deposit(@PathVariable("accountNr") String accountNr,
                          @PathVariable("deposit") int deposit) {
        return Lesson4.deposit(accountNr, deposit);
    }

    //http://localhost:8080/withdraw/EE/1
    @GetMapping("withdraw/{accountNr}/{withdraw}")
    public String withdraw(@PathVariable("accountNr") String accountNr,
                           @PathVariable("withdraw") double withdraw) {
        return Lesson4.withdraw(accountNr, withdraw);
    }

    @GetMapping("transfer/{from}/{to}/{amount}")
    public String transfer(@PathVariable("from") String fromAccount,
                           @PathVariable("to") String toAccount,
                           @PathVariable("amount") double amount) {
        return Lesson4.transfer(fromAccount, toAccount, amount);
    }
//Siit edasi tuleb Postmani osa harjutamine !!!!!!!!

    //   @PutMapping("createAccount/{accountNr}/{initialBalance}")
    // public void createAccount(@PathVariable("accountNr") String accountNr, @PathVariable("initialBalance") double initialBalance){

}

