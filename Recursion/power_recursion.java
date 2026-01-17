import java.util.Scanner;
public class power_recursion {
    public static int Power_rec(int power,int exponent,int base){
        if(exponent==0){
            return power;
        }

        power = power * base;
        return Power_rec(power,exponent-1,base);
    
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int base = sc.nextInt();
        System.out.println("Enter the number");
        int exponent = sc.nextInt();
        int isPower = Power_rec(1, exponent, base);
        System.out.println(isPower);
    }
    
}
