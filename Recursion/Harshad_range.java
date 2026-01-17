import java.util.Scanner;
public class Harshad_range{
    public static int harshad(int num,int sum){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        sum = sum+rem;
        return harshad(num, sum);
    }
    public static boolean isharshad(num,sum){
        
    }
}