import java.util.Scanner;
public class factorial {
    public static int factorial_func(int num){
        int i=1;
        int factorial = 1;
        
        
        while(i<=num){
            factorial = factorial * i;
            i++;
        }
        return factorial;

       

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int fact = sc.nextInt();
        int factorial_Num = factorial_func(fact);
        System.out.println(factorial_Num);

    }
    
    
}
