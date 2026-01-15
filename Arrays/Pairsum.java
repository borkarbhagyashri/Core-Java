import java.util.Scanner;
public class Pairsum{
    public static Scanner sc = new Scanner(System.in);

    public static int[] init(){
        System.out.println("Enter the Size of the Array");
        int Size = sc.nextInt();
        int arr[] = new int[Size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the Data");
            arr[i] = sc.nextInt();
            
        }
        return arr;
    }

    public static void Pairsum_fun(int arr[]){
        int Start = 0;
        int End = 1;
        int Target = 16;
        int Size = arr.length;
        while(Start<End){
            int Sum = arr[Start] + arr[End];

            if(Sum!=Target){
                End++;
                if(End==Size){
                    Start++;
                    End=Start+1;
                }
            }
            else{
                System.out.println(arr[Start]  + "," + arr[End] );
                break;
            }
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

    public static void main(String[] args){
        int [] arr = init();
        display(arr);
        Pairsum_fun(arr);
        display(arr);

    }
    

}