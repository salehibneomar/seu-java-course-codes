
package bankingsystem;

public class Banks {
    
    private String bankName, location;
    private int branchNO;

    public Banks(String bankName, String location, int branchNO) {
        this.bankName = bankName;
        this.location = location;
        this.branchNO = branchNO;
    }

    public String getBankName() {
        return bankName;
    }

    public String getLocation() {
        return location;
    }

    public int getBranchNO() {
        return branchNO;
    }
    
    
    
}
