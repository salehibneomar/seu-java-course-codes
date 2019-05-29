
package javalabclass1;

import java.util.Scanner;

public class JavaLabClass1 {

    public static void main(String[] args) {
        int option, tickets, price;
        System.out.println("Ticket counter [One person can buy at most 4 tickets]");
        System.out.println("1.Adult/(500 BDT) 2.Teenager/(200 BDT)");
        System.out.println("Enter your option: ");
        Scanner obj = new Scanner(System.in);
        option = obj.nextInt();
        if(option == 1){
            price = 500;
            System.out.println("You've selected adult option, how many tickets do you want?");
            Scanner sc = new Scanner(System.in);
            tickets = sc.nextInt(); 
            
            switch(tickets){
                case 1:
                    System.out.println("Pay "+price+" 500 BDT, Thanks!");
                    break;
                case 2:
                    System.out.println("Pay "+price*2+" BDT, Thanks!");
                    break;
                case 3:
                    System.out.println("Pay "+price*3+" BDT, Thanks!");
                    break;
                case 4:
                    System.out.println("Pay "+price*4+" BDT, Thanks!");
                    break;
                default:
                    System.out.println("More than 4 is not allowed!");
            }
        }
        else if(option == 2){
            price = 200;
            System.out.println("You've selected teenager option, how many tickets do you want?");
            Scanner sc = new Scanner(System.in);
            tickets = sc.nextInt();

            switch(tickets){
                case 1:
                    System.out.println("Pay "+price+" 500 BDT, Thanks!");
                    break;
                case 2:
                    System.out.println("Pay "+price*2+" BDT, Thanks!");
                    break;
                case 3:
                    System.out.println("Pay "+price*3+" BDT, Thanks!");
                    break;
                case 4:
                    System.out.println("Pay "+price*4+" BDT, Thanks!");
                    break;
                default:
                    System.out.println("More than 4 is not allowed");
            }
        }
        else{
            System.out.println("Invalid option!");
        }
        
    }
    
}
