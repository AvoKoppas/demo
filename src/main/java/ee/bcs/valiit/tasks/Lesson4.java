package ee.bcs.valiit.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson4 {
    // Store account nr as a key and account balance as value
    private static Map<String, Double> accountBalanceMap = new HashMap<String, Double>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            } else if (line.equalsIgnoreCase("Create account ")) {
                System.out.println("Please enter your account nr:");
                String accountNr = scanner.nextLine();
                System.out.println("Thank you. Your account nr is " + accountNr + ". And balance is 0.0");
                accountBalanceMap.put(accountNr, 0.0);
            } else if (line.equalsIgnoreCase("getBalance")) {
                System.out.println("Enter the account number you wish to check:");
                String accountNr = scanner.nextLine();
                double balance = accountBalanceMap.get(accountNr);
                System.out.println("Your account " + accountNr + " has " + balance + "amount of money");
            } else if (line.equalsIgnoreCase("depositMoney")) {
                System.out.println("Please enter your account number:");
                String accountNr = scanner.nextLine();
                System.out.println("Please enter the amount you wish to deposit: ");
                if (scanner.nextDouble() < 0) {
                    System.out.println("Invalid amount. Negative was entered");
                } else {
                    double deposit = scanner.nextDouble();
                    double balance = accountBalanceMap.get(accountNr);
                    balance = accountBalanceMap.get(accountNr) + deposit;
                }
            } else if (line.equalsIgnoreCase("withdrawMoney")) {
                System.out.println("Please enter your account number:");
                String accountNr = scanner.nextLine();
                System.out.println("Please enter the amount you wish to deposit: ");
                double withdraw = scanner.nextDouble();
                if (withdraw < 0) {
                    System.out.println("Invalid amount. Negative was entered");
                } else if (withdraw > accountBalanceMap.get(accountNr)) {
                    System.out.println("Not enough money on account. Maximum withdraw amount is "
                            + accountBalanceMap.get(accountNr));
                }
                double balance = accountBalanceMap.get(accountNr);
                balance = balance - withdraw;
            } else if (line.equalsIgnoreCase("transfer")) {
                System.out.println("Please choose account you want to transfer from:");
                String transferFrom = scanner.nextLine();
                System.out.println("Now choose the account you want to transfer to:");
                String transferTo = scanner.nextLine();
                if ()
            }
        }
    }
    // TODO 1

    // Add command: "createAccount ${accountNr}"
    // this has to store accountNr with 0 balance
    // TODO 2
    // Add command: "getBalance ${accountNr}"
    // this has to display account balance of specific acount
}

// TODO 3
// Add command: "depositMoney ${accountNr} ${amount}
// this has to add specified amount of money to account
// You have to check that amount is positive number
// TODO 4
// Add command: "withdrawMoney ${accountNr} ${amount}
// This has to remove specified amount of money from account
// You have to check that amount is positive number
// You may not allow this transaction if account balance would become negative
// TODO 5
// Add command: "transfer ${fromAccount} ${toAccount} ${amount}
// This has to remove specified amount from fromAccount and add it to toAccount
// Your application needs to check that toAccount is positive
// And from account has enough money to do that transaction


//    {
//            System.out.println("Unknown command");
//            }
//            }
//


