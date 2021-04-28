package ee.bcs.valiit.Bank3Tier;

import ee.bcs.valiit.ClassesCreated.BankAccount;
import ee.bcs.valiit.hibernate.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountSQLService {
    @Autowired
    private BankAccountSQLRepo bankAccountSQLRepo;
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private AccountRepository accountRepository;

    public void createAccount(String accountNr, Double initialBalance) {
        //       accountRepository.getOne(accountNr);
        bankAccountSQLRepo.createAccount(accountNr, initialBalance);
    }

    public Double getBalance(String accountNr) {
//        return accountRepository.getOne(accountNr).getBalance();
        return bankAccountSQLRepo.initialBalance(accountNr);
    }

    public void deposit(String accountNr, double deposit) {
        if (deposit < 0) {
            throw new ApplicationException("Your deposit was negative!");
        }
        Double balance = bankAccountSQLRepo.initialBalance(accountNr);
        balance = balance + deposit;
        bankAccountSQLRepo.finalBalance(accountNr, balance);
    }

    public void withdraw(String accountNr, double withdraw) {
        if (withdraw < 0) {
            throw new ApplicationException("Withdraw amount has to be positive");
        } else if (bankAccountSQLRepo.initialBalance(accountNr) < withdraw) {
            throw new ApplicationException("Not enough money on your account!");
        }
        Double balance = bankAccountSQLRepo.initialBalance(accountNr);
        balance = balance - withdraw;
        bankAccountSQLRepo.finalBalance(accountNr, balance);
    }

    public void transfer(String fromAccount, String toAccount, double amount) {
        if (amount > bankAccountSQLRepo.initialBalance(fromAccount)) {
            throw new ApplicationException("Not enough money on your starting account!");
        }
        Double balanceFrom = bankAccountSQLRepo.initialBalance(fromAccount);
        Double balanceTo = bankAccountSQLRepo.initialBalance(toAccount);
        balanceFrom = balanceFrom - amount;
        balanceTo = balanceTo + amount;
        bankAccountSQLRepo.finalBalance(fromAccount, balanceFrom);
        bankAccountSQLRepo.finalBalance(toAccount, balanceTo);
    }

    public void deleteOne(String accountNr) {
        bankAccountSQLRepo.deleteOne(accountNr);
    }

    public void deleteAll() {
        bankAccountSQLRepo.deleteAll();
    }

    public List<BankAccount> getAllBalance() {
        return bankAccountSQLRepo.getAllBalance();
    }
}