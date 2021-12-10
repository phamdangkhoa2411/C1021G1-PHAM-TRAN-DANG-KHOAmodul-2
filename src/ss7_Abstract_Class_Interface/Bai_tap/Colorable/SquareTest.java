package ss7_Abstract_Class_Interface.Bai_tap.Colorable;

public class SquareTest {
    public static void main(String[] args) {
        Shape1[] shape1 = new Shape1[3];
        shape1[0] = new Square1("black pink",true,3);
        System.out.println(shape1[0].toString());
        shape1[1] = new Square1("gray",false, 20);
        System.out.println(shape1[1].toString());
        shape1[2] = new Square1("white", true,78);
        System.out.println(shape1[2].toString());

        System.out.println(((Square1) shape1[1]).howToColor());
    }
}

