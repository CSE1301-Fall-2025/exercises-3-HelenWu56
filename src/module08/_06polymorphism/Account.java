package module08._06polymorphism;

public class Account 
{
    private String name;
    private double balance; //amount of money in that account

    public Account(String name, double balance)
    {
       this.name = name;
       this.balance = balance; //use constructor to initialize instance variables
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //add public void deposit(double howMuch)
    public void deposit(double amount){
        this.balance += amount;
    }

    //add public double withdraw
    public double withDraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
            return amount;
        } else{
            this.balance = 0;
            return this.balance;
        }
    }

    public static void main(String[] args)
    {
        
    }
}
