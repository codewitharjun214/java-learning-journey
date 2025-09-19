// ClassesAndObjects.java
// Demonstrates classes and objects in Java
class Person {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.age = 25;
        p.display();
    }
}
