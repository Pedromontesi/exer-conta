package Entities;

public class Info {

    public static double TAX = 5.00;
    private int accountNumber;
    private String accountName;
    private double deposit;


    public Info(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;

    }

        public Info(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getDeposit() {
        return deposit;
    }


    public void deposit(double amount) {
        deposit += amount;
    }


    public void withdraw(double amount) {
        deposit -= amount + TAX;
    }

    public String toString(){
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountName
                + ", Balance: $ "
                + String.format("%.2f", deposit);
    }

}