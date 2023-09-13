import java.util.Scanner;

public class Customer {

        private String name;
        private Account savings;
        private  Account loan;

    public Customer(String name, Account savings, Account loan) {
        this.name = name;
        this.savings = savings;
        this.loan = loan;
    }

    public void showAccountStatus(){
        System.out.println(this.name+ " accounts:");
        System.out.println("Saving Account has " +this.savings.getBalance());
        System.out.println("Loan Account has " +this.loan.getBalance());
    }

    public void deposit(double amount){
        this.savings.deposit(amount);
    }

    public double readAmount(Scanner sc){
        System.out.println("Please enter the amount to carry out the transaction");

        return sc.nextDouble();
    }

    public void withdraw(double amount){
        this.savings.withdraw(amount);
    }

    public void transfer(double amount){
        if(this.savings.getBalance() >= amount){
            this.savings.withdraw(amount);
            this.loan.withdraw(amount);
        }

    }




}
