import java.util.Scanner;
public class Harshad {
    public static int harshad(int num,int sum){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        sum = sum + rem;
        return harshad(num/10, sum);
     
    }
    public static boolean Sum(int num,int sum){
        return num%harshad(num, sum)==0;
        

    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean isharshad = Sum(num, 0);
        System.out.println(isharshad);


    }
    
}
