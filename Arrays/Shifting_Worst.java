import java.util.Scanner;

public class Shifting_Worst {
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
public static int[] isShift(int arr[]){
    int arr1 =0;
    for(int i =0;i<arr.length;i++){
        if(arr[i]!=1){
            arr[arr1] = arr[i];
            arr1++;
        }
    }
    for(int i=arr1;i<arr.length;i++){
        arr[i]=1;
    }
    return  arr;
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
      int [] arr = init();
        display(arr);
isShift(arr) ;
display(arr);    
 }
    
}
