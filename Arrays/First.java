
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size");
        size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the data");
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }


        System.out.println("Enter the size");
        size = sc.nextInt();
        int[] arr1 = new int[size];

        for(int i=0 ; i<arr1.length ; i++){
            System.out.println("Enter the data");
            arr1[i] = sc.nextInt();
        }
        for(int i=0 ; i<arr1.length ; i++){
            System.out.println(arr1[i]);
        }

    }
}
