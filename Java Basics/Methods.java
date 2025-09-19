// Methods.java
// Demonstrates methods in Java
public class Methods {
    public static void main(String[] args) {
        greet();
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
    }
    static void greet() {
        System.out.println("Hello from a method!");
    }
    static int add(int a, int b) {
        return a + b;
    }
}
