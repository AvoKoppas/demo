package ee.bcs.valiit.solution.service;

import ee.bcs.valiit.solution.repository.SampleAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleBankService {
    @Autowired
    private SampleAccountRepository accountRepository;


    public void createAccount(String accountNr, Double balance) {
        accountRepository.createAccount(accountNr, balance);
    }


}