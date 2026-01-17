import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        for(i=1 ; i<=4 ; i++){
            for(j=i ; j<=4 ; j++){
               System.out.print("* ");
            }
            if(j==4){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
