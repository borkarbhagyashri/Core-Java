import java.util.Scanner;
public class Palindrome_fun {
    public static boolean isPalindrome(int num){
        int original = num;
        int reverse = 1;
        int temp = num;
        while(num>0){
                int rem  = num % 10;
                reverse = reverse * 10 + rem;
                num= num /10;
                
            }
            if(temp==reverse){
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
        boolean Palindrome = isPalindrome(num);
        System.out.println(Palindrome);

    }
    
}
