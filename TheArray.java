/* File: TheArray.java
 * Author: Keegan Carter
 * Purpose:
 */

public class TheArray {

    private Account[] accountList;
    private int startingSize;
    private int currentSize = accountList.length;
    private int numElements;


    public TheArray(int startingSize){
        this.startingSize = startingSize;
        accountList = new Account[startingSize];
    }
    public void countElements(){
        for(int i = 0; i < currentSize; i ++){
            if(accountList[i] != null){
                numElements ++;
            }
        }
    }
    public void increaseSize(){
        int increaseAmt = currentSize * 2;
        Account[] increaseList = Account[increaseAmt];
        for(int i = 0; i < currentSize; i ++){
            increaseList[i] = accountList[i];
        }
        this.accountList = increaseList;
    }
    public void addAccount(Account account){
        this.countElements();
        if(numElements < currentSize){
            accountList[numElements + 1] = account;
        }
        else{
            this.increaseSize();
            accountList[numElements + 1] = account;
        }
    }
    // getters
    public int getCurrentSize(){
        return this.currentSize;
    }
}
