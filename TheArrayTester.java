/* File: TheArrayTester.java
 * Author: Keegan Carter
 * Purpose:
 */

public class TheArrayTester {

    public static void main(String[] args){

        Account one = new Account("c", 1, "Washington");
        Account two = new Account("c", 1, "Adams");
        Account three = new Account("c", 1, "Jefferson");
        Account four = new Account("c", 1, "Madison");
        Account five = new Account("c", 1, "Monroe");
        Account six = new Account("c", 1, "Jackson");
        Account seven = new Account("c", 1, "VanBuren");


        TheArray myArray = new TheArray();
        myArray.addAccount(one);
        System.out.println(myArray.getCurrentSize());
        myArray.addAccount(two);
        System.out.println(myArray.getCurrentSize());
        myArray.addAccount(three);
        System.out.println(myArray.getCurrentSize());
        myArray.addAccount(four);
        System.out.println(myArray.getCurrentSize());
        myArray.addAccount(five);
        System.out.println(myArray.getCurrentSize());
        myArray.addAccount(six);
        System.out.println(myArray.getCurrentSize());
        myArray.addAccount(seven);
        System.out.println(myArray.getCurrentSize());

    }

}
