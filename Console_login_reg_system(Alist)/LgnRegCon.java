
package javaapplication26;

import java.util.*;

public class LgnRegCon {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SR> al = new ArrayList<SR>();
        
        boolean run=true;
        while(run==true){
            String name, email, password, phoneNumber;
            System.out.println("1.Registration 2.Login 3.See info 4.Exit");
            int choice;
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Name:");
                    name=sc.next();
                    for(int i=0; i<al.size(); i++){
                        while(al.get(i).getName().equals(name)){
                            System.out.println("Acc exists with this name!");
                            System.out.println("Enter again:");
                            name=sc.next();
                        }
                    }
                    
                    System.out.println("Email:");
                    email=sc.next();
                    email=email.replace(" ","");
                    for(int i=0; i<al.size(); i++){
                        while(!(email.matches(".*[@].*")) || !(email.matches(".*[.].*")) || email.matches(".*[;^%$#!()-+,>?<//\\_*`~].*") || al.get(i).getEmail().equals(email)){
                               
                            if(al.get(i).getEmail().equals(email)){
                                System.out.println("Acc already exits with this email!\nEnter again:");
                                email=sc.next();
                                email=email.replace(" ","");
                            }
                            else{
                                System.out.println("Invalid email\nEnter again:");
                                email=sc.next();
                                email=email.replace(" ","");
                            }
                        }
                    }
                    
                    System.out.println("Phone number:");
                    phoneNumber=sc.next();
                    for(int i=0; i<al.size(); i++){
                        while(!(phoneNumber.matches("[0-9]+")) || al.get(i).getPhoneNumber().equals(phoneNumber)){
                            if(al.get(i).getPhoneNumber().equals(phoneNumber)){
                                System.out.println("Acc already exits with this phone number!\nEnter again:");
                                phoneNumber=sc.next();
                            }
                            else{
                                System.out.println("Invalid phone\nEnter again:");
                                phoneNumber=sc.next();
                            }
                        }
                    }
                    System.out.println("Password:");
                    password=sc.next();
                    password=password.trim();
                    while(password.length()<6){
                        System.out.println("Password length must be grater than 5 enter again:");
                        password=sc.next();
                    }

                    try{
                        al.add(new SR(name, email, password, phoneNumber));
                        System.out.println("Registration successful!");
                    }
                    catch(Exception e){
                        System.out.println("Registration failed!");
                    }

                    break;
                case 2:
                    System.out.println("Email or Phone:");
                    String ep=sc.next();
                    ep=ep.replace(" ","");
                    
                    System.out.println("Password:");
                    password=sc.next();
                    password=password.trim();

                    try{
                        SL obj = new SL(al, password, ep);
                        System.out.println(obj.toString(obj.validityCheck()));
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }

                    break;
                case 3:
                    //To sort the list by name/anything
                    //Collections.sort(al, new ByName());
                    if(!(al.isEmpty())){
                        for(SR list:al){
                            System.out.println(list.getName()+" "+list.getPhoneNumber()+" "+list.getEmail()+" "+list.getPassword());
                        }
                    }
                    else{
                        System.out.println("List empty!");
                    }
                    break;
                case 4:
                    run=false;
                    break;

            }
            
        }

       
    }
    
}
