import java.util.Scanner;
public class Array_Element_Count {
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
        int size;
        System.out.println("Enter the Size of Array");
        size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the Data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void Element_Count(int [] arr){
        int Size = sc.nextInt();
        boolean arr1 []= new boolean[Size];

        for(int i=0 ; i<arr.length ; i++){
            int number = arr[i];
            if(arr[i]==0){
                continue;
            }
            int Count = 0;
            for(int j=0 ; j<arr.length ; j++){
                if(arr[i]==number){
                    Count++;
                }
            }

        }

    }

    public static void display(int [] arr){
        System.out.println("Array Element Are");
        System.out.print("[");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
            if(arr.length-1!=i){
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
        } 

    }

    public static void main(String[] args){
        int arr[] = init();
    }
    
}
