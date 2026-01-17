import java.util.Scanner;
public class Automorphic_1 {
    public static boolean isAutomorphic(int num){
       
       int  square = num * num;
        while(num>0){
            int lastdigit = num % 10;
            int squarelastdigit = square % 10;
            if(lastdigit!=squarelastdigit){
                return false;
            }
            num = num/10;
            square = square/10;
        }
        return true;
    }
    public static void main(String [] ages){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean Automorphic_Func = isAutomorphic(num);
        System.out.println(Automorphic_Func);
    }
    
}
