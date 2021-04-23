package ee.bcs.valiit.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private String accountNumber;
    private Integer id;
    private Double balance;
    private Boolean block;

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
