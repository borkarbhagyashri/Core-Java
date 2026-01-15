import java.util.Scanner;

public class MERGE_SORT {
    public static Scanner sc = new Scanner(System.in);
      public static int [] init(){
        int size;
        System.out.println("Enter the size os Array");
        size = sc.nextInt();
        int arr [] = new int[size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the Data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static  void merge_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int mid = arr.length/2;
            int arr1 = new int[mid];

        }
    }
    
}
