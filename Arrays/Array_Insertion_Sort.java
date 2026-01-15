import java.util.Scanner;
public class Array_Insertion_Sort {
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
        int size;
        System.out.println("Enter the size of Element");
        size = sc.nextInt();
        int arr [] = new int[size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter the Data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static void Insertion_Sort(int [] arr){
        for(int i=1 ; i<arr.length ; i++){
            arr[]
        }
    }

    public static void display(int [] arr){
        System.out.println("Array Elements Are");
        System.out.print("[");

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
            if(arr.length-1!=i)
                System.out.print(",");
            
        }
        System.out.print(",");
        System.out.println();
    }
    
}
