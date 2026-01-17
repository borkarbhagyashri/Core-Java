import java.util.Scanner;
public class Neon_1 {
    public static boolean isNeon(int num){
        int temp = num;
        int square = num * num;
        int sum = 0;
        while(square>0){
            int rem = square % 10;
            sum = sum + rem ;
            square = square/10 ;

        }
        if(sum==temp){
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
        boolean Neon_func = isNeon(num);
        System.out.println(Neon_func);
    }
    
}
