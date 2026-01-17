import java.util.Scanner;
public class PatternD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        int mid = (num/2)+1;
        for(i=1 ; i<=num ; i++){
            for(j=1 ; j<=num ; j++){
                if((i==num || i==1) || j==num ||j==mid-1){
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
