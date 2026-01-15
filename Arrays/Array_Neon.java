import java.util.Scanner;
public class Array_Neon{
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
        int size;
        System.out.println("Enter the Size of the Array");
        size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the Data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean Neon_Number(int num){
        int temp = num;
        int square = num * num;
        int sum = 0;
        while(square>0){
            int rem = square%10;
            sum = sum + rem;
            square = square/10;
        }
        return sum==temp;
    }

    public static void checkNeon(int [] arr){
        System.out.println("Neon Elements Are");
        for(int i=0 ; i<arr.length ; i++){
            if((Neon_Number(arr[i]))){
                System.out.println(arr[i]);
            }
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
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args){
        int [] arr = init();
        display(arr);
        checkNeon(arr);
        display(arr);
        
    }

}