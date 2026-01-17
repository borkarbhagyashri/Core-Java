import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        for(i=1 ; i<=4 ; i++){
            for(j=1 ; j<=4 ; j++){
                if(j%2!=0){
                    System.out.print("#");
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
        
    }
    
}
