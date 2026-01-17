import java.util.Scanner;
public class Strong {
    public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num * factorial(num-1);

    }
    public static int strong(int num,int sum){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        sum = sum + factorial(num);
        return strong(num/10, sum);

    }

     public static boolean isStrong(int num,int sum) {
        return num==strong(num, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean Strong_func = isStrong(num, 0);
        System.out.println(Strong_func);
    }
   
}
    
