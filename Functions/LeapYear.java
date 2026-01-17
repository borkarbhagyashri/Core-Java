import java.util.Scanner;
public class LeapYear {
    public static boolean LeapYear(int num){
        if((num%4==0 && num%100!=0) ||num%400==0){
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
            boolean leapYear = LeapYear(num);
            System.err.println(leapYear);


    }
    
}
