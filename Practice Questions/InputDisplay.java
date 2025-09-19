import java.util.Scanner;

public class InputDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Character: " + charValue);

        
        scanner.close();
    }
}