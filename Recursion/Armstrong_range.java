import java.util.Scanner;
public class Armstrong_range {
    public static int Armstrong(int num, int sum){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        int cube = rem*rem*rem;
        sum = sum+cube;
        return Armstrong(num/10,sum);

    }
    public static boolean armstrong(int num,int sum){
        return num == Armstrong(num,0);
    }
    
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        
         for(int i=1 ; i<=num ; i++){
            boolean armstrong_func= armstrong(i,0);
            if(armstrong_func){
                System.out.println(i);
            }
    }

    
    }   
    
    
}
