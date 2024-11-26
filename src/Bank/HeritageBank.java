package Bank;

public class HeritageBank {
    public String user;
    public String account;
    public double balance;
    public double total;

    public HeritageBank(String user, String account, double balance) {
        this.user = user;
        this.account = account;
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        total =  balance + amount;
        System.out.println("Deposited amount: "+ amount);
        System.out.println("Balance: "+ total);
    }

    public void withdraw(double amount){
        if (amount <= balance){
            total = this.getBalance() - amount;
            System.out.println("You have withdrawn a sum of: " + amount + " naira");
            System.out.println("Balance: "+ total);
        }
        else {
            System.out.println("Insufficient funds...");
        }
    }

    public void details(){
        System.out.println("NAME: "+ this.getUser());
        System.out.println("ACCOUNT NUMBER: "+ this.getAccount());
        System.out.println("BALANCE: "+ this.getBalance());
    }

}
