import java.util.Scanner;
public class Strong_fun{
    public static int factorial(int num){
        int fact=1;
        int i = 1;
        
        while(num>=i){
            fact = fact*i;
            
            i++;
        }
            
        
        return fact;

    }
    
    
    public static boolean strong(int num){
        int sum = 0;
        int i;
        int temp = num;
        while(num>0){
            int rem = num % 10;
            sum = sum + factorial(rem);
            num = num /10;
            
            
        }
        if(temp==sum){
            return true;
        
        }
        else{
            return false;
        }

    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt(); 
    
         for(int i=1 ; i<=num ; i++){
             
            boolean Str = strong(i);
            if(Str){
                System.out.println(i);
            }
        }

    }

}