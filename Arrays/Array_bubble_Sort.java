import java.util.Scanner;
public class Array_bubble_Sort {
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
    public static void Bubble_Sort(int [] arr){
        int Pass = 0;
        int Swap = 0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    Swap = 1;
                }
            }
            if(Swap==0){
                break;
            }
            Pass++;
            System.out.println("Pass" + Pass);
            display(arr);

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
        Bubble_Sort(arr);
        System.out.println();
        display(arr);
    }
    
}
