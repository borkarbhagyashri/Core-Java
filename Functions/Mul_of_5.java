import java.util.Scanner;
public class Mul_of_5 {
    public static boolean mul_of_5(int num){
        if(num%5==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean mul_of_5 = mul_of_5(num);
        System.out.println(mul_of_5);

    }
    
}
