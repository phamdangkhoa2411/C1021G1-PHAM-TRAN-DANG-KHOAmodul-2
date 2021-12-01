package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Change_money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào giá trị USD : ");
        usd = sc.nextDouble();
        double change = usd * vnd;
        System.out.println(change);
    }
}
