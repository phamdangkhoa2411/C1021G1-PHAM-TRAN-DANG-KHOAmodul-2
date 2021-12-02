package ss2_Loop.Bai_tap;
 import java.util.Scanner;
public class Display_20prime_firts{
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        int i = 2;
        while (count < n) {
            if (kiemTraSNT(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean kiemTraSNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
       return true;
    }
}
