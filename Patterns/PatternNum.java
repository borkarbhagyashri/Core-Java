import java.util.Scanner;
public class PatternNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i;
        int j;
        int No = 1;
        
        for(i=1 ; i<=num ; i++){
            for(j=1 ; j<=i ;j++ ){
                System.out.print(No + " ");
                No++;
                
            }
           
            System.out.println();
        }

    }
}