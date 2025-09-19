public class methodoverloading {
        static int add(int a,int b){
            return a+b;
        }
        static int add(int x,int y,int z){
           return x+y+z;
        }
        static double add(int a,double b){
            return a+b;
        }
        class Test extends methodOverloading{
        public static void main(String[] args) {
            
            System.out.println(methodOverloading.add(12,12));
            System.out.println(methodOverloading.add(12,12,44));
            System.out.println(methodOverloading.add(12,12.5));
            
            
        }
    }  
    }
