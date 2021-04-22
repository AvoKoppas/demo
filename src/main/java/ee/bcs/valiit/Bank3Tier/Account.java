package ee.bcs.valiit.Bank3Tier;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private String accountNumber;
    private int id;
    private Double balance;
    private boolean block;

    public String getAccountNr() {
        return accountNumber;
    }

    public void setAccountNr(String accountNr) {
        this.accountNumber = accountNr;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
