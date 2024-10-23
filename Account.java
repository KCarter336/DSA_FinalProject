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

    // Random account constructor
    public Account(String accountType, int person) {
        this.accountType = accountType;
        this.person = person;
        this.accountNum = this.randAccountNum();
        this.SSN = this.randSSN();
    }
    // Specified account constructor
    public Account(String accountType, int person, double balance) {
        this.accountType = accountType;
        this.person = person;
        this.balance = balance;
    }
    // Loan account constructor
    public Account(String accountType, int person, double costOfHouse) {
        this.accountType = accountType;
        this.person = person;
        this.costOfHouse = costOfHouse;
    }
    private int randSSN() {
        Random Generator = new Random();
        SSN = Generator.nextInt(100000000, 999999999);
        return SSN;
    }
    private int randAccountNum() {
        Random Generator = new Random();
        accountNum = Generator.nextInt(100000000, 999999999);
        return accountNum;
    }
    public double mortgage(double costOfHouse) {
        double mortgage = (costOfHouse - mortgageDownPayment(costOfHouse)) * 1.06;
        return mortgage;
    }
    public double mortgageDownPayment(double costOfHouse){
        double downPayment = costOfHouse * 0.2;
        return downPayment;
    }
    public double monthlyPayment(double mortgage){
        double monthlyPayment = mortgage / (20 * 12);
        return monthlyPayment;
    }

}


