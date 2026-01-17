import java.util.Scanner;
public class Spy_range {
    public static boolean Spy_func(int num){
        int product = 1;
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            product= product * rem;
            sum = sum + rem;
            num = num/10;
        }
        
        return sum==product;
    }
    public static void main(String[] aggs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1 ; i<=num ; i++){
             
            boolean SPY = Spy_func(i);
            if(SPY){
                System.out.println(i);
            }
        }
    }

    }
        
    
    

