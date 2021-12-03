package ss3_Array.Bai_tap;

import java.util.Scanner;

public class DeleteElementsFromArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] delete;
        int n = 0;
        do {
            System.out.println("nhập kích thước mảng : ");
            n = scanner.nextInt();
        } while (n < 0);

        delete = new int[n];
        for (int i = 0; i < delete.length; i++) {
            System.out.println("nhập thứ tự phần tử  " + i);
            delete[i] = scanner.nextInt();
        }
        for (int i = 0; i < delete.length; i++) {
            System.out.print(delete[i]);
        }
        System.out.println("nhập phần tử cần xóa");
        int search = scanner.nextInt();
        for (int i = 0; i < delete.length; i++) {
            if (search == delete[i]) {
                for (int j = i; j < delete.length - 1; j++) {
                    delete[j] = delete[j + 1];
                }
                delete[delete.length - 1] = 0;
            }

        }
        for (int i = 0; i < delete.length; i++) {
            System.out.println(delete[i]);
        }
    }
}
