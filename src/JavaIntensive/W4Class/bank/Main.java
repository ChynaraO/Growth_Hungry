package JavaIntensive.W4Class.bank;

public class Main {

    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount(0);

        myAccount.deposit(50);
        myAccount.withdrow(20);
        System.out.println(myAccount.getBalance());
    }

}
