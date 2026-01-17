import java.util.Scanner;
public class Number_1 {
    public static void display(int num){
        if(num==6){
            return;
        }
        System.out.println(num);
        display(num+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        display(num);
    }
    
}
