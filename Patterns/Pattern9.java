import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int num=4;
        for(i=1 ; i<=num ; i++){

            for(j=1 ; j<=num ; j++){
               
            if(i==(num/2)+1|| j==num || j==1 ){
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
