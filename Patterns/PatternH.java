import java.util.Scanner;
public class PatternH{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        int mid = (num/2)+1;
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                if(i==mid || j==1 || j==num ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

            }
            


        }
    }

