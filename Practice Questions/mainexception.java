public class mainexception {
    public static void main(String[]args){
   try {
        int dividebyzero=5/3;
        System.out.println("rest of the code in try block");
 }
     catch(ArithmeticException e){

        System.out.println("arithmatic exception"+e.getMessage());
     }
        System.out.println("Cannot divide by zero ....");
}    }
