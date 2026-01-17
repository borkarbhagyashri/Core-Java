import java.util.Scanner;
public class Palindrome {
    public static int reverse(int num,int rev) {
        if(num==0){
            return rev;
        }
        int rem = num%10;
        rev = rev * 10 + rem;
        return reverse(num/10, rev);
    }
    public static boolean palindrome(int num,int rev) {
        return num==reverse(num,rev);
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean ispalindrome = palindrome(num,0);
        System.out.println(ispalindrome);
    }
}
