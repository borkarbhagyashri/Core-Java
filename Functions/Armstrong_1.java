import java.util.Scanner;
public class Armstrong_1 {
    public static boolean armstrong(int num){
        int sum = 0;
        int cube;
        int temp=num;
        while(num>0){
            int rem = num%10;
            cube = rem*rem*rem;
            sum = sum + cube;
            num = num/10;
        }
        if(sum==temp){
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
        boolean Armstrong = armstrong(num);
        System.out.println(Armstrong);
    }
    
}
