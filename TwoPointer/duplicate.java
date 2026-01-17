import java.util.Scanner;
public class duplicate{
    public static Scanner sc = new Scanner(System.in); 
    public static int[] init(){
        System.out.println("Enter the size of the element");
        int Size = sc.nextInt();
        int arr[] = new int[Size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the Data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }   

    public static void Duplicate(int arr[]){
        
    }
}