import java.util.Scanner;
public class PatternStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        int mid = (num/2)+1;
        for(i=1 ; i<=num ;i++){
            for(j=1 ; j<=num ; j++){
                if(i<=mid && j<=mid && j==(mid-i)+1 && j!=1 && j!=2){
                    System.out.print("*");
                }
                else if(i<=mid && j>=mid && j==(mid+i)-1 && j!=num && j!=num-1  ){
                    System.out.print("*");
                }
                else if(i==mid-2 && j!=num && j!=1 && j!=num-1 && j!=2){
                    System.out.print("*");
                }
                else if(i<=mid && j==(num-i)+1 && j!=num-1 && j!=num){
                    System.out.print("*");
                }
                else if(j<=mid && j==i && i!=1 && i!=2){
                    System.out.print("*");
                }
                else if(i==1+2 && j!=num && j!=num-1 && j!=num && j!=1 && j!=2){
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
