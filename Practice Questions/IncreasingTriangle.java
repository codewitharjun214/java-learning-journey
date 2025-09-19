public class IncreasingTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change this to print more or fewer rows
        printIncreasingTriangle(rows);
    }

    /**
     * Prints an increasing triangle pattern of numbers.
     * 
     * @param rows The number of rows in the triangle.
     */
    public static void printIncreasingTriangle(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}