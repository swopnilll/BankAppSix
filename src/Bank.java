import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Bank of NSW");
        System.out.println("Please enter the amount you want to deposit while opening your account");

        Account customerSavingsAccount = new Account("Savings", sc);

        System.out.println("Please enter the mock loan amount ");

        Account customerLoanAccount = new Account("Loan", sc);

        Customer customer = new Customer("John Smith", customerSavingsAccount,customerLoanAccount );

        char operation;



       do {
           System.out.println("Customer menu (d/w/t/s/t): ");
           operation = sc.next().charAt(0);

           switch (operation) {
               case 'd' -> {
                   customer.deposit(customer.readAmount(sc));
               }
               case 'w' -> {
                   customer.withdraw(customer.readAmount(sc));
               }
               case 's' -> {
                   customer.showAccountStatus();
               }
               case 't' -> {
                   customer.transfer(customer.readAmount(sc));
               }
           }

       } while ( operation != 'x' );







//        customer.showAccountStatus();

    }
}