package ss8_Clean_Code_And_Refactoring.Thuc_hanh;

public class Cylinder {

    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getRadius(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static int getRadius(int radius) {
        return radius;
    }

    private static double getBaseArea(int radius) {

        return Math.PI * radius * radius;
    }
}
