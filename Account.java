///* File: Account.java
// * Author: Keegan Carter
// * Purpose:
// */
//
//import java.util.Random;
//
//public class Account {
//
//    private String lastName;
//    private String firstName;
//    private String sex;
//    private int DOB;
//    private int SSN;
//    private int accountNum;
//    private String accountType;
//    private int person;
//    private double balance;
//    private double costOfHouse;
//
//    // Random account constructor
//    public Account(String accountType, int person) {
//        this.accountType = accountType;
//        this.person = person;
//    }
//
//    // Specified account constructor
//    public Account(String accountType, int person, double balance) {
//        private void setBalance(balance);
//        this.balance = balance;
//    }
//
//    // Loan account constructor
//    public Account (String accountType,int person, double costOfHouse){
//        this.accountType = accountType;
//        this.person = person;
//        this.costOfHouse = costOfHouse;
//    }
//
//
//    private int getSSN () {
//        Random Generator = new Random();
//        SSN = Generator.nextInt(100000000, 999999999);
//        return SSN;
//    }
//
//    private int getAccountNum () {
//        Random Generator = new Random();
//        accountNum = Generator.nextInt(100000000, 999999999);
//        return accountNum;
//    }
//
//
//
//
//// Methods related to loan accounts
//        Public double mortgage -input cost of house
//        Return:
//        cost with interest
//        Public double mortgageDownPayment -input cost with interest
//        Return:
//        down payment
//        Public double monthlyMortgagePayment -input cost with interest
//        Return:
//        monthly payment
//
//
//    }
//}