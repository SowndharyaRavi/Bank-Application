import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    //attributes
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        //bank is initializing
        this.rateOfInterest=6.5;
        //UUID-Universally unique identifier-generates random & unique hexadecimal number.
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        balance=balance+amount;
        return "Amount Deposited. \nBalance Available:"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(password,enteredPassword)){
            if(balance<amount){
                return "Insufficient Money. \nBalance Available:"+balance;
            }
            else{
                balance=balance-amount;
                return "Amount Withdrwn:"+amount+ "\nAvailable Balance:"+balance;
            }
        }
        else{
            return "Password is Incorrect";
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
