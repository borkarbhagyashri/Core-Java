import java.util.Scanner;
public class Leap_range {
    public static boolean isLeap(int num){
        if(num%4==0 && num%100!=0 || num%400==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=2000 ; i<=num ; i++){
            boolean Leap_func = isLeap(i);
            if(Leap_func){
                System.out.println(i);
            }

        }
        
    }

    
}
