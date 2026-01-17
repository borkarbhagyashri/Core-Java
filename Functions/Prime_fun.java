import java.util.Scanner;
public class Prime_fun{
    public static boolean isPrime(int num){
        for(int i=2 ; i<num ; i++){
            if(num%i==0){
                return false;
            }
           
        }
        return true;
       
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean Prime = isPrime(num);
        System.out.println(Prime);
    }
}