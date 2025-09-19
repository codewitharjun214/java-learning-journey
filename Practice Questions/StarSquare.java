public class StarSquare {
    public static void main(String[] args) {
        int size = 5; // Change this to the desired size of the square
        printStarSquare(size);
    }

    /**
     * Prints a square of stars of the given size.
     * 
     * @param size The size of the square.
     */
    public static void printStarSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}