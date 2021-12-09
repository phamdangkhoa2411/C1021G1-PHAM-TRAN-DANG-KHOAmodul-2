package ss6_Inheritance.Bai_tap;

import ss7_Abstract_Class_Interface.Bai_tap.Resizeable.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        System.out.println(circle);

        System.out.println("color:" + circle.getColor());
        System.out.println("Area: " + circle.getArea());
    }
}
