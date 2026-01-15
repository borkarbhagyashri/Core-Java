import java.util.Scanner;
public class Array_Selection_Sort {
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

    public static void Selection_Sort(int [] arr){
        
        for(int i=0 ; i<arr.length-1 ; i++){
            int minIndex = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
        }
    }
    public static void display(int [] arr){
        System.out.println("Array Element Are");
        System.out.print("[");
        for(int i=0 ; i<arr.length ; i++){
           System.out.print(arr[i]);
           if(arr.length-1!=i)
            System.out.print(",");
           
        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = init();
        display(arr);
        Insertion_Sort(arr);
        System.out.println();
        display(arr);
    }

    
}
