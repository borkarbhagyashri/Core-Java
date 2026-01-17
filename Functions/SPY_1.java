import java.util.Scanner;
public class SPY_1 {
    public static boolean Spy(int num){
        int product = 1;
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            product= product * rem;
            sum = sum + rem;
            num = num/10;
        }
        if(sum==product){
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
        for(int i=1 ; i<=num ; i++){
             
            boolean SPY = Spy(i);
            if(SPY){
                System.out.println(i);
            }
        }
    }


    
}
