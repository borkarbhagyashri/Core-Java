import java.util.Scanner;
public class Harshad_range {
    public static boolean Harshad_fun(int num){
        int square = 1;
        int sum = 0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            
            sum = sum + rem;
            num = num/10;
        }
        if(temp%sum==0){
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
        for(int i=1 ; i<=num ; i++){
            boolean Harshad = Harshad_fun(i);
           if(Harshad){
            System.out.println(i);

           }

        }
    }
}
    

