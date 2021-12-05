package ss3_Array.Bai_tap;

import java.util.Scanner;

public class AddElementsArray {
    public static void main(String[] args) {
        int x;
        int index;
        int array[] = {1, 2, 3, 5, 7, 9, 0, 0,0,0};
        int newA[] = new int[array.length + 1];
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap phan tu muon chen:");
        x = scanner.nextInt();
        System.out.print("nhap vi tri chen:");
        index = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            newA[i] = array[i];
        }

        for (int i = newA.length - 1; i > index; i--) {
            newA[i] = newA[i - 1];
        }

        newA[index] = x;
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + newA[i]);
        }


    }
}
