import java.util.Scanner;
public class Neon_fun {
    public static boolean isNeon(int num){
        int square = 0;
        int sum = 0;
        int temp = num ;
        square = num*num;
        while(square>0){
            int rem = square%10;
            sum = sum + rem;
            square = square/10;
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
        boolean Neon = isNeon(num);
        System.out.println(Neon);
    }

    
}
