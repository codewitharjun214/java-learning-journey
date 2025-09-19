import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your income (or type 'exit' to quit): ");
            if (sc.hasNextDouble()) {
                double income = sc.nextDouble();
                double tax = 0;
                if (income <= 250000) {
                    tax = 0;
                } else if (income <= 500000) {
                    tax = 0.05 * (income - 250000);
                } else if (income <= 1000000) {
                    tax = 12500 + 0.20 * (income - 500000);
                } else {
                    tax = 112500 + 0.30 * (income - 1000000);
                }
                System.out.println("Your income tax is: " + tax);
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'exit' to quit.");
                }
            }
        }
        sc.close();
    }
    
}
