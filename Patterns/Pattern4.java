import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        for(i=1 ; i<=4 ; i++){
            for(j=4 ; j<=4 ; j++){
               System.out.print("* ");
            }
            if(i==4){
                System.out.print("* * *");
            }
            System.out.println();
        }
    }
    
}
