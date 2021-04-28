//package ee.bcs.valiit.Bank3Tier;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Bank3Architecture {
//
//
//    @RestController
//    public class Lesson4Controller {
//        //   public List<String, Double> bankClients = new ArrayList<>();
//
//        @Autowired
//        private NamedParameterJdbcTemplate jdbcTemplate;
//
////        //http://localhost:8080/createAccount/Siim/1267.89
////        @PutMapping("createAccount/{accountNr}/{initialBalance}")
////        public String createAccount(@PathVariable("accountNr") String accountNr,
////                                    @PathVariable("initialBalance") Double initialBalance) {
////            String sql = "INSERT INTO account (account_number, balance) VALUES (:muutuja1, :muutuja2)";
////            Map<String, Object> paramMap = new HashMap<>();
////            paramMap.put("muutuja1", accountNr);
////            paramMap.put("muutuja2", initialBalance);
////            jdbcTemplate.update(sql, paramMap);
////            return "Account created";
////        }
//
//        //http://localhost:8080/getBalance/Siim
//        @GetMapping("getBalance/{accountNr}")
//        public Double getBalance(@PathVariable("accountNr") String accountNr) {
//            String sql = "SELECT balance FROM account WHERE account_number = :dbAccNo";
//            Map<String, Object> paramMap = new HashMap<>();
//            paramMap.put("dbAccNo", accountNr);
//            Double balance = jdbcTemplate.queryForObject(sql, paramMap, Double.class);
//            return balance;
//        }
//
//        //http://localhost:8080/deposit/Raimo/50
//        @PutMapping("deposit/{accountNr}/{deposit}")
//        public String deposit(@PathVariable("accountNr") String accountNr,
//                              @PathVariable("deposit") int deposit) {
//            if (deposit < 0) {
//                return "Amount must be positive value!";
//            }
//            String sqlOldBalance = "SELECT balance FROM account WHERE account_number = :muutuja2";
//            Map<String, Object> paramMapOldBalance = new HashMap<>();
//            paramMapOldBalance.put("muutuja2", accountNr);
//            Double balance = jdbcTemplate.queryForObject(sqlOldBalance, paramMapOldBalance, Double.class);
//            balance = balance + deposit;
//            String sql = "UPDATE account SET balance = :muutuja1 WHERE account_number = :muutuja2";
//            Map<String, Object> paramMap = new HashMap<>();
//            paramMap.put("muutuja1", balance);
//            paramMap.put("muutuja2", accountNr);
//            jdbcTemplate.update(sql, paramMap);
//            return "Deposit made";
//        }
//
//        //http://localhost:8080/withdraw/Kaisa/50
//        @PutMapping("withdraw/{accountNr}/{withdraw}")
//        public String withdraw(@PathVariable("accountNr") String accountNr,
//                               @PathVariable("withdraw") double withdraw) {
//            if (withdraw < 0) {
//                return "Amount must be positive value!";
//            }
//            String sqlOldBalance = "SELECT balance FROM account WHERE account_number = :muutuja2";
//            Map<String, Object> paramMapOldBalance = new HashMap<>();
//            paramMapOldBalance.put("muutuja2", accountNr);
//            Double balance = jdbcTemplate.queryForObject(sqlOldBalance, paramMapOldBalance, Double.class);
//            balance = balance - withdraw;
//            String sql = "UPDATE account SET balance = :muutuja1 WHERE account_number = :muutuja2";
//            Map<String, Object> paramMap = new HashMap<>();
//            paramMap.put("muutuja1", balance);
//            paramMap.put("muutuja2", accountNr);
//            jdbcTemplate.update(sql, paramMap);
//            return "Withdraw made";
//        }
//
//        //http://localhost:8080/transfer/Kaisa/Ivan/50
//        @PutMapping("transfer/{from}/{to}/{amount}")
//        public String transfer(@PathVariable("from") String fromAccount,
//                               @PathVariable("to") String toAccount,
//                               @PathVariable("amount") double amount) {
//            String sqlFrom = "SELECT balance FROM account WHERE account_number = :muutuja1";
//            Map<String, Object> paramMapFrom = new HashMap<>();
//            paramMapFrom.put("muutuja1", fromAccount);
//            Double balanceFrom = jdbcTemplate.queryForObject(sqlFrom, paramMapFrom, Double.class);
//            String sqlTo = "SELECT balance FROM account WHERE account_number = :muutuja2";
//            Map<String, Object> paramMapTo = new HashMap<>();
//            paramMapTo.put("muutuja2", toAccount);
//            Double balanceTo = jdbcTemplate.queryForObject(sqlTo, paramMapTo, Double.class);
//            balanceFrom = balanceFrom - amount;
//            balanceTo = balanceTo + amount;
//            sqlFrom = "UPDATE account SET balance = :fromBalance WHERE account_number = :muutuja1";
//            sqlTo = "UPDATE account SET balance = :toBalance WHERE account_number = :muutuja2";
//            paramMapFrom.put("fromBalance", balanceFrom);
//            paramMapTo.put("toBalance", balanceTo);
//            jdbcTemplate.update(sqlFrom, paramMapFrom);
//            jdbcTemplate.update(sqlTo, paramMapTo);
//            return "Transfer made";
//        }
//
////        double fromBalance = accountBalanceMap.get(fromAccount);
////        double toBalance = accountBalanceMap.get(toAccount);
////        if (fromBalance < amount) {
////            return "Not enough money. You have " + fromBalance;
////        }
////        fromBalance = fromBalance - amount;
////        toBalance = toBalance + amount;
////        accountBalanceMap.put(fromAccount, fromBalance);
////        accountBalanceMap.put(toAccount, toBalance);
////        return "Taken account has " + fromBalance
////                + " and added account has " + toBalance;
//// }
////        //http://localhost:8080/withdraw/EE/1
////        @GetMapping("withdraw/{accountNr}/{withdraw}")
////        public String withdraw (@PathVariable("accountNr") String accountNr,
////        @PathVariable("withdraw") double withdraw){
////            return Lesson4.withdraw(accountNr, withdraw);
////        }
//
////    @GetMapping("transfer/{from}/{to}/{amount}")
////    public String transfer(@PathVariable("from") String fromAccount,
////                           @PathVariable("to") String toAccount,
////                           @PathVariable("amount") double amount) {
////        return Lesson4.transfer(fromAccount, toAccount, amount);
////    }
//
//
////Siit edasi tuleb Postmani osa harjutamine !!!!!!!!
//
//        //   @PutMapping("createAccount/{accountNr}/{initialBalance}")
//        // public void createAccount(@PathVariable("accountNr") String accountNr, @PathVariable("initialBalance") double initialBalance){
//
//    }
//
//
//}
