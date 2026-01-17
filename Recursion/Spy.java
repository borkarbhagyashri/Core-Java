import java.util.Scanner;
public class Spy {
    public static int display(int num,int sum,int product){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        product = product * rem;
        sum = sum + product;
        return display(num/10,sum,product);

        
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int Display = display(num, 0,1);
        System.out.println(Display);
    }
    
}
