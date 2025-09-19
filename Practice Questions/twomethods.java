class twomethods1 {
    void showData1()
    {
        System.out.println("this is first method");
    }  
  
void showData2(){
System.out.println("this is second method");
}
}
class twomethods{
public static void main(String[] args) {
    twomethods1 obj=new twomethods1();
    obj.showData1();
    obj.showData2();
}  
}
