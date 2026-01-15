import java.util.Scanner;
public class Array_Rotation {
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
+
    public static void Reverse(int arr[] , int start , int end){
        
        
        
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }

    public static void clockwise(int[] arr,int position){
        Reverse(arr, 0, arr.length-1);
        Reverse(arr, 0, position-1);
        Reverse(arr, position, arr.length-1);
    }

    public static void Anticlockwise(int[] arr , int position){
        Reverse(arr, 0, position-1);
        Reverse(arr, position, arr.length-1);
        Reverse(arr, 0, arr.length-1);
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

    public static void main(String[] args){
       int [] arr = init();
       
       display(arr);
    }


    
    
}
