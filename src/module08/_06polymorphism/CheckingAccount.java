package module08._06polymorphism;

public class CheckingAccount extends Account{
    private double overdraftFee; //bank pass a check(charge a fee) if your account is negative number

    public CheckingAccount(String name, double balance, double overdraftFee){
        
        //constuctor: super call
        super(name, balance); 
        this.overdraftFee = overdraftFee; //initiate IV
    }

    //overdraft let us to get a bit more money and the balance gets negative
    //we need to override the Accounts withdraw
    @Override
    public double withDraw(double amount){

        //check if the amount is less than balance + 50
        //if is, set the
        if(amount <= this.getBalance() + 50){
            this.setBalance(this.getBalance() - amount - overdraftFee);
            return amount;
        } else{
            this.setBalance(0);
            return this.getBalance();
        }
        //else set balance to 0 and return amount
    }

}
