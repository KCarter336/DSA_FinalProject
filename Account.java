/* File: Account.java
 * Author: Keegan Carter
 * Purpose:
 */

import java.util.Random;

public class Account {

    private String lastName;
    private String firstName;
    private String sex;
    private int DOB;
    private int SSN;
    private int accountNum;
    private String accountType;
    private int person;
    private double balance;
    private double costOfHouse;

    public Account(String accountType, int person){
        this.accountType = accountType;
        this.person = person;

        private int getSSN() {
            Random Generator = new Random();
            SSN = Generator.nextInt(100000000, 999999999)
            return SSN}

        private int getAccountNum() {
            Random Generator = new Random();
            accountNum = Generator.nextInt(100000000, 999999999)
            return accountNum}
    }
    public Account(String accountType, int person, double balance){

        Private void setBalance(double balance){
            This.balance = balance;

        }

// Loan account constructor
        Public Account(String accountType, int person, double costOfHouse){
            This.accountType = accountType
            This.person = person
            This.costOfHouse = costOfHouse
        }

// Methods related to loan accounts
        Public double mortgage - input cost of house
        Return: cost with interest
        Public double mortgageDownPayment - input cost with interest
        Return: down payment
        Public double monthlyMortgagePayment - input cost with interest
        Return: monthly payment




    }
