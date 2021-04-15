package ee.bcs.valiit.testController;

import ee.bcs.valiit.tasks.Lesson4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson4Controller {
    //   public List<String, Double> bankClients = new ArrayList<>();


    //http://localhost:8080/createAccount/EE123/0.0
    @GetMapping("createAccount/{accountNr}/{initialBalance}")
    public String createAccount(@PathVariable("accountNr") String accountNr,
                                @PathVariable("initialBalance") double initialBalance) {
        return Lesson4.createAccount(accountNr, initialBalance);
    }

    //http://localhost:8080/getBalance/EE
    @GetMapping("getBalance/{accountNr}")
    public String getBalance(@PathVariable("accountNr") String accountNr) {
        return Lesson4.getBalance(accountNr);
    }

    //http://localhost:8080/deposit/EE/50
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

//    @GetMapping("create")
  //  public
}
