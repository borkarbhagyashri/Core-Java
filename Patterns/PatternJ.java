import java.util.Scanner;
public class PatternJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        int mid = (num/2)+1;
        for(i=1 ; i<=num ; i++){
            for(j=1 ; j<=num ; j++){
                if(i==1 ||j==mid ){
                    System.out.print("*");
                }
                else if(j<=mid && i==num){
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
