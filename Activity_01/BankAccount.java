package Activity_01;

public class BankAccount {
    public String holderName;
    public String accNo;
    public String bank;
    public String branch;
    private double accBalance;

    public BankAccount(String name,String accno, String bank, String branch){
        this.holderName = name;
        this.accNo = accno;
        this.bank = bank;
        this.branch = branch;
    }

    public void setBalance(double balance){
        this.accBalance = balance;
    }

    public double showBalance(){
        return this.accBalance;
    }
}

 