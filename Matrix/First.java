import java.util.Scanner;
public class First {
    public static Scanner sc = new Scanner(System.in);

    public static int[][] init(){
        System.out.println("Enter the Size of the Row");
        int Row = sc.nextInt();
        System.out.println("Enter the Size of the Col");
        int Col = sc.nextInt();
        int arr[][] = new int[Row][Col];

        for(int i=0 ; i<Row ; i++){
            for(int j=0 ; j<Col ; j++)
            System.out.println("Enter the Data");
            arr[i][j] = sc.nextInt();
            
        }
        return arr;
    }

    public static void display(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][]= init();
        display(arr);
    }

    
}
