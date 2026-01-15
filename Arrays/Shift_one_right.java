import java.util.Scanner;

public class Shift_one_right {
    public static void  isShift(int arr[]){
         int start=0;
         

    for(int i=0;i<arr.length-1;i++){
        if(arr[i]!=1){
            start++;
        }
        else if(arr[i]==1 && arr[i+1]!=1){
            int temp = arr[start];
            arr[start] = arr[i+1];
            arr[i+1] = temp;
            start++;
        }
    }
        
    
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the data elements");
            arr[i] = sc.nextInt();
        }
       
        isShift(arr);
         display(arr);

        
    }
    
}
