import java.util.Scanner;
public class automorphic_range {
    public static boolean automorphic_fun(int num){
         int square = 0;
        square = num*num;
        while(num>0){
            int lastdigit = num%10;
            int squarelastdigit = square%10;
            if(lastdigit!=squarelastdigit){
                return false;
                
            }
            num = num/10;
            square = square/10;
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        for(int i=1 ; i<=num ; i++){
            boolean isautomorphic = automorphic_fun(i);
            if(isautomorphic==true){
                System.out.println(i);
            }
        }
        
    }
    
}
