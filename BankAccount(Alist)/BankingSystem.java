
package bankingsystem;

public class BankingSystem {

    public static void main(String[] args) {
        
        Banks list[] = new Banks[3];
        list[0] = new Banks("Dhaka Bank", "Dhaka, Banani-1213", 1);
        list[1] = new Banks("City Bank", "Dhaka, Gulshan-2", 3);
        list[2] = new Banks("Dhaka Bank", "Dhaka, Badda", 5);
        
        Accounts ac1 = new Accounts("Saleh", "Badda", 123, 1000, list[0]);
        Accounts ac2 = new Accounts("Rakib", "Banani", 112, 1000, list[2]);
        ac1.Deposit(500);
        System.out.println(ac1.getBalance());
        ac1.Widthrow(700);
        ac1.TransferAmount(ac2, 500);
        System.out.println(ac1.getBalance());
        System.out.println(ac1.getBName());
        ac1.changeBank(list[1]);
        System.out.println(ac1.getBName());
        
        
    }
    
}
