import java.util.HashMap;


import java.util.Scanner;

public class SimpleBankingSystem {
    private static HashMap<String, Double> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    checkBalance(scanner);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5");
            }
        }
        System.out.println("Exiting the banking system. Thank you!");
        scanner.close();
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists");
        } else {
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            accounts.put(accountNumber, initialBalance);
            System.out.println("Account created successfully");
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            double balance = accounts.get(accountNumber);
            balance += amount;
            accounts.put(accountNumber, balance);
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Account not found");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            double balance = accounts.get(accountNumber);
            if (balance >= amount) {
                balance -= amount;
                accounts.put(accountNumber, balance);
                System.out.println("Withdrawal successful. Updated balance: " + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Account not found");
        }
    }

    private static void checkBalance(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Account not found");
        }
    }
}
