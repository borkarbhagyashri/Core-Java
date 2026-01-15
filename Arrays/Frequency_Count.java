import  java.util.Scanner;

public class Frequency_Count {
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

    public static void countElement(int arr[]){

        for(int i=0;i<arr.length;i++){
            int number = arr[i];
             int Count = 0;
            for(int j=0;j<arr.length;j++){
               
                if(arr[j]==number){
                    Count++;
                }
            }
            System.out.println(arr[i] +":"+ Count);
        }
    }
    public static void frequency(int arr[]){
        boolean visited[] = new  boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            int count=1;
            if(visited[i]==true){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;

                }
            }
            System.out.println(arr[i]+":"+count);
        }

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


    public static void main(String args[]){
        int arr[] = init();
        countElement(arr);
        display(arr);
        frequency(arr);
        display(arr);

    }
    
}
