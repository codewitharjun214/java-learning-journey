import java.util.Scanner;


public class OddOREven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (or type 'exit' to quit): ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
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
