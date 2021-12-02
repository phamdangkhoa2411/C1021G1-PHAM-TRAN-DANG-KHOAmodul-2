package ss2_Loop.Bai_tap;

import java.util.Scanner;

public class Display_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lenght: ");
        int lenght = sc.nextInt();
        System.out.println("Enter a width: ");
        int width = sc.nextInt();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= lenght; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        for (int i = 1; i <= lenght; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int i = 1; i <= lenght; i++) {
            for (int j = 1; j <= lenght - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
