import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int k;
        int num=3;
        for(i=1 ; i<=num ; i++){
            for(k=num-1 ; k>=i ; K--){
                System.out.print("  ");
            }



            for(j=1 ; j<=i ; j++){
               System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    
}
