import java.util.Scanner;
public class Armstrong {
    public static int display(int num,int sum ){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        int cube = rem*rem*rem;
        sum = sum + cube;
        
        
        return display(num/10 , sum);
    }
            
    
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int Display = display(num, 0);
        System.out.println(Display);

    }
    
}
