
import java.util.Scanner;
public class PatternA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        
        int num;
       
        System.out.println("Enter the number");
        num = sc.nextInt();
        int mid = (num/2)+1;
        
            for(i=1 ; i<=num ; i++){
                for(j=1 ; j<=num ;j++){
                    if(i<=mid && j<=mid && j==(mid-i)+1){
                        System.out.print("*");
                    }
                    else if(i<=mid && j>=mid && j==(mid+i)-1){
                        System.out.print("*");
                    }
                    else if((i==mid-1) && j!=1 && j!=num){
                        System.out.print("*");
                    }
                    
                    
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        
    }
}