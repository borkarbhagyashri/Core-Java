
import java.util.Scanner;
public class Arrays_sum {
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int [size];


     for(int i=0 ; i<arr.length ; i++){
        System.out.println("Enter the data");
        arr[i] = sc.nextInt();
        
    }
    return arr;
}
public static void display(int[] arr){
        System.out.println("Array Element Are");
        System.out.print("[");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] );
            if(arr.length-1!=i)
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();

    }
    public static void displaySum(int[] arr , int sum){
        for(int i=0 ; i<arr.length ; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);

    }

    public static void displayEvenSum(int[] arr , int sum){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                sum = sum+arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void displayOddSum(int[] arr , int sum){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2!=0){
                sum = sum+arr[i];
            }
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
        
        int[] arr = init();
        displaySum(arr,0);
        displayEvenSum(arr, 0);
        displayOddSum(arr, 0);
        display(arr);



        
    
    }
   
    
}
