import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        for(i=1 ; i<=4 ; i++){

            for(j=1 ; j<=4 ; j++){
               
            if(i==1 || j==1 || i==4 || j==4){
                System.out.print(" * ");
            }
            else{
                System.out.print("   ");
            }
            
        }
       
        System.out.println();

    }
    
}
}
