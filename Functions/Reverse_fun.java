import java.util.Scanner;
public class Reverse_fun {
    public static Integer reverse(int num){
        int rem;
        int reverse = 0;
        

        for(int i=0;i<=num;i++){
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num /10;
            
        }
        return reverse;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        Integer Reverse = reverse(num);
        System.out.println(Reverse);

        
    }
}

