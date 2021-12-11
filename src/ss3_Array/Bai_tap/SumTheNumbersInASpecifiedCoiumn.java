package ss3_Array.Bai_tap;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SumTheNumbersInASpecifiedCoiumn {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        n = scanner.nextInt();
        System.out.println("nhap phan tu trong mang");
        m = scanner.nextInt();
        int array[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("array [" + i + "] [" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhap cot ban muon cong");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][a];
        }
        System.out.println(sum);
    }
}