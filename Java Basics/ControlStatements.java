// ControlStatements.java
// Demonstrates if-else and switch statements in Java
public class ControlStatements {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other day");
        }
    }
}
