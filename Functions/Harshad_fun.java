import java.util.Scanner;
public class Harshad_fun{
    public static boolean isHarshad(int num){
        int square = 1;
        int sum = 0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            
            sum = sum + rem;
            num = num/10;
        }
        if(temp%sum==0){
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
        boolean Harshad = isHarshad(num);
        System.out.println(Harshad);
    }
    
}
