package ss15_Debug.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println(" moi nhap vao canh 1");
            int  edge1 = scanner.nextInt();
            System.out.println(" moi nhap vao canh 2");
            int  edge2 = scanner.nextInt();
            System.out.println(" moi nhap vao canh 3");
            int  edge3 = scanner.nextInt();
            try {
               Triagle triagle = new Triagle(edge1,edge2,edge3);
                System.out.println(" tam giac hop le");
                break;
            } catch (ExceptionRectangle exceptionRectangle) {
                exceptionRectangle.printStackTrace();
            }
        }

    }
}
