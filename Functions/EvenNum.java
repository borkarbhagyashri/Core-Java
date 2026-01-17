import java.util.Scanner;
public class EvenNum{
    public static boolean isEven(int num){

        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean even = isEven(num);
        System.out.println(even);
        
    }
}