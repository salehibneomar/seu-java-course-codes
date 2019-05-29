
package bankingsystem;

public class Accounts {
    private Banks bank;
    private String name, address;
    private int id;
    private double balance;

    public Accounts(String name, String address, int id, double balance, Banks bank) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.balance = balance;
        this.bank=bank;
    }
    
    public void Deposit(double amount){
        balance=balance+amount;
        System.out.println("Yo! bruh your amount just increased can we waste some more money?");
    }
    
    public void Widthrow(double amount){
        if(amount>balance){
            System.out.println("Opps not enough money bruh!");
        }
        else{
            balance=balance-amount;
            System.out.println("Successfully widthrowed bruh!");
        }
    }
    
    public void TransferAmount(Accounts account, double amount){
        if(amount>this.balance){
            System.out.println("Hey get lost I can't give you this much money!");
        }
        else{
            this.balance=this.balance-amount;
            account.balance=account.balance+amount;
            System.out.println("Hey? you just robbed my balance!");
        }
    }

    void changeBank(Banks bank){
        this.bank=bank;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getBName() {
        return bank.getBankName();
    }


    
    
}
