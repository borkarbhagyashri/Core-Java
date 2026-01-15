import java.util.Scanner;
public class MergeSort{
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
        int size;
        System.out.println("Enter the size of Element ");
        size = sc.nextInt();
        int arr [] = new int[size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the Data ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static  void merge_sort(int arr[]){
        int mid = arr.length/2;
        int LA[] = new int[mid];
        int RA[] = new int[arr.length-mid];
        for(int i=0;i<arr.length;i++){

            if(i<mid){
                LA[i] = arr[i];
            }
            else{
                RA[mid-i] = arr[i];
            } 
        }

        display(LA);
        display(RA);
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
        merge_sort(arr);
        System.out.println();
        display(arr);
    }
    
}




