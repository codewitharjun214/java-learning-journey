// InterfaceDemo.java
// Demonstrates interfaces in Java
interface Drawable {
    void draw();
}
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
    }
}
