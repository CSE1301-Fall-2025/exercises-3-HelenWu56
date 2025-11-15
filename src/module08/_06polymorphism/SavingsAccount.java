package module08._06polymorphism;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate){
        
        //super call
        super(name, balance); //can't pass interestRate since superclass only need 2 parameters
        
        //set the interest rate
        this.interestRate = interestRate;

    }
    
    //add the compoundInterest method
    public void compoundInterest(double interestRate){

        //need to setBalance to current balance * (1 + interestRate)
        //this.balance = this balance * (1 + interestRate); //balance is not IV of SavingsAccount class
        
        this.setBalance(this.getBalance() * (1 + interestRate)); //amount of money after interet
        //use getter method to access private IV in superclass, setter method to set values

    }
}
