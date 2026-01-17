import java.util.Scanner;
public class Prime{
    public static int prime(int i,int num,int count){
        if(i==num){
            return i;
        }
        if(num%i==0){
            count++;
            return count;
        }
        if(count==0){
            return num;
        }
        return prime(i+1, num, count);


    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int isPrime = prime(2, num, 0);
        System.out.println("the number is prime"+isPrime);

    }
    
}
