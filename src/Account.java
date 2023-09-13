import java.util.Scanner;

public class Account {

    private String type;
    private double balance;

    public Account(String type, Scanner sc) {
        this.type = type;
        this.balance = sc.nextDouble();
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;

            System.out.println("Successfully deposited " +amount);
            System.out.println("New Balance " +this.balance);
        }else{
            System.out.println("amount should be greater than 0");
        }
    }

    public void withdraw(double amount){
        if(amount <= balance){
            this.balance = this.balance - amount;

            System.out.println("Successfully withdraw " +amount);
            System.out.println("New Balance " +this.balance);
        }else{
            System.out.println("insufficient funds");
        }
    }
}
