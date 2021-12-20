package ss14_Sorting_Algorithms.bai_tap;

public class InsertionSort {
    public static void sort(int [] arr){
        int pos;
        int x;
        for( int i=1; i<arr.length;i++){
            x=arr[i];
            pos=i;
            while (pos>0 && x<arr[pos-1]){
                arr[pos]=arr[pos-1];
                pos--;

            }
            arr[pos]=x;

        }
        for(int a: arr){
            System.out.print(a+"  ");
        }
    }

    public static void main(String[] args) {
        int [] arr1={1,2,3,7,2,4,77,6};
        sort(arr1);

    }
}
