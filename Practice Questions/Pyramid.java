public class Pyramid {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int rows = 4; // number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int k=1; k,=i; k++){
                System.out.println("*");
                
            }
            System.out.println();
        }
    }
}