/* File: Driver.java
 * Author: Keegan Carter
 * Purpose:
 */

import java.util.Scanner;

public class Driver {

    public static void main(String[] args){

        // Variables for deposit and withdrawal. They're up here so they can be reused
        String name;
        boolean proceed = false;
        int selectedAccount;

        Account[] accountList = new Account[5];

        Account a1 = new Account("C", 1, "Washington");
        Account a2 = new Account("S", 1, "Adams");
        Account a3 = new Account("C", 2, "Jefferson");
        Account a4 = new Account("S", 3, "Madison");
        Account a5 = new Account("C", 3, "Monroe");

        accountList[0] = a1;
        accountList[1] = a2;
        accountList[2] = a3;
        accountList[3] = a4;
        accountList[4] = a5;

        boolean go = true;

        while (go){
            System.out.println(
                 "Menu: " +
                         "\n Display all accounts (1) " +
                         "\n Deposit to an account (2) " +
                         "\n Withdrawal from an account (3) " +
                         "\n Add interest to all accounts (4)" +
                         "\n Total number of accounts (5)" +
                         "\n Exit (6)" +
                         "\n Enter selection here: "
            );
            Scanner cin = new Scanner(System.in);
            int selection = cin.nextInt();
            cin.nextLine();
            switch (selection){
                case 1:
                    for(int i = 0; i < accountList.length; i++) {
                        System.out.println(accountList[i].getAccountNum());
                    }
                    break;
                case 2:
                    // require input of account holder's last name
                    // that account.deposit
                    System.out.println("Input last name: ");
                    name = cin.nextLine();
                    proceed = false;
                    selectedAccount = 0;
                    for(int i = 0; i < accountList.length; i++) {
                        if(name.equals(accountList[i].getLastName())){
                            proceed = true;
                            selectedAccount = i;
                        }
                    }
                    if(proceed){
                        System.out.println("Input deposit amount: ");
                        double amt = cin.nextDouble();
                        accountList[selectedAccount].deposit(amt);
                    }
                    else{
                        System.out.println("We don't have an account in that name");
                    }
                    break;
                case 3:
                    // require input of account holder's last name
                    // that account.withdrawal
                    // needs a method to notify user if their balance is insufficient
                        // ' "Sorry, your balance is less " + balance. '
                    System.out.println("Input last name: ");
                    name = cin.nextLine();
                    proceed = false;
                    selectedAccount = 0;
                    for(int i = 0; i < accountList.length; i++) {
                        if(name.equals(accountList[i].getLastName())){
                            proceed = true;
                            selectedAccount = i;
                        }
                    }
                    if(proceed){
                        System.out.println("Input withdrawal amount: ");
                        double amt = cin.nextDouble();
                        if (accountList[selectedAccount].getBalance() > amt) {
                            accountList[selectedAccount].withdrawal(amt);
                        }
                        else{
                            System.out.printf("Sorry, you don't have enough funds. Balance is: %f \n", accountList[selectedAccount].getBalance());
                        }
                    }
                    else{
                        System.out.println("We don't have an account in that name");
                    }
                    break;
                case 4:
                    // all accounts.addInterest
                    for(int i = 0; i < accountList.length; i++) {
                        accountList[i].addInterest(0.5);
                    }
                    System.out.println("Interest added to all accounts");
                    break;
                case 5:
                    // print total number of accounts
                        // number of savings accounts
                        // number of checking accounts
                        // number of student accounts
                        // number of employee accounts
                    int numSavings = 0;
                    int numChecking = 0;
                    int numStudent = 0;
                    int numEmployee = 0;
                    for(int i = 0; i < accountList.length; i++) {
                        String type = accountList[i].getAccountType();
                        int person = accountList[i].getPerson();
                        if(type.equals("S")){
                            numSavings ++;
                        }
                        else if(type.equals("C")){
                            numChecking ++;
                        }
                        if (person == 1){
                            numStudent ++;
                        }
                        else if (person == 2 || person == 3){
                            numEmployee ++;
                        }
                    }
                    System.out.printf("Savings: %d, Checking: %d, Student: %d, Employee: %d \n", numChecking, numSavings, numStudent, numEmployee);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
