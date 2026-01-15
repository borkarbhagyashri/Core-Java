import java.util.Scanner;
public class Array_Even_Odd {
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

    public static void Even_Odd(int [] arr , int Start , int end){
        while(Start<=end){
            if(arr[Start]%2==0){
                Start++;
            }
            else if(arr[end]%2!=0){
                end--;
            }
            else{
               int temp = arr[Start];
                arr[Start] = arr[end];
                arr[end] = temp;
                Start++;
                end--;
            }
        }
    }

    public static void DisplayFunc(int [] arr , int Start , int end){
        Even_Odd(arr, Start, end);
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


    public static void main(String[] args){
        int [] arr = init();
        display(arr);
        Even_Odd(arr, 0, arr.length-1);
        DisplayFunc(arr, 0, arr.length-1);
        display(arr);
    }
    
}
