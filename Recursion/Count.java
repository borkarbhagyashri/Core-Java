import java.util.Scanner;
public class Count {
    public static void display(int num ,int end ,int count){
        if(num==end){
            return;
        }
        System.out.println(num);
        display(num+1,end,count++);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the number");
        int end = sc.nextInt();
        display(num, end ,0);
    }
    
}
