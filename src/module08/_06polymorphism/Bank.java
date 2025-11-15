package module08._06polymorphism;

public class Bank {

    //array of accounts
    //private SavingsAccount[] saving; // not good
    private Account[] account; //a generic type "Account" to keep both saving and checking account

    public Bank(){

    }

    //Actions: create some checking and saving account for some users
    //deposit money to all of my accounts
    //print the owner name of the account
    public static void main(String[] args){
        Account c = new CheckingAccount("Sara", 1000, 10);
        Account s = new SavingsAccount("Saba", 1000, 2);
        Account[] account = {c,s};
        for(int i = 0; i < account.length; i++){
            account[i].deposit(10);
        }
    }

}
