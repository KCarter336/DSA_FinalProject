/* File: Driver.java
 * Author: Keegan Carter
 * Purpose:
 */

import java.util.Scanner;

public class Driver {

    public static void main(String[] args){

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
                    // print all account.name and account.number
                case 2:
                    // require input of account holder's last name
                    // that account.deposit
                case 3:
                    // require input of account holder's last name
                    // that account.withdrawal
                    // needs a method to notify user if their balance is insufficient
                        // ' "Sorry, your balance is less " + balance. '
                case 4:
                    // all accounts.addInterest
                case 5:
                    // print total number of accounts
                        // number of savings accounts
                        // number of checking accounts
                        // number of student accounts
                        // number of employee accounts

            }

        }

    }

}
