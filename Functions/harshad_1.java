import java.util.Scanner;
public class harshad_1 {
    public static boolean isHarshad(int num){
        int square = 1 ;
        int sum = 0 ;
        int temp = num ;
        while(num>0){
           int rem = num % 10;
           sum = sum + rem ;
           num = num/10; 
        }
        if(temp%sum==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for( int i=1 ; i<=num ; i++){
            boolean Harshad_func = isHarshad(i);
            if(Harshad_func){
                System.out.println(i);
            }



        }
    }
    
}
