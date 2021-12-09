package ss7_Abstract_Class_Interface.Bai_tap.Resizeable;

public class Square_Circle_Rectangle_Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(10,"yellow",true);
        shapes[1] = new Circle(10,"Red");
        shapes[2] = new Rectangle(5,10,"Purple",true);

        System.out.println("Trước khi resize");
        for (Shape shape: shapes){
            System.out.println(shape + "\n");
        }

        System.out.println("Sau khi resize");
        for (Shape shape: shapes){
            shape.resize(Math.random()*100);
            System.out.println(shape+"\n");
        }
    }
}

