public interface BankInterface {

    double checkBalance();
    String depositMoney(int amount);
    String withdrawMoney(int amount,String password);
    double calculateInterest(int year);
}
