import java.util.Scanner;

public class Zigzag {
    public static Scanner sc = new Scanner(System.in);
    public static int row,Col;  //global variable pass access all

    public static int[][] init(){
        System.out.println("Enter the Size of the Row");
        int Row = sc.nextInt();
        System.out.println("Enter the Size of the Col");
        int Col = sc.nextInt();
        int arr[][] = new int[Row][Col];
        System.out.println("Enter the Data");
        for(int i=0 ; i<Row ; i++){
            for(int j=0 ; j<Col ; j++)
            arr[i][j] = sc.nextInt();
            
        }
        System.out.println();
        return arr;
    }


    public static void Zigzag_Fuc(int arr[][] , int mid){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                
                
            }
        }
        

    }

    public static void display(int arr[][]){
        for(int i=0 ; i<arr.length; i++){
            for(int j=0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }

    public static void main(String[] args) {
        int arr[][]= init();
        display(arr);
        Zigzag_Fun(arr);
        
    }
    
}
