package ee.bcs.valiit.Bank3Tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankAccountController {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    BankAccountSQLService bankAccountSQLService;

    //http://localhost:8080/createAccount/Siim/1267.89
    @PutMapping("createAccount/{accountNr}/{initialBalance}")
    public String createAccount(@PathVariable("accountNr") String accountNr,
                                @PathVariable("initialBalance") Double initialBalance) {
        bankAccountSQLService.createAccount(accountNr, initialBalance);
        return "Account created!! Your account name is " + accountNr + " with initial balance of " + initialBalance;
    }

    //http://localhost:8080/getBalance/Siim
    @GetMapping("getBalance/{accountNr}")
    public String getBalance(@PathVariable("accountNr") String accountNr) {
        bankAccountSQLService.getBalance(accountNr);
        return accountNr + " has a balance of " + bankAccountSQLService.getBalance(accountNr);
    }

    //http://localhost:8080/deposit/Raimo/50
    @PutMapping("deposit/{accountNr}/{deposit}")
    public String deposit(@PathVariable("accountNr") String accountNr,
                          @PathVariable("deposit") double deposit) {
        bankAccountSQLService.deposit(accountNr, deposit);
        return "Deposit made!! Balance is " + bankAccountSQLService.getBalance(accountNr);
    }

    //http://localhost:8080/withdraw/Kaisa/50
    @PutMapping("withdraw/{accountNr}/{withdraw}")
    public String withdraw(@PathVariable("accountNr") String accountNr,
                           @PathVariable("withdraw") double withdraw) {
        bankAccountSQLService.withdraw(accountNr, withdraw);
        return "Withdraw made, new balance of " + accountNr + " is " + bankAccountSQLService.getBalance(accountNr);
    }

    //http://localhost:8080/transfer/Kaisa/Ivan/50
    @PutMapping("transfer/{from}/{to}/{amount}")
    public String transfer(@PathVariable("from") String fromAccount,
                           @PathVariable("to") String toAccount,
                           @PathVariable("amount") double amount) {
        bankAccountSQLService.transfer(fromAccount, toAccount, amount);
        return "Transfer made, from balance is " + bankAccountSQLService.getBalance(fromAccount) +
                " to balance is " + bankAccountSQLService.getBalance(toAccount);
    }

    @DeleteMapping("deleteOne/{accountNr}")
    public String deleteOne(@PathVariable("accountNr") String accountNr) {
        bankAccountSQLService.deleteOne(accountNr);
        return "Account has been deleted";
    }
}