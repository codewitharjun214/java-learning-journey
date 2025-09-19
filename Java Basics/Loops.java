// Loops.java
// Demonstrates for, while, and do-while loops in Java
public class Loops {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("While loop:");
        int j = 0;
        while (j < 3) {
            System.out.println(j);
            j++;
        }
        System.out.println("Do-while loop:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 3);
    }
}
