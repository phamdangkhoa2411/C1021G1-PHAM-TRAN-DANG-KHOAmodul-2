package ss6_Inheritance.Bai_tap;

import ss7_Abstract_Class_Interface.Bai_tap.Resizeable.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*super.getRadius()*super.getRadius()*height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" +getVolume()+
                '}';
    }
}
