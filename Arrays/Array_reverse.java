import java.util.Scanner;
public class Array_reverse {
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
    public static void Reverse(int arr[]){
        System.out.println("Enter tne data");
        int start = 0;
        int end = arr.length-1;
        for(int i=0 ; i<end ; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }
   
    
    public static void main(String[] args) {
        
        int[] arr = init();
        display(arr);
        Reverse(arr);
        display(arr);



        
    }

    
    
}
