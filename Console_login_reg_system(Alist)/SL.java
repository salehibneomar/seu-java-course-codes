
package javaapplication26;

import java.util.ArrayList;

public class SL {
    private ArrayList<SR> lal = new ArrayList<SR>();
    private String pwd, ep, msg, user;
    private boolean valid;
    public SL(ArrayList<SR> l, String pwd, String ep) {
        this.lal.addAll(l);
        this.pwd=pwd;
        this.ep=ep;
    }
    
    public boolean  validityCheck(){
        for(int i=0; i<lal.size(); i++){
            if(lal.get(i).getPassword().equals(pwd) && (lal.get(i).getEmail().equals(ep) || lal.get(i).getPhoneNumber().equals(ep))){
                valid = true;
                user=lal.get(i).getName();
                break;
            }
            else{
                valid = false;
            }
        }
        
        return valid;
    }
    
    public String toString(boolean valid){
        if(valid==true){
            msg = "Welcome "+user;
        }
        else{
             msg = "Sorry you don't have id";
        }
        return msg;
    }
    
}
