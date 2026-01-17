import java.util.Scanner;
public class OddNum {
    public static boolean isOdd(int num){
        if(num%2!=0){
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
        boolean Odd = isOdd(num);
        System.out.println(Odd);
    }

    
}
