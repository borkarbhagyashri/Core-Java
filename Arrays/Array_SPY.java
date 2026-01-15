import java.util.Scanner;
public class Array_SPY {
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

public static boolean  spy(int num){
   int sum = 0 , mult=1;

   while(num >0){
        int rem = num %10;
        sum = sum + rem;
        mult = mult * rem;
        num = num /10;
   }

    return sum==mult;
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
    public static void checkSpy(int[] arr) {
        System.out.println("Spy Elements Are");
        for(int i=0;i<arr.length;i++){
            if(spy(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = init();
        checkSpy(arr);
        display(arr);



        
    }


    
}
