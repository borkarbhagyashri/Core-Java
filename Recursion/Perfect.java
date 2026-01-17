import java.util.Scanner;
public class Perfect {
    public static int perfect_rec(int num,int i,int sum){
        if(num==i){
            return sum;
        }
        if(num%i == 0){
            sum = sum +i;
        }
        return perfect_rec(num, i+1, sum);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int isperfect = perfect_rec(num, 1, 0);
        System.out.println(isperfect);
    }

    
}
