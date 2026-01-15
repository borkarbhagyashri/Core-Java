import java.util.Scanner;
public class Array_Harshad {
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
      int size;
      System.out.println("Enter the size of Array"); 
      size = sc.nextInt();
      int arr[] = new int[size];
      
      for(int i=0 ; i<arr.length ; i++){
        System.out.println("Enter the Data");
        arr[i] = sc.nextInt();

      }
      return arr;
      
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
    
    public static boolean Harshad(int num){
        int sum=0;
        int temp = num;
        while(num>0){
            int rem = num%10;
             sum = sum + rem;
             num = num/10;
        }
        return temp%sum==0;

    }
    public static void checkHarshad(int[] arr) {
        System.out.println("Harshad Elements Are");
        for(int i=0;i<arr.length;i++){
            if(Harshad(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = init();
        checkHarshad(arr);
        display(arr);
    }
   
    
}
