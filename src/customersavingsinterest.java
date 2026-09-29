//THE PROGRAM CALCULATES THE CUSTOMERS SAVINGS INTEREST
import java.util.Scanner;

public class customersavingsinterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Collect customer details
        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter deposit amount: ");
        double deposit = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = input.nextDouble();

        double totalinterest = deposit * (rate / 100);
        double finalBalance = deposit + totalinterest;

        System.out.println("\n========== SAVINGS SUMMARY ==========");
        System.out.println("Customer Name: " + name);
        System.out.println("Original Deposit: " + deposit);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Calculated Interest: " + totalinterest);
        System.out.println("Final Balance: " + finalBalance);

        input.close();
    }
}
