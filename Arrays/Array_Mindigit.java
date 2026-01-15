import java.util.Scanner;
public class Array_Mindigit {
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
    public static void Mindigit(int arr[]){
        int min = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.print(min);
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
        Mindigit(arr);
        display(arr);
    }
}

