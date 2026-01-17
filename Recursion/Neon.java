import java.util.Scanner;
public class Neon {
    public static int Neon(int num , int sum){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        sum = sum + rem;
        return Neon(num/10, sum);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int isNeon = Neon(num, 0);
        System.out.println(isNeon);
    }
    
}
