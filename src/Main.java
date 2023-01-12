import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name,Password,Balance to create an Account");

        //create user
        String name= sc.nextLine();
        String password=sc.nextLine();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);

        //add amount
        System.out.println("Enter amount to be deposited:");
        int amt=sc.nextInt();
        String msg=user.depositMoney(amt);
        System.out.println(msg);

        //withdraw money
        System.out.println("Enter amount to withdraw:");
        int money=sc.nextInt();
        System.out.println("Enter your Password:");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //calculate rate of interest
        System.out.println("Enter the No of years:");
        int years=sc.nextInt();
        System.out.println(user.calculateInterest(years));
    }
}