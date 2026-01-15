import java.util.Scanner;
public class Array_Filter {
    public static Scanner sc = new Scanner(System.in);
    public static int [] init(){
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0 ; i<arr.length ; i++){
           System.out.println("Enter the Data");
           arr[i] = sc.nextInt();
        }
        return arr;
    } 

    public static void Filter_Func(int [] arr , int Start , int end){
        while(Start<=end){
            if(arr[Start]==0 && arr[end]==1){
                Start++;
                end--;
            }
            else if(arr[Start]==1 && arr[end]==0){
                while(Start<=end){
                    int temp = arr[Start];
                    arr[Start] = arr[end];
                    arr[end] = temp;
                    Start++;
                    end--;
                }
            }
            else if(arr[Start]==1 && arr[end]==1){
                end--;
            }
            else{
                Start++;
            }
        }

    }

    public static void FilterDisplay(int[] arr , int Start , int end){
        Filter_Func(arr, Start, end);
    }
    public static void display(int[] arr){
        System.out.println("Array Elements are");
        System.out.print("[");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] );
            if(arr.length-1!=i)
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = init();
        display(arr);
        Filter_Func(arr, 0, arr.length-1);
        FilterDisplay(arr, 0, arr.length-1);
        display(arr);

    }


    
}
