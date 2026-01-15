import java.util.Scanner;
public class Array_Maxdigit {
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0 ; i<arr.length ; i++){
           System.out.println("Enter the Data");
           arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void Maxdigit(int arr[]){
        int max = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.print(max);
        System.out.println();

    }
    public static void display(int[] arr){
        System.out.println("Array Elements are");
        System.out.print("[");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] );
            if(arr.length-1!=i)
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = init();
        Maxdigit(arr);
        display(arr);
    }
}
