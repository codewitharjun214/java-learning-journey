// Polymorphism.java
// Demonstrates polymorphism in Java
class AnimalPoly {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends AnimalPoly {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        AnimalPoly a = new Cat();
        a.sound();
    }
}
