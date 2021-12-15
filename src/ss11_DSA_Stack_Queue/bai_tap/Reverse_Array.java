package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Array {
    public static void Reverse_Array (){
        Stack<String> arrayNumber=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập vào các index trong mảng");
        String arr=scanner.nextLine();
        for(int i=0;i<arr.length();i++){
            arrayNumber.push(arr.charAt(i)+"");
        }
        System.out.println(" mảng sau khi đảo ngược các index ");
        for(int i=0;i<arr.length();i++){
            System.out.print(arrayNumber.pop());
        }
    }

    public static void main(String[] args) {
        Reverse_Array();

    }
}
