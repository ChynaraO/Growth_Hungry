package JavaIntensive.W4Class.bank;

public class CheckingAccount {
   //Encapsulation, hide the balance from external access
    private double balance;
    public CheckingAccount(double balance){
        this.balance = balance;
    }
    public void deposit (double amount){
        this.balance += amount;
    }
    public void withdrow (double amount){
       if(this.balance >= amount) {
           this.balance -= amount;
       }
    }
    public double getBalance (){
        return balance;
    }

}
