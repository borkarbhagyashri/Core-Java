import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        for(i=1 ; i<=4 ; i++){
            for(j=i ; j<=4 ; j++){
               System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    
}
