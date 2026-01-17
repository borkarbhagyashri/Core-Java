import java.util.Scanner;
public class Oddnumber {
    public static void display(int num ,int end){
        
        if(num==end){
            return;
        }
        if(num%2!=0){
            System.out.println(num);
           
        }
         display(num+1 , end);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the number");
        int end = sc.nextInt();
        display(num,end);

    }
    
}
